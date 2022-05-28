import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try( Car car=new Car()) {
            throw  new Exception();
        }catch (Exception e){

            Car.drive();
        }
    }
}