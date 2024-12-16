import java.awt.*;

public class menu {
    public static void main(String[] args) {
        MenuBar menuBar = new MenuBar();

        Menu file = new Menu("File");
        MenuItem save = new MenuItem("Save");

        file.add(save);
        menuBar.add(file);

        Menu saveas = new Menu("Save As");
        MenuItem txt = new MenuItem(".txt");
        MenuItem java = new MenuItem(".java");

        saveas.add(txt);
        saveas.add(java);
        file.add(saveas);

        Frame frame = new Frame("Menu");

        frame.setMenuBar(menuBar);

        frame.setSize(500, 500);
        frame.setVisible(true);

    }
}
