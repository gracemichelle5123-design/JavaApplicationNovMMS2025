package main;

import school.model.*;
import school.service.SchoolService;
import school.exception.DuplicateIDException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SchoolService service = new SchoolService();

        while(true) {
            System.out.println("\n===== SCHOOL MANAGEMENT SYSTEM =====");
            System.out.println("1. Register Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Average Fee");
            System.out.println("5. Sort By Name");
            System.out.println("6. Save to File");
            System.out.println("7. Save to Database");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            String choice = sc.nextLine();

            try {
                switch(choice) {
                    case "1":
                        System.out.print("Enter ID Name Age Level Fee: ");
                        // Example: 1 Marvellous 20 ND1 50000
                        String[] data = sc.nextLine().split(" ");
                        int id = Integer.parseInt(data[0]);
                        String name = data[1];
                        int age = Integer.parseInt(data[2]);
                        StudentLevel level = StudentLevel.fromString(data[3]); // ND1, LEVEL_100 etc
                        double fee = Double.parseDouble(data[4]);

                        Student s = new Student(id, name, age, Gender.MALE, fee, level);
                        service.registerStudent(s);
                        break;

                    case "2":
                        service.viewAll();
                        break;

                    case "3":
                        System.out.print("Enter ID to search: ");
                        int sid = Integer.parseInt(sc.nextLine());
                        Student found = service.searchStudent(sid);
                        System.out.println(found!= null? found : "Student not found");
                        break;

                    case "4":
                        System.out.println("Avg Fee: " + service.averageFee());
                        break;

                    case "5":
                        service.sortByName();
                        service.viewAll();
                        break;

                    case "6":
                        service.saveToFile();
                        break;

                    case "7":
                        service.saveToDB();
                        break;

                    case "8":
                        System.out.println("Exiting...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice");
                }
            } catch(DuplicateIDException e) {
                System.out.println("Error: " + e.getMessage());
            } catch(Exception e) {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
}