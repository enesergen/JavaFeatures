package java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

// Interface must have only one function
interface Drawable {
    public void draw();
}

interface AddTwoNumber {
    public int add(int a, int b);
}

interface AddThreeNumber {
    public int add(int a, int b, int c);
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        Drawable drawable = () -> {
            System.out.println("Hello this is lambda expression");
        };
        drawable.draw();

        AddTwoNumber addTwoNumber = (a, b) -> (a + b);
        System.out.println(addTwoNumber.add(2, 3));

        AddThreeNumber addThreeNumber = (a, b, c) -> {
            return a + b + c;
        };
        System.out.println(addThreeNumber.add(5, 6, 7));

        List<String> list = List.of("a", "b", "c", "d");
        list.forEach(
                (item) -> System.out.println(item)
        );


        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 is running...");
            }
        };

        Thread t1 = new Thread(r1);
        t1.start();

        Runnable r2 = () -> {
            System.out.println("Thread 2 is running...");
        };
        Thread t2 = new Thread(r2);
        t2.start();

        //Comparator example
        List<Product> list1 = new ArrayList<Product>();

        list1.add(new Product(1, "HP Laptop", 25000f));
        list1.add(new Product(3, "Keyboard", 300f));
        list1.add(new Product(2, "Dell Mouse", 150f));

        Collections.sort(list1,(p1,p2)->{
            return p1.name.compareTo(p2.name);
        });
        for (Product p:list1){
            System.out.println(p.id);
        }



        List<Product> list2=new ArrayList<Product>();
        list2.add(new Product(1,"Samsung A5",17000f));
        list2.add(new Product(3,"Iphone 6S",65000f));
        list2.add(new Product(2,"Sony Xperia",25000f));
        list2.add(new Product(4,"Nokia Lumia",15000f));
        list2.add(new Product(5,"Redmi4 ",26000f));
        list2.add(new Product(6,"Lenevo Vibe",19000f));

        Stream<Product>filtered_data=list2.stream().filter(p->p.price>20000);
        filtered_data.forEach(
                product -> System.out.println(product.name+" "+product.price)
        );

    }
}

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}