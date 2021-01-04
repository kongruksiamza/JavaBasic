import java.util.Scanner;
class Assignment7{
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        // System.out.print("ป้อนอุณหภูมิ (ฟาเรนไฮน์) = ");
        // float fahren=kb.nextFloat();
        // float cel = (fahren-32)*5/9;
        // System.out.println(fahren+" องศาฟาเรนไฮน์ = "+ cel +" องศาเซลเซียส");

        System.out.print("ป้อนอุณหภูมิ (เซลเซียส) = ");
        float cel=kb.nextFloat();

        float fahren = (cel*9/5)+32;
        System.out.println(cel+" องศาเซลเซียส = "+ fahren +" องศาฟาเรนไฮน์");
    }
}
