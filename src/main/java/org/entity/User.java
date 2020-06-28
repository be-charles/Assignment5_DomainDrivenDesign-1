package org.entity;

public class User {
    // Christ Kitenge Mbuyi <217248756@mycput.ac.za>
    private long userID;
    private String firstName;
    private String lastName;

    private User(Builder builder) {
        this.userID = builder.userID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    //Getters
    public long getUserID() {
        return userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    //Setters
    public void setUserID(long userID) {
        this.userID = userID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //toString
    @Override
    public String toString() {
        return "User{" +
                "userID : " + userID +
                ", First Name : '" + firstName + '\'' +
                ", Last Name : '" + lastName + '\'' +
                '}';
    }

    // Builder Class
    public static class Builder {
        private long userID;
        private String firstName;
        private String lastName;

        public Builder setUserID(long userID) {
            this.userID = userID;
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

        public Builder copy(User user) {
            this.userID = user.userID;
            this.firstName = user.firstName;
            this.lastName = user.lastName;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
