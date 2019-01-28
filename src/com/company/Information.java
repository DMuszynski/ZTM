package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Information extends JPanel{

    private Image background;

    public Information(){
        Main.newWindow.setVisible(true);
        setPreferredSize(new Dimension(Window.WIDTH, Window.HEIGHT));
        setFocusable(true);
        setLayout(null);
        loadBackground();



        ///////////////////////////   TITLE    /////////////////////////////////////

        JLabel title = new JLabel("Informacja");
        title.setFont(new Font("Arial", Font.BOLD, 40));
        title.setBounds(Window.WIDTH/2 - 130, 30 , 260, 100);
        title.setForeground(Color.white);
        add(title);



        ///////////////////////////   CONTACT PANEL    /////////////////////////////////////

        JPanel contactPanel = new JPanel();
        contactPanel.setSize(500,450);
        contactPanel.setLocation(70, 200);
        contactPanel.setLayout(null);
        contactPanel.setBackground(new Color(0,0,0,30));
        contactPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        add(contactPanel);

        JLabel contactPanelLabel = new JLabel("Kontakt");
        contactPanelLabel.setFont(new Font("Arial", Font.BOLD, 30));
        contactPanelLabel.setBounds(contactPanel.getBounds().width/2-80, 20 , 160, 50);
        contactPanelLabel.setForeground(new Color(14, 165, 191, 248));
        contactPanel.add(contactPanelLabel);

        JLabel contactPanelContent = new JLabel();
        contactPanelContent.setText("" +
                "<html>" +
                "Telefon:&emsp;000 000 000 <br>" +
                " E-mail: &emsp;  poczta@ztm.pl <br><br><br>" +
                " <center> <u>Punkt Obsługi Klienta</u> <br><br> " +
                "ul. Wojowników 10 <br> 00-000 Nilfgaard </center> " +
                "</html>");
        contactPanelContent.setFont(new Font("Arial", Font.BOLD, 24));
        contactPanelContent.setBounds(50, 80 , 400, 350);
        contactPanelContent.setForeground(Color.white);
        contactPanel.add(contactPanelContent);


        ///////////////////////////   TICKET PANEL    /////////////////////////////////////

        JPanel ticketInfoPanel = new JPanel();
        ticketInfoPanel.setSize(500,450);
        ticketInfoPanel.setLocation(Window.WIDTH-570, 200);
        ticketInfoPanel.setLayout(null);
        ticketInfoPanel.setBackground(new Color(0,0,0,30));
        ticketInfoPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));;
        add(ticketInfoPanel);

        JLabel ticketInfoPanelLabel = new JLabel("Cennik Biletów");
        ticketInfoPanelLabel.setFont(new Font("Arial", Font.BOLD, 30));
        ticketInfoPanelLabel.setBounds(ticketInfoPanel.getBounds().width/2-150, 20 , 300, 50);
        ticketInfoPanelLabel.setForeground(new Color(14, 165, 191, 248));
        ticketInfoPanel.add(ticketInfoPanelLabel);

        JLabel ticketInfoPanelContent = new JLabel();
        ticketInfoPanelContent.setText("<html></html>");
        ticketInfoPanelContent.setFont(new Font("Arial", Font.BOLD, 24));
        ticketInfoPanelContent.setBounds(50, 80 , 400, 350);
        ticketInfoPanelContent.setForeground(Color.white);
        ticketInfoPanel.add(ticketInfoPanelContent);


        /*
            ACTION BUTTONS
        */

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
