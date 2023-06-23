package tryWithResources;

import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        try(FileOutputStream fileOutputStream=new FileOutputStream("C:\\JavaProjects\\JavaFeatures\\src\\demo.txt");){
            String greeting="Welcome to Java";
            byte b[]=greeting.getBytes();
            fileOutputStream.write(b);
            System.out.println("File written");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
