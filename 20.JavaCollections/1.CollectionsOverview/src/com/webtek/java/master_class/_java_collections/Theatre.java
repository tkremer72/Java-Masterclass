package com.webtek.java.master_class._java_collections;

import java.util.*;

public class Theatre {
    //Create fields or variables
    private final String theatreName;
    //private Collection<Seat> seats = new ArrayList<>();
    //private Collection<Seat> seats = new LinkedList<>();
    //private Collection<Seat> seats = new HashSet<>();
    //private Collection<Seat> seats = new LinkedHashSet<>();
    //private Collection<Seat> seats = new TreeSet<>();//Throws an error
    private List<Seat> seats = new ArrayList<>();

    static final Comparator<Seat> PRICE_ORDER;

    static {
        PRICE_ORDER = new Comparator<Seat>() {//Anonymous inner class
            @Override
            public int compare(Seat seat1, Seat seat2) {
                if (seat1.getPrice() < seat2.getPrice()) {
                    return -1;
                } else if (seat1.getPrice() > seat2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
    }

    //Create constructor to initialize fields
    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows - 1);
        for(char row = 'A'; row <= lastRow; row++) {
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                double price = 12.00;
                if((row < 'D') && (seatNum >= 4 && seatNum <= 9)) {
                    price = 14.00;
                } else if((row > 'F') || (seatNum < 4 || seatNum > 9)) {
                    price = 7.00;
                }
                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
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

        Seat requestedSeat = new Seat(seatNumber, 0);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if(foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is not seat " + seatNumber);
            return false;
        }

//        for(Seat seat : seats) {
//            System.out.print(".");
//            if(seat.getSeatNumber().equals(seatNumber)) {
//                requestedSeat = seat;
//                break;
//            }
//        }
//        if(requestedSeat == null) {
//            System.out.println("There is no seat " + seatNumber);
//            return false;
//        }
//        return requestedSeat.reserve();
        //code straight from java binary search library
//        int low = 0;
//        int high = seats.size()-1;
//
//        while(low <= high) {
//            System.out.print(".");
//            int mid = (low + high)/2;
//            Seat midVal = seats.get(mid);
//            int cmp = midVal.getSeatNumber().compareTo(seatNumber);
//
//            if(cmp < 0) {
//                low = mid + 1;
//            } else if(cmp > 0) {
//                high = mid - 1;
//            } else {
//                return seats.get(mid).reserve();
//            }
//        }
//        System.out.println("There is no seat " + seatNumber);
//        return false;
    }

    //for testing
    public Collection<Seat> getSeats() {
//        for(Seat seat : seats) {
//            System.out.println(seat.getSeatNumber());
//        }
        return seats;
    }
    //Create inner class
    public class Seat implements Comparable<Seat> {

        //Create inner class fields
        private final String seatNumber;
        private double price;
        private boolean reserved = false;
        //Create inner class constructor and initialize fields

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        //add code by over riding the compareTo
        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
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

        public double getPrice() {
            return price;
        }
    }

}
