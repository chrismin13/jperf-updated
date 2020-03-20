/**
 * - 02/2008: Class created by Nicolas Richasse
 * 
 * Changelog:
 * 	- class created
 * 
 * To do:
 * 	- ...
 */

package net.nlanr.jperf.ui;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class DoubleSpinner extends JSpinner {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3008315942240067938L;
	private SpinnerNumberModel spinnerNumberModel = new SpinnerNumberModel();

	public DoubleSpinner(double min, double max, double step, double initialValue) {
		spinnerNumberModel.setValue(initialValue);
		spinnerNumberModel.setStepSize(step);
		spinnerNumberModel.setMaximum(max);
		spinnerNumberModel.setMinimum(min);

		this.setModel(spinnerNumberModel);
	}

	public DoubleSpinner(double min, double max, double initialValue) {
		this(min, max, 1.0, initialValue);
	}

	public Double getValue() {
		Object val = super.getValue();
		if (val instanceof Number) {
			return ((Number) val).doubleValue();
		} else {
			return ((Number) spinnerNumberModel.getMinimum()).doubleValue();
		}
	}
}
