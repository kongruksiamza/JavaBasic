import java.util.Scanner;
class MinmaxLoop{
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int maxNumber=0,minNumber=Integer.MAX_VALUE;
        while(true){
            System.out.print("ป้อนตัวเลข = ");
            int number=kb.nextInt();//max = 100
            if(number<0)break;
            if(number>maxNumber) maxNumber=number;
            if(number<minNumber) minNumber=number;
        }
        System.out.println("ค่ามากสุด = "+maxNumber);
        System.out.println("ค่าน้อยสุด = "+minNumber);
    }
}
