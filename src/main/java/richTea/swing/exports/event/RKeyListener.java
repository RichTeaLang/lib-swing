package richTea.swing.exports.event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import richTea.runtime.execution.EventDispatcher;
import richTea.runtime.execution.ExecutionContext;

public class RKeyListener extends EventDispatcher implements KeyListener {

	public RKeyListener(ExecutionContext context) {
		super(context);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		dispatchEvent("keyPressed", e);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		dispatchEvent("keyReleased", e);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		dispatchEvent("keyTyped", e);
	}
}