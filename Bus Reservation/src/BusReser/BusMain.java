package BusReser;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class BusMain {
    public static void main(String[] args) throws ParseException {
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();

        buses.add(new Bus(1,true, 10));
        buses.add(new Bus(2, false, 5));
        buses.add(new Bus(3, true, 4));
        for (Bus b:buses){
            b.displayBusInfo();
        }

        int userOpt = 1;
        while(userOpt == 1){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 for booking or enter 0 for Exit");
            userOpt = sc.nextInt();
            if (userOpt == 1){
                Booking booking = new Booking();
                if (booking.isAvailable(bookings, buses)){
                    bookings.add(booking);
                    System.out.println("Your ticket have been confirmed");
                } else {
                    System.out.println("Sorry, The seats are filled out. Try another date or bus");
                }
            }
        }
    }
}
