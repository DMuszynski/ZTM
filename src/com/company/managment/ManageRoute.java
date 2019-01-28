package com.company.managment;

import com.company.Main;
import com.company.Menu;
import com.company.Window;

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

        JLabel title = new JLabel("Zarządzanie liniami");
        title.setFont(new Font("Arial", Font.BOLD, 40));
        title.setBounds(Window.WIDTH /2 - 250, 30 , 500, 100);
        title.setForeground(Color.white);
        add(title);


        ///////////////////////////   MANAGMENT PANEL    /////////////////////////////////////

        JPanel managment = new JPanel();
        managment.setSize(400,500);
        managment.setLocation(Window.WIDTH /2 - 500, 150);
        managment.setBackground(new Color(0,0,0,30));
        add(managment);

        JLabel managmentLabel = new JLabel("Modyfikuj linię");
        managmentLabel.setFont(new Font("Arial", Font.BOLD, 25));
        managmentLabel.setBounds(managment.getBounds().x + 80, 30 , 240, 100);
        managmentLabel.setForeground(Color.white);
        managment.add(managmentLabel);

        // ID POJAZDU
        JTextField idVehicle = new JTextField("Numer Linii");
        idVehicle.setBounds(managment.getBounds().x + 80,managment.getBounds().y  + 60,80,40);
        add(idVehicle);

        // FIND VEHICLE
        JButton findVehicle = new JButton("Znajdź linię");
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
        JTextField manageStart = new JTextField("Początkowy");
        manageStart.setBounds(managment.getBounds().x + 140,managment.getBounds().y  + 120,120,40);
        add(manageStart);

        //  MODEL
        JTextField manageFirst = new JTextField("#1");
        manageFirst.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 170,120,40);
        add(manageFirst);

        //  NUMER REJESTRACYJNY
        JTextField manageSecond = new JTextField("#2");
        manageSecond.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 220,120,40);
        add(manageSecond);

        //  NUMER BOCZNY
        JTextField manageThird = new JTextField("#3");
        manageThird.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 270,120,40);
        add(manageThird);

        //  ROK PRODUKCJI
        JTextField manageFourth = new JTextField("#4");
        manageFourth.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 320,120,40);
        add(manageFourth);

        //  OSTATNI PRZEGLĄD
        JTextField manageEnd = new JTextField("Końcowy");
        manageEnd.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 370,120,40);
        add(manageEnd);

        // MANAGE VEHICLE
        JButton manageVehicle = new JButton("Modyfikuj linię");
        manageVehicle.setBounds(managment.getBounds().x + 110,managment.getBounds().y + 420,180,40);
        manageVehicle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String brand = manageStart.getText();
                String model = manageFirst.getText();
                String registerNumber = manageSecond.getText();
                String sideNumber = manageThird.getText();
                String productionYer = manageFourth.getText();
                String overwiew = manageEnd.getText();

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

        JLabel creationLabel = new JLabel("Dodaj linię");
        creationLabel.setFont(new Font("Arial", Font.BOLD, 25));
        creationLabel.setBounds(creation.getBounds().x + 80, 30 , 240, 100);
        creationLabel.setForeground(Color.white);
        creation.add(creationLabel);

        //  MARKA
        JTextField createStart = new JTextField("Początkowy");
        createStart.setBounds(creation.getBounds().x + 140,creation.getBounds().y  + 70,120,40);
        add(createStart);

        //  MODEL
        JTextField createFirst = new JTextField("#1");
        createFirst.setBounds(creation.getBounds().x + 140,creation.getBounds().y + 120,120,40);
        add(createFirst);

        //  NUMER REJESTRACYJNY
        JTextField createSecond = new JTextField("#2");
        createSecond.setBounds(creation.getBounds().x + 140,creation.getBounds().y + 170,120,40);
        add(createSecond);

        //  NUMER BOCZNY
        JTextField createThird = new JTextField("#3");
        createThird.setBounds(creation.getBounds().x + 140,creation.getBounds().y + 220,120,40);
        add(createThird);

        //  ROK PRODUKCJI
        JTextField createFourth = new JTextField("#4");
        createFourth.setBounds(creation.getBounds().x + 140,creation.getBounds().y + 270,120,40);
        add(createFourth);

        //  OSTATNI PRZEGLĄD
        JTextField createEnd = new JTextField("Końcowy");
        createEnd.setBounds(creation.getBounds().x + 140,creation.getBounds().y + 320,120,40);
        add(createEnd);

        // ADD VEHICLE
        JButton addVehicle = new JButton("Dodaj linię");
        addVehicle.setBounds(creation.getBounds().x + 110,creation.getBounds().y + 400,180,40);
        addVehicle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String brand = createStart.getText();
                String model = createFirst.getText();
                String registerNumber = createSecond.getText();
                String sideNumber = createThird.getText();
                String productionYer = createFourth.getText();
                String overwiew = createEnd.getText();

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
