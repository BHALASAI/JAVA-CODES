package Main.DataStuctures.Generics.GenericMethod;

public class SpecialGenericMethodExample4 {


    static class GenericsType<T> {

        private T t;

        public T get() {
            return this.t;
        }

        public void set(T t1) {
            this.t = t1;
        }

        public static void main(String args[]) {
            GenericsType<String> type = new GenericsType<>();
            type.set("Pankaj"); //valid

            GenericsType type1 = new GenericsType(); //raw type
            type1.set("Pankaj"); //valid
            type1.set(10); //valid and autoboxing support

            System.out.println(type1.get());
        }
    }

    static class GenericsMethods {

        //Java Generic Method
        public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2) {
            return g1.get().equals(g2.get());
        }

        public static void main(String args[]) {
            GenericsType<String> g1 = new GenericsType<>();
            g1.set("Pankaj");

            GenericsType<String> g2 = new GenericsType<>();
            g2.set("Pankaj");

            boolean isEqual = GenericsMethods.<String>isEqual(g1, g2);
            //above statement can be written simply as
//            isEqual = GenericsMethods.isEqual(g1, g2);
            //This feature, known as type inference, allows you to invoke a generic method as an ordinary method, without specifying a type between angle brackets.
            //Compiler will infer the type that is needed

            System.out.println(isEqual);
        }
    }

}