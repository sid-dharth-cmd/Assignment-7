import java.util.Scanner;
public class Q9 {
    public static void bubbleSort(double[] arr){
        for (int i = 0; i < arr.length-1; i++){
            for (int j = 0; j < arr.length-1-i; j++){
                if (arr[j] > arr[j+1]){
                    double t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double arr[] = new double[10];
        System.out.print("Enter element:");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextDouble();
        }
        bubbleSort(arr);
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }   
}
