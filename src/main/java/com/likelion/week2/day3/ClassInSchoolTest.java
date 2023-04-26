package com.likelion.week2.day3;

public class ClassInSchoolTest {
    public static void main(String[] args) {
        ClassInSchool classInSchool = new ClassInSchool();
        // classInSchool.teacher.student = new Student();
        classInSchool.teacher = new Teacher();
        classInSchool.teacher.name = "김미미";
        classInSchool.teacher.age = 58;

        classInSchool.teacher.students = new Student[20];
        classInSchool.teacher.students[0] = new Student("킴", "01000000000", 14);


    }
}
