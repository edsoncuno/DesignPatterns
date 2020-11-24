package iterator;

import list.*;
import javax.swing.*;
import java.awt.event.*;

public class Frame extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel pan;
    private JTextArea txaDiasDeLaSemana;
    private JLabel lblDia;
    private JCheckBox cbxDiasLaborales;
    private JButton btnPrimero;
    private JButton btnUltimo;
    private JButton btnCentral;
    private JButton btnSiguiente;
    private JButton btnAnterior;

    private CircularLinkedList listDiasDeLaSemana;
    private Iterator iterator;

    public Frame() {
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("iterator");
        initializeList();
        initializeIterator();
        initializeComponents();
        mostrarCircularLinkedListEnUnTextArea();
    }

    private void initializeComponents() {
        pan = new JPanel();
        txaDiasDeLaSemana = new JTextArea();
        lblDia = new JLabel();
        cbxDiasLaborales = new JCheckBox();
        btnPrimero = new JButton();
        btnUltimo = new JButton();
        btnCentral = new JButton();
        btnSiguiente = new JButton();
        btnAnterior = new JButton();
        
        getContentPane().add(this.pan);
        
        pan.setLayout(null);
        pan.add(txaDiasDeLaSemana);
        pan.add(lblDia);
        pan.add(cbxDiasLaborales);
        pan.add(btnPrimero);
        pan.add(btnUltimo);
        pan.add(btnCentral);
        pan.add(btnSiguiente);
        pan.add(btnAnterior);
        
        txaDiasDeLaSemana.setText(null);
        txaDiasDeLaSemana.setBounds(30, 30, 150, 150);
        
        lblDia.setText("Dia Seleccionado: ");
        lblDia.setBounds(30, 180, 300, 30);
        
        cbxDiasLaborales.setText("Solo dias laborales");
        cbxDiasLaborales.setSelected(false);
        cbxDiasLaborales.setBounds(30, 210, 300, 30);
        cbxDiasLaborales.addItemListener(new java.awt.event.ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                iterator.sw();
            }
        });
        
        btnPrimero.setText("Primero");
        btnPrimero.setBounds(30, 240, 150, 30);
        btnPrimero.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                seleccionarElPrimerDia();
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
        
        btnUltimo.setText("Ultimo");
        btnUltimo.setBounds(30, 270, 150, 30);
        btnUltimo.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                seleccionarElUltimoDia();
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
        
        btnCentral.setText("Central");
        btnCentral.setBounds(30, 300, 150, 30);
        btnCentral.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                seleccionarElDiaCentral();
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
        
        btnSiguiente.setText("Siguiente");
        btnSiguiente.setBounds(30, 330, 150, 30);
        btnSiguiente.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                seleccionarElSiguienteDia();
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
    
        btnAnterior.setText("Anterior");
        btnAnterior.setBounds(30, 360, 150, 30);
        btnAnterior.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                seleccionarElDiaAnterior();
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

    private void seleccionarElPrimerDia() {
        lblDia.setText("Dia Seleccionado: " + iterator.first().toString());
    }

    private void seleccionarElUltimoDia() {
        lblDia.setText("Dia Seleccionado: " + iterator.last().toString());
    }

    private void seleccionarElDiaCentral() {
        lblDia.setText("Dia Seleccionado: " + iterator.center().toString());
    }

    private void seleccionarElSiguienteDia() {
        lblDia.setText("Dia Seleccionado: " + iterator.next().toString());
    }

    private void seleccionarElDiaAnterior() {
        lblDia.setText("Dia Seleccionado: " + iterator.back().toString());
    }

    private void initializeList() {
        listDiasDeLaSemana = new CircularLinkedList();
        listDiasDeLaSemana.add(0, "Lunes");
        listDiasDeLaSemana.add(1, "Martes");
        listDiasDeLaSemana.add(2, "Miercoles");
        listDiasDeLaSemana.add(3, "Jueves");
        listDiasDeLaSemana.add(4, "Viernes");
        listDiasDeLaSemana.add(5, "Sabado");
        listDiasDeLaSemana.add(6, "Domingo");
    }

    private void initializeIterator() {
        iterator = new Iterator(listDiasDeLaSemana);
    }

    private void mostrarCircularLinkedListEnUnTextArea() {
        txaDiasDeLaSemana.setText(null);
        for (int index = 0; index < listDiasDeLaSemana.size(); index++) {
            txaDiasDeLaSemana.append(listDiasDeLaSemana.get(index).toString());
            txaDiasDeLaSemana.append("\n");
        }
    }

}
