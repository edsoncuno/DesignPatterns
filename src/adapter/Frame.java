package adapter;

import javax.swing.*;
import java.awt.event.*;

public class Frame extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel pan;
    private JButton btnSetCelsius;
    private JTextField txtSetCelsius;
    private JButton btnConsultarCelsius;
    private JLabel lblConsultarCelsius;
    private JButton btnConsultarFahrenheit;
    private JLabel lblConsultarFahrenheit;

    private Fahrenheit fahrenheit;
    private AdaptFahrenheit termometro;

    public Frame() {
        setSize(660, 180);
        setLocationRelativeTo(null);
        setTitle("Adapter");
        initializeComponents();
        initialize();
    }

    private void initializeComponents() {
        pan = new JPanel();
        btnSetCelsius = new JButton();
        txtSetCelsius = new JTextField();
        btnConsultarCelsius = new JButton();
        lblConsultarCelsius = new JLabel();
        btnConsultarFahrenheit = new JButton();
        lblConsultarFahrenheit = new JLabel();
        getContentPane().add(pan);

        pan.setLayout(null);
        pan.add(btnSetCelsius);
        pan.add(txtSetCelsius);
        pan.add(btnConsultarCelsius);
        pan.add(lblConsultarCelsius);
        pan.add(btnConsultarFahrenheit);
        pan.add(lblConsultarFahrenheit);

        btnSetCelsius.setBounds(30, 30, 300, 30);
        btnSetCelsius.setText("Set Celsius");
        btnSetCelsius.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                setTemperatura();
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

        txtSetCelsius.setBounds(330, 30, 300, 30);

        btnConsultarCelsius.setBounds(30, 60, 300, 30);
        btnConsultarCelsius.setText("Consultar en Celsius");
        btnConsultarCelsius.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                getTemperaturaCelsius();
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

        lblConsultarCelsius.setBounds(330, 60, 300, 30);

        btnConsultarFahrenheit.setBounds(30, 90, 300, 30);
        btnConsultarFahrenheit.setText("Consultar en Fahrenheit");
        btnConsultarFahrenheit.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                getTemperaturaFahrenheit();
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

        lblConsultarFahrenheit.setBounds(330, 90, 300, 30);
    }

    private void initialize() {
        fahrenheit = new Fahrenheit();
        termometro = new AdaptFahrenheit(fahrenheit);
    }

    private void getTemperaturaCelsius() {
        lblConsultarCelsius.setText(String.valueOf(termometro.getTemperatura()));
    }

    private void getTemperaturaFahrenheit() {
        lblConsultarFahrenheit.setText(String.valueOf(fahrenheit.getTemperature()));
    }

    private void setTemperatura() {
        termometro.setTemperatura(Double.parseDouble(txtSetCelsius.getText()));
    }

}
