import java.util.*;
public class decimalToBinary {
    public static void decTOBin(int dec){
        int num = dec;
        int bin = 0;
        int pow = 0;
        while(dec > 0){
            int rem = dec % 2;
            bin = bin + (rem * (int)Math.pow(10,pow));
            pow++;
            dec = dec / 2;
        }
        System.out.print("Binary of "+num+" is "+bin);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int a = sc.nextInt();
        decTOBin(a);
    }
}
