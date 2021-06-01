public class GenericMethods {

    public static <T> void genericPrint(T t){
        System.out.println(t);
    }

    public <T> void swap(T x, T y){
        T temp;
        temp = x;
        x = y;
        y = temp;
    }
}
