import java.util.Scanner;

public class Demo {
    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.print("a = ");
        int a = s.nextInt();
        System.out.print("b = ");
        int b = s.nextInt();

        if(a == 0 && b == 0) {
            System.out.println("Phương trình vô nghiệm");
        }
        else{
            System.out.print("x = " + -b/a);
        }
    }
}
