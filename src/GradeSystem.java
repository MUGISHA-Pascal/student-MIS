import classes.Student;
import java.util.*;

public class GradeSystem{
    public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
   ArrayList<Student> students = new ArrayList<>();
   while(true) {
       System.out.println("welcome to the student-MIS");
       System.out.println("--------------------------------");
       System.out.println("Enter the role ( teacher or Student ) :");
       String role = scanner.nextLine();
       if (role.equalsIgnoreCase("teacher")){
           System.out.println("welcome to teacher management");
           System.out.println("---------------------------------");
           System.out.println("options available is :");
           System.out.println("1. add grade to a student");
           System.out.println("2. check the ranks of students");
           System.out.println("Enter the choice (number) :");
           int choice = scanner.nextLine();
           switch(choice) {
               case 1:

                   break;
           }

           Collections.sort(students,Comparator.comparingDouble(Student::getGrade).reversed());
           for(Student student:students){
               int i=0;
           System.out.println(i++ + "-" + student.name);
           }
       }else if(role.equalsIgnoreCase("student")){
           System.out.println("welcome to student management");
           System.out.println("----------------------------------");
           System.out.println("The options available :");
           System.out.println("1. ");
       }else{
           System.out.println("Invalid role");
       }
   }
    }
