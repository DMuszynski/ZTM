package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckTicket extends JPanel{

    private Image background;

    public CheckTicket(){
        Main.newWindow.setVisible(true);
        setPreferredSize(new Dimension(Window.WIDTH, Window.HEIGHT));
        setFocusable(true);
        setLayout(null);
        loadBackground();



        ///////////////////////////   TITLE    /////////////////////////////////////

        JLabel title = new JLabel("Kupione Bilety");
        title.setFont(new Font("Arial", Font.BOLD, 40));
        title.setBounds(Window.WIDTH/2 - 190, 30 , 380, 100);
        title.setForeground(Color.white);
        add(title);





        ///////////////////////////   TICKET PANEL    /////////////////////////////////////

        JPanel ticketInfoPanel = new JPanel();
        ticketInfoPanel.setSize(500,450);
        ticketInfoPanel.setLocation(Window.WIDTH/2 -250, 200);
        ticketInfoPanel.setLayout(null);
        ticketInfoPanel.setBackground(new Color(0,0,0,30));
        ticketInfoPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));;
        add(ticketInfoPanel);

        JLabel ticketInfoPanelContent = new JLabel();
        ticketInfoPanelContent.setText("<html></html>");
        ticketInfoPanelContent.setFont(new Font("Arial", Font.BOLD, 24));
        ticketInfoPanelContent.setBounds(50, 80 , 400, 350);
        ticketInfoPanelContent.setForeground(Color.white);
        ticketInfoPanel.add(ticketInfoPanelContent);





        //  ACTION BUTTONS

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
