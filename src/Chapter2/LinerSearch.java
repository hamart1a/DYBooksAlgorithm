package Chapter2;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class LinerSearch {

    //선형검색 : 임의의 배열에서 원하는 값을 찾는 알고리즘
    //순차적으로 탐색하여 원하는 값을 찾는다.

    public static void main(String[] args) {
        int[] array = {72,68,92,88,41,53,97,84,39,55};

        //선형검색
//        int pos, input;
//        pos = -1;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("숫자를 입력하세요");
//        input = sc.nextInt();
//        sc.close();
//
//        //int res = linerSearch(array, input, pos);
//        int res = sentinelLinerSearch(array, input, pos);
//
//        System.out.println(res);

        //최댓값 최솟값 구하기
        System.out.println(getMaxMinByLinerSearch(array));


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
                //보초값을 넣기 전에는 배열에 찾는 값이 검색되거나, 끝까지 검색안되거나 두가지 처리를 했는데
                //보초값을 넣으면 전자 하나만 써도 코드가 동작함.(끝까지 검색안되도 보초값과 매치되므로)
            }
        }
        return i == arrList.size()-1 ? -1 : i;
    }


    //배열의 최대값과 최솟값 구하기
    static String getMaxMinByLinerSearch(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for(int i=1; i< arr.length; i++){ //0부터 시작하므로 루프 카운터를 1로 잡아줌
            if(max < arr[i]) max = arr[i];
            if(min > arr[i]) min = arr[i];
        }
        return "최대값"+max+"  "+"최솟값"+min;

    }


}
