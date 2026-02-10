package com.sathurakiri.main;

public class InterfaceImpl implements Car,Bike{
    @Override
    public void out() {
      System.out.println("WrestleMania");
    }

    @Override
    public void run() {
System.out.println("Royal Rumble");
    }
    public static void main(String[] args){
  InterfaceImpl c= new InterfaceImpl();
  c.run();
  c.out();

    }

}
