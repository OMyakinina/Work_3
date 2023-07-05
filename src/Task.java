/*Пусть дан произвольный список целых чисел.

    1) Нужно удалить из него чётные числа
    2) Найти минимальное значение
    3) Найти максимальное значение
    4) Найти среднее значение*/

import java.util.ArrayList;
import java.util.List;

public class Task {
    public static void mainList (){
    List<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(7);
    numbers.add(2);
    numbers.add(9);
    numbers.add(4);
    numbers.add(5);

    removeEvenNumbers(numbers);

    int min = findMin(numbers);
    int max = findMax(numbers);
    double middle = findMiddle(numbers);

    System.out.println("Список после удаления: " + numbers);
    System.out.println("Минимальное значение: " + min);
    System.out.println("Максимальное значение: " + max);
    System.out.println("Среднее значение: " + middle);

    }

    public static void removeEvenNumbers(List<Integer> numbers) {
        numbers.removeIf(number -> number % 2 == 0);
    }

    public static int findMin(List<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int findMax(List<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static double findMiddle(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.size();
    }
}