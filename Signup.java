package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1, r2, m1, m2, m3;
    JButton next;
    JTextField textName, textFname, textemail, textAdd, textCity, textPin, textState;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    Signup() {
        super("APPLICATION FORM");

        // Creating a panel to hold all the components
        JPanel panel = new JPanel();
        panel.setLayout(null); // Custom layout management
        panel.setBackground(new Color(222, 255, 228)); // Setting the background color of the panel

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        panel.add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(168, 20, 600, 30);
        label1.setFont(new Font("Raleway", Font.BOLD, 30));
        panel.add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway", Font.BOLD, 18));
        label2.setBounds(320, 60, 600, 30);
        panel.add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(290, 90, 600, 30);
        panel.add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100, 190, 100, 30);
        panel.add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 190, 400, 30);
        addFocusEffects(textName);  // Adding focus effects
        panel.add(textName);

        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelfName.setBounds(100, 240, 200, 30);
        panel.add(labelfName);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway", Font.BOLD, 14));
        textFname.setBounds(300, 240, 400, 30);
        addFocusEffects(textFname);  // Adding focus effects
        panel.add(textFname);

        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100, 340, 200, 30);
        panel.add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 340, 400, 30);
        panel.add(dateChooser);

        JLabel labelg = new JLabel("Gender :");
        labelg.setFont(new Font("Raleway", Font.BOLD, 20));
        labelg.setBounds(100, 290, 200, 30);
        panel.add(labelg);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(222, 255, 228));
        r1.setBounds(300, 290, 60, 30);
        panel.add(r1);

        r2 = new JRadioButton("Female");
        r2.setBackground(new Color(222, 255, 228));
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBounds(450, 290, 90, 30);
        panel.add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelemail = new JLabel("Email address :");
        labelemail.setFont(new Font("Raleway", Font.BOLD, 20));
        labelemail.setBounds(100, 385, 200, 30);
        panel.add(labelemail);

        textemail = new JTextField();
        textemail.setFont(new Font("Raleway", Font.BOLD, 14));
        textemail.setBounds(300, 390, 400, 30);
        addFocusEffects(textemail);  // Adding focus effects
        panel.add(textemail);

        JLabel labelMs = new JLabel("Marital Status");
        labelMs.setFont(new Font("Raleway", Font.BOLD, 20));
        labelMs.setBounds(100, 440, 200, 30);
        panel.add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setBounds(300, 440, 100, 30);
        m1.setBackground(new Color(222, 255, 228));
        m1.setFont(new Font("Raleway", Font.BOLD, 14));
        panel.add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBounds(450, 440, 100, 30);
        m2.setBackground(new Color(222, 255, 228));
        m2.setFont(new Font("Raleway", Font.BOLD, 14));
        panel.add(m2);

        m3 = new JRadioButton("Other");
        m3.setBackground(new Color(222, 255, 228));
        m3.setBounds(635, 440, 100, 30);
        m3.setFont(new Font("Raleway", Font.BOLD, 14));
        panel.add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
        labelAdd.setBounds(100, 490, 200, 30);
        panel.add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway", Font.BOLD, 14));
        textAdd.setBounds(300, 490, 400, 30);
        addFocusEffects(textAdd);  // Adding focus effects
        panel.add(textAdd);

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
        labelCity.setBounds(100, 540, 200, 30);
        panel.add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway", Font.BOLD, 14));
        textCity.setBounds(300, 540, 400, 30);
        addFocusEffects(textCity);  // Adding focus effects
        panel.add(textCity);

        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setFont(new Font("Raleway", Font.BOLD, 20));
        labelPin.setBounds(100, 590, 200, 30);
        panel.add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway", Font.BOLD, 14));
        textPin.setBounds(300, 590, 200, 30);
        addFocusEffects(textPin);  // Adding focus effects
        panel.add(textPin);

        JLabel labelState = new JLabel("State :");
        labelState.setFont(new Font("Raleway", Font.BOLD, 20));
        labelState.setBounds(100, 640, 200, 30);
        panel.add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD, 14));
        textState.setBounds(300, 640, 200, 30);
        addFocusEffects(textState);  // Adding focus effects
        panel.add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 710, 80, 30);
        next.addActionListener(this);
        addHoverEffects(next);  // Adding hover effects
        panel.add(next);

        panel.setPreferredSize(new Dimension(850, 900)); // Setting the preferred size for the panel

        JScrollPane scrollPane = new JScrollPane(panel); // Wrapping the panel in a scroll pane
        scrollPane.setBounds(0, 0, 850, 800); // Setting the size of the scroll pane
        add(scrollPane); // Adding the scroll pane to the frame

        setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize the window
        setVisible(true);
    }

    private void addFocusEffects(JTextField textField) {
        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textField.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
                textField.setBackground(new Color(245, 245, 255));
            }

            @Override
            public void focusLost(FocusEvent e) {
                textField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                textField.setBackground(Color.WHITE);
            }
        });
    }

    private void addHoverEffects(JButton button) {
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setBackground(new Color(34, 139, 34));
                button.setForeground(Color.YELLOW);
                button.setFont(new Font("Raleway", Font.BOLD, 16));
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setBackground(Color.BLACK);
                button.setForeground(Color.WHITE);
                button.setFont(new Font("Raleway", Font.BOLD, 14));
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if (r2.isSelected()){
            gender = "Female";
        }
        String email = textemail.getText();
        String marital =null;
        if (m1.isSelected()){
            marital = "Married";
        } else if (m2.isSelected()) {
            marital = "Unmarried";
        } else if (m3.isSelected()) {
            marital = "Other";
        }

        String address = textAdd.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();

        try{
            if (textName.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }else {
                con c = new con();
                String q = "insert into signup values('"+formno+"', '"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"', '"+address+"', '"+city+"','"+pincode+"','"+state+"' )";
                c.statement.executeUpdate(q);
                new Signup2(first);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }
        // Handle the "Next" button click here


    public static void main(String[] args) {
        new Signup();
    }
}
