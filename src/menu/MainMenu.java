package menu;

public abstract class MainMenu {
    private int option;

    public abstract void displayMenu();

    public int getOption() {
        return option;
    }
    public void setOption(int option) {
        this.option = option;
    }   
}
