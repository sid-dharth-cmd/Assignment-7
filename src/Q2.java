import java.util.Scanner;
public class Q2 {
    public static void readInput(int[] counts){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integers between 1 to 100: ");
        while (true){
            int num = sc.nextInt();
            if (num == 0)
                break;
            if (num >= 0 && num <= 100)
                counts[num]++;
        }
        sc.close();
     } 
     public static void displayCounts(int[] counts){
        for (int i = 0; i <=100; i++){
            if (counts[i] > 0){
                if (counts[i] == 1){
                    System.out.println(i+" occurs "+counts[i]+ " times.");
                }
                else {
                    System.out.println(i+" occurs "+counts[i]+" times.");
                }
            }
        }
     }
     public static void main(String[] args){
        int arr[] = new int[101];
        readInput(arr);
        displayCounts(arr);
     }
}
