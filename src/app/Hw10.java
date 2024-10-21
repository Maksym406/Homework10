package app;

public class Hw10 {
    public static void printSquare(int number) {
        int square = number * number;
        System.out.println("Квадрат числа " + number + " = " + square);
    }
    public static double calculateCylinderVolume(double radius, double height) {
        double volume = Math.PI * radius * radius * height;
        return volume;
    }
    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
    public static String reverseString(String text) {
        StringBuilder reversed = new StringBuilder(text);
        return reversed.reverse().toString();
    }
    public static int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
    public static void printTextMultipleTimes(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        printSquare(5);
        double radius = 3.0;
        double height = 7.0;
        double volume = calculateCylinderVolume(radius, height);
        System.out.println("Об'єм циліндра: " + volume);

        int[] numbers = {1, 2, 3, 4, 5};
        int sum = sumArray(numbers);
        System.out.println("Сума елементів масиву: " + sum);

        String original = "Hello World";
        String reversed = reverseString(original);
        System.out.println("Перевернутий рядок: " + reversed);

        int base = 2;
        int exponent = 3;
        int powerResult = power(base, exponent);
        System.out.println("Результат піднесення " + base + " до степеня " + exponent + " = " + powerResult);

        int n = 3;
        String text = "Hello";
        printTextMultipleTimes(n, text);
    }
}

