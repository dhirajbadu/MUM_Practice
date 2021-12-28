package com.practice;

/*
A twinoid is defined to be an array that has exactly two even values that are adjacent to one
another. For example {3, 3, 2, 6, 7} is a twinoid array because it has exactly two even values (2 and
6) and they are adjacent to one another. The following arrays are not twinoid arrays.
{3, 3, 2, 6, 6, 7} because it has three even values.
{3, 3, 2, 7, 6, 7} because the even values are not adjacent to one another
{3, 8, 5, 7, 3} because it has only one even value.
Write a function named isTwinoid that returns 1 if its array argument is a twinoid array. Otherwise
it returns 0.
If you are programming in Java or C#, the function signature is
int isTwinoid (int [ ] a);
If you are programming in C or C++, the function signature is
int isTwinoid(int a[ ], int len) where len is the number of elements in the array.
* */
public class TwinoidArray extends Test{
    
    public int isTwinoid(int [ ] a){
        int isTwinoid = 0;
        
        if(a == null){
            return 0;
        }
        
        for(int i = 0; i < a.length; i++){
            if(a[i]%2 == 0){
                if(a[i+1]%2 == 0 && isTwinoid == 0) {
                    isTwinoid = 1;
                    i++;
                }else{
                    isTwinoid = 0;
                    break;
                }
            }
        }
        
        return isTwinoid;
    }

    public static void main(String[] args) throws Exception{
        TwinoidArray ob = new TwinoidArray();
        int[] test1 = {3, 3, 2, 6, 7};
        test("test1" , ob.isTwinoid(test1), 1);

        int[] test2 = {3, 3, 2, 6, 6, 7};
        test("test2" , ob.isTwinoid(test2), 0);

        int[] test3 =  {3, 3, 2, 7, 6, 7};
        test("test3" , ob.isTwinoid(test3), 0);

        int[] test4 =  {3, 8, 5, 7, 3};
        test("test4" , ob.isTwinoid(test4), 0);
    }
}
