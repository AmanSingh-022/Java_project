package project;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ShowEvent extends JFrame {
    JTextArea a1;
    Container c;
    ShowEvent() throws FileNotFoundException {
        setSize(800,550);
        setLocation(350,220);
        c=getContentPane();
        setTitle("Show Event");
        c.setBackground(Color.yellow);
        setLayout(null);

        a1=new JTextArea();
        a1.setBounds(100,50,600,300);
        a1.setBackground(Color.lightGray);
        a1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(a1);

        File obj=new File("C:\\Users\\lenovo\\IdeaProjects\\rectifier\\SocietyManagementSystem\\src\\File\\event.txt");
        Scanner sc=new Scanner(obj);
        String res="";
        while(sc.hasNextLine())
        {
            res=res+sc.nextLine();
        }
        a1.setLineWrap(true);
        a1.setText(res);
        a1.setEditable(false);

        setVisible(true);
    }

    public static void main(String[] args) throws FileNotFoundException {
        new ShowEvent();
    }

}
