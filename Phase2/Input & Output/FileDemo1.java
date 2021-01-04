import java.io.*;
class FileDemo1{
    public static void main(String[] args) {
        // File f=new File("Demo.txt");
        try {
            FileWriter writer = new FileWriter(new File("Introduction.txt"));
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("สวัสดีครับผม\n");
            bw.write("เขียนโปรแกรมภาษา Java เบื้องต้น\n");
            bw.write("สอนโดยก้องรักสยาม");
            // writer.close();
            bw.close();
            System.out.println("เขียนไฟล์เสร็จแล้ว!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}