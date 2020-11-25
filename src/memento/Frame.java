package memento;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class Frame extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel pan;
    private JRadioButton[] jrb;
    private ButtonGroup btg;
    private JLabel lblShow;
    private JButton btnUndo;

    private Caretaker caretaker;

    public Frame() {
        setSize(400, 400);
        setLocationRelativeTo(null);
        setTitle("Memento");
        caretaker = new Caretaker();
        initializeComponents();
    }

    private void initializeComponents() {
        pan = new JPanel();
        jrb = new JRadioButton[4];
        jrb[0] = new JRadioButton();
        jrb[1] = new JRadioButton();
        jrb[2] = new JRadioButton();
        jrb[3] = new JRadioButton();
        btg = new ButtonGroup();
        lblShow = new JLabel();
        btnUndo = new JButton();

        // memento
        getContentPane().add(pan);
        // panMain
        pan.setLayout(null);
        pan.add(jrb[0]);
        pan.add(jrb[1]);
        pan.add(jrb[2]);
        pan.add(jrb[3]);
        pan.add(lblShow);
        pan.add(btnUndo);
        // jrb[0]
        jrb[0].setText("Blue");
        jrb[0].setBounds(30, 30, 120, 30);
        jrb[0].addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                if (jrb[0].isSelected()) {
                    caretaker.push(new Memento(lblShow.getBackground(), lblShow.getText()));
                    lblShow.setText("Blue");
                    lblShow.setBackground(Color.BLUE);
                }
            }
        });
        // jrb[1]
        jrb[1].setText("Pink");
        jrb[1].setBounds(30, 60, 120, 30);
        jrb[1].addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                if (jrb[1].isSelected()) {
                    caretaker.push(new Memento(lblShow.getBackground(), lblShow.getText()));
                    lblShow.setText("Pink");
                    lblShow.setBackground(Color.PINK);
                }
            }
        });
        // jrb[2]
        jrb[2].setText("Green");
        jrb[2].setBounds(30, 90, 120, 30);
        jrb[2].addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                if (jrb[2].isSelected()) {
                    caretaker.push(new Memento(lblShow.getBackground(), lblShow.getText()));
                    lblShow.setText("Green");
                    lblShow.setBackground(Color.GREEN);
                }
            }
        });
        // jrb[3]
        jrb[3].setText("Red");
        jrb[3].setBounds(30, 120, 120, 30);
        jrb[3].addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                if (jrb[3].isSelected()) {
                    caretaker.push(new Memento(lblShow.getBackground(), lblShow.getText()));
                    lblShow.setText("Red");
                    lblShow.setBackground(Color.RED);
                }
            }
        });
        // btg
        btg.add(jrb[0]);
        btg.add(jrb[1]);
        btg.add(jrb[2]);
        btg.add(jrb[3]);
        // lblShow
        lblShow.setText(null);
        lblShow.setBounds(30, 150, 120, 30);
        lblShow.setOpaque(true);
        // btnUndo
        btnUndo.setText("Undo");
        btnUndo.setBounds(30, 180, 120, 30);
        btnUndo.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                Memento memento = caretaker.pop();
                if (memento == null) {
                    lblShow.setText("null");
                    lblShow.setBackground(Color.WHITE);
                } else {
                    lblShow.setText(memento.getText());
                    lblShow.setBackground(memento.getColor());
                }
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
            }

            @Override
            public void mouseExited(MouseEvent arg0) {
            }

            @Override
            public void mousePressed(MouseEvent arg0) {
            }

            @Override
            public void mouseReleased(MouseEvent arg0) {
            }
        });
    }

}
