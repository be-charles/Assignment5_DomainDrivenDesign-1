package org.entity;

public class Campus {
    // Phumelela
    private int campusCode;
    private String name;

    private Campus (Builder builder){
        this.campusCode = builder.campusCode;
        this.name = builder.name;
    }

    public static class Builder{
        private int campusCode;
        private String name;

        public Builder setCampusCode(int campusCode){
            this.campusCode = campusCode;
            return this;
        }

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder copy(Campus campus){
            this.campusCode = campus.campusCode;
            this.name = campus.name;
            return this;
        }

        public Campus build(){
            return new Campus(this);
        }
    }

    public int getCampusCode() {
        return campusCode;
    }

    public String getName() {
        return name;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Campus{" +
                "campusCode=" + campusCode +
                ", name='" + name + '\'' +
                '}';
    }
}
