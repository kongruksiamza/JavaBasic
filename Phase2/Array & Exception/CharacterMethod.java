class CharacterMethod{
    public static void main(String[] args) {
        Character alphabet = new Character('1');
        char c='B';
        System.out.println(Character.isLetter(c));// เช็คว่าเป็นตัวอักษรหรือไม่ 
        System.out.println(Character.isDigit(alphabet));// เช็คว่าเป็นตัวอักษรตัวเลขหรือไม่ 

        if(Character.isUpperCase(alphabet)){
            System.out.println("เป็นพิมพ์ใหญ่");
        }

        if(Character.isLowerCase(alphabet)){
            System.out.println("เป็นพิมพ์เล็ก");
        }

        System.out.println("Before = "+c);
        char result = Character.toUpperCase(c);
        char result = Character.toLowerCase(c);
        System.out.println("After = "+result);
    }
}