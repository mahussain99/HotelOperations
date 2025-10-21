package com.pluralsight;

import javax.sound.midi.Soundbank;
import java.util.HashMap;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }
// Action here
    public void checkIn(){
    if ( !isOccupied && !isDirty) {
        isOccupied = true;
        isDirty = true;
        System.out.println("Room is Check in");
    }else{
        System.out.println("Room can't be Check in ");
    }

    }
    public void checkout(){
        isOccupied = false;
        isDirty = true;
            System.out.println("Guest has checked out. The room is now dirty" + isDirty);
        }

    public void cleanroom(){

        if (!isOccupied){
            isDirty = false;
            System.out.println("Clean the room before guest check in");
        }

    }
}




