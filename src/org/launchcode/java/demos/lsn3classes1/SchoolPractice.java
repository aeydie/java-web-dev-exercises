package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.HashMap;


public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student eydie = new Student("Eydie", 23, 1, 4.0);
//        System.out.println(eydie);
    }
        public class Course {
            private String subject;
            private Teacher instructor;
            private ArrayList<Student> students;
            private HashMap<String, Double> studentList = new HashMap<>();
        }

        public class Teacher {
            private String firstName;
            private String lastName;
            private String subject;
            private int yearsTeaching;

            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public String getLastName() {
                return lastName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }

            public String getSubject() {
                return subject;
            }

            public void setSubject(String subject) {
                this.subject = subject;
            }

            public int getYearsTeaching() {
                return yearsTeaching;
            }

            public void setYearsTeaching(int yearsTeaching) {
                this.yearsTeaching = yearsTeaching;
            }
        }
    }



