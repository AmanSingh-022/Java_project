package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MemberLogin extends JFrame implements ActionListener{
JButton b1,b2,b3,b4,b5;
JLabel l1,l2;
    MemberLogin(){
        setBounds(0,0,1300,680);
       setTitle("Member Login");


        ImageIcon i1= new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\rectifier\\SocietyManagementSystem\\src\\images\\memberbg.jpeg");
        Image i2= i1.getImage().getScaledInstance(1300,680,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
         l1= new JLabel(i3);
        l1.setBounds(0,0,1300,680);
        add(l1);

      b1=new JButton("My Profile");
        b1.setBounds(300,80,120,35);
        b1.setFont(new Font("sarif",Font.BOLD,16));
        b1.setForeground(Color.DARK_GRAY);
        b1.setBackground(Color.lightGray);
        b1.addActionListener(this);
        l1.add(b1);

        b2=new JButton("Event List");
        b2.setBounds(440,80,120,35);
        b2.setFont(new Font("sarif",Font.BOLD,16));
        b2.setForeground(Color.DARK_GRAY);
        b2.setBackground(Color.lightGray);
//        b1.addActionListener(this);
        l1.add(b2);
        b3=new JButton("My Bill");
        b3.setBounds(580,80,100,35);
        b3.setFont(new Font("sarif",Font.BOLD,16));
        b3.setForeground(Color.DARK_GRAY);
        b3.setBackground(Color.lightGray);
//        b1.addActionListener(this);
        l1.add(b3);
         b5=new JButton("Feedback");
        b5.setBounds(700,80,120,35);
        b5.setFont(new Font("sarif",Font.BOLD,16));
        b5.setForeground(Color.DARK_GRAY);
        b5.setBackground(Color.lightGray);
        b5.addActionListener(this);
        l1.add(b5);
      b4=new JButton("LogOut");
        b4.setBounds(980,500,100,35);
        b4.setFont(new Font("sarif",Font.BOLD,16));
        b4.setForeground(Color.white);
        b4.setBackground(Color.RED);
        b4.addActionListener( this);
        l1.add(b4);

     l2=new JLabel("Society WELCOMES You!");
        l2.setBounds(400,300,400,36);
        l2.setFont(new Font("sarif",Font.BOLD,32));
        l1.add(l2);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
    }
 @Override
 public void actionPerformed(ActionEvent e) {
  if(e.getSource()==b1){
   Random rand =new Random();
   int floor = rand.nextInt(5);

   char[] arr=new char[3];
   arr[0]='A';
   arr[1]='B';
   arr[2]='C';
   int i=rand.nextInt(2);
   char block = arr[i];
   String userName="user name";
   String mobileNo = null;
   new profile(floor,block,userName,mobileNo);
//   this.setVisible(false);
  }
  else if(e.getSource()==b5){
   new feedback();
  }
 else if(e.getSource()==b4){
  this.setVisible(false);
  new Home();

  }

 }

    public static void main(String[] args) {
MemberLogin m=new MemberLogin();
    }


}
