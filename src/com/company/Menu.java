package com.company;
import com.company.panels.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JPanel{

    private Image background;
    private Image phone;

    public Menu(){

        setVisible(true);
        setPreferredSize(new Dimension(Window.WIDTH, Window.HEIGHT));
        setFocusable(true);
        setLayout(null);
        loadBackground();


        ///////////////////////////   TITLE   /////////////////////////////////////

        JLabel title = new JLabel("ZTM");
        title.setFont(new Font("Arial", Font.BOLD, 70));
        title.setBounds(Window.WIDTH/2 - 85, 80 , 170, 100);
        title.setForeground(Color.white);
        add(title);





        ///////////////////////////   LOGIN    /////////////////////////////////////

        //  MAIL TEXT FIELD
        JTextField loginField = new JTextField("Login", 30);
        loginField.setBounds(Window.WIDTH/2 - 130, Window.HEIGHT/2-150, 260, 40);
        add(loginField);


        //  PASSWORD FIELD
        JTextField passwordField = new JPasswordField("Hasło", 30);
        passwordField.setBounds(Window.WIDTH/2 - 130, Window.HEIGHT/2-110, 260, 40);
        add(passwordField);



        /////// ACTION BUTTONS /////

        //LOGIN BUTTON
        JButton loginButton = new JButton("Zaloguj się");
        loginButton.setBounds(Window.WIDTH/2 - 60, Window.HEIGHT/2-50, 120, 30);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String username = loginField.getText();
                String password = passwordField.getText();

                Main.newWindow.setContentPane(new AdminPanel());
                Main.newWindow.revalidate();
            }
        });
        add(loginButton);


        //REGISTER BUTTON
        JButton registerButton = new JButton("Rejestracja");
        registerButton.setBounds(Window.WIDTH/2 - 60, Window.HEIGHT/2-5, 120, 30);
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setContentPane(new Register());
                Main.newWindow.revalidate();
            }
        });
        add(registerButton);





        ///////////////////////////   BUTTONS    /////////////////////////////////////


        // SEARCH CONNECTION
        JButton searchConnectionButton = new JButton(new ImageIcon("images/search_icon.png"));
        searchConnectionButton.setBounds((Window.WIDTH/2-90) - 400, Window.HEIGHT - 320, 180,180);
        searchConnectionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setVisible(false);
                Main.newWindow.setContentPane(new SearchConnection());
                Main.newWindow.revalidate();
            }
        });
        add(searchConnectionButton);
        JLabel searchConnectionLabel = new JLabel();
        searchConnectionLabel.setText("<html><center>Wyszukaj połączenie</center></html>");
        searchConnectionLabel.setFont(new Font("Arial", Font.BOLD, 18));
        searchConnectionLabel.setBounds(searchConnectionButton.getBounds().x, searchConnectionButton.getBounds().y + 185, 180, 60);
        searchConnectionLabel.setForeground(Color.white);
        add(searchConnectionLabel);



        //TIMETABLE
        JButton timetableButton = new JButton(new ImageIcon("images/timetable_icon.png"));
        timetableButton.setBounds( (Window.WIDTH/2-90), Window.HEIGHT - 320, 180,180);
        timetableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setVisible(false);
                Main.newWindow.setContentPane(new Timetable());
                Main.newWindow.revalidate();
            }
        });
        add(timetableButton);
        JLabel timetableLabel = new JLabel();
        timetableLabel.setText("<html><center>Rozkład jazdy ZTM</center></html>");
        timetableLabel.setFont(new Font("Arial", Font.BOLD, 18));
        timetableLabel.setBounds(timetableButton.getBounds().x, timetableButton.getBounds().y + 185, 180, 60);
        timetableLabel.setForeground(Color.white);
        add(timetableLabel);



        // INFORMATION
        JButton informationButton = new JButton(new ImageIcon("images/info_icon.png"));
        informationButton.setBounds((Window.WIDTH/2-90) + 400, Window.HEIGHT - 320, 180, 180);
        informationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setVisible(false);
                Main.newWindow.setContentPane(new Information());
                Main.newWindow.revalidate();
            }
        });
        add(informationButton);
        JLabel informationLabel = new JLabel();
        informationLabel.setText("<html><center>Informacja i Kontakt</center></html>");
        informationLabel.setFont(new Font("Arial", Font.BOLD, 18));
        informationLabel.setBounds(informationButton.getBounds().x, informationButton.getBounds().y + 185, 180, 60);
        informationLabel.setForeground(Color.white);
        add(informationLabel);



        ///////////////////////////   EXIT    /////////////////////////////////////

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



    ///////////////////////////   BUTTONS    /////////////////////////////////////

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


