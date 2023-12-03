package practice;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

public class CustomRenderer extends DefaultTreeCellRenderer {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<String> list;
	public CustomRenderer(ArrayList<String> list) {
		// TODO Auto-generated constructor stub
		this.list = list;
	}
	
	@Override
	public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf,
			int row, boolean hasFocus) {
		// TODO Auto-generated method stub
		boolean enabled = false;
		
		if (list.contains(value.toString())) {
			enabled = true;
		}

        sel = enabled;
        hasFocus = enabled;

        // Component treeCellRendererComponent = super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);
        // treeCellRendererComponent.setEnabled(enabled);

        return this;
	}
}
