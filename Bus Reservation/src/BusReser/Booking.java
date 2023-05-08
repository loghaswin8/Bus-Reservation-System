package BusReser;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
    String passengerName;
    int BusNo;
    Date date;

    Booking() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Passenger Name: ");
        passengerName = sc.nextLine();
        System.out.print("Enter Bus Number: ");
        BusNo = sc.nextInt();
        System.out.println("enter date");
        String dateInput = sc.next();
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd-MM-yy");
        date = (Date) dataFormat.parse(dateInput);
    }
    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses){
        int capacity = 0;
        for (Bus bus:buses){
            if(bus.getBusNo() == BusNo){
                capacity = bus.getCapacity();
            }
        }
        int booked = 0;
        for (Booking b:bookings){
            if(b.BusNo == BusNo && b.date.equals(date)){
                booked++;
            }
        }
        return booked < capacity? true : false;
    }

}
