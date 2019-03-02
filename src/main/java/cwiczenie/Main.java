package cwiczenie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartosc 1:");
        double liczba1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Podaj wartosc 2:");
        double liczba2 = Double.parseDouble(scanner.nextLine());

        System.out.println("wybierz co chcesz zrobic: add/sub/div/mul ");
        String zdanie = scanner.nextLine();
        switch (zdanie) {
            case "add":
                return;
            case "sub":
                return;
            case "div":
                return;
            case "mul":
                return;
        }





    }

}
