package com.practice;

/*
An integer is defined to be an even subset of another integer n if every even factor of m is also a
factor of n. For example 18 is an even subset of 12 because the even factors of 18 are 2 and 6 and
these are both factors of 12. But 18 is not an even subset of 32 because 6 is not a factor of 32.
Write a function with signature int isEvenSubset(int m, int n) that returns 1 if m is an even subset
of n, otherwise it returns 0.
* */
public class EvenSubset extends Test{

    public int isEvenSubset(int m, int n){
        int isEvenSubset = 1;

        if(m == 0 || m == 1){
            return 0;
        }

        for(int i = 2; i < m ; i=i+2){
            int fm = (m/i);
            if(fm * i == m){
               int f = n/i;
               if(f*i != n){
                   //System.out.println(i +" is not an factor of "+n);
                   return 0;
               }
            }
        }

        return isEvenSubset;
    }

    public static void main(String[] args) throws Exception {
        EvenSubset ob = new EvenSubset();

        int test1m = 18;
        int test1n = 12;
        test("test1" , ob.isEvenSubset(test1m, test1n), 1);

        int test2m = 32;
        int test2n = 18;
        test("test2" , ob.isEvenSubset(test2m, test2n), 0);

        int test3m = 18;
        int test3n = 32;
        test("test3" , ob.isEvenSubset(test3m, test3n), 0);

        int test4m = 15;
        int test4n = 10;
        test("test4" , ob.isEvenSubset(test4m, test4n), 1);

        int test5m = 50;
        int test5n = 100;
        test("test5" , ob.isEvenSubset(test5m, test5n), 1);

        int test6m = 40;
        int test6n = 100;
        test("test6" , ob.isEvenSubset(test6m, test6n), 0);

    }

}
