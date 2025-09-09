/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai6_giaiphuongtrinhbac2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a = ");
        double a = sc.nextDouble();

        System.out.print("Nhap b = ");
        double b = sc.nextDouble();

        System.out.print("Nhap c = ");
        double c = sc.nextDouble();

        if (a == 0) {
            // Trường hợp phương trình bậc 1: bx + c = 0
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vo so nghiem.");
                } else {
                    System.out.println("Phuong trinh vo nghiem.");
                }
            } else {
                double x = -c / b;
                System.out.println("Phuong trinh co nghiem duy nhat: x = " + x);
            }
        } else {
            // Tính delta
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem phan biet:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}

