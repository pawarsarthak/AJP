import java.awt.*;

public class gridbaglayout {
    public static void main(String[] args) {
        // Create a new Frame for the layout
        Frame frame = new Frame("GridBagLayout Example");

        // Set the layout of the frame to GridBagLayout
        frame.setLayout(new GridBagLayout());

        // Create GridBagConstraints object to control layout behavior
        GridBagConstraints gbc = new GridBagConstraints();

        // Create Button 1 and add it to the frame
        Button button1 = new Button("Button 1");
        gbc.gridx = 0; // Column position
        gbc.gridy = 0; // Row position
        gbc.gridwidth = 1; // Button spans 1 column
        gbc.gridheight = 1; // Button spans 1 row
        gbc.ipadx = 50; // Extra padding inside the button along the X-axis
        gbc.fill = GridBagConstraints.VERTICAL;// Button expands horizontally
        frame.add(button1, gbc);

        // Create Button 2 and add it to the frame
        Button button2 = new Button("Button 2");
        gbc.gridx = 1; // Column position
        gbc.gridy = 0; // Row position
        gbc.gridwidth = 2; // Button spans 2 columns (takes up more space)
        gbc.gridheight =1; // Button spans 1 row
        gbc.ipadx = 20; // Extra padding inside the button along the X-axis
        frame.add(button2, gbc);

        // Create Button 3 and add it to the frame
        Button button3 = new Button("Button 3");
        gbc.gridx = 0; // Column position
        gbc.gridy = 1; // Row position
        gbc.gridwidth = 1; // Button spans 1 column
        gbc.gridheight = 1; // Button spans 1 row
        gbc.ipadx = 10; // Extra padding inside the button along the X-axis
        frame.add(button3, gbc);

        // Create Button 4 and add it to the frame
        Button button4 = new Button("Button 4");
        gbc.gridx = 1; // Column position
        gbc.gridy = 1; // Row position
        gbc.gridwidth = 1; // Button spans 1 column
        gbc.gridheight = 1; // Button spans 1 row
        gbc.ipadx = 30; // Extra padding inside the button along the X-axis
        frame.add(button4, gbc);

        // Set the size of the frame and make it visible
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
