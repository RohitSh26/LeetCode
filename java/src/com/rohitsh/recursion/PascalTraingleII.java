package com.rohitsh.recursion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PascalTraingleII {

    public static List<Integer> getRow(int rowIndex) {
        // list to return result
        List<Integer> list = new ArrayList<>();

        // run loop for i
        for (int i = 0;i < rowIndex + 1; i++) {
            // insert one in list for every row
            // i == 0 => [1]
            // i == 1 => [1, 1]
            // i == 2 => [1, 1, 1]
            list.add(1);

            // now we can see we need to manipulate indexes where i != j
            // also not  when j = 0 => because that should always be 1

            for (int j = i; j >= 0; j--) {
                if (j != 0 && j != i) {
                    // here setting value where i != j
                    // [1, 1, 1] => when i == 2 and j == 1
                    // set value of index at j
                    // with list[j] + list [j -1] = 1 + 1 = 2
                    // this converts the list into [1, 2, 1]
                    list.set(j, list.get(j) + list.get(j-1));
                }
            }
        }
        return list;

    }


    public static void main(String[] args) {
        var list = getRow(29);

        for(int i: list) System.out.print(i + " ");
    }
}
