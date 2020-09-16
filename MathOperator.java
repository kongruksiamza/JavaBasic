import java.util.Scanner;
class MathOperator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ป้อนตัวเลขที่ 1 = ");
        int a=sc.nextInt();
        System.out.print("ป้อนตัวเลขที่ 2 = ");
        int b=sc.nextInt();
        
        System.out.println("ผลบวก = "+(a+b));
        System.out.println("ผลลบ = "+(a-b));
        System.out.println("ผลคูณ = "+(a*b));
        System.out.println("ผลหาร = "+(a/b));
        System.out.println("เศษ = "+(a%b));
    }
}