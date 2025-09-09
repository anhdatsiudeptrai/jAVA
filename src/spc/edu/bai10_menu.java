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
public class bai10_menu {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tinh chu vi, dien tich hinh tron");
            System.out.println("2. Tinh chu vi, dien tich hinh chu nhat");
            System.out.println("3. Thoat");
            System.out.print("Moi ban chon: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhap ban kinh r = ");
                    double r = sc.nextDouble();
                    double cvTron = 2 * Math.PI * r;
                    double dtTron = Math.PI * r * r;
                    System.out.println("Chu vi hinh tron = " + cvTron);
                    System.out.println("Dien tich hinh tron = " + dtTron);
                    break;
                case 2:
                    System.out.print("Nhap chieu dai = ");
                    double dai = sc.nextDouble();
                    System.out.print("Nhap chieu rong = ");
                    double rong = sc.nextDouble();
                    double cvCN = 2 * (dai + rong);
                    double dtCN = dai * rong;
                    System.out.println("Chu vi hinh chu nhat = " + cvCN);
                    System.out.println("Dien tich hinh chu nhat = " + dtCN);
                    break;
                case 3:
                    System.out.println("Bien di thang luoi bien!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai.");
            }
        } while (choice != 3);
    }
}

