package com.company.managment;

import com.company.Window;
import com.company.Main;
import com.company.Menu;
import com.company.panels.AdminPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManageVehicle extends JPanel{

    private Image background;

    public ManageVehicle(){

        Main.newWindow.setVisible(true);
        setPreferredSize(new Dimension(Window.WIDTH, Window.HEIGHT));
        setFocusable(true);
        setLayout(null);
        loadBackground();



        ///////////////////////////   TITLE    /////////////////////////////////////
        JLabel title = new JLabel("Zarządzanie pojazdami");
        title.setFont(new Font("Arial", Font.BOLD, 40));
        title.setBounds(Window.WIDTH /2 - 260, 30 , 520, 100);
        title.setForeground(Color.white);
        add(title);





        ///////////////////////////   MANAGMENT PANEL    /////////////////////////////////////
        JPanel managment = new JPanel();
        managment.setSize(400,520);
        managment.setLocation(Window.WIDTH /2 - 650, 150);
        managment.setBackground(new Color(0,0,0,30));
        add(managment);

        JLabel managmentLabel = new JLabel("Modyfikuj pojazd");
        managmentLabel.setFont(new Font("Arial", Font.BOLD, 25));
        managmentLabel.setBounds(managment.getBounds().x + 80, 30 , 240, 100);
        managmentLabel.setForeground(Color.white);
        managment.add(managmentLabel);

        // ID VEHICLE
        JTextField idVehicle = new JTextField("ID");
        idVehicle.setBounds(managment.getBounds().x + 80,managment.getBounds().y  + 60,80,40);
        add(idVehicle);

        // FIND VEHICLE
        JButton findVehicle = new JButton("Znajdź pojazd");
        findVehicle.setBounds(managment.getBounds().x + 170,managment.getBounds().y + 60,180,40);
        findVehicle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String id = idVehicle.getText();

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(findVehicle);


        //  TYPE
        ButtonGroup typeButtons = new ButtonGroup();

        JRadioButton busRadio = new JRadioButton("Autobus");
        busRadio.setBounds(managment.getBounds().x + 100, managment.getBounds().y + 160, 100,30);
        busRadio.setActionCommand("autobus");
        add(busRadio);
        typeButtons.add(busRadio);

        JRadioButton tramRadio = new JRadioButton("Tramwaj");
        tramRadio.setBounds(managment.getBounds().x + 200, managment.getBounds().y + 160, 100,30);
        tramRadio.setActionCommand("tramwaj");
        add(tramRadio);
        typeButtons.add(tramRadio);


        //  MODEL
        JTextField manageModel = new JTextField("Model");
        manageModel.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 220,120,40);
        add(manageModel);

        //  NUMER BOCZNY
        JTextField manageSideNumber = new JTextField("Numer boczny");
        manageSideNumber.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 270,120,40);
        add(manageSideNumber);

        //  ROK PRODUKCJI
        JTextField manageProduction = new JTextField("Rok produkcji");
        manageProduction.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 320,120,40);
        add(manageProduction);


        // MANAGE VEHICLE
        JButton manageVehicle = new JButton("Modyfikuj pojazd");
        manageVehicle.setBounds(managment.getBounds().x + 110,managment.getBounds().y + 420,180,40);
        manageVehicle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String vehicleID = idVehicle.getText();

                String position = typeButtons.getSelection().getActionCommand();

                String model = manageModel.getText();
                String sideNumber = manageSideNumber.getText();
                String productionYer = manageProduction.getText();

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(manageVehicle);

        // DELETE VEHICLE
        JButton deleteVehicle = new JButton("Usuń pojazd");
        deleteVehicle.setBounds(managment.getBounds().x + 110,managment.getBounds().y + 460,180,40);
        deleteVehicle.setBackground(Color.RED);
        deleteVehicle.setOpaque(true);
        deleteVehicle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String ID = idVehicle.getText();

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(deleteVehicle);





        JPanel infoPanel = new JPanel();
        infoPanel.setSize(400,520);
        infoPanel.setLocation(Window.WIDTH/2 - 200, 150);
        infoPanel.setLayout(null);
        infoPanel.setBackground(new Color(0,0,0,30));
        infoPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        add(infoPanel);

        JLabel infoPanelLabel = new JLabel("Pojazdy");
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

        JLabel creationLabel = new JLabel("Dodaj pojazd");
        creationLabel.setFont(new Font("Arial", Font.BOLD, 25));
        creationLabel.setBounds(creation.getBounds().x + 80, 30 , 240, 100);
        creationLabel.setForeground(Color.white);
        creation.add(creationLabel);

        // TYPE
        ButtonGroup typeButtonsCreate = new ButtonGroup();

        JRadioButton busRadioCreate = new JRadioButton("Autobus");
        busRadioCreate.setBounds(creation.getBounds().x + 100, creation.getBounds().y + 120, 100,30);
        busRadioCreate.setActionCommand("autobus");
        add(busRadioCreate);
        typeButtonsCreate.add(busRadioCreate);

        JRadioButton tramRadioCreate = new JRadioButton("Tramwaj");
        tramRadioCreate.setBounds(creation.getBounds().x + 200, creation.getBounds().y + 120, 100,30);
        tramRadioCreate.setActionCommand("tramwaj");
        add(tramRadioCreate);
        typeButtonsCreate.add(tramRadioCreate);

        //  MODEL
        JTextField createModel = new JTextField("Model");
        createModel.setBounds(creation.getBounds().x + 140,creation.getBounds().y + 170,120,40);
        add(createModel);

        //  NUMER BOCZNY
        JTextField createSideNumber = new JTextField("Numer boczny");
        createSideNumber.setBounds(creation.getBounds().x + 140,creation.getBounds().y + 220,120,40);
        add(createSideNumber);

        //  ROK PRODUKCJI
        JTextField createProduction = new JTextField("Rok produkcji");
        createProduction.setBounds(creation.getBounds().x + 140,creation.getBounds().y + 270,120,40);
        add(createProduction);

        // ADD VEHICLE
        JButton addVehicle = new JButton("Dodaj pojazd");
        addVehicle.setBounds(creation.getBounds().x + 110,creation.getBounds().y + 400,180,40);
        addVehicle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String veicleId =idVehicle.getText();

                String position = typeButtonsCreate.getSelection().getActionCommand();

                String model = createModel.getText();
                String sideNumber = createSideNumber.getText();
                String productionYer = createProduction.getText();

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(addVehicle);


        ///////////////////////////   BACK BUTTON    /////////////////////////////////////
        JButton backButton = new JButton("Powrót");
        backButton.setBounds(Window.WIDTH /2 - 50, Window.HEIGHT -80, 100, 30);
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
