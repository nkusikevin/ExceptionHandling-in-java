package inhert;

import java.util.InputMismatchException;

public class C implements D {
    @Override
    public void sayGoodBye(String name) throws InputMismatchException{
            System.out.println("Dear" + name + ",thank you for coming");
    }
}
