package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Register extends JPanel{

    private Image background;

    public Register(){

        Main.newWindow.setVisible(true);
        setPreferredSize(new Dimension(Window.WIDTH, Window.HEIGHT));
        setFocusable(true);
        setLayout(null);
        loadBackground();



        ///////////////////////////   TITLE    /////////////////////////////////////

        JLabel title = new JLabel("Rejestracja");
        title.setFont(new Font("Arial", Font.BOLD, 40));
        title.setBounds(Window.WIDTH/2 - 135, 80 , 270, 50);
        title.setForeground(Color.white);
        add(title);



        ///////////////////////////   INPUT FIELDS    /////////////////////////////////////

        // DANE OSOBOWE
        JLabel personalDataLabel = new JLabel("Dane osobowe");
        personalDataLabel.setFont(new Font("Arial", Font.BOLD, 25));
        personalDataLabel.setBounds(500 - 130, Window.HEIGHT/2 - 190 , 220, 20);
        personalDataLabel.setForeground(Color.white);
        add(personalDataLabel);

        //  NAME FIELD
        JTextField nameField = new JTextField("Imię", 30);
        nameField.setBounds(500-130, Window.HEIGHT/2 - 150, 260, 40);
        add(nameField);

        //  SURNAME FIELD
        JTextField surnameField = new JTextField("Nazwisko", 30);
        surnameField.setBounds(500-130, Window.HEIGHT/2 - 105, 260, 40);
        add(surnameField);

        //  BIRTH FIELD
        DateFormat format = new SimpleDateFormat("yyyy--MMMM--dd");
        JFormattedTextField birthField = new JFormattedTextField(format);
        birthField.setBounds(500-130, Window.HEIGHT/2 - 60, 260, 40);
        add(birthField);



        // DANE KONTAKTOWE
        JLabel contactDataLabel = new JLabel("Dane kontaktowe");
        contactDataLabel.setFont(new Font("Arial", Font.BOLD, 25));
        contactDataLabel.setBounds(500-125, Window.HEIGHT/2 + 30 , 250, 20);
        contactDataLabel.setForeground(Color.white);
        add(contactDataLabel);

        //  E-MAIL FIELD
        JTextField emailField = new JTextField("E-Mail", 30);
        emailField.setBounds(500-130, Window.HEIGHT/2 + 65, 260, 40);
        add(emailField);

        //  PHONE FIELD
        JTextField phoneField = new JTextField("Telefon", 30);
        phoneField.setBounds(500-130, Window.HEIGHT/2 + 110, 260, 40);
        add(phoneField);

        //  ADDRESS FIELD
        JTextField addressField = new JTextField("Adres zamieszkania", 30);
        addressField.setBounds(500-130, Window.HEIGHT/2 + 155, 260, 40);
        add(addressField);



        // DANE LOGOWANIA
        JLabel credentialsDataLabel = new JLabel("Dane do logowania");
        credentialsDataLabel.setFont(new Font("Arial", Font.BOLD, 25));
        credentialsDataLabel.setBounds(Window.WIDTH - 640, Window.HEIGHT/2 - 190 , 280, 30);
        credentialsDataLabel.setForeground(Color.white);
        add(credentialsDataLabel);

        //  USERNAME FIELD
        JTextField usernameField = new JTextField("Nazwa użytkownika", 30);
        usernameField.setBounds(Window.WIDTH - 630, Window.HEIGHT/2 - 150, 260, 40);
        add(usernameField);

        //  PASSWORD FIELD
        JTextField passwordField = new JTextField("Hasło", 30);
        passwordField.setBounds(Window.WIDTH - 630, Window.HEIGHT/2 - 105, 260, 40);
        add(passwordField);

        //  PASSWORD REPEAT FIELD
        JTextField passwordRepeatField = new JTextField("Powtórz hasło");
        passwordRepeatField.setBounds(Window.WIDTH - 630, Window.HEIGHT/2 - 60, 260, 40);
        add(passwordRepeatField);



        // DANE PŁATNOŚCI
        JLabel paymentDataLabel = new JLabel("Dane płatności");
        paymentDataLabel.setFont(new Font("Arial", Font.BOLD, 25));
        paymentDataLabel.setBounds(Window.WIDTH - 620, Window.HEIGHT/2 + 30 , 240, 30);
        paymentDataLabel.setForeground(Color.white);
        add(paymentDataLabel);

        //  BANK NAME
        JTextField bankName = new JTextField("Bank", 30);
        bankName.setBounds(Window.WIDTH - 630, Window.HEIGHT/2 + 65, 260, 40);
        add(bankName);

        //  ACCOUNT NUMBER
        JTextField accountNumber = new JTextField("Numer konta");
        accountNumber.setBounds(Window.WIDTH - 630, Window.HEIGHT/2 + 110, 260, 40);
        add(accountNumber);



        /////   ACTION BUTTONS   /////

        //  REGISTER BUTTOON
        JButton nextButton = new JButton("Zarejestruj");
        nextButton.setBounds(Window.WIDTH/2 - 80, Window.HEIGHT - 115, 160, 30);
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String name = nameField.getText();
                String surname = surnameField.getText();
                String birthDate = birthField.getText();

                String email = emailField.getText();
                String phone = phoneField.getText();
                String address = addressField.getText();

                String user = usernameField.getText();
                String password = passwordField.getText();
                String passwordRepeat = passwordRepeatField.getText();

                String bank = bankName.getText();
                String number = accountNumber.getText();

                System.out.println(name+" "+surname+" "+birthDate+" "+email+" "+phone+" "+address+" "+user+" "+password+" "+passwordRepeat+" "+bank+" "+number);

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(nextButton);

        //BACK
        JButton backButton = new JButton("Powrót");
        backButton.setBounds(Window.WIDTH/2 - 50, Window.HEIGHT-80, 100, 30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(backButton);
    }

    /*
    DRAWING BACKGROUND
    */
        private void loadBackground(){
            ImageIcon bg = new ImageIcon("images/background.png");
            background = bg.getImage();
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            doDrawing(g);
            Toolkit.getDefaultToolkit().sync();
        }

        private void doDrawing(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            g.drawImage(background, 0, 0, null);
        }

}
