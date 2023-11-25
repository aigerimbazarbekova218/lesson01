import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int b=(int) Math.sqrt(a);

        if(Math.pow(b,2)==a){
            System.out.println(b);
        }else {
            throw new Error("Error");
        }
        try {
            System.out.println(5/0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}