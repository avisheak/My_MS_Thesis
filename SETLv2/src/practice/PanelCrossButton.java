package practice;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

import net.miginfocom.swing.MigLayout;

public class PanelCrossButton extends JPanel implements ListCellRenderer<Object> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblSelectedFunction;

	/**
	 * Create the panel.
	 */
	public PanelCrossButton() {
		setBackground(Color.WHITE);
		setLayout(new MigLayout("", "[grow][]", "[]"));
		
		lblSelectedFunction = new JLabel("Selected Function");
		lblSelectedFunction.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(lblSelectedFunction, "cell 0 0");
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(lblSelectedFunction.getText());
			}
		});
		btnX.setForeground(Color.RED);
		btnX.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(btnX, "cell 1 0");

	}

	@Override
	public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
			boolean cellHasFocus) {
		// TODO Auto-generated method stub
		lblSelectedFunction.setText(value.toString());
		return this;
	}

}
