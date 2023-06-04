package HW4;

public class Triangle {
    public static void main(String[] args) {
        System.out.println("Площадь треугольника = " + square(5, 7, 4));
    }
    private static ArithmeticException myException1 = new ArithmeticException("Некорректная длина стороны треугольника!");
    private static ArithmeticException myException2 = new ArithmeticException("Такого треугольника не существует!");
    public static double square(int a, int b, int c) throws ArithmeticException, NullPointerException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw myException1;
        } if ((a + b) <= c || (b + c) <= a || (c + a) <= b) {
            throw myException2;
        }
        double Perimeter = (double) (a + b + c) / 2;
        return Math.sqrt(Perimeter * (Perimeter - a) * (Perimeter - b) * (Perimeter - c));
    }
}
