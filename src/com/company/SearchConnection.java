package com.company;

import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchConnection extends JPanel{

    private Image background;

    public SearchConnection(){
        Main.newWindow.setVisible(true);
        setPreferredSize(new Dimension(Window.WIDTH, Window.HEIGHT));
        setFocusable(true);
        setLayout(null);
        loadBackground();



        ///////////////////////////   TITLE    /////////////////////////////////////

        JLabel title = new JLabel("Szukaj połączenia");
        title.setFont(new Font("Arial", Font.BOLD, 40));
        title.setBounds(Window.WIDTH/2-220, 30 , 440, 100);
        title.setForeground(Color.white);
        add(title);



        ///////////////////////////   INPUT FIELDS    /////////////////////////////////////

        //  FROM
        JTextField beginField = new JTextField("Przystanek początkowy", 30);
        beginField.setBounds(100, 150, 400, 50);
        add(beginField);

        //  TO
        JTextField endField = new JTextField("Przystanek końcowy", 30);
        endField.setBounds(100, 210, 400, 50);
        add(endField);

        //  AUTOBUS
        JCheckBox busCheckbox = new JCheckBox("Autobusy");
        busCheckbox.setBounds(100, 270, 100, 20);
        add(busCheckbox);

        // TRAM
        JCheckBox tramCheckbox = new JCheckBox("Tramwaje");
        tramCheckbox.setBounds(210, 270, 100, 20);
        add(tramCheckbox);

        // SEARCH BUTTON
        JButton searchButton = new JButton("Szukaj");
        searchButton.setBounds(250, 320, 100, 40);
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String start = beginField.getText();
                String end = endField.getText();

                if(busCheckbox.isSelected()){
                    boolean busCheck = true;
                }else {
                    boolean busCheck = false;
                }

                if(tramCheckbox.isSelected()){
                    boolean tramCheck = true;
                }else{
                    boolean tramCheck = false;
                }

                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(searchButton);



        //  SEARCH RESULT FIELD
        JPanel searchResultPanel = new JPanel();
        searchResultPanel.setSize(750,500);
        searchResultPanel.setLocation(Window.WIDTH-800, 150);
        searchResultPanel.setLayout(null);
        searchResultPanel.setBackground(new Color(0,0,0,30));
        searchResultPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));;
        add(searchResultPanel);

        //  CONTENT
        JLabel searchResultPanelContent = new JLabel();
        searchResultPanelContent.setText("<html>aaa</html>");
        searchResultPanelContent.setFont(new Font("Arial", Font.BOLD, 22));
        searchResultPanelContent.setBounds(50, 50 , 700, 450);
        searchResultPanelContent.setForeground(Color.white);
        searchResultPanel.add(searchResultPanelContent);



        ///////////////////////////   INPUT FIELDS    /////////////////////////////////////

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
