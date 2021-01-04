class StringMethod{
    public static void main(String[] args) {
        // นิยาม String
        String name1 ="kongruksiam";
        String name2 ="KongRukSiam";

        

        // Concatenation = > ต่อ String
        // String result=name+city;
        // System.out.println(result.concat(".com"));

        // หาความยาว String
        // int count = name.length();
        // System.out.println(count);


        // หาตำแหน่งตัวอักษร (เลขตำแหน่ง)
        // System.out.println(name.charAt(3));

        //  เปรียบเทียบ String   
        // if(name1.equalsIgnoreCase(name2)){
        //     System.out.println("เหมือนกัน");
        // }else{
        //     System.out.println("ไม่เหมือนกัน");
        // }

        String fullName ="ก้อง รักสยาม";
        String code ="6078930JP";

        // if(fullName.startsWith("นาย")){
        //     System.out.println("ชาย");
        // }else{
        //     System.out.println("หญิง");
        // }

        // boolean result = code.endsWith("JP");
        // if(result){
        //     System.out.println("ประเทศญี่ปุ่น");
        // }else{
        //     System.out.println("ประเทศไทย");
        // }
        int result = fullName.indexOf("java");
        System.out.println(result);
    }
}