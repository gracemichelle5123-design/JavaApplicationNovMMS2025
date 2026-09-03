package school.main;

import school.model.*;
import java.time.LocalDate;
import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static List<Student> students = new ArrayList<>();
    private static List<Teacher> teachers = new ArrayList<>();
    private static List<Department> departments = new ArrayList<>();
    private static List<Course> courses = new ArrayList<>();
    private static int studentId = 1000, teacherId = 2000, courseId = 3000;

    public static void main(String[] args) {
        
        departments.add(new Department(1, "Science"));
        departments.add(new Department(2, "Arts"));
        departments.add(new Department(3, "Commercial"));
        
        courses.add(new Course(courseId++, "Mathematics", 3));
        courses.add(new Course(courseId++, "English Language", 2));
        courses.add(new Course(courseId++, "Biology", 3));
        courses.add(new Course(courseId++, "Chemistry", 3));
        courses.add(new Course(courseId++, "Economics", 2));
        
        Student s1 = new Student(studentId++, "John", "Doe", LocalDate.of(2010,1,1), Gender.MALE, "PH", "0801", "j@mail.com", 0, StudentLevel.SS1, departments.get(0));
        Student s2 = new Student(studentId++, "Jane", "Smith", LocalDate.of(2009,5,10), Gender.FEMALE, "PH", "0802", "j2@mail.com", 0, StudentLevel.JSS3, departments.get(1));
        students.add(s1); students.add(s2);
        s1.addGrade(courses.get(0), 85); s1.addGrade(courses.get(1), 70); 
        s2.addGrade(courses.get(0), 90); s2.addGrade(courses.get(1), 95);
        
        teachers.add(new Teacher(teacherId++, "Mr", "Ade", LocalDate.of(1985,3,3), Gender.MALE, "PH", "0803", "a@mail.com", "Mathematics", 120000));

        while(true){
            System.out.println("\n======== SECONDARY SCHOOL MANAGEMENT SYSTEM ========");
            System.out.println("1. Students 2. Teachers 3. Departments 4. Courses");
            System.out.println("5. Enroll Student 6. Record Grade 7. View Student Report");
            System.out.println("8. School Reports 9. Exit");
            System.out.print("Enter choice: ");
            
            int choice = sc.nextInt(); sc.nextLine();
            
            switch(choice){
                case 1: menuStudents(); break;
                case 2: menuTeachers(); break;
                case 3: departments.forEach(System.out::println); break;
                case 4: courses.forEach(System.out::println); break;
                case 5: System.out.println("Use option 2 to add and add grades immediately"); break;
                case 6: recordGrade(); break;
                case 7: viewStudentReport(); break;
                case 8: showReports(); break;
                case 9: return;
                default: System.out.println("Invalid");
            }
        }
    }
    
    static void menuStudents(){
        System.out.println("1. View All 2. Add");
        if(sc.nextInt()==1) students.forEach(System.out::println);
        else addStudent();
    }
    
    static void menuTeachers(){
        System.out.println("1. View All 2. Add");
        if(sc.nextInt()==1) teachers.forEach(System.out::println);
        else addTeacher();
    }
    
    static void addStudent(){
        System.out.print("First: "); String fn = sc.nextLine();
        System.out.print("Last: "); String ln = sc.nextLine();
        departments.forEach(System.out::println);
        System.out.print("Dept ID: "); int dId = sc.nextInt(); sc.nextLine();
        Department d = departments.stream().filter(x->x.getId()==dId).findFirst().orElse(departments.get(0));
        System.out.print("Level 1.JSS1 2.JSS2 3.JSS3 4.SS1 5.SS2 6.SS3: ");
        StudentLevel l = StudentLevel.values()[sc.nextInt()-1]; sc.nextLine();
        
        Student newStudent = new Student(studentId++, fn, ln, LocalDate.of(2010,1,1), Gender.MALE, "PH", "0800", fn+"@mail.com", 0, l, d);
        students.add(newStudent);
        System.out.println("Student Added! ID: " + newStudent.getId());
        
        
        System.out.println("\n--- Add Test Scores for " + newStudent.getFullName() + " ---");
        for(Course c : courses){
            System.out.print("Enter score for " + c.getName() + " 0-100 or -1 to skip: ");
            double score = sc.nextDouble(); sc.nextLine();
            if(score != -1) newStudent.addGrade(c, score);
        }
        System.out.println("Done! Current GPA: " + String.format("%.2f", newStudent.getGPA()));
    }
    
    static void addTeacher(){
        System.out.print("First: "); String fn = sc.nextLine();
        System.out.print("Last: "); String ln = sc.nextLine();
        System.out.print("Subject: "); String s = sc.nextLine();
        teachers.add(new Teacher(teacherId++, fn, ln, LocalDate.of(1985,1,1), Gender.MALE, "PH", "0800", fn+"@mail.com", s, 100000));
        System.out.println("Teacher Added!");
    }
    
    static void recordGrade(){
        students.forEach(System.out::println);
        System.out.print("Enter Student ID: "); int sid = sc.nextInt();
        Student s = students.stream().filter(x->x.getId()==sid).findFirst().orElse(null);
        if(s == null) { System.out.println("Student ID not found!"); sc.nextLine(); return; }
        
        courses.forEach(System.out::println);
        System.out.print("Enter Course ID: "); int cid = sc.nextInt();
        Course c = courses.stream().filter(x->x.getId()==cid).findFirst().orElse(null);
        if(c == null) { System.out.println("Course ID not found!"); sc.nextLine(); return; }
        
        System.out.print("Enter Score 0-100: "); double score = sc.nextDouble(); sc.nextLine();
        s.addGrade(c, score);
        System.out.println("Grade Recorded! New GPA: " + String.format("%.2f", s.getGPA()));
    }
    
    static void viewStudentReport(){
        students.forEach(System.out::println);
        System.out.print("Enter Student ID: "); int sid = sc.nextInt(); sc.nextLine();
        Student s = students.stream().filter(x->x.getId()==sid).findFirst().orElse(null);
        if(s == null) { System.out.println("Student not found!"); return; }
        
        System.out.println("\n--- REPORT CARD FOR: " + s.getFullName() + " ---");
        System.out.println("Level: " + s.getLevel() + " | Department: " + s.getDepartment().getName());
        System.out.println("COURSE\tSCORE\tGRADE");
        if(s.getGrades().isEmpty()) System.out.println("No grades recorded yet");
        for(Map.Entry<Course, Double> e : s.getGrades().entrySet()){
            String grade = e.getValue() >= 70 ? "A" : e.getValue() >= 60 ? "B" : e.getValue() >= 50 ? "C" : e.getValue() >= 45 ? "D" : "F";
            System.out.println(e.getKey().getName() + "\t" + e.getValue() + "\t" + grade);
        }
        System.out.println("GPA: " + String.format("%.2f", s.getGPA()));
    }
    
    static void showReports(){
        System.out.println("\n--- SCHOOL REPORT ---");
        System.out.println("Total Students: " + students.size());
        System.out.println("Total Teachers: " + teachers.size());
        System.out.println("School Average GPA: " + String.format("%.2f", students.stream().mapToDouble(Student::getGPA).average().orElse(0)));
        System.out.println("Top Student: "); students.stream().max(Comparator.comparing(Student::getGPA)).ifPresent(System.out::println);
        System.out.println("\nDepartment Performance:");
        departments.forEach(System.out::println);
    }
}