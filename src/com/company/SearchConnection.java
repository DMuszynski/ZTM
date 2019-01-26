package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchConnection extends JPanel{

    private Image background;

    public SearchConnection(){
        Main.newWindow.setVisible(true);
        setPreferredSize(new Dimension(Window.WIDTH, Window.HEIGHT));
        setFocusable(true);
        setLayout(null);
        loadBackground();



        ///////////////////////////   TITLE    /////////////////////////////////////

        JLabel title = new JLabel("Szukaj połączenia");
        title.setFont(new Font("Arial", Font.BOLD, 40));
        title.setBounds(Window.WIDTH/2-220, 30 , 440, 100);
        title.setForeground(Color.white);
        add(title);



        ///////////////////////////   INPUT FIELDS    /////////////////////////////////////

        //  FROM
        JTextField beginField = new JTextField("Przystanek początkowy", 30);
        beginField.setBounds(100, 150, 400, 50);
        add(beginField);

        //  TO
        JTextField endField = new JTextField("Przystanek końcowy", 30);
        endField.setBounds(100, 210, 400, 50);
        add(endField);

        //  AUTOBUS
        JCheckBox busCheckbox = new JCheckBox("Autobusy");
        busCheckbox.setBounds(100, 270, 100, 20);
        add(busCheckbox);

        // TRAM
        JCheckBox tramCheckbox = new JCheckBox("Tramwaje");
        tramCheckbox.setBounds(210, 270, 100, 20);
        add(tramCheckbox);

        // SEARCH BUTTON
        JButton searchButton = new JButton("Szukaj");
        searchButton.setBounds(250, 320, 100, 40);
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(searchButton);


        ///////////////////////////   INPUT FIELDS    /////////////////////////////////////

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
