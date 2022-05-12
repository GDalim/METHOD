package hwMETHODtype;

public class HwNonReturnWithOutParameter {

    public static void main(String[] args) {
        // non-return without parameter

        HwNonReturnWithOutParameter math = new HwNonReturnWithOutParameter();

        math.doSummation();
        math.doSummation2();
        math.doMultiplication();
        math.doDivision();
        math.doDivision2();
        math.doMultiplication2();
        math.doSubtraction();
        math.doSubtraction2();
    }

    public void doSummation() {
        int num1 = 15;
        int num2 = 25;
        int total = num1 + num2;
        System.out.println("Total: "+total);

    }

    public void doSummation2() {
        int num1 = 35;
        int num2 = 45;
        int total = num1 + num2;
        System.out.println("Total: "+total);
    }

    public void doMultiplication() {
        int num1 = 30;
        int num2 = 45;
        int total = num1 * num2;
        System.out.println("Total: "+total);
    }

    public void doMultiplication2() {
        int num1 = 12;
        int num2 = 100;
        int total = num1 * num2;
        System.out.println("Total: "+total);
    }

    public void doSubtraction() {
        int num1 = 9876;
        int num2 = 8765;
        int total = num1 - num2;
        System.out.println("Total: "+total);
    }

    public void doSubtraction2() {
        int num1 = 5555;
        int num2 = 4321;
        int total = num1 - num2;
        System.out.println("Total: "+total);
    }

    public void doDivision(){
        int num1=500;
        int num2=5;
        int total=num1/num2;
        System.out.println("Total: "+total);
    }

    public void doDivision2(){
        int num1=21;
        int num2=3;
        int total =num1/num2;
        System.out.println("Total: "+total);
    }

}
