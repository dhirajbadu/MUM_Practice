package com.practice;

import java.util.HashSet;
import java.util.Set;

/*
A balanced array is defined to be an array where for every value n in the array, -n also is in the
array. For example {-2, 3, 2, -3} is a balanced array. So is {-2, 2, 2, 2}. But {-5, 2, -2} is not
because 5 is not in the array.
Write a function named isBalanced that returns 1 if its array argument is a balanced array.
Otherwise it returns 0.
If you are programming in Java or C#, the function signature is
int isBalanced (int [ ] a);
If you are programming in C or C++, the function signature is
int isBalanced(int a[ ], int len) where len is the number of elements in the array.
* */
public class BalancedArray extends Test{

    public int isBalanced(int[] arr){
        int isBalanced = 1;
        if(arr == null){
            return 0;
        }
        
        Set<Integer> visited = new HashSet<>();

        for(int i = 0; i < arr.length ; i++){
            int v = arr[i];
            int n = Math.negateExact(arr[i]);

            if(visited.contains(v) || visited.contains(n)){
                continue;
            }

            boolean isSafe = false;

            for(int j = i+1; j < arr.length ; j++){
                if(arr[j] == n){
                    visited.add(v);
                    isSafe = true;
                    break;
                }
            }

            if(!isSafe){
                isBalanced = 0;
                break;
            }
        }

        return isBalanced;
    }

    public static void main(String[] args) throws Exception{
        BalancedArray ob = new BalancedArray();
        int[] test1 = {1,2,-1,-2};
        test("test1" , ob.isBalanced(test1), 1);

        int[] test2 =  {-2, 3, 2, -3};
        test("test2" , ob.isBalanced(test2), 1);

        int[] test3 =  {-2, 2, 2, 2};
        test("test3" , ob.isBalanced(test3), 1);

        int[] test4 =  {-5, 2, -2};
        test("test4" , ob.isBalanced(test4), 0);

        int[] test5 =  {-5, 2};
        test("test5" , ob.isBalanced(test5), 0);

        int[] test6 =  {2, 2};
        test("test6" , ob.isBalanced(test6), 0);

        int[] test7 =  {2};
        test("test7" , ob.isBalanced(test7), 0);
    }
}
