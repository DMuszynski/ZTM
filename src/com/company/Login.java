package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JPanel{

    public Login(){



        Main.newWindow.setVisible(true);
        setPreferredSize(new Dimension(Window.WIDTH, Window.HEIGHT));
        setFocusable(true);
        setLayout(null);



        /*
            INPUT FIELDS
        */

        //  USERNAME TEXT FIELD
        JTextField usernameField = new JTextField("Użytkownik", 30);
        usernameField.setBounds(Window.WIDTH/2 - 130, Window.HEIGHT/2-100, 260, 40);
        add(usernameField);


        //  PASSWORD FIELD
        JPasswordField passwordField = new JPasswordField("Hasło", 30);
        passwordField.setBounds(Window.WIDTH/2 - 130, Window.HEIGHT/2-60, 260, 40);
        add(passwordField);





        /*
            ACTION BUTTONS
         */

        //LOGIN BUTTON
        JButton loginButton = new JButton("Zaloguj się");
        loginButton.setBounds(Window.WIDTH/2 - 60, Window.HEIGHT/2-10, 120, 30);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        add(loginButton);


        //REGISTER BUTTON
        JButton registerButton = new JButton("Rejestracja");
        registerButton.setBounds(Window.WIDTH/2 - 60, Window.HEIGHT/2+25, 120, 30);
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setContentPane(new Register());
                Main.newWindow.revalidate();
            }
        });
        add(registerButton);


        //BACK
        JButton backButton = new JButton("Powrót");
        backButton.setBounds(Window.WIDTH/2 - 50, Window.HEIGHT-50, 100, 30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(backButton);
    }
}
