import java.util.Scanner;
class Public {
public static void main(String[] args) {

    int a,b,c,sonuc;
    Scanner value = new Scanner(System.in);
    System.out.print("a değerini giriniz : ");
    a = value.nextInt ();
    System.out.print("b değerini giriniz : ");
    b = value.nextInt ();
    System.out.print("c değerini giriniz : ");
    c = value.nextInt ();

    sonuc = (a+b*c-b);
    System.out.print("Sonuç : " + sonuc);
}
}