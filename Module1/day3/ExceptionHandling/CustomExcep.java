package Module1.day3.ExceptionHandling;



import java.util.Scanner;

public class CustomeException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String str=sc.next();
        try {
            if (!str.equalsIgnoreCase("kalyan") && !str.equalsIgnoreCase("harsh") && !str.equalsIgnoreCase("apurrop")) {
                throw new NotFound("Invalid name");
            }
            System.out.println("Allowed");
        }catch(NotFound e){
            System.out.println("Not allowed "+e.getMessage());
        }
    }
}
