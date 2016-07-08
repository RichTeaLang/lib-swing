package richTea.swing.exports.event;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import richTea.runtime.execution.EventDispatcher;
import richTea.runtime.execution.ExecutionContext;

public class RListSelectionListener extends EventDispatcher implements ListSelectionListener {

	public RListSelectionListener(ExecutionContext context) {
		super(context);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		dispatchEvent("valueChanged", e);
	}
}