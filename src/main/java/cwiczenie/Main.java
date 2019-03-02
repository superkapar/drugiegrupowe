package cwiczenie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartosc 1:");
        double liczba1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Podaj wartosc 2:");
        double liczba2 = Double.parseDouble(scanner.nextLine());

        System.out.println("wybierz co chcesz zrobic: sum/sub/div/mul ");
        String zdanie = scanner.nextLine();

        switch (zdanie) {

            case "sum":
                SumEquation sumEquation = new SumEquation(liczba1, liczba2);
                System.out.println(sumEquation.calculate());
                break;

            case "sub":
                SubstractEquation substractEquation = new SubstractEquation(liczba1, liczba2);
                System.out.println(substractEquation.calculate());
                break;
            case "div":
                DivEquation divEquation = new DivEquation(liczba1, liczba2);
                System.out.println(divEquation.calculate());
                break;
            case "mul":
                MulEquation mulEquation = new MulEquation(liczba1, liczba2);
                System.out.println(mulEquation.calculate());
                break;
            case "pow":
                PowEquation powEquation = new PowEquation(liczba1, liczba2);
                System.out.println(powEquation.calculate());
                break;

        }




    }

}
