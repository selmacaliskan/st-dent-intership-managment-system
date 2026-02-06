package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentService service = new StudentService();
        InternshipService internshipService = new InternshipService();
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Department: ");
                    String dept = scanner.nextLine();

                    service.addStudent(new Student(id, name, dept));
                    break;

                case 2:
                    service.listStudents();
                    break;

                case 3:
                    System.out.print("Internship ID:");
                    int iid = scanner.nextInt();

                    System.out.print("Student ID:");
                    int sid = scanner.nextInt();

                    System.out.print("Company:");
                    String company = scanner.nextLine();

                    System.out.print("Duration(months):");
                    int duration = scanner.nextInt();
                    scanner.nextLine();
                    
                    internshipService.addInternship(
                            new Internship(iid,sid,company,duration)
                    );
                    break;
                case 4:
                    internshipService.listInternships();
                    break;


                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
