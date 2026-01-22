import java.util.Scanner;
public class Q7 {
    public static void readArray(int[] arr){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }        
        sc.close();
    }
    public static void rotateClockwise(int[] arr){
        int last = arr[arr.length-1];
        for (int i = arr.length-1; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args){
        
        System.out.print("Enter ten numbers: ");
        int arr[] = new int[10];
        readArray(arr);
        rotateClockwise(arr);
        System.out.println("Array elements after clock-wise rotation: ");
        printArray(arr);
        
    }
}
