package Practice.Week1;
public class CellphoneMain{
    public static void main(String[] args) {
    System.out.println("Cellphones");
    System.out.println();
    Cellphone cellphone1 = new Cellphone();
    cellphone1.Platform = "Android";
    cellphone1.OS = "Color OS";
    Cellphone cellphone2 = new Cellphone();
    cellphone2.Platform = "Iphone";
    cellphone2.OS = "IOS";

    cellphone1.print();
    System.out.println();
    cellphone2.print();
    }
}