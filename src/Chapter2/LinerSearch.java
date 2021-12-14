package Chapter2;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class LinerSearch {

    //선형검색 : 임의의 배열에서 원하는 값을 찾는 알고리즘
    //순차적으로 탐색하여 원하는 값을 찾는다.

    public static void main(String[] args) {
        int[] array = {72,68,92,88,41,53,97,84,39,55};
        int pos, input;
        pos = -1;

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요");
        input = sc.nextInt();
        sc.close();

        //int res = linerSearch(array, input, pos);
        int res = sentinelLinerSearch(array, input, pos);

        System.out.println(res);


    }

    //일반선형검색
    static int linerSearch(int[] arr, int input, int pos){
        for(int i =1; i <= arr.length; i++){
            if(input == arr[i-1]) {
                pos = i;
                break;
            }
            else{
                i++;
            }
        }
        return pos;
    }

    //보초법을 사용한 선형검색
    static int sentinelLinerSearch(int[] arr, int input, int pos){
        //배열추가, 삭제가 가능한 arrayList로 변경
        ArrayList<Integer> arrList = (ArrayList<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());

        int i;

        arrList.add(input);//보초값 추가
        for(i = 0; i < arrList.size(); i++){
            if(input == arrList.get(i)) {
                break;
            }
        }
        return i == arrList.size()-1 ? -1 : i;
    }


}
