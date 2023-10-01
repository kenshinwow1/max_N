import java.util.Scanner;

public class main{

    public static int[] array;

    public static void main (String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        //enter number
        int N = scanner.nextInt();


        //crete massive

        array = new int[N];

        //Count N numbers
        for(int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        //find max number in massive
        int max = array[0];
        for(int i = 1; i < N; i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println("Max number:" + max);
    }
}

