import java.util.Scanner;
class Assignment5{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("ป้อนน้ำหนัก (kg) :");
        double weight=sc.nextDouble();
        System.out.print("ป้อนส่วนสูง (cm) :");
        double height=sc.nextDouble();
        height/=100;
        double bmi=weight/(height*height);

        System.out.println("น้ำหนัก = "+weight);
        System.out.println("ส่วนสูง = "+height);
        System.out.println("ค่าดัชนีมวลกาย (BMI) = "+bmi);
        String predict="";

        if(bmi<18){
            predict="ต่ำกว่าเกณฑ์";
        }
        else if(bmi>=18.5 && bmi<=22.9){
            predict = "สมส่วน";
        }
        else if(bmi>=23.0 && bmi<=24.9){
            predict = "น้ำหนักเกิน";
        }
        else if(bmi>=25.0 && bmi<=29.9){
            predict = "โรคอ้วน";
        }else if(bmi>=30.0 && bmi<=70.0){
            predict = "โรคอ้วนระดับอันตราย";
        }else{
            predict = "ไม่ทราบค่า";
        }
        System.out.println("ทำนายผล = "+predict);

    }
}
