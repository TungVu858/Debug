package baitap;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh 1 : ");
        double side1 = isNumber(sc);
        System.out.println("Nhập cạnh 2 : ");
        double side2 = isNumber(sc);
        System.out.println("Nhập cạnh 3 : ");
        double side3 = isNumber(sc);
        Triangle triangle;
            try {
                triangle = new Triangle(side1, side2, side3);
            } catch (IllegalTriangleException e) {
                System.err.println(e.getMessage());
            }
    }
    public static double isNumber(Scanner sc){
        boolean check = false;
        double side = 0;
        while (!check){
            try {
                side =sc.nextDouble();
                check = true;
            }catch (Exception e) {
                System.err.println("Không được nhập chữ !!!!");
                sc.nextLine();
            }
        }
        return side;
    }
}
