package cwiczenie;

public class DivEquation implements ICalculable {
    private double a = 10;
    private double b = 3;
    private double dzielenie;
    public double calculate(){
        dzielenie = a / b;
        return dzielenie;
    }



}
