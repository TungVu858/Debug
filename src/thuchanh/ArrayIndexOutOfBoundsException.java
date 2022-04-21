package thuchanh;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {

        public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer [] arr = arrayExample.creatRandom();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số 5" + a + " là " + arr[a]);
        }catch (Exception e){
            System.err.println("Lỗi");
        }
    }
}
