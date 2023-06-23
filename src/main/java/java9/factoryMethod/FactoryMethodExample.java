package factoryMethod;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethodExample {
    public static void main(String[] args) {
        //these are immutable
        List<String> a=List.of("a","b","c");

        Set<String> b=Set.of("d","e","f");

        Map<String,String>c=Map.of("k1","v1","k2","v2");

    }
}
