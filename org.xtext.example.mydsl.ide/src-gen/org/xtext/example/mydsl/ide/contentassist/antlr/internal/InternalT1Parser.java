package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.T1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalT1Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'+'", "'='", "'var'", "';'", "','"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalT1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalT1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalT1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalT1.g"; }


    	private T1GrammarAccess grammarAccess;

    	public void setGrammarAccess(T1GrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalT1.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalT1.g:54:1: ( ruleModel EOF )
            // InternalT1.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalT1.g:62:1: ruleModel : ( ( rule__Model__VarsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:66:2: ( ( ( rule__Model__VarsAssignment )* ) )
            // InternalT1.g:67:2: ( ( rule__Model__VarsAssignment )* )
            {
            // InternalT1.g:67:2: ( ( rule__Model__VarsAssignment )* )
            // InternalT1.g:68:3: ( rule__Model__VarsAssignment )*
            {
             before(grammarAccess.getModelAccess().getVarsAssignment()); 
            // InternalT1.g:69:3: ( rule__Model__VarsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalT1.g:69:4: rule__Model__VarsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__VarsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getVarsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleName"
    // InternalT1.g:78:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalT1.g:79:1: ( ruleName EOF )
            // InternalT1.g:80:1: ruleName EOF
            {
             before(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalT1.g:87:1: ruleName : ( RULE_ID ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:91:2: ( ( RULE_ID ) )
            // InternalT1.g:92:2: ( RULE_ID )
            {
            // InternalT1.g:92:2: ( RULE_ID )
            // InternalT1.g:93:3: RULE_ID
            {
             before(grammarAccess.getNameAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNameAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleValue"
    // InternalT1.g:103:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalT1.g:104:1: ( ruleValue EOF )
            // InternalT1.g:105:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalT1.g:112:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:116:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalT1.g:117:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalT1.g:117:2: ( ( rule__Value__Alternatives ) )
            // InternalT1.g:118:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalT1.g:119:3: ( rule__Value__Alternatives )
            // InternalT1.g:119:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleAttribution"
    // InternalT1.g:128:1: entryRuleAttribution : ruleAttribution EOF ;
    public final void entryRuleAttribution() throws RecognitionException {
        try {
            // InternalT1.g:129:1: ( ruleAttribution EOF )
            // InternalT1.g:130:1: ruleAttribution EOF
            {
             before(grammarAccess.getAttributionRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribution();

            state._fsp--;

             after(grammarAccess.getAttributionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribution"


    // $ANTLR start "ruleAttribution"
    // InternalT1.g:137:1: ruleAttribution : ( ( rule__Attribution__Group__0 )* ) ;
    public final void ruleAttribution() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:141:2: ( ( ( rule__Attribution__Group__0 )* ) )
            // InternalT1.g:142:2: ( ( rule__Attribution__Group__0 )* )
            {
            // InternalT1.g:142:2: ( ( rule__Attribution__Group__0 )* )
            // InternalT1.g:143:3: ( rule__Attribution__Group__0 )*
            {
             before(grammarAccess.getAttributionAccess().getGroup()); 
            // InternalT1.g:144:3: ( rule__Attribution__Group__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalT1.g:144:4: rule__Attribution__Group__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Attribution__Group__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getAttributionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribution"


    // $ANTLR start "entryRuleDeclaration"
    // InternalT1.g:153:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalT1.g:154:1: ( ruleDeclaration EOF )
            // InternalT1.g:155:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalT1.g:162:1: ruleDeclaration : ( ( rule__Declaration__Group__0 ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:166:2: ( ( ( rule__Declaration__Group__0 ) ) )
            // InternalT1.g:167:2: ( ( rule__Declaration__Group__0 ) )
            {
            // InternalT1.g:167:2: ( ( rule__Declaration__Group__0 ) )
            // InternalT1.g:168:3: ( rule__Declaration__Group__0 )
            {
             before(grammarAccess.getDeclarationAccess().getGroup()); 
            // InternalT1.g:169:3: ( rule__Declaration__Group__0 )
            // InternalT1.g:169:4: rule__Declaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleVar"
    // InternalT1.g:178:1: entryRuleVar : ruleVar EOF ;
    public final void entryRuleVar() throws RecognitionException {
        try {
            // InternalT1.g:179:1: ( ruleVar EOF )
            // InternalT1.g:180:1: ruleVar EOF
            {
             before(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_1);
            ruleVar();

            state._fsp--;

             after(grammarAccess.getVarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalT1.g:187:1: ruleVar : ( ( rule__Var__Group__0 ) ) ;
    public final void ruleVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:191:2: ( ( ( rule__Var__Group__0 ) ) )
            // InternalT1.g:192:2: ( ( rule__Var__Group__0 ) )
            {
            // InternalT1.g:192:2: ( ( rule__Var__Group__0 ) )
            // InternalT1.g:193:3: ( rule__Var__Group__0 )
            {
             before(grammarAccess.getVarAccess().getGroup()); 
            // InternalT1.g:194:3: ( rule__Var__Group__0 )
            // InternalT1.g:194:4: rule__Var__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Var__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVar"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalT1.g:202:1: rule__Value__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( ( rule__Value__Group_3__0 ) ) | ( ( rule__Value__Group_4__0 ) ) | ( ( rule__Value__Group_5__0 ) ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:206:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( ( rule__Value__Group_3__0 ) ) | ( ( rule__Value__Group_4__0 ) ) | ( ( rule__Value__Group_5__0 ) ) )
            int alt3=6;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalT1.g:207:2: ( RULE_ID )
                    {
                    // InternalT1.g:207:2: ( RULE_ID )
                    // InternalT1.g:208:3: RULE_ID
                    {
                     before(grammarAccess.getValueAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT1.g:213:2: ( RULE_STRING )
                    {
                    // InternalT1.g:213:2: ( RULE_STRING )
                    // InternalT1.g:214:3: RULE_STRING
                    {
                     before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalT1.g:219:2: ( RULE_INT )
                    {
                    // InternalT1.g:219:2: ( RULE_INT )
                    // InternalT1.g:220:3: RULE_INT
                    {
                     before(grammarAccess.getValueAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getINTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalT1.g:225:2: ( ( rule__Value__Group_3__0 ) )
                    {
                    // InternalT1.g:225:2: ( ( rule__Value__Group_3__0 ) )
                    // InternalT1.g:226:3: ( rule__Value__Group_3__0 )
                    {
                     before(grammarAccess.getValueAccess().getGroup_3()); 
                    // InternalT1.g:227:3: ( rule__Value__Group_3__0 )
                    // InternalT1.g:227:4: rule__Value__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalT1.g:231:2: ( ( rule__Value__Group_4__0 ) )
                    {
                    // InternalT1.g:231:2: ( ( rule__Value__Group_4__0 ) )
                    // InternalT1.g:232:3: ( rule__Value__Group_4__0 )
                    {
                     before(grammarAccess.getValueAccess().getGroup_4()); 
                    // InternalT1.g:233:3: ( rule__Value__Group_4__0 )
                    // InternalT1.g:233:4: rule__Value__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalT1.g:237:2: ( ( rule__Value__Group_5__0 ) )
                    {
                    // InternalT1.g:237:2: ( ( rule__Value__Group_5__0 ) )
                    // InternalT1.g:238:3: ( rule__Value__Group_5__0 )
                    {
                     before(grammarAccess.getValueAccess().getGroup_5()); 
                    // InternalT1.g:239:3: ( rule__Value__Group_5__0 )
                    // InternalT1.g:239:4: rule__Value__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getGroup_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Value__Group_3__0"
    // InternalT1.g:247:1: rule__Value__Group_3__0 : rule__Value__Group_3__0__Impl rule__Value__Group_3__1 ;
    public final void rule__Value__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:251:1: ( rule__Value__Group_3__0__Impl rule__Value__Group_3__1 )
            // InternalT1.g:252:2: rule__Value__Group_3__0__Impl rule__Value__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Value__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_3__0"


    // $ANTLR start "rule__Value__Group_3__0__Impl"
    // InternalT1.g:259:1: rule__Value__Group_3__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Value__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:263:1: ( ( ( RULE_INT )? ) )
            // InternalT1.g:264:1: ( ( RULE_INT )? )
            {
            // InternalT1.g:264:1: ( ( RULE_INT )? )
            // InternalT1.g:265:2: ( RULE_INT )?
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_3_0()); 
            // InternalT1.g:266:2: ( RULE_INT )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalT1.g:266:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getValueAccess().getINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_3__0__Impl"


    // $ANTLR start "rule__Value__Group_3__1"
    // InternalT1.g:274:1: rule__Value__Group_3__1 : rule__Value__Group_3__1__Impl rule__Value__Group_3__2 ;
    public final void rule__Value__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:278:1: ( rule__Value__Group_3__1__Impl rule__Value__Group_3__2 )
            // InternalT1.g:279:2: rule__Value__Group_3__1__Impl rule__Value__Group_3__2
            {
            pushFollow(FOLLOW_6);
            rule__Value__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_3__1"


    // $ANTLR start "rule__Value__Group_3__1__Impl"
    // InternalT1.g:286:1: rule__Value__Group_3__1__Impl : ( '.' ) ;
    public final void rule__Value__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:290:1: ( ( '.' ) )
            // InternalT1.g:291:1: ( '.' )
            {
            // InternalT1.g:291:1: ( '.' )
            // InternalT1.g:292:2: '.'
            {
             before(grammarAccess.getValueAccess().getFullStopKeyword_3_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getFullStopKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_3__1__Impl"


    // $ANTLR start "rule__Value__Group_3__2"
    // InternalT1.g:301:1: rule__Value__Group_3__2 : rule__Value__Group_3__2__Impl ;
    public final void rule__Value__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:305:1: ( rule__Value__Group_3__2__Impl )
            // InternalT1.g:306:2: rule__Value__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_3__2"


    // $ANTLR start "rule__Value__Group_3__2__Impl"
    // InternalT1.g:312:1: rule__Value__Group_3__2__Impl : ( ( RULE_INT )* ) ;
    public final void rule__Value__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:316:1: ( ( ( RULE_INT )* ) )
            // InternalT1.g:317:1: ( ( RULE_INT )* )
            {
            // InternalT1.g:317:1: ( ( RULE_INT )* )
            // InternalT1.g:318:2: ( RULE_INT )*
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_3_2()); 
            // InternalT1.g:319:2: ( RULE_INT )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_INT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalT1.g:319:3: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_7); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getValueAccess().getINTTerminalRuleCall_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_3__2__Impl"


    // $ANTLR start "rule__Value__Group_4__0"
    // InternalT1.g:328:1: rule__Value__Group_4__0 : rule__Value__Group_4__0__Impl rule__Value__Group_4__1 ;
    public final void rule__Value__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:332:1: ( rule__Value__Group_4__0__Impl rule__Value__Group_4__1 )
            // InternalT1.g:333:2: rule__Value__Group_4__0__Impl rule__Value__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Value__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_4__0"


    // $ANTLR start "rule__Value__Group_4__0__Impl"
    // InternalT1.g:340:1: rule__Value__Group_4__0__Impl : ( RULE_INT ) ;
    public final void rule__Value__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:344:1: ( ( RULE_INT ) )
            // InternalT1.g:345:1: ( RULE_INT )
            {
            // InternalT1.g:345:1: ( RULE_INT )
            // InternalT1.g:346:2: RULE_INT
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_4__0__Impl"


    // $ANTLR start "rule__Value__Group_4__1"
    // InternalT1.g:355:1: rule__Value__Group_4__1 : rule__Value__Group_4__1__Impl rule__Value__Group_4__2 ;
    public final void rule__Value__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:359:1: ( rule__Value__Group_4__1__Impl rule__Value__Group_4__2 )
            // InternalT1.g:360:2: rule__Value__Group_4__1__Impl rule__Value__Group_4__2
            {
            pushFollow(FOLLOW_6);
            rule__Value__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_4__1"


    // $ANTLR start "rule__Value__Group_4__1__Impl"
    // InternalT1.g:367:1: rule__Value__Group_4__1__Impl : ( '+' ) ;
    public final void rule__Value__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:371:1: ( ( '+' ) )
            // InternalT1.g:372:1: ( '+' )
            {
            // InternalT1.g:372:1: ( '+' )
            // InternalT1.g:373:2: '+'
            {
             before(grammarAccess.getValueAccess().getPlusSignKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getPlusSignKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_4__1__Impl"


    // $ANTLR start "rule__Value__Group_4__2"
    // InternalT1.g:382:1: rule__Value__Group_4__2 : rule__Value__Group_4__2__Impl ;
    public final void rule__Value__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:386:1: ( rule__Value__Group_4__2__Impl )
            // InternalT1.g:387:2: rule__Value__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_4__2"


    // $ANTLR start "rule__Value__Group_4__2__Impl"
    // InternalT1.g:393:1: rule__Value__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__Value__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:397:1: ( ( RULE_INT ) )
            // InternalT1.g:398:1: ( RULE_INT )
            {
            // InternalT1.g:398:1: ( RULE_INT )
            // InternalT1.g:399:2: RULE_INT
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_4__2__Impl"


    // $ANTLR start "rule__Value__Group_5__0"
    // InternalT1.g:409:1: rule__Value__Group_5__0 : rule__Value__Group_5__0__Impl rule__Value__Group_5__1 ;
    public final void rule__Value__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:413:1: ( rule__Value__Group_5__0__Impl rule__Value__Group_5__1 )
            // InternalT1.g:414:2: rule__Value__Group_5__0__Impl rule__Value__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__Value__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5__0"


    // $ANTLR start "rule__Value__Group_5__0__Impl"
    // InternalT1.g:421:1: rule__Value__Group_5__0__Impl : ( RULE_INT ) ;
    public final void rule__Value__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:425:1: ( ( RULE_INT ) )
            // InternalT1.g:426:1: ( RULE_INT )
            {
            // InternalT1.g:426:1: ( RULE_INT )
            // InternalT1.g:427:2: RULE_INT
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5__0__Impl"


    // $ANTLR start "rule__Value__Group_5__1"
    // InternalT1.g:436:1: rule__Value__Group_5__1 : rule__Value__Group_5__1__Impl rule__Value__Group_5__2 ;
    public final void rule__Value__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:440:1: ( rule__Value__Group_5__1__Impl rule__Value__Group_5__2 )
            // InternalT1.g:441:2: rule__Value__Group_5__1__Impl rule__Value__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__Value__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5__1"


    // $ANTLR start "rule__Value__Group_5__1__Impl"
    // InternalT1.g:448:1: rule__Value__Group_5__1__Impl : ( '+' ) ;
    public final void rule__Value__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:452:1: ( ( '+' ) )
            // InternalT1.g:453:1: ( '+' )
            {
            // InternalT1.g:453:1: ( '+' )
            // InternalT1.g:454:2: '+'
            {
             before(grammarAccess.getValueAccess().getPlusSignKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getPlusSignKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5__1__Impl"


    // $ANTLR start "rule__Value__Group_5__2"
    // InternalT1.g:463:1: rule__Value__Group_5__2 : rule__Value__Group_5__2__Impl rule__Value__Group_5__3 ;
    public final void rule__Value__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:467:1: ( rule__Value__Group_5__2__Impl rule__Value__Group_5__3 )
            // InternalT1.g:468:2: rule__Value__Group_5__2__Impl rule__Value__Group_5__3
            {
            pushFollow(FOLLOW_9);
            rule__Value__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5__2"


    // $ANTLR start "rule__Value__Group_5__2__Impl"
    // InternalT1.g:475:1: rule__Value__Group_5__2__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Value__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:479:1: ( ( ( RULE_INT )? ) )
            // InternalT1.g:480:1: ( ( RULE_INT )? )
            {
            // InternalT1.g:480:1: ( ( RULE_INT )? )
            // InternalT1.g:481:2: ( RULE_INT )?
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_5_2()); 
            // InternalT1.g:482:2: ( RULE_INT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalT1.g:482:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getValueAccess().getINTTerminalRuleCall_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5__2__Impl"


    // $ANTLR start "rule__Value__Group_5__3"
    // InternalT1.g:490:1: rule__Value__Group_5__3 : rule__Value__Group_5__3__Impl rule__Value__Group_5__4 ;
    public final void rule__Value__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:494:1: ( rule__Value__Group_5__3__Impl rule__Value__Group_5__4 )
            // InternalT1.g:495:2: rule__Value__Group_5__3__Impl rule__Value__Group_5__4
            {
            pushFollow(FOLLOW_6);
            rule__Value__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5__3"


    // $ANTLR start "rule__Value__Group_5__3__Impl"
    // InternalT1.g:502:1: rule__Value__Group_5__3__Impl : ( '.' ) ;
    public final void rule__Value__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:506:1: ( ( '.' ) )
            // InternalT1.g:507:1: ( '.' )
            {
            // InternalT1.g:507:1: ( '.' )
            // InternalT1.g:508:2: '.'
            {
             before(grammarAccess.getValueAccess().getFullStopKeyword_5_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getFullStopKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5__3__Impl"


    // $ANTLR start "rule__Value__Group_5__4"
    // InternalT1.g:517:1: rule__Value__Group_5__4 : rule__Value__Group_5__4__Impl ;
    public final void rule__Value__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:521:1: ( rule__Value__Group_5__4__Impl )
            // InternalT1.g:522:2: rule__Value__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5__4"


    // $ANTLR start "rule__Value__Group_5__4__Impl"
    // InternalT1.g:528:1: rule__Value__Group_5__4__Impl : ( ( RULE_INT )* ) ;
    public final void rule__Value__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:532:1: ( ( ( RULE_INT )* ) )
            // InternalT1.g:533:1: ( ( RULE_INT )* )
            {
            // InternalT1.g:533:1: ( ( RULE_INT )* )
            // InternalT1.g:534:2: ( RULE_INT )*
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_5_4()); 
            // InternalT1.g:535:2: ( RULE_INT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_INT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalT1.g:535:3: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_7); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getValueAccess().getINTTerminalRuleCall_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5__4__Impl"


    // $ANTLR start "rule__Attribution__Group__0"
    // InternalT1.g:544:1: rule__Attribution__Group__0 : rule__Attribution__Group__0__Impl rule__Attribution__Group__1 ;
    public final void rule__Attribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:548:1: ( rule__Attribution__Group__0__Impl rule__Attribution__Group__1 )
            // InternalT1.g:549:2: rule__Attribution__Group__0__Impl rule__Attribution__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Attribution__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribution__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribution__Group__0"


    // $ANTLR start "rule__Attribution__Group__0__Impl"
    // InternalT1.g:556:1: rule__Attribution__Group__0__Impl : ( '=' ) ;
    public final void rule__Attribution__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:560:1: ( ( '=' ) )
            // InternalT1.g:561:1: ( '=' )
            {
            // InternalT1.g:561:1: ( '=' )
            // InternalT1.g:562:2: '='
            {
             before(grammarAccess.getAttributionAccess().getEqualsSignKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAttributionAccess().getEqualsSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribution__Group__0__Impl"


    // $ANTLR start "rule__Attribution__Group__1"
    // InternalT1.g:571:1: rule__Attribution__Group__1 : rule__Attribution__Group__1__Impl ;
    public final void rule__Attribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:575:1: ( rule__Attribution__Group__1__Impl )
            // InternalT1.g:576:2: rule__Attribution__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribution__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribution__Group__1"


    // $ANTLR start "rule__Attribution__Group__1__Impl"
    // InternalT1.g:582:1: rule__Attribution__Group__1__Impl : ( ruleValue ) ;
    public final void rule__Attribution__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:586:1: ( ( ruleValue ) )
            // InternalT1.g:587:1: ( ruleValue )
            {
            // InternalT1.g:587:1: ( ruleValue )
            // InternalT1.g:588:2: ruleValue
            {
             before(grammarAccess.getAttributionAccess().getValueParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getAttributionAccess().getValueParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribution__Group__1__Impl"


    // $ANTLR start "rule__Declaration__Group__0"
    // InternalT1.g:598:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:602:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // InternalT1.g:603:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__0"


    // $ANTLR start "rule__Declaration__Group__0__Impl"
    // InternalT1.g:610:1: rule__Declaration__Group__0__Impl : ( ruleName ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:614:1: ( ( ruleName ) )
            // InternalT1.g:615:1: ( ruleName )
            {
            // InternalT1.g:615:1: ( ruleName )
            // InternalT1.g:616:2: ruleName
            {
             before(grammarAccess.getDeclarationAccess().getNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__0__Impl"


    // $ANTLR start "rule__Declaration__Group__1"
    // InternalT1.g:625:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:629:1: ( rule__Declaration__Group__1__Impl )
            // InternalT1.g:630:2: rule__Declaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__1"


    // $ANTLR start "rule__Declaration__Group__1__Impl"
    // InternalT1.g:636:1: rule__Declaration__Group__1__Impl : ( ruleAttribution ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:640:1: ( ( ruleAttribution ) )
            // InternalT1.g:641:1: ( ruleAttribution )
            {
            // InternalT1.g:641:1: ( ruleAttribution )
            // InternalT1.g:642:2: ruleAttribution
            {
             before(grammarAccess.getDeclarationAccess().getAttributionParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleAttribution();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getAttributionParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__1__Impl"


    // $ANTLR start "rule__Var__Group__0"
    // InternalT1.g:652:1: rule__Var__Group__0 : rule__Var__Group__0__Impl rule__Var__Group__1 ;
    public final void rule__Var__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:656:1: ( rule__Var__Group__0__Impl rule__Var__Group__1 )
            // InternalT1.g:657:2: rule__Var__Group__0__Impl rule__Var__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Var__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group__0"


    // $ANTLR start "rule__Var__Group__0__Impl"
    // InternalT1.g:664:1: rule__Var__Group__0__Impl : ( 'var' ) ;
    public final void rule__Var__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:668:1: ( ( 'var' ) )
            // InternalT1.g:669:1: ( 'var' )
            {
            // InternalT1.g:669:1: ( 'var' )
            // InternalT1.g:670:2: 'var'
            {
             before(grammarAccess.getVarAccess().getVarKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getVarAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group__0__Impl"


    // $ANTLR start "rule__Var__Group__1"
    // InternalT1.g:679:1: rule__Var__Group__1 : rule__Var__Group__1__Impl rule__Var__Group__2 ;
    public final void rule__Var__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:683:1: ( rule__Var__Group__1__Impl rule__Var__Group__2 )
            // InternalT1.g:684:2: rule__Var__Group__1__Impl rule__Var__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Var__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group__1"


    // $ANTLR start "rule__Var__Group__1__Impl"
    // InternalT1.g:691:1: rule__Var__Group__1__Impl : ( ( rule__Var__DeclarationsAssignment_1 ) ) ;
    public final void rule__Var__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:695:1: ( ( ( rule__Var__DeclarationsAssignment_1 ) ) )
            // InternalT1.g:696:1: ( ( rule__Var__DeclarationsAssignment_1 ) )
            {
            // InternalT1.g:696:1: ( ( rule__Var__DeclarationsAssignment_1 ) )
            // InternalT1.g:697:2: ( rule__Var__DeclarationsAssignment_1 )
            {
             before(grammarAccess.getVarAccess().getDeclarationsAssignment_1()); 
            // InternalT1.g:698:2: ( rule__Var__DeclarationsAssignment_1 )
            // InternalT1.g:698:3: rule__Var__DeclarationsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Var__DeclarationsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVarAccess().getDeclarationsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group__1__Impl"


    // $ANTLR start "rule__Var__Group__2"
    // InternalT1.g:706:1: rule__Var__Group__2 : rule__Var__Group__2__Impl rule__Var__Group__3 ;
    public final void rule__Var__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:710:1: ( rule__Var__Group__2__Impl rule__Var__Group__3 )
            // InternalT1.g:711:2: rule__Var__Group__2__Impl rule__Var__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Var__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group__2"


    // $ANTLR start "rule__Var__Group__2__Impl"
    // InternalT1.g:718:1: rule__Var__Group__2__Impl : ( ( rule__Var__Group_2__0 )* ) ;
    public final void rule__Var__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:722:1: ( ( ( rule__Var__Group_2__0 )* ) )
            // InternalT1.g:723:1: ( ( rule__Var__Group_2__0 )* )
            {
            // InternalT1.g:723:1: ( ( rule__Var__Group_2__0 )* )
            // InternalT1.g:724:2: ( rule__Var__Group_2__0 )*
            {
             before(grammarAccess.getVarAccess().getGroup_2()); 
            // InternalT1.g:725:2: ( rule__Var__Group_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalT1.g:725:3: rule__Var__Group_2__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Var__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getVarAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group__2__Impl"


    // $ANTLR start "rule__Var__Group__3"
    // InternalT1.g:733:1: rule__Var__Group__3 : rule__Var__Group__3__Impl ;
    public final void rule__Var__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:737:1: ( rule__Var__Group__3__Impl )
            // InternalT1.g:738:2: rule__Var__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group__3"


    // $ANTLR start "rule__Var__Group__3__Impl"
    // InternalT1.g:744:1: rule__Var__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__Var__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:748:1: ( ( ( ';' )? ) )
            // InternalT1.g:749:1: ( ( ';' )? )
            {
            // InternalT1.g:749:1: ( ( ';' )? )
            // InternalT1.g:750:2: ( ';' )?
            {
             before(grammarAccess.getVarAccess().getSemicolonKeyword_3()); 
            // InternalT1.g:751:2: ( ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalT1.g:751:3: ';'
                    {
                    match(input,15,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getVarAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group__3__Impl"


    // $ANTLR start "rule__Var__Group_2__0"
    // InternalT1.g:760:1: rule__Var__Group_2__0 : rule__Var__Group_2__0__Impl rule__Var__Group_2__1 ;
    public final void rule__Var__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:764:1: ( rule__Var__Group_2__0__Impl rule__Var__Group_2__1 )
            // InternalT1.g:765:2: rule__Var__Group_2__0__Impl rule__Var__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Var__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_2__0"


    // $ANTLR start "rule__Var__Group_2__0__Impl"
    // InternalT1.g:772:1: rule__Var__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Var__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:776:1: ( ( ',' ) )
            // InternalT1.g:777:1: ( ',' )
            {
            // InternalT1.g:777:1: ( ',' )
            // InternalT1.g:778:2: ','
            {
             before(grammarAccess.getVarAccess().getCommaKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVarAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_2__0__Impl"


    // $ANTLR start "rule__Var__Group_2__1"
    // InternalT1.g:787:1: rule__Var__Group_2__1 : rule__Var__Group_2__1__Impl ;
    public final void rule__Var__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:791:1: ( rule__Var__Group_2__1__Impl )
            // InternalT1.g:792:2: rule__Var__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_2__1"


    // $ANTLR start "rule__Var__Group_2__1__Impl"
    // InternalT1.g:798:1: rule__Var__Group_2__1__Impl : ( ( rule__Var__DeclarationsAssignment_2_1 ) ) ;
    public final void rule__Var__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:802:1: ( ( ( rule__Var__DeclarationsAssignment_2_1 ) ) )
            // InternalT1.g:803:1: ( ( rule__Var__DeclarationsAssignment_2_1 ) )
            {
            // InternalT1.g:803:1: ( ( rule__Var__DeclarationsAssignment_2_1 ) )
            // InternalT1.g:804:2: ( rule__Var__DeclarationsAssignment_2_1 )
            {
             before(grammarAccess.getVarAccess().getDeclarationsAssignment_2_1()); 
            // InternalT1.g:805:2: ( rule__Var__DeclarationsAssignment_2_1 )
            // InternalT1.g:805:3: rule__Var__DeclarationsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Var__DeclarationsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVarAccess().getDeclarationsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_2__1__Impl"


    // $ANTLR start "rule__Model__VarsAssignment"
    // InternalT1.g:814:1: rule__Model__VarsAssignment : ( ruleVar ) ;
    public final void rule__Model__VarsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:818:1: ( ( ruleVar ) )
            // InternalT1.g:819:2: ( ruleVar )
            {
            // InternalT1.g:819:2: ( ruleVar )
            // InternalT1.g:820:3: ruleVar
            {
             before(grammarAccess.getModelAccess().getVarsVarParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleVar();

            state._fsp--;

             after(grammarAccess.getModelAccess().getVarsVarParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__VarsAssignment"


    // $ANTLR start "rule__Var__DeclarationsAssignment_1"
    // InternalT1.g:829:1: rule__Var__DeclarationsAssignment_1 : ( ruleDeclaration ) ;
    public final void rule__Var__DeclarationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:833:1: ( ( ruleDeclaration ) )
            // InternalT1.g:834:2: ( ruleDeclaration )
            {
            // InternalT1.g:834:2: ( ruleDeclaration )
            // InternalT1.g:835:3: ruleDeclaration
            {
             before(grammarAccess.getVarAccess().getDeclarationsDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getVarAccess().getDeclarationsDeclarationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__DeclarationsAssignment_1"


    // $ANTLR start "rule__Var__DeclarationsAssignment_2_1"
    // InternalT1.g:844:1: rule__Var__DeclarationsAssignment_2_1 : ( ruleDeclaration ) ;
    public final void rule__Var__DeclarationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:848:1: ( ( ruleDeclaration ) )
            // InternalT1.g:849:2: ( ruleDeclaration )
            {
            // InternalT1.g:849:2: ( ruleDeclaration )
            // InternalT1.g:850:3: ruleDeclaration
            {
             before(grammarAccess.getVarAccess().getDeclarationsDeclarationParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getVarAccess().getDeclarationsDeclarationParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__DeclarationsAssignment_2_1"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\3\uffff\1\5\3\uffff\1\11\2\uffff";
    static final String dfa_3s = "\1\4\2\uffff\1\13\2\uffff\1\6\1\13\2\uffff";
    static final String dfa_4s = "\1\13\2\uffff\1\20\2\uffff\1\13\1\20\2\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\uffff\1\4\1\3\2\uffff\1\6\1\5";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\4\uffff\1\4",
            "",
            "",
            "\1\4\1\6\4\5",
            "",
            "",
            "\1\7\4\uffff\1\10",
            "\1\10\1\uffff\4\11",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "202:1: rule__Value__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( ( rule__Value__Group_3__0 ) ) | ( ( rule__Value__Group_4__0 ) ) | ( ( rule__Value__Group_5__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000870L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010002L});

}