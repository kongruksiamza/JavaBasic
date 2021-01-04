import java.lang.Math;
class MathDemo{
    public static void main(String[] args) {
        // ค่าคงที่ใน ClassMath;
        // System.out.println(Math.PI);
        // System.out.println(Math.E);
        // int r = 2;
        // double area = Math.PI * r *r;
        // System.out.println(area);


        // int number = -30;
        // System.out.println(Math.abs(number));

        //ปัดเศษ
        double number = 14.4;
        System.out.println(Math.ceil(number));//ปัดขึ้น
        System.out.println(Math.floor(number));//ปัดลง

        // <= .5 ปัดลง
        // > 0.5 ปัดขึ้น 
        System.out.println(Math.rint(number));


        // >= .5 ปัดขึ้น
        // <= .4 ปัดลง
        System.out.println(Math.round(15.4));
        System.out.println(Math.round(15.5));
        System.out.println(Math.round(15.6));


        // หาจากที่ 2 
        System.out.println("หารากที่ 2 ของ 9 = "+Math.sqrt(9));
        System.out.println("หารากที่ 2 ของ 25 = "+Math.sqrt(25));

        // หาค่ายกกำลัง
        System.out.println(Math.pow(5,4));
        
        // หาค่ามากสุดในชุดตัวเลข
        int result = Math.max(10,20,40,800,100);
        System.out.println("ค่าที่มากที่สุด คือ  "+result);
    }
}