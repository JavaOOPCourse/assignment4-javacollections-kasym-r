package service;

import model.Student;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void initializeStudents() {
        students.add(new Student(1, "Student1", 3.7));
        students.add(new Student(2, "Student2", 1.2));
        students.add(new Student(3, "Student3", 3.2));
        students.add(new Student(4, "Student4", 1.7));
        students.add(new Student(5, "Student5", 4.0));
    }

    public void removeLowGPA() {
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            if (it.next().getGpa() < 2.0) {
                it.remove();
            }
        }
    }

    public void findHighestGPA() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        Student top = students.get(0);

        for (Student s : students) {
            if (s.getGpa() > top.getGpa()) {
                top = s;
            }
        }

        System.out.println("Student with the highest GPA: " + top);
    }

    public void insertAtIndex() {
        Student newStudent = new Student(99, "New Student", 3.0);

        if (students.size() >= 2) {
            students.add(2, newStudent);
        } else {
            students.add(newStudent);
        }
    }

    public void printStudents() {
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
