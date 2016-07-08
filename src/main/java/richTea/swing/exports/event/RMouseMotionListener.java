package richTea.swing.exports.event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import richTea.runtime.execution.EventDispatcher;
import richTea.runtime.execution.ExecutionContext;

public class RMouseMotionListener extends EventDispatcher implements MouseMotionListener {

	public RMouseMotionListener(ExecutionContext context) {
		super(context);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		dispatchEvent("mouseDragged", e);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		dispatchEvent("mouseMoved", e);
	}
}