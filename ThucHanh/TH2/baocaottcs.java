package ThucHanh.TH2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student {

    private String ID, name, phoneNumber, email;

    public Student(String ID, String name, String phoneNumber, String email) {
        this.ID = ID;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

}

class Subject {

    private static int NUM = 1;
    private String ID, lecturerName, subjectName;

    public Subject(String lecturerName, String subjectName) {
        this.ID = String.format("DT%03d", NUM++);
        this.lecturerName = lecturerName;
        this.subjectName = subjectName;
    }

    public String getID() {
        return ID;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public String getSubjectName() {
        return subjectName;
    }

}

class Assignment implements Comparable<Assignment> {

    private String studentID, subjectID, councilID;
    private Student student;
    private Subject subject;

    public Assignment(String msv, String subjectID, String councilID) {
        this.studentID = msv;
        this.subjectID = subjectID;
        this.councilID = councilID;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public int compareTo(Assignment other) {
        return this.student.getID().compareTo(other.student.getID());
    }

    @Override
    public String toString() {
        return student.getID() + " " + student.getName() + " " + subject.getSubjectName() + " "
                + subject.getLecturerName();
    }
}

public class baocaottcs {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            students.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc.close();

        ArrayList<Subject> subjects = new ArrayList<>();
        sc = new Scanner(new File("DETAI.in"));
        n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            subjects.add(new Subject(sc.nextLine(), sc.nextLine()));
        }
        sc.close();

        ArrayList<ArrayList<Assignment>> councils = new ArrayList<>(9);
        for (int i = 0; i < 9; i++) {
            councils.add(new ArrayList<>());
        }
        sc = new Scanner(new File("HOIDONG.in"));
        n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String studentID = sc.next();
            String subjectID = sc.next();
            String councilID = sc.next();
            int num = councilID.charAt(2) - '0';
            Assignment assignment = new Assignment(studentID, subjectID, councilID);

            for (Student student : students) {
                if (student.getID().equals(studentID)) {
                    assignment.setStudent(student);
                }
            }
            for (Subject subject : subjects) {
                if (subject.getID().equals(subjectID)) {
                    assignment.setSubject(subject);
                }
            }

            councils.get(num).add(assignment);
        }
        sc.close();

        for (int i = 0; i < 9; i++) {
            if (!councils.get(i).isEmpty()) {
                Collections.sort(councils.get(i));
                System.out.printf("DANH SACH HOI DONG %d:\n", i);
                for (Assignment assignment : councils.get(i)) {
                    System.out.println(assignment);
                }
            }
        }
    }
}
