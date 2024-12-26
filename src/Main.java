import models.Person;
import models.School;
import models.Student;
import models.Teacher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        School school = new School();

        File file = new File("/Users/akerketastemirova/IdeaProjects/Assignment/src/students.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {

            String name = scanner.next();
            String surname = scanner.next();

            int age = scanner.nextInt();
            boolean gender = scanner.next().equals("Male");

            ArrayList<Integer> gradesList = new ArrayList<>();

            while (scanner.hasNextInt()){
                int grade = scanner.nextInt();
                gradesList.add(grade);
            }

            Student student = new Student(name, surname, age, gender, gradesList);
            school.addMember(student);

            double gpa = student.calculateGPA();

            System.out.println(student);
            System.out.println("GPA: " + gpa);

        }

        scanner.close();

        file = new File("/Users/akerketastemirova/IdeaProjects/Assignment/src/teachers.txt");
        scanner = new Scanner(file);

        while (scanner.hasNext()) {

            String name = scanner.next();
            String surname = scanner.next();

            int age = scanner.nextInt();
            boolean gender = scanner.next().equals("Male");

            String subject = scanner.next();
            int years = scanner.nextInt();
            int salary = scanner.nextInt();

            Teacher teacher = new Teacher(name, surname, age, gender, subject, years, salary);
            school.addMember(teacher);

            if (teacher.getAge() > 10) {
                teacher.giveRaise(10);
            }

            System.out.println(teacher);
            System.out.println("My salary: " + teacher.getSalary());

        }

        scanner.close();

        System.out.println(school);

    }

}