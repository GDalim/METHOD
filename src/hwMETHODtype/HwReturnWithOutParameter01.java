package hwMETHODtype;

import javax.print.DocFlavor;

public class HwReturnWithOutParameter01 {

    public int doSummation(){
        int num1 = 25;
        int num2 = 35;
        int total = num1+num2;
        System.out.println("Total: "+total);
        return total;
    }
    public double doSummation2(){
        double num1 = 75;
        double num2 = 15;
        double total = num1+num2;
        System.out.println("Total: "+total);
        return total;
    }
    public int doMultiplication(){
        int num1=55;
        int num2=35;
        int total=num1*num2;
        System.out.println("Total: "+total);
        return total;
    }
    public double doMultiplication2(){
        double num1=85;
        double num2=5;
        double total=num1+num2;
        System.out.println("Total: "+total);
        return total;

    }
    public int doSubtraction(){
        int num1 =25;
        int num2=15;
        int total=num1-num2;
        System.out.println("Total: "+total);
        return total;
    }
    public String getStudentFullName(){
        String fName="Gabriel";
        String lName="Dalim";
        String fullName=fName+" "+lName;
        System.out.println("FullName is "+fullName);
        return fullName;
    }



    public static void main(String[] args) {
        HwReturnWithOutParameter01 object = new HwReturnWithOutParameter01();
        object.doSummation();
        object.doSummation2();
        object.doMultiplication();
        object.doMultiplication2();
        object.doSubtraction();
        object.getStudentFullName();
    }


}
