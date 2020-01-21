package com.andrewd;

public class DollarCalculator {
    public static double calculate_dollar_in_2020(double a, double b, double c, double d) {
        double left_block = 4 * Math.cosh(
            Math.sqrt( Math.abs(a/b) )
        );
        double right_block = 3 * Math.acos(d);

        double result = Math.pow( (left_block+right_block), c );
        return round(result);
    }

    public static double calculate_dollar_in_2021(double a, double b, double c, double d) {
        double left_block = (5*a)/Math.sin(a);
        double right_block = Math.sqrt(
            Math.tanh( Math.abs(b)*c ) / Math.log10(d)
        );
        return round(left_block+right_block);
    }

    public static double calculate_dollar_in_2022(double a, double b, double c, double d) {
        double upper_block = Math.sin( Math.abs(a) ) + Math.cos( Math.sqrt(b) );
        double lower_block = 2*Math.tan(c) + Math.pow(Math.E, d);

        return round(upper_block/lower_block);
    }

    private static double round(double x) {
        return (double) Math.round(x * 1000) / 1000;
    }
}
