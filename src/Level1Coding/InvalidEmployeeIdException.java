package Level1Coding;

public class InvalidEmployeeIdException extends Exception{
    InvalidEmployeeIdException(String message){
        System.out.println(" Employee id is out of range" + message);
    }
}
