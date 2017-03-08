/**
 * 
 */
package edu.cvtc.agile.shapes;

import javax.swing.JOptionPane;

/**
 * @author Tyler
 *
 */
public class MessageBox implements Dialog {
	@Override
	public int displayMessage(String message, String title) {
		JOptionPane.showMessageDialog(null, message, title, 3);
		
		return JOptionPane.OK_OPTION;
	}

}
