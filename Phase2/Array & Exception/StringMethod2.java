class StringMethod2{
    public static void main(String[] args) {
        // String message = "Happy New Year 2020 | Happy Birth Day 2020";
        // message = message.replaceFirst("2020","2021");


        // String  = > Array ต้องใช้สัญลักษณ์ 
        // String data ="มะม่วง,มะยม,ขนุน,น้อยหน่า";
        // String [] fruit = data.split(" ");
        // System.out.println(fruit[0]);

        // String name ="kongruksiam";
        // subString(เริ่มนับที่ 0 , จุดสุดท้าย  - 1);
        // String word = name.substring(1); // 0 - 2
        // System.out.println(word);

        // String => Array Character
        // String name ="kongruksiam";
        // char [] alphabet = name.toCharArray();
        // System.out.println(alphabet[2]);

        // Array Character => String 
        // char [] name  = {'k','o','n','g'};
        // String result = String.copyValueOf(name);
        // System.out.println(result);

        // String name ="     kongruksiam   ";
        // System.out.println(name.length());
        // System.out.println(name);

        // name = name.trim();
        // System.out.println(name.length());
        // System.out.println(name);

        // String name ="KONGRUKSIAM";
        // System.out.println(name.toLowerCase());
        int number = 100;
        double number2 = 3.1456;
        String result = String.valueOf(number2);
        System.out.println(result);
    }
}