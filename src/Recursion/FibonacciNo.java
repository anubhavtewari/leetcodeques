package Recursion;
/*
Find nth Fibonacci No.: 0 1 1 2 3 5 8 13
 */
public class FibonacciNo {
    public static void main(String[] args) {
        System.out.println(fibo(7));
    }
    public static int fibo(int n){

        //base condition
        if(n<2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);

    }
}
