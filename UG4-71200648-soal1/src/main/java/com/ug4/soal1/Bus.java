package com.ug4.soal1;

import java.util.ArrayList;

public class Bus {
    public String name ;
    public Driver driver;
    private int Capacity =25 ;
    private final ArrayList<Passenger> passengers;
    private int usedCapacity;
    private final double fares;
    private double profit;
    private String ROUTE;


    public Bus(String name ,Driver driver){

        setName(name);
        setDriver(driver);
        fares = 100;
        passengers = null;
    }

    public String getName() {
        return name;
    }

    public Driver getDriver() {
        return driver;
    }

    public int getCapacity() {
        return Capacity;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public int getUsedCapacity() {
        return usedCapacity;
    }

    public double getFares() {
        return fares;
    }

    public double getProfit() {
        return profit;
    }

    public String getROUTE() {
        return ROUTE;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setUsedCapacity(int usedCapacity) {
        this.usedCapacity = usedCapacity;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public double checkPassengerBalance(Passenger passenger){
        return passenger.getBalance() ;
    }
    public void topUpBalance(double balance,Passenger passenger){
        if (balance > 0){passenger.setBalance(balance);}
        
    }
    public void takePassenger(Passenger passenger){
        passengers.add(passenger);
        setUsedCapacity(1);
        System.out.println("Menambahkan penumpang atas nama :" + passenger.getName());
    }
    public void dropPassenger(String destiny ,Passenger passenger){
        if (passenger.getDestiny() == destiny ){
            passengers.remove(passenger);
        }
    }
    public void proceedOrder (String destiny,Passenger passenger){
        if (this.getCapacity() > this.usedCapacity) {
            this.setProfit(this.getFares());
            passenger.setDestiny(destiny);
            passenger.setBalance(this.getFares());
            this.takePassenger(passenger);
        } else {
            System.out.println("Penuh");
            System.out.println(this.cancelOrder(passenger));
        }

    }
    public String cancelOrder(Passenger passenger){
        return "Batal" ;

    }

}
