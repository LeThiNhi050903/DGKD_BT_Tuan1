/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sampleproblems;
import java.util.Scanner;
/**
 *
 * @author 84943
 */
public class SampleProblems {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter the length of edge a: ");
        a = scanner.nextInt();
        System.out.print("Enter the length of edge b: ");
        b = scanner.nextInt();
        System.out.print("Enter the length of edge c: ");
        c = scanner.nextInt();
        
        if (isValidTriangle(a, b, c)) {
            if (isEquilateral(a, b, c))
                System.out.println("Equilateral");
            else if (isIsosceles(a, b, c))
                System.out.println("Isosceles");
            else if (isRightTriangle(a, b, c))
                System.out.println("Right triangle");
            else
                System.out.println("Scalene");
        } else {
            System.out.println("Not a Triangle");
        }
    }
    
    // Kiểm tra xem ba cạnh có tạo thành tam giác hay không
    public static boolean isValidTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }
    
    // Kiểm tra xem tam giác có là tam giác đều hay không
    public static boolean isEquilateral(int a, int b, int c) {
        return a == b && b == c;
    }
    
    // Kiểm tra xem tam giác có là tam giác cân hay không
    public static boolean isIsosceles(int a, int b, int c) {
        return a == b || a == c || b == c;
    }
    
    // Kiểm tra xem tam giác có là tam giác vuông hay không
    public static boolean isRightTriangle(int a, int b, int c) {
        return a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b;
    }
}
