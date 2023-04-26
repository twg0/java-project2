package com.likelion.week2.day3;

public class ClassInSchoolTest {
    public static void main(String[] args) {
        ClassInSchool classInSchool = new ClassInSchool();
        // classInSchool.teacher.student = new Student();
        classInSchool.teacher = new Teacher();
        classInSchool.teacher.name = "김미미";
        classInSchool.teacher.age = 58;

        classInSchool.teacher.student = new Student("킴", "03000000000", 14);


    }
}
