package school.service;
import school.model.*;
import school.exception.*;
import school.interfaces.*;
import school.util.LoggerUtil; 
import java.time.LocalDate;
import java.util.*;
import java.util.logging.Level;
import java.util.stream.Collectors;

public class SchoolService {
    private Repository<Integer, Student> studentRepo;
    private Repository<Integer, Teacher> teacherRepo;
    private DataManager fileManager;
    private DBDataManager db; 
    private Set<Course> allCourses = new HashSet<>();
    private Queue<String> adminQueue = new LinkedList<>();
    private Stack<String> history = new Stack<>();

    public SchoolService() {
        this.studentRepo = new RepositoryImpl<>();
        this.teacherRepo = new RepositoryImpl<>();
        this.fileManager = new FileDataManager();
        this.db = new DBDataManager(); 
        loadAllFromDB();
    }

    public void registerStudent(Student s) throws DuplicateIDException, InvalidDataException {
        if (s.getGPA() < 0 || s.getGPA() > 4.0) throw new InvalidDataException("GPA must be 0-4.0");
        studentRepo.add(s.getId(), s);
        if(s.getDepartment() != null) s.getDepartment().addStudent(s);
        history.push("Added Student: " + s.getFullName());
    }
    
    public void registerStudent(String firstName, String lastName, LocalDate dob, Gender gender, 
                                String address, String phone, String email, double gpa, StudentLevel level, Department department) 
                                throws DuplicateIDException, InvalidDataException {
        int id = new Random().nextInt(9000) + 1000;
        Student s = new Student(id, firstName, lastName, dob, gender, address, phone, email, gpa, level, department);
        registerStudent(s);
    }

    public void registerTeacher(Teacher t) throws DuplicateIDException {
        teacherRepo.add(t.getId(), t);
        history.push("Added Teacher: " + t.getFullName());
    }

    public List<Student> getStudentsByDepartment(String deptName) { 
        return studentRepo.getAllValues().stream() 
                .filter(s -> s.getDepartment() != null && s.getDepartment().getName().equalsIgnoreCase(deptName))
                .sorted(Comparator.comparing(Student::getFullName))
                .collect(Collectors.toList());
    }
    
    public double getAverageGPA() {
        return studentRepo.getAllValues().stream() 
                .mapToDouble(Student::getGPA)
                .average().orElse(0.0);
    }
    
    public double calculateAverageGPA() { return getAverageGPA(); }
    
    public List<Student> getTopStudents(int topN) {
        return studentRepo.getAllValues().stream() 
                .sorted(Comparator.comparingDouble(Student::getGPA).reversed())
                .limit(topN)
                .collect(Collectors.toList());
    }

    public Student findStudent(int id) throws StudentNotFoundException {
        Student s = studentRepo.get(id);
        if (s == null) throw new StudentNotFoundException("Student with ID " + id + " not found");
        return s;
    }
    
    public void enrollStudentInCourse(int studentId, Course course) throws StudentNotFoundException {
        Student s = findStudent(studentId);
        s.enrollCourse(course);
        allCourses.add(course);
    }

    public void saveAllToFile() {
        fileManager.saveAllStudents(studentRepo.getAllValues()); 
        fileManager.saveAllTeachers(teacherRepo.getAllValues());
    }
    
    public void saveToFile() { saveAllToFile(); }
    
    public void loadAllFromFile() {
        Collection<Student> students = fileManager.getAllStudents();
        if(students != null) students.forEach(s -> { try { studentRepo.add(s.getId(), s); } catch(Exception e){} });
    }

    public void saveAllToDB() { 
        db.saveAllStudents(studentRepo.getAllValues());
        db.saveAllTeachers(teacherRepo.getAllValues());
    }
    
    public void loadAllFromDB() {
        db.getAllStudents().forEach(s -> { try { studentRepo.add(s.getId(), s); } catch(Exception e){} });
        db.getAllTeachers().forEach(t -> { try { teacherRepo.add(t.getId(), t); } catch(Exception e){} });
    }

    public void addAdminTask(String task) { adminQueue.add(task); }
    public String processAdminTask() { return adminQueue.poll(); }
    public String undoLastAction() { return history.isEmpty() ? "Nothing to undo" : history.pop(); }
    public Collection<Student> getAllStudents() { return studentRepo.getAllValues(); } 
    public Collection<Teacher> getAllTeachers() { return teacherRepo.getAllValues(); } 
}