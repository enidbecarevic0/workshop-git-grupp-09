public class TestCalculator {
    public static void main(String[] args) {
        if(Calculator.add(2, 3) !=5) throw new AssertionError();
        if(Calculator.sub(5, 2) != 3) throw new AssertionError();
    }
}
