package cwiczenie;

public class DivEquation implements ICalculable {
    private double liczba1;
    private double liczba2;
    private double dzielenie;
    public double calculate(){
        dzielenie = liczba1 / liczba2;
        return dzielenie;
    }



}
