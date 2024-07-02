package learningjavabasic;

class Person<T extends String, U extends Integer> {
    T name;
    U age;
    public Person(T name, U age) {
        this.name = name;
        this.age = age;
    }
}

class Product<T extends String, U extends Number> {
    T name;
    U price;
    public Product(T name, U price) {
        this.name = name;
        this.price = price;
    }
}

public class Program {
    public static void main(String[] args) {
//        Person<String,Integer> obj1=new Person<>("kong",30);
//        System.out.println(obj1.name);
//        System.out.println(obj1.age);
        Product<String, Number> product1 = new Product<>("Mouse", 100);
        Product<String, Number> product2 = new Product<>("Keyboard", 199.99);
    }
}