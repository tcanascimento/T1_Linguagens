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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'+'", "'-'", "'='", "'var'", "';'", "','"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
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

                if ( (LA1_0==15) ) {
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

                if ( (LA2_0==14) ) {
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
    // InternalT1.g:202:1: rule__Value__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( ( rule__Value__Group_3__0 ) ) | ( ( rule__Value__Group_4__0 ) ) | ( ( rule__Value__Group_5__0 ) ) | ( ( rule__Value__Group_6__0 ) ) | ( ( rule__Value__Group_7__0 ) ) | ( ( rule__Value__Group_8__0 ) ) | ( ( rule__Value__Group_9__0 ) ) | ( ( rule__Value__Group_10__0 ) ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:206:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( ( rule__Value__Group_3__0 ) ) | ( ( rule__Value__Group_4__0 ) ) | ( ( rule__Value__Group_5__0 ) ) | ( ( rule__Value__Group_6__0 ) ) | ( ( rule__Value__Group_7__0 ) ) | ( ( rule__Value__Group_8__0 ) ) | ( ( rule__Value__Group_9__0 ) ) | ( ( rule__Value__Group_10__0 ) ) )
            int alt3=11;
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
                case 7 :
                    // InternalT1.g:243:2: ( ( rule__Value__Group_6__0 ) )
                    {
                    // InternalT1.g:243:2: ( ( rule__Value__Group_6__0 ) )
                    // InternalT1.g:244:3: ( rule__Value__Group_6__0 )
                    {
                     before(grammarAccess.getValueAccess().getGroup_6()); 
                    // InternalT1.g:245:3: ( rule__Value__Group_6__0 )
                    // InternalT1.g:245:4: rule__Value__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalT1.g:249:2: ( ( rule__Value__Group_7__0 ) )
                    {
                    // InternalT1.g:249:2: ( ( rule__Value__Group_7__0 ) )
                    // InternalT1.g:250:3: ( rule__Value__Group_7__0 )
                    {
                     before(grammarAccess.getValueAccess().getGroup_7()); 
                    // InternalT1.g:251:3: ( rule__Value__Group_7__0 )
                    // InternalT1.g:251:4: rule__Value__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getGroup_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalT1.g:255:2: ( ( rule__Value__Group_8__0 ) )
                    {
                    // InternalT1.g:255:2: ( ( rule__Value__Group_8__0 ) )
                    // InternalT1.g:256:3: ( rule__Value__Group_8__0 )
                    {
                     before(grammarAccess.getValueAccess().getGroup_8()); 
                    // InternalT1.g:257:3: ( rule__Value__Group_8__0 )
                    // InternalT1.g:257:4: rule__Value__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__Group_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getGroup_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalT1.g:261:2: ( ( rule__Value__Group_9__0 ) )
                    {
                    // InternalT1.g:261:2: ( ( rule__Value__Group_9__0 ) )
                    // InternalT1.g:262:3: ( rule__Value__Group_9__0 )
                    {
                     before(grammarAccess.getValueAccess().getGroup_9()); 
                    // InternalT1.g:263:3: ( rule__Value__Group_9__0 )
                    // InternalT1.g:263:4: rule__Value__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__Group_9__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getGroup_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalT1.g:267:2: ( ( rule__Value__Group_10__0 ) )
                    {
                    // InternalT1.g:267:2: ( ( rule__Value__Group_10__0 ) )
                    // InternalT1.g:268:3: ( rule__Value__Group_10__0 )
                    {
                     before(grammarAccess.getValueAccess().getGroup_10()); 
                    // InternalT1.g:269:3: ( rule__Value__Group_10__0 )
                    // InternalT1.g:269:4: rule__Value__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__Group_10__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getGroup_10()); 

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
    // InternalT1.g:277:1: rule__Value__Group_3__0 : rule__Value__Group_3__0__Impl rule__Value__Group_3__1 ;
    public final void rule__Value__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:281:1: ( rule__Value__Group_3__0__Impl rule__Value__Group_3__1 )
            // InternalT1.g:282:2: rule__Value__Group_3__0__Impl rule__Value__Group_3__1
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
    // InternalT1.g:289:1: rule__Value__Group_3__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Value__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:293:1: ( ( ( RULE_INT )? ) )
            // InternalT1.g:294:1: ( ( RULE_INT )? )
            {
            // InternalT1.g:294:1: ( ( RULE_INT )? )
            // InternalT1.g:295:2: ( RULE_INT )?
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_3_0()); 
            // InternalT1.g:296:2: ( RULE_INT )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalT1.g:296:3: RULE_INT
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
    // InternalT1.g:304:1: rule__Value__Group_3__1 : rule__Value__Group_3__1__Impl rule__Value__Group_3__2 ;
    public final void rule__Value__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:308:1: ( rule__Value__Group_3__1__Impl rule__Value__Group_3__2 )
            // InternalT1.g:309:2: rule__Value__Group_3__1__Impl rule__Value__Group_3__2
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
    // InternalT1.g:316:1: rule__Value__Group_3__1__Impl : ( '.' ) ;
    public final void rule__Value__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:320:1: ( ( '.' ) )
            // InternalT1.g:321:1: ( '.' )
            {
            // InternalT1.g:321:1: ( '.' )
            // InternalT1.g:322:2: '.'
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
    // InternalT1.g:331:1: rule__Value__Group_3__2 : rule__Value__Group_3__2__Impl ;
    public final void rule__Value__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:335:1: ( rule__Value__Group_3__2__Impl )
            // InternalT1.g:336:2: rule__Value__Group_3__2__Impl
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
    // InternalT1.g:342:1: rule__Value__Group_3__2__Impl : ( ( RULE_INT )* ) ;
    public final void rule__Value__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:346:1: ( ( ( RULE_INT )* ) )
            // InternalT1.g:347:1: ( ( RULE_INT )* )
            {
            // InternalT1.g:347:1: ( ( RULE_INT )* )
            // InternalT1.g:348:2: ( RULE_INT )*
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_3_2()); 
            // InternalT1.g:349:2: ( RULE_INT )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_INT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalT1.g:349:3: RULE_INT
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
    // InternalT1.g:358:1: rule__Value__Group_4__0 : rule__Value__Group_4__0__Impl rule__Value__Group_4__1 ;
    public final void rule__Value__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:362:1: ( rule__Value__Group_4__0__Impl rule__Value__Group_4__1 )
            // InternalT1.g:363:2: rule__Value__Group_4__0__Impl rule__Value__Group_4__1
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
    // InternalT1.g:370:1: rule__Value__Group_4__0__Impl : ( RULE_INT ) ;
    public final void rule__Value__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:374:1: ( ( RULE_INT ) )
            // InternalT1.g:375:1: ( RULE_INT )
            {
            // InternalT1.g:375:1: ( RULE_INT )
            // InternalT1.g:376:2: RULE_INT
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
    // InternalT1.g:385:1: rule__Value__Group_4__1 : rule__Value__Group_4__1__Impl rule__Value__Group_4__2 ;
    public final void rule__Value__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:389:1: ( rule__Value__Group_4__1__Impl rule__Value__Group_4__2 )
            // InternalT1.g:390:2: rule__Value__Group_4__1__Impl rule__Value__Group_4__2
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
    // InternalT1.g:397:1: rule__Value__Group_4__1__Impl : ( '+' ) ;
    public final void rule__Value__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:401:1: ( ( '+' ) )
            // InternalT1.g:402:1: ( '+' )
            {
            // InternalT1.g:402:1: ( '+' )
            // InternalT1.g:403:2: '+'
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
    // InternalT1.g:412:1: rule__Value__Group_4__2 : rule__Value__Group_4__2__Impl ;
    public final void rule__Value__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:416:1: ( rule__Value__Group_4__2__Impl )
            // InternalT1.g:417:2: rule__Value__Group_4__2__Impl
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
    // InternalT1.g:423:1: rule__Value__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__Value__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:427:1: ( ( RULE_INT ) )
            // InternalT1.g:428:1: ( RULE_INT )
            {
            // InternalT1.g:428:1: ( RULE_INT )
            // InternalT1.g:429:2: RULE_INT
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
    // InternalT1.g:439:1: rule__Value__Group_5__0 : rule__Value__Group_5__0__Impl rule__Value__Group_5__1 ;
    public final void rule__Value__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:443:1: ( rule__Value__Group_5__0__Impl rule__Value__Group_5__1 )
            // InternalT1.g:444:2: rule__Value__Group_5__0__Impl rule__Value__Group_5__1
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
    // InternalT1.g:451:1: rule__Value__Group_5__0__Impl : ( RULE_INT ) ;
    public final void rule__Value__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:455:1: ( ( RULE_INT ) )
            // InternalT1.g:456:1: ( RULE_INT )
            {
            // InternalT1.g:456:1: ( RULE_INT )
            // InternalT1.g:457:2: RULE_INT
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
    // InternalT1.g:466:1: rule__Value__Group_5__1 : rule__Value__Group_5__1__Impl rule__Value__Group_5__2 ;
    public final void rule__Value__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:470:1: ( rule__Value__Group_5__1__Impl rule__Value__Group_5__2 )
            // InternalT1.g:471:2: rule__Value__Group_5__1__Impl rule__Value__Group_5__2
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
    // InternalT1.g:478:1: rule__Value__Group_5__1__Impl : ( '+' ) ;
    public final void rule__Value__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:482:1: ( ( '+' ) )
            // InternalT1.g:483:1: ( '+' )
            {
            // InternalT1.g:483:1: ( '+' )
            // InternalT1.g:484:2: '+'
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
    // InternalT1.g:493:1: rule__Value__Group_5__2 : rule__Value__Group_5__2__Impl rule__Value__Group_5__3 ;
    public final void rule__Value__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:497:1: ( rule__Value__Group_5__2__Impl rule__Value__Group_5__3 )
            // InternalT1.g:498:2: rule__Value__Group_5__2__Impl rule__Value__Group_5__3
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
    // InternalT1.g:505:1: rule__Value__Group_5__2__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Value__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:509:1: ( ( ( RULE_INT )? ) )
            // InternalT1.g:510:1: ( ( RULE_INT )? )
            {
            // InternalT1.g:510:1: ( ( RULE_INT )? )
            // InternalT1.g:511:2: ( RULE_INT )?
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_5_2()); 
            // InternalT1.g:512:2: ( RULE_INT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalT1.g:512:3: RULE_INT
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
    // InternalT1.g:520:1: rule__Value__Group_5__3 : rule__Value__Group_5__3__Impl rule__Value__Group_5__4 ;
    public final void rule__Value__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:524:1: ( rule__Value__Group_5__3__Impl rule__Value__Group_5__4 )
            // InternalT1.g:525:2: rule__Value__Group_5__3__Impl rule__Value__Group_5__4
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
    // InternalT1.g:532:1: rule__Value__Group_5__3__Impl : ( '.' ) ;
    public final void rule__Value__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:536:1: ( ( '.' ) )
            // InternalT1.g:537:1: ( '.' )
            {
            // InternalT1.g:537:1: ( '.' )
            // InternalT1.g:538:2: '.'
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
    // InternalT1.g:547:1: rule__Value__Group_5__4 : rule__Value__Group_5__4__Impl ;
    public final void rule__Value__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:551:1: ( rule__Value__Group_5__4__Impl )
            // InternalT1.g:552:2: rule__Value__Group_5__4__Impl
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
    // InternalT1.g:558:1: rule__Value__Group_5__4__Impl : ( ( RULE_INT )* ) ;
    public final void rule__Value__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:562:1: ( ( ( RULE_INT )* ) )
            // InternalT1.g:563:1: ( ( RULE_INT )* )
            {
            // InternalT1.g:563:1: ( ( RULE_INT )* )
            // InternalT1.g:564:2: ( RULE_INT )*
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_5_4()); 
            // InternalT1.g:565:2: ( RULE_INT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_INT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalT1.g:565:3: RULE_INT
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


    // $ANTLR start "rule__Value__Group_6__0"
    // InternalT1.g:574:1: rule__Value__Group_6__0 : rule__Value__Group_6__0__Impl rule__Value__Group_6__1 ;
    public final void rule__Value__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:578:1: ( rule__Value__Group_6__0__Impl rule__Value__Group_6__1 )
            // InternalT1.g:579:2: rule__Value__Group_6__0__Impl rule__Value__Group_6__1
            {
            pushFollow(FOLLOW_8);
            rule__Value__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_6__1();

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
    // $ANTLR end "rule__Value__Group_6__0"


    // $ANTLR start "rule__Value__Group_6__0__Impl"
    // InternalT1.g:586:1: rule__Value__Group_6__0__Impl : ( RULE_INT ) ;
    public final void rule__Value__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:590:1: ( ( RULE_INT ) )
            // InternalT1.g:591:1: ( RULE_INT )
            {
            // InternalT1.g:591:1: ( RULE_INT )
            // InternalT1.g:592:2: RULE_INT
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getINTTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__Value__Group_6__0__Impl"


    // $ANTLR start "rule__Value__Group_6__1"
    // InternalT1.g:601:1: rule__Value__Group_6__1 : rule__Value__Group_6__1__Impl rule__Value__Group_6__2 ;
    public final void rule__Value__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:605:1: ( rule__Value__Group_6__1__Impl rule__Value__Group_6__2 )
            // InternalT1.g:606:2: rule__Value__Group_6__1__Impl rule__Value__Group_6__2
            {
            pushFollow(FOLLOW_6);
            rule__Value__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_6__2();

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
    // $ANTLR end "rule__Value__Group_6__1"


    // $ANTLR start "rule__Value__Group_6__1__Impl"
    // InternalT1.g:613:1: rule__Value__Group_6__1__Impl : ( '+' ) ;
    public final void rule__Value__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:617:1: ( ( '+' ) )
            // InternalT1.g:618:1: ( '+' )
            {
            // InternalT1.g:618:1: ( '+' )
            // InternalT1.g:619:2: '+'
            {
             before(grammarAccess.getValueAccess().getPlusSignKeyword_6_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getPlusSignKeyword_6_1()); 

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
    // $ANTLR end "rule__Value__Group_6__1__Impl"


    // $ANTLR start "rule__Value__Group_6__2"
    // InternalT1.g:628:1: rule__Value__Group_6__2 : rule__Value__Group_6__2__Impl ;
    public final void rule__Value__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:632:1: ( rule__Value__Group_6__2__Impl )
            // InternalT1.g:633:2: rule__Value__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group_6__2__Impl();

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
    // $ANTLR end "rule__Value__Group_6__2"


    // $ANTLR start "rule__Value__Group_6__2__Impl"
    // InternalT1.g:639:1: rule__Value__Group_6__2__Impl : ( ( RULE_INT )* ) ;
    public final void rule__Value__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:643:1: ( ( ( RULE_INT )* ) )
            // InternalT1.g:644:1: ( ( RULE_INT )* )
            {
            // InternalT1.g:644:1: ( ( RULE_INT )* )
            // InternalT1.g:645:2: ( RULE_INT )*
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_6_2()); 
            // InternalT1.g:646:2: ( RULE_INT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_INT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalT1.g:646:3: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_7); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getValueAccess().getINTTerminalRuleCall_6_2()); 

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
    // $ANTLR end "rule__Value__Group_6__2__Impl"


    // $ANTLR start "rule__Value__Group_7__0"
    // InternalT1.g:655:1: rule__Value__Group_7__0 : rule__Value__Group_7__0__Impl rule__Value__Group_7__1 ;
    public final void rule__Value__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:659:1: ( rule__Value__Group_7__0__Impl rule__Value__Group_7__1 )
            // InternalT1.g:660:2: rule__Value__Group_7__0__Impl rule__Value__Group_7__1
            {
            pushFollow(FOLLOW_10);
            rule__Value__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_7__1();

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
    // $ANTLR end "rule__Value__Group_7__0"


    // $ANTLR start "rule__Value__Group_7__0__Impl"
    // InternalT1.g:667:1: rule__Value__Group_7__0__Impl : ( RULE_INT ) ;
    public final void rule__Value__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:671:1: ( ( RULE_INT ) )
            // InternalT1.g:672:1: ( RULE_INT )
            {
            // InternalT1.g:672:1: ( RULE_INT )
            // InternalT1.g:673:2: RULE_INT
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getINTTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__Value__Group_7__0__Impl"


    // $ANTLR start "rule__Value__Group_7__1"
    // InternalT1.g:682:1: rule__Value__Group_7__1 : rule__Value__Group_7__1__Impl rule__Value__Group_7__2 ;
    public final void rule__Value__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:686:1: ( rule__Value__Group_7__1__Impl rule__Value__Group_7__2 )
            // InternalT1.g:687:2: rule__Value__Group_7__1__Impl rule__Value__Group_7__2
            {
            pushFollow(FOLLOW_6);
            rule__Value__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_7__2();

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
    // $ANTLR end "rule__Value__Group_7__1"


    // $ANTLR start "rule__Value__Group_7__1__Impl"
    // InternalT1.g:694:1: rule__Value__Group_7__1__Impl : ( '-' ) ;
    public final void rule__Value__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:698:1: ( ( '-' ) )
            // InternalT1.g:699:1: ( '-' )
            {
            // InternalT1.g:699:1: ( '-' )
            // InternalT1.g:700:2: '-'
            {
             before(grammarAccess.getValueAccess().getHyphenMinusKeyword_7_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getHyphenMinusKeyword_7_1()); 

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
    // $ANTLR end "rule__Value__Group_7__1__Impl"


    // $ANTLR start "rule__Value__Group_7__2"
    // InternalT1.g:709:1: rule__Value__Group_7__2 : rule__Value__Group_7__2__Impl ;
    public final void rule__Value__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:713:1: ( rule__Value__Group_7__2__Impl )
            // InternalT1.g:714:2: rule__Value__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group_7__2__Impl();

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
    // $ANTLR end "rule__Value__Group_7__2"


    // $ANTLR start "rule__Value__Group_7__2__Impl"
    // InternalT1.g:720:1: rule__Value__Group_7__2__Impl : ( RULE_INT ) ;
    public final void rule__Value__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:724:1: ( ( RULE_INT ) )
            // InternalT1.g:725:1: ( RULE_INT )
            {
            // InternalT1.g:725:1: ( RULE_INT )
            // InternalT1.g:726:2: RULE_INT
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_7_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getINTTerminalRuleCall_7_2()); 

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
    // $ANTLR end "rule__Value__Group_7__2__Impl"


    // $ANTLR start "rule__Value__Group_8__0"
    // InternalT1.g:736:1: rule__Value__Group_8__0 : rule__Value__Group_8__0__Impl rule__Value__Group_8__1 ;
    public final void rule__Value__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:740:1: ( rule__Value__Group_8__0__Impl rule__Value__Group_8__1 )
            // InternalT1.g:741:2: rule__Value__Group_8__0__Impl rule__Value__Group_8__1
            {
            pushFollow(FOLLOW_10);
            rule__Value__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_8__1();

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
    // $ANTLR end "rule__Value__Group_8__0"


    // $ANTLR start "rule__Value__Group_8__0__Impl"
    // InternalT1.g:748:1: rule__Value__Group_8__0__Impl : ( RULE_INT ) ;
    public final void rule__Value__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:752:1: ( ( RULE_INT ) )
            // InternalT1.g:753:1: ( RULE_INT )
            {
            // InternalT1.g:753:1: ( RULE_INT )
            // InternalT1.g:754:2: RULE_INT
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getINTTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__Value__Group_8__0__Impl"


    // $ANTLR start "rule__Value__Group_8__1"
    // InternalT1.g:763:1: rule__Value__Group_8__1 : rule__Value__Group_8__1__Impl rule__Value__Group_8__2 ;
    public final void rule__Value__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:767:1: ( rule__Value__Group_8__1__Impl rule__Value__Group_8__2 )
            // InternalT1.g:768:2: rule__Value__Group_8__1__Impl rule__Value__Group_8__2
            {
            pushFollow(FOLLOW_9);
            rule__Value__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_8__2();

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
    // $ANTLR end "rule__Value__Group_8__1"


    // $ANTLR start "rule__Value__Group_8__1__Impl"
    // InternalT1.g:775:1: rule__Value__Group_8__1__Impl : ( '-' ) ;
    public final void rule__Value__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:779:1: ( ( '-' ) )
            // InternalT1.g:780:1: ( '-' )
            {
            // InternalT1.g:780:1: ( '-' )
            // InternalT1.g:781:2: '-'
            {
             before(grammarAccess.getValueAccess().getHyphenMinusKeyword_8_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getHyphenMinusKeyword_8_1()); 

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
    // $ANTLR end "rule__Value__Group_8__1__Impl"


    // $ANTLR start "rule__Value__Group_8__2"
    // InternalT1.g:790:1: rule__Value__Group_8__2 : rule__Value__Group_8__2__Impl rule__Value__Group_8__3 ;
    public final void rule__Value__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:794:1: ( rule__Value__Group_8__2__Impl rule__Value__Group_8__3 )
            // InternalT1.g:795:2: rule__Value__Group_8__2__Impl rule__Value__Group_8__3
            {
            pushFollow(FOLLOW_9);
            rule__Value__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_8__3();

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
    // $ANTLR end "rule__Value__Group_8__2"


    // $ANTLR start "rule__Value__Group_8__2__Impl"
    // InternalT1.g:802:1: rule__Value__Group_8__2__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Value__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:806:1: ( ( ( RULE_INT )? ) )
            // InternalT1.g:807:1: ( ( RULE_INT )? )
            {
            // InternalT1.g:807:1: ( ( RULE_INT )? )
            // InternalT1.g:808:2: ( RULE_INT )?
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_8_2()); 
            // InternalT1.g:809:2: ( RULE_INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalT1.g:809:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getValueAccess().getINTTerminalRuleCall_8_2()); 

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
    // $ANTLR end "rule__Value__Group_8__2__Impl"


    // $ANTLR start "rule__Value__Group_8__3"
    // InternalT1.g:817:1: rule__Value__Group_8__3 : rule__Value__Group_8__3__Impl rule__Value__Group_8__4 ;
    public final void rule__Value__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:821:1: ( rule__Value__Group_8__3__Impl rule__Value__Group_8__4 )
            // InternalT1.g:822:2: rule__Value__Group_8__3__Impl rule__Value__Group_8__4
            {
            pushFollow(FOLLOW_6);
            rule__Value__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_8__4();

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
    // $ANTLR end "rule__Value__Group_8__3"


    // $ANTLR start "rule__Value__Group_8__3__Impl"
    // InternalT1.g:829:1: rule__Value__Group_8__3__Impl : ( '.' ) ;
    public final void rule__Value__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:833:1: ( ( '.' ) )
            // InternalT1.g:834:1: ( '.' )
            {
            // InternalT1.g:834:1: ( '.' )
            // InternalT1.g:835:2: '.'
            {
             before(grammarAccess.getValueAccess().getFullStopKeyword_8_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getFullStopKeyword_8_3()); 

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
    // $ANTLR end "rule__Value__Group_8__3__Impl"


    // $ANTLR start "rule__Value__Group_8__4"
    // InternalT1.g:844:1: rule__Value__Group_8__4 : rule__Value__Group_8__4__Impl ;
    public final void rule__Value__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:848:1: ( rule__Value__Group_8__4__Impl )
            // InternalT1.g:849:2: rule__Value__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group_8__4__Impl();

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
    // $ANTLR end "rule__Value__Group_8__4"


    // $ANTLR start "rule__Value__Group_8__4__Impl"
    // InternalT1.g:855:1: rule__Value__Group_8__4__Impl : ( ( RULE_INT )* ) ;
    public final void rule__Value__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:859:1: ( ( ( RULE_INT )* ) )
            // InternalT1.g:860:1: ( ( RULE_INT )* )
            {
            // InternalT1.g:860:1: ( ( RULE_INT )* )
            // InternalT1.g:861:2: ( RULE_INT )*
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_8_4()); 
            // InternalT1.g:862:2: ( RULE_INT )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_INT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalT1.g:862:3: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_7); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getValueAccess().getINTTerminalRuleCall_8_4()); 

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
    // $ANTLR end "rule__Value__Group_8__4__Impl"


    // $ANTLR start "rule__Value__Group_9__0"
    // InternalT1.g:871:1: rule__Value__Group_9__0 : rule__Value__Group_9__0__Impl rule__Value__Group_9__1 ;
    public final void rule__Value__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:875:1: ( rule__Value__Group_9__0__Impl rule__Value__Group_9__1 )
            // InternalT1.g:876:2: rule__Value__Group_9__0__Impl rule__Value__Group_9__1
            {
            pushFollow(FOLLOW_10);
            rule__Value__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_9__1();

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
    // $ANTLR end "rule__Value__Group_9__0"


    // $ANTLR start "rule__Value__Group_9__0__Impl"
    // InternalT1.g:883:1: rule__Value__Group_9__0__Impl : ( RULE_INT ) ;
    public final void rule__Value__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:887:1: ( ( RULE_INT ) )
            // InternalT1.g:888:1: ( RULE_INT )
            {
            // InternalT1.g:888:1: ( RULE_INT )
            // InternalT1.g:889:2: RULE_INT
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_9_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getINTTerminalRuleCall_9_0()); 

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
    // $ANTLR end "rule__Value__Group_9__0__Impl"


    // $ANTLR start "rule__Value__Group_9__1"
    // InternalT1.g:898:1: rule__Value__Group_9__1 : rule__Value__Group_9__1__Impl rule__Value__Group_9__2 ;
    public final void rule__Value__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:902:1: ( rule__Value__Group_9__1__Impl rule__Value__Group_9__2 )
            // InternalT1.g:903:2: rule__Value__Group_9__1__Impl rule__Value__Group_9__2
            {
            pushFollow(FOLLOW_6);
            rule__Value__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_9__2();

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
    // $ANTLR end "rule__Value__Group_9__1"


    // $ANTLR start "rule__Value__Group_9__1__Impl"
    // InternalT1.g:910:1: rule__Value__Group_9__1__Impl : ( '-' ) ;
    public final void rule__Value__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:914:1: ( ( '-' ) )
            // InternalT1.g:915:1: ( '-' )
            {
            // InternalT1.g:915:1: ( '-' )
            // InternalT1.g:916:2: '-'
            {
             before(grammarAccess.getValueAccess().getHyphenMinusKeyword_9_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getHyphenMinusKeyword_9_1()); 

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
    // $ANTLR end "rule__Value__Group_9__1__Impl"


    // $ANTLR start "rule__Value__Group_9__2"
    // InternalT1.g:925:1: rule__Value__Group_9__2 : rule__Value__Group_9__2__Impl ;
    public final void rule__Value__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:929:1: ( rule__Value__Group_9__2__Impl )
            // InternalT1.g:930:2: rule__Value__Group_9__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group_9__2__Impl();

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
    // $ANTLR end "rule__Value__Group_9__2"


    // $ANTLR start "rule__Value__Group_9__2__Impl"
    // InternalT1.g:936:1: rule__Value__Group_9__2__Impl : ( ( RULE_INT )* ) ;
    public final void rule__Value__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:940:1: ( ( ( RULE_INT )* ) )
            // InternalT1.g:941:1: ( ( RULE_INT )* )
            {
            // InternalT1.g:941:1: ( ( RULE_INT )* )
            // InternalT1.g:942:2: ( RULE_INT )*
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_9_2()); 
            // InternalT1.g:943:2: ( RULE_INT )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_INT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalT1.g:943:3: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_7); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getValueAccess().getINTTerminalRuleCall_9_2()); 

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
    // $ANTLR end "rule__Value__Group_9__2__Impl"


    // $ANTLR start "rule__Value__Group_10__0"
    // InternalT1.g:952:1: rule__Value__Group_10__0 : rule__Value__Group_10__0__Impl rule__Value__Group_10__1 ;
    public final void rule__Value__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:956:1: ( rule__Value__Group_10__0__Impl rule__Value__Group_10__1 )
            // InternalT1.g:957:2: rule__Value__Group_10__0__Impl rule__Value__Group_10__1
            {
            pushFollow(FOLLOW_5);
            rule__Value__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_10__1();

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
    // $ANTLR end "rule__Value__Group_10__0"


    // $ANTLR start "rule__Value__Group_10__0__Impl"
    // InternalT1.g:964:1: rule__Value__Group_10__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Value__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:968:1: ( ( ( RULE_INT )? ) )
            // InternalT1.g:969:1: ( ( RULE_INT )? )
            {
            // InternalT1.g:969:1: ( ( RULE_INT )? )
            // InternalT1.g:970:2: ( RULE_INT )?
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_10_0()); 
            // InternalT1.g:971:2: ( RULE_INT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalT1.g:971:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getValueAccess().getINTTerminalRuleCall_10_0()); 

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
    // $ANTLR end "rule__Value__Group_10__0__Impl"


    // $ANTLR start "rule__Value__Group_10__1"
    // InternalT1.g:979:1: rule__Value__Group_10__1 : rule__Value__Group_10__1__Impl rule__Value__Group_10__2 ;
    public final void rule__Value__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:983:1: ( rule__Value__Group_10__1__Impl rule__Value__Group_10__2 )
            // InternalT1.g:984:2: rule__Value__Group_10__1__Impl rule__Value__Group_10__2
            {
            pushFollow(FOLLOW_11);
            rule__Value__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_10__2();

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
    // $ANTLR end "rule__Value__Group_10__1"


    // $ANTLR start "rule__Value__Group_10__1__Impl"
    // InternalT1.g:991:1: rule__Value__Group_10__1__Impl : ( '.' ) ;
    public final void rule__Value__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:995:1: ( ( '.' ) )
            // InternalT1.g:996:1: ( '.' )
            {
            // InternalT1.g:996:1: ( '.' )
            // InternalT1.g:997:2: '.'
            {
             before(grammarAccess.getValueAccess().getFullStopKeyword_10_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getFullStopKeyword_10_1()); 

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
    // $ANTLR end "rule__Value__Group_10__1__Impl"


    // $ANTLR start "rule__Value__Group_10__2"
    // InternalT1.g:1006:1: rule__Value__Group_10__2 : rule__Value__Group_10__2__Impl rule__Value__Group_10__3 ;
    public final void rule__Value__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1010:1: ( rule__Value__Group_10__2__Impl rule__Value__Group_10__3 )
            // InternalT1.g:1011:2: rule__Value__Group_10__2__Impl rule__Value__Group_10__3
            {
            pushFollow(FOLLOW_11);
            rule__Value__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_10__3();

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
    // $ANTLR end "rule__Value__Group_10__2"


    // $ANTLR start "rule__Value__Group_10__2__Impl"
    // InternalT1.g:1018:1: rule__Value__Group_10__2__Impl : ( ( RULE_INT )* ) ;
    public final void rule__Value__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1022:1: ( ( ( RULE_INT )* ) )
            // InternalT1.g:1023:1: ( ( RULE_INT )* )
            {
            // InternalT1.g:1023:1: ( ( RULE_INT )* )
            // InternalT1.g:1024:2: ( RULE_INT )*
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_10_2()); 
            // InternalT1.g:1025:2: ( RULE_INT )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_INT) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalT1.g:1025:3: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_7); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getValueAccess().getINTTerminalRuleCall_10_2()); 

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
    // $ANTLR end "rule__Value__Group_10__2__Impl"


    // $ANTLR start "rule__Value__Group_10__3"
    // InternalT1.g:1033:1: rule__Value__Group_10__3 : rule__Value__Group_10__3__Impl rule__Value__Group_10__4 ;
    public final void rule__Value__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1037:1: ( rule__Value__Group_10__3__Impl rule__Value__Group_10__4 )
            // InternalT1.g:1038:2: rule__Value__Group_10__3__Impl rule__Value__Group_10__4
            {
            pushFollow(FOLLOW_6);
            rule__Value__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_10__4();

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
    // $ANTLR end "rule__Value__Group_10__3"


    // $ANTLR start "rule__Value__Group_10__3__Impl"
    // InternalT1.g:1045:1: rule__Value__Group_10__3__Impl : ( '+' ) ;
    public final void rule__Value__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1049:1: ( ( '+' ) )
            // InternalT1.g:1050:1: ( '+' )
            {
            // InternalT1.g:1050:1: ( '+' )
            // InternalT1.g:1051:2: '+'
            {
             before(grammarAccess.getValueAccess().getPlusSignKeyword_10_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getPlusSignKeyword_10_3()); 

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
    // $ANTLR end "rule__Value__Group_10__3__Impl"


    // $ANTLR start "rule__Value__Group_10__4"
    // InternalT1.g:1060:1: rule__Value__Group_10__4 : rule__Value__Group_10__4__Impl ;
    public final void rule__Value__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1064:1: ( rule__Value__Group_10__4__Impl )
            // InternalT1.g:1065:2: rule__Value__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group_10__4__Impl();

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
    // $ANTLR end "rule__Value__Group_10__4"


    // $ANTLR start "rule__Value__Group_10__4__Impl"
    // InternalT1.g:1071:1: rule__Value__Group_10__4__Impl : ( RULE_INT ) ;
    public final void rule__Value__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1075:1: ( ( RULE_INT ) )
            // InternalT1.g:1076:1: ( RULE_INT )
            {
            // InternalT1.g:1076:1: ( RULE_INT )
            // InternalT1.g:1077:2: RULE_INT
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_10_4()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getINTTerminalRuleCall_10_4()); 

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
    // $ANTLR end "rule__Value__Group_10__4__Impl"


    // $ANTLR start "rule__Attribution__Group__0"
    // InternalT1.g:1087:1: rule__Attribution__Group__0 : rule__Attribution__Group__0__Impl rule__Attribution__Group__1 ;
    public final void rule__Attribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1091:1: ( rule__Attribution__Group__0__Impl rule__Attribution__Group__1 )
            // InternalT1.g:1092:2: rule__Attribution__Group__0__Impl rule__Attribution__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalT1.g:1099:1: rule__Attribution__Group__0__Impl : ( '=' ) ;
    public final void rule__Attribution__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1103:1: ( ( '=' ) )
            // InternalT1.g:1104:1: ( '=' )
            {
            // InternalT1.g:1104:1: ( '=' )
            // InternalT1.g:1105:2: '='
            {
             before(grammarAccess.getAttributionAccess().getEqualsSignKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalT1.g:1114:1: rule__Attribution__Group__1 : rule__Attribution__Group__1__Impl ;
    public final void rule__Attribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1118:1: ( rule__Attribution__Group__1__Impl )
            // InternalT1.g:1119:2: rule__Attribution__Group__1__Impl
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
    // InternalT1.g:1125:1: rule__Attribution__Group__1__Impl : ( ruleValue ) ;
    public final void rule__Attribution__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1129:1: ( ( ruleValue ) )
            // InternalT1.g:1130:1: ( ruleValue )
            {
            // InternalT1.g:1130:1: ( ruleValue )
            // InternalT1.g:1131:2: ruleValue
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
    // InternalT1.g:1141:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1145:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // InternalT1.g:1146:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalT1.g:1153:1: rule__Declaration__Group__0__Impl : ( ruleName ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1157:1: ( ( ruleName ) )
            // InternalT1.g:1158:1: ( ruleName )
            {
            // InternalT1.g:1158:1: ( ruleName )
            // InternalT1.g:1159:2: ruleName
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
    // InternalT1.g:1168:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1172:1: ( rule__Declaration__Group__1__Impl )
            // InternalT1.g:1173:2: rule__Declaration__Group__1__Impl
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
    // InternalT1.g:1179:1: rule__Declaration__Group__1__Impl : ( ruleAttribution ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1183:1: ( ( ruleAttribution ) )
            // InternalT1.g:1184:1: ( ruleAttribution )
            {
            // InternalT1.g:1184:1: ( ruleAttribution )
            // InternalT1.g:1185:2: ruleAttribution
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
    // InternalT1.g:1195:1: rule__Var__Group__0 : rule__Var__Group__0__Impl rule__Var__Group__1 ;
    public final void rule__Var__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1199:1: ( rule__Var__Group__0__Impl rule__Var__Group__1 )
            // InternalT1.g:1200:2: rule__Var__Group__0__Impl rule__Var__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalT1.g:1207:1: rule__Var__Group__0__Impl : ( 'var' ) ;
    public final void rule__Var__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1211:1: ( ( 'var' ) )
            // InternalT1.g:1212:1: ( 'var' )
            {
            // InternalT1.g:1212:1: ( 'var' )
            // InternalT1.g:1213:2: 'var'
            {
             before(grammarAccess.getVarAccess().getVarKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalT1.g:1222:1: rule__Var__Group__1 : rule__Var__Group__1__Impl rule__Var__Group__2 ;
    public final void rule__Var__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1226:1: ( rule__Var__Group__1__Impl rule__Var__Group__2 )
            // InternalT1.g:1227:2: rule__Var__Group__1__Impl rule__Var__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalT1.g:1234:1: rule__Var__Group__1__Impl : ( ( rule__Var__DeclarationsAssignment_1 ) ) ;
    public final void rule__Var__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1238:1: ( ( ( rule__Var__DeclarationsAssignment_1 ) ) )
            // InternalT1.g:1239:1: ( ( rule__Var__DeclarationsAssignment_1 ) )
            {
            // InternalT1.g:1239:1: ( ( rule__Var__DeclarationsAssignment_1 ) )
            // InternalT1.g:1240:2: ( rule__Var__DeclarationsAssignment_1 )
            {
             before(grammarAccess.getVarAccess().getDeclarationsAssignment_1()); 
            // InternalT1.g:1241:2: ( rule__Var__DeclarationsAssignment_1 )
            // InternalT1.g:1241:3: rule__Var__DeclarationsAssignment_1
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
    // InternalT1.g:1249:1: rule__Var__Group__2 : rule__Var__Group__2__Impl rule__Var__Group__3 ;
    public final void rule__Var__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1253:1: ( rule__Var__Group__2__Impl rule__Var__Group__3 )
            // InternalT1.g:1254:2: rule__Var__Group__2__Impl rule__Var__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalT1.g:1261:1: rule__Var__Group__2__Impl : ( ( rule__Var__Group_2__0 )* ) ;
    public final void rule__Var__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1265:1: ( ( ( rule__Var__Group_2__0 )* ) )
            // InternalT1.g:1266:1: ( ( rule__Var__Group_2__0 )* )
            {
            // InternalT1.g:1266:1: ( ( rule__Var__Group_2__0 )* )
            // InternalT1.g:1267:2: ( rule__Var__Group_2__0 )*
            {
             before(grammarAccess.getVarAccess().getGroup_2()); 
            // InternalT1.g:1268:2: ( rule__Var__Group_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalT1.g:1268:3: rule__Var__Group_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Var__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalT1.g:1276:1: rule__Var__Group__3 : rule__Var__Group__3__Impl ;
    public final void rule__Var__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1280:1: ( rule__Var__Group__3__Impl )
            // InternalT1.g:1281:2: rule__Var__Group__3__Impl
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
    // InternalT1.g:1287:1: rule__Var__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__Var__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1291:1: ( ( ( ';' )? ) )
            // InternalT1.g:1292:1: ( ( ';' )? )
            {
            // InternalT1.g:1292:1: ( ( ';' )? )
            // InternalT1.g:1293:2: ( ';' )?
            {
             before(grammarAccess.getVarAccess().getSemicolonKeyword_3()); 
            // InternalT1.g:1294:2: ( ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==16) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalT1.g:1294:3: ';'
                    {
                    match(input,16,FOLLOW_2); 

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
    // InternalT1.g:1303:1: rule__Var__Group_2__0 : rule__Var__Group_2__0__Impl rule__Var__Group_2__1 ;
    public final void rule__Var__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1307:1: ( rule__Var__Group_2__0__Impl rule__Var__Group_2__1 )
            // InternalT1.g:1308:2: rule__Var__Group_2__0__Impl rule__Var__Group_2__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalT1.g:1315:1: rule__Var__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Var__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1319:1: ( ( ',' ) )
            // InternalT1.g:1320:1: ( ',' )
            {
            // InternalT1.g:1320:1: ( ',' )
            // InternalT1.g:1321:2: ','
            {
             before(grammarAccess.getVarAccess().getCommaKeyword_2_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalT1.g:1330:1: rule__Var__Group_2__1 : rule__Var__Group_2__1__Impl ;
    public final void rule__Var__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1334:1: ( rule__Var__Group_2__1__Impl )
            // InternalT1.g:1335:2: rule__Var__Group_2__1__Impl
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
    // InternalT1.g:1341:1: rule__Var__Group_2__1__Impl : ( ( rule__Var__DeclarationsAssignment_2_1 ) ) ;
    public final void rule__Var__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1345:1: ( ( ( rule__Var__DeclarationsAssignment_2_1 ) ) )
            // InternalT1.g:1346:1: ( ( rule__Var__DeclarationsAssignment_2_1 ) )
            {
            // InternalT1.g:1346:1: ( ( rule__Var__DeclarationsAssignment_2_1 ) )
            // InternalT1.g:1347:2: ( rule__Var__DeclarationsAssignment_2_1 )
            {
             before(grammarAccess.getVarAccess().getDeclarationsAssignment_2_1()); 
            // InternalT1.g:1348:2: ( rule__Var__DeclarationsAssignment_2_1 )
            // InternalT1.g:1348:3: rule__Var__DeclarationsAssignment_2_1
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
    // InternalT1.g:1357:1: rule__Model__VarsAssignment : ( ruleVar ) ;
    public final void rule__Model__VarsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1361:1: ( ( ruleVar ) )
            // InternalT1.g:1362:2: ( ruleVar )
            {
            // InternalT1.g:1362:2: ( ruleVar )
            // InternalT1.g:1363:3: ruleVar
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
    // InternalT1.g:1372:1: rule__Var__DeclarationsAssignment_1 : ( ruleDeclaration ) ;
    public final void rule__Var__DeclarationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1376:1: ( ( ruleDeclaration ) )
            // InternalT1.g:1377:2: ( ruleDeclaration )
            {
            // InternalT1.g:1377:2: ( ruleDeclaration )
            // InternalT1.g:1378:3: ruleDeclaration
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
    // InternalT1.g:1387:1: rule__Var__DeclarationsAssignment_2_1 : ( ruleDeclaration ) ;
    public final void rule__Var__DeclarationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1391:1: ( ( ruleDeclaration ) )
            // InternalT1.g:1392:2: ( ruleDeclaration )
            {
            // InternalT1.g:1392:2: ( ruleDeclaration )
            // InternalT1.g:1393:3: ruleDeclaration
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
    static final String dfa_1s = "\23\uffff";
    static final String dfa_2s = "\3\uffff\1\7\1\12\1\14\1\20\1\uffff\1\12\2\uffff\1\21\2\uffff\1\22\4\uffff";
    static final String dfa_3s = "\1\4\2\uffff\1\13\3\6\1\uffff\1\6\2\uffff\1\13\2\uffff\1\13\4\uffff";
    static final String dfa_4s = "\1\13\2\uffff\4\21\1\uffff\1\21\2\uffff\1\21\2\uffff\1\21\4\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\4\uffff\1\3\1\uffff\1\13\1\4\1\uffff\1\7\1\6\1\uffff\1\11\1\12\1\5\1\10";
    static final String dfa_6s = "\23\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\4\uffff\1\4",
            "",
            "",
            "\1\4\1\5\1\6\4\7",
            "\1\10\5\uffff\1\11\1\uffff\4\12",
            "\1\13\4\uffff\1\15\2\uffff\4\14",
            "\1\16\4\uffff\1\17\2\uffff\4\20",
            "",
            "\1\10\5\uffff\1\11\1\uffff\4\12",
            "",
            "",
            "\1\15\2\uffff\4\21",
            "",
            "",
            "\1\17\2\uffff\4\22",
            "",
            "",
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
            return "202:1: rule__Value__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( ( rule__Value__Group_3__0 ) ) | ( ( rule__Value__Group_4__0 ) ) | ( ( rule__Value__Group_5__0 ) ) | ( ( rule__Value__Group_6__0 ) ) | ( ( rule__Value__Group_7__0 ) ) | ( ( rule__Value__Group_8__0 ) ) | ( ( rule__Value__Group_9__0 ) ) | ( ( rule__Value__Group_10__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000870L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020002L});

}