package learningjavabasic;
import java.util.*;
public class Program {
    public static void main(String[] args) {        
        HashMap<String,String> countries = new HashMap<>();
        countries.put("TH","Thailand");
        countries.put("JP", "Japan");
        countries.put("CN", "China");
        countries.remove("CN");
//        countries.clear();
//        System.out.println(countries.containsValue("Lao"));
        System.out.println(countries);
        System.out.println(countries.size());
        HashMap<Boolean,String> confirm = new HashMap<>();
        confirm.put(true,"OK");
        confirm.put(false, "Cancel");
        System.out.println(confirm);
    }
}