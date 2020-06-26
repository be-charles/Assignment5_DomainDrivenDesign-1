package org.entity;

public class Student {
    // Junaid
    private long studNum;
    private String firstName;
    private String lastName;

    private Student(long studNum, String firstName, String lastName) {
        this.studNum = studNum;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // getters
    public long getStudNum() {
        return studNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // setters
    public void setStudNum(long studNum) {
        this.studNum = studNum;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studNum=" + studNum +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static class StudentBuilder {
        private long studNum;
        private String firstName;
        private String lastName;

        public StudentBuilder setStudNum(long studNum) {
            this.studNum = studNum;
            return this;
        }

        public StudentBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public StudentBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Student createStudent() {
            return new Student(studNum, firstName, lastName);
        }
    }
}
