/**
 * 
 */
package practice;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartPanel;

import view.PanelOlap2;

public class TableToBarChart extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PanelOlap2 panelolap2;
    public TableToBarChart(DefaultTableModel tableModel) {
       
        ChartPanel chartPanel = new ChartPanel(panelolap2.barChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 370));

        add(chartPanel);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
  }
