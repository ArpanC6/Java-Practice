import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        System.out.println("1. Add Student");
        System.out.println("2. View Students");

        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            Student s = new Student(id, name);
            dao.insertStudent(s);

        } else if (choice == 2) {
            dao.viewStudents();
        }
    }
}
