/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.mydsl.t1.Model;
import org.xtext.example.mydsl.tests.T1InjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(T1InjectorProvider.class)
@SuppressWarnings("all")
public class T1ParsingTest {
  @Inject
  private ParseHelper<Model> parseHelper;
  
  @Test
  public void validaAtribuicaoComSoma() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var a = 1 + 2;");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void validaAtribuicaoComSomaFloat() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var a = 1 + 2.2121;");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void validaAtribuicaoComum() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var a = b;");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void vaidaAtribuicaoComposta() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var a = 0, b = 2;");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void validaVarSemPontoVirgula() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var a = c");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void validaVarAspasSimples() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var a = \'123**&ˆ\';");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void validaVarAspasDuplas() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var a = \"\'\'\"");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void validaVarSemAtribuicao() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var a");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void validaVarSemAtribuicaoComVirgula() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var a;");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void validaVarAtribuicaoNumero() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var a = 12312312312.122;");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void validaVarFloatSemDefinicaoCasaDecimal() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var a = 12312312312.;");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void validaVarDuplamenteComposta() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var a, b = a = \'A\';");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void validaVarFloatSemValorEsquerda() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var a = .12312312312");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void validaVarInicioNumero() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var 12311  = a;");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertFalse(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void validaVarInicioCaracter() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var &asa12  = 12;");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertFalse(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void validaVarCaracterEspecial() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var varC7123123  = *****;");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertFalse(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
