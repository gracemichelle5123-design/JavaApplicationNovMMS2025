package school.service;
import school.model.Student;
import school.model.StudentLevel;
import school.model.Gender;
import java.sql.*;
import java.util.*;

public class DB {
    private static final String URL = "jdbc:sqlite:school.db";

    static {
        try(Connection conn = DriverManager.getConnection(URL)) {
            String sql = "CREATE TABLE IF NOT EXISTS students (id INTEGER PRIMARY KEY, name TEXT, age INTEGER, gender TEXT, level TEXT, fee REAL)";
            conn.createStatement().execute(sql);
        } catch(SQLException e) { e.printStackTrace(); }
    }

    public static void saveStudents(List<Student> students) {
        String sql = "INSERT OR REPLACE INTO students(id,name,age,gender,level,fee) VALUES(?,?,?,?,?,?)";
        try(Connection conn = DriverManager.getConnection(URL);
            PreparedStatement ps = conn.prepareStatement(sql)) {
            for(Student s : students) {
                ps.setInt(1, s.getId());
                ps.setString(2, s.getName());
                ps.setInt(3, s.getAge());
                ps.setString(4, s.getGender().name());
                ps.setString(5, s.getLevel().name());
                ps.setDouble(6, s.getFee());
                ps.addBatch();
            }
            ps.executeBatch();
        } catch(SQLException e) { e.printStackTrace(); }
    }

    public static List<Student> loadStudents() {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM students";
        try(Connection conn = DriverManager.getConnection(URL);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql)) {
            while(rs.next()) {
                Student s = new Student(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("age"),
                    Gender.valueOf(rs.getString("gender")),
                    rs.getDouble("fee"),
                    StudentLevel.valueOf(rs.getString("level"))
                );
                list.add(s);
            }
        } catch(SQLException e) { e.printStackTrace(); }
        return list;
    }
}