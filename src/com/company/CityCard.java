package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CityCard extends JPanel{

    private Image background;

    public CityCard(){
        Main.newWindow.setVisible(true);
        setPreferredSize(new Dimension(Window.WIDTH, Window.HEIGHT));
        setFocusable(true);
        setLayout(null);
        loadBackground();



        ///////////////////////////   TITLE    /////////////////////////////////////

        JLabel title = new JLabel("Karta Miejska");
        title.setFont(new Font("Arial", Font.BOLD, 40));
        title.setBounds(Window.WIDTH/2 - 170, 30 , 340, 100);
        title.setForeground(Color.white);
        add(title);


        ///////////////////////////   INFO PANEL    /////////////////////////////////////

        JPanel cardInfoPanel = new JPanel();
        cardInfoPanel.setSize(500,450);
        cardInfoPanel.setLocation(70, 200);
        cardInfoPanel.setLayout(null);
        cardInfoPanel.setBackground(new Color(0,0,0,30));
        cardInfoPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        add(cardInfoPanel);

        JLabel contactPanelLabel = new JLabel("Informacje");
        contactPanelLabel.setFont(new Font("Arial", Font.BOLD, 30));
        contactPanelLabel.setBounds(cardInfoPanel.getBounds().width/2-100, 20 , 200, 50);
        contactPanelLabel.setForeground(new Color(14, 165, 191, 248));
        cardInfoPanel.add(contactPanelLabel);

        JLabel cardInfoPanelContent = new JLabel();
        cardInfoPanelContent.setText("" +
                "<html>" +
                " <center> <u>Właściciel</u> <br><br> " +
                "Jan Kowalski </center> <br><br>" +
                " <center> <u>Data ważności</u><br><br>" +
                " 29.01.2020" +
                "</html>");
        cardInfoPanelContent.setFont(new Font("Arial", Font.BOLD, 24));
        cardInfoPanelContent.setBounds(cardInfoPanel.getBounds().width/2-100, 80 , 400, 350);
        cardInfoPanelContent.setForeground(Color.white);
        cardInfoPanel.add(cardInfoPanelContent);


        ///////////////////////////   OPERATION PANEL    /////////////////////////////////////

        JPanel ticketInfoPanel = new JPanel();
        ticketInfoPanel.setSize(500,450);
        ticketInfoPanel.setLocation(Window.WIDTH-570, 200);
        ticketInfoPanel.setLayout(null);
        ticketInfoPanel.setBackground(new Color(0,0,0,30));
        ticketInfoPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));;
        add(ticketInfoPanel);

        JLabel ticketInfoPanelLabel = new JLabel("Operacje");
        ticketInfoPanelLabel.setFont(new Font("Arial", Font.BOLD, 30));
        ticketInfoPanelLabel.setBounds(ticketInfoPanel.getBounds().width/2-100, 20 , 200, 50);
        ticketInfoPanelLabel.setForeground(new Color(14, 165, 191, 248));
        ticketInfoPanel.add(ticketInfoPanelLabel);

        // LOAD
        JButton loadButton = new JButton("Doładuj");
        loadButton.setBounds(ticketInfoPanel.getBounds().x + ticketInfoPanel.getBounds().width/2 - 75, ticketInfoPanel.getBounds().y + ticketInfoPanel.getBounds().height/2 + 75, 150, 50);
        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(loadButton);

        // DEACTIVE
        JButton deactiveCardButton = new JButton("Deaktywuj");
        deactiveCardButton.setBounds(ticketInfoPanel.getBounds().x + ticketInfoPanel.getBounds().width/2 - 75, ticketInfoPanel.getBounds().y + ticketInfoPanel.getBounds().height/2 - 75, 150, 50);
        deactiveCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(deactiveCardButton);


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
