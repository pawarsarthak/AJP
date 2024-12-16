import java.awt.*;

public class list {
    public static void main(String[] args) {

        List lst = new List(3,true);

        lst.add("abc");
        lst.add("sss");

        Frame f = new Frame("list");
        f.setLayout(new FlowLayout());
        f.add(lst);
        f.setSize(300, 300);
        f.setVisible(true);
    }
}
