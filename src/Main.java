
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hi Jonas");
    }

    public int age(){
        System.out.println("How old are you?");
        Scanner sc = new Scanner (System.in);
        int age = sc.nextInt();
        return age;
    }
}