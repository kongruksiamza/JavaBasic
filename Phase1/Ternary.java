import java.util.Scanner;
class Ternary{
    // เขียนโปรแกรมหาเลขคู่ / เลขคี่
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("ป้อนตัวเลขจำนวนเต็ม = ");
        int number=kb.nextInt();

        String result="";
        //ตัวแปร = (เงื่อนไข) ? คำสั่งเมื่อเงื่อนไขเป็นจริง :  คำสั่งเมื่อเงื่อนไขเป็นเท็จ;
        result = (number%2 == 0) ? number+ " = เลขคู่" : number+ " = เลขคี่";
        System.out.println(result);
    }
}
