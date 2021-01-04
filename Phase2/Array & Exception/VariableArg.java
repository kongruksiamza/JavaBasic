class VariableArg{
    public static void main(String[] args) {
        summation(10,20,30);
    }
    public static void summation(int...number){
        int sum=0;
        for(int i=0;i<number.length;i++){
            sum+=number[i];
        }
        System.out.println("ผลรวม = "+sum);
    }
}