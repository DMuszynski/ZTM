package com.company.managment;

import com.company.Main;
import com.company.Menu;
import com.company.Window;
import com.company.panels.AdminPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManageStop extends JPanel{

    private Image background;

    public ManageStop(){

        Main.newWindow.setVisible(true);
        setPreferredSize(new Dimension(Window.WIDTH, Window.HEIGHT));
        setFocusable(true);
        setLayout(null);
        loadBackground();



        ///////////////////////////   TITLE    /////////////////////////////////////
        JLabel title = new JLabel("Zarządzanie przystankiem");
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

        JLabel managmentLabel = new JLabel("Modyfikuj przystanek");
        managmentLabel.setFont(new Font("Arial", Font.BOLD, 25));
        managmentLabel.setBounds(managment.getBounds().x + 80, 30 , 240, 100);
        managmentLabel.setForeground(Color.white);
        managment.add(managmentLabel);

        // ID STOP
        JTextField idStop = new JTextField("ID Przystanku");
        idStop.setBounds(managment.getBounds().x + 40,managment.getBounds().y  + 60,140,40);
        add(idStop);

        // FIND STOP
        JButton findStop = new JButton("Znajdź przystanek");
        findStop.setBounds(managment.getBounds().x + 170,managment.getBounds().y + 60,180,40);
        findStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String id = idStop.getText();

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(findStop);

        //  NAME
        JTextField manageName = new JTextField("Nazwa");
        manageName.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 170,120,40);
        add(manageName);

        //  LOCALIZATION
        JTextField manageLocalization = new JTextField("Lokalizacja");
        manageLocalization.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 220,120,40);
        add(manageLocalization);

        // TYPE
        ButtonGroup stopButtons = new ButtonGroup();

        JRadioButton busRadio = new JRadioButton("Autobusowy");
        busRadio.setBounds(managment.getBounds().x + 60, managment.getBounds().y + 120, 140,30);
        busRadio.setActionCommand("autobusowy");
        add(busRadio);
        stopButtons.add(busRadio);

        JRadioButton tramRadio = new JRadioButton("Tramwajowy");
        tramRadio.setBounds(managment.getBounds().x + 200, managment.getBounds().y + 120, 140,30);
        tramRadio.setActionCommand("tramwajowy");
        add(tramRadio);
        stopButtons.add(tramRadio);


        // MANAGE ROUTE
        JButton manageStop = new JButton("Modyfikuj przystanek");
        manageStop.setBounds(managment.getBounds().x + 90,managment.getBounds().y + 420,220,40);
        manageStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String ID = idStop.getText();

                String name = manageName.getText();
                String localization = manageLocalization.getText();
                String type = stopButtons.getSelection().getActionCommand();


                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(manageStop);

        // DELETE ROUTE
        JButton deleteStop = new JButton("Usuń przystanek");
        deleteStop.setBounds(managment.getBounds().x + 110,managment.getBounds().y + 460,180,40);
        deleteStop.setBackground(Color.RED);
        deleteStop.setOpaque(true);
        deleteStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String ID = idStop.getText();

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(deleteStop);





        ///////////////////////////   INFO PANEL    /////////////////////////////////////

        JPanel infoPanel = new JPanel();
        infoPanel.setSize(400,520);
        infoPanel.setLocation(Window.WIDTH/2 - 200, 150);
        infoPanel.setLayout(null);
        infoPanel.setBackground(new Color(0,0,0,30));
        infoPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        add(infoPanel);

        JLabel infoPanelLabel = new JLabel("Przystanki");
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

        JLabel creationLabel = new JLabel("Dodaj przystanek");
        creationLabel.setFont(new Font("Arial", Font.BOLD, 25));
        creationLabel.setBounds(creation.getBounds().x + 80, 30 , 240, 100);
        creationLabel.setForeground(Color.white);
        creation.add(creationLabel);

        //  TYPE
        ButtonGroup typeButtonsCreate = new ButtonGroup();

        JRadioButton busRadioCreate = new JRadioButton("Autobusowy");
        busRadioCreate.setBounds(creation.getBounds().x + 60, creation.getBounds().y + 120, 140,30);
        busRadioCreate.setActionCommand("kierowca");
        add(busRadioCreate);
        typeButtonsCreate.add(busRadioCreate);

        JRadioButton tramRadioCreate = new JRadioButton("Tramwajowy");
        tramRadioCreate.setBounds(creation.getBounds().x + 200, creation.getBounds().y + 120, 140,30);
        tramRadioCreate.setActionCommand("obsługa");
        add(tramRadioCreate);
        typeButtonsCreate.add(tramRadioCreate);

        //  NAME
        JTextField createName = new JTextField("Nazwa");
        createName.setBounds(creation.getBounds().x + 140,creation.getBounds().y  + 170,120,40);
        add(createName);

        //  LOCALIZATION
        JTextField createLocalization = new JTextField("Lokalizacja");
        createLocalization.setBounds(creation.getBounds().x + 140,creation.getBounds().y + 220,120,40);
        add(createLocalization);

        // ADD ROUTE
        JButton addStop = new JButton("Dodaj przystanek");
        addStop.setBounds(creation.getBounds().x + 110,creation.getBounds().y + 400,180,40);
        addStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String name = createName.getText();
                String localization = createLocalization.getText();
                String type = typeButtonsCreate.getSelection().getActionCommand();

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(addStop);

        ///////////////////////////   BACK BUTTON    /////////////////////////////////////

        //BACK
        JButton backButton = new JButton("Powrót");
        backButton.setBounds(Window.WIDTH/2 - 50, Window.HEIGHT-80, 100, 30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setContentPane(new ManageRoute());
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