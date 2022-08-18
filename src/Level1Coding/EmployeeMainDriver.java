package Level1Coding;

import java.util.Scanner;

public class EmployeeMainDriver {
    public static void main(String[] args) {
        System.out.println("0) Exit\n" +
                "1) Add an employee\n" +
                "2) Show all employees\n" +
                "3) Promote employee to manager\n" +
                "4) Show all managers\n");
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter your choice : ");
            int operation = scanner.nextInt();
            switch (operation) {
                case 0:
                    System.out.println("Your have Logged out Succesfully !!");
                    System.exit(0);
                case 1 :
                    System.out.println("How many records you want to enter ??");
                    int count = scanner.nextInt();
                    new AddEmployee().addingEmployee(count ,scanner);
                    break;
                case 2 :
                    System.out.println("Employee Details Are : ");

            }
        }
    }
}
