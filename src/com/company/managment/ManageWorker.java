package com.company.managment;

import com.company.Window;
import com.company.Main;
import com.company.Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManageWorker extends JPanel{

    private Image background;

    public ManageWorker(){
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
        managment.setSize(400,500);
        managment.setLocation(Window.WIDTH /2 - 500, 150);
        managment.setBackground(new Color(0,0,0,30));
        add(managment);

        JLabel managmentLabel = new JLabel("Modyfikuj pojazd");
        managmentLabel.setFont(new Font("Arial", Font.BOLD, 25));
        managmentLabel.setBounds(managment.getBounds().x + 80, 30 , 240, 100);
        managmentLabel.setForeground(Color.white);
        managment.add(managmentLabel);

        // ID POJAZDU
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


        //  MARKA
        JTextField manageBrand = new JTextField("Marka");
        manageBrand.setBounds(managment.getBounds().x + 140,managment.getBounds().y  + 120,120,40);
        add(manageBrand);

        //  MODEL
        JTextField manageModel = new JTextField("Model");
        manageModel.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 170,120,40);
        add(manageModel);

        //  NUMER REJESTRACYJNY
        JTextField manageRegistration = new JTextField("Numer rejestracyjny");
        manageRegistration.setBounds(managment.getBounds().x + 130,managment.getBounds().y + 220,140,40);
        add(manageRegistration);

        //  NUMER BOCZNY
        JTextField manageSideNumber = new JTextField("Numer boczny");
        manageSideNumber.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 270,120,40);
        add(manageSideNumber);

        //  ROK PRODUKCJI
        JTextField manageProduction = new JTextField("Rok produkcji");
        manageProduction.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 320,120,40);
        add(manageProduction);

        //  OSTATNI PRZEGLĄD
        JTextField manageOverwiew = new JTextField("Ostatni przegląd");
        manageOverwiew.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 370,120,40);
        add(manageOverwiew);

        // MANAGE VEHICLE
        JButton manageVehicle = new JButton("Modyfikuj pojazd");
        manageVehicle.setBounds(managment.getBounds().x + 110,managment.getBounds().y + 420,180,40);
        manageVehicle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String brand = manageBrand.getText();
                String model = manageModel.getText();
                String registerNumber = manageRegistration.getText();
                String sideNumber = manageSideNumber.getText();
                String productionYer = manageProduction.getText();
                String overwiew = manageOverwiew.getText();

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(manageVehicle);

        ///////////////////////////   CREATION PANEL    /////////////////////////////////////

        JPanel creation = new JPanel();
        creation.setSize(400,500);
        creation.setLocation(Window.WIDTH /2 + 100, 150);
        creation.setBackground(new Color(0,0,0,30));
        add(creation);

        JLabel creationLabel = new JLabel("Dodaj pojazd");
        creationLabel.setFont(new Font("Arial", Font.BOLD, 25));
        creationLabel.setBounds(creation.getBounds().x + 80, 30 , 240, 100);
        creationLabel.setForeground(Color.white);
        creation.add(creationLabel);

        //  MARKA
        JTextField createBrand = new JTextField("Marka");
        createBrand.setBounds(creation.getBounds().x + 140,creation.getBounds().y  + 70,120,40);
        add(createBrand);

        //  MODEL
        JTextField createModel = new JTextField("Model");
        createModel.setBounds(creation.getBounds().x + 140,creation.getBounds().y + 120,120,40);
        add(createModel);

        //  NUMER REJESTRACYJNY
        JTextField createRegistration = new JTextField("Numer rejestracyjny");
        createRegistration.setBounds(creation.getBounds().x + 130,creation.getBounds().y + 170,140,40);
        add(createRegistration);

        //  NUMER BOCZNY
        JTextField createSideNumber = new JTextField("Numer boczny");
        createSideNumber.setBounds(creation.getBounds().x + 140,creation.getBounds().y + 220,120,40);
        add(createSideNumber);

        //  ROK PRODUKCJI
        JTextField createProduction = new JTextField("Rok produkcji");
        createProduction.setBounds(creation.getBounds().x + 140,creation.getBounds().y + 270,120,40);
        add(createProduction);

        //  OSTATNI PRZEGLĄD
        JTextField createOverwiew = new JTextField("Ostatni przegląd");
        createOverwiew.setBounds(creation.getBounds().x + 140,creation.getBounds().y + 320,120,40);
        add(createOverwiew);

        // ADD VEHICLE
        JButton addVehicle = new JButton("Dodaj pojazd");
        addVehicle.setBounds(creation.getBounds().x + 110,creation.getBounds().y + 400,180,40);
        addVehicle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String brand = createBrand.getText();
                String model = createModel.getText();
                String registerNumber = createRegistration.getText();
                String sideNumber = createSideNumber.getText();
                String productionYer = createProduction.getText();
                String overwiew = createOverwiew.getText();

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(addVehicle);

        ///////////////////////////   BACK BUTTON    /////////////////////////////////////

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
