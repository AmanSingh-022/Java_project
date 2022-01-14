package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Societyinfo extends JFrame implements ActionListener {
    Societyinfo() {
        setBounds(0, 0, 1920, 1080);

        // setSize(400,400);

        //setLocation(400,400);
        ImageIcon i1 = new ImageIcon("C:\\Users\\AMAN SINGH\\OneDrive\\Desktop\\git_Intellij\\SocietyManagementSystem\\src\\images\\bg.jpg");
        Image i2 = i1.getImage().getScaledInstance(1920, 1080, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1920, 1080);
        add(l1);


        add(l1);

        JLabel l2 = new JLabel("SOCIETY INFO");
        l2.setBounds(100, 50, 1500, 30);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("serif", Font.BOLD, 30));
        l1.add(l2);


        JLabel l3 = new JLabel("Name of Society" + " :- " + "Rajlabdhi Heritage"
        );
        l3.setBounds(100, 110, 1500, 30);
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("BOLD", Font.BOLD, 20));
        l1.add(l3);

        JLabel l7 = new JLabel("Address" + " :- " + "Rajlabdhi Heritage, Behind Nidhi Petrol Pump"
        );
        l7.setBounds(100, 160, 1500, 30);
        l7.setForeground(Color.RED);
        l7.setFont(new Font("serif", Font.BOLD, 20));

        l1.add(l7);
        JLabel l8 = new JLabel("      " + "Koba-Ambapur Road, Gandhinagar 382421"
        );
        l8.setBounds(110, 190, 1500, 30);
        l8.setForeground(Color.BLACK);
        l8.setFont(new Font("serif", Font.BOLD, 20));

        l1.add(l8);
        JLabel l9 = new JLabel("      " + " Google Map Coordinates: 23.145863643704104, 72.63007493521117");
        l9.setBounds(110, 210, 1500, 30);
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("serif", Font.BOLD, 20));
        l1.add(l9);
        JLabel l10 = new JLabel(" NO OF FLATS" + " :- " + " 5 BHK(20) and 2BHK(30)");
        l10.setBounds(100, 250, 1500, 30);
        l10.setForeground(Color.BLACK);
        l10.setFont(new Font("serif", Font.BOLD, 20));
        l1.add(l10);
        JLabel l11 = new JLabel(" FACILITIES" + " :- " + " parking available,24X7 water supply,private Gyms and spas available,");

        l11.setBounds(100, 290, 1500, 30);
        l11.setForeground(Color.BLACK);
        l11.setFont(new Font("serif", Font.BOLD, 20));
        l1.add(l11);
        JLabel l12 = new JLabel("     " + " power backup available,Eco-friendly environment,sports facilities available,");

        l12.setBounds(110, 310, 1500, 30);
        l12.setForeground(Color.BLACK);
        l12.setFont(new Font("serif", Font.BOLD, 20));
        l1.add(l12);
        JLabel l13 = new JLabel("     " + " Regular society meetings for events upcoming , On-site maintenance etc");

        l13.setBounds(110, 350, 1500, 30);
        l13.setForeground(Color.BLACK);
        l13.setFont(new Font("serif", Font.BOLD, 20));
        l1.add(l13);
        JLabel l14 = new JLabel("   THANK YOU FOR VISITING HERE");
        l14.setBounds(110, 400, 1000, 90);
        l14.setForeground(Color.BLACK);
        l14.setFont(new Font("serif", Font.BOLD, 40));
        l1.add(l14);


        JButton l = new JButton("EXIT");
        l.setBounds(1000, 580, 100, 30);
        l.addActionListener(this);
        l1.add(l);


        setLayout(null);
        setVisible(true);
    }



    public static void main(String[] args) {

        Societyinfo window = new Societyinfo();


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        this.setVisible(false);
    }
}








