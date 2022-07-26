package com.company;

public class moveZereosAtEnd {

    static void zeroesAtEnd(int[] arr){
        int zereos = 0;
        int x = 0;
        for(int i=0;i<arr.length;i++){
           if(arr[i] != 0){
               arr[x] = arr[i];
               x++;
           }else{
               zereos++;
           }
        }
        int y = arr.length-zereos;
        for(int i=y;i<arr.length;i++){
            arr[i]=0;
        }
    }

    static  void efficientMTD(int[] arr){
        int count = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] !=0){
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = arr[count];
                count++;
            }
        }
    }

    public static void main(String[] args){

        int[] arr = {10,0,0,20,30,40,0,0,0,0,50,60,0,70,80,0};
        int[] x = {0,1,0,3,12};

        zeroesAtEnd(x);

        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
    }
}
