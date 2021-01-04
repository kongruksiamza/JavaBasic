class ArrayBasic1{
    public static void main(String[] args) {
        // Array 2 มิติ
        String [][] products ={
            {"เก้าอี้","โต๊ะ","โคมไฟ"},
            {"คีย์บอร์ด","เม้าส์","แป้นพิมพ์"},
            {"ลิปติก","โรลออน","ครีม"}
        };
        for(int row = 0 ;row<products.length;row++){
            for(int column=0;column<products[row].length;column++){
                System.out.println("แถวที่ = "+row +" คอลัมน์ที่ = "+column +" เก็บค่า = "+products[row][column]);
            }
        }
    }
}