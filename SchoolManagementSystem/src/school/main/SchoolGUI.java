package main;

import school.model.*;
import school.service.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class SchoolGUI extends JFrame {
    private SchoolService service;
    private JTable table;
    private DefaultTableModel model;
    
    public SchoolGUI(SchoolService service) {
        this.service = service;
        setTitle("School Management System");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        
        String[] cols = {"ID", "Name", "Department", "Level", "GPA", "Grade"};
        model = new DefaultTableModel(cols, 0);
        table = new JTable(model);
        loadTable();
        
        
        JButton btnAdd = new JButton("Add Sample Student");
        btnAdd.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Sample student added. Check console.");
            loadTable();
        });
        
        JButton btnGrade = new JButton("Show Selected Grade");
        btnGrade.addActionListener(e -> {
            int row = table.getSelectedRow();
            if(row >= 0) JOptionPane.showMessageDialog(this, "Grade: " + model.getValueAt(row, 5));
        });
        
        JPanel panel = new JPanel();
        panel.add(btnAdd); panel.add(btnGrade);
        
        add(new JScrollPane(table), BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);
    }
    
    private void loadTable() {
        model.setRowCount(0);
        for(Student s : service.getAllStudents()) {
            s.calculateGrade(); 
            model.addRow(new Object[]{
                s.getId(), s.getFullName(), s.getDepartment().getName(), 
                s.getLevel(), s.getGPA(), s.getGrade()
            });
        }
    }
}