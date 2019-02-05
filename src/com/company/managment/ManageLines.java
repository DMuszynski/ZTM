package com.company.managment;

import com.company.Main;
import com.company.Menu;
import com.company.Window;
import com.company.panels.AdminPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManageLines extends JPanel{

    private Image background;

    public ManageLines(){

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
        managment.setLocation(Window.WIDTH /2 - 650, 150);
        managment.setBackground(new Color(0,0,0,30));
        add(managment);

        JLabel managmentLabel = new JLabel("Modyfikuj linię");
        managmentLabel.setFont(new Font("Arial", Font.BOLD, 25));
        managmentLabel.setBounds(managment.getBounds().x + 80, 30 , 240, 100);
        managmentLabel.setForeground(Color.white);
        managment.add(managmentLabel);

        // ID ROUTE
        JTextField idRoute = new JTextField("ID linii");
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

        // TYP LINII
        ButtonGroup lineButtons = new ButtonGroup();

        JRadioButton busRadio = new JRadioButton("Autobusowy");
        busRadio.setBounds(managment.getBounds().x + 60, managment.getBounds().y + 320, 140,30);
        busRadio.setActionCommand("autobusowy");
        add(busRadio);
        lineButtons.add(busRadio);

        JRadioButton tramRadio = new JRadioButton("Tramwajowy");
        tramRadio.setBounds(managment.getBounds().x + 200, managment.getBounds().y + 320, 140,30);
        tramRadio.setActionCommand("tramwajowy");
        add(tramRadio);
        lineButtons.add(tramRadio);
        
        //  LINE NUMBER
        JTextField lineNumber = new JTextField("Number Linii");
        lineNumber.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 120,120,40);
        add(lineNumber);

        //  PIERWSZA TRASA
        JTextField manageFirst = new JTextField("Trasa 1");
        manageFirst.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 170,120,40);
        add(manageFirst);

        //  DRUGA TRASA
        JTextField manageSecond = new JTextField("Trasa 2");
        manageSecond.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 220,120,40);
        add(manageSecond);

        //  TRZECIA TRASA
        JTextField manageThird = new JTextField("Trasa 3");
        manageThird.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 270,120,40);
        add(manageThird);


        // MANAGE ROUTE
        JButton manageRoute = new JButton("Modyfikuj linię");
        manageRoute.setBounds(managment.getBounds().x + 110,managment.getBounds().y + 420,180,40);
        manageRoute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String ID = idRoute.getText();

                String type = lineButtons.getSelection().getActionCommand();

                String first = manageFirst.getText();
                String second = manageSecond.getText();
                String third = manageThird.getText();

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(manageRoute);

        // DELETE ROUTE
        JButton deleteRoute = new JButton("Usuń linię");
        deleteRoute.setBounds(managment.getBounds().x + 110,managment.getBounds().y + 460,180,40);
        deleteRoute.setBackground(Color.RED);
        deleteRoute.setOpaque(true);
        deleteRoute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String ID = idRoute.getText();

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(deleteRoute);





        ///////////////////////////   INFO PANEL    /////////////////////////////////////

        JPanel infoPanel = new JPanel();
        infoPanel.setSize(400,520);
        infoPanel.setLocation(Window.WIDTH/2 - 200, 150);
        infoPanel.setLayout(null);
        infoPanel.setBackground(new Color(0,0,0,30));
        infoPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        add(infoPanel);

        JLabel infoPanelLabel = new JLabel("Linie");
        infoPanelLabel.setFont(new Font("Arial", Font.BOLD, 30));
        infoPanelLabel.setBounds(infoPanel.getBounds().width/2-50, 20 , 100, 50);
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

        JLabel creationLabel = new JLabel("Dodaj linię");
        creationLabel.setFont(new Font("Arial", Font.BOLD, 25));
        creationLabel.setBounds(creation.getBounds().x + 80, 30 , 240, 100);
        creationLabel.setForeground(Color.white);
        creation.add(creationLabel);

        ButtonGroup lineButtonsCreate = new ButtonGroup();

        JRadioButton busRadioCreate = new JRadioButton("Autobusowy");
        busRadioCreate.setBounds(creation.getBounds().x + 60, creation.getBounds().y + 320, 140,30);
        busRadioCreate.setActionCommand("kierowca");
        add(busRadioCreate);
        lineButtonsCreate.add(busRadioCreate);

        JRadioButton tramRadioCreate = new JRadioButton("Tramwajowy");
        tramRadioCreate.setBounds(creation.getBounds().x + 200, creation.getBounds().y + 320, 140,30);
        tramRadioCreate.setActionCommand("obsługa");
        add(tramRadioCreate);
        lineButtonsCreate.add(tramRadioCreate);
        
        //  NUMER LINII
        JTextField numberRouteCreate = new JTextField("NUMER LINII");
        numberRouteCreate.setBounds(creation.getBounds().x + 150,creation.getBounds().y  + 100,100,40);
        add(numberRouteCreate);

        //  PIERWSZA TRASA
        JTextField createFirst = new JTextField("Trasa 1");
        createFirst.setBounds(creation.getBounds().x + 140,creation.getBounds().y + 150,120,40);
        add(createFirst);

        //  DRUGA TRASA
        JTextField createSecond = new JTextField("Trasa 2");
        createSecond.setBounds(creation.getBounds().x + 140,creation.getBounds().y + 200,120,40);
        add(createSecond);

        //  TRZECIA TRASA
        JTextField createThird = new JTextField("Trasa 3");
        createThird.setBounds(creation.getBounds().x + 140,creation.getBounds().y + 250,120,40);
        add(createThird);

        // ADD ROUTE
        JButton addRoute = new JButton("Dodaj linię");
        addRoute.setBounds(creation.getBounds().x + 110,creation.getBounds().y + 400,180,40);
        addRoute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String lineNumber = numberRouteCreate.getText();

                String type = lineButtonsCreate.getSelection().getActionCommand();

                String first = createFirst.getText();
                String second = createSecond.getText();
                String third = createThird.getText();

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