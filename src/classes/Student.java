package classes;
public class Student{
   public String name;
   public String className;
   public int rank;
   public Double grade;

   public Double getGrade() {
      return grade;
   }
   public Student(String name , String className ,double grading){
      this.name = name;
      this.className = className;
      this.grade=grading;
   }
   public Student(String name , String className ){
      this.name = name;
      this.className = className;
   }
}