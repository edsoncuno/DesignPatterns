package bridge;

import javax.swing.*;
import java.awt.event.*;

public class Frame extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel pan;
    private JRadioButton jrbDDMMAA;
    private JRadioButton jrbBigEndian;
    private JRadioButton jrbMMDDAA;
    private JRadioButton jrbUnix;
    private ButtonGroup btgFormat;
    private JButton btnToday;
    private JButton btnTomorrow;
    private JButton btnYesterday;
    private JLabel lblDate;

    private Date date;

    public Frame() {
        setSize(400, 250);
        setLocationRelativeTo(null);
        setTitle("Bridge");
        initializeComponents();
    }

    private void initializeComponents() {
        pan = new JPanel();
        jrbDDMMAA = new JRadioButton();
        jrbBigEndian = new JRadioButton();
        jrbMMDDAA = new JRadioButton();
        jrbUnix = new JRadioButton();
        btgFormat = new ButtonGroup();
        btnToday = new JButton();
        btnTomorrow = new JButton();
        btnYesterday = new JButton();
        lblDate = new JLabel();

        getContentPane().add(pan);

        pan.setLayout(null);
        pan.add(jrbDDMMAA);
        pan.add(jrbBigEndian);
        pan.add(jrbMMDDAA);
        pan.add(jrbUnix);
        pan.add(btnToday);
        pan.add(btnTomorrow);
        pan.add(btnYesterday);
        pan.add(lblDate);

        jrbDDMMAA.setText("DDMMA");
        jrbDDMMAA.setBounds(10, 10, 120, 30);
        jrbDDMMAA.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                date = new DDMMAA();
            }
        });
        // jrbBigEndian
        jrbBigEndian.setText("BigEndian");
        jrbBigEndian.setBounds(10, 40, 120, 30);
        jrbBigEndian.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                date = new BigEndian();
            }
        });
        // jrbMMDDAA
        jrbMMDDAA.setText("MMDDAA");
        jrbMMDDAA.setBounds(10, 70, 120, 30);
        jrbMMDDAA.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                date = new MMDDAA();
            }
        });
        // jrbUnix
        jrbUnix.setText("Unix");
        jrbUnix.setBounds(10, 100, 120, 30);
        jrbUnix.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                date = new Unix();
            }
        });

        btgFormat.add(jrbDDMMAA);
        btgFormat.add(jrbBigEndian);
        btgFormat.add(jrbMMDDAA);
        btgFormat.add(jrbUnix);

        btnToday.setBounds(10, 130, 120, 30);
        btnToday.setText("Today");
        btnToday.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                lblDate.setText(date.today());
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

        btnTomorrow.setBounds(130, 130, 120, 30);
        btnTomorrow.setText("Tomorrow");
        btnTomorrow.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                lblDate.setText(date.tomorrow());
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

        btnYesterday.setBounds(250, 130, 120, 30);
        btnYesterday.setText("Yesterday");
        btnYesterday.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                lblDate.setText(date.yesterday());
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

        lblDate.setBounds(10, 160, 150, 30);
        lblDate.setText(null);
    }
}