package Chapter4;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {90,34,78,12,56};
        int ins, cmp, temp;
        for(ins=0; ins < arr.length-1; ins++){
            for(cmp=0; cmp < arr.length-ins-1; cmp++){
                if(arr[cmp] > arr[cmp+1]){
                    temp = arr[cmp];
                    arr[cmp] = arr[cmp+1];
                    arr[cmp+1] = temp;
                }
            }
        }
        //정렬 후 배열
        System.out.println("정렬 후 배열 :" + Arrays.toString(arr));
    }

}
