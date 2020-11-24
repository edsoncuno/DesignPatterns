package decorator;

import javax.swing.*;
import java.awt.event.*;

public class Frame extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel pan;
    private JLabel lblComponent;
    private JRadioButton jrbComponentA;
    private JRadioButton jrbComponentB;
    private ButtonGroup btg;
    private JLabel lblDecorator;
    private JCheckBox cbxDecoratorA;
    private JCheckBox cbxDecoratorB;
    private JLabel lblShow;
    private JButton btnClear;

    private Component component;

    public Frame() {
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Decorator");
        initializeComponents();
        initialize();
    }

    private void initializeComponents() {
        pan = new JPanel();
        lblComponent = new JLabel();
        jrbComponentA = new JRadioButton();
        jrbComponentB = new JRadioButton();
        btg = new ButtonGroup();
        lblDecorator = new JLabel();
        cbxDecoratorA = new JCheckBox();
        cbxDecoratorB = new JCheckBox();
        lblShow = new JLabel();
        btnClear = new JButton();

        getContentPane().add(pan);
        
        pan.setLayout(null);
        pan.add(lblComponent);
        pan.add(jrbComponentA);
        pan.add(jrbComponentB);
        pan.add(lblDecorator);
        pan.add(cbxDecoratorA);
        pan.add(cbxDecoratorB);
        pan.add(lblShow);
        pan.add(btnClear);
        
        lblComponent.setText("Component:");
        lblComponent.setBounds(30, 30, 120, 30);
        
        jrbComponentA.setText("A");
        jrbComponentA.setBounds(30, 60, 120, 30);
        jrbComponentA.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                component = new ComponentA();
                lblShow.setText("" + component.operation());
            }
        });
        
        jrbComponentB.setText("B");
        jrbComponentB.setBounds(30, 90, 120, 30);
        jrbComponentB.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                component = new ComponentB();
                lblShow.setText("" + component.operation());
            }
        });
        
        btg.add(jrbComponentA);
        btg.add(jrbComponentB);
        
        lblDecorator.setText("Add:");
        lblDecorator.setBounds(30, 120, 120, 30);
        
        cbxDecoratorA.setText("A");
        cbxDecoratorA.setBounds(30, 150, 120, 30);
        cbxDecoratorA.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                if (cbxDecoratorA.isSelected()) {
                    component = new DecoratorA(component);
                    lblShow.setText("" + component.operation());
                }
            }
        });
        
        cbxDecoratorB.setText("B");
        cbxDecoratorB.setBounds(30, 180, 120, 30);
        cbxDecoratorB.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                if (cbxDecoratorB.isSelected()) {
                    component = new DecoratorB(component);
                    lblShow.setText("" + component.operation());
                }
            }
        });
        
        lblShow.setBounds(30, 210, 120, 30);
        
        btnClear.setText("Clear");
        btnClear.setBounds(30, 240, 120, 30);
        btnClear.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                cbxDecoratorA.setSelected(false);
                cbxDecoratorB.setSelected(false);
                initialize();
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

    private void initialize() {
        jrbComponentA.setSelected(false);
        jrbComponentB.setSelected(false);
        jrbComponentA.setSelected(true);
        lblShow.setText("" + component.operation());
    }
}
