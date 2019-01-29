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
        JLabel title = new JLabel("Zarządzanie pracownikami");
        title.setFont(new Font("Arial", Font.BOLD, 40));
        title.setBounds(Window.WIDTH /2 - 310, 30 , 620, 100);
        title.setForeground(Color.white);
        add(title);





        ///////////////////////////   MANAGMENT PANEL    /////////////////////////////////////
        JPanel managment = new JPanel();
        managment.setSize(400,520);
        managment.setLocation(Window.WIDTH /2 - 500, 150);
        managment.setBackground(new Color(0,0,0,30));
        add(managment);

        JLabel managmentLabel = new JLabel("Modyfikuj pracownika");
        managmentLabel.setFont(new Font("Arial", Font.BOLD, 25));
        managmentLabel.setBounds(managment.getBounds().x + 80, 30 , 240, 100);
        managmentLabel.setForeground(Color.white);
        managment.add(managmentLabel);

        // ID WORKER
        JTextField idWorker = new JTextField("ID");
        idWorker.setBounds(managment.getBounds().x + 80,managment.getBounds().y  + 60,80,40);
        add(idWorker);

        // FIND WORKER
        JButton findWorker = new JButton("Znajdź pracownika");
        findWorker.setBounds(managment.getBounds().x + 170,managment.getBounds().y + 60,180,40);
        findWorker.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String id = idWorker.getText();

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(findWorker);

        ButtonGroup positionButtons = new ButtonGroup();

        JRadioButton driverRadio = new JRadioButton("Kierowca");
        driverRadio.setBounds(managment.getBounds().x + 100, managment.getBounds().y + 120, 100,30);
        driverRadio.setActionCommand("kierowca");
        add(driverRadio);
        positionButtons.add(driverRadio);

        JRadioButton serviceRadio = new JRadioButton("Obsługa");
        serviceRadio.setBounds(managment.getBounds().x + 200, managment.getBounds().y + 120, 100,30);
        serviceRadio.setActionCommand("obsługa");
        add(serviceRadio);
        positionButtons.add(serviceRadio);

        //  PŁACA
        JTextField manageReward = new JTextField("Płaca");
        manageReward.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 170,120,40);
        add(manageReward);

        //  ID PRACOWNIKA
        JTextField manageID = new JTextField("ID pracownika");
        manageID.setBounds(managment.getBounds().x + 130,managment.getBounds().y + 220,140,40);
        add(manageID);

        //  DNI WOLNE
        JTextField manageDaysOff = new JTextField("Dni wolne");
        manageDaysOff.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 270,120,40);
        add(manageDaysOff);

        //  LOGIN
        JTextField manageLogin = new JTextField("Login");
        manageLogin.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 320,120,40);
        add(manageLogin);

        //  HASŁO
        JTextField managePassword = new JTextField("Hasło");
        managePassword.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 370,120,40);
        add(managePassword);

        // MANAGE WORKER
        JButton manageWorker = new JButton("Modyfikuj pracownika");
        manageWorker.setBounds(managment.getBounds().x + 90,managment.getBounds().y + 420,220,40);
        manageWorker.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String currentID = idWorker.getText();

                String position = positionButtons.getSelection().getActionCommand();
                String model = manageReward.getText();
                String daysOff= manageDaysOff.getText();
                String id = manageID.getText();
                String login = manageLogin.getText();
                String password = managePassword.getText();

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(manageWorker);

        // DELETE WORKER
        JButton deleteWorker = new JButton("Usuń pracownika");
        deleteWorker.setBounds(managment.getBounds().x + 110,managment.getBounds().y + 460,180,40);
        deleteWorker.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {


                String ID = idWorker.getText();
                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(deleteWorker);





        ///////////////////////////   CREATION PANEL    /////////////////////////////////////
        JPanel creation = new JPanel();
        creation.setSize(400,500);
        creation.setLocation(Window.WIDTH /2 + 100, 150);
        creation.setBackground(new Color(0,0,0,30));
        add(creation);

        JLabel creationLabel = new JLabel("Dodaj pracownika");
        creationLabel.setFont(new Font("Arial", Font.BOLD, 25));
        creationLabel.setBounds(creation.getBounds().x + 80, 30 , 240, 100);
        creationLabel.setForeground(Color.white);
        creation.add(creationLabel);

        ButtonGroup positionButtonsCreate = new ButtonGroup();

        JRadioButton driverRadioCreate = new JRadioButton("Kierowca");
        driverRadioCreate.setBounds(creation.getBounds().x + 100, creation.getBounds().y + 80, 100,30);
        driverRadioCreate.setActionCommand("kierowca");
        add(driverRadioCreate);
        positionButtonsCreate.add(driverRadioCreate);

        JRadioButton serviceRadioCreate = new JRadioButton("Obsługa");
        serviceRadioCreate.setBounds(creation.getBounds().x + 200, creation.getBounds().y + 80, 100,30);
        serviceRadioCreate.setActionCommand("obsługa");
        add(serviceRadioCreate);
        positionButtonsCreate.add(serviceRadioCreate);

        //  PŁACA
        JTextField createReward = new JTextField("Płaca");
        createReward.setBounds(creation.getBounds().x + 140,creation.getBounds().y + 120,120,40);
        add(createReward);

        //  ID
        JTextField createID = new JTextField("ID pracownika");
        createID.setBounds(creation.getBounds().x + 130,creation.getBounds().y + 170,140,40);
        add(createID);

        //  DNI WOLNE
        JTextField createDaysOff = new JTextField("Dni wolne");
        createDaysOff.setBounds(creation.getBounds().x + 140,creation.getBounds().y + 220,120,40);
        add(createDaysOff);

        //  LOGIN
        JTextField createLogin = new JTextField("Login");
        createLogin.setBounds(creation.getBounds().x + 140,creation.getBounds().y + 270,120,40);
        add(createLogin);

        //  HASŁO
        JTextField createPassword = new JTextField("Hasło");
        createPassword.setBounds(creation.getBounds().x + 140,creation.getBounds().y + 320,120,40);
        add(createPassword);

        // ADD WORKER
        JButton addWorker = new JButton("Dodaj pracownika");
        addWorker.setBounds(creation.getBounds().x + 110,creation.getBounds().y + 400,180,40);
        addWorker.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String position = positionButtons.getSelection().getActionCommand();
                String model = createReward.getText();
                String daysOff= createDaysOff.getText();
                String id = createID.getText();
                String login = createLogin.getText();
                String password = createPassword.getText();

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(addWorker);



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
