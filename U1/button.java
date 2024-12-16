import java.awt.*;
public class button{
    public static void main(String args[]){
        int i;
        String button_strings[]={"a","b","c"};
        Button bts[]  = new Button[button_strings.length];;

        Frame f = new Frame("Pappa");
        f.setSize(1000,100);
        f.setLayout(null);
        f.setVisible(true);

        for(i=0;i<3;i++)
        {

            bts[i] = new Button(button_strings[i]);
            bts[i].setLabel("pappa"+i);
            bts[i].setBounds(10+(i*100),20,60,50);

            f.add(bts[i]);
        }

    }
}