import java.util.InputMismatchException;
import java.util.Scanner;

class lec_13 {
    
    int n1 , n2, result;
    Scanner sc = new Scanner(System.in);

    void calculator(){
        try{

            System.out.println("enter first Number ");
            n1=sc.nextInt();

            System.out.println("Enter Second Number");
            n2= sc.nextInt();

            result = n1/n2;
        }
        catch(ArithmeticException ae){
            System.out.println(ae);
        }
        catch(InputMismatchException ime){
            System.out.println(ime);
        }
        catch(Exception e){

            System.out.println("Exception Dectected"+ e.getMessage());
            e.printStackTrace();
        }finally{
        System.out.println("the Divison is " + result);
    }
}
    public static void main(String[] args) {
        lec_13 obj = new lec_13();
        obj.calculator();
    }
}
