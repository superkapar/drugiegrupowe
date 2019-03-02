package cwiczenie;

public class SubstractEquation implements ICalculable{
    private double liczba1;
    private double liczba2;
    private double odejmowanie;

    public double calculate(){
        odejmowanie = liczba1 - liczba2;
        return odejmowanie;
    }
}
