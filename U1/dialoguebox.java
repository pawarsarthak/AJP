import java.awt.*;

public class dialoguebox {
    public static void main(String[] args) {
        Frame frame = new Frame("dialoguebox");
        Dialog  d = new Dialog(frame,"dialogue title",true);
        d.setSize(100,100);
        d.setLayout(new BorderLayout());
        d.add(new Button("nikal lwde"),BorderLayout.CENTER);
        d.setVisible(true);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
