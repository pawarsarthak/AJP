import java.awt.*;

public class cardlayout {
    public static void main(String[] args) {
        Frame frame = new Frame("CardLayout Example");
        CardLayout cardLayout = new CardLayout();
        frame.setLayout(cardLayout);

        Panel panel1 = new Panel();
        panel1.add(new Button("Card 1"));

        Panel panel2 = new Panel();
        panel2.add(new Button("Card 2"));

        frame.add("Card 1", panel1);
        frame.add("Card 2", panel2);

        frame.setSize(300, 200);
        frame.setVisible(true);

        cardLayout.show(frame, "Card 1");
        // actionlistener neededs
        cardLayout.show(frame, "Card 2");
    }
}
