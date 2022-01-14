package project;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class EditMember extends RemoveMember{
    EditMember()
    {
        super();
        f.setTitle("Edit Member Details");
        b1.setText("EDIT");
    }

    public static void main(String[] args) {
        new EditMember();
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
                       setVisible(false);
                        String str = name + " " + age + " " + gender + " " + occupation + " " + phone + " " + aadhar + " " + email + " " + vehicle + " " + flat + " " + flatno+" ";
                        NewDetails ob=new NewDetails(str);

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
}
