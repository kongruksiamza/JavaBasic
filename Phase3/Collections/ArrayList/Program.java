package learningjavabasic;
import java.util.ArrayList;
import java.util.List;
public class Program {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        ArrayList<String> newdata = new ArrayList<>(List.of("C","C++","C#"));
        data.add("Java");
        data.add("PHP");
        data.add("Python");
        data.add(1,"SQL");
//        data.set(0, "JavaScript");
        data.addAll(0,newdata);
        data.remove(1);
        data.remove("SQL");
//        data.clear();
//        System.out.println(data.contains("C++"));
        System.out.println(data.indexOf("C++"));
        System.out.println(data);
    }
}