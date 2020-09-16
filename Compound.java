class Compound{
    public static void main(String[] args) {
        int x = 10 , y=5;

        System.out.println("ก่อนคำนวณ = "+x);
        x%=y; // 10 - 5
        System.out.println("หลังคำนวณ = "+x);
    }
}