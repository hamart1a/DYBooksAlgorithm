package Chapter5;

class StationList {
    public String name;
    public int next;
}

public class LinkedList {
    //연결 리스트의 실체가 되는 배열(요소 수는 최대 10으로 한다)
    public static StationList[] list = new StationList[10];

    //head선언
    public static int head;

    //연결 리스트의 초기 상태를 만드는 함수(인스턴스 초기화)
    public static void initStationList(){
        for(int i = 0; i< list.length; i++) {
            list[i] = new StationList();
        }

        list[0].name = "부산";
        list[0].next = -1;
        list[1].name = "대전";
        list[1].next = 3;
        list[2].name = "서울";
        list[2].next = 4;
        list[3].name = "동대구";
        list[3].next = 0;
        list[4].name = "천안아산";
        list[4].next = 1;

        head = 2;
    }

    // 연결 리스트의 요소를 표시하는 메소드
    public static void printStationList() {
        int idx = head;
        while(idx != -1){
            System.out.print("["+list[idx].name+"] ->" );
            idx = list[idx].next;
        }

        System.out.print("\n");
    }

    //연결 리스트에 요소를 삽입하는 메소드
    public static void insertStationList(int insIdx, String insName, int prevIdx) {
        list[insIdx].name = insName; //리스트 끝에 새로운 요소 추가
        list[insIdx].next = list[prevIdx].next; //앞에 있는 정보의 연결정보를 새 요소가 취함
        list[prevIdx].next = insIdx; // 앞에 있는 요소의 연결정보가 새 요소를 가리킴

    }

    //연결리스트에서 요소를 제거하는 메소드
    public static void deleteStationList(int delIdx, int prevIdx) {
        list[prevIdx].next = list[delIdx].next; //앞에 있는 요소가 삭제 대상 요소가 가지고 있던 연결정보를 취함

    }


    public static void main(String[] args) {
        initStationList();
        printStationList();

        //연결 리스트에 요소를 삽입하여 표시
        insertStationList(5,"광명",2);
        printStationList();
        // 요소를 제거
        deleteStationList(5,2);
        printStationList();
    }
}
