package richTea.swing.exports.event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import richTea.runtime.execution.EventDispatcher;
import richTea.runtime.execution.ExecutionContext;

public class RMouseListener extends EventDispatcher implements MouseListener {

	public RMouseListener(ExecutionContext context) {
		super(context);
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		dispatchEvent("mouseReleased", e);
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		dispatchEvent("mousePressed", e);
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		dispatchEvent("mouseExited", e);
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		dispatchEvent("mouseEntered", e);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		dispatchEvent("mouseClicked", e);
	}
}