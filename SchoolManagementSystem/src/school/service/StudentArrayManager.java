package school.service;
import school.model.Student;

public class StudentArrayManager {
    private Student[] students = new Student[100];
    private int count = 0;

    public void addStudent(Student s){ 
        if(count >= students.length){
            System.out.println("Array full! Cannot add more students.");
            return;
        }
        students[count++] = s;
    }

    public void displayAll(){ 
        if(count == 0){
            System.out.println("No students in array.");
            return;
        }
        for(int i=0; i<count; i++) {
            System.out.println(students[i].toString()); 
        }
    }

    public Student searchStudent(int id){ 
        for(int i=0; i<count; i++) {
            if(students[i].getId() == id) return students[i];
        }
        return null;
    }

    public int getCount() {
        return count;
    }

    public Student getStudent(int index) {
        if(index < 0 || index >= count) return null;
        return students[index];
    }
}