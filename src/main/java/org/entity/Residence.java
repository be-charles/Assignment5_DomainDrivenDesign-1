package org.entity;

public class Residence {
    // Brandon Eugene Charles <218220065@mycput.ac.za>
    private String address;
    private String name;
    private int numberOfRooms;
    private int residenceId;

    // Constructor
    private Residence(Builder builder) {
        this.address = builder.address;
        this.name = builder.name;
        this.numberOfRooms = builder.numberOfRooms;
    }

    // Getters
    public int getResidenceId() {
        return residenceId;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    // Builder Class
    public static class Builder{
        private String address;
        private String name;
        private int numberOfRooms;
        private int residenceId;

        public void setResidenceId(int residenceId) {
            this.residenceId = residenceId;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setNumberOfRooms(int numberOfRooms) {
            this.numberOfRooms = numberOfRooms;
            return this;
        }

        public Builder copy (Residence residence) {
            this.address = residence.address;
            this.name = residence.name;
            this.numberOfRooms = residence.numberOfRooms;
            return this;
        }

        public Residence build(){
            return new Residence(this);
        }
    }
}
