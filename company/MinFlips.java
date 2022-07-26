package com.company;

public class MinFlips {

    static int MinFlipsFunc(int[] arr){
        int n = arr.length;
        int minFlips = 0;

        for(int i=1;i<n;i++){
            if(arr[i] != arr[i-1]){
                minFlips++;
            }
        }

        return minFlips/2;
    }

    public static void main(String[] args){

    }
}
