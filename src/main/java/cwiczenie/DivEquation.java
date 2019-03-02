package cwiczenie;

public class DivEquation implements ICalculable {
    private double liczba1;
    private double liczba2;

    public DivEquation(double liczba1, double liczba2) {
        this.liczba1 = liczba1;
        this.liczba2 = liczba2;
    }

    public double calculate(){
        double dzielenie = liczba1 / liczba2;
        return dzielenie;
    }



}
