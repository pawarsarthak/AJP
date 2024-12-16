import java.awt.*;

public class radiobuttonawt {
    public static void main(String[] args) {
        CheckboxGroup cbg = new CheckboxGroup();

        Checkbox ch1 = new Checkbox("ch1",cbg,true);
        Checkbox ch2 = new Checkbox("ch2",cbg,false);

        Frame f = new Frame("Radio Button");
        f.setLayout(new FlowLayout());
        f.add(ch1);
        f.add(ch2);
        f.setSize(300, 300);
        f.setVisible(true);

    }
}
