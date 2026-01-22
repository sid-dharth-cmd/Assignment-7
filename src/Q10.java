import java.util.Scanner;
public class Q10 {
    public static int[] eliminateDuplicates(int[] list){
        int temp[] = new int[list.length];
        int count = 0;
        for (int i = 0; i < list.length; i++){
            boolean isDuplicate = false;
            for(int j = 0; j < count; j++){
                if (list[i] == temp[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate){
                temp[count] = list[i];
                count++;
            }
        }
        int result[] = new int[count];
        for(int i = 0; i < result.length; i++){
            result[i] = temp[i];
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int list[] = new int[10];
        System.out.print("Enter ten number: ");
        for (int i = 0; i < list.length; i++){
            list[i] = sc.nextInt();
        }
        System.out.print("The distinct numbers are :");
        int result[] = eliminateDuplicates(list);
        for (int i = 0; i < result.length; i++){
            System.out.print(result[i]+" ");
        }
        sc.close();
    }
}
