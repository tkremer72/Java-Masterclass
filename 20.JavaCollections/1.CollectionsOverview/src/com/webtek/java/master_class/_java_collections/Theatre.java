package com.webtek.java.master_class._java_collections;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    //Create fields or variables
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    //Create constructor to initialize fields
    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows - 1);
        for(char row = 'A'; row <= lastRow; row++) {
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    //Create a method to get the theatre name
    public String getTheatreName() {
        return theatreName;
    }

    //Create method to reserve a seat
    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = null;
        for(Seat seat : seats) {
            if(seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }
        if(requestedSeat == null) {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
        return requestedSeat.reserve();
    }
    //for testing
    public void getSeats() {
        for(Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }
    //Create inner class
    private class Seat {

        //Create inner class fields
        private final String seatNumber;
        private boolean reserved = false;
        //Create inner class constructor and initialize fields

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        //Create method to reserve a seat
        public boolean reserve() {
            if(!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved.");
                return true;
            } else {
                return false;
            }
        }

        //Create method to cancel reservation of seat.
        public boolean cancel() {
            if(this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled.");
                return true;
            } else {
                return false;
            }
        }

        //Create a method to get the seat number

        public String getSeatNumber() {
            return seatNumber;
        }
    }

}
