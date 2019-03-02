package cwiczenie;

public class SubstractEquation implements ICalculable{
    private double liczba1;
    private double liczba2;

    public double calculate(){
        double odejmowanie = liczba1 - liczba2;
        return odejmowanie;

    }
}
