package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.border.TitledBorder;

public class PanelReproducir extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel l1;
	private JButton repro;
	private JButton detener;
	public static final String PLAY = "Reproducir";
	public static final String STOP = "Detener";

	public PanelReproducir() {

		setLayout(null); // se define el grid de 2x2
		TitledBorder border = BorderFactory.createTitledBorder("Reproducir");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		setBackground(Color.WHITE);

		inicializarComponetes();

	}

	private void inicializarComponetes() {

		l1 = new JLabel("Por favor presione el boton : ");
		l1.setBounds(15, 15, 300, 50);

		repro = new JButton();
		repro.setIcon(new ImageIcon("./imagen/play.png"));
		repro.setActionCommand(PLAY);
		repro.setBounds(30, 60, 110, 110);

		detener = new JButton();
		detener.setIcon(new ImageIcon("./imagen/stop.png"));
		detener.setBackground(Color.white);
		detener.setActionCommand(STOP);
		detener.setBounds(150,60 , 110, 110);

		add(l1);
		add(repro);
		add(detener);

	}

	public JLabel getL1() {
		return l1;
	}

	public void setL1(JLabel l1) {
		this.l1 = l1;
	}

	public JButton getRepro() {
		return repro;
	}

	public void setRepro(JButton repro) {
		this.repro = repro;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static String getPlay() {
		return PLAY;
	}

	public JButton getDetener() {
		return detener;
	}

	public void setDetener(JButton detener) {
		this.detener = detener;
	}

	public static String getStop() {
		return STOP;
	}

}
