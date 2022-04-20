package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainApp2 extends JFrame {
    private JButton button = new JButton("Click");
    private JTextField input = new JTextField("");
    private JLabel label = new JLabel("Input:");
    private JRadioButton radio1 = new JRadioButton("1");
    private JRadioButton radio2 = new JRadioButton("2");
    private JCheckBox check = new JCheckBox("Check", false);

    public MainApp2(){
        super("Minecraft");
        this.setBounds(900,600,500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cont = this.getContentPane();
        cont.setLayout(new GridLayout(3,2,2,2));
        cont.add(label);
        cont.add(input);
        Font myfont = new Font("Sans",Font.BOLD / Font.ITALIC, 40);
        label.setFont(myfont);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);

        cont.add(radio1);
        cont.add(radio2);
        radio1.setSelected(true);
        cont.add(check);
        button.addActionListener(new ButtonListener());
        cont.add(button);
    }

    class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "Button pressed\n";
            message += "Text is " + input.getText() + "\n";
            message += (radio1.isSelected() ? "Radio1 " + "selected \n" : "Radio2" + " selected\n");
            message += "CheckBox: " + (check.isSelected()? "checked " + " status\n" : "unchecked " + " status\n");
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);

        }
    }


}
