package com.sathurakiri.main;

public class Poymorrphism {

    int add(int a, int b) {
        return  a+b;
    }
double add(double a,double b,double c) {

    return a + b+ c;
}
    public static void main(String[] args){
        Poymorrphism c = new Poymorrphism();
        System.out.println(c.add(10,20));
        System.out.println(c.add(1000,20000,30000));

    }

}


