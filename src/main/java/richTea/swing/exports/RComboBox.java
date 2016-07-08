package richTea.swing.exports;

import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import richTea.swing.exports.event.RActionListener;

public class RComboBox extends CreateAWTComponent {
	
	@SuppressWarnings("unchecked")
	@Override
	protected JComboBox<?> createBean() throws ClassNotFoundException, InstantiationException, IllegalAccessException {		
		JComboBox<Object> comboBox = (JComboBox<Object>) super.createBean();
		
		comboBox.addActionListener(new RActionListener(context));
		comboBox.setModel(new DefaultComboBoxModel<Object>(getModelData()));
		
		return comboBox;
	}
	
	protected Object[] getModelData() {
		List<?> data = (List<?>) context.getValue("data");
		
		return data.toArray(new Object[data.size()]);
	}
}