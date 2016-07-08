package richTea.swing.exports;

import javax.swing.JFrame;

import richTea.swing.exports.event.RWindowListener;

public class RFrame extends CreateAWTComponent {
	
	@Override
	protected JFrame createBean() throws ClassNotFoundException, InstantiationException, IllegalAccessException {		
		JFrame frame = (JFrame) super.createBean();
		
		frame.setLayout(null);
		frame.addWindowListener(new RWindowListener(context));
		
		frame.validate();
		
		return frame;
	}
}