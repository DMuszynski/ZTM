package com.company.panels;

import com.company.*;
import com.company.Menu;
import com.company.Window;
import com.company.managment.ManageRoute;
import com.company.managment.ManageSchedule;
import com.company.managment.ManageVehicle;
import com.company.managment.ManageWorker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminPanel extends JPanel{

    private Image background;
    private Image userProfile;

    public AdminPanel(){



        Main.newWindow.setVisible(true);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setFocusable(true);
        setLayout(null);
        loadBackground();



        ///////////////////////////   TITLE    /////////////////////////////////////

        JLabel title = new JLabel("Panel Administratora");
        title.setFont(new Font("Arial", Font.BOLD, 40));
        title.setBounds(Window.WIDTH/2 - 240, 30 , 480, 100);
        title.setForeground(Color.white);
        add(title);



        ///////////////////////////   USER DATA PANEL    /////////////////////////////////////

        JPanel userDataPanel = new JPanel();
        userDataPanel.setSize(300,200);
        userDataPanel.setLocation(70, 20);
        userDataPanel.setLayout(null);
        userDataPanel.setBackground(new Color(0,0,0,0));
        userDataPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));;
        add(userDataPanel);

        // LABEL
        JLabel panelLabel = new JLabel();
        panelLabel.setText("<html><center>Zalogowano jako</center></html>");
        panelLabel.setFont(new Font("Arial", Font.BOLD, 18));
        panelLabel.setBounds(60, 5, 200, 30);
        panelLabel.setForeground(Color.white);
        userDataPanel.add(panelLabel);

        // NAME
        JLabel userName = new JLabel();
        userName.setText("<html><center>Imię</center></html>");
        userName.setFont(new Font("Arial", Font.BOLD, 18));
        userName.setBounds(10, 50, 290, 30);
        userName.setForeground(Color.white);
        userDataPanel.add(userName);

        // SURNAME
        JLabel userSurname = new JLabel();
        userSurname.setText("<html><center>Nazwisko</center></html>");
        userSurname.setFont(new Font("Arial", Font.BOLD, 18));
        userSurname.setBounds(10, 80, 290, 30);
        userSurname.setForeground(Color.white);
        userDataPanel.add(userSurname);

        // POSITION
        JLabel workerPosition = new JLabel();
        workerPosition.setText("<html><center>Administrator</center></html>");
        workerPosition.setFont(new Font("Arial", Font.BOLD, 18));
        workerPosition.setBounds(10, 130, 290, 30);
        workerPosition.setForeground(Color.white);
        userDataPanel.add(workerPosition);



        ///////////////////////////   BUTTONS    /////////////////////////////////////



        // MODIFY SCHEDULE
        JButton modifyScheduleButton = new JButton(new ImageIcon("images/modify_schedule_icon.png"));
        modifyScheduleButton.setBounds((Window.WIDTH /2-90) - 500, Window.HEIGHT - 500, 180,180);
        modifyScheduleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setVisible(false);
                Main.newWindow.setContentPane(new ManageSchedule());
                Main.newWindow.revalidate();
            }
        });
        add(modifyScheduleButton);
        JLabel modifyScheduleLabel = new JLabel();
        modifyScheduleLabel.setText("<html><center>Zarządzanie harmonogramem</center></html>");
        modifyScheduleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        modifyScheduleLabel.setBounds(modifyScheduleButton.getBounds().x, modifyScheduleButton.getBounds().y + 185, 180, 50);
        modifyScheduleLabel.setForeground(Color.white);
        add(modifyScheduleLabel);



        // MODIFY USER
        JButton modifyUserButton = new JButton(new ImageIcon("images/modify_user_icon.png"));
        modifyUserButton.setBounds((Window.WIDTH /2-90) - 300, Window.HEIGHT - 500, 180,180);
        modifyUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setVisible(false);
                Main.newWindow.setContentPane(new ManageWorker());
                Main.newWindow.revalidate();
            }
        });
        add(modifyUserButton);
        JLabel modifyUserLabel = new JLabel();
        modifyUserLabel.setText("<html><center>Zarządzanie pracownikami</center></html>");
        modifyUserLabel.setFont(new Font("Arial", Font.BOLD, 18));
        modifyUserLabel.setBounds(modifyUserButton.getBounds().x, modifyUserButton.getBounds().y + 185, 180, 50);
        modifyUserLabel.setForeground(Color.white);
        add(modifyUserLabel);



        // ROUTE
        JButton routeButton = new JButton(new ImageIcon("images/route_icon.png"));
        routeButton.setBounds((Window.WIDTH /2-90) - 100, Window.HEIGHT - 500, 180,180);
        routeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setVisible(false);
                Main.newWindow.setContentPane(new ManageRoute());
                Main.newWindow.revalidate();
            }
        });
        add(routeButton);
        JLabel routeLabel = new JLabel();
        routeLabel.setText("<html><center>Zarządzanie trasami</center></html>");
        routeLabel.setFont(new Font("Arial", Font.BOLD, 18));
        routeLabel.setBounds(routeButton.getBounds().x, routeButton.getBounds().y + 185, 180, 50);
        routeLabel.setForeground(Color.white);
        add(routeLabel);



        // BUS
        JButton busButton = new JButton(new ImageIcon("images/bus_icon.png"));
        busButton.setBounds((Window.WIDTH /2-90) + 100, Window.HEIGHT - 500, 180,180);
        busButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setVisible(false);
                Main.newWindow.setContentPane(new ManageVehicle());
                Main.newWindow.revalidate();
            }
        });
        add(busButton);
        JLabel busLabel = new JLabel();
        busLabel.setText("<html><center>Zarządzanie pojazdami</center></html>");
        busLabel.setFont(new Font("Arial", Font.BOLD, 18));
        busLabel.setBounds(busButton.getBounds().x, busButton.getBounds().y + 185, 180, 50);
        busLabel.setForeground(Color.white);
        add(busLabel);



        // CREATE CARD
        JButton createCardButton = new JButton(new ImageIcon("images/create_card_icon.png"));
        createCardButton.setBounds((Window.WIDTH /2-90) + 300, Window.HEIGHT - 500, 180,180);
        createCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setVisible(false);
                Main.newWindow.setContentPane(new CreateCityCard());
                Main.newWindow.revalidate();
            }
        });
        add(createCardButton);
        JLabel createCardLabel = new JLabel();
        createCardLabel.setText("<html><center>Wydaj kartę miejską</center></html>");
        createCardLabel.setFont(new Font("Arial", Font.BOLD, 18));
        createCardLabel.setBounds(createCardButton.getBounds().x, createCardButton.getBounds().y + 185, 180, 50);
        createCardLabel.setForeground(Color.white);
        add(createCardLabel);



        // WORK SCHEDULE
        JButton workScheduleButton = new JButton(new ImageIcon("images/work_schedule_icon.png"));
        workScheduleButton.setBounds((Window.WIDTH /2-90) + 500, Window.HEIGHT - 500, 180,180);
        workScheduleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setVisible(false);
                Main.newWindow.setContentPane(new WorkSchedule());
                Main.newWindow.revalidate();
            }
        });
        add(workScheduleButton);
        JLabel workScheduleLabel = new JLabel();
        workScheduleLabel.setText("<html><center>Harmonogram Pracy</center></html>");
        workScheduleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        workScheduleLabel.setBounds(workScheduleButton.getBounds().x, workScheduleButton.getBounds().y + 185, 180, 50);
        workScheduleLabel.setForeground(Color.white);
        add(workScheduleLabel);



        // TICKET
        JButton ticketButton = new JButton(new ImageIcon("images/ticket_icon.png"));
        ticketButton.setBounds((Window.WIDTH /2-90) - 500, Window.HEIGHT - 250, 180,180);
        ticketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setVisible(false);
                Main.newWindow.setContentPane(new TicketPanel());
                Main.newWindow.revalidate();
            }
        });
        add(ticketButton);
        JLabel ticketLabel = new JLabel();
        ticketLabel.setText("<html><center>Zakup biletów ZTM</center></html>");
        ticketLabel.setFont(new Font("Arial", Font.BOLD, 18));
        ticketLabel.setBounds(ticketButton.getBounds().x, ticketButton.getBounds().y + 185, 180, 50);
        ticketLabel.setForeground(Color.white);
        add(ticketLabel);



        // CITY CARD
        JButton cityCardButton = new JButton(new ImageIcon("images/city_card_icon.png"));
        cityCardButton.setBounds((Window.WIDTH /2-90) - 300, Window.HEIGHT - 250, 180,180);
        cityCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setVisible(false);
                Main.newWindow.setContentPane(new CityCard());
                Main.newWindow.revalidate();
            }
        });
        add(cityCardButton);
        JLabel cityCardLabel = new JLabel();
        cityCardLabel.setText("<html><center>Zarządzaj kartą miejską</center></html>");
        cityCardLabel.setFont(new Font("Arial", Font.BOLD, 18));
        cityCardLabel.setBounds(cityCardButton.getBounds().x, cityCardButton.getBounds().y + 185, 180, 50);
        cityCardLabel.setForeground(Color.white);
        add(cityCardLabel);



        // SEARCH CONNECTION
        JButton searchConnectionButton = new JButton(new ImageIcon("images/search_icon.png"));
        searchConnectionButton.setBounds((Window.WIDTH /2-90) - 100, Window.HEIGHT - 250, 180,180);
        searchConnectionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setVisible(false);
                Main.newWindow.setContentPane(new SearchConnection());
                Main.newWindow.revalidate();
            }
        });
        add(searchConnectionButton);
        JLabel searchConnectionLabel = new JLabel();
        searchConnectionLabel.setText("<html><center>Wyszukaj Połączenie</center></html>");
        searchConnectionLabel.setFont(new Font("Arial", Font.BOLD, 18));
        searchConnectionLabel.setBounds(searchConnectionButton.getBounds().x, searchConnectionButton.getBounds().y + 185, 180, 50);
        searchConnectionLabel.setForeground(Color.white);
        add(searchConnectionLabel);



        // TIMETABLE
        JButton timetableButton = new JButton(new ImageIcon("images/timetable_icon.png"));
        timetableButton.setBounds( (Window.WIDTH /2-90) + 100, Window.HEIGHT - 250, 180,180);
        timetableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setVisible(false);
                Main.newWindow.setContentPane(new Timetable());
                Main.newWindow.revalidate();
            }
        });
        add(timetableButton);
        JLabel timetableLabel = new JLabel();
        timetableLabel.setText("<html><center>Rozkład jazdy ZTM</center></html>");
        timetableLabel.setFont(new Font("Arial", Font.BOLD, 18));
        timetableLabel.setBounds(timetableButton.getBounds().x, timetableButton.getBounds().y + 185, 180, 60);
        timetableLabel.setForeground(Color.white);
        add(timetableLabel);



        // CONTACT
        JButton informationButton = new JButton(new ImageIcon("images/info_icon.png"));
        informationButton.setBounds((Window.WIDTH /2-90) + 300, Window.HEIGHT - 250, 180,180);
        informationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setVisible(false);
                Main.newWindow.setContentPane(new Information());
                Main.newWindow.revalidate();
            }
        });
        add(informationButton);
        JLabel informationLabel = new JLabel();
        informationLabel.setText("<html><center>Informacja i Kontakt</center></html>");
        informationLabel.setFont(new Font("Arial", Font.BOLD, 18));
        informationLabel.setBounds(informationButton.getBounds().x, informationButton.getBounds().y + 185, 180, 60);
        informationLabel.setForeground(Color.white);
        add(informationLabel);



        // SETTINGS
        JButton settingsButton = new JButton(new ImageIcon("images/settings_icon.png"));
        settingsButton.setBounds((Window.WIDTH /2-90) + 500, Window.HEIGHT - 250, 180,180);
        settingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setVisible(false);
                Main.newWindow.setContentPane(new AccountSettings());
                Main.newWindow.revalidate();
            }
        });
        add(settingsButton);
        JLabel settingsLabel = new JLabel();
        settingsLabel.setText("<html><center>Ustawienia konta</center></html>");
        settingsLabel.setFont(new Font("Arial", Font.BOLD, 18));
        settingsLabel.setBounds(settingsButton.getBounds().x, settingsButton.getBounds().y + 185, 180, 50);
        settingsLabel.setForeground(Color.white);
        add(settingsLabel);



        ///////////////////////////   LOGOUT    /////////////////////////////////////

        JButton logoutButton = new JButton("Wyloguj");
        logoutButton.setBounds(Window.WIDTH - 140, 40, 100, 30);
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(logoutButton);

    }



    ///////////////////////////   DRAWING    /////////////////////////////////////

    private void loadBackground(){
        ImageIcon bg = new ImageIcon("images/background.png");
        ImageIcon up = new ImageIcon("images/user_profile_icon.png");
        background = bg.getImage();
        userProfile = up.getImage();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
        Toolkit.getDefaultToolkit().sync();
    }

    private void doDrawing(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g.drawImage(background, 0, 0, null);
        g.drawImage(userProfile, 250,70,null);
    }

}
