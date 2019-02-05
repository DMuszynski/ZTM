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

public class ManageWorkerSchedule extends JPanel{

    private Image background;

    public ManageWorkerSchedule(){

        Main.newWindow.setVisible(true);
        setPreferredSize(new Dimension(Window.WIDTH, Window.HEIGHT));
        setFocusable(true);
        setLayout(null);
        loadBackground();



        ///////////////////////////   TITLE    /////////////////////////////////////
        JLabel title = new JLabel("Zarządzanie Harmonogramem");
        title.setFont(new Font("Arial", Font.BOLD, 40));
        title.setBounds(Window.WIDTH /2 - 350, 30 , 700, 100);
        title.setForeground(Color.white);
        add(title);





        ///////////////////////////   MANAGMENT PANEL    /////////////////////////////////////
        JPanel managment = new JPanel();
        managment.setSize(400,520);
        managment.setLocation(Window.WIDTH /2 - 650, 150);
        managment.setBackground(new Color(0,0,0,30));
        add(managment);

        JLabel managmentLabel = new JLabel("Modyfikuj harmonogram");
        managmentLabel.setFont(new Font("Arial", Font.BOLD, 25));
        managmentLabel.setBounds(managment.getBounds().x + 80, 30 , 240, 100);
        managmentLabel.setForeground(Color.white);
        managment.add(managmentLabel);

        // ID Day
        JTextField idSchedule = new JTextField("ID");
        idSchedule.setBounds(managment.getBounds().x + 80,managment.getBounds().y  + 60,80,40);
        add(idSchedule);

        // FIND Schedule
        JButton findSchedule = new JButton("Znajdź harmonogram");
        findSchedule.setBounds(managment.getBounds().x + 160,managment.getBounds().y + 60,200,40);
        findSchedule.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String id = idSchedule.getText();

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(findSchedule);

        //  DAYS OFF
        JTextField manageDaysOff = new JTextField("Dni wolne");
        manageDaysOff.setBounds(managment.getBounds().x + 130,managment.getBounds().y + 120,140,40);
        add(manageDaysOff);

        //  BID
        JTextField manageBid = new JTextField("Stawka godzinowa");
        manageBid.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 170,120,40);
        add(manageBid);

        //  MAX HOURS
        JTextField manageHours = new JTextField("Maksymalna liczba godzin");
        manageHours.setBounds(managment.getBounds().x + 120,managment.getBounds().y + 220,170,40);
        add(manageHours);

        //  DAY 1
        JTextField manage1 = new JTextField("Dzień 1");
        manage1.setBounds(managment.getBounds().x + 120,managment.getBounds().y + 270,170,40);
        add(manage1);

        //  DAY 2
        JTextField manage2 = new JTextField("Dzień 2");
        manage2.setBounds(managment.getBounds().x + 120,managment.getBounds().y + 320,170,40);
        add(manage2);

        //  DAY 3
        JTextField manage3 = new JTextField("Dzień 3");
        manage3.setBounds(managment.getBounds().x + 120,managment.getBounds().y + 370,170,40);
        add(manage3);

        // MANAGE Schedule
        JButton manageSchedule = new JButton("Modyfikuj harmonogram");
        manageSchedule.setBounds(managment.getBounds().x + 90,managment.getBounds().y + 420,220,40);
        manageSchedule.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String id = idSchedule.getText();

                String daysOff = manageDaysOff.getText();
                String bid = manageBid.getText();
                String hours = manageHours.getText();

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(manageSchedule);

        // DELETE Schedule
        JButton deleteSchedule = new JButton("Usuń harmonogram");
        deleteSchedule.setBounds(managment.getBounds().x + 110,managment.getBounds().y + 460,180,40);
        deleteSchedule.setBackground(Color.RED);
        deleteSchedule.setOpaque(true);
        deleteSchedule.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String ID = idSchedule.getText();

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(deleteSchedule);





        JPanel infoPanel = new JPanel();
        infoPanel.setSize(400,520);
        infoPanel.setLocation(Window.WIDTH/2 - 200, 150);
        infoPanel.setLayout(null);
        infoPanel.setBackground(new Color(0,0,0,30));
        infoPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        add(infoPanel);

        JLabel infoPanelLabel = new JLabel("Harmonogramy");
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

        JLabel creationLabel = new JLabel("Dodaj harmonogram");
        creationLabel.setFont(new Font("Arial", Font.BOLD, 25));
        creationLabel.setBounds(creation.getBounds().x + 80, 30 , 240, 100);
        creationLabel.setForeground(Color.white);
        creation.add(creationLabel);

        //  DAYS PFF
        JTextField createDaysOff = new JTextField("Dni wolne");
        createDaysOff.setBounds(creation.getBounds().x + 130,creation.getBounds().y + 70,140,40);
        add(createDaysOff);

        //  BID
        JTextField createBid = new JTextField("Stawka godzinna");
        createBid.setBounds(creation.getBounds().x + 140,creation.getBounds().y + 120,120,40);
        add(createBid);

        //  MAX HOURS
        JTextField createHours = new JTextField("Maksymalna liczba godzin");
        createHours.setBounds(creation.getBounds().x + 120,creation.getBounds().y + 170,170,40);
        add(createHours);

        //  DAY 1
        JTextField create1 = new JTextField("Dzień 1");
        create1.setBounds(creation.getBounds().x + 120,creation.getBounds().y + 220,170,40);
        add(create1);

        //  DAY 2
        JTextField create2 = new JTextField("Dzień 2");
        create2.setBounds(creation.getBounds().x + 120,creation.getBounds().y + 270,170,40);
        add(create2);

        //  DAY 3
        JTextField create3 = new JTextField("Dzień 3");
        create3.setBounds(creation.getBounds().x + 120,creation.getBounds().y + 320,170,40);
        add(create3);

        // ADD Schedule
        JButton addSchedule = new JButton("Dodaj harmonogram");
        addSchedule.setBounds(creation.getBounds().x + 110,creation.getBounds().y + 400,180,40);
        addSchedule.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String daysOff = createDaysOff.getText();
                String bid = createBid.getText();
                String hours = createHours.getText();
                String dayOne = create1.getText();
                String dayTwo = create2.getText();
                String dayThree = create3.getText();

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(addSchedule);






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
