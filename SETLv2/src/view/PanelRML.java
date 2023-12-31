package view;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.CardLayout;

public class PanelRML extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final static String DB_PANEL_KEY = "DBPanel";
	/**
	 * Create the panel.
	 */
	public PanelRML() {
		setBackground(Color.WHITE);
		setLayout(new CardLayout(0, 0));
		
		PanelDatabase panel = new PanelDatabase(this);
		add(panel, DB_PANEL_KEY);
	}
}
