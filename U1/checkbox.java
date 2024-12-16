import java.awt.*;

public class checkbox {
    public static void main(String[] args) {
        Frame f = new Frame("Checkbox");

        Checkbox c = new Checkbox("Checkbox1");
        Checkbox c1 = new Checkbox("Checkbox2");
        Checkbox c2 = new Checkbox("Checkbox3");

        Checkbox c3 = new Checkbox("Checkbox4",true);
        boolean s  =  c3.getState();

        Label l = new Label(""+s);

        f.add(c);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(l);
        f.setSize(300, 300);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
}
