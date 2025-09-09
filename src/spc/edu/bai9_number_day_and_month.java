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
public class bai9_number_day_and_month {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap thang (1-12): ");
        int thang = sc.nextInt();

        System.out.print("Nhap nam: ");
        int nam = sc.nextInt();

        int soNgay;

       switch (thang) {
            case 1, 3, 5, 7, 8, 10, 12 -> soNgay = 31;
 case 4, 6, 9, 11 -> soNgay = 30;
 case 2 ->  {
     // Kiểm tra năm nhuận
     if ((nam % 400 == 0) || (nam % 4 == 0 && nam % 100 != 0)) {
         soNgay = 29;
     } else {
         soNgay = 28;
     }
            }
 default -> {
     System.out.println("Thang khong hop le!");
     return;
            }
        }

        System.out.println("Thang " + thang + " nam " + nam + " co " + soNgay + " ngay.");
    }
}

