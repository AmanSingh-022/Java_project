package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

public class CreateEvent extends JFrame implements ActionListener {
    JTextArea a1;
    JButton b1;
    Container c;
    JLabel l;
    CreateEvent()
    {
        setSize(800,550);
        setLocation(350,220);
        c=getContentPane();
        setTitle("Create Event");
        c.setBackground(Color.yellow);
        setLayout(null);

        a1=new JTextArea();
        a1.setBounds(100,50,600,300);
        a1.setBackground(Color.lightGray);
        a1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(a1);

        b1=new JButton("CREATE EVENT");
        b1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        b1.setBounds(300,380,200,30);
        add(b1);
        b1.addActionListener(this);

        l=new JLabel();
        l.setBounds(320,420,200,30);
        l.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(l);


        setVisible(true);
    }


    public static void main(String[] args) {
        new CreateEvent();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            String str=" || "+a1.getText()+" ";
            try {
                FileWriter wr=new FileWriter("C:\\Users\\lenovo\\IdeaProjects\\rectifier\\SocietyManagementSystem\\src\\File\\event.txt",true);
                wr.write(str);
                wr.close();
                l.setText("EVENT CREATED!!!");
                a1.setText("");
            } catch (Exception ex) {
                System.out.println("An error occurred.");
                ex.printStackTrace();
            }
        }
    }
}
