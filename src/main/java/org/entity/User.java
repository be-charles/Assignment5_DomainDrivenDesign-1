package org.entity;

public class User {
    // Christ
    private long userID;
    private String firstName;
    private String lastName;

    private User(long userID, String firstName, String lastName) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
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

    public static class UserBuilder{
        private long userID;
        private String firstName;
        private String lastName;

        //Constructor
        public UserBuilder(long userID, String firstName, String lastName) {
            this.userID = userID;
            this.firstName = firstName;
            this.lastName = lastName;
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

        public User build(){
            //System.out.print(userID + " " + firstName + " " + lastName);
            return new User(userID, firstName, lastName);
        }
    }
}
