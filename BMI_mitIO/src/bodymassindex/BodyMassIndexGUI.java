package bodymassindex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BodyMassIndexGUI {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			createAndShowGUI();
		});
	}

	private static void createAndShowGUI() {

		JFrame frame = new JFrame("BMI Rechner");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);

		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridBagLayout());

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);
		gbc.anchor = GridBagConstraints.WEST;

		JLabel heightLabel = new JLabel("Größe (m):");
		JTextField heightField = new JTextField(10);
		gbc.gridx = 0;
		gbc.gridy = 0;
		mainPanel.add(heightLabel, gbc);
		gbc.gridx = 1;
		mainPanel.add(heightField, gbc);

		JLabel weightLabel = new JLabel("Gewicht (kg):");
		JTextField weightField = new JTextField(10);
		gbc.gridx = 0;
		gbc.gridy = 1;
		mainPanel.add(weightLabel, gbc);
		gbc.gridx = 1;
		mainPanel.add(weightField, gbc);

		JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JButton calculateButton = new JButton("Berechnen");
		JLabel resultLabel = new JLabel("BMI:");
		JTextField resultField = new JTextField(10);
		resultField.setEditable(false);
		buttonPanel.add(calculateButton);
		buttonPanel.add(resultLabel);
		buttonPanel.add(resultField);

		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		mainPanel.add(buttonPanel, gbc);

		calculateButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {

					double height = Double.parseDouble(heightField.getText());
					double weight = Double.parseDouble(weightField.getText());

					double bmi = calculateBMI(height, weight);
					resultField.setText(String.format("%.2f", bmi));
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(frame, "Bitte geben Sie gültige Zahlen ein.",
							"Fehler bei der Eingabe", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		frame.getContentPane().add(mainPanel, BorderLayout.CENTER);

		frame.setLocationRelativeTo(null);

		frame.setVisible(true);
	}

	private static double calculateBMI(double height, double weight) {
		return weight / (height * height);
	}
}
