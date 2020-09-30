import java.math.BigInteger;

public class Fib {

    public static void main(String[] args) {

        int n = 1;
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        BigInteger c;
        int numOfDigits = 1000;

        while (String.valueOf(b).length() < numOfDigits){
            c = a.add(b);
            a = b;
            b = c;
            n++;
        }

        System.out.println("First fib with "+ numOfDigits + " digits = fib " + n + " = " + b);

    }
}
