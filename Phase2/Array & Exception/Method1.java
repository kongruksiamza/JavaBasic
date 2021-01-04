class Method1{
    public static void main(String[] args) {
        int [] numberA = {10,20,30,50,100,200};
        String [] fruit = {"มะม่วง","ขนุน","น้อยหน่า"};
        System.out.println(searchFruit(fruit,"ขนุน"));
    }

    // แสดงผลตัวเลขใน array ที่ส่งเข้ามาทำงานในเมธอด
    static void displayArray(int [] arr){
        System.out.print("{");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1) System.out.print(",");
        }
        System.out.println("}");
    }

    static int findMaxInArray(int [] arr){
        // ค้นหาค่าที่มากที่สุดใน Array 
        // ได้ค่ามากที่สุด
        int maxValue = arr[0] ;//เก็บค่าสูงสุดเอาไว้เป็นค่าเริ่มต้น
        // 10;
        // 20; 
        for(int i= 0; i<arr.length;i++){
            if(arr[i]>maxValue){
                maxValue=arr[i];
            }
        }
        return maxValue;
    }

    static int findMinInArray(int [] arr){
        int minValue = arr[0] ;//เก็บค่าต่ำสุดเอาไว้เป็นค่าเริ่มต้น
        for(int i= 0; i<arr.length;i++){
            if(arr[i]<minValue){
                minValue=arr[i];
            }
        }
        return minValue;
    }
    static int findMaxIndex(int [] arr){
        int maxIndex=0;//เก็บตำแหน่ง Index สมาชิกที่มีค่าตัวเลขมากที่สุดใน arr
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[maxIndex]){
                maxIndex=i;
            }
        }
        return maxIndex;
    }

    static int findMinIndex(int [] arr){
        int minIndex=0;//เก็บตำแหน่ง Index สมาชิกที่มีค่าตัวเลขน้อยที่สุดใน arr
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[minIndex]){
                minIndex=i;
            }
        }
        return minIndex;
    }
    static boolean compareArray(int [] a , int [] b){
        if(a.length != b.length) return false;
        for(int i=0;i<a.length;i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
    static void swapElement(int [] a , int x , int y){
        int temp = a[x]; // 10
        a[x] = a[y]; // 30 
        a[y] = temp;
    }
    static int [] copyArray(int [] a){
        // โยน Array A = 6 Array ใหม่ = 6 ช่องว่าง
        int [] newArr = new int[a.length];
        for(int i=0;i<a.length;i++){
            newArr[i] = a[i];
        }
        return newArr;
    }
    static int searchElement(int [] arr , int number){
        for(int i = 0; i<arr.length;i++){
            if(arr[i] == number){
                return i;
            }
        }
        return -1;
    }
    static int searchFruit(String [] arr , String name){
        for(int i = 0; i<arr.length;i++){

            if(arr[i].equals(name)){
                return i;
            }
        }
        return -1;
    }
}