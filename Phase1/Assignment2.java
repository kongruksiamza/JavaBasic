import java.util.Scanner;
class Assignment2{
    //เขียนโปรแกรมเปรียบเทียบตัวเลข
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("ป้อนตัวเลขที่ 1 = ");
        int number1=kb.nextInt();
        System.out.print("ป้อนตัวเลขที่ 2 = ");
        int number2=kb.nextInt();

        if(number1>number2){
            System.out.println(number1+" มากกว่า "+number2);
        }else if(number1<number2){
            System.out.println(number1+" น้อยกว่า "+number2);
        }else{
            System.out.println(number1+" เท่ากับ "+number2);
        }
    }
}
