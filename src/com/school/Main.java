package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- School Attendance System ---");

        // Creating Students, Teacher, and Staff
        Student student1 = new Student("Alice Wonderland", "10th Grade");
        Student student2 = new Student("Bob The Builder", "9th Grade");
        Teacher teacher1 = new Teacher("Dr. John Smith", "Mathematics");
        Staff staff1 = new Staff("Mrs. Green", "Librarian");

        Course course1 = new Course("Intro to Programming");

        // Display Registered Students
        System.out.println("\nRegistered Students:");
        student1.displayDetails();
        student2.displayDetails();

        // Display Available Teacher
        System.out.println("\nAvailable Teacher:");
        teacher1.displayDetails();

        // Display Available Staff
        System.out.println("\nAvailable Staff:");
        staff1.displayDetails();

        // Display Available Courses
        System.out.println("\nAvailable Courses:");
        course1.displayDetails();

        // --- Attendance Recording ---
        System.out.println("\n--- Attendance Recording ---");
        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        // Record valid attendance
        AttendanceRecord record1 = new AttendanceRecord(student1.getId(), course1.getCourseId(), "Present");
        attendanceLog.add(record1);

        // Attempt to record invalid attendance status
        AttendanceRecord record2 = new AttendanceRecord(student2.getId(), course1.getCourseId(), "Late");
        attendanceLog.add(record2); // Will be stored as "Invalid"

        // Record another valid attendance
        AttendanceRecord record3 = new AttendanceRecord(student2.getId(), course1.getCourseId(), "Absent");
        attendanceLog.add(record3);

        // Display attendance log
        System.out.println("\n--- Attendance Log ---");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }

        System.out.println("\nSession 5: Inheritance Hierarchy Implementation Complete.");
    }
}
