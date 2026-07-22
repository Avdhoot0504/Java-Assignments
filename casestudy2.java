import java.util.*;
class Student{
    String name;
    ArrayList<Double> grades= new ArrayList<>();
    Student(String name){
        this.name=name;
      
    }

    void addgrade(Double grade){
        grades.add(grade);
    }

    double calculateaverage(){
        double sum=0;

        for(int i=0;i<grades.size();i++){
            sum=sum+grades.get(i);
        }

        return sum/grades.size();
    }

    void displayStudentDetails() {
        System.out.println("Name : " + name);
        System.out.println("Grades : " + grades);
        System.out.println("Average : " + calculateaverage());
    }

}

class Grademanager{
    ArrayList<Student> students= new ArrayList<>();
    void addstudents(Student s){
        students.add(s);

    }

    void findstubyname(String name){
        for(int i=0;i<students.size();i++){
            if(students.get(i).name.equalsIgnoreCase(name)){
                System.out.println("Student found");
                students.get(i).displayStudentDetails();
                return;
            }
        }
        System.out.println("Student Not Found");
    }
    void displayAllStudents() {

        for (int i = 0; i < students.size(); i++) {
            students.get(i).displayStudentDetails();
            System.out.println();
        }
    }
}

public class casestudy2{
    public static void main(String[] args) {
        Grademanager g= new Grademanager();
        Student s1=new Student("AVdhoot");
        s1.addgrade(85.0);
        s1.addgrade(89.0);
        s1.addgrade(87.0);

        Student s2=new Student("aryyan");
        s2.addgrade(75.0);
        s2.addgrade(88.0);
        s2.addgrade(92.0);

        g.addstudents(s1);
        g.addstudents(s2);

        System.out.println("All Students");
        g.displayAllStudents();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name to Search : ");
        String name = sc.nextLine();

        g.findstubyname(name);

        sc.close();
    }
}





