//Simple console calculator
public class App{
    static void start(){
        //Entry point logic



        System.out.println("1) Add\n2) Subtract\n3) Multiply\n 4) Divide\n 0) Exit program");
        System.out.println("Your Choice: ");
        String option = new java.util.Scanner(System.in).nextLine();
        if ("1".equals(choice)) System.out.println("TODO Add");
        System.out.println("A: ");
        double a = Double.parseDouble(new java.util.Scanner(System.in).nextLine());
        System.out.println("B: ");
        double b = Double.parseDouble(new java.util.Scanner(System.in).nextLine());
        System.out.println(Calculator.add(a,b));
        if ("2".equals(option)) System.out.println(Calculator.sub(a,b));
        if ("3".equals(option)) System.out.println(Calculator.mul(a, b));
        if ("4".equals(option) && b == 0) System.out.println("Error: division by zero");
        if ("4".equals(choice) && b != 0) System.out.println(Calculator.div(a, b));
    }
public static void main(String[] args) {
        start();
}
}