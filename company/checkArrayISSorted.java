package com.company;

public class checkArrayISSorted {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,40,60,70,80,90,100};
        System.out.println(isSorted(arr));
    }

    static boolean isSorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
