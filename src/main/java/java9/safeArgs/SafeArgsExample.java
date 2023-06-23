package safeArgs;

import java.util.ArrayList;
import java.util.List;

public class SafeArgsExample {
    @SafeVarargs
    private void display(List<String>...products){
        for(List<String>product:products){
            System.out.println(product);
        }
    }


    public static void main(String[] args) {
        List<String>product=new ArrayList<>(List.of("apple","lemon"));
        SafeArgsExample safeVarargs=new SafeArgsExample();
        safeVarargs.display(product);
    }
}
