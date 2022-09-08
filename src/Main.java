import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int dist, age, type;
        double totalPrice, perDist=0.10, ageDiscount;
        System.out.println("gideceğiniz mesafeyi giriniz");
        dist=scanner.nextInt();
        System.out.println("yaşınızı giriniz");
        age=scanner.nextInt();
        System.out.println("yolculuk tipinizi giriniz(1=> Tek Yön , 2=> Gidiş Dönüş) : ");
        type=scanner.nextInt();
        if (type<0 || type>2|| dist<0 || age<=0){
            System.out.println("Hatalı veri girdiniz");
        }else {
            totalPrice=dist*perDist;
            if (age<12){
                totalPrice=totalPrice/2;
            } else if (age>=12 && age<=24) {
                totalPrice=totalPrice*0.90;

            } else if (age>65) {
                totalPrice=totalPrice*0.70;
            }
            if (type==2){
                totalPrice=2*totalPrice*0.8;
            }
            System.out.println("Toplam Tutar = "+totalPrice);
        }
    }
}
