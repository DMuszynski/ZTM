package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Timetable extends JPanel{

    private Image background;

    public Timetable(){
        Main.newWindow.setVisible(true);
        setPreferredSize(new Dimension(Window.WIDTH, Window.HEIGHT));
        setFocusable(true);
        setLayout(null);
        loadBackground();





        ///////////////////////////   TITLE    /////////////////////////////////////

        JLabel title = new JLabel("Rozkład Jazdy");
        title.setFont(new Font("Arial", Font.BOLD, 40));
        title.setBounds(Window.WIDTH/2 - 175, 30 , 350, 100);
        title.setForeground(Color.white);
        add(title);





        ///////////////////////////   stopPanel PANEL    /////////////////////////////////////
        JPanel stopPanel = new JPanel();
        stopPanel.setSize(400,520);
        stopPanel.setLocation(Window.WIDTH /2 - 500, 150);
        stopPanel.setBackground(new Color(0,0,0,30));
        add(stopPanel);

        JLabel stopPanelLabel = new JLabel("Wybierz przystanek");
        stopPanelLabel.setFont(new Font("Arial", Font.BOLD, 25));
        stopPanelLabel.setBounds(stopPanel.getBounds().x + 80, 30 , 240, 100);
        stopPanelLabel.setForeground(Color.white);
        stopPanel.add(stopPanelLabel);

        // ID STOP
        JTextField idStop = new JTextField("Nazwa przystanku");
        idStop.setBounds(stopPanel.getBounds().x + 40,stopPanel.getBounds().y  + 60,140,40);
        add(idStop);

        // FIND STOP
        JButton findStop = new JButton("Znajdź przystanek");
        findStop.setBounds(stopPanel.getBounds().x + 170,stopPanel.getBounds().y + 60,180,40);
        findStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String id = idStop.getText();

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(findStop);

        JLabel stopPanelContent = new JLabel();
        stopPanelContent.setText("" +
                "<html>" +
                "</html>");
        stopPanelContent.setFont(new Font("Arial", Font.BOLD, 24));
        stopPanelContent.setBounds(50, 80 , 400, 350);
        stopPanelContent.setForeground(Color.white);
        stopPanel.add(stopPanelContent);






        ///////////////////////////   CREATION PANEL    /////////////////////////////////////
        JPanel routePanel = new JPanel();
        routePanel.setSize(400,520);
        routePanel.setLocation(Window.WIDTH /2 + 100, 150);
        routePanel.setBackground(new Color(0,0,0,30));
        add(routePanel);

        JLabel routePanelLabel = new JLabel("Wybierz Linię");
        routePanelLabel.setFont(new Font("Arial", Font.BOLD, 25));
        routePanelLabel.setBounds(routePanel.getBounds().x + 80, 30 , 240, 100);
        routePanelLabel.setForeground(Color.white);
        routePanel.add(routePanelLabel);

        // ID ROUTE
        JTextField idRoute = new JTextField("Nazwa linii");
        idRoute.setBounds(routePanel.getBounds().x + 50,routePanel.getBounds().y  + 60,140,40);
        add(idRoute);

        // FIND ROUTE
        JButton findRoute = new JButton("Znajdź linię");
        findRoute.setBounds(routePanel.getBounds().x + 170,routePanel.getBounds().y + 60,180,40);
        findRoute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String id = idRoute.getText();

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(findRoute);

        





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
