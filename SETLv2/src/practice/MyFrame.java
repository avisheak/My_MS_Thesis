package practice;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import helper.Variables;
import net.miginfocom.swing.MigLayout;

public class MyFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldCSVSource;
	private JTextField textFieldCSVPrefix;
	private JTextField textFieldCSVKeyAttribute;
	private JTextField textFieldCSVTarget;
	private JTextField textFieldXMLSource;
	private JTextField textFieldXMLTarget;
	private JTextField textFieldExcelSource;
	private JTextField textFieldExcelPrefix;
	private JTextField textFieldExcelKeyAttribute;
	private JTextField textFieldExcelTarget;
	private JTextField textFieldJsonSource;
	private JTextField textFieldJsonTarget;
	private JTextField textFieldDbName;
	private JTextField textFieldUsername;
	private JTextField textFieldPassword;
	private JTextField textFieldDirectBaseIRI;
	private JTextField textFieldTargetPathDirect;
	private JTextField textFieldDbNameRml;
	private JTextField textFieldRmlUsername;
	private JTextField textFieldRmlPassword;
	private JTextField textFieldRmlFilePath;
	private JTextField textFieldRmlTarget;
	
	private String[] strings = new String[] { Variables.CSV, Variables.XML, Variables.EXCEL, Variables.JSON, Variables.DB };
	private String[] delimiters = new String[] { Variables.COMMA, Variables.SPACE, Variables.SEMICOLON, Variables.TAB, Variables.PIPE };
	private String[] keyAttributes = new String[] { Variables.EXISTING_ATTRIBUTE, Variables.EXPRESSION, Variables.INCREMENTAL };

	private String csvSource, csvPrefix;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
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
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 571, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new MigLayout("", "[grow]", "[][grow]"));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, "cell 0 0,grow");
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, "cell 0 1,grow");
		
		
	}

	public JTextField getTextFieldCSVSource() {
		return textFieldCSVSource;
	}

	public void setTextFieldCSVSource(JTextField textFieldCSVSource) {
		this.textFieldCSVSource = textFieldCSVSource;
	}

	public JTextField getTextFieldCSVPrefix() {
		return textFieldCSVPrefix;
	}

	public void setTextFieldCSVPrefix(JTextField textFieldCSVPrefix) {
		this.textFieldCSVPrefix = textFieldCSVPrefix;
	}

	public JTextField getTextFieldCSVKeyAttribute() {
		return textFieldCSVKeyAttribute;
	}

	public void setTextFieldCSVKeyAttribute(JTextField textFieldCSVKeyAttribute) {
		this.textFieldCSVKeyAttribute = textFieldCSVKeyAttribute;
	}

	public JTextField getTextFieldCSVTarget() {
		return textFieldCSVTarget;
	}

	public void setTextFieldCSVTarget(JTextField textFieldCSVTarget) {
		this.textFieldCSVTarget = textFieldCSVTarget;
	}

	public JTextField getTextFieldXMLSource() {
		return textFieldXMLSource;
	}

	public void setTextFieldXMLSource(JTextField textFieldXMLSource) {
		this.textFieldXMLSource = textFieldXMLSource;
	}

	public JTextField getTextFieldXMLTarget() {
		return textFieldXMLTarget;
	}

	public void setTextFieldXMLTarget(JTextField textFieldXMLTarget) {
		this.textFieldXMLTarget = textFieldXMLTarget;
	}

	public JTextField getTextFieldExcelSource() {
		return textFieldExcelSource;
	}

	public void setTextFieldExcelSource(JTextField textFieldExcelSource) {
		this.textFieldExcelSource = textFieldExcelSource;
	}

	public JTextField getTextFieldExcelPrefix() {
		return textFieldExcelPrefix;
	}

	public void setTextFieldExcelPrefix(JTextField textFieldExcelPrefix) {
		this.textFieldExcelPrefix = textFieldExcelPrefix;
	}

	public JTextField getTextFieldExcelKeyAttribute() {
		return textFieldExcelKeyAttribute;
	}

	public void setTextFieldExcelKeyAttribute(JTextField textFieldExcelKeyAttribute) {
		this.textFieldExcelKeyAttribute = textFieldExcelKeyAttribute;
	}

	public JTextField getTextFieldJsonTarget() {
		return textFieldJsonTarget;
	}

	public void setTextFieldJsonTarget(JTextField textFieldJsonTarget) {
		this.textFieldJsonTarget = textFieldJsonTarget;
	}

	public JTextField getTextFieldDirectBaseIRI() {
		return textFieldDirectBaseIRI;
	}

	public void setTextFieldDirectBaseIRI(JTextField textFieldDirectBaseIRI) {
		this.textFieldDirectBaseIRI = textFieldDirectBaseIRI;
	}

	public JTextField getTextFieldUsername() {
		return textFieldUsername;
	}

	public void setTextFieldUsername(JTextField textFieldUsername) {
		this.textFieldUsername = textFieldUsername;
	}

	public JTextField getTextFieldDbName() {
		return textFieldDbName;
	}

	public void setTextFieldDbName(JTextField textFieldDbName) {
		this.textFieldDbName = textFieldDbName;
	}

	public JTextField getTextFieldJsonSource() {
		return textFieldJsonSource;
	}

	public void setTextFieldJsonSource(JTextField textFieldJsonSource) {
		this.textFieldJsonSource = textFieldJsonSource;
	}

	public JTextField getTextFieldExcelTarget() {
		return textFieldExcelTarget;
	}

	public void setTextFieldExcelTarget(JTextField textFieldExcelTarget) {
		this.textFieldExcelTarget = textFieldExcelTarget;
	}

	public JTextField getTextFieldTargetPathDirect() {
		return textFieldTargetPathDirect;
	}

	public void setTextFieldTargetPathDirect(JTextField textFieldTargetPathDirect) {
		this.textFieldTargetPathDirect = textFieldTargetPathDirect;
	}

	public JTextField getTextFieldDbNameRml() {
		return textFieldDbNameRml;
	}

	public void setTextFieldDbNameRml(JTextField textFieldDbNameRml) {
		this.textFieldDbNameRml = textFieldDbNameRml;
	}

	public JTextField getTextFieldPassword() {
		return textFieldPassword;
	}

	public void setTextFieldPassword(JTextField textFieldPassword) {
		this.textFieldPassword = textFieldPassword;
	}

	public JTextField getTextFieldRmlUsername() {
		return textFieldRmlUsername;
	}

	public void setTextFieldRmlUsername(JTextField textFieldRmlUsername) {
		this.textFieldRmlUsername = textFieldRmlUsername;
	}

	public JTextField getTextFieldRmlPassword() {
		return textFieldRmlPassword;
	}

	public void setTextFieldRmlPassword(JTextField textFieldRmlPassword) {
		this.textFieldRmlPassword = textFieldRmlPassword;
	}

	public JTextField getTextFieldRmlFilePath() {
		return textFieldRmlFilePath;
	}

	public void setTextFieldRmlFilePath(JTextField textFieldRmlFilePath) {
		this.textFieldRmlFilePath = textFieldRmlFilePath;
	}

	public JTextField getTextFieldRmlTarget() {
		return textFieldRmlTarget;
	}

	public void setTextFieldRmlTarget(JTextField textFieldRmlTarget) {
		this.textFieldRmlTarget = textFieldRmlTarget;
	}

	public String[] getStrings() {
		return strings;
	}

	public void setStrings(String[] strings) {
		this.strings = strings;
	}

	public String[] getDelimiters() {
		return delimiters;
	}

	public void setDelimiters(String[] delimiters) {
		this.delimiters = delimiters;
	}

	public String[] getKeyAttributes() {
		return keyAttributes;
	}

	public void setKeyAttributes(String[] keyAttributes) {
		this.keyAttributes = keyAttributes;
	}

	public String getCsvSource() {
		return csvSource;
	}

	public void setCsvSource(String csvSource) {
		this.csvSource = csvSource;
	}

	public String getCsvPrefix() {
		return csvPrefix;
	}

	public void setCsvPrefix(String csvPrefix) {
		this.csvPrefix = csvPrefix;
	}

}
