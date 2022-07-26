package com.company;

public class TappingRainWater {
    public static  void main(String[] args){

        int[] x = {1,2,3,0,5,6,7};

        System.out.print(TappingWater(x, 7));

    }

    static int TappingWater(int[] arr, int n){
        int res = 0;

        int[] lmax = new int[n];
        lmax[0] = arr[0];
        for(int i=1;i<n;i++){
            lmax[i] = Math.max(lmax[i-1], arr[i]);
        }

        int[] rmax = new int[n];
        rmax[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            rmax[i] = Math.max(arr[i], rmax[i+1]);
        }

        for(int i=1;i<n-1;i++){
            res += (Math.min(lmax[i], rmax[i]) - arr[i]);

        }
        return res;
    }
}
