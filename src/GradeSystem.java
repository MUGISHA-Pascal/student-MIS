import classes.Student;
import java.util.*;

public class GradeSystem{
    public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
   ArrayList<Student> students = new ArrayList<>();
   Collections.sort(students,Comparator.comparingDouble(Student::getGrade).reversed());
int index = 1;
for(Student student:students){
    student.rank=index;
    index++;
}

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
           System.out.println("3. add a new student");
           System.out.println("Enter the choice (number) :");
           int choice = scanner.nextLine();
           switch(choice) {
               case 1:
              System.out.println("Enter the name of the student : ");
              String name = scanner.nextLine();
              for(Student student:students){
              if(name.equalIgnoreCase(student.name)) {
                  System.out.println("Enter the grade of the student : ");
                  int grade = scanner.nextInt();
                  student.grade=grade;
              }
              }
                   break;
               case 2:
                   for(Student student:students){
                       int i=0;
                       System.out.println(i++ + "-" + student.name);
                   }
                   break;
               case 3:
                   System.out.println("Enter the name of the new student : ");
                   String name = scanner.nextLine();
                   System.out.println("Enter the class name of the new student : ");
                   String className = scanner.nextLine();
                   Student newStudent = new Student(name,className);
                   students.add(newStudent);
                   break;
                   default:
                       System.out.println("Invalid choice");
                       break;
           }
       }else if(role.equalsIgnoreCase("student")){
           System.out.println("welcome to student management");
           System.out.println("----------------------------------");
           System.out.println("The options available :");
           System.out.println("1. check the rank");
           System.out.println("2. check schoolmate names and their classes");
           System.out.println("Enter your choice(number) : ");
           int choice = scanner.nextInt();
           switch(choice) {
               case 1:
                   System.out.println("Enter the name of the student : ");
                   String name = scanner.nextLine();
                   for(Student student:students){
                       if(name.equalIgnoreCase(student.name)){
                           System.out.println("The rank for " + student.name + " is " + student.rank);
                       }
                   }
           break;
               case 2:
                   System.out.println("all students :");
                   int i=1;
                   for(Student student:students){
                   System.out.println("index     |     name     |    class     ");
                 System.out.println(i + student.name + student.className);
                   }
                   break;
               default:
                   System.out.println("Invalid choice");
                   break;
           }
       }else{
           System.out.println("Invalid role");
       }
   }
    }
