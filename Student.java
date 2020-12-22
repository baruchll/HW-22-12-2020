import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String name;
    ArrayList<Integer> grades;
Scanner s = new Scanner(System.in);


    public Student(String name){
        this.name = name;
        ArrayList<Integer> grades = new ArrayList<Integer>();
    }

    public Double studentAvg(){
        double sum = 0;
        for (int i:grades) {
        sum += grades.get(i);
        }
        return sum/grades.size();
    }

    public Boolean isTop(){
       if (studentAvg()>=90) {
           return true;
       } else {
           return false;
       }
    }
public Student better(Student other){
        Student x = new Student(s.next());
        if (x.studentAvg() > other.studentAvg()) {
            return x;
        } else {
            return other;
        }
}

    public ArrayList<Integer> failures() {
        ArrayList<Integer> failed = new ArrayList<Integer>();
        for (int i:grades) {
            if (grades.get(i)<55){
                failed.add(grades.get(i));
            }
        }
         return failed;
    }
}
