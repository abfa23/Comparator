package Lesson4;
import java.util.Scanner;

import static Lesson4.TivoliRide.*;

public class TivoliRideTest {
    public static void main(String[] args) {
        test();
    }
    public static void test() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your height: ");
        int Height = input.nextInt();

        TivoliRide visitor = new TivoliRide(Height);
        visitor.getHeight(Height);

        input.close();
    }
}