package hwMETHODtype;

public class HwReturnWithParameter01 {

    public int doSummation(int num1,int num2){
        int total=num1+num2;
        System.out.println("Total: "+total);
        return total;
    }
    public double doSummation2(double num1,double num2){
        double total=num1+num2;
        System.out.println("Total: "+total);
        return total;
    }
    public int doSubtraction(int num1,int num2){
        int total=num1-num2;
        System.out.println("Total: "+total);
        return total;
    }
    public double doSubtraction2(double num1,double num2){
        double total=num1-num2;
        System.out.println("Total: "+total);
        return total;
    }
    public int doMultiplication(int num1,int num2){
        int total=num1*num2;
        System.out.println("Total: "+total);
        return total;
    }
    public String getInstructorName(String fName,String lName){
        String fullName=fName+" "+lName;
        System.out.println("FullName: "+fullName);
        return fullName;
    }



    public static void main(String[] args) {
        HwReturnWithParameter01 math = new HwReturnWithParameter01();
        math.doMultiplication(12,5);
        math.doSubtraction(36,8);
        math.doSubtraction2(78,59);
        math.doSummation(85,36);
        math.doSummation2(39,84);
        math.getInstructorName("Gabriel","Dalim");

    }
}
