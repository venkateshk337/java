import java.util.*;
public class basic_function{
    public static void printMyName(String name){
        System.out.println(name);
        return;

    }
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        printMyName(name);
        sc.close();
    }
}