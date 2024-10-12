package DataStuctures.Generics.GenericMethod;

class SwapTest1{
    public static <T> void swap(T x, T y){
        T t;
        t = x;
        x = y;
        y = t;
        System.out.println("x = " + x + "  y = " + y);

    }
    public static void main(String args[]){
        Integer x = 99;
        Integer y = 66;
        System.out.println("x = " + x + "  y = " + y);
        swap(x, y);
        System.out.println("x = " + x + "  y = " + y);
    }
}