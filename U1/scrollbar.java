import java.awt.*;

public class scrollbar {
    public static void main(String[] args) {
        Frame frame = new Frame("Scrollbar");

        Scrollbar scrollbar = new Scrollbar(Scrollbar.VERTICAL);
        Scrollbar scrollbar2 = new Scrollbar(Scrollbar.HORIZONTAL);

        frame.setLayout(new FlowLayout());
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.add(scrollbar);

    }
}
