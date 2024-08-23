package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textPan,textAdhar;
    JRadioButton r1,r2,e1,e2;
    JButton next;
    String formno;
    Signup2(String first) {
        super("APPLICATION FORM");
        JLabel l1 = new JLabel("Page 2");
        l1.setFont(new Font("Raleway", Font.BOLD,22));
        l1.setBounds(300,30,600,40);
         add(l1);

         JLabel l2 = new JLabel("Additional Details");
         l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
         add(l2);

         JLabel l3 =new JLabel("Religion");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);
        String religion[] = {"hindi","Muslim","Sikh","christian","other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleway", Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel l4 =new JLabel("Category :");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);
        String Category [] = {"General","OBC","SC","ST","other"};
        comboBox2 = new JComboBox(Category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Raleway", Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel l5 =new JLabel("Income :");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);
        String Income [] = {"Null","<1,50,000","<2,50,000","5,00,000","upto 10,00,000"};
        comboBox3 = new JComboBox(Income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleway", Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Education :");
        l6.setFont(new Font("Raleway", Font.BOLD,18));
        l6.setBounds(100,280,150,30);
        add(l6);
        String education [] = {"Non-Graduate","Graduate","post-Graduate","other"};
        comboBox4 = new JComboBox(education);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Raleway", Font.BOLD,14));
        comboBox4.setBounds(350,290,320,30);
        add(comboBox4);


        JLabel l7 = new JLabel("Ocupation :");
        l7.setFont(new Font("Raleway", Font.BOLD,18));
        l7.setBounds(100,340,150,30);
        add(l7);
        String Ocupation [] = {"private","Business","Self-employe","Student","other"};
        comboBox5 = new JComboBox(Ocupation);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setFont(new Font("Raleway", Font.BOLD,14));
        comboBox5.setBounds(350,340,320,30);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN Number :");
        l8.setFont(new Font("Raleway", Font.BOLD,18));
        l8.setBounds(100,390,150,30);
        add(l8);
        textPan = new JTextField();
        textPan.setFont(new Font("Raleway", Font.BOLD,18));
        textPan.setBounds(350,390,320,30);
        add(textPan);

        JLabel l9 = new JLabel("Adhar Number :");
        l9.setFont(new Font("Raleway", Font.BOLD,18));
        l9.setBounds(100,440,180,30);
        add(l9);
        textAdhar = new JTextField();
        textAdhar.setFont(new Font("Raleway", Font.BOLD,18));
        textAdhar.setBounds(350,440,320,30);
        add(textAdhar);

        JLabel l10 = new JLabel("Senior Citizen :");
        l10.setFont(new Font("Raleway", Font.BOLD,18));
        l10.setBounds(100,490,180,30);
        add(l10);
        r1 = new JRadioButton("yes");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,490,100,30);
        add(r1);
        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(460,490,100,30);
        add(r2);

        JLabel l11 = new JLabel("Existing Account :");
        l11.setFont(new Font("Raleway", Font.BOLD,18));
        l11.setBounds(100,540,180,30);
        add(l11);
        e1 = new JRadioButton("yes");
        e1.setFont(new Font("Raleway",Font.BOLD,14));
        e1.setBackground(new Color(252,208,76));
        e1.setBounds(350,540,100,30);
        add(e1);
        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway",Font.BOLD,14));
        e2.setBackground(new Color(252,208,76));
        e2.setBounds(460,540,100,30);
        add(e2);

        JLabel l12 = new JLabel("Form No :");
        l12.setFont(new Font("Raleway", Font.BOLD,18));
        l12.setBounds(700,10,100,30);
        add(l12);
        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD,18));
        l13.setBounds(760,10,60,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setBackground(Color.BLACK);
        next.setBounds(570,640,100,30);
        add(next);



        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        next.addActionListener(this);
        add(image);

        this.formno = formno;

        setLayout(null);
        setSize(850, 750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);
         // Ensure the application exits when the window is closed
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new Signup2("");
    }
}

