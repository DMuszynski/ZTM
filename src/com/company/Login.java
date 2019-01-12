package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JPanel{

    private Image background;

    public Login(){



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

        //  MAIL TEXT FIELD
        JTextField emailField = new JTextField("E-Mail", 30);
        emailField.setBounds(Window.WIDTH/2 - 130, Window.HEIGHT/2-100, 260, 40);
        add(emailField);


        //  PASSWORD FIELD
        JPasswordField passwordField = new JPasswordField("Hasło", 30);
        passwordField.setBounds(Window.WIDTH/2 - 130, Window.HEIGHT/2-60, 260, 40);
        add(passwordField);





        /*
            ACTION BUTTONS
         */

        //LOGIN BUTTON
        JButton loginButton = new JButton("Zaloguj się");
        loginButton.setBounds(Window.WIDTH/2 - 60, Window.HEIGHT/2, 120, 30);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        add(loginButton);


        //REGISTER BUTTON
        JButton registerButton = new JButton("Rejestracja");
        registerButton.setBounds(Window.WIDTH/2 - 60, Window.HEIGHT/2+45, 120, 30);
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
