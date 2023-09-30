//Створіть проект з класом Main.java.
//
//        Потрібно: Створити клас Printer.
//        У тілі класу створіть метод void print(String value), який виводить на екран значення аргументу.
//        Реалізуйте можливість того, щоб у разі успадкування від даного класу інших класів,
//        та виклику відповідного методу їх екземпляра, рядки, передані як аргументи методів, виводилися різними кольорами.
//        Обовʼязково використовуйте приведення типів (Upcast / Downcast Explicitly).
public class Main {
    public static void main(String[] args) {

        // Upcasting
        Painter painter = new Painter();
        painter.print("painter");
        Printer painterUpcasting = (Printer) painter;
        painterUpcasting.print("(Printer) painter");

        // Downcasting
        Printer printer = new Printer();
        printer.print("printer");
//        Painter printerDowncasting = (Painter) printer;// it gives compile-time error
//        printerDowncasting.print("(Painter) printer");
        Painter printerDown = (Painter) painterUpcasting;
        printerDown.print("(Painter) \"printer\"");
    }
}