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
        managment.setSize(400,520);
        managment.setLocation(Window.WIDTH /2 - 500, 150);
        managment.setBackground(new Color(0,0,0,30));
        add(managment);

        JLabel managmentLabel = new JLabel("Modyfikuj linię");
        managmentLabel.setFont(new Font("Arial", Font.BOLD, 25));
        managmentLabel.setBounds(managment.getBounds().x + 80, 30 , 240, 100);
        managmentLabel.setForeground(Color.white);
        managment.add(managmentLabel);

        // ID ROUTE
        JTextField idRoute = new JTextField("Numer Linii");
        idRoute.setBounds(managment.getBounds().x + 80,managment.getBounds().y  + 60,80,40);
        add(idRoute);

        // FIND ROUTE
        JButton findRoute = new JButton("Znajdź linię");
        findRoute.setBounds(managment.getBounds().x + 170,managment.getBounds().y + 60,180,40);
        findRoute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String id = idRoute.getText();

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(findRoute);


        //  POCZĄTKOWY PRZYSTANEK
        JTextField manageStart = new JTextField("Początkowy");
        manageStart.setBounds(managment.getBounds().x + 140,managment.getBounds().y  + 120,120,40);
        add(manageStart);

        //  PIERWSZY PRZYSTANEK
        JTextField manageFirst = new JTextField("#1");
        manageFirst.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 170,120,40);
        add(manageFirst);

        //  DRUGI PRZYSTANEK
        JTextField manageSecond = new JTextField("#2");
        manageSecond.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 220,120,40);
        add(manageSecond);

        //  TRZECI PRZYSTANEK
        JTextField manageThird = new JTextField("#3");
        manageThird.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 270,120,40);
        add(manageThird);

        //  CZWARTY PRZYSTANEK
        JTextField manageFourth = new JTextField("#4");
        manageFourth.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 320,120,40);
        add(manageFourth);

        //  OSTATNI PRZYSTANEK
        JTextField manageEnd = new JTextField("Końcowy");
        manageEnd.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 370,120,40);
        add(manageEnd);

        // MANAGE ROUTE
        JButton manageRoute = new JButton("Modyfikuj linię");
        manageRoute.setBounds(managment.getBounds().x + 110,managment.getBounds().y + 420,180,40);
        manageRoute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String ID = idRoute.getText();

                String start = manageStart.getText();
                String first = manageFirst.getText();
                String second = manageSecond.getText();
                String third = manageThird.getText();
                String fourth = manageFourth.getText();
                String end = manageEnd.getText();

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(manageRoute);

        // DELETE ROUTE
        JButton deleteRoute = new JButton("Usuń linię");
        deleteRoute.setBounds(managment.getBounds().x + 110,managment.getBounds().y + 460,180,40);
        deleteRoute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String ID = idRoute.getText();

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(deleteRoute);





        ///////////////////////////   CREATION PANEL    /////////////////////////////////////
        JPanel creation = new JPanel();
        creation.setSize(400,520);
        creation.setLocation(Window.WIDTH /2 + 100, 150);
        creation.setBackground(new Color(0,0,0,30));
        add(creation);

        JLabel creationLabel = new JLabel("Dodaj linię");
        creationLabel.setFont(new Font("Arial", Font.BOLD, 25));
        creationLabel.setBounds(creation.getBounds().x + 80, 30 , 240, 100);
        creationLabel.setForeground(Color.white);
        creation.add(creationLabel);

        //  NUMER LINII
        JTextField numberRoute = new JTextField("NUMER LINII");
        numberRoute.setBounds(creation.getBounds().x + 150,creation.getBounds().y  + 50,100,40);
        add(numberRoute);

        //  POCZĄTKOWY PRZYSTANEK
        JTextField createStart = new JTextField("Początkowy");
        createStart.setBounds(creation.getBounds().x + 140,creation.getBounds().y  + 100,120,40);
        add(createStart);

        //  DRUGI PRZYSTANEK
        JTextField createFirst = new JTextField("#1");
        createFirst.setBounds(creation.getBounds().x + 140,creation.getBounds().y + 150,120,40);
        add(createFirst);

        //  TRZECI PRZYSTANEK
        JTextField createSecond = new JTextField("#2");
        createSecond.setBounds(creation.getBounds().x + 140,creation.getBounds().y + 200,120,40);
        add(createSecond);

        //  CZWARTY PRZYSTANEK
        JTextField createThird = new JTextField("#3");
        createThird.setBounds(creation.getBounds().x + 140,creation.getBounds().y + 250,120,40);
        add(createThird);

        //  PIĄTY PRZYSTANEK
        JTextField createFourth = new JTextField("#4");
        createFourth.setBounds(creation.getBounds().x + 140,creation.getBounds().y + 300,120,40);
        add(createFourth);

        //  OSTATNI PRZYSTANEK
        JTextField createEnd = new JTextField("Końcowy");
        createEnd.setBounds(creation.getBounds().x + 140,creation.getBounds().y + 350,120,40);
        add(createEnd);

        // ADD ROUTE
        JButton addRoute = new JButton("Dodaj linię");
        addRoute.setBounds(creation.getBounds().x + 110,creation.getBounds().y + 400,180,40);
        addRoute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String routeNumber = numberRoute.getText();

                String start = createStart.getText();
                String first = createFirst.getText();
                String second = createSecond.getText();
                String third = createThird.getText();
                String fourth = createFourth.getText();
                String end = createEnd.getText();

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(addRoute);

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
