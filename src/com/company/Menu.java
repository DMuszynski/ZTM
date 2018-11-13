package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JPanel{

    private Image background;

    public Menu(){
        setVisible(true);
        setPreferredSize(new Dimension(Window.WIDTH, Window.HEIGHT));
        setFocusable(true);
        setLayout(null);

        //app title
        JLabel title = new JLabel("ZTM");
        title.setFont(new Font("Arial", Font.BOLD, 70));
        title.setBounds(Window.WIDTH/2 - 85, 80 , 170, 100);
        title.setForeground(Color.BLACK);
        add(title);

        //text filed
        JTextField usernameField = new JTextField("Użytkownik", 30);
        usernameField.setBounds(Window.WIDTH/2 - 130, Window.HEIGHT/2-100, 260, 40);
        add(usernameField);

        //password field
        JPasswordField passwordField = new JPasswordField("Hasło", 30);
        passwordField.setBounds(Window.WIDTH/2 - 130, Window.HEIGHT/2-60, 260, 40);
        add(passwordField);

        //login button
        JButton loginButton = new JButton("Zaloguj się");
        loginButton.setBounds(Window.WIDTH/2 - 60, Window.HEIGHT/2-10, 120, 30);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        add(loginButton);

        //register button
        JButton registerButton = new JButton("Rejestracja");
        registerButton.setBounds(Window.WIDTH/2 - 60, Window.HEIGHT/2+25, 120, 30);
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        add(registerButton);

        //exit button
        JButton exitButton = new JButton("Wyjście");
        exitButton.setBounds(Window.WIDTH/2 - 50, Window.HEIGHT-50, 100, 30);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        add(exitButton);
    }

}


