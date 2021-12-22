package Chapter4;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {90,34,78,12,56};
        int ins, cmp, min, temp;
        for(ins = 0; ins < arr.length-1; ins++){
            min = ins;
            for(cmp = ins+1; cmp < arr.length; cmp++){
                if(arr[ins] > arr[cmp]){ //앞에 있는게 뒤에있는 것보다 크다.
                    min = cmp; //cmp를 최솟값으로 지정
                    temp = arr[ins]; //앞에 위치한 인덱스 값을 임시 저장한다.
                    arr[ins] = arr[min]; //앞에 있는 값을 뒤로 옮긴다
                    arr[min] = temp; //임시저장값을 최솟값이 있던 인덱스에 저장

                }
            }
        }
        //정렬 후 배열
        System.out.println("정렬 후 배열 :" + Arrays.toString(arr));

    }
}
