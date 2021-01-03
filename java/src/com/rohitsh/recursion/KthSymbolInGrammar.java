package com.rohitsh.recursion;


import com.rohitsh.basics.ReverseAString;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.sql.PreparedStatement;
import java.util.HashMap;

public class KthSymbolInGrammar {

    public static int kthGrammar(int N, int K) {
        /*
        String result = helper(N - 1);
        return  Character.getNumericValue(result.charAt(K - 1));
        */

        // optimized
        return Helper(N, K - 1);

    }

    private static int Helper(int N, int K){
        if(N == 1) return 0;
        int mid = K/2;
        int val = kthGrammar(N - 1, mid);

        if(val == 0) {
            return K % 2 == 0 ? 0 : 1;
        } else
            return K % 2 == 0 ? 1 : 0;
    }

    private static String helper(int N){

        HashMap<Integer, String> map = new HashMap<>();
        String result;

        if(map.containsKey(N)){
            return map.get(N);
        }

        if(N == 1) return "0";

        result = helper(N - 1);

        var out =  result + flip(result, N - 1);

        map.put(N, out);

        return out;
    }

    private static String flip(String result,  int N){
        StringBuilder output = new StringBuilder();

        for(char i : result.toCharArray()){
            if(i == '0') output.append('1');
            else output.append('0');
        }

        return output.toString();
    }


    public static void main(String[] args) {
        System.out.println(kthGrammar(1, 1));
        System.out.println(kthGrammar(2, 1));
        System.out.println(kthGrammar(2, 2));
        System.out.println(kthGrammar(4, 5));

        System.out.println(kthGrammar(30, 434991989));
    }
}
