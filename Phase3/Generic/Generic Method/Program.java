package learningjavabasic;
class Data{
    static <T> void showArray(T[] arr){
        for(T element : arr){
            System.out.println(element);
        }
        System.out.println("----------------");
    }
}
public class Program {
    public static void main(String[] args) {
        Data.showArray(new String[]{"Python","Java","PHP"});
        Data.showArray(new Integer[]{10,20,30});
        Data.showArray(new Double[]{10.5,20.3,30.4});
        Data.showArray(new Boolean[]{true,false,true,true});
    }
}