package Exercise_3_1;

public class Calculation {
    public static void main(String[] args) {
        int a =10;
        int b = 3;
        a +=b;
        System.out.println(a + " " + b);
        b+=a;
        System.out.println(a + " " + b);
        b++;
        System.out.println(a + " " + b);
        ++a;
        System.out.println(a + " " + b);
        b--;
        System.out.println(a + " " + b);
        System.out.println(a++);
        System.out.println(b++ + a++);
        System.out.println();
    }
}
