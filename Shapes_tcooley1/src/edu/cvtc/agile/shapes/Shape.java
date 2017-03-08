/**
 * 
 */
package edu.cvtc.agile.shapes;

/**
 * @author Tyler
 *
 */
public abstract class Shape {
	private Dialog dialog;
	
	protected Dialog getDialog() {
		return dialog;
	}
	
	private void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}
	
	public Shape(Dialog dialog) {
		setDialog(dialog);
	}
	
	// Abstract method for surfaceArea
	public abstract float surfaceArea();
	
	// Abstract method for volume
	public abstract float volume();
}
