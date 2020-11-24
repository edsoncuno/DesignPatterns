import javax.swing.*;
import java.awt.event.*;
import bridge.*;

public class Frame extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel pan;
    private JButton btnBridge;

    public Frame() {
        setSize(660,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initializeComponents();
    }

    private void initializeComponents(){
        pan = new JPanel();
        btnBridge = new JButton();

        getContentPane().add(pan);

        pan.setLayout(null);
        pan.add(btnBridge);

        btnBridge.setBounds(30, 30, 300, 30);
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
    }
}
