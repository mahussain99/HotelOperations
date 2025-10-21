package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;
    private int ReservationTotal;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;

        if (roomType.equals("King")) {
            this.price = 139.00;

        } else if (roomType.equals("Double")) {
            this.price = 124.00;
        }
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public int getReservationTotal() {
        double totalPrice = (price * numberOfNights);
        double weekendPriceIncrease = 0.10;

        double totalWeekendPrice = 0;
        if (isWeekend) {
            totalWeekendPrice = ((totalPrice * weekendPriceIncrease) + totalPrice);

        }
        return (int) totalWeekendPrice;
    }
}





