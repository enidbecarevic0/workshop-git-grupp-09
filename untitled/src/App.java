//Simple console calculator
public class App{
    static final String ERR_DIV_ZERO = "Error: division by zero";
    static void start(){
        //Entry point logic



        System.out.println("1) Add\n2) Subtract\n3) Multiply\n 4) Divide\n 0) Hejdå");
        System.out.println("Your Choice: ");
        // note: simple Scanner usage; consider single shared instance/close in real app
        String option = new java.util.Scanner(System.in).nextLine().trim();
        if ("1".equals(choice)) System.out.println("TODO Add");
        System.out.println("A: ");
        double a = Double.parseDouble(new java.util.Scanner(System.in).nextLine());
        System.out.println("B: ");
        double b = Double.parseDouble(new java.util.Scanner(System.in).nextLine());
        System.out.println(Calculator.add(a,b));
        if ("2".equals(option)) System.out.println(Calculator.sub(a,b));
        if ("3".equals(option)) System.out.println(Calculator.mul(a, b));
        if ("4".equals(option) && b == 0) System.out.println("Error: division by zero");
        if ("4".equals(option) && b != 0) System.out.println(ERR_DIV_ZERO);

    }
public static void main(String[] args) {
        start();
}
}