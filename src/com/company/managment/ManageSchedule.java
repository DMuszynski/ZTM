package com.company.managment;

import com.company.*;
import com.company.Menu;
import com.company.Window;
import com.company.panels.AdminPanel;
import com.sun.deploy.ui.AboutDialog;

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




        // MANAGE SCHEDULE
        JButton manageWorkerScheduleButton = new JButton(new ImageIcon("images/manage_schedule_icon.png"));
        manageWorkerScheduleButton.setBounds(Window.WIDTH/2 - 380, Window.HEIGHT/2-90, 180,180);
        manageWorkerScheduleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setVisible(false);
                Main.newWindow.setContentPane(new ManageWorkerSchedule());
                Main.newWindow.revalidate();
            }
        });
        add(manageWorkerScheduleButton);
        JLabel manageWorkerScheduleLabel = new JLabel();
        manageWorkerScheduleLabel.setText("<html><center>Zarządzanie Harmonogramem Pracownika</center></html>");
        manageWorkerScheduleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        manageWorkerScheduleLabel.setBounds(manageWorkerScheduleButton.getBounds().x, manageWorkerScheduleButton.getBounds().y + 185, 180, 60);
        manageWorkerScheduleLabel.setForeground(Color.white);
        add(manageWorkerScheduleLabel);



        //workDays
        JButton workDaysButton = new JButton(new ImageIcon("images/day_icon.png"));
        workDaysButton.setBounds( Window.WIDTH/2 + 200, Window.HEIGHT/2 - 90, 180,180);
        workDaysButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setVisible(false);
                Main.newWindow.setContentPane(new ManageWorkDay());
                Main.newWindow.revalidate();
            }
        });
        add(workDaysButton);
        JLabel workDaysLabel = new JLabel();
        workDaysLabel.setText("<html><center>Zarządzanie Dniem Pracy Pracownika</center></html>");
        workDaysLabel.setFont(new Font("Arial", Font.BOLD, 18));
        workDaysLabel.setBounds(workDaysButton.getBounds().x, workDaysButton.getBounds().y + 185, 180, 60);
        workDaysLabel.setForeground(Color.white);
        add(workDaysLabel);





        ///////////////////////////   BACK BUTTON    /////////////////////////////////////
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
