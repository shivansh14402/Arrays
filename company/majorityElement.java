package com.company;

public class majorityElement {

    //maurice voting algo

    static int findMajority(int[] arr){
        int n = arr.length;
        int res = 0;
        int count = 1;

        for(int i=1;i<n;i++){
            if(arr[res]==arr[i]){
                count++;
            }else{
                count--;
            }
            if(count==0){
                res = i;
                count=0;
            }
        }
        count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==arr[res]){
                count++;
            }
            if(count==n/2){
                return arr[res];
            }
        }
        return -1;
    }
}
