import java.util.Scanner;
class Assignment3{
    // เขียนโปรแกรมหาเลขคู่ / เลขคี่
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("ป้อนตัวเลขจำนวนเต็ม = ");
        int number=kb.nextInt();

        // % number % 2 ลงตัว => คู่
        // % number % 2 ไม่ลงตัว => คี่

        String result="";

        if(number%2 == 0){
            result=number+ " = เลขคู่";
        }else{
            result=number+ " = เลขคี่";
        }
        System.out.println(result);
    }
}
