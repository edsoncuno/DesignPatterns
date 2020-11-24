package state;

import javax.swing.*;
import java.awt.event.*;

public class Frame extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel pan;
    private JLabel lbl;
    private JButton btnConcreteStateA;
    private JButton btnConcreteStateB;

    private Context context;

    public Frame() {
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("State");
        initializeComponents();
        initialize();
    }

    private void initializeComponents() {
        pan = new JPanel();
        lbl = new JLabel();
        btnConcreteStateA = new JButton();
        btnConcreteStateB = new JButton();
        
        getContentPane().add(pan);
        
        pan.setLayout(null);
        pan.add(lbl);
        pan.add(btnConcreteStateA);
        pan.add(btnConcreteStateB);
        
        lbl.setText(null);
        lbl.setBounds(30, 30, 300, 30);
        
        btnConcreteStateA.setText("ConcreteStateA");
        btnConcreteStateA.setBounds(30, 60, 300, 30);
        btnConcreteStateA.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                setStateA();
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
        
        btnConcreteStateB.setText("ConcreteStateB");
        btnConcreteStateB.setBounds(30, 90, 300, 30);
        btnConcreteStateB.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                setStateB();
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
        context = new Context();
    }

    private void setStateA() {
        context.setState(new ConcreteStateA(context));
        lbl.setText(context.getState().toString());
    }

    private void setStateB() {
        context.setState(new ConcreteStateB(context));
        lbl.setText(context.getState().toString());
    }

}
