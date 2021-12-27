package Chapter4;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {90,34,78,12,56};
        int ins, cmp, temp;

        //정렬 전 배열 내용을 표시
        System.out.println("정렬 전 배열 :" + Arrays.toString(arr));


        //삽입정렬
        for(ins = 1; ins < arr.length; ins++){ //초기값은 내버려 두니까 1부터 시작
            System.out.println("외부 반복문: temp <-"+ins+"="+arr[ins]);
            temp = arr[ins];
            for(cmp = ins -1 ; cmp >= 0 && arr[cmp] > temp;cmp-- ){
                System.out.printf("내부 반복문: ins = %d, cmp = %d, temp = %d\n",ins,cmp,temp);
                if(arr[cmp] > temp){//등호 바꾸면 내림차순 가능
                    arr[cmp + 1] = arr[cmp]; //arr[n]이 arr[n+1]보다 작다면 arr[n]를 한 칸 뒤로 보낸다.
                }
            }
            arr[cmp+1] = temp; //arr[n]의 값을 temp로 바꾼다.(교체 끝)
            System.out.println("중간 결과:" + Arrays.toString(arr));
        }

        //정렬 후 배열
        System.out.println("정렬 후 배열 :" + Arrays.toString(arr));

    }


}
