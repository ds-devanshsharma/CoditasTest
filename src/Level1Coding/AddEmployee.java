package Level1Coding;

import java.util.Scanner;

public class AddEmployee {
    int id;
    String name ;
    String designation ;
    Address address ;
    int experience ;
    void addingEmployee(int count , Scanner scanner){

        System.out.println("Enter Details of Employee : ");
        Employee[] empArray = new Employee[count];
        for(int i=0 ; i< count ; i++){
            System.out.println("Enter you id : ");
            id = scanner.nextInt();
//            if(id<1000 && id >2000)
//                throw InvalidEmployeeIdException();
            scanner.nextLine();
            System.out.println("Enter your name : ");
            name =scanner.nextLine();
            System.out.println("Enter your experience : ");
            experience = scanner.nextInt();
            System.out.println("Enter your designation : ");
            designation = scanner. next();
            address = new Address();
            System.out.println("Enter your flat no : ");
            address.flat_no = scanner.nextInt();
            System.out.println("Enter your pincode : ");
            address.pincode = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter Your nearby Locality : ");
            address.locality = scanner.nextLine();
            address= new Address(address.flat_no, address.pincode ,address.locality);

            empArray[i] = new Employee(id,name,address,designation,experience);
            System.out.println("Record Added succesfully !!");

        }
    }
}
