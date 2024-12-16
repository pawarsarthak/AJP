import java.awt.*;

public class gridlayout {
    public static void main(String[] args) {
        GridLayout gl = new GridLayout(3,3);
        Frame f = new Frame("GridLayout");
        f.setLayout(gl);
        f.setSize(900,900);
        f.setVisible(true);
        f.add(new Button("Click Me"));
        f.add(new Label("Give me"));
        f.add(new Button("take me"));
        f.add(new TextArea("abc",2,2));
    }
}