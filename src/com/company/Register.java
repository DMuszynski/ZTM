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



        /*
            TITTLE
        */
        JLabel title = new JLabel("ZTM");
        title.setFont(new Font("Arial", Font.BOLD, 70));
        title.setBounds(Window.WIDTH/2 - 85, 80 , 170, 100);
        title.setForeground(Color.white);
        add(title);





        ///////////////////////////   INPUT FIELDS    /////////////////////////////////////

        // DANE OSOBOWE
        JLabel personalDataLabel = new JLabel("Dane osobowe");
        personalDataLabel.setFont(new Font("Arial", Font.BOLD, 25));
        personalDataLabel.setBounds(Window.WIDTH/2 - 110, Window.HEIGHT/2 - 160 , 220, 20);
        personalDataLabel.setForeground(Color.white);
        add(personalDataLabel);

        //  NAME FIELD
        JTextField nameField = new JTextField("Imię", 30);
        nameField.setBounds(Window.WIDTH/2 - 130, Window.HEIGHT/2 - 120, 260, 40);
        add(nameField);

        //  SURNAME FIELD
        JTextField surnameField = new JTextField("Nazwisko", 30);
        surnameField.setBounds(Window.WIDTH/2 - 130, Window.HEIGHT/2 - 75, 260, 40);
        add(surnameField);

        //  BIRTH FIELD
        DateFormat format = new SimpleDateFormat("yyyy--MMMM--dd");
        JTextField birthField = new JTextField("Data urodzenia (TODO)");
        birthField.setBounds(Window.WIDTH/2 - 130, Window.HEIGHT/2 - 30, 260, 40);
        add(birthField);

        //  ADDRESS FIELD
        JTextField emailField = new JTextField("E-Mail", 30);
        emailField.setBounds(Window.WIDTH/2 - 130, Window.HEIGHT/2 + 95, 260, 40);
        add(emailField);

        // DANE KONTAKTOWE
        JLabel contactDataLabel = new JLabel("Dane kontaktowe");
        contactDataLabel.setFont(new Font("Arial", Font.BOLD, 25));
        contactDataLabel.setBounds(Window.WIDTH/2 - 125, Window.HEIGHT/2 + 60 , 250, 20);
        contactDataLabel.setForeground(Color.white);
        add(contactDataLabel);

        //  PHONE FIELD
        JTextField phoneField = new JTextField("Telefon", 30);
        phoneField.setBounds(Window.WIDTH/2 - 130, Window.HEIGHT/2 + 140, 260, 40);
        add(phoneField);

        //  ADDRESS FIELD
        JTextField addressField = new JTextField("Adres zamieszkania", 30);
        addressField.setBounds(Window.WIDTH/2 - 130, Window.HEIGHT/2 + 185, 260, 40);
        add(addressField);




        /////   ACTION BUTTONS   /////

        //NEXT
        JButton nextButton = new JButton("Dalej");
        nextButton.setBounds(Window.WIDTH/2 - 50, Window.HEIGHT - 115, 100, 30);
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setContentPane(new RegisterCredentials());
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
