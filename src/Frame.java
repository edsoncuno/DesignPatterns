import javax.swing.*;
import java.awt.event.*;

public class Frame extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel pan;
    private JButton btnAdapter;
    private JButton btnBridge;
    private JButton btnChainOfResponsability;
    private JButton btnDecorator;
    private JButton btnIterator;
    private JButton btnMemento;
    private JButton btnSingleton;
    private JButton btnState;

    public Frame() {
        setSize(360, 330);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initializeComponents();
    }

    private void initializeComponents() {
        pan = new JPanel();
        btnAdapter = new JButton();
        btnBridge = new JButton();
        btnChainOfResponsability = new JButton();
        btnDecorator = new JButton();
        btnIterator = new JButton();
        btnMemento = new JButton();
        btnSingleton = new JButton();
        btnState = new JButton();

        getContentPane().add(pan);

        pan.setLayout(null);
        pan.add(btnAdapter);
        pan.add(btnBridge);
        pan.add(btnChainOfResponsability);
        pan.add(btnDecorator);
        pan.add(btnIterator);
        pan.add(btnMemento);
        pan.add(btnSingleton);
        pan.add(btnState);

        btnAdapter.setBounds(30, 30, 300, 30);
        btnAdapter.setText("Adapter");
        btnAdapter.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                adapter.Frame frmAdapter = new adapter.Frame();
                frmAdapter.setVisible(true);
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

        btnBridge.setBounds(30, 60, 300, 30);
        btnBridge.setText("Bridge");
        btnBridge.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                bridge.Frame frmBridge = new bridge.Frame();
                frmBridge.setVisible(true);
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

        btnChainOfResponsability.setBounds(30, 90, 300, 30);
        btnChainOfResponsability.setText("Chain of Responsability");
        btnChainOfResponsability.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                chainOfResponsability.Frame frmChainOfResponsability = new chainOfResponsability.Frame();
                frmChainOfResponsability.setVisible(true);
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

        btnDecorator.setBounds(30, 120, 300, 30);
        btnDecorator.setText("Decorator");
        btnDecorator.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                decorator.Frame frmDecorator = new decorator.Frame();
                frmDecorator.setVisible(true);
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

        btnIterator.setBounds(30, 150, 300, 30);
        btnIterator.setText("Iterator");
        btnIterator.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                iterator.Frame frmIterator = new iterator.Frame();
                frmIterator.setVisible(true);
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

        btnMemento.setBounds(30, 180, 300, 30);
        btnMemento.setText("Memento");
        btnMemento.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                memento.Frame frmMemento = new memento.Frame();
                frmMemento.setVisible(true);
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

        btnSingleton.setBounds(30, 210, 300, 30);
        btnSingleton.setText("Singleton");
        btnSingleton.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                singleton.Frame frmSingleton = new singleton.Frame();
                frmSingleton.setVisible(true);
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

        btnState.setBounds(30, 240, 300, 30);
        btnState.setText("State");
        btnState.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                state.Frame frmState = new state.Frame();
                frmState.setVisible(true);
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
