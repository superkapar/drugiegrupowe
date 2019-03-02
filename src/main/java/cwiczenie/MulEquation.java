package cwiczenie;

public class MulEquation {

    private double liczba1;
    private double liczba2;


    public MulEquation(double liczba1, double liczba2) {
        this.liczba1 = liczba1;
        this.liczba2 = liczba2;
    }


    public double calculate(){
        double mnozenie = liczba1 * liczba2;
        return mnozenie;
    }
}
