package Misc;

public class Calculation {
    int stockPrice = 10; // instance variable
    static int carPrice = 55; // static instance variable
    public static int getPenPrice(){

        Calculation c1 = new Calculation();
        c1.print();

        carPrice = 100;
      //  stockPrice = 10000; this can't be accessed because it is non-static, because it is associated with object
        int capPrice = 10;
        int bodyPrice = 25;
        return capPrice + bodyPrice;


    }
    //print is non-static method. so every object has print() method
    public int print(){ // this can't be static method as it is using an instance variable.
        int p1 = 20 + stockPrice;
        return p1;
    }
}