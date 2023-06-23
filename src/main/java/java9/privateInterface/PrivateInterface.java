package privateInterface;

public interface PrivateInterface {
    default void hello() {
        sayHelloWithSomething();
        sayHelloStatic();
    }
    private void sayHelloWithSomething(){
        System.out.println("Hello I am private method...");
    }
    private static void sayHelloStatic(){
        System.out.println("Hello I am static private method");
    }

}

