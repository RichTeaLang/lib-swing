package richTea.swing.exports.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import richTea.runtime.execution.EventDispatcher;
import richTea.runtime.execution.ExecutionContext;

public class RActionListener extends EventDispatcher implements ActionListener {

	public RActionListener(ExecutionContext context) {
		super(context);	}

	@Override
	public void actionPerformed(ActionEvent e) {
		dispatchEvent("actionPerformed", e);
	}
}