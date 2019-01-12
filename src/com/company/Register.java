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



        /*
            INPUT FIELDS
         */

        //  NAME FIELD
        JTextField nameField = new JTextField("Imię", 30);
        nameField.setBounds(Window.WIDTH/2 - 130, Window.HEIGHT/2 - 160, 260, 40);
        add(nameField);

        //  SURNAME FIELD
        JTextField surnameField = new JTextField("Nazwisko", 30);
        surnameField.setBounds(Window.WIDTH/2 - 130, Window.HEIGHT/2 - 115, 260, 40);
        add(surnameField);

        //  BIRTH FIELD
        DateFormat format = new SimpleDateFormat("yyyy--MMMM--dd");
        JFormattedTextField birthField = new JFormattedTextField(format);
        birthField.setBounds(Window.WIDTH/2 - 130, Window.HEIGHT/2 - 70, 260, 40);
        add(birthField);

        //  ADDRESS FIELD
        JTextField addressField = new JTextField("Adres", 30);
        addressField.setBounds(Window.WIDTH/2 - 130, Window.HEIGHT/2 - 25, 260, 40);
        add(addressField);

        //  PHONE FIELD
        JTextField phoneField = new JTextField("Telefon", 30);
        phoneField.setBounds(Window.WIDTH/2 - 130, Window.HEIGHT/2 + 20, 260, 40);
        add(phoneField);



        //  E-MAIL FIELD
        JTextField emailField = new JTextField("E-Mail", 30);
        emailField.setBounds(Window.WIDTH/2 - 130, Window.HEIGHT/2 + 120, 260, 40);
        add(emailField);

        //  PASSWORD FIELD
        JPasswordField passwordField = new JPasswordField("Hasło", 30);
        passwordField.setBounds(Window.WIDTH/2 - 130, Window.HEIGHT/2 + 165, 260, 40);
        add(passwordField);

        // REPEAT PASSWORD FIELD
        JPasswordField passwordRepeatField = new JPasswordField("Hasło", 30);
        passwordRepeatField.setBounds(Window.WIDTH/2 - 130, Window.HEIGHT/2 + 210, 260, 40);
        add(passwordRepeatField);


        /*
            ACTION BUTTONS
        */

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
