package richTea.swing.exports.event;

import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;

import richTea.runtime.execution.EventDispatcher;
import richTea.runtime.execution.ExecutionContext;

public class RContainerListener extends EventDispatcher implements ContainerListener {

	public RContainerListener(ExecutionContext context) {
		super(context);	
	}
	
	@Override
	public void componentAdded(ContainerEvent e) {
		dispatchEvent("componentAdded", e);
	}

	@Override
	public void componentRemoved(ContainerEvent e) {
		dispatchEvent("componentRemoved", e);
	}
}