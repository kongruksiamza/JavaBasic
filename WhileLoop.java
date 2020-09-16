class WhileLoop{
    public static void main(String[] args) {
        int count=1;
        while(true){
            System.out.println("รอบที่ = "+count+ " Hello World");
            count++;//2 ,3 ,.......10,11
            if(count>100) break;
        }
    }
}