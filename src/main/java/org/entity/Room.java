package org.entity;

public class Room {
    // Inga
    private String roomNumber, price, type, status;

    private Room(Builder builder){
        this.roomNumber = builder.roomNumber;
        this.price = builder.price;
        this.type = builder.type;
        this.status = builder.status;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber='" + roomNumber + '\'' +
                ", price='" + price + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public static class Builder{
        private String roomNumber, price, type, status;

        public Builder setRoomNumber(String roomNumber){
            this.roomNumber = roomNumber;
            return this;
        }
        public Builder setPrice(String price){
            this.price = price;
            return this;
        }
        public Builder setType(String type){
            this.type = type;
            return this;
        }
        public Builder setStatus(String status){
            this.status = status;
            return this;
        }

        public  Builder copy(Room room){
            this.roomNumber = room.roomNumber;
            this.price = room.price;
            this.type = room.type;
            this.status = room.status;
            return this;
        }

        public Room build(){
            return new Room(this);
        }


    }
}
