package com.starly.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MineLight extends JFrame {
    private int click = 1;
    private final JLabel countLabel;
    private final JButton addClick;
    private final JButton removeClick;
    private final JButton clickVisible;

    public MineLight(){
        super("Счетчик кликов??");
        countLabel = new JLabel("Количество кликов: "+ click);
        addClick = new JButton("Добавить клик)))");
        removeClick = new JButton("Убрать клик(((");
        clickVisible = new JButton("Показать клики");

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(countLabel, BorderLayout.NORTH);
        buttonPanel.add(addClick, BorderLayout.SOUTH);
        buttonPanel.add(removeClick, BorderLayout.CENTER);
        buttonPanel.add(clickVisible, BorderLayout.AFTER_LAST_LINE);

        add(buttonPanel, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main (String[] args){
        MineLight app = new MineLight();
        app.setVisible(true);
        app.pack();
        app.initListener();
    }
    private void initListener(){
        addClick.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                click = click + 1;
                countLabel.setText(".......");
            }
        });
        removeClick.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (click > 0){
                    click = click - 1;
                    countLabel.setText(".......");
                }
            }
        });
        clickVisible.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                countLabel.setText("ТЫ НАЛИКАК: " + click);
            }
        });

    }
    private void updateClickCounter(){
        countLabel.setText("Клики: " + click);
    }


}