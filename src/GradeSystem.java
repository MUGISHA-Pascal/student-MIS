import classes.Students;
import java.util.*;

public class GradeSystem{
    public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
   while(true) {
       System.out.println("welcome to the student-MIS");
       System.out.println("--------------------------------");
       System.out.println("Enter the role ( teacher or Student ) :");
       String role = scanner.nextLine();
       if (role.equalsIgnoreCase("teacher")){

       }else if(role.equalsIgnoreCase("student")){

       }else{
           System.out.println("Invalid role");
       }
   }
    }
}