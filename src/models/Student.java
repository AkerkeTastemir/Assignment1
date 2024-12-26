package models;

import java.util.ArrayList;

public class Student extends Person {

    public static int counter = 1;

    private int studentID = counter++;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, String surname, int age, boolean gender, ArrayList<Integer> gradesList) {
        super(name, surname, age, gender);

        setGrades(gradesList);
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double calculateGPA() {
        double sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
    }

    @Override
    public String toString() {

        return super.toString() + ", I am a student with ID " + getStudentID();
    }

    public static int getCounter() {

        return counter;
    }

    public static void setCounter(int counter) {

        Student.counter = counter;
    }

    public int getStudentID() {

        return studentID;
    }

    public void setStudentID(int studentID) {

        this.studentID = studentID;
    }

    public ArrayList<Integer> getGrades() {

        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {

        this.grades = grades;
    }
}
