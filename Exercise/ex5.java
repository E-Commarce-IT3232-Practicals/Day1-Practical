//Reverse the left and right numbers like You must use only a loop 
//input  9   output 4 3 2 1 5 9 8 7 6
//input 13   output 6 5 4 3 2 1 7 13 12 11 10 9 8

import java.util.Scanner;

public class ex5 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int mid = num / 2;
        int[] arr = new int [num];
        arr[mid] = mid + 1;

        for(int i=0; i<mid; i++) {
            arr[mid-1-i] = i + 1;
            arr[num-1-i] = mid + 2 + i;
        }
        for(int i=0; i<num; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}