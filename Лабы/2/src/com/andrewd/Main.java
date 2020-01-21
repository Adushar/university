package com.andrewd;

public class Main {

    public static void main(String[] args) {
        double dollar_in_2020 = DollarCalculator.calculate_dollar_in_2020(-3.45, 2.34, 1.45, 0.83);
        double dollar_in_2021 = DollarCalculator.calculate_dollar_in_2021(0.345, -2.25, 2.65, 3.99);
        double dollar_in_2022 = DollarCalculator.calculate_dollar_in_2022(-2.98, 5.55, 0.045, 0.129);
        System.out.printf(
            "dollar_in_2020: %s \ndollar_in_2021: %s \ndollar_in_2022: %s\n",
            dollar_in_2020, dollar_in_2021, dollar_in_2022
        );

        if ( dollar_in_2020==24.599 && dollar_in_2021 == 6.391 && dollar_in_2022 == -0.445 ) {
            System.out.println("Bukasov.put_5_to_andrewd()");
        } else {
            System.out.println(dollar_in_2021);
        }
    }
}
