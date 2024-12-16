import java.awt.*;

public class textfiel {
    public static void main(String[] args) {
        Frame f = new Frame("Text Field");
        Label l = new Label("Enter Father name",Label.LEFT);
        f.add(l);
        TextField tf = new TextField("papa",1);
        f.add(tf);
        f.setLayout(new FlowLayout());
        f.setSize(300, 300);
        f.setVisible(true);
    }
}
