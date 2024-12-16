import java.awt.*;

public class textarea {
    public static void main(String[] args) {
        Label l = new Label("enter: ");
        l.setText("Enter bdvya:");
        l.setAlignment(Label.LEFT);
        TextArea ta = new TextArea(2,20);
        Frame f = new Frame("Text Area");
        f.add(l);
        f.add(ta);
        f.setSize(300,300);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
}
