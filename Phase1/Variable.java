class Variable{
    public static void main(String[] args) {

        // เช็คชนิดข้อมูล
        Integer a=10;
        double b;
        String c="Hello World";
        boolean d;
        char e;
        float f;


        // เป็น (true) / ไม่เป็น (false)
        boolean result= a instanceof Integer;
        System.out.println(result);
    }
}
