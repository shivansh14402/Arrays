package com.company;

public class secondLargestElement {
    public static void main(String[] args){
        int[] x = {1000,20,1000,50,40,900,100,200,54,6,9};

        System.out.println(efficientApproach(x));
    }

    static int secondLargestElement(int[] arr){
        int res = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > arr[res]){
                res = i;
            }
        }
        int res2 = -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i] != arr[res]){
                if(res2==-1){
                    res2 = i;
                }
                else if(arr[i]>arr[res2]){
                    res2 = i;
                }
            }
        }

        return res2;
    }

    static int efficientApproach(int[] arr){
        int res=0;
        int second = -1;

        for(int i=1; i<arr.length;i++){
            if(arr[i] >= arr[res]){
                res = i;
                continue;
            }else{
                if(second == -1){
                    second = i;
                }
                else if(arr[i]>arr[second]){
                    second = i;
                }
            }
        }
        return  second;
    }
}
