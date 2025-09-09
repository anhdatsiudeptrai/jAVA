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
public class bai7_nhapchieudaivarong {
    public static void main(String[] args) {
        System.out.println("NHAP DIEN TICH HINH TRON VA CHU NHAT ");
        Scanner nhap = new Scanner(System.in);
        /*HÌNH TRÒN*/
        
        System.out.println("nhap ban kinh hinh tron");
        double r = nhap.nextDouble();
        double chuvihinhtron = 2 * Math.PI * r;
        double dientichhinhtron = 2 * Math.PI * r * r;
        System.out.println("hình tròn");
        System.out.println("chu vi + dien tich hinh tron ");
        System.out.println("dien tich  + dien tich hinh tron");
        
        
        /*hình chữ nhật */
        System.out.println("nhap chieu dai hinh chu nhat");
        double dai = nhap.nextDouble();
        System.out.println("nhap chieu rong hinh chu nhat");
        double rong = nhap.nextDouble();
        double chuvihinhchunhat = 2 * ( dai + rong );
        double dientichhinhchunhat = dai * rong;
        System.out.print("hinh chu nhat");
        System.out.println("chu vi = " + chuvihinhchunhat);
        System.out.println("dien tich =" + dientichhinhchunhat);
     
        
        
        
    }
    
    
}
