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
public class bai17_fibonacci {
        
public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao so phan tu : ");
        int n = scanner.nextInt();
        int so1 = 0;
        int so2 = 1;
        System.out.print("Day So: " + so1);

        // Vong lap tinh va in cac so tiep theo
        for (int i = 1; i < n; i++) {
            // Tinh so tiep theo
            int soketiep = so1 + so2;

            // In so tiep theo ra man hinh
            System.out.print(", " + soketiep);

            // Cap nhat 2 so de tiep tuc vong lap
            so1 = so2;
            so2 = soketiep;
        }

        scanner.close();
    }
}

