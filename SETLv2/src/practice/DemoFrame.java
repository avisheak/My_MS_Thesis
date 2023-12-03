package practice;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTree;

public class DemoFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTree tree;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoFrame frame = new DemoFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DemoFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[grow]"));
		
//		PanelOnDemandETL panel = new PanelOnDemandETL();
//		contentPane.add(panel, "cell 0 0,grow");
		
//		AutoETLPanel autoETLPanel = new AutoETLPanel();
		
		PanelHead panelHead = new PanelHead();
		contentPane.add(panelHead, "cell 0 0,grow");
	}

	public JTree getTree() {
		return tree;
	}

	public void setTree(JTree tree) {
		this.tree = tree;
	}
}
