import java.util.Scanner;

public class Salary {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double doanhthu = scan.nextDouble();
        double luongcoban = scan.nextDouble();
        double luong = 0;
        while (luong == 0){
            if (doanhthu >= 100) {
                if (doanhthu >= 150) {
                    luong = luongcoban + luongcoban * 0.2;
                } else {
                    luong = luongcoban + luongcoban * 0.1;
                }
            } else {
                luong = luongcoban;
            }
        }
        System.out.println("Tien luong cua ban la: " + luong + "trieu VND");
    }
}
