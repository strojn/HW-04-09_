public class Printer {
    private String ANSI_RESET = "\u001B[0m";
    void print(String value) {
        System.out.println(ANSI_RESET + value);
    }
}
class Painter extends Printer{
    private String ANSI_YELLOW = "\u001B[33m";
    void print(String value) {
        System.out.println(ANSI_YELLOW + value);
    }
}