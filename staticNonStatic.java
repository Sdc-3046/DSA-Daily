public class staticNonStatic {
    int b;
    static int n =10;
    staticNonStatic(int a){
        b =  a;
        n = a;
    }
    public static void main(String[] args) {
        staticNonStatic obj1 = new staticNonStatic(5);
        staticNonStatic obj2 = new staticNonStatic(8);
        System.out.println(obj1.b+" "+n);
        System.out.println(obj2.b+" "+n);
    }

    /*public static void staticfunction(){
        int a = b;        
        System.out.println("This is a static function a="+a);
    }

    public void nonStaticfuunction(){
        System.out.println("This is non static function a="+a);
    }*/
}
