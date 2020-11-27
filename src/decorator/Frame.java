package decorator;

import javax.swing.*;
import java.awt.event.*;

public class Frame extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel pan;
    private JLabel lblComponent;
    private JRadioButton jrbComponentPizzaBaseHam;
    private JRadioButton jrbComponentPizzaBaseVegeterian;
    private ButtonGroup btg;
    private JLabel lblDecorator;
    private JCheckBox cbxDecoratorAnchovy;
    private JCheckBox cbxDecoratorCheese;
    private JCheckBox cbxDecoratorChorizo;
    private JCheckBox cbxDecoratorJalapeno;
    private JCheckBox cbxDecoratorPineapple;
    private JLabel lblShow;
    private JButton btnClear;

    private Component component;

    public Frame() {
        setSize(360, 420);
        setLocationRelativeTo(null);
        setTitle("Decorator");
        initializeComponents();
        initialize();
    }

    private void initializeComponents() {
        pan = new JPanel();
        lblComponent = new JLabel();
        jrbComponentPizzaBaseHam = new JRadioButton();
        jrbComponentPizzaBaseVegeterian = new JRadioButton();
        btg = new ButtonGroup();
        lblDecorator = new JLabel();
        cbxDecoratorAnchovy = new JCheckBox();
        cbxDecoratorCheese = new JCheckBox();
        cbxDecoratorChorizo = new JCheckBox();
        cbxDecoratorJalapeno = new JCheckBox();
        cbxDecoratorPineapple = new JCheckBox();
        lblShow = new JLabel();
        btnClear = new JButton();

        getContentPane().add(pan);

        pan.setLayout(null);
        pan.add(lblComponent);
        pan.add(jrbComponentPizzaBaseHam);
        pan.add(jrbComponentPizzaBaseVegeterian);
        pan.add(lblDecorator);
        pan.add(cbxDecoratorAnchovy);
        pan.add(cbxDecoratorCheese);
        pan.add(cbxDecoratorChorizo);
        pan.add(cbxDecoratorJalapeno);
        pan.add(cbxDecoratorPineapple);
        pan.add(lblShow);
        pan.add(btnClear);

        lblComponent.setText("Pizza Base:");
        lblComponent.setBounds(30, 30, 300, 30);

        jrbComponentPizzaBaseHam.setText("Ham");
        jrbComponentPizzaBaseHam.setBounds(30, 60, 300, 30);
        jrbComponentPizzaBaseHam.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                pizzaHam();
            }
        });

        jrbComponentPizzaBaseVegeterian.setText("Vegeterian");
        jrbComponentPizzaBaseVegeterian.setBounds(30, 90, 300, 30);
        jrbComponentPizzaBaseVegeterian.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                pizzaVegeterian();
            }
        });

        btg.add(jrbComponentPizzaBaseHam);
        btg.add(jrbComponentPizzaBaseVegeterian);

        lblDecorator.setText("Add:");
        lblDecorator.setBounds(30, 120, 300, 30);

        cbxDecoratorAnchovy.setText("Anchovy");
        cbxDecoratorAnchovy.setBounds(30, 150, 300, 30);
        cbxDecoratorAnchovy.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                addAnchovy();
            }
        });

        cbxDecoratorCheese.setText("Cheese");
        cbxDecoratorCheese.setBounds(30, 180, 300, 30);
        cbxDecoratorCheese.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                addCheese();
            }
        });

        cbxDecoratorChorizo.setText("Chorizo");
        cbxDecoratorChorizo.setBounds(30, 210, 300, 30);
        cbxDecoratorChorizo.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                addChorizo();
            }
        });

        cbxDecoratorJalapeno.setText("Jalapeno");
        cbxDecoratorJalapeno.setBounds(30, 240, 300, 30);
        cbxDecoratorJalapeno.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                addJalapeno();
            }
        });

        cbxDecoratorPineapple.setText("Pineapple");
        cbxDecoratorPineapple.setBounds(30, 270, 300, 30);
        cbxDecoratorPineapple.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                addPineapple();
            }
        });

        lblShow.setBounds(30, 300, 300, 30);

        btnClear.setText("Clear");
        btnClear.setBounds(30, 330, 300, 30);
        btnClear.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
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
        cbxDecoratorAnchovy.setSelected(false);
        cbxDecoratorCheese.setSelected(false);
        cbxDecoratorChorizo.setSelected(false);
        cbxDecoratorJalapeno.setSelected(false);
        cbxDecoratorPineapple.setSelected(false);
        jrbComponentPizzaBaseHam.setSelected(true);
        showPrice();
    }

    private void pizzaHam() {
        component = new ComponentPizzaBaseHam();
        showPrice();
    }

    private void pizzaVegeterian() {
        component = new ComponentPizzaBaseVegeterian();
        showPrice();
    }

    private void addAnchovy() {
        if (cbxDecoratorAnchovy.isSelected()) {
            component = new DecoratorAnchovy(component);
            showPrice();
        }
    }

    private void addCheese() {
        if (cbxDecoratorCheese.isSelected()) {
            component = new DecoratorCheese(component);
            showPrice();
        }
    }

    private void addChorizo() {
        if (cbxDecoratorChorizo.isSelected()) {
            component = new DecoratorChorizo(component);
            showPrice();
        }
    }

    private void addJalapeno() {
        if (cbxDecoratorJalapeno.isSelected()) {
            component = new DecoratorJalapeno(component);
            showPrice();
        }
    }

    private void addPineapple() {
        if (cbxDecoratorPineapple.isSelected()) {
            component = new DecoratorPineapple(component);
            showPrice();
        }
    }

    private void showPrice() {
        lblShow.setText(String.valueOf(component.price()));
    }

}
