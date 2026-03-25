public class App{
    static void run(){


        System.out.println("1) Add\n2) Subtract\n3) Multiply\n 4) Divide\n 0) Exit");
        System.out.println("Your Choice: ");
        String choice = new java.util.Scanner(System.in).nextLine();
        if ("1".equals(choice)) System.out.println("TODO Add");
        double a = Double.parseDouble(new java.util.Scanner(System.in).nextLine());
        double b = Double.parseDouble(new java.util.Scanner(System.in).nextLine());
    }

}