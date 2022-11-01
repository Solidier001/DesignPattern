package org.example.creational.builder;

public class Director {
    private HouseBulider bulider;

    public Director(HouseBulider bulider) {
        this.bulider = bulider;
    }

    public Director() {
    }

    public HouseBulider getBulider() {
        return bulider;
    }

    public void setBulider(HouseBulider bulider) {
        this.bulider = bulider;
    }

    public House constructHouse(){
        bulider.bulidBaies();
        bulider.bulidWall();
        bulider.roofed();
        return bulider.bulid();
    }
}
