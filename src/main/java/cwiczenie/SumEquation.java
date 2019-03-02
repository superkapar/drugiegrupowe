package cwiczenie;

public class SumEquation implements ICalculable {
    private double liczba1;
    private double liczba2;

    public double calculate(){
        double suma = liczba1 + liczba2;
        return suma;
    }

}
