import java.util.Scanner;
public class Q4 {
    public static int findSecondLargest(int[] arr){
        int max = arr[0];
        int smax = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (max < arr[i]){
                smax = max;
                max = arr[i];
            }
        }
        return smax;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter 10 integers: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The second largest number is "+findSecondLargest(arr));
        sc.close();
    }
}
