//Simple console calculator
public class App{
    static final String ERR_DIV_ZERO = "Error: division by zero";
    static void start(){
        //Entry point logic



        System.out.println("1) Add\n2) Subtract\n3) Multiply\n 4) Divide\n 0) Hejdå");
        System.out.println("Your Choice: ");
        String option = new java.util.Scanner(System.in).nextLine();
        if ("1".equals(option)) System.out.println("TODO Add");
        double a = Double.parseDouble(new java.util.Scanner(System.in).nextLine());
        System.out.println("B: ");
        double b = Double.parseDouble(new java.util.Scanner(System.in).nextLine());
        System.out.println(Calculator.add(a,b));
        if ("2".equals(option)) System.out.println(Calculator.sub(a,b));
        if ("3".equals(option)) System.out.println(Calculator.mul(a, b));
        if ("4".equals(option) && b == 0) System.out.println("Error: division by zero");
        if ("4".equals(option) && b != 0) System.out.println(Calculator.div(a, b));
        else System.out.println("Unknown option");
    }
public static void main(String[] args) {
        start();
}
}