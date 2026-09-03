package school.service;
import school.model.Student;
import school.model.Teacher;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
public class DB {
    private Connection conn;
    public DB() {
        try{
            conn = DriverManager.getConnection("jdbc:sqlite:school.db");
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS students (id INTEGER PRIMARY KEY, name TEXT)");
            stmt.execute("CREATE TABLE IF NOT EXISTS teachers (id INTEGER PRIMARY KEY, name TEXT, subject TEXT)");
        } catch(Exception e){}
    }
    public void saveStudent(Student s) {
        try{ PreparedStatement ps = conn.prepareStatement("INSERT OR REPLACE INTO students(id,name) VALUES(?,?)"); ps.setInt(1,s.getId()); ps.setString(2,s.getFullName()); ps.execute(); } catch(Exception e){}
    }
    public void saveTeacher(Teacher t) {
        try{ PreparedStatement ps = conn.prepareStatement("INSERT OR REPLACE INTO teachers(id,name,subject) VALUES(?,?,?)"); ps.setInt(1,t.getId()); ps.setString(2,t.getFullName());ps.setString(3,t.getSpecialization());  ps.execute(); } catch(Exception e){}
    }
    public Collection<Student> getAllStudents() { return new ArrayList<>(); }
    public Collection<Teacher> getAllTeachers() { return new ArrayList<>(); }
}