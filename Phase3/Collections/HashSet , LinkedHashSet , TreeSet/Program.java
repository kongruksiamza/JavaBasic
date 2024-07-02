package learningjavabasic;
import java.util.*;
public class Program {
    public static void main(String[] args) {
//        HashSet<String> data = new HashSet<>();
//        LinkedHashSet<String> data = new LinkedHashSet<>();
        TreeSet<String> data = new TreeSet<>();
        data.add("Java");
        data.add("PHP");
        data.add("Python");
        data.add("C#");
        data.add("Dart");
        data.add("Assembly");
        data.add("PHP");
        data.add("R");
        data.add("Go");
//        data.remove("PHP");
//        data.clear();
        System.out.println(data);
        System.out.println(data.size());
    }
}