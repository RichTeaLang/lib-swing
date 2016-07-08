package richTea.swing.exports.event;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import richTea.runtime.execution.EventDispatcher;
import richTea.runtime.execution.ExecutionContext;

public class RFocusListener extends EventDispatcher implements FocusListener {

	public RFocusListener(ExecutionContext context) {
		super(context);
	}

	@Override
	public void focusGained(FocusEvent e) {
		dispatchEvent("focusGained", e);
	}

	@Override
	public void focusLost(FocusEvent e) {
		dispatchEvent("focusLost", e);
	}
}