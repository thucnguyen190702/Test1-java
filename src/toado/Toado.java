package toado;

import java.util.Scanner;

public class Toado {

    public static void main(String[] args) {
        int xA ,xO,yA, yO ,r ;
        Scanner s = new Scanner(System.in);
        System.out.println("Moi ban nhap hoanh do diem A: ");
        xA = s.nextInt();
        System.out.println("Moi ban nhap tung do diem A: ");
        yA = s.nextInt();
        System.out.println("Moi ban nhap hoanh do tam 0 cua duong tron: ");
        xO = s.nextInt();
        System.out.println("Moi ban nhap tung do tam 0 cua duong tron: ");
        yO = s.nextInt();
        System.out.println("Moi ban nhap ban kinh: ");
        r = s.nextInt();
        //binh phuong ban kinh
         int binhPhuongR = r*r;
         //binh phuong khoang cach toa do OA
         int khoangCachOA = (xA - xO) * (xA - xO) + (yA - yO)*(yA - yO);
         if(binhPhuongR>khoangCachOA){
             System.out.println("diem A nam trong duong tron");
         }
         else if(binhPhuongR==khoangCachOA){
             System.out.println("diem A nam tren duong tron ");
         }
         else{
             System.out.println("diem A nam ngoai duong tron");
         }
    }
    
}
