package classes;
public class Student{
   public String name;
   public String className;
   public int rank;
   public Double Grade;

   public Double getGrade() {
      return Grade;
   }
   public Student(String name , String className){
      this.name = name;
      this.className = className;
   }
}