package com.company;

public class maxEvenOddSubArray {

    static int MaxevenOddSubArray(int[] arr){

        int n = arr.length;
        int res = 1;
        int count =1;

        for(int i=1;i<n;i++){

            if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0)){
                count++;
                res= Math.max(res,count);
            }else{
                count = 1;
            }
        }

        return res;
    }


    public static void main(String[] args){

        int[] arr = {1,2,2,3,5,6,7,8,9,10};

        System.out.print(MaxevenOddSubArray(arr));

    }
}
