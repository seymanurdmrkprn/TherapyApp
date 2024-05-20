package com.example.therapyapp;


public class Room {
    int roomId;
    int capacity;
    int currentOccupancy;

    public Room(int roomId, int capacity) {
        this.roomId = roomId;
        this.capacity = capacity;
        this.currentOccupancy = 0;
    }

    public int getRoomId() {
        return roomId;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCurrentOccupancy() {
        return currentOccupancy;
    }

    public void setCurrentOccupancy(int currentOccupancy) {
        this.currentOccupancy = currentOccupancy;
    }
}