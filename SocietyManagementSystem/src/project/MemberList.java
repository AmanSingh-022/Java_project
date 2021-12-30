package project;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class MemberList extends JFrame
{
    JFrame f;
    Container c;
    JTable t;
    MemberList()
    {
        f=new JFrame();
        f.setTitle("Members List");
        f.setSize(1550,600);
        f.setLocation(0,220);

        File obj=new File("C:\\Users\\lenovo\\IdeaProjects\\rectifier\\SocietyManagementSystem\\src\\File\\member.txt");
        try {
            Scanner sc=new Scanner(obj);
            String name=sc.next();
            name=name+" "+sc.next();
            String age=sc.next();
            String gender=sc.next();
            String occupation=sc.next();
            String phone=sc.next();
            String aadhar=sc.next();
            String email=sc.next();
            String vehicle=sc.next();
            String flat=sc.next();
            String flatno=sc.next();
            String[] column={"Name","Age","Gender","Occupation","Phone No","Aadhar","Email","Vehicle","Flat Type","Flat No"};
            Object[][] data={{name,age,gender,occupation,phone,aadhar,email,vehicle,flat,flatno}};

            DefaultTableModel model=new DefaultTableModel(data,column);
            t=new JTable(model){
                public boolean editCellAt(int row, int column, java.util.EventObject e) {
                    return false;
                }
            };
            JScrollPane sp=new JScrollPane(t);
            f.add(sp);


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
                Object[] d = {name, age, gender, occupation, phone, aadhar, email, vehicle, flat, flatno};
                model.addRow(d);
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        f.setVisible(true);
    }

    public static void main(String[] args) {
        new MemberList();
    }
}