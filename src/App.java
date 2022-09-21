import TT4.Window;

public class App {
    public static void main(String[] args) throws Exception {
        Window window = new Window("Tablas", 300,300);
        Controller controller = new Controller(window);
        controller.start();
    }
}
