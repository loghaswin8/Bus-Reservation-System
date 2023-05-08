package BusReser;

public class Bus {
    private int BusNo;
    private boolean AC;
    private int Capacity; //set and get

    Bus(int busNo, boolean ac, int cap){
        this.BusNo = busNo;
        this.AC = ac;
        this.Capacity = cap;
    }

    public int getBusNo(){
        return BusNo;
    }
    public boolean getAC(){
        return AC;
    }
    public void setAC(boolean val){
        AC = val;
    }
    public int getCapacity(){
        return Capacity;
    }
    public void setCapacity(int cap){
        Capacity = cap;
    }
    public void displayBusInfo(){
        System.out.println("Bus No: " + BusNo + ", AC: " + AC + ", Capacity: " + Capacity);
    }

}
