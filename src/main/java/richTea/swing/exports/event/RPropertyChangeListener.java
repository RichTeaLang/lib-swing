package richTea.swing.exports.event;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import richTea.runtime.execution.EventDispatcher;
import richTea.runtime.execution.ExecutionContext;

public class RPropertyChangeListener extends EventDispatcher implements PropertyChangeListener {

	public RPropertyChangeListener(ExecutionContext context) {
		super(context);
	}

	@Override
	public void propertyChange(PropertyChangeEvent e) {
		dispatchEvent("propertyChange", e);
	}
}