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
    private Image phone;

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
        loginButton.setBounds(Window.WIDTH/2 - 60, (Window.HEIGHT/2-25) - 20, 120, 50);
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
        registerButton.setBounds(Window.WIDTH/2 - 60, (Window.HEIGHT/2-25) + 40, 120, 50);
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
        JButton timetableButton = new JButton(new ImageIcon("images/timetable_icon.png"));
        timetableButton.setBounds( (Window.WIDTH/2-100) - 400, Window.HEIGHT - 550, 200, 200);
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
        JButton tarrifButton = new JButton( new ImageIcon("images/ticket_icon.png"));
        tarrifButton.setBounds( (Window.WIDTH/2-100) + 400, Window.HEIGHT - 550, 200, 200);
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
        JButton searchConnectionButton = new JButton(new ImageIcon("images/search_icon.png"));
        searchConnectionButton.setBounds((Window.WIDTH/2-100) - 400, Window.HEIGHT - 300, 200, 200);
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
        JButton contactButton = new JButton(new ImageIcon("images/phone_icon.png"));
        contactButton.setBounds((Window.WIDTH/2-100) + 400, Window.HEIGHT - 300, 200, 200);
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


