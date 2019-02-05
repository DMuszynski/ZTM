package com.company.managment;

import com.company.Main;
import com.company.Menu;
import com.company.Window;
import com.company.panels.AdminPanel;
import com.sun.deploy.ui.AboutDialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManageWorkDay extends JPanel{

    private Image background;

    public ManageWorkDay(){

        Main.newWindow.setVisible(true);
        setPreferredSize(new Dimension(Window.WIDTH, Window.HEIGHT));
        setFocusable(true);
        setLayout(null);
        loadBackground();



        ///////////////////////////   TITLE    /////////////////////////////////////
        JLabel title = new JLabel("Zarządzanie dniem pracy");
        title.setFont(new Font("Arial", Font.BOLD, 40));
        title.setBounds(Window.WIDTH /2 - 300, 30 , 600, 100);
        title.setForeground(Color.white);
        add(title);





        ///////////////////////////   MANAGMENT PANEL    /////////////////////////////////////
        JPanel managment = new JPanel();
        managment.setSize(400,520);
        managment.setLocation(Window.WIDTH /2 - 650, 150);
        managment.setBackground(new Color(0,0,0,30));
        add(managment);

        JLabel managmentLabel = new JLabel("Modyfikuj dzień pracy");
        managmentLabel.setFont(new Font("Arial", Font.BOLD, 25));
        managmentLabel.setBounds(managment.getBounds().x + 80, 30 , 240, 100);
        managmentLabel.setForeground(Color.white);
        managment.add(managmentLabel);

        // ID Day
        JTextField idWorkDay = new JTextField("ID dnia");
        idWorkDay.setBounds(managment.getBounds().x + 80,managment.getBounds().y  + 60,80,40);
        add(idWorkDay);

        // FIND Day
        JButton findDay = new JButton("Znajdź dzień pracy");
        findDay.setBounds(managment.getBounds().x + 170,managment.getBounds().y + 60,180,40);
        findDay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String id = idWorkDay.getText();

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(findDay);

        //  POCZĄTEK
        JTextField manageStart = new JTextField("Początek");
        manageStart.setBounds(managment.getBounds().x + 130,managment.getBounds().y + 220,140,40);
        add(manageStart);

        //  KONIEC
        JTextField manageEnd = new JTextField("Koniec");
        manageEnd.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 270,120,40);
        add(manageEnd);

        //  DATA
        JTextField manageDate = new JTextField("Data");
        manageDate.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 320,120,40);
        add(manageDate);

        // MANAGE DAY
        JButton manageDay = new JButton("Modyfikuj dzień pracy");
        manageDay.setBounds(managment.getBounds().x + 90,managment.getBounds().y + 420,220,40);
        manageDay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String id = idWorkDay.getText();
                String start = manageStart.getText();
                String end = manageEnd.getText();
                String date = manageDate.getText();

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(manageDay);

        // DELETE DAY
        JButton deleteDay = new JButton("Usuń dzień pracy");
        deleteDay.setBounds(managment.getBounds().x + 110,managment.getBounds().y + 460,180,40);
        deleteDay.setBackground(Color.RED);
        deleteDay.setOpaque(true);
        deleteDay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String ID = idWorkDay.getText();

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(deleteDay);





        JPanel infoPanel = new JPanel();
        infoPanel.setSize(400,520);
        infoPanel.setLocation(Window.WIDTH/2 - 200, 150);
        infoPanel.setLayout(null);
        infoPanel.setBackground(new Color(0,0,0,30));
        infoPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        add(infoPanel);

        JLabel infoPanelLabel = new JLabel("Dni pracy");
        infoPanelLabel.setFont(new Font("Arial", Font.BOLD, 25));
        infoPanelLabel.setBounds(infoPanel.getBounds().width/2-80, 20 , 250, 50);
        infoPanelLabel.setForeground(new Color(14, 165, 191, 248));
        infoPanel.add(infoPanelLabel);

        JLabel infoPanelContent = new JLabel();
        infoPanelContent.setText("" +
                "<html>" +
                "</html>");
        infoPanelContent.setFont(new Font("Arial", Font.BOLD, 24));
        infoPanelContent.setBounds(50, 80 , 400, 350);
        infoPanelContent.setForeground(Color.white);
        infoPanel.add(infoPanelContent);





        ///////////////////////////   CREATION PANEL    /////////////////////////////////////
        JPanel creation = new JPanel();
        creation.setSize(400,520);
        creation.setLocation(Window.WIDTH /2 + 250, 150);
        creation.setBackground(new Color(0,0,0,30));
        add(creation);

        JLabel creationLabel = new JLabel("Dodaj dzień pracy");
        creationLabel.setFont(new Font("Arial", Font.BOLD, 25));
        creationLabel.setBounds(creation.getBounds().x + 80, 30 , 240, 100);
        creationLabel.setForeground(Color.white);
        creation.add(creationLabel);

        //  START
        JTextField createStart = new JTextField("Początek");
        createStart.setBounds(creation.getBounds().x + 130,creation.getBounds().y + 170,140,40);
        add(createStart);

        //  START
        JTextField createEnd = new JTextField("Koniec");
        createEnd.setBounds(creation.getBounds().x + 140,creation.getBounds().y + 220,120,40);
        add(createEnd);

        //  DATE
        JTextField createDate = new JTextField("Data");
        createDate.setBounds(creation.getBounds().x + 140,creation.getBounds().y + 270,120,40);
        add(createDate);

        // ADD DAY
        JButton addDay = new JButton("Dodaj dzień pracy");
        addDay.setBounds(creation.getBounds().x + 110,creation.getBounds().y + 400,180,40);
        addDay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String start = createStart.getText();
                String end = createEnd.getText();
                String date = createDate.getText();

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(addDay);






        ///////////////////////////   BACK BUTTON    /////////////////////////////////////
        JButton backButton = new JButton("Powrót");
        backButton.setBounds(Window.WIDTH/2 - 50, Window.HEIGHT-80, 100, 30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setContentPane(new ManageSchedule());
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
