package BankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Signuptwo extends JFrame implements ActionListener{

    JTextField panTextField, aadharTextField;
    JButton next;

    JComboBox religionBox, categoryBox, incomeBox, educationBox, occupationBox;
    JRadioButton syes,sno,eyes,eno;
    String formNo;

    Signuptwo(String formNo){
        this.formNo = formNo;

        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");


        JLabel additionalDetails = new JLabel("Page 2 - Additional Details");
        additionalDetails.setFont(new Font("Raleway" , Font.BOLD , 22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);

        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway" , Font.BOLD , 20));
        religion.setBounds(100,140,100,30);
        add(religion);

        String[] valReligion = {"Hindu" , "Muslim" , "Sikh" , "Christian" , "Other"};
        religionBox = new JComboBox(valReligion);
        religionBox.setBounds(300,140,400,30);
        religionBox.setBackground(Color.WHITE);
        add(religionBox);

        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway" , Font.BOLD , 20));
        category.setBounds(100,190,200,30);
        add(category);

        String[] valCategory = {"General" , "OBC" , "SC/ST" , "Other"};
        categoryBox = new JComboBox(valCategory);
        categoryBox.setBounds(300,190,400,30);
        categoryBox.setBackground(Color.WHITE);
        add(categoryBox);

        JLabel income = new JLabel("Income");
        income.setFont(new Font("Raleway" , Font.BOLD , 20));
        income.setBounds(100,240,200,30);
        add(income);

        String[] valIncome = {"Null" , "<1,50,000" , "<2,50,000" , "<5,00,000" , "Upto 10,00,000"};
        incomeBox = new JComboBox(valIncome);
        incomeBox.setBounds(300,240,400,30);
        incomeBox.setBackground(Color.WHITE);
        add(incomeBox);

        JLabel education = new JLabel("Educational");
        education.setFont(new Font("Raleway" , Font.BOLD , 20));
        education.setBounds(100,290,200,30);
        add(education);

        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway" , Font.BOLD , 20));
        qualification.setBounds(100,315,200,30);
        add(qualification);

        String[] valEducation = {"High-School" , "Intermediate" , "Graduate" , "Post-Graduate" , "Others"};
        educationBox = new JComboBox(valEducation);
        educationBox.setBounds(300,315,400,30);
        educationBox.setBackground(Color.white);
        add(educationBox);

        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway" , Font.BOLD , 20));
        occupation.setBounds(100,370,200,30);
        add(occupation);

        String[] valOccupation = {"Salaried" , "Self-Employed" , "Business" , "Student" , "Retired" , "Others"};
        occupationBox = new JComboBox(valOccupation);
        occupationBox.setBounds(300,370,400,30);
        occupationBox.setBackground(Color.white);
        add(occupationBox);

        JLabel pan = new JLabel("Pan Number:");
        pan.setFont(new Font("Raleway" , Font.BOLD , 20));
        pan.setBounds(100,420,200,30);
        add(pan);

        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        panTextField.setBounds(300,420,400,30);
        add(panTextField);

        JLabel aadhar = new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway" , Font.BOLD , 20));
        aadhar.setBounds(100,470,200,30);
        add(aadhar);

        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        aadharTextField.setBounds(300,470,400,30);
        add(aadharTextField);

        JLabel seniorCitizen = new JLabel("Senior Citizen:");
        seniorCitizen.setFont(new Font("Raleway" , Font.BOLD , 20));
        seniorCitizen.setBounds(100,520,200,30);
        add(seniorCitizen);

        syes = new JRadioButton("Yes");
        syes.setBounds(300,520,100,30);
        syes.setBackground(Color.white);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(500,520,100,30);
        sno.setBackground(Color.white);
        add(sno);

        ButtonGroup seniorCGroup = new ButtonGroup();
        seniorCGroup.add(syes);
        seniorCGroup.add(sno);

        JLabel existAccount = new JLabel("Existing Account:");
        existAccount.setFont(new Font("Raleway" , Font.BOLD , 20));
        existAccount.setBounds(100,570,200,30);
        add(existAccount);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,570,100,30);
        eyes.setBackground(Color.white);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(500,570,100,30);
        eno.setBackground(Color.white);
        add(eno);

        ButtonGroup existGroup = new ButtonGroup();
        existGroup.add(eyes);
        existGroup.add(eno);



        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway" , Font.BOLD , 14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        setSize(850,800);
        setLocation(350,20);

    }

    public void actionPerformed(ActionEvent ae) {
        String religion = (String) (religionBox.getSelectedItem());
        String category = (String) (categoryBox.getSelectedItem());
        String income = (String) (incomeBox.getSelectedItem());
        String education = (String) (educationBox.getSelectedItem());
        String occupation = (String) (occupationBox.getSelectedItem());
        String pan = panTextField.getText();
        String aadhar = aadharTextField.getText();
        String seniorcitizen = null;
        if (syes.isSelected()) {
            seniorcitizen = "Yes";
        } else if (sno.isSelected()) {
            seniorcitizen = "No";
        }

        String eAccount = null;
        if (eyes.isSelected()) {
            eAccount = "Yes";
        } else if (eno.isSelected()) {
            eAccount = "No";
        }

        try {
            Conn c = new Conn();
            String query = "insert into signuptwo values('"+formNo+"' , '"+religion+"' , '"+category+"' , '"+income+"' , '"+education+"' , '"+occupation+"' , '"+pan+"' , '"+aadhar+"' , '"+seniorcitizen+"' , '"+eAccount+"')";
            c.s.executeUpdate(query);

            setVisible(false);
            new Signupthree(formNo).setVisible(true);

        } catch (Exception e) {
            System.out.println(e);
        }
    }


        public static void main(String[] args) {
        new Signuptwo("");
    }
}
