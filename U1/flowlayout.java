import java.awt.*;

public class flowlayout {
    public static void main(String[] args) {
        Frame f = new Frame("Flow Layout");

        f.setLayout(new FlowLayout(FlowLayout.LEFT));

        f.setSize(500, 500);
        Checkbox check = new Checkbox("abc");
        Checkbox check2 = new Checkbox("pqr");
        f.add(check2);
        f.add(check);
        f.setVisible(true);
    }
}
