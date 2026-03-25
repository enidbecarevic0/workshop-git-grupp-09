public class App{
    static void run(){


        System.out.println("1) Add\n2) Subtract\n3) Multiply\n0) Exit");
        System.out.println("Your Choice: ");
        String choice = new java.util.Scanner(System.in).nextLine();
        if ("1".equals(choice)) System.out.println(Calculator.add(0,0));
        
    }

}