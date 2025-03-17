//Print the numbers in reverse

public class ex3 {
    public static void main(String args[]) {
        int num = 1234;
        int rev = 0;
        int temp;

        while(num > 0) {
            temp = num % 10;
            rev = rev * 10 + temp;
            num = num / 10;
        }
        System.out.println("Reverse of the number is: " + rev);
    }
}