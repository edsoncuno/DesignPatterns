package chainOfResponsability;

import javax.swing.*;
import java.awt.event.*;

public class Frame extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel pan;
    private JTextField txtInput;
    private JButton btnCalculate;
    private JLabel lblOutput;

    public Frame() {
        setSize(360, 180);
        setTitle("Chain of Responsability");
        initializeComponents();
    }

    private void initializeComponents() {
        pan = new JPanel();
        txtInput = new JTextField();
        btnCalculate = new JButton();
        lblOutput = new JLabel();

        getContentPane().add(pan);

        pan.setLayout(null);
        pan.add(txtInput);
        pan.add(btnCalculate);
        pan.add(lblOutput);

        txtInput.setText(null);
        txtInput.setBounds(30, 30, 300, 30);

        btnCalculate.setText("Calculate");
        btnCalculate.setBounds(30, 60, 300, 30);
        btnCalculate.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                calculate();
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

        lblOutput.setText(null);
        lblOutput.setBounds(30, 90, 300, 30);
    }

    private void calculate() {
        Handler objHandler3 = new Handler1000000(null);
        Handler objHandler2 = new Handler100000(objHandler3);
        Handler objHandler1 = new Handler10000(objHandler2);
        Handler objHandler = new Handler1000(objHandler1);
        double input = Double.parseDouble(txtInput.getText());
        lblOutput.setText(String.valueOf(objHandler.handlerRequest(input)));
    }

}
