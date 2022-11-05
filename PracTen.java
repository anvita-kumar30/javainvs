import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Form implements ActionListener {
    JButton button, button1;
    JLabel label;
    JTextField t1, t2, t3;
    JCheckBox c1,c2,c3;
    Form() {
        JFrame frame = new JFrame("Registration Form");
        frame.setSize(500, 550);
        Color bg = new Color(211, 211, 211);
        frame.getContentPane().setBackground(bg);
        Color lightRed = new Color(204, 0, 0);
        Color Green = new Color(0, 204, 0);
        button = new JButton("Submit");
        button1 = new JButton("Cancel");
        label = new JLabel("Press Submit To Save");
        String c[] = { "Male", "Female" };
        JLabel lc = new JLabel("Gender");
        lc.setBounds(50, 200, 100, 30);
        frame.add(lc);
        JComboBox gender = new JComboBox(c);
        gender.setBounds(150, 200, 150, 30);
        frame.add(gender);

        JLabel l0 = new JLabel("Subjects");
        l0.setBounds(50, 250, 120, 30);
        frame.add(l0);
        JCheckBox c1 = new JCheckBox("Physics");
        c1.setBounds(200, 250, 150, 50);
        JCheckBox c2 = new JCheckBox("Chemistry");
        c2.setBounds(200, 300, 150, 50);
        JCheckBox c3 = new JCheckBox("Maths");
        c3.setBounds(200, 350, 150, 50);
        frame.add(c1);
        frame.add(c2);
        frame.add(c3);

        JLabel l1 = new JLabel("Name");
        l1.setBounds(50, 50, 100, 30);
        frame.add(l1);
        t1 = new JTextField("");
        t1.setBounds(50, 50, 50, 30);
        t1.setBounds(150, 50, 180, 30);
        frame.add(l1);
        frame.add(t1);
        JLabel l2 = new JLabel("DOB");
        l2.setBounds(50, 100, 100, 30);
        frame.add(l2);
        t2 = new JTextField("");
        t2.setBounds(50, 150, 50, 30);
        t2.setBounds(150, 100, 180, 30);
        frame.add(t2);
        frame.add(t2);
        JLabel l3 = new JLabel("Email");
        l3.setBounds(50, 150, 100, 30);
        frame.add(l3);
        t3 = new JTextField("");
        t3.setBounds(50, 100, 50, 30);
        t3.setBounds(150, 150, 180, 30);
        frame.add(l3);
        frame.add(t3);
        button.setBounds(150, 420, 80, 30);
        button1.setBounds(250, 420, 80, 30);
        button.addActionListener(this);
        button1.addActionListener(this);
        button.setBackground(Green);
        button.setForeground(Color.BLACK);
        button1.setBackground(lightRed);
        button1.setForeground(Color.BLACK);
        frame.add(button);
        frame.add(button1);
        label.setBounds(175, 450, 150, 30);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button)
            label.setText("Details saved!!");
        else if (e.getSource() == button1)
            label.setText("Details not saved!!");
    }
}
public class PracTen {
    public static void main(String arg[]) {
        Form f = new Form();
    }
}
