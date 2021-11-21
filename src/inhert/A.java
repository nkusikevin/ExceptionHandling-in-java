package inhert;

public class A extends B{
public  String name;

public  void userInfo(float temp ,String name){
    float te = getCeli(temp);
    System.out.println("user Name:" + name);
    System.out.println("user Temperature" + te);
}

}
