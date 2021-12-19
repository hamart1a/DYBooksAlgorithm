package Chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {72,68,92,88,41,53,97,84,39,55};

        //랜덤한 수 맞추기
        System.out.println(doBinarySearch(array));


    }

    //배열의 최대값과 최솟값 구하기
    static String doBinarySearch(int[] arr){

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int x = sc.nextInt();
        sc.close();

        Arrays.sort(arr);//배열을 오름차순으로 정렬

        int pos = -1;
        int right = arr.length - 1;
        int left = 0;
        int middle;
        int cnt = 0;

        while(pos == -1 && left <= right){

            middle = left + right /2;

            if(arr[middle] == x){

                pos = middle;
            }else if(arr[middle] < x){
                left = middle + 1;
            }else{
                right = middle - 1;
            }

            cnt++;
        }

        return "당신이 떠올린 값은..."+pos+"이죠?("+cnt+"번만에 찾음)";

    }
}
