package richTea.swing.exports;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.ItemSelectable;
import java.awt.Rectangle;

import richTea.runtime.functions.CreateBean;
import richTea.runtime.node.Branch;
import richTea.runtime.node.TreeNode;
import richTea.swing.exports.event.RComponentListener;
import richTea.swing.exports.event.RContainerListener;
import richTea.swing.exports.event.RFocusListener;
import richTea.swing.exports.event.RItemListener;
import richTea.swing.exports.event.RKeyListener;
import richTea.swing.exports.event.RMouseListener;
import richTea.swing.exports.event.RMouseMotionListener;
import richTea.swing.exports.event.RMouseWheelListener;
import richTea.swing.exports.event.RPropertyChangeListener;

public class CreateAWTComponent extends CreateBean {
	
	@Override
	protected Container createBean() throws ClassNotFoundException, InstantiationException, IllegalAccessException {		
		Container container = (Container) super.createBean();
		
		addContent(container, "content");
		
		Rectangle bounds = getBounds(container);
		
		container.setBounds(bounds);
		//container.setPreferredSize(new Dimension(bounds.width, bounds.height));
		
		container.addComponentListener(new RComponentListener(context));
		container.addContainerListener(new RContainerListener(context));
		container.addFocusListener(new RFocusListener(context));
		container.addKeyListener(new RKeyListener(context));
		container.addMouseListener(new RMouseListener(context));
		container.addMouseMotionListener(new RMouseMotionListener(context));
		container.addMouseWheelListener(new RMouseWheelListener(context));
		container.addPropertyChangeListener(new RPropertyChangeListener(context));
		
		// Listener support for a number of swing components
		if(container instanceof ItemSelectable) {
			((ItemSelectable) container).addItemListener(new RItemListener(context));
		}
		
		return container;
	}
	
	protected Rectangle getBounds(Component component) {
		Dimension preferredSize = component.getPreferredSize();
		
		int x = (int) context.getNumberOrDefault("x", 0);
		int y = (int) context.getNumberOrDefault("y", 0);
		int width = (int) context.getNumberOrDefault("width", preferredSize.getWidth());
		int height = (int) context.getNumberOrDefault("height", preferredSize.getHeight());
		
		return new Rectangle(x, y, width, height);
	}
	
	protected void addContent(Container root, String contentBranchName) {
		Branch contentBranch = context.getCurrentNode().getBranch(contentBranchName);
		
		if(contentBranch != null) {
			addContent(root, contentBranch.getChildren());
		}
	}
	
	protected void addContent(Container root, TreeNode[] children) {
		for(TreeNode contentNode : children) {
			Container content = (Container) context.execute(contentNode);
			
			addContent(root, content);
		}
	}
	
	protected void addContent(Container root, Component child) {
		root.add(child);
	}
}