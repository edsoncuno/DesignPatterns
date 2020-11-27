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
        setSize(360, 330);
        setLocationRelativeTo(null);
        setTitle("Bridge");
        initializeComponents();
        initialize();
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
        jrbDDMMAA.setBounds(30, 30, 300, 30);
        jrbDDMMAA.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                formatDDMMAA();
            }
        });

        jrbBigEndian.setText("BigEndian");
        jrbBigEndian.setBounds(30, 60, 300, 30);
        jrbBigEndian.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                formatBigEndian();
            }
        });

        jrbMMDDAA.setText("MMDDAA");
        jrbMMDDAA.setBounds(30, 90, 300, 30);
        jrbMMDDAA.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                formatMMDDAA();
            }
        });

        jrbUnix.setText("Unix");
        jrbUnix.setBounds(30, 120, 300, 30);
        jrbUnix.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                formatUnix();
            }
        });

        btgFormat.add(jrbDDMMAA);
        btgFormat.add(jrbBigEndian);
        btgFormat.add(jrbMMDDAA);
        btgFormat.add(jrbUnix);

        btnYesterday.setBounds(30, 150, 300, 30);
        btnYesterday.setText("Yesterday");
        btnYesterday.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                showYesterday();
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

        btnToday.setBounds(30, 180, 300, 30);
        btnToday.setText("Today");
        btnToday.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                showToday();
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

        btnTomorrow.setBounds(30, 210, 300, 30);
        btnTomorrow.setText("Tomorrow");
        btnTomorrow.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                showTomorrow();
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

        lblDate.setBounds(30, 240, 300, 30);
    }

    private void formatDDMMAA() {
        if (jrbDDMMAA.isSelected()) {
            date = new DDMMAA();
        }
    }

    private void formatBigEndian() {
        if (jrbBigEndian.isSelected()) {
            date = new BigEndian();
        }
    }

    private void formatMMDDAA() {
        if (jrbMMDDAA.isSelected()) {
            date = new MMDDAA();
        }
    }

    private void formatUnix() {
        if (jrbUnix.isSelected()) {
            date = new Unix();
        }
    }

    private void showYesterday() {
        lblDate.setText(date.yesterday());
    }

    private void showToday() {
        lblDate.setText(date.today());
    }

    private void showTomorrow() {
        lblDate.setText(date.tomorrow());
    }

    private void initialize() {
        jrbDDMMAA.setSelected(true);
        showToday();
    }
}