package com.company.managment;

import com.company.Window;
import com.company.Main;
import com.company.Menu;
import com.company.panels.AdminPanel;

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
        managment.setLocation(Window.WIDTH /2 - 650, 150);
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
        driverRadio.setBounds(managment.getBounds().x + 100, managment.getBounds().y + 170, 100,30);
        driverRadio.setActionCommand("kierowca");
        add(driverRadio);
        positionButtons.add(driverRadio);

        JRadioButton serviceRadio = new JRadioButton("Obsługa");
        serviceRadio.setBounds(managment.getBounds().x + 200, managment.getBounds().y + 170, 100,30);
        serviceRadio.setActionCommand("obsługa");
        add(serviceRadio);
        positionButtons.add(serviceRadio);


        //  ID PRACOWNIKA
        JTextField manageID = new JTextField("ID użytkownika");
        manageID.setBounds(managment.getBounds().x + 130,managment.getBounds().y + 220,140,40);
        add(manageID);

        //  ID HARMONOGRAMU
        JTextField manageScheduleId = new JTextField("ID harmonogramu");
        manageScheduleId.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 270,120,40);
        add(manageScheduleId);


        // MANAGE WORKER
        JButton manageWorker = new JButton("Modyfikuj pracownika");
        manageWorker.setBounds(managment.getBounds().x + 90,managment.getBounds().y + 420,220,40);
        manageWorker.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String currentID = idWorker.getText();
                String position = positionButtons.getSelection().getActionCommand();
                String schedule= manageScheduleId.getText();
                String id = manageID.getText();

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(manageWorker);

        // DELETE WORKER
        JButton deleteWorker = new JButton("Usuń pracownika");
        deleteWorker.setBounds(managment.getBounds().x + 110,managment.getBounds().y + 460,180,40);
        deleteWorker.setBackground(Color.RED);
        deleteWorker.setOpaque(true);
        deleteWorker.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String ID = idWorker.getText();

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(deleteWorker);





        JPanel infoPanel = new JPanel();
        infoPanel.setSize(400,520);
        infoPanel.setLocation(Window.WIDTH/2 - 200, 150);
        infoPanel.setLayout(null);
        infoPanel.setBackground(new Color(0,0,0,30));
        infoPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        add(infoPanel);

        JLabel infoPanelLabel = new JLabel("Pracownicy");
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

        JLabel creationLabel = new JLabel("Dodaj pracownika");
        creationLabel.setFont(new Font("Arial", Font.BOLD, 25));
        creationLabel.setBounds(creation.getBounds().x + 80, 30 , 240, 100);
        creationLabel.setForeground(Color.white);
        creation.add(creationLabel);

        ButtonGroup positionButtonsCreate = new ButtonGroup();

        JRadioButton driverRadioCreate = new JRadioButton("Kierowca");
        driverRadioCreate.setBounds(creation.getBounds().x + 100, creation.getBounds().y + 120, 100,30);
        driverRadioCreate.setActionCommand("kierowca");
        add(driverRadioCreate);
        positionButtonsCreate.add(driverRadioCreate);

        JRadioButton serviceRadioCreate = new JRadioButton("Obsługa");
        serviceRadioCreate.setBounds(creation.getBounds().x + 200, creation.getBounds().y + 120, 100,30);
        serviceRadioCreate.setActionCommand("obsługa");
        add(serviceRadioCreate);
        positionButtonsCreate.add(serviceRadioCreate);


        //  ID UŻYTKOWNIKA
        JTextField createID = new JTextField("ID pracownika");
        createID.setBounds(creation.getBounds().x + 130,creation.getBounds().y + 170,140,40);
        add(createID);

        //  ID HARMONOGRAMU
        JTextField createScheduleId = new JTextField("ID harmonogramu");
        createScheduleId.setBounds(creation.getBounds().x + 140,creation.getBounds().y + 220,120,40);
        add(createScheduleId);

        // ADD WORKER
        JButton addWorker = new JButton("Dodaj pracownika");
        addWorker.setBounds(creation.getBounds().x + 110,creation.getBounds().y + 400,180,40);
        addWorker.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String position = positionButtonsCreate.getSelection().getActionCommand();
                String daysOff= createScheduleId.getText();
                String id = createID.getText();

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
