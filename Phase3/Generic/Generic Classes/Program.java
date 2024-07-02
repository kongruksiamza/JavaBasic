package learningjavabasic;
class Item<T>{
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
        Item<String> obj3 = new Item<>("Kong");
        System.out.println(obj3.data);
        Item<Boolean> obj4=new Item<>(true);
        System.out.println(obj4.data);
        Item<Character> obj5=new Item<>('C');
        System.out.println(obj5.data);
    }

}