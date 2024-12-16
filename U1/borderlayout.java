import java.awt.*;

public class borderlayout {
    public static void main(String[] args) {
        Frame f = new Frame("Border Layout");
        f.setLayout(new BorderLayout());
        f.add(new Label("indutv"),BorderLayout.WEST);
        f.add(new Label("bandutv"),BorderLayout.EAST);
        f.add(new Button("indutv"),BorderLayout.CENTER);
        f.add(new TextArea("hello world\nindia",20,10),BorderLayout.SOUTH);
        f.add(new Scrollbar(Scrollbar.VERTICAL),BorderLayout.NORTH);
        f.setSize(1200, 1200);
        f.setVisible(true);
    }
//    public Insets getInsets() {
//        return new Insets(100, 100,  100, 100);
//    }
}
