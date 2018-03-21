/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.idea.lang;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import javax.swing.Icon;
import org.eclipse.xtext.idea.Icons;
import org.jetbrains.annotations.NonNls;

public class AbstractT1FileType extends LanguageFileType {

	@NonNls 
	public static final String DEFAULT_EXTENSION = "mydsl";

	protected AbstractT1FileType(final Language language) {
		super(language);
	}

	@Override
	public String getDefaultExtension() {
		return DEFAULT_EXTENSION;
	}

	@Override
	public String getDescription() {
		return "T1 files";
	}

	@Override
	public Icon getIcon() {
		return Icons.DSL_FILE_TYPE;
	}

	@Override
	public String getName() {
		return "T1";
	}

}