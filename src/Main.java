import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Calculator test = new Calculator(254, 148);

        System.out.println("Initial Values: " + test.getFirstValue() + ", " + test.getSecondValue());
        System.out.println("Multiplication: " + test.Multiply());
        System.out.println("Division: " + test.Divide());
        System.out.println("Addition: " + test.Add());
        System.out.println("Subtraction: " + test.Subtract());

        UserCheck testUser = new UserCheck();

        testUser.Check();

    }
}