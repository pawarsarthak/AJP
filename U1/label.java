import java.awt.*;
public class label extends Frame {
    public static void main(String[] args) {
        String s = "Hello world";

        Label l = new Label(s);
        Label l1 = new Label("Guligat", Label.RIGHT);

        l1.setBounds(100,1,10,10);
        l1.setSize(199,199);

        Frame f = new Frame();
        f.add(l);
        f.add(l1);
        f.setLayout(new FlowLayout());
        f.setSize(250 ,250);
        f.setVisible(true);
    }
}
