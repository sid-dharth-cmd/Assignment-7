import java.util.Scanner;
public class Q8 {
    public static void fillArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*(30-2+1))+2;
        }
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static boolean isPrime(int num){
        for (int i = 2; i < Math.sqrt(num); i++){
            if (num%i==0)
                return true;
        }
        return false;
    }
    public static int countPrimes(int[] arr){
        int count =0;
        for (int i = 0;i < arr.length; i++){
            if (isPrime(arr[i]))
                count++;
        }
        return count;
    }
    public static void main(String[] args){
        int arr[] = new int[10];
        fillArray(arr);
        System.out.print("Array elements: ");
        printArray(arr);
        System.out.println("\nNumber of prime numbers in the array: "+countPrimes(arr));

    }
}
