package school.service;

import school.model.*;
import school.util.LoggerUtil;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;

public class DBDataManager {
    private Connection conn;
    
    public DBDataManager(){
        try{
            conn = DriverManager.getConnection("jdbc:sqlite:school.db");
            createTables();
        }catch(Exception e){ LoggerUtil.log(Level.SEVERE, "DB Error: " + e.getMessage()); }
    }
    
    private void createTables(){
        try(Statement st = conn.createStatement()){
            st.execute("CREATE TABLE IF NOT EXISTS students(id INTEGER PRIMARY KEY, fname TEXT, lname TEXT, dob TEXT, gender TEXT, phone TEXT, email TEXT, gpa REAL, level TEXT, dept TEXT)");
            st.execute("CREATE TABLE IF NOT EXISTS teachers(id INTEGER PRIMARY KEY, fname TEXT, lname TEXT, phone TEXT, email TEXT, subject TEXT, salary REAL)");
        }catch(Exception e){}
    }
    
    public void saveAllStudents(Collection<Student> students){
        try{
            PreparedStatement ps = conn.prepareStatement("INSERT OR REPLACE INTO students VALUES(?,?,?,?,?,?)");
            for(Student s : students){
                ps.setInt(1, s.getId());
                ps.setString(2, s.getFirstName());
                ps.setString(3, s.getLastName());
                ps.setString(4, s.getDateOfBirth().toString());
                ps.setString(5, s.getGender().name());
                ps.setString(6, s.getPhone());
                ps.setString(7, s.getEmail());
                ps.setDouble(8, s.getGPA());
                ps.setString(9, s.getLevel().name());
                ps.setString(10, s.getDepartment().getName());
                ps.execute();
            }
        }catch(Exception e){ LoggerUtil.log(Level.SEVERE, e.getMessage()); }
    }
    
    public void saveAllTeachers(Collection<Teacher> teachers){
        try{
            PreparedStatement ps = conn.prepareStatement("INSERT OR REPLACE INTO teachers VALUES(?,?,?,?,?,?,?)");
            for(Teacher t : teachers){
                ps.setInt(1, t.getId());
                ps.setString(2, t.getFirstName());
                ps.setString(3, t.getLastName());
                ps.setString(4, t.getPhone());
                ps.setString(5, t.getEmail());
                ps.setString(6, t.getSpecialization()); 
                ps.setDouble(7, t.getSalary());
                ps.execute();
            }
        }catch(Exception e){ LoggerUtil.log(Level.SEVERE, e.getMessage()); }
    }
    
    public Collection<Student> getAllStudents(){ return new ArrayList<>(); } 
    public Collection<Teacher> getAllTeachers(){ return new ArrayList<>(); }
}