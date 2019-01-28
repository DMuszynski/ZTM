package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WorkSchedule extends JPanel{

    private Image background;

    public WorkSchedule(){
        Main.newWindow.setVisible(true);
        setPreferredSize(new Dimension(Window.WIDTH, Window.HEIGHT));
        setFocusable(true);
        setLayout(null);
        loadBackground();



        ///////////////////////////   TITLE    /////////////////////////////////////

        JLabel title = new JLabel("Harmonogram Pracy");
        title.setFont(new Font("Arial", Font.BOLD, 40));
        title.setBounds(Window.WIDTH/2 - 250, 30 , 500, 100);
        title.setForeground(Color.white);
        add(title);



        ///////////////////////////   CONTACT PANEL    /////////////////////////////////////

        JPanel contactPanel = new JPanel();
        contactPanel.setSize(500,450);
        contactPanel.setLocation(Window.WIDTH/2 - 250, 200);
        contactPanel.setLayout(null);
        contactPanel.setBackground(new Color(0,0,0,30));
        contactPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        add(contactPanel);

        JLabel weekLabel = new JLabel("Tydzień");
        weekLabel.setBounds(contactPanel.getBounds().x - contactPanel.getBounds().width/2 - 70 ,contactPanel.getBounds().y - 160 , 140, 40);
        weekLabel.setFont(new Font("Arial", Font.BOLD, 30));
        weekLabel.setForeground(Color.white);
        contactPanel.add(weekLabel);

        JLabel contactPanelContent = new JLabel();
        contactPanelContent.setText("" +
                "<html> " +
                "Poniedziałek <br><br>" +
                "Wtorek <br><br>" +
                "Środa <br><br>" +
                "Czwartek <br><br>" +
                "Piątek <br><br>" +
                "Sobota <br><br>" +
                "Niedziela <br><br>" +
                "</html>");
        contactPanelContent.setFont(new Font("Arial", Font.BOLD, 24));
        contactPanelContent.setBounds(50, 80 , 400, 450);
        contactPanelContent.setForeground(Color.white);
        contactPanel.add(contactPanelContent);



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
