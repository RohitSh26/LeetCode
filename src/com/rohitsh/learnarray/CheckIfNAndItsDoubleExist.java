package com.rohitsh.learnarray;

import java.util.HashSet;

public class CheckIfNAndItsDoubleExist {


    public static boolean checkIfExist(int[] arr) {

        HashSet<Integer> hashSet = new HashSet<Integer>();

        for(int i : arr){
            if(hashSet.contains(i * 2) || (hashSet.contains(i / 2) && i % 2 == 0)){
                return true;
            }

            hashSet.add(i);
        }


        return false;
    }

    public static void main(String[] args) {

        var arr = new int[] { -2, 0, 10, -19, 4, 6, -8 };

        System.out.println(checkIfExist(arr));

        var arr1 = new int[] { 10, 2, 5, 3 };

        System.out.println(checkIfExist(arr1));
    }
}
