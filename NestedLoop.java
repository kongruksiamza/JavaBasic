class NestedLoop{
    public static void main(String[] args) {
        // loop นอก
        int i=1,j=1;
        while(i<=3){
            System.out.println("รอบนอก = "+i);
            j=1;
            while(j<=5){
                System.out.println("รอบใน = "+j); // 5
                j++;//6
            }
            i++;//2
        }
    }
}