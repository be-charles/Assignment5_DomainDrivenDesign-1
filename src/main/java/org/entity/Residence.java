package org.entity;

public class Residence {
    private String address;
    private String name;
    private int numberOfRooms;
    private int residenceId;

    private Residence(String address, String name, int numberOfRooms) {
        this.address = address;
        this.name = name;
        this.numberOfRooms = numberOfRooms;
    }

    public int getResidenceId() {
        return residenceId;
    }

    public void setResidenceId(int residenceId) {
        this.residenceId = residenceId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public static class ResidenceBuilder{
        private String address;
        private String name;
        private int numberOfRooms;
        private int residenceId;

        public ResidenceBuilder(){}
        public ResidenceBuilder(int residenceId){ this.residenceId = residenceId; }
        public ResidenceBuilder(String address, String name, int numberOfRooms) {
            this.address = address;
            this.name = name;
            this.numberOfRooms = numberOfRooms;
        }

        public void setResidenceId(int residenceId) {
            this.residenceId = residenceId;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setNumberOfRooms(int numberOfRooms) {
            this.numberOfRooms = numberOfRooms;
        }
        public Residence build(){
            return new Residence(address, name, numberOfRooms);
        }
    }
}
