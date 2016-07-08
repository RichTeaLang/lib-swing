package richTea.swing.exports.event;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import richTea.runtime.execution.EventDispatcher;
import richTea.runtime.execution.ExecutionContext;

public class RMouseWheelListener extends EventDispatcher implements MouseWheelListener {

	public RMouseWheelListener(ExecutionContext context) {
		super(context);
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		dispatchEvent("mouseWheelMoved", e);
	}
}