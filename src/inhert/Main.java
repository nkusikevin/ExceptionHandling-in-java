package inhert;

import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String  name = "Tresor";
        B b = new B();
        C c = new C();
        try {
            float temp = b.getCeli(90);
            System.out.println("Temperature =" + temp);
            c.sayGoodBye(name);
        }catch (ArithmeticException e){
            System.out.println("Exception : " +e);
        }
        catch (InputMismatchException e){
            System.out.println("Only String Names Allowed");
        }
    }
}
