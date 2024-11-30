package Main.DataStuctures.Generics.GenericMethod;

public class MethodExample3<A, B> {
    public void getObject(A input1, B input2){
        System.out.println(input1+" "+input2);
        System.out.println(input1+" - "+input1.getClass().getSimpleName());
        System.out.println(input2+" - "+input2.getClass().getSimpleName());
    }

    public static void main(String ...args){
        MethodExample3<String, Integer> obj= new MethodExample3<>();

        obj.getObject("101",102);
    }
}
