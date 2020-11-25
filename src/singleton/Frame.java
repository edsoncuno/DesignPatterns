package singleton;

import javax.swing.*;
import list.*;
import java.awt.event.*;

public class Frame extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel pan;
    private JTextField txtInput;
    private JButton btnAbrirSesion;
    private JButton btnCerrarSesion;
    private JLabel lblMostrarNumeroDeSesiones;
    private JTextArea txaMostrarLista;

    Object[] input;

    public Frame() {
        setSize(400, 400);
        setLocationRelativeTo(null);
        setTitle("singleton");
        initializeComponents();
    }

    private void initializeComponents() {
        pan = new JPanel();
        txtInput = new JTextField();
        btnAbrirSesion = new JButton();
        btnCerrarSesion = new JButton();
        lblMostrarNumeroDeSesiones = new JLabel();
        txaMostrarLista = new JTextArea();
        
        getContentPane().add(this.pan);
        
        pan.setLayout(null);
        pan.add(txtInput);
        pan.add(btnAbrirSesion);
        pan.add(btnCerrarSesion);
        pan.add(lblMostrarNumeroDeSesiones);
        pan.add(txaMostrarLista);
        
        txtInput.setText(null);
        txtInput.setBounds(10, 10, 150, 30);
        
        btnAbrirSesion.setText("Abrir Sesion");
        btnAbrirSesion.setBounds(10, 40, 150, 30);
        btnAbrirSesion.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                abrirSesion();
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
        
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.setBounds(160, 40, 150, 30);
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                cerrarSesion();
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
        
        lblMostrarNumeroDeSesiones.setText("Numeros De Sesiones: 0");
        lblMostrarNumeroDeSesiones.setBounds(10, 70, 210, 30);
        
        txaMostrarLista.setText(null);
        txaMostrarLista.setBounds(10, 100, 150, 120);
    }

    private void abrirSesion() {
        mostrar(Singleton.getSingleton().abrirSesion(txtInput.getText()));
    }

    private void cerrarSesion() {
        mostrar(Singleton.getSingleton().cerrarSesion(txtInput.getText()));
    }

    private void mostrar(CircularLinkedList x) {
        lblMostrarNumeroDeSesiones.setText("Numeros de Sesiones: " + x.size());
        mostrarCircularLinkedListEnUnTextArea(txaMostrarLista, x);
    }

    private void mostrarCircularLinkedListEnUnTextArea(JTextArea x, CircularLinkedList y) {
        x.setText(null);
        if (y.isEmpty()) {
            return;
        } else {
            for (int index = 0; index < y.size(); index++) {
                txaMostrarLista.append(y.get(index).toString());
                txaMostrarLista.append("\n");
            }
        }
    }

}