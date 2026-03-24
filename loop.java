import java.util.Scanner;

public class loop {

    public static void main(String[] args) {
        //Printing a number till the given input//
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number n:");
        int n = input.nextInt();
        for(int i = 1; i<=n ; i++){
            System.out.println(i);
        }
    }
}