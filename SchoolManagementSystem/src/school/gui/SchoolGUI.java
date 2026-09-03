package school.gui;

import school.model.*;
import school.service.SchoolService;
import school.util.LoggerUtil;
import java.util.logging.Level;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.time.LocalDate;

public class SchoolGUI extends JFrame {
    private SchoolService service;
    private JTabbedPane tabs;
    private DefaultTableModel studentModel, teacherModel;

    public SchoolGUI(SchoolService service) {
        this.service = service;
        setTitle("Secondary School Management System - ADMIN");
        setSize(1000, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        tabs = new JTabbedPane();
        
        
        JPanel studentPanel = new JPanel(new BorderLayout());
        studentModel = new DefaultTableModel(new String[]{"ID", "Full Name", "Age", "Level", "Department", "GPA", "Phone"}, 0);
        JTable studentTable = new JTable(studentModel);
        studentPanel.add(new JScrollPane(studentTable), BorderLayout.CENTER);
        JPanel sBtn = new JPanel();
        JButton addS = new JButton("Add Student");
        addS.addActionListener(e -> addStudentDialog());
        sBtn.add(addS);
        studentPanel.add(sBtn, BorderLayout.SOUTH);
        tabs.addTab("Students", studentPanel);
        
        
        JPanel teacherPanel = new JPanel(new BorderLayout());
        teacherModel = new DefaultTableModel(new String[]{"ID", "Full Name", "Age", "Subject", "Phone"}, 0);
        JTable teacherTable = new JTable(teacherModel);
        teacherPanel.add(new JScrollPane(teacherTable), BorderLayout.CENTER);
        JPanel tBtn = new JPanel();
        JButton addT = new JButton("Add Teacher");
        addT.addActionListener(e -> addTeacherDialog());
        tBtn.add(addT);
        teacherPanel.add(tBtn, BorderLayout.SOUTH);
        tabs.addTab("Teachers", teacherPanel);
        
        add(tabs);
        loadAllData();
        setVisible(true);
        LoggerUtil.log(Level.INFO, "GUI Loaded Successfully");
    }
    
    private void loadAllData(){
        studentModel.setRowCount(0);
        for(Student s : service.getAllStudents()){
            studentModel.addRow(new Object[]{s.getId(), s.getFullName(), s.getAge(), s.getLevel(), s.getDepartment().getName(), s.getGPA(), s.getPhone()});
        }
        teacherModel.setRowCount(0);
        for(Teacher t : service.getAllTeachers()){
            teacherModel.addRow(new Object[]{t.getId(), t.getFullName(), t.getAge(), t.getSpecialization(), t.getPhone()});
        }
    }
    
    private void addStudentDialog(){
        JTextField fn=new JTextField(), ln=new JTextField(), gpa=new JTextField();
        JComboBox<StudentLevel> levelBox = new JComboBox<>(StudentLevel.values());
        JComboBox<Department> deptBox = new JComboBox<>(service.getAllDepartments());
        JPanel p = new JPanel(new GridLayout(5,2));
        p.add(new JLabel("First:")); p.add(fn); p.add(new JLabel("Last:")); p.add(ln);
        p.add(new JLabel("GPA:")); p.add(gpa); p.add(new JLabel("Level:")); p.add(levelBox); p.add(new JLabel("Dept:")); p.add(deptBox);
        if(JOptionPane.showConfirmDialog(this,p,"Add Student",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
            try{
                int id = (int)(Math.random()*9000)+1000;
                service.registerStudent(fn.getText(), ln.getText(), LocalDate.of(2010,1,1), Gender.MALE, "PH", "0800", "mail@mail.com", Double.parseDouble(gpa.getText()), (StudentLevel)levelBox.getSelectedItem(), (Department)deptBox.getSelectedItem());
                loadAllData();
            }catch(Exception ex){ JOptionPane.showMessageDialog(this, ex.getMessage()); }
        }
    }
    
    private void addTeacherDialog(){
        JTextField fn=new JTextField(), ln=new JTextField(), subj=new JTextField(), salary=new JTextField();
        JPanel p = new JPanel(new GridLayout(4,2));
        p.add(new JLabel("First:")); p.add(fn); p.add(new JLabel("Last:")); p.add(ln);
        p.add(new JLabel("Subject:")); p.add(subj); p.add(new JLabel("Salary:")); p.add(salary);
        if(JOptionPane.showConfirmDialog(this,p,"Add Teacher",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
            try{
                int id = (int)(Math.random()*9000)+2000;
                service.registerTeacher(new Teacher(id, fn.getText(), ln.getText(), LocalDate.of(1985,1,1), Gender.MALE, "PH", "0800", "mail@mail.com", subj.getText(), Double.parseDouble(salary.getText())));
                loadAllData();
            }catch(Exception ex){ JOptionPane.showMessageDialog(this, ex.getMessage()); }
        }
    }
}