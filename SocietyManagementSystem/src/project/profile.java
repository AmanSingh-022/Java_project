package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class profile extends JFrame implements ActionListener{
    int floor;
    char block;
   String userName;
    String mobileNo;
    profile(int floor, char block, String userName, String mobileNo) {

        this.floor=floor;
        this.block=block;
        this.userName=userName;
        this.mobileNo=mobileNo;

        setBounds(300,150,400,350);
        setTitle("My Profile");

Container c =new Container();
c=getContentPane();
c.setBackground(Color.LIGHT_GRAY);
        ImageIcon i1= new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\rectifier\\SocietyManagementSystem\\src\\images\\profile.png");
        Image i2= i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel();
        l1.setIcon(i3);
        l1.setBounds(145,20,100,100);
        c.add(l1);


        JLabel name=new JLabel("Name     :");
        name.setBounds(130,150,80,20);
        c.add(name);
        JLabel nam=new JLabel(userName);
        nam.setBounds(210,150,150,20);
        c.add(nam);

        JLabel Block=new JLabel("Block      :");
        Block.setBounds(130,170,80,20);
        c.add(Block);
        JLabel Blo=new JLabel(String.valueOf(block));
        Blo.setBounds(210,170,150,20);
        c.add(Blo);

        JLabel Floor=new JLabel("Floor No :");
        Floor.setBounds(130,190,80,20);
        c.add(Floor);
        JLabel flo=new JLabel(String.valueOf(floor));
        flo.setBounds(210,190,50,20);
        c.add(flo);

        JButton btn=new JButton(" Back ");
        btn.setBounds(250,220,80,30);
        btn.setBackground(Color.red);
        btn.addActionListener(this);
        c.add(btn);
        JLabel emp=new JLabel("  ");
        c.add(emp);



        setVisible(true);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
    }
    public static void main(String[] args) {



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.setVisible(false);
    }
}
