package privateInterface;

public class Main implements PrivateInterface{

    public static void main(String[] args) {
        PrivateInterface pI=new Main();
        pI.hello();
    }


}
