package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class NewDetails extends JFrame implements ActionListener {
    JTextField textField, textField1, textField2, textField3, textField4, textField5, textField6, textField7, t1, t2;
    JRadioButton male, female;
    JButton submit;
    JLabel massage;
    String str;

    public NewDetails(String s) {
        str = s;
        getContentPane().setForeground(Color.BLUE);
        getContentPane().setBackground(Color.WHITE);
        setTitle("NEW DETAILS");

        getContentPane().setLayout(null);

        JLabel l = new JLabel("ENTER NEW DETAILS----");
        l.setFont(new Font("Tahoma", Font.BOLD, 17));
        l.setBounds(20, 5, 300, 27);
        add(l);

        JLabel name = new JLabel("NAME");
        name.setFont(new Font("Tahoma", Font.PLAIN, 17));
        name.setBounds(60, 30, 150, 27);
        add(name);

        textField = new JTextField();
        textField.setBounds(200, 30, 200, 27);
        add(textField);

        JLabel flat = new JLabel("FLAT TYPE");
        flat.setFont(new Font("Tahoma", Font.PLAIN, 17));
        flat.setBounds(500, 30, 150, 27);
        add(flat);
        t1 = new JTextField();
        t1.setBounds(600, 30, 200, 27);
        add(t1);

        JLabel flatno = new JLabel("FLAT NO");
        flatno.setFont(new Font("Tahoma", Font.PLAIN, 17));
        flatno.setBounds(500, 80, 150, 27);
        add(flatno);
        t2 = new JTextField();
        t2.setBounds(600, 80, 200, 27);
        add(t2);

        submit = new JButton("SUBMIT");
        submit.setBounds(350, 420, 150, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        add(submit);
        submit.addActionListener(this);

        JLabel age = new JLabel("AGE");
        age.setFont(new Font("Tahoma", Font.PLAIN, 17));
        age.setBounds(60, 80, 150, 27);
        add(age);

        textField1 = new JTextField();
        textField1.setBounds(200, 80, 200, 27);
        add(textField1);

        JLabel gender = new JLabel("GENDER");
        gender.setFont(new Font("Tahoma", Font.PLAIN, 17));
        gender.setBounds(60, 120, 150, 27);
        add(gender);

        male = new JRadioButton("MALE");
        male.setBackground(Color.WHITE);
        male.setBounds(200, 120, 70, 27);
        add(male);

        female = new JRadioButton("FEMALE");
        female.setBackground(Color.WHITE);
        female.setBounds(280, 120, 80, 27);
        add(female);


        JLabel occupation = new JLabel("OCCUPATION");
        occupation.setFont(new Font("Tahoma", Font.PLAIN, 17));
        occupation.setBounds(60, 170, 150, 27);
        add(occupation);

        textField7 = new JTextField();
        textField7.setBounds(200, 170, 200, 30);
        add(textField7);

        JLabel phone = new JLabel("PHONE");
        phone.setFont(new Font("Tahoma", Font.PLAIN, 17));
        phone.setBounds(60, 220, 150, 27);
        add(phone);

        textField3 = new JTextField();
        textField3.setBounds(200, 220, 200, 27);
        add(textField3);

        JLabel aadhar = new JLabel("AADHAR");
        aadhar.setFont(new Font("Tahoma", Font.PLAIN, 17));
        aadhar.setBounds(60, 270, 150, 27);
        add(aadhar);

        textField4 = new JTextField();
        textField4.setBounds(200, 270, 200, 27);
        add(textField4);

        JLabel email = new JLabel("EMAIL");
        email.setFont(new Font("Tahoma", Font.PLAIN, 17));
        email.setBounds(60, 320, 150, 27);
        add(email);

        textField5 = new JTextField();
        textField5.setBounds(200, 320, 200, 27);
        add(textField5);


        JLabel vehicle = new JLabel("VEHICLE NO");
        vehicle.setFont(new Font("Tahoma", Font.PLAIN, 17));
        vehicle.setBounds(60, 370, 150, 27);
        add(vehicle);

        textField6 = new JTextField();
        textField6.setBounds(200, 370, 200, 27);
        add(textField6);

        massage = new JLabel();
        massage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        massage.setBounds(300, 470, 250, 27);
        add(massage);

        setSize(900, 550);
        setVisible(true);
        setLocation(450, 220);

    }


    public static void main(String[] args) {
        new NewDetails("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String name = textField.getText();
            String age = textField1.getText();
            String gender = "";
            if (male.isSelected()) {
                gender = "Male";
            } else if (female.isSelected()) {
                gender = "Female";
            }
            String occupation = textField7.getText();
            String phone = textField3.getText();
            String aadhar = textField4.getText();
            String email = textField5.getText();
            String vehicle = textField6.getText();
            String flat = t1.getText();
            String flatno = t2.getText();
            String newstr = name + " " + age + " " + gender + " " + occupation + " " + phone + " " + aadhar + " " + email + " " + vehicle + " " + flat + " " + flatno + " ";


            String result= null;
            try {
                result = RemoveMember.fileToString("C:\\Users\\lenovo\\IdeaProjects\\rectifier\\SocietyManagementSystem\\src\\File\\member.txt");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            result=result.replaceAll(str,newstr);
            PrintWriter writer = null;
            try {
                writer = new PrintWriter(new File("C:\\Users\\lenovo\\IdeaProjects\\rectifier\\SocietyManagementSystem\\src\\File\\member.txt"));
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
            writer.append(result);
            writer.flush();

            massage.setText("SUCCESSFULLY EDITED!!!");

        }
    }
}
