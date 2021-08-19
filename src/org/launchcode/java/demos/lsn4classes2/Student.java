//package org.launchcode.java.demos.lsn4classes2;
//
//public class Student {
//
//    private static int nextStudentId = 1;
//    private String name;
//    private int studentId;
//    private int numberOfCredits = 0;
//    private double gpa = 0.0;
//
//    public Student (String name, int studentId, int numberOfCredits, double gpa) {
//        this.name = name;
//        this.studentId = studentId;
//        this.numberOfCredits = numberOfCredits;
//        this.gpa = gpa;
//    }
//
//    public Student(String name, int studentId) {
//        this(name, studentId, 0, 0);
//    }
//
//    public Student(String name) {
//        this(name, nextStudentId);
//        nextStudentId++;
//    }
//
//    public String studentInfo() {
//        return (this.name + " has a GPA of: " + this.gpa);
//    }
//
//    public String getGradeLevel() {
//        String gradeLevel = "";
//        if (this.numberOfCredits <= 29) {
//            gradeLevel = "Freshman";
//        } else if (this.numberOfCredits <= 59) {
//            gradeLevel = "Sophmore";
//        } else if (this.numberOfCredits <= 89) {
//            gradeLevel = "Junior";
//        } else {
//            gradeLevel = "Senior";
//        }
//        return gradeLevel;
//    }
//
//        // Determine the grade level of the student based on numberOfCredits
//
//
//    // TODO: Complete the addGrade method.
//    public void addGrade(int courseCredits, double grade) {
//        double totalQualityScore = this.gpa * this.numberOfCredits;
//        totalQualityScore += courseCredits * grade;
//        this.numberOfCredits += courseCredits;
//        this.gpa = totalQualityScore/ this.numberOfCredits;
//    }
//
////     TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
////      than just the class fields.
//
//    public String toString() {
//        return (this.name + "Grade Level: " + this.getGradeLevel() + "Student Id: " + this.studentId + " Number of Credits:" + this.numberOfCredits
//        + "Gpa: " + this.gpa);
//    }
//
//    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
//    //  Student objects equal.
//
//    public boolean equals(Object toBeCompared) {
//        if (toBeCompared == this) {
//            return true;
//        }
//
//        if (toBeCompared == null) {
//            return false;
//        }
//
//        if (toBeCompared.getClass() != getClass()) {
//            return false;
//        }
//
//        Student theStudent = (Student) toBeCompared;
//        return theStudent.getStudentId() == getStudentId();
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getStudentId() {
//        return studentId;
//    }
//
//    public int getNumberOfCredits() {
//        return numberOfCredits;
//    }
//
//    public double getGpa() {
//        return gpa;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setStudentId(int studentId) {
//        this.studentId = studentId;
//    }
//
//    public void setGpa(double gpa) {
//        this.gpa = gpa;
//    }
//
//    private void setNumberOfCredits(int numberOfCredits) {
//        this.numberOfCredits = numberOfCredits;
//    }
//
//    public static void main(String[] args) {
//        Student sally = new Student("Sally",1,1,4.0);
//        System.out.println("The Student class works! " + sally.getName() + " is a student!");
//        System.out.println(sally);
//        sally.addGrade(12, 3.5);
//        System.out.println(sally);
//        sally.addGrade(25, 3.8);
//        System.out.println(sally);
//    }
//    Course theCourse =
//}