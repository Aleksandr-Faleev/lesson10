import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                // Ввод данных для круга
                System.out.print(Math.PI * Math.pow(12,1));
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);

                // Ввод данных для прямоугольника
                System.out.print(32);
                double length = scanner.nextDouble();
                System.out.print(70);
                double width = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(length, width);

                // Ввод данных для треугольника
                double sideA = scanner.nextDouble();
                System.out.print(sideA);
                double sideB = scanner.nextDouble();
                System.out.print(sideB);
                double sideC = scanner.nextDouble();
                System.out.print(sideC);
                Triangle triangle = new Triangle(sideA, sideB, sideC);

                // Вывод результатов
                System.out.println("\nРезультаты:");
                System.out.println("Круг:");
                System.out.printf("Площадь: %.2f\n", circle.area());
                System.out.printf("Периметр: %.2f\n", circle.perimeter());

                System.out.println("\nПрямоугольник:");
                System.out.printf("Площадь: %.2f\n", rectangle.area());
                System.out.printf("Периметр: %.2f\n", rectangle.perimeter());

                System.out.println("\nТреугольник:");
                System.out.printf("Площадь: %.2f\n", triangle.area());
                System.out.printf("Периметр: %.2f\n", triangle.perimeter());

                scanner.close();
            }
        }