package thema4.schleifen;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Differentialgleichung extends JPanel {
    
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    
    private List<Double> times = new ArrayList<>();
    private List<Double> fractions = new ArrayList<>();

    public Differentialgleichung() {
       
        double t = 0;
        double dt = 1.0;
        double k = 0.1;
        double xn = 0.01;
        
        while (t <= 100) {
            times.add(t);
            fractions.add(xn);
            double dx = k * xn * (1 - xn) * dt;
            xn = xn + dx;
            t = t + dt;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // Hintergrund
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, WIDTH, HEIGHT);

        // Achsen zeichnen
        g2.setColor(Color.BLACK);
        g2.drawLine(50, 550, 750, 550); // x-Achse
        g2.drawLine(50, 550, 50, 50);   // y-Achse

        // Achsenbeschriftungen
        g2.drawString("Zeit t", 375, 580);
        g2.drawString("Anteil der kranken Bevölkerung x(t)", 10, 40);

        // Verlauf zeichnen
        g2.setColor(Color.BLUE);
        for (int i = 0; i < times.size() - 1; i++) {
            int x1 = 50 + (int) (times.get(i) * 7);
            int y1 = 550 - (int) (fractions.get(i) * 500);
            int x2 = 50 + (int) (times.get(i + 1) * 7);
            int y2 = 550 - (int) (fractions.get(i + 1) * 500);
            g2.drawLine(x1, y1, x2, y2);
            g2.fillOval(x1 - 2, y1 - 2, 4, 4);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Verlauf der Krankenzahlen über die Zeit");
        Differentialgleichung simulation = new Differentialgleichung();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.add(simulation);
        frame.setVisible(true);
    }
}
