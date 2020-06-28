package org.entity;

public class Student {
    // Junaid Martin <216178606@mycput.ac.za>
    private long studNum;
    private String firstName;
    private String lastName;

    private Student(Builder builder) {
        this.studNum = builder.studNum;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    // Getters
    public long getStudNum() {
        return studNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // Setters
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

    // Builder Class
    public static class Builder {
        private long studNum;
        private String firstName;
        private String lastName;

        public Builder setStudNum(long studNum) {
            this.studNum = studNum;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        private Builder copy(Student student) {
            this.studNum = student.studNum;
            this.firstName = student.firstName;
            this.lastName = student.lastName;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
