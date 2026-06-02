import java.util.Scanner;

import model.Student;
import service.StudentService;

public class Main {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                StudentService service = new StudentService();

                int choice;

                do {

                        System.out.println(
                                        "\n===== SMS =====");

                        System.out.println(
                                        "1 Add Student");

                        System.out.println(
                                        "2 View Students");

                        System.out.println(
                                        "3 Search Student");

                        System.out.println(
                                        "4 Delete Student");

                        System.out.println(
                                        "5 Update Student");
                        System.out.println(
                                        "6 Sort by marks");
                        System.out.println(
                                        "7 Sort by name");

                        System.out.println(
                                        "8 Exit");

                        System.out.print(
                                        "Enter Choice : ");

                        choice = sc.nextInt();

                        switch (choice) {

                                case 1:

                                        System.out.print(
                                                        "Enter ID : ");

                                        int id = sc.nextInt();

                                        sc.nextLine();

                                        System.out.print(
                                                        "Enter Name : ");

                                        String name = sc.nextLine();

                                        System.out.print(
                                                        "Enter Marks : ");

                                        double marks = sc.nextDouble();

                                        Student s = new Student(
                                                        id,
                                                        name,
                                                        marks);

                                        service.addStudent(s);

                                        break;

                                case 2:

                                        service.viewStudents();

                                        break;

                                case 3:

                                        System.out.print(
                                                        "Enter Search ID : ");

                                        int searchId = sc.nextInt();

                                        service.searchStudent(
                                                        searchId);

                                        break;

                                case 4:

                                        System.out.print(
                                                        "Enter Delete ID : ");

                                        int deleteId = sc.nextInt();

                                        service.deleteStudent(
                                                        deleteId);

                                        break;

                                case 5:

                                        System.out.print(
                                                        "Enter Update ID : ");

                                        int updateId = sc.nextInt();

                                        sc.nextLine();

                                        System.out.print(
                                                        "Enter New Name : ");

                                        String newName = sc.nextLine();

                                        System.out.print(
                                                        "Enter New Marks : ");

                                        double newMarks = sc.nextDouble();

                                        service.updateStudent(
                                                        updateId,
                                                        newName,
                                                        newMarks);

                                        break;

                                case 6:

                                        service.sortByMarks();

                                        break;

                                case 7:

                                        service.sortByName();

                                        break;
                                case 8:

                                        System.out.println(
                                                        "Program Closed");

                                        break;

                                default:

                                        System.out.println(
                                                        "Invalid Choice");
                        }

                } while (choice != 8);

                sc.close();
        }
}