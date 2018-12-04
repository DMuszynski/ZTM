package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Menu extends JPanel{

    private Image background;

    public Menu(){

        setVisible(true);
        setPreferredSize(new Dimension(Window.WIDTH, Window.HEIGHT));
        setFocusable(true);
        setLayout(null);

        /*
            TITTLE
        */
        JLabel title = new JLabel("ZTM");
        title.setFont(new Font("Arial", Font.BOLD, 70));
        title.setBounds(Window.WIDTH/2 - 85, 80 , 170, 100);
        title.setForeground(Color.BLACK);
        add(title);





        /*
            ACTION BUTTONS
        */

        //LOGIN
        JButton loginButton = new JButton("Logowanie");
        loginButton.setBounds(Window.WIDTH/2 - 60, Window.HEIGHT/2-50, 120, 30);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setVisible(false);
                Main.newWindow.setContentPane(new Login());
                Main.newWindow.revalidate();
            }
        });
        add(loginButton);


        //REGISTER
        JButton registerButton = new JButton("Rejestracja");
        registerButton.setBounds(Window.WIDTH/2 - 60, Window.HEIGHT/2-10, 120, 30);
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setVisible(false);
                Main.newWindow.setContentPane(new Register());
                Main.newWindow.revalidate();
            }
        });
        add(registerButton);


        //TIMETABLE
        JButton timetableButton = new JButton("Rozkład Jazdy");
        timetableButton.setBounds(Window.WIDTH/2 - 90, Window.HEIGHT/2+30, 180, 30);
        timetableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setVisible(false);
                Main.newWindow.setContentPane(new Timetable());
                Main.newWindow.revalidate();
            }
        });
        add(timetableButton);


        //TARRIF
        JButton tarrifButton = new JButton("Bilety");
        tarrifButton.setBounds(Window.WIDTH/2 - 90, Window.HEIGHT/2+70, 180, 30);
        tarrifButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setVisible(false);
                Main.newWindow.setContentPane(new Tarrif());
                Main.newWindow.revalidate();
            }
        });
        add(tarrifButton);


        //SEARCH CONNECTION
        JButton searchConnectionButton = new JButton("Wyszukaj połączenie");
        searchConnectionButton.setBounds(Window.WIDTH/2 - 90, Window.HEIGHT/2+110, 180, 30);
        searchConnectionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setVisible(false);
                Main.newWindow.setContentPane(new SearchConnection());
                Main.newWindow.revalidate();
            }
        });
        add(searchConnectionButton);


        //CONTACT
        JButton contactButton = new JButton("Kontakt");
        contactButton.setBounds(Window.WIDTH/2 - 90, Window.HEIGHT/2+150, 180, 30);
        contactButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setVisible(false);
                Main.newWindow.setContentPane(new Contact());
                Main.newWindow.revalidate();
            }
        });
        add(contactButton);


        //EXIT
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


