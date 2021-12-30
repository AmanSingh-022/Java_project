package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class feedback extends JFrame implements ActionListener{
JButton submitBtn,backBtn;
    JTextArea area;
    String s;
    feedback() {

        setBounds(0,0,1300,680);
        setTitle("Feedback");

        ImageIcon i1=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\rectifier\\SocietyManagementSystem\\src\\images\\feed.jpeg");
        Image i2= i1.getImage().getScaledInstance(1300,680,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        setLayout(null);
        l1.setBounds(0,0,1300,680);
        add(l1);

        JLabel l2 = new JLabel("FEEDBACK");
        l2.setBounds(500, 50, 250, 50);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("serif", Font.BOLD, 30));
        l1.add(l2);


        area=new JTextArea();
        area.setBounds(300,100,600,350);
        l1.add(area);
         submitBtn=new JButton("Submit");
        submitBtn.setBounds(720, 470, 80, 30);
        submitBtn.addActionListener( this);
        l1.add(submitBtn);
        backBtn=new JButton("Back");
        backBtn.setBounds(810, 470, 80, 30);
        l1.add(backBtn);
        backBtn.addActionListener( this);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
        l1.setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new feedback();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==submitBtn){

            try{s=area.getText();
                s=s+" ";
                FileWriter writer=new FileWriter("C:\\Users\\lenovo\\IdeaProjects\\rectifier\\SocietyManagementSystem\\src\\File\\file.txt",true);
                writer.write(s);
                writer.close();
            }
            catch (IOException E){
                System.out.println("An error occrured");
                E.printStackTrace();
            }
          File f=new File("C:\\Users\\lenovo\\IdeaProjects\\rectifier\\SocietyManagementSystem\\src\\File\\file.txt");
            Scanner sc= null;
            try {
                sc = new Scanner(f);
                while(true){
                    assert sc != null;
                    if (!sc.hasNext()) break;
                    String data=sc.nextLine();
                    System.out.println(data);
                }
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
            this.setVisible(false);


        }
        if(e.getSource()==backBtn){
            this.setVisible(false);
        }
    }
}

