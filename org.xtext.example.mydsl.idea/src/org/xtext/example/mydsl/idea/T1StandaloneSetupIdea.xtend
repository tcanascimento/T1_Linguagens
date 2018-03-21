/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.idea

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.example.mydsl.T1RuntimeModule
import org.xtext.example.mydsl.T1StandaloneSetupGenerated

class T1StandaloneSetupIdea extends T1StandaloneSetupGenerated {
	override createInjector() {
		val runtimeModule = new T1RuntimeModule()
		val ideaModule = new T1IdeaModule()
		val mergedModule = Modules2.mixin(runtimeModule, ideaModule)
		return Guice.createInjector(mergedModule)
	}
}
