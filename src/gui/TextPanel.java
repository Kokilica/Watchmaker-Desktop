package gui;

import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {

    //private fields
    private JTextArea textArea;

    //constructor
    public  TextPanel(){
        textArea = new JTextArea();

        setLayout(new BorderLayout());

        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }

    public void appendText(String text){
        textArea.append(text);
    }
}
