import java.util.Scanner;

public class Klasy1i2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        loop:
        while (true) {
            System.out.print("Pole której figury chcesz obliczyć? (prostokąt / koło / trójkąt): ");
            String figure = scan.nextLine();
            switch (figure) {
                case "prostokąt":
                    System.out.print("\nPodaj długość pierwszego boku: ");
                    double a = scan.nextInt();
                    System.out.print("Podaj długość drugiego boku: ");
                    double b = scan.nextInt();
                    Rectangle rectangle = new Rectangle(a, b);
                    System.out.println("Pole powierzchni prostokąta: " + rectangle.getArea());
                    System.out.println("Obwód prostokąta: " + rectangle.getPerimeter());
                    break loop;
                case "koło":
                    System.out.print("\nPodaj promień koła: ");
                    double r = scan.nextInt();
                    Circle circle = new Circle(r);
                    System.out.println("Pole koła wynosi: " + circle.getArea());
                    System.out.println("Obwód koła wynosi: " + circle.getPerimeter());
                    break loop;
                case "trójkąt":
                    for (int i = 0; i < 1; i++) {
                        System.out.print("\nPodaj długość pierwszego boku: ");
                        a = scan.nextInt();
                        System.out.print("Podaj długość drugiego boku: ");
                        b = scan.nextInt();
                        System.out.print("Podaj długość trzeciego boku: ");
                        double c = scan.nextInt();
                        Triangle triangle = new Triangle(a, b, c);
                        if (Math.abs(b - c) < a && a < b + c) {
                            System.out.println("Pole trójkąta wynosi: " + triangle.getArea());
                            System.out.println("Obwód trójkąta wynosi: " + triangle.getPerimeter());
                        } else {
                            System.out.println("\nTrójkąt o podanych bokach nie istnieje. Spróbuj ponownie:\n");
                            i--;
                        }
                    }
                    break loop;
                default:
                    System.out.println("\nPodałeś złą nazwę figury. Spróbuj ponownie:\n");
                    break;
            }
        }
    }
}

class Rectangle {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    double getPerimeter() {
        return a + b + c;
    }
}
