package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateCityCard extends JPanel{

    private Image background;

    public CreateCityCard(){
        Main.newWindow.setVisible(true);
        setPreferredSize(new Dimension(Window.WIDTH, Window.HEIGHT));
        setFocusable(true);
        setLayout(null);
        loadBackground();



        ///////////////////////////   TITLE    /////////////////////////////////////

        JLabel title = new JLabel("Wyrabianie Karty Miejskiej");
        title.setFont(new Font("Arial", Font.BOLD, 40));
        title.setBounds(Window.WIDTH/2 - 350, 30 , 650, 100);
        title.setForeground(Color.white);
        add(title);


        ///////////////////////////   MAIN PANEL    /////////////////////////////////////

        JPanel contactPanel = new JPanel();
        contactPanel.setSize(500,450);
        contactPanel.setLocation(Window.WIDTH/2 - 250, 200);
        contactPanel.setLayout(null);
        contactPanel.setBackground(new Color(0,0,0,30));
        contactPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        add(contactPanel);

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

        ButtonGroup cardType = new ButtonGroup();

        JRadioButton normalDisposable = new JRadioButton("Normalny");
        normalDisposable.setBounds(Window.WIDTH/2 - 100, 370, 100,30);
        add(normalDisposable);
        cardType.add(normalDisposable);

        JRadioButton normalHour = new JRadioButton("Zniżkowy");
        normalHour.setBounds(Window.WIDTH/2, 370, 100,30);
        add(normalHour);
        cardType.add(normalHour);



        ///////////////////////////   BUTTONS    /////////////////////////////////////

        //  CREATE CITY CARD
        JButton createButton = new JButton("Utwórz Kartę");
        createButton.setBounds(Window.WIDTH/2 - 80, Window.HEIGHT-200, 160, 30);
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(createButton);

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
