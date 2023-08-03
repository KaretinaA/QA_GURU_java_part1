package guru.qa;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        String name1 = "Anna";
        String name2 = "Anna";
        if (name1.equals(name2)) {
            System.out.println("Равны");
        } else {
            System.out.println("Не равны");
        }
        int number5 = 11;
        int number6 = 12;
        if ((number5 == number6) && (name1.equals(name2))) {
            System.out.println("Числа и строки равны");
        }
        else {
            System.out.println("Условие не выполнено");
        }
    }
}