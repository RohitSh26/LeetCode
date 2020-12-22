package com.rohitsh.learnarray;

public class ReplaceElementsWithGreatestElementOnRightSide {

    /*
    Example 1:

    Input: arr = [17,18,5,4,6,1]
    Output: [18,6,6,6,1,-1]
     */
    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = arr[n - 1];

        for (int i = n - 1; i >= 0; i--) {
            if(i == n - 1){
                arr[i] = -1;
            } else {
                // current item
                int temp = arr[i];

                arr[i] = max;


                if(temp > max) max = temp;

            }


        }

        return arr;
    }

    public static void main(String[] args) {

        var arr = new int[] {17,18,5,4,6,1};

        for(int i : replaceElements(arr)) System.out.println(i);
    }
}
