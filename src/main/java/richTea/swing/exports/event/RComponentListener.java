package richTea.swing.exports.event;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import richTea.runtime.execution.EventDispatcher;
import richTea.runtime.execution.ExecutionContext;

public class RComponentListener extends EventDispatcher implements ComponentListener {

	public RComponentListener(ExecutionContext context) {
		super(context);
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		dispatchEvent("componentHidden", e);
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		dispatchEvent("componentMoved", e);

	}

	@Override
	public void componentResized(ComponentEvent e) {
		dispatchEvent("componentResized", e);
	}

	@Override
	public void componentShown(ComponentEvent e) {
		dispatchEvent("componentShown", e);

	}
}