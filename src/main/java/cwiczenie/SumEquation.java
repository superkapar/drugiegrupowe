package cwiczenie;

public class SumEquation implements ICalculable {
    private double liczba1;
    private double liczba2;
    private double suma;

    public double calculate(){
        suma = liczba1 + liczba2;
        return suma;
    }

}
