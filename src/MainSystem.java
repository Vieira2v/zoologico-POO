import menu.main.FirstMenu;

public class MainSystem {
    public static void main(String[] args) {
        FirstMenu menu = new FirstMenu();

        while (menu.getOption() != 0) {
            menu.displayMenu();
            menu.processExecution();
        }
    }
}
