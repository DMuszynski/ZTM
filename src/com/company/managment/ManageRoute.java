package com.company.managment;

import com.company.*;
import com.company.Menu;
import com.company.Window;
import com.company.panels.AdminPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManageRoute extends JPanel{

    private Image background;

    public ManageRoute(){

        Main.newWindow.setVisible(true);
        setPreferredSize(new Dimension(Window.WIDTH, Window.HEIGHT));
        setFocusable(true);
        setLayout(null);
        loadBackground();



        ///////////////////////////   TITLE    /////////////////////////////////////
        JLabel title = new JLabel("Zarządzanie trasami");
        title.setFont(new Font("Arial", Font.BOLD, 40));
        title.setBounds(Window.WIDTH /2 - 250, 30 , 500, 100);
        title.setForeground(Color.white);
        add(title);

        // SEARCH CONNECTION
        JButton busStopButton = new JButton(new ImageIcon("images/bus_stop_icon.png"));
        busStopButton.setBounds((Window.WIDTH/2-90) - 400, Window.HEIGHT/2 - 90, 180,180);
        busStopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setVisible(false);
                Main.newWindow.setContentPane(new ManageStop());
                Main.newWindow.revalidate();
            }
        });
        add(busStopButton);
        JLabel busStopLabel = new JLabel();
        busStopLabel.setText("<html><center>Zarządzaj przystankami</center></html>");
        busStopLabel.setFont(new Font("Arial", Font.BOLD, 18));
        busStopLabel.setBounds(busStopButton.getBounds().x, busStopButton.getBounds().y + 185, 180, 60);
        busStopLabel.setForeground(Color.white);
        add(busStopLabel);



        //
        JButton lineButton = new JButton(new ImageIcon("images/line_icon.png"));
        lineButton.setBounds( (Window.WIDTH/2-90), Window.HEIGHT/2 - 90, 180,180);
        lineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setVisible(false);
                Main.newWindow.setContentPane(new ManageLines());
                Main.newWindow.revalidate();
            }
        });
        add(lineButton);
        JLabel lineLabel = new JLabel();
        lineLabel.setText("<html><center>Zarządzaj liniami</center></html>");
        lineLabel.setFont(new Font("Arial", Font.BOLD, 18));
        lineLabel.setBounds(lineButton.getBounds().x, lineButton.getBounds().y + 185, 180, 60);
        lineLabel.setForeground(Color.white);
        add(lineLabel);



        // MANAGE ROUTES
        JButton trackButton = new JButton(new ImageIcon("images/routes_manage_icon.png"));
        trackButton.setBounds((Window.WIDTH/2-90) + 400, Window.HEIGHT/2 - 90, 180, 180);
        trackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setVisible(false);
                Main.newWindow.setContentPane(new ManageTrack());
                Main.newWindow.revalidate();
            }
        });
        add(trackButton);
        JLabel trackLabel = new JLabel();
        trackLabel.setText("<html><center>Zarządzaj trasami</center></html>");
        trackLabel.setFont(new Font("Arial", Font.BOLD, 18));
        trackLabel.setBounds(trackButton.getBounds().x, trackButton.getBounds().y + 185, 180, 60);
        trackLabel.setForeground(Color.white);
        add(trackLabel);

        ///////////////////////////   BACK BUTTON    /////////////////////////////////////

        //BACK
        JButton backButton = new JButton("Powrót");
        backButton.setBounds(Window.WIDTH/2 - 50, Window.HEIGHT-80, 100, 30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setContentPane(new AdminPanel());
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
