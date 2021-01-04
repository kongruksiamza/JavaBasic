class Demo{
    static int balance = 5000;
    public static void main(String[] args) {
       try {
        int number=10000;
        
       } catch (Exception e) {
            e.printStackTrace();
       }
    }

    public static void withDraw(int money) throws Exception{
        if(money<=0){
            throw new Exception("ตัวเลขต้องมากกว่า 0");
        }
        if(money>balance){
            throw new Exception("ยอดเงินในบัญชีไม่พอ");
        }
        balance -=money;
        System.out.println("ยอดเงินคงเหลือ = "+balance);
    }
}