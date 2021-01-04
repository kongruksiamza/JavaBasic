import java.util.Scanner;
class IfStatement{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("ป้อนอายุของคุณ : ");
        int age=kb.nextInt();
        // 60
        if(age>=15 && age<=19){
            System.out.println("วัยรุ่น");
        }
        else if(age>=20 && age<=29){
            System.out.println("วัยหนุ่ม/สาว");
        }
        else if(age>=30 && age<=39){
            System.out.println("วัยทำงาน");
        }
        else if(age>=40 && age<=59){
            System.out.println("วัยกลางคน");
        }
        else if(age>=60){
            System.out.println("วัยชรา");
        }else{
            System.out.println("ไม่พบช่วงอายุ");
        }
        System.out.println("จบโปรแกรม");
    }
}
