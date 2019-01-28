package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicketPanel extends JPanel{

    private Image background;

    public TicketPanel(){
        Main.newWindow.setVisible(true);
        setPreferredSize(new Dimension(Window.WIDTH, Window.HEIGHT));
        setFocusable(true);
        setLayout(null);
        loadBackground();



        ///////////////////////////   TITLE    /////////////////////////////////////

        JLabel title = new JLabel("Bilety ZTM");
        title.setFont(new Font("Arial", Font.BOLD, 40));
        title.setBounds(Window.WIDTH/2-140, 30 , 280, 100);
        title.setForeground(Color.white);
        add(title);


        ///////////////////////////   RADIO BUTTONS    /////////////////////////////////////

        ButtonGroup tickets = new ButtonGroup();

        JLabel normalTicketLabel = new JLabel("Normalny");
        normalTicketLabel.setFont(new Font("Arial", Font.BOLD, 25));
        normalTicketLabel.setBounds(Window.WIDTH/2 - 270,230 , 160, 50);
        normalTicketLabel.setForeground(Color.WHITE);
        add(normalTicketLabel);

        JRadioButton normalDisposable = new JRadioButton("Jednorazowy");
        normalDisposable.setBounds(Window.WIDTH/2 - 300, 300, 200,30);
        normalDisposable.setActionCommand("normal disposable");
        add(normalDisposable);
        tickets.add(normalDisposable);

        JRadioButton normalHour = new JRadioButton("Jednogodzinny");
        normalHour.setBounds(Window.WIDTH/2 - 300, 350, 200,30);
        normalHour.setActionCommand("normal hour");
        add(normalHour);
        tickets.add(normalHour);

        JRadioButton normalDaily = new JRadioButton("Jednodniowy");
        normalDaily.setBounds(Window.WIDTH/2 - 300, 400, 200,30);
        normalDaily.setActionCommand("normal daily");
        add(normalDaily);
        tickets.add(normalDaily);


        JLabel reducedTickerLabel = new JLabel("Ulgowy");
        reducedTickerLabel.setFont(new Font("Arial", Font.BOLD, 25));
        reducedTickerLabel.setBounds(Window.WIDTH/2 + 150,230 , 160, 50);
        reducedTickerLabel.setForeground(Color.WHITE);
        add(reducedTickerLabel);

        JRadioButton reducedDisposable = new JRadioButton("Jednorazowy");
        reducedDisposable.setBounds(Window.WIDTH/2 + 100, 300, 200,30);
        reducedDisposable.setActionCommand("reduced disposable");
        add(reducedDisposable);
        tickets.add(reducedDisposable);

        JRadioButton reducedHour = new JRadioButton("Jednogodzinny");
        reducedHour.setBounds(Window.WIDTH/2 + 100, 350, 200,30);
        reducedHour.setActionCommand("reduced hour");
        add(reducedHour);
        tickets.add(reducedHour);

        JRadioButton reducedDaily = new JRadioButton("Jednodniowy");
        reducedDaily.setBounds(Window.WIDTH/2 + 100, 400, 200,30);
        reducedDaily.setActionCommand("reduced daily");
        add(reducedDaily);
        tickets.add(reducedDaily);


        ///////////////////////////   ACTION BUTTONS    /////////////////////////////////////

        //  BUY TICKET
        JButton buyButton = new JButton("Kup Bilet");
        buyButton.setBounds(Window.WIDTH/2 - 75, Window.HEIGHT-250, 150, 50);
        buyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String ticketType = tickets.getSelection().getActionCommand();
                System.out.println(ticketType);

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(buyButton);


        //  BACK BUTTON
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
