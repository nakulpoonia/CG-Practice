package CapgeminiQuestion;
import java.util.*;




    public class BinaryToDecimal {

        static int binaryToDecimal(int binary) {
            int decimal = 0, power = 0;
            while (binary != 0) {
                int digit = binary % 10;
                decimal += digit * Math.pow(2, power);
                power++;
                binary /= 10;
            }
            return decimal;
        }

        static int decimalToBinary(int decimal) {
            int binary = 0, place = 1;
            while (decimal != 0) {
                binary += (decimal % 2) * place;
                place *= 10;
                decimal /= 2;
            }
            return binary;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int binary = sc.nextInt();
            int decimal = sc.nextInt();

            System.out.println(binaryToDecimal(binary));
            System.out.println(decimalToBinary(decimal));
        }
    }


