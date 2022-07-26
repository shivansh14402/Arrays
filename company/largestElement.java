package com.company;

public class largestElement {
    public static void main(String[] args){

        int[] x = {1000,20,30,50,40,90,100,200,54,6,9};

        System.out.println(largestElement(x, x.length));

    }

    static int largestElement(int[] arr, int n){
        int index =0;
        int max =0;

        for(int i=0;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        //t(n) = O(n);
        return index;
    }
}
