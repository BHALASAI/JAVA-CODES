package Main.DataStuctures.Generics.GenericMethod;

/**
 * A simple example for Generic Method
 */
public class MethodExample1 {

    <T> void getElement(T input1, T input2){
        System.out.println(input1+""+input2);
    }

    /**
     * Main method to create an object and access getElement method.
     * @param args
     */
    public static void main(String [] args){
        MethodExample1 obj = new MethodExample1();

        obj.getElement(101, 102);

        obj.getElement("Hello", "World");
    }
}
