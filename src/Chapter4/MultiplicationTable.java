package Chapter4;

public class MultiplicationTable {
    public static void main(String[] args) {
        int step, num;

        for(int i =1; i<= 9; i++){
            System.out.print(i+"단: ");
            for(int j =1; j<= 9; j++){
                System.out.print (i*j+ " ");
            }
            System.out.println("");
        }
    }
}
