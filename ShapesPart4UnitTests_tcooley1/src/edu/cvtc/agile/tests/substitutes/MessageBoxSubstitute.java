/**
 * 
 */
package edu.cvtc.agile.tests.substitutes;

import edu.cvtc.agile.shapes.Dialog;

/**
 * @author Tyler
 *
 */
public class MessageBoxSubstitute implements Dialog {
	@Override
	public int displayMessage(String message, String title) {
		return 0;
	}

}
