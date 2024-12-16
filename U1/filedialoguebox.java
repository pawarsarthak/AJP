import java.awt.*;

public class filedialoguebox {
    public static void main(String[] args) {
        Frame f = new Frame("File dialogue");
        FileDialog fd = new FileDialog(f, "click here to open/save", FileDialog.SAVE);
        fd.setDirectory("C:\\Users\\Admin\\Downloads");
        fd.setFile("C:\\Users\\Admin\\Downloads\\orange.png");
        fd.setVisible(true);
        f.add(new Label(fd.getDirectory()+fd.getFile()+"    \nmode:"+fd.getMode()));
        f.setLayout(new FlowLayout());
        f.setSize(900,300);
        f.setVisible(true);

    }
}
