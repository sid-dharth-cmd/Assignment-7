import java.util.Scanner;
public class Q6 {
    public static void readArray(int[] arr){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            arr[i] =  sc.nextInt();
        }
        sc.close();
    }
    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }
    public static int findMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (min > arr[i])
                min = arr[i];
        }
        return min;
    }
    public static int countOccurrence(int[] arr, int value){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (value == arr[i])
                count++;
        }
        return count;
    }
    public static int firstPositionOfMax(int[] arr, int max){
        int position = 0;
        for (int i = 0; i < arr.length; i++){
            if (max == arr[i]){
                position = i+1;
                break;
        }
        }
        return position;
    }
    public static int lastPositionOfMin(int[] arr, int min){
        int position = 0;
        for (int i = arr.length - 1; i >= 0; i--){
            if (min == arr[i]){
                position = i+1;
                break;
            }
        }
        return position;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter "+size+" values: ");
        readArray(arr);
        System.out.println("\nMaximum value: "+findMax(arr));
        System.out.println("It occurs "+countOccurrence(arr, findMax(arr)));
        System.out.println("First Position of the maximum: "+firstPositionOfMax(arr, findMax(arr)));
        System.out.println("\nMinimun value: "+findMin(arr));
        System.out.println("It occurs "+countOccurrence(arr, findMin(arr)));
        System.out.println("Last Position of the minimum: "+lastPositionOfMin(arr, findMin(arr)));
        sc.close();
    }
}
