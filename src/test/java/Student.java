import java.util.ArrayList;

public class Student {

    long id;
    String name;
    ArrayList<Integer> grades;

    public Student(long id, String name, ArrayList<Integer> grade) {
        this.id = id;
        this.name = name;
        this.grades = grade;
    }


    public long getId(){
        return this.id;
    }
    // returns the student's name
    public String getName(){
        return this.name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    // adds the given grade to the grades list
    public void addGrade(ArrayList<Integer> grade) {
        grade = this.grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        for(double ave : grades){
            sum += ave;
        }
        double average = sum/grades.size();
        return average;
    }

}
