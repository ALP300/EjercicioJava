import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio extends JFrame{
    private JButton yesButton;
    private JButton noButton;

    public Ejercicio(){
        setTitle("¿Quieres ser mi pareja?");
        setSize(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel preguntaLabel= new JLabel("¿Quieres ser mi pareja?");
        add(preguntaLabel);

        yesButton= new JButton("Sí, obvio");
        noButton= new JButton("No bro, estás wapo pero no eres mi tipo");

        yesButton.addActionListener(e ->JOptionPane.showMessageDialog(this, "Sabía que dirías que sí, ahora busca tu outfit para la cena de navidad"));
        
        noButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                int x= (int)(Math.random()*(getWidth() - noButton.getWidth()));
                int y= (int)(Math.random()*(getHeight() - noButton.getHeight()-50));
                noButton.setLocation(x,y);
            }
        });
        add(yesButton);
        add(noButton);
        setLayout(null);
        yesButton.setBounds(100,80,80,30);
        noButton.setBounds(200,80,80,30);
    }

    public static void main(String [] args){
        SwingUtilities.invokeLater(()->{
            Ejercicio app= new Ejercicio();
            app.setVisible(true);
        });
    }
}
