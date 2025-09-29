package BankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Signupthree extends JFrame implements ActionListener {

    JRadioButton sAccount, fdAccount, cAccount, rdAccount;
    JCheckBox atmCard, internetBanking, mobileBanking, alerts, chequeB, e_statement, declaration;

    JButton submit,cancel;
    String formNo;

    Signupthree(String formNo){

        this.formNo = formNo;

        setLayout(null);

        JLabel l1 = new JLabel("Page 3 : ACCOUNT DETAILS");
        l1.setFont(new Font("Raleway" , Font.BOLD , 22));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);

        sAccount = new JRadioButton("Savings Account");
        sAccount.setFont(new Font("Raleway" , Font.BOLD , 16));
        sAccount.setBackground(Color.WHITE);
        sAccount.setBounds(100,180,250,20);
        add(sAccount);

        fdAccount = new JRadioButton("Fixed Deposit Account");
        fdAccount.setFont(new Font("Raleway" , Font.BOLD, 16));
        fdAccount.setBackground(Color.white);
        fdAccount.setBounds(350,180,250,20);
        add(fdAccount);

        cAccount = new JRadioButton("Curent Account");
        cAccount.setFont(new Font("Raleway", Font.BOLD, 16));
        cAccount.setBackground(Color.white);
        cAccount.setBounds(100,220,250,20);
        add(cAccount);

        rdAccount = new JRadioButton("Recurring Deposit Account");
        rdAccount.setFont(new Font("Raleway", Font.BOLD, 16));
        rdAccount.setBackground(Color.white);
        rdAccount.setBounds(350,220,250,20);
        add(rdAccount);

        ButtonGroup groupAccount = new ButtonGroup();
        groupAccount.add(sAccount);
        groupAccount.add(fdAccount);
        groupAccount.add(cAccount);
        groupAccount.add(rdAccount);

        JLabel cardNo = new JLabel("Card Number:");
        cardNo.setFont(new Font("Raleway", Font.BOLD, 22));
        cardNo.setBounds(100,300,200,30);
        add(cardNo);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-4248");
        number.setFont(new Font("Raleway" , Font.BOLD , 22));
        number.setBounds(330,300,300,30);
        add(number);

        JLabel cardDetail = new JLabel("Your 16 Digit Card Number");
        cardDetail.setFont(new Font("Raleway" , Font.BOLD,12));
        cardDetail.setBounds(100,330,200,20);
        add(cardDetail);

        JLabel pin = new JLabel("Pin:");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100,370,200,30);
        add(pin);

        JLabel pNum = new JLabel("XXXX");
        pNum.setFont(new Font("Raleway", Font.BOLD, 22));
        pNum.setBounds(330,370,200,30);
        add(pNum);

        JLabel pinDetail = new JLabel("Your 4 Digit Pin");
        pinDetail.setFont(new Font("Raleway" , Font.BOLD,12));
        pinDetail.setBounds(100,400,250,20);
        add(pinDetail);

        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100,450,300,30);
        add(services);

        atmCard = new JCheckBox("ATM Card");
        atmCard.setBackground(Color.white);
        atmCard.setFont(new Font("Raleway" , Font.BOLD , 16));
        atmCard.setBounds(100,500,200,20);
        add(atmCard);

        internetBanking = new JCheckBox("Internet Banking");
        internetBanking.setBackground(Color.white);
        internetBanking.setFont(new Font("Raleway" , Font.BOLD, 16));
        internetBanking.setBounds(400,500,200,20);
        add(internetBanking);

        mobileBanking = new JCheckBox("Mobile Banking");
        mobileBanking.setBackground(Color.white);
        mobileBanking.setFont(new Font("Raleway" , Font.BOLD , 16));
        mobileBanking.setBounds(100,540,200,20);
        add(mobileBanking);

        alerts = new JCheckBox("Email & SMS Alerts");
        alerts.setBackground(Color.white);
        alerts.setFont(new Font("Raleway" , Font.BOLD , 16));
        alerts.setBounds(400,540,200,20);
        add(alerts);

        chequeB = new JCheckBox("Cheque Book");
        chequeB.setBackground(Color.white);
        chequeB.setFont(new Font("Raleway" , Font.BOLD , 16));
        chequeB.setBounds(100,580,200,20);
        add(chequeB);

        e_statement = new JCheckBox("E-Statement");
        e_statement.setBackground(Color.white);
        e_statement.setFont(new Font("Raleway" , Font.BOLD , 16));
        e_statement.setBounds(400,580,200,20);
        add(e_statement);

        declaration = new JCheckBox("I hereby declare that all the above enetered details are correct to my knowledge.");
        declaration.setBackground(Color.white);
        declaration.setFont(new Font("Raleway" , Font.BOLD , 13));
        declaration.setBounds(100,650,1000,20);
        add(declaration);

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.white);
        submit.setFont(new Font("Raleway" , Font.BOLD , 13));
        submit.setBounds(270,700,100,30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("Raleway" , Font.BOLD , 13));
        cancel.setBounds(450,700,100,30);
        cancel.addActionListener(this);
        add(cancel);





        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        setSize(850,800);
        setLocation(350,20);


    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String accountType = null;
            if(sAccount.isSelected()){
                accountType = "Savings Account";
            }else if(fdAccount.isSelected()){
                accountType = "Fixed Deposit Account";
            }else if(cAccount.isSelected()){
                accountType = "Current Account";
            } else if (rdAccount.isSelected()) {
                accountType = "Recurring Deposit Account";
            }

            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000L + 504093600000000L));
            String pinnumber = "" + Math.abs((random.nextLong()%9000L+1000L));

            String facility = "";

            if(atmCard.isSelected()){
                facility = facility + " ATM Card";
            }else if(internetBanking.isSelected()){
                facility = facility + " Internet Banking";
            }else if(mobileBanking.isSelected()){
                facility = facility + " Mobile Bankling";
            }else if(alerts.isSelected()){
                facility = facility + " Email & SMS Alerts";
            }else if(chequeB.isSelected()){
                facility = facility + " Cheque Book";
            }else if(e_statement.isSelected()){
                facility = facility + " E-Statement";
            }

            try{
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null, "Account Type is Required");
                }else{
                    Conn conn = new Conn();
                    String query1 = "insert into signupthree values('"+formNo+"' , '"+accountType+"', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"')";
                    String query2 = "insert into login values('"+formNo+"' , '"+cardnumber+"', '"+pinnumber+"')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);

                    JOptionPane.showMessageDialog(null,"Card Number: " + cardnumber + "\n Pin: " +pinnumber);

                    setVisible(false);
                    new Deposit(pinnumber).setVisible(true);
                }

            }catch(Exception e){
                System.out.println(e);
            }

        }else if(ae.getSource()==cancel){
            setVisible(false);
            new Login().setVisible(true);
        }

    }

    public static void main(String[] args){
        new Signupthree("");
    }
}
