package DataStuctures.Generics.GenericMethod;

public class MethodExample2<A> {
    public void getObject(A input1, A input2){
        System.out.println(input1+" "+input2);
    }

    public static void main(String ...args){
        MethodExample2<String> obj= new MethodExample2<>();

        obj.getObject("101","102");
    }
}
