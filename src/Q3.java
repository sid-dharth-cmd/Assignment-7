import java.util.Scanner;
public class Q3 {
    public static void readArray(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 integers: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
    }
    public static int countOccurrences(int[] arr, int key){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (key == arr[i])
                count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        readArray(arr);
        System.out.println("Enter the number to search: ");
        int key = sc.nextInt();
        if (countOccurrences(arr, key) > 0)
            System.out.println("The number "+key+" appears "+countOccurrences(arr, key)+" time(s) in the array.");
        else 
            System.out.println("The key is not found.");
        sc.close();
    }
}
