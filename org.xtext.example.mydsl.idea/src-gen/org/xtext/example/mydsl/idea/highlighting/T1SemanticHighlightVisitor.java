/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.idea.highlighting;

import org.eclipse.xtext.idea.highlighting.SemanticHighlightVisitor;
import org.xtext.example.mydsl.idea.lang.T1Language;

public class T1SemanticHighlightVisitor extends SemanticHighlightVisitor {
	public T1SemanticHighlightVisitor() {
		T1Language.INSTANCE.injectMembers(this);
	}
}
