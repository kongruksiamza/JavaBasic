import java.util.Scanner;
class ExceptionDemo1{
    public static void main(String[] args) {
        try {
            Scanner kb =new Scanner(System.in);
            System.out.print("ป้อนตัวเลข = ");
            int number=kb.nextInt();
            System.out.println(number);

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            //คำสั่งอื่นๆ
            System.out.println("ทำงานอย่างอื่นไปๆ...");
        }
    }
}