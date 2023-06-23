package AnonymousClass;

abstract class ABCD<T> {
    abstract T show(T a, T b);
}

public class AnonymousInnerClassExample {
    public static void main(String[] args) {
        ABCD<String> a = new ABCD<String>() {
            String show(String a, String b) {
                return a + b;
            }
        };
        String result=a.show("Java","9 Feature");
        System.out.println(result);
    }
}
