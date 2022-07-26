package com.company;

public class leaderOfArray {

    static  void Leader(int[] arr){
        int l = arr.length;

        for(int i=0;i<l;i++){
            boolean lead = true;
            for(int j=i+1;j<l;j++){
                if(arr[i]<=arr[j]){
                    lead = false;
                }
            }
            if(lead){
                System.out.println(arr[i]);
            }
        }

        // time complexity theta(n^2)
    }

    static void Leader2(int[] arr){
        int n = arr.length;

        int curr_lead = arr[n-1];

        System.out.print(curr_lead+" ");

        for(int i=n-2;i>=0;i--){
            if(arr[i]>curr_lead){
                System.out.print(arr[i]+" ");
                curr_lead = arr[i];
            }
        }
    }

    public static void main(String[] args){
        int[] x = {1,2,3,4,5,600,70,8,9,10};
        Leader2(x);
//        for (int i=0;i<x.length;i++){
//            System.out.print(x[i]+" ");
//        }
    }
}
