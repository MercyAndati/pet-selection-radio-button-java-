import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;

class Pet extends JFrame implements ActionListener {
    JRadioButton BirdButton, CatButton, DogButton, RabbitButton, PigButton;
    ImageIcon BirdIcon, CatIcon, DogIcon, RabbitIcon, PigIcon;
    JLabel messageLabel;

    public Pet() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(10,10));
        this.setTitle("Pet Selector");
        this.setSize(400, 300);

        BirdIcon = new ImageIcon("bird.jpeg");
        CatIcon = new ImageIcon("cat.jpeg");
        DogIcon = new ImageIcon("dog.jpeg");
        RabbitIcon = new ImageIcon("rabbit.jpeg");
        PigIcon = new ImageIcon("pig.jpeg");

        BirdButton = new JRadioButton("Bird");
        CatButton = new JRadioButton("Cat");
        DogButton = new JRadioButton("Dog");
        RabbitButton = new JRadioButton("Rabbit");
        PigButton = new JRadioButton("Pig");

        ButtonGroup group = new ButtonGroup();
        group.add(BirdButton);
        group.add(CatButton);
        group.add(DogButton);
        group.add(RabbitButton);
        group.add(PigButton);

        BirdButton.addActionListener(this);
        CatButton.addActionListener(this);
        DogButton.addActionListener(this);
        RabbitButton.addActionListener(this);
        PigButton.addActionListener(this);

        messageLabel = new JLabel();
        messageLabel.setHorizontalAlignment(JLabel.CENTER);
        messageLabel.setVerticalAlignment(JLabel.CENTER);

        JPanel radioButtonPanel = new JPanel();
        radioButtonPanel.setLayout(new GridLayout(5, 1, 10, 10));
        radioButtonPanel.add(BirdButton);
        radioButtonPanel.add(CatButton);
        radioButtonPanel.add(DogButton);
        radioButtonPanel.add(RabbitButton);
        radioButtonPanel.add(PigButton);

        this.add(radioButtonPanel, BorderLayout.WEST);
        this.add(messageLabel, BorderLayout.CENTER);
        this.pack();
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == BirdButton) {
            JOptionPane.showMessageDialog(this, new JLabel(BirdIcon), "You selected a Bird!", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == CatButton) {
            JOptionPane.showMessageDialog(this, new JLabel(CatIcon), "You selected a Cat!", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == DogButton) {
            JOptionPane.showMessageDialog(this, new JLabel(DogIcon), "You selected a Dog!", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == RabbitButton) {
            JOptionPane.showMessageDialog(this, new JLabel(RabbitIcon), "You selected a Rabbit!", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == PigButton) {
            JOptionPane.showMessageDialog(this, new JLabel(PigIcon), "You selected a Pig!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public static void main(String[] args) {
        new Pet();
    }
}