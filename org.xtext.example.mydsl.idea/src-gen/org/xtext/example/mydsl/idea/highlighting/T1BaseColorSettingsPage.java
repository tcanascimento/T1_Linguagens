/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.idea.highlighting;

import org.eclipse.xtext.idea.highlighting.AbstractColorSettingsPage;
import org.xtext.example.mydsl.idea.lang.T1Language;

public class T1BaseColorSettingsPage extends AbstractColorSettingsPage {
	
	public T1BaseColorSettingsPage() {
		T1Language.INSTANCE.injectMembers(this);
	}

	@Override
	public String getDisplayName() {
		return T1Language.INSTANCE.getDisplayName();
	}
}