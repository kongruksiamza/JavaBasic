package learningjavabasic;
class Item<T extends Number>{
    T data;
    public Item(T value){
        data=value;
    }
}
public class Program {
    public static void main(String[] args) {
        Item<Integer> obj1=new Item<>(99);
        System.out.println(obj1.data);
        Item<Double> obj2=new Item<>(10.5);
        System.out.println(obj2.data);
    }

}