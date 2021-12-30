package project;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RemoveMember extends JFrame implements ActionListener {
    JFrame f;
    JLabel j1,j2,j3;
    JTextField t1,t2;
    JButton b1;
    Container c;
    RemoveMember()
    {
        f=new JFrame();
        setTitle("Remove Member");
        c=getContentPane();
        setLayout(null);

        j1=new JLabel("Name");
        j2=new JLabel("Mobile No");
        j1.setFont(new Font("Tahoma", Font.PLAIN, 24));
        j1.setBounds(100,100,150,50);
        add(j1);
        j2.setFont(new Font("Tahoma", Font.PLAIN, 24));
        j2.setBounds(100,170,150,50);
        add(j2);

        t1=new JTextField();
        t2=new JTextField();
        t1.setFont(new Font("Tahoma", Font.PLAIN, 24));
        t1.setBounds(250,100,300,50);
        add(t1);
        t2.setFont(new Font("Tahoma", Font.PLAIN, 24));
        t2.setBounds(250,170,300,50);
        add(t2);

        b1=new JButton("DELETE");
        b1.setFont(new Font("Tahoma", Font.PLAIN, 28));
        b1.setBounds(200,260,300,50);
        add(b1);
        b1.addActionListener(this);

        j3=new JLabel();
        j3.setFont(new Font("Tahoma", Font.PLAIN, 28));
        j3.setBounds(175,320,350,50);
        add(j3);


        setSize(700,550);
        setLocation(450,220);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RemoveMember();
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            String nm=t1.getText();
            String mobile=t2.getText();

            File obj=new File("C:\\Users\\lenovo\\IdeaProjects\\rectifier\\SocietyManagementSystem\\src\\File\\member.txt");
            try {
                Scanner sc=new Scanner(obj);
                String name,age,gender,occupation,phone,aadhar,email,vehicle,flat,flatno;
                while(sc.hasNext()) {
                    name = sc.next();
                    name = name + " " + sc.next();
                    age = sc.next();
                    gender = sc.next();
                    occupation = sc.next();
                    phone = sc.next();
                    aadhar = sc.next();
                    email = sc.next();
                    vehicle = sc.next();
                    flat = sc.next();
                    flatno = sc.next();

                    if(nm.equals(name) && mobile.equals(phone))
                    {
                        j3.setText("SUCCESSFULLY DELETED!!!");
                        String str = name + " " + age + " " + gender + " " + occupation + " " + phone + " " + aadhar + " " + email + " " + vehicle + " " + flat + " " + flatno+" ";
                        String result=fileToString("C:\\Users\\lenovo\\IdeaProjects\\rectifier\\SocietyManagementSystem\\src\\File\\member.txt");
                        result=result.replaceAll(str,"");
                        PrintWriter writer = new PrintWriter(new File("C:\\Users\\lenovo\\IdeaProjects\\rectifier\\SocietyManagementSystem\\src\\File\\member.txt"));
                        writer.append(result);
                        writer.flush();
                    }
                    else
                    {
                        j3.setText("DATA NOT FOUND");
                    }
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    public static String fileToString(String filePath) throws Exception{
        String input = null;
        Scanner sc = new Scanner(new File(filePath));
        StringBuffer sb = new StringBuffer();
        while (sc.hasNextLine()) {
            input = sc.nextLine();
            sb.append(input);
        }
        return sb.toString();
    }
}
