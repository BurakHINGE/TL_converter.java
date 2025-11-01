import java.util.Scanner;

public class TLConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount of double: ");
        double amount = input.nextDouble(); 

        int tl = (int) amount;
        int kurus = (int) ((amount - tl) * 100);

        int twohundred = tl / 200;
        tl %= 200;

        int onehundred = tl / 100;
        tl%= 100;

        int fifty = tl / 50;
        tl %= 50;

        int twenty = tl / 20;
        tl %= 20;

        int ten = tl / 10;
        tl %= 10;

        int five = tl / 5;
        tl %= 5;

        int one = tl / 1;
        
        int half = kurus / 50;
        kurus %= 50;

        int quarter = kurus / 25;
        kurus %= 25;

        int onepoint = kurus / 10;
        kurus %= 10;

        int fivepoint = kurus / 5;
        kurus %= 5;

        int onepointone = kurus / 1 + 1;

        System.out.println("Your amount consists of:");
        System.out.println(
            twohundred + " x 200TL\n" +
            onehundred + " x 100TL\n" +
            fifty + " x 50TL\n" +
            twenty + " x 20TL\n" +
            ten + " x 10TL\n" +
            five + " x 5TL\n" +
            one + " x 1TL\n" +
            half + " x 50KR\n" +
            quarter + " x 25KR\n" +
            onepoint + " x 10KR\n" +
            fivepoint + " x 5KR\n" +
            onepointone + " x 1KR"
        );


    }
    
}
