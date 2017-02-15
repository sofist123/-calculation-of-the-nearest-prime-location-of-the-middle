import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Найти простое число в интервале от M до N, которое расположено ближе всего к центру данного интервала чисел (M - N)");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Пользователь,введи значение равное началу диапазона (число M)");
        int bordere1 = scanner.nextInt(); // bordere1-начало границы диапазона
        System.out.println("Пользователь,введи значение равное концу диапазона (число N)");
        int bordere2 = scanner.nextInt(); // bordere-окончание границы диапазона
        int numberOfStart = ((bordere2 - bordere1) / 2) + bordere1; // numberOfStart-диапазон чисел
        System.out.println("При заданых границах интервала от " + bordere1 + " до " + bordere2 + ", середина данного интервала равна " + numberOfStart);

        int midRange = numberOfStart;                       //midRange-от какого числа начинаем искать простые числа
        int count = 1;                            //количество найденых простых чисел
        int[] massiv = new int[count];


        int n = 0;
        while (n < count) {
            boolean flag = true;
            for (int j = 2; j < midRange; j++) {
                if (midRange % j == 0) {
                    flag = false;
                }
            }
            if (flag)
                massiv[n++] = midRange;
            midRange++;
        }
        System.out.println();
        System.out.println(Arrays.toString(massiv) + " - - простое число, расположеное справа от середины интервала с задаными значениями интервала " + bordere1 + " и " + bordere2);

        int[] massiv2 = new int[count];
        n = 0;
        midRange = numberOfStart;
        while (n < count) {
            boolean flag = true;
            for (int j = 2; j < midRange; j++) {
                if (midRange % j == 0) {
                    flag = false;
                }
            }
            if (flag)
                massiv2[n++] = midRange;
            midRange--;
        }
        System.out.println();
        System.out.println(Arrays.toString(massiv2) + " - простое число, расположеное слева от середины интервала с задаными значениями интервала " + bordere1 + " и " + bordere2);
        System.out.println();

        midRange = numberOfStart;
        if (massiv[0] - midRange < midRange - massiv2[0])
            System.out.println("Простое число в интервале от M = " + bordere1 + " до N = " + bordere2 + ", которое расположено ближе всего к центру данного интервала соответствует простому числу " + massiv[0]);
        if (massiv[0] - midRange > midRange - massiv2[0])
            System.out.println("Простое число в интервале от M = " + bordere1 + " до N = " + bordere2 + ", которое расположено ближе всего к центру данного интервала соответствует простому числу " + massiv2[0]);
        if (massiv[0] - midRange == midRange - massiv2[0] && massiv[0] == massiv2[0])
            System.out.println("Простое число в интервале от M = " + bordere1 + " до N = " + bordere2 + ", которое расположены ближе всего к центру данного интервала соответствует простому числу " + massiv2[0]);
        if (massiv[0] - midRange == midRange - massiv2[0] && massiv[0] != massiv2[0])
            System.out.println("Простые числа в интервале от M = " + bordere1 + " до N = " + bordere2 + ", которое расположены ближе всего к центру данного интервала соответствуют простым числам " + massiv2[0] + " и " + massiv[0]);

    }
}

