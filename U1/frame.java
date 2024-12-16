import java.awt.*;
class frame{
    public static void main(String args[]){

        Frame f0 = new Frame();
        Frame f = new Frame("appa");

        f.setSize(250,500);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
}