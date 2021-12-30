package project;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class contactus  extends JFrame implements ActionListener {
    contactus(){
        setBounds(0,0,1920,1080);

        ImageIcon i1=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\rectifier\\SocietyManagementSystem\\src\\images\\feed.jpeg");
        Image i2= i1.getImage().getScaledInstance(1920,1080,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(0,0,1920,1080);
        add(l1);
        JLabel l2=new JLabel("CONTACT US");
        l2.setBounds(100,50,1000,50);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("serif",Font.BOLD,30));
        l1.add(l2);

        JLabel l3= new JLabel("SECRETARY CONTACT DETAILS");
        l3.setBounds(100,130,1500,30);
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("serif",Font.BOLD,30));

        l1.add(l3);
        JLabel l4=new JLabel("NAME"+"-"+"ADARSH SINGH");
        l4.setBounds(100,180,1500,30);
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("serif",Font.BOLD,20));

        l1.add(l4);
        JLabel l5=new JLabel("Email"+"-"+"adsv43@gmail.com");
        l5.setBounds(100,230,1500,30);
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("serif",Font.BOLD,20));

        l1.add(l5);
        JLabel l6= new JLabel("Contact number"+"-"+"8976546789");
        l6.setBounds(100,280,1500,30);
        l6.setForeground(Color.BLACK);
        l6.setFont(new Font("serif",Font.BOLD,20));

        l1.add(l6);
        JLabel l7=new JLabel("Address"+"-"+"Rajlabdhi Heritage, Behind Nidhi Petrol Pump"
        );
        l7.setBounds(100,320,1500,30);
        l7.setForeground(Color.BLACK);
        l7.setFont(new Font("serif",Font.BOLD,20));

        l1.add(l7);
        JLabel l8=new JLabel("      "+"Koba-Ambapur Road, Gandhinagar 382421"
        );
        l8.setBounds(110,370,1500,30);
        l8.setForeground(Color.BLACK);
        l8.setFont(new Font("serif",Font.BOLD,20));

        l1.add(l8);
        JLabel l9=new JLabel("      "+" Google Map Coordinates: 23.145863643704104, 72.63007493521117"
        );
        l9.setBounds(110,420,1500,30);
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("serif",Font.BOLD,20));

        l1.add(l9);
        JButton l=new JButton("EXIT");

        l.setBounds(900,470,100,30);
        l.addActionListener(this);
        l1.add(l);



        setLayout(null);
        setVisible(true);



        setVisible(true);
    }



    public static void main(String[] args) {

        new contactus();


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        this.setVisible(false);
    }
}






