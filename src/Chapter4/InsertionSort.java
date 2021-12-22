package Chapter4;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {90,34,78,12,56};
        int ins, cmp, temp;

        //삽입정렬
        for(ins = 1; ins < arr.length; ins++){ //초기값은 내버려 두니까 1부터 시작
            temp = arr[ins];
            for(cmp = ins -1 ; cmp >= 0 && arr[cmp] > temp;cmp-- ){
                if(arr[cmp] > temp){//등호 바꾸면 내림차순 가능
                    arr[cmp + 1] = arr[cmp]; //arr[n]이 arr[n+1]보다 작다면 arr[n]를 한 칸 뒤로 보낸다.
                }
            }
            arr[cmp+1] = temp; //arr[n]의 값을 temp로 바꾼다.(교체 끝)
        }

        //정렬 후 배열
        System.out.println("정렬 후 배열 :" + Arrays.toString(arr));

    }


}
