package com.andrewd;

import com.andrewd.tasks.Task1;
import com.andrewd.tasks.Task2;
import com.andrewd.tasks.Task3;

public class TaskPrinter {

    public static void print_all_tasks() {
        print_results_of_first_task();
        print_results_of_second_task();
        print_results_of_third_task();
    }

    public static void print_results_of_first_task() {
        System.out.println("\nTask 1:");
        System.out.println( Task1.calculate_sum_of_the_row(5,1 ) );

        try { Task1.calculate_sum_of_the_row(15,1000 ); }
        catch (IllegalArgumentException e) { System.out.println(e); }

        try { Task1.calculate_sum_of_the_row(-1,-3 ); }
        catch(IllegalArgumentException e) { System.out.println(e); }
    }

    public static void print_results_of_second_task() {
        System.out.println("\nTask 2:");

        System.out.println( Task2.calculate_function_value(5,1, 4) ); // 1.7888543819998317108
        System.out.println( Task2.calculate_function_value(2,3, 7) ); // 10.5


        try { Task2.calculate_function_value(-5,1, 2); }
        catch (IllegalArgumentException e) { System.out.println(e); }

        try { Task2.calculate_function_value(5,0, 4); }
        catch(IllegalArgumentException e) { System.out.println(e); }
    }

    public static void print_results_of_third_task() {
        System.out.println("\nTask 3:");

        System.out.println( Task3.calculate_sum_of_row( 0.003 ) ); // 0.3666666666666667
        System.out.println( Task3.calculate_sum_of_row( 1 ) ); // 0


        try { Task3.calculate_sum_of_row( -0.003 ); }
        catch (IllegalArgumentException e) { System.out.println(e); }
    }
}
