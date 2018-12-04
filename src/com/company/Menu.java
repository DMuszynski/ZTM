package com.company;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Menu extends JPanel{

    private Image background;

    public Menu(){

        setVisible(true);
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
        exitButton.setBounds(Window.WIDTH/2 - 50, Window.HEIGHT-80, 100, 30);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        add(exitButton);
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


