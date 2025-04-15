package Activity02;

import java.util.Scanner;

public class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void displayinfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

    public class SchoolTest {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String pos; // Declare 'pos' to track user input

            System.out.println("SchoolManagementSystem!");

            do {
                System.out.println("Enter your position (Teacher/Student/Staff): ");
                pos = sc.nextLine(); // Read the position input

                if (pos.equalsIgnoreCase("Teacher")) {
                    System.out.println("Enter your name: ");
                    String name = sc.nextLine();

                    System.out.println("Enter your ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Consume the leftover newline

                    System.out.println("Enter your subject: ");
                    String subject = sc.nextLine();

                    Teacher outer = new Teacher(name, id, subject);
                    outer.displayinfo();

                } else if (pos.equalsIgnoreCase("Student")) {
                    System.out.println("Enter your name: ");
                    String name = sc.nextLine();

                    System.out.println("Enter your ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Consume the leftover newline

                    System.out.println("Enter your grade level: ");
                    String gradeLevel = sc.nextLine();

                    Student outer = new Student(name, id, gradeLevel);
                    outer.displayinfo();

                } else if (pos.equalsIgnoreCase("Staff")) {
                    System.out.println("Enter your name: ");
                    String name = sc.nextLine();

                    System.out.println("Enter your ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Consume the leftover newline

                    System.out.println("Enter your department: ");
                    String department = sc.nextLine();

                    Staff outer = new Staff(name, id, department);
                    outer.displayinfo();

                } else {
                    System.out.println("Invalid position. Please enter Teacher, Student, or Staff.");
                }

                System.out.println("Do you want to continue? (yes/no): ");
                pos = sc.nextLine(); // Read the continuation input

            } while (!pos.equalsIgnoreCase("no")); // Corrected condition to check 'pos'

            System.out.println("Thank you for using the School Management System!");
            sc.close();
        }
    }
}