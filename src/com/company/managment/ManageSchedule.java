package com.company.managment;

import com.company.Main;
import com.company.Menu;
import com.company.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManageSchedule extends JPanel{

    private Image background;

    public ManageSchedule(){

        Main.newWindow.setVisible(true);
        setPreferredSize(new Dimension(Window.WIDTH, Window.HEIGHT));
        setFocusable(true);
        setLayout(null);
        loadBackground();



        ///////////////////////////   TITLE    /////////////////////////////////////
        JLabel title = new JLabel("Zarządzanie harmonogramem");
        title.setFont(new Font("Arial", Font.BOLD, 40));
        title.setBounds(Window.WIDTH /2 - 350, 30 , 700, 100);
        title.setForeground(Color.white);
        add(title);





        ///////////////////////////   MANAGMENT PANEL    /////////////////////////////////////
        JPanel managment = new JPanel();
        managment.setSize(400,520);
        managment.setLocation(Window.WIDTH /2 - 200, 150);
        managment.setBackground(new Color(0,0,0,30));
        add(managment);

        JLabel managmentLabel = new JLabel("Modyfikuj harmonogram");
        managmentLabel.setFont(new Font("Arial", Font.BOLD, 25));
        managmentLabel.setBounds(managment.getBounds().x + 80, 30 , 240, 100);
        managmentLabel.setForeground(Color.white);
        managment.add(managmentLabel);

        // WORKER ID
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

        //  PONIEDZIAŁEK
        JTextField manageMonday = new JTextField("Poniedziałek");
        manageMonday.setBounds(managment.getBounds().x + 140,managment.getBounds().y  + 120,120,40);
        add(manageMonday);

        //  WTOREK
        JTextField manageTuesday = new JTextField("Wtorek");
        manageTuesday.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 170,120,40);
        add(manageTuesday);

        //  ŚRODA
        JTextField manageWednesday = new JTextField("Środa");
        manageWednesday.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 220,120,40);
        add(manageWednesday);

        //  CZWARTEK
        JTextField manageThursday = new JTextField("Czwartek");
        manageThursday.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 270,120,40);
        add(manageThursday);

        //  PIĄTEK
        JTextField manageFriday = new JTextField("Piątek");
        manageFriday.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 320,120,40);
        add(manageFriday);

        //  SOBOTA
        JTextField manageSaturday = new JTextField("Sobota");
        manageSaturday.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 370,120,40);
        add(manageSaturday);

        //  NIEDZIELA
        JTextField manageSunday = new JTextField("Niedziela");
        manageSunday.setBounds(managment.getBounds().x + 140,managment.getBounds().y + 420,120,40);
        add(manageSunday);

        // MANAGE VEHICLE
        JButton manageSchedule = new JButton("Modyfikuj harmonogram");
        manageSchedule.setBounds(managment.getBounds().x + 100,managment.getBounds().y + 470,220,40);
        manageSchedule.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String workerID = idWorker.getText();

                String monday = manageMonday.getText();
                String tuesday = manageTuesday.getText();
                String wendesday = manageWednesday.getText();
                String thursday = manageThursday.getText();
                String friday = manageFriday.getText();
                String saturday = manageSaturday.getText();
                String sunday = manageSunday.getText();

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(manageSchedule);





        ///////////////////////////   BACK BUTTON    /////////////////////////////////////
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
