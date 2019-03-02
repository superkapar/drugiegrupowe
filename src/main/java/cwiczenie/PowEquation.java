package cwiczenie;

public class PowEquation implements ICalculable {
    private double liczba1;
    private double liczba2;

    public PowEquation(double liczba1, double liczba2) {
        this.liczba1 = liczba1;
        this.liczba2 = liczba2;
    }

    public double calculate(){
        double potega = Math.pow(liczba1, liczba2);
        return potega;
    }

}

