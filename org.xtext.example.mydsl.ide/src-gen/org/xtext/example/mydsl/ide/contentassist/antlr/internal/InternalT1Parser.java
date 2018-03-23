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
    // InternalT1.g:202:1: rule__Value__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( ( rule__Value__Group_3__0 ) ) | ( ( rule__Value__Group_4__0 ) ) | ( ( rule__Value__Group_5__0 ) ) | ( ( rule__Value__Group_6__0 ) ) | ( ( rule__Value__Group_7__0 ) ) | ( ( rule__Value__Group_8__0 ) ) | ( ( rule__Value__Group_9__0 ) ) | ( ( rule__Value__Group_10__0 ) ) | ( ( rule__Value__Group_11__0 ) ) | ( ( rule__Value__Group_12__0 )* ) | ( ( rule__Value__Group_13__0 ) ) | ( ( rule__Value__Group_14__0 ) ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:206:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( ( rule__Value__Group_3__0 ) ) | ( ( rule__Value__Group_4__0 ) ) | ( ( rule__Value__Group_5__0 ) ) | ( ( rule__Value__Group_6__0 ) ) | ( ( rule__Value__Group_7__0 ) ) | ( ( rule__Value__Group_8__0 ) ) | ( ( rule__Value__Group_9__0 ) ) | ( ( rule__Value__Group_10__0 ) ) | ( ( rule__Value__Group_11__0 ) ) | ( ( rule__Value__Group_12__0 )* ) | ( ( rule__Value__Group_13__0 ) ) | ( ( rule__Value__Group_14__0 ) ) )
            int alt4=15;
            alt4 = dfa4.predict(input);
            switch (alt4) {
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
                case 12 :
                    // InternalT1.g:273:2: ( ( rule__Value__Group_11__0 ) )
                    {
                    // InternalT1.g:273:2: ( ( rule__Value__Group_11__0 ) )
                    // InternalT1.g:274:3: ( rule__Value__Group_11__0 )
                    {
                     before(grammarAccess.getValueAccess().getGroup_11()); 
                    // InternalT1.g:275:3: ( rule__Value__Group_11__0 )
                    // InternalT1.g:275:4: rule__Value__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__Group_11__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getGroup_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalT1.g:279:2: ( ( rule__Value__Group_12__0 )* )
                    {
                    // InternalT1.g:279:2: ( ( rule__Value__Group_12__0 )* )
                    // InternalT1.g:280:3: ( rule__Value__Group_12__0 )*
                    {
                     before(grammarAccess.getValueAccess().getGroup_12()); 
                    // InternalT1.g:281:3: ( rule__Value__Group_12__0 )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalT1.g:281:4: rule__Value__Group_12__0
                    	    {
                    	    pushFollow(FOLLOW_5);
                    	    rule__Value__Group_12__0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                     after(grammarAccess.getValueAccess().getGroup_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalT1.g:285:2: ( ( rule__Value__Group_13__0 ) )
                    {
                    // InternalT1.g:285:2: ( ( rule__Value__Group_13__0 ) )
                    // InternalT1.g:286:3: ( rule__Value__Group_13__0 )
                    {
                     before(grammarAccess.getValueAccess().getGroup_13()); 
                    // InternalT1.g:287:3: ( rule__Value__Group_13__0 )
                    // InternalT1.g:287:4: rule__Value__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__Group_13__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getGroup_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalT1.g:291:2: ( ( rule__Value__Group_14__0 ) )
                    {
                    // InternalT1.g:291:2: ( ( rule__Value__Group_14__0 ) )
                    // InternalT1.g:292:3: ( rule__Value__Group_14__0 )
                    {
                     before(grammarAccess.getValueAccess().getGroup_14()); 
                    // InternalT1.g:293:3: ( rule__Value__Group_14__0 )
                    // InternalT1.g:293:4: rule__Value__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__Group_14__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getGroup_14()); 

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
    // InternalT1.g:301:1: rule__Value__Group_3__0 : rule__Value__Group_3__0__Impl rule__Value__Group_3__1 ;
    public final void rule__Value__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:305:1: ( rule__Value__Group_3__0__Impl rule__Value__Group_3__1 )
            // InternalT1.g:306:2: rule__Value__Group_3__0__Impl rule__Value__Group_3__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalT1.g:313:1: rule__Value__Group_3__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Value__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:317:1: ( ( ( RULE_INT )? ) )
            // InternalT1.g:318:1: ( ( RULE_INT )? )
            {
            // InternalT1.g:318:1: ( ( RULE_INT )? )
            // InternalT1.g:319:2: ( RULE_INT )?
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_3_0()); 
            // InternalT1.g:320:2: ( RULE_INT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalT1.g:320:3: RULE_INT
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
    // InternalT1.g:328:1: rule__Value__Group_3__1 : rule__Value__Group_3__1__Impl rule__Value__Group_3__2 ;
    public final void rule__Value__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:332:1: ( rule__Value__Group_3__1__Impl rule__Value__Group_3__2 )
            // InternalT1.g:333:2: rule__Value__Group_3__1__Impl rule__Value__Group_3__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalT1.g:340:1: rule__Value__Group_3__1__Impl : ( '.' ) ;
    public final void rule__Value__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:344:1: ( ( '.' ) )
            // InternalT1.g:345:1: ( '.' )
            {
            // InternalT1.g:345:1: ( '.' )
            // InternalT1.g:346:2: '.'
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
    // InternalT1.g:355:1: rule__Value__Group_3__2 : rule__Value__Group_3__2__Impl ;
    public final void rule__Value__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:359:1: ( rule__Value__Group_3__2__Impl )
            // InternalT1.g:360:2: rule__Value__Group_3__2__Impl
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
    // InternalT1.g:366:1: rule__Value__Group_3__2__Impl : ( ( RULE_INT )* ) ;
    public final void rule__Value__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:370:1: ( ( ( RULE_INT )* ) )
            // InternalT1.g:371:1: ( ( RULE_INT )* )
            {
            // InternalT1.g:371:1: ( ( RULE_INT )* )
            // InternalT1.g:372:2: ( RULE_INT )*
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_3_2()); 
            // InternalT1.g:373:2: ( RULE_INT )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_INT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalT1.g:373:3: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_8); 

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalT1.g:382:1: rule__Value__Group_4__0 : rule__Value__Group_4__0__Impl rule__Value__Group_4__1 ;
    public final void rule__Value__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:386:1: ( rule__Value__Group_4__0__Impl rule__Value__Group_4__1 )
            // InternalT1.g:387:2: rule__Value__Group_4__0__Impl rule__Value__Group_4__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalT1.g:394:1: rule__Value__Group_4__0__Impl : ( RULE_INT ) ;
    public final void rule__Value__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:398:1: ( ( RULE_INT ) )
            // InternalT1.g:399:1: ( RULE_INT )
            {
            // InternalT1.g:399:1: ( RULE_INT )
            // InternalT1.g:400:2: RULE_INT
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
    // InternalT1.g:409:1: rule__Value__Group_4__1 : rule__Value__Group_4__1__Impl rule__Value__Group_4__2 ;
    public final void rule__Value__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:413:1: ( rule__Value__Group_4__1__Impl rule__Value__Group_4__2 )
            // InternalT1.g:414:2: rule__Value__Group_4__1__Impl rule__Value__Group_4__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalT1.g:421:1: rule__Value__Group_4__1__Impl : ( '+' ) ;
    public final void rule__Value__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:425:1: ( ( '+' ) )
            // InternalT1.g:426:1: ( '+' )
            {
            // InternalT1.g:426:1: ( '+' )
            // InternalT1.g:427:2: '+'
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
    // InternalT1.g:436:1: rule__Value__Group_4__2 : rule__Value__Group_4__2__Impl ;
    public final void rule__Value__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:440:1: ( rule__Value__Group_4__2__Impl )
            // InternalT1.g:441:2: rule__Value__Group_4__2__Impl
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
    // InternalT1.g:447:1: rule__Value__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__Value__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:451:1: ( ( RULE_INT ) )
            // InternalT1.g:452:1: ( RULE_INT )
            {
            // InternalT1.g:452:1: ( RULE_INT )
            // InternalT1.g:453:2: RULE_INT
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
    // InternalT1.g:463:1: rule__Value__Group_5__0 : rule__Value__Group_5__0__Impl rule__Value__Group_5__1 ;
    public final void rule__Value__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:467:1: ( rule__Value__Group_5__0__Impl rule__Value__Group_5__1 )
            // InternalT1.g:468:2: rule__Value__Group_5__0__Impl rule__Value__Group_5__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalT1.g:475:1: rule__Value__Group_5__0__Impl : ( RULE_INT ) ;
    public final void rule__Value__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:479:1: ( ( RULE_INT ) )
            // InternalT1.g:480:1: ( RULE_INT )
            {
            // InternalT1.g:480:1: ( RULE_INT )
            // InternalT1.g:481:2: RULE_INT
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
    // InternalT1.g:490:1: rule__Value__Group_5__1 : rule__Value__Group_5__1__Impl rule__Value__Group_5__2 ;
    public final void rule__Value__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:494:1: ( rule__Value__Group_5__1__Impl rule__Value__Group_5__2 )
            // InternalT1.g:495:2: rule__Value__Group_5__1__Impl rule__Value__Group_5__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalT1.g:502:1: rule__Value__Group_5__1__Impl : ( '+' ) ;
    public final void rule__Value__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:506:1: ( ( '+' ) )
            // InternalT1.g:507:1: ( '+' )
            {
            // InternalT1.g:507:1: ( '+' )
            // InternalT1.g:508:2: '+'
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
    // InternalT1.g:517:1: rule__Value__Group_5__2 : rule__Value__Group_5__2__Impl rule__Value__Group_5__3 ;
    public final void rule__Value__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:521:1: ( rule__Value__Group_5__2__Impl rule__Value__Group_5__3 )
            // InternalT1.g:522:2: rule__Value__Group_5__2__Impl rule__Value__Group_5__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalT1.g:529:1: rule__Value__Group_5__2__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Value__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:533:1: ( ( ( RULE_INT )? ) )
            // InternalT1.g:534:1: ( ( RULE_INT )? )
            {
            // InternalT1.g:534:1: ( ( RULE_INT )? )
            // InternalT1.g:535:2: ( RULE_INT )?
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_5_2()); 
            // InternalT1.g:536:2: ( RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalT1.g:536:3: RULE_INT
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
    // InternalT1.g:544:1: rule__Value__Group_5__3 : rule__Value__Group_5__3__Impl rule__Value__Group_5__4 ;
    public final void rule__Value__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:548:1: ( rule__Value__Group_5__3__Impl rule__Value__Group_5__4 )
            // InternalT1.g:549:2: rule__Value__Group_5__3__Impl rule__Value__Group_5__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalT1.g:556:1: rule__Value__Group_5__3__Impl : ( '.' ) ;
    public final void rule__Value__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:560:1: ( ( '.' ) )
            // InternalT1.g:561:1: ( '.' )
            {
            // InternalT1.g:561:1: ( '.' )
            // InternalT1.g:562:2: '.'
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
    // InternalT1.g:571:1: rule__Value__Group_5__4 : rule__Value__Group_5__4__Impl ;
    public final void rule__Value__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:575:1: ( rule__Value__Group_5__4__Impl )
            // InternalT1.g:576:2: rule__Value__Group_5__4__Impl
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
    // InternalT1.g:582:1: rule__Value__Group_5__4__Impl : ( ( RULE_INT )* ) ;
    public final void rule__Value__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:586:1: ( ( ( RULE_INT )* ) )
            // InternalT1.g:587:1: ( ( RULE_INT )* )
            {
            // InternalT1.g:587:1: ( ( RULE_INT )* )
            // InternalT1.g:588:2: ( RULE_INT )*
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_5_4()); 
            // InternalT1.g:589:2: ( RULE_INT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_INT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalT1.g:589:3: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_8); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalT1.g:598:1: rule__Value__Group_6__0 : rule__Value__Group_6__0__Impl rule__Value__Group_6__1 ;
    public final void rule__Value__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:602:1: ( rule__Value__Group_6__0__Impl rule__Value__Group_6__1 )
            // InternalT1.g:603:2: rule__Value__Group_6__0__Impl rule__Value__Group_6__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalT1.g:610:1: rule__Value__Group_6__0__Impl : ( RULE_INT ) ;
    public final void rule__Value__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:614:1: ( ( RULE_INT ) )
            // InternalT1.g:615:1: ( RULE_INT )
            {
            // InternalT1.g:615:1: ( RULE_INT )
            // InternalT1.g:616:2: RULE_INT
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
    // InternalT1.g:625:1: rule__Value__Group_6__1 : rule__Value__Group_6__1__Impl rule__Value__Group_6__2 ;
    public final void rule__Value__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:629:1: ( rule__Value__Group_6__1__Impl rule__Value__Group_6__2 )
            // InternalT1.g:630:2: rule__Value__Group_6__1__Impl rule__Value__Group_6__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalT1.g:637:1: rule__Value__Group_6__1__Impl : ( '+' ) ;
    public final void rule__Value__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:641:1: ( ( '+' ) )
            // InternalT1.g:642:1: ( '+' )
            {
            // InternalT1.g:642:1: ( '+' )
            // InternalT1.g:643:2: '+'
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
    // InternalT1.g:652:1: rule__Value__Group_6__2 : rule__Value__Group_6__2__Impl ;
    public final void rule__Value__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:656:1: ( rule__Value__Group_6__2__Impl )
            // InternalT1.g:657:2: rule__Value__Group_6__2__Impl
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
    // InternalT1.g:663:1: rule__Value__Group_6__2__Impl : ( ( RULE_INT )* ) ;
    public final void rule__Value__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:667:1: ( ( ( RULE_INT )* ) )
            // InternalT1.g:668:1: ( ( RULE_INT )* )
            {
            // InternalT1.g:668:1: ( ( RULE_INT )* )
            // InternalT1.g:669:2: ( RULE_INT )*
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_6_2()); 
            // InternalT1.g:670:2: ( RULE_INT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_INT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalT1.g:670:3: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_8); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalT1.g:679:1: rule__Value__Group_7__0 : rule__Value__Group_7__0__Impl rule__Value__Group_7__1 ;
    public final void rule__Value__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:683:1: ( rule__Value__Group_7__0__Impl rule__Value__Group_7__1 )
            // InternalT1.g:684:2: rule__Value__Group_7__0__Impl rule__Value__Group_7__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalT1.g:691:1: rule__Value__Group_7__0__Impl : ( RULE_INT ) ;
    public final void rule__Value__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:695:1: ( ( RULE_INT ) )
            // InternalT1.g:696:1: ( RULE_INT )
            {
            // InternalT1.g:696:1: ( RULE_INT )
            // InternalT1.g:697:2: RULE_INT
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
    // InternalT1.g:706:1: rule__Value__Group_7__1 : rule__Value__Group_7__1__Impl rule__Value__Group_7__2 ;
    public final void rule__Value__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:710:1: ( rule__Value__Group_7__1__Impl rule__Value__Group_7__2 )
            // InternalT1.g:711:2: rule__Value__Group_7__1__Impl rule__Value__Group_7__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalT1.g:718:1: rule__Value__Group_7__1__Impl : ( '-' ) ;
    public final void rule__Value__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:722:1: ( ( '-' ) )
            // InternalT1.g:723:1: ( '-' )
            {
            // InternalT1.g:723:1: ( '-' )
            // InternalT1.g:724:2: '-'
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
    // InternalT1.g:733:1: rule__Value__Group_7__2 : rule__Value__Group_7__2__Impl ;
    public final void rule__Value__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:737:1: ( rule__Value__Group_7__2__Impl )
            // InternalT1.g:738:2: rule__Value__Group_7__2__Impl
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
    // InternalT1.g:744:1: rule__Value__Group_7__2__Impl : ( RULE_INT ) ;
    public final void rule__Value__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:748:1: ( ( RULE_INT ) )
            // InternalT1.g:749:1: ( RULE_INT )
            {
            // InternalT1.g:749:1: ( RULE_INT )
            // InternalT1.g:750:2: RULE_INT
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
    // InternalT1.g:760:1: rule__Value__Group_8__0 : rule__Value__Group_8__0__Impl rule__Value__Group_8__1 ;
    public final void rule__Value__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:764:1: ( rule__Value__Group_8__0__Impl rule__Value__Group_8__1 )
            // InternalT1.g:765:2: rule__Value__Group_8__0__Impl rule__Value__Group_8__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalT1.g:772:1: rule__Value__Group_8__0__Impl : ( RULE_INT ) ;
    public final void rule__Value__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:776:1: ( ( RULE_INT ) )
            // InternalT1.g:777:1: ( RULE_INT )
            {
            // InternalT1.g:777:1: ( RULE_INT )
            // InternalT1.g:778:2: RULE_INT
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
    // InternalT1.g:787:1: rule__Value__Group_8__1 : rule__Value__Group_8__1__Impl rule__Value__Group_8__2 ;
    public final void rule__Value__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:791:1: ( rule__Value__Group_8__1__Impl rule__Value__Group_8__2 )
            // InternalT1.g:792:2: rule__Value__Group_8__1__Impl rule__Value__Group_8__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalT1.g:799:1: rule__Value__Group_8__1__Impl : ( '-' ) ;
    public final void rule__Value__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:803:1: ( ( '-' ) )
            // InternalT1.g:804:1: ( '-' )
            {
            // InternalT1.g:804:1: ( '-' )
            // InternalT1.g:805:2: '-'
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
    // InternalT1.g:814:1: rule__Value__Group_8__2 : rule__Value__Group_8__2__Impl rule__Value__Group_8__3 ;
    public final void rule__Value__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:818:1: ( rule__Value__Group_8__2__Impl rule__Value__Group_8__3 )
            // InternalT1.g:819:2: rule__Value__Group_8__2__Impl rule__Value__Group_8__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalT1.g:826:1: rule__Value__Group_8__2__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Value__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:830:1: ( ( ( RULE_INT )? ) )
            // InternalT1.g:831:1: ( ( RULE_INT )? )
            {
            // InternalT1.g:831:1: ( ( RULE_INT )? )
            // InternalT1.g:832:2: ( RULE_INT )?
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_8_2()); 
            // InternalT1.g:833:2: ( RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalT1.g:833:3: RULE_INT
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
    // InternalT1.g:841:1: rule__Value__Group_8__3 : rule__Value__Group_8__3__Impl rule__Value__Group_8__4 ;
    public final void rule__Value__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:845:1: ( rule__Value__Group_8__3__Impl rule__Value__Group_8__4 )
            // InternalT1.g:846:2: rule__Value__Group_8__3__Impl rule__Value__Group_8__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalT1.g:853:1: rule__Value__Group_8__3__Impl : ( '.' ) ;
    public final void rule__Value__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:857:1: ( ( '.' ) )
            // InternalT1.g:858:1: ( '.' )
            {
            // InternalT1.g:858:1: ( '.' )
            // InternalT1.g:859:2: '.'
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
    // InternalT1.g:868:1: rule__Value__Group_8__4 : rule__Value__Group_8__4__Impl ;
    public final void rule__Value__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:872:1: ( rule__Value__Group_8__4__Impl )
            // InternalT1.g:873:2: rule__Value__Group_8__4__Impl
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
    // InternalT1.g:879:1: rule__Value__Group_8__4__Impl : ( ( RULE_INT )* ) ;
    public final void rule__Value__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:883:1: ( ( ( RULE_INT )* ) )
            // InternalT1.g:884:1: ( ( RULE_INT )* )
            {
            // InternalT1.g:884:1: ( ( RULE_INT )* )
            // InternalT1.g:885:2: ( RULE_INT )*
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_8_4()); 
            // InternalT1.g:886:2: ( RULE_INT )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_INT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalT1.g:886:3: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_8); 

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalT1.g:895:1: rule__Value__Group_9__0 : rule__Value__Group_9__0__Impl rule__Value__Group_9__1 ;
    public final void rule__Value__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:899:1: ( rule__Value__Group_9__0__Impl rule__Value__Group_9__1 )
            // InternalT1.g:900:2: rule__Value__Group_9__0__Impl rule__Value__Group_9__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalT1.g:907:1: rule__Value__Group_9__0__Impl : ( RULE_INT ) ;
    public final void rule__Value__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:911:1: ( ( RULE_INT ) )
            // InternalT1.g:912:1: ( RULE_INT )
            {
            // InternalT1.g:912:1: ( RULE_INT )
            // InternalT1.g:913:2: RULE_INT
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
    // InternalT1.g:922:1: rule__Value__Group_9__1 : rule__Value__Group_9__1__Impl rule__Value__Group_9__2 ;
    public final void rule__Value__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:926:1: ( rule__Value__Group_9__1__Impl rule__Value__Group_9__2 )
            // InternalT1.g:927:2: rule__Value__Group_9__1__Impl rule__Value__Group_9__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalT1.g:934:1: rule__Value__Group_9__1__Impl : ( '-' ) ;
    public final void rule__Value__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:938:1: ( ( '-' ) )
            // InternalT1.g:939:1: ( '-' )
            {
            // InternalT1.g:939:1: ( '-' )
            // InternalT1.g:940:2: '-'
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
    // InternalT1.g:949:1: rule__Value__Group_9__2 : rule__Value__Group_9__2__Impl ;
    public final void rule__Value__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:953:1: ( rule__Value__Group_9__2__Impl )
            // InternalT1.g:954:2: rule__Value__Group_9__2__Impl
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
    // InternalT1.g:960:1: rule__Value__Group_9__2__Impl : ( ( RULE_INT )* ) ;
    public final void rule__Value__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:964:1: ( ( ( RULE_INT )* ) )
            // InternalT1.g:965:1: ( ( RULE_INT )* )
            {
            // InternalT1.g:965:1: ( ( RULE_INT )* )
            // InternalT1.g:966:2: ( RULE_INT )*
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_9_2()); 
            // InternalT1.g:967:2: ( RULE_INT )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_INT) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalT1.g:967:3: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_8); 

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalT1.g:976:1: rule__Value__Group_10__0 : rule__Value__Group_10__0__Impl rule__Value__Group_10__1 ;
    public final void rule__Value__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:980:1: ( rule__Value__Group_10__0__Impl rule__Value__Group_10__1 )
            // InternalT1.g:981:2: rule__Value__Group_10__0__Impl rule__Value__Group_10__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalT1.g:988:1: rule__Value__Group_10__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Value__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:992:1: ( ( ( RULE_INT )? ) )
            // InternalT1.g:993:1: ( ( RULE_INT )? )
            {
            // InternalT1.g:993:1: ( ( RULE_INT )? )
            // InternalT1.g:994:2: ( RULE_INT )?
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_10_0()); 
            // InternalT1.g:995:2: ( RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalT1.g:995:3: RULE_INT
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
    // InternalT1.g:1003:1: rule__Value__Group_10__1 : rule__Value__Group_10__1__Impl rule__Value__Group_10__2 ;
    public final void rule__Value__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1007:1: ( rule__Value__Group_10__1__Impl rule__Value__Group_10__2 )
            // InternalT1.g:1008:2: rule__Value__Group_10__1__Impl rule__Value__Group_10__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalT1.g:1015:1: rule__Value__Group_10__1__Impl : ( '.' ) ;
    public final void rule__Value__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1019:1: ( ( '.' ) )
            // InternalT1.g:1020:1: ( '.' )
            {
            // InternalT1.g:1020:1: ( '.' )
            // InternalT1.g:1021:2: '.'
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
    // InternalT1.g:1030:1: rule__Value__Group_10__2 : rule__Value__Group_10__2__Impl rule__Value__Group_10__3 ;
    public final void rule__Value__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1034:1: ( rule__Value__Group_10__2__Impl rule__Value__Group_10__3 )
            // InternalT1.g:1035:2: rule__Value__Group_10__2__Impl rule__Value__Group_10__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalT1.g:1042:1: rule__Value__Group_10__2__Impl : ( ( RULE_INT )* ) ;
    public final void rule__Value__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1046:1: ( ( ( RULE_INT )* ) )
            // InternalT1.g:1047:1: ( ( RULE_INT )* )
            {
            // InternalT1.g:1047:1: ( ( RULE_INT )* )
            // InternalT1.g:1048:2: ( RULE_INT )*
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_10_2()); 
            // InternalT1.g:1049:2: ( RULE_INT )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_INT) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalT1.g:1049:3: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_8); 

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalT1.g:1057:1: rule__Value__Group_10__3 : rule__Value__Group_10__3__Impl rule__Value__Group_10__4 ;
    public final void rule__Value__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1061:1: ( rule__Value__Group_10__3__Impl rule__Value__Group_10__4 )
            // InternalT1.g:1062:2: rule__Value__Group_10__3__Impl rule__Value__Group_10__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalT1.g:1069:1: rule__Value__Group_10__3__Impl : ( '+' ) ;
    public final void rule__Value__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1073:1: ( ( '+' ) )
            // InternalT1.g:1074:1: ( '+' )
            {
            // InternalT1.g:1074:1: ( '+' )
            // InternalT1.g:1075:2: '+'
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
    // InternalT1.g:1084:1: rule__Value__Group_10__4 : rule__Value__Group_10__4__Impl ;
    public final void rule__Value__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1088:1: ( rule__Value__Group_10__4__Impl )
            // InternalT1.g:1089:2: rule__Value__Group_10__4__Impl
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
    // InternalT1.g:1095:1: rule__Value__Group_10__4__Impl : ( RULE_INT ) ;
    public final void rule__Value__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1099:1: ( ( RULE_INT ) )
            // InternalT1.g:1100:1: ( RULE_INT )
            {
            // InternalT1.g:1100:1: ( RULE_INT )
            // InternalT1.g:1101:2: RULE_INT
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


    // $ANTLR start "rule__Value__Group_11__0"
    // InternalT1.g:1111:1: rule__Value__Group_11__0 : rule__Value__Group_11__0__Impl rule__Value__Group_11__1 ;
    public final void rule__Value__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1115:1: ( rule__Value__Group_11__0__Impl rule__Value__Group_11__1 )
            // InternalT1.g:1116:2: rule__Value__Group_11__0__Impl rule__Value__Group_11__1
            {
            pushFollow(FOLLOW_7);
            rule__Value__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_11__1();

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
    // $ANTLR end "rule__Value__Group_11__0"


    // $ANTLR start "rule__Value__Group_11__0__Impl"
    // InternalT1.g:1123:1: rule__Value__Group_11__0__Impl : ( '-' ) ;
    public final void rule__Value__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1127:1: ( ( '-' ) )
            // InternalT1.g:1128:1: ( '-' )
            {
            // InternalT1.g:1128:1: ( '-' )
            // InternalT1.g:1129:2: '-'
            {
             before(grammarAccess.getValueAccess().getHyphenMinusKeyword_11_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getHyphenMinusKeyword_11_0()); 

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
    // $ANTLR end "rule__Value__Group_11__0__Impl"


    // $ANTLR start "rule__Value__Group_11__1"
    // InternalT1.g:1138:1: rule__Value__Group_11__1 : rule__Value__Group_11__1__Impl ;
    public final void rule__Value__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1142:1: ( rule__Value__Group_11__1__Impl )
            // InternalT1.g:1143:2: rule__Value__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group_11__1__Impl();

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
    // $ANTLR end "rule__Value__Group_11__1"


    // $ANTLR start "rule__Value__Group_11__1__Impl"
    // InternalT1.g:1149:1: rule__Value__Group_11__1__Impl : ( ( RULE_INT )* ) ;
    public final void rule__Value__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1153:1: ( ( ( RULE_INT )* ) )
            // InternalT1.g:1154:1: ( ( RULE_INT )* )
            {
            // InternalT1.g:1154:1: ( ( RULE_INT )* )
            // InternalT1.g:1155:2: ( RULE_INT )*
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_11_1()); 
            // InternalT1.g:1156:2: ( RULE_INT )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_INT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalT1.g:1156:3: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_8); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getValueAccess().getINTTerminalRuleCall_11_1()); 

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
    // $ANTLR end "rule__Value__Group_11__1__Impl"


    // $ANTLR start "rule__Value__Group_12__0"
    // InternalT1.g:1165:1: rule__Value__Group_12__0 : rule__Value__Group_12__0__Impl rule__Value__Group_12__1 ;
    public final void rule__Value__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1169:1: ( rule__Value__Group_12__0__Impl rule__Value__Group_12__1 )
            // InternalT1.g:1170:2: rule__Value__Group_12__0__Impl rule__Value__Group_12__1
            {
            pushFollow(FOLLOW_7);
            rule__Value__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_12__1();

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
    // $ANTLR end "rule__Value__Group_12__0"


    // $ANTLR start "rule__Value__Group_12__0__Impl"
    // InternalT1.g:1177:1: rule__Value__Group_12__0__Impl : ( '-' ) ;
    public final void rule__Value__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1181:1: ( ( '-' ) )
            // InternalT1.g:1182:1: ( '-' )
            {
            // InternalT1.g:1182:1: ( '-' )
            // InternalT1.g:1183:2: '-'
            {
             before(grammarAccess.getValueAccess().getHyphenMinusKeyword_12_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getHyphenMinusKeyword_12_0()); 

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
    // $ANTLR end "rule__Value__Group_12__0__Impl"


    // $ANTLR start "rule__Value__Group_12__1"
    // InternalT1.g:1192:1: rule__Value__Group_12__1 : rule__Value__Group_12__1__Impl ;
    public final void rule__Value__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1196:1: ( rule__Value__Group_12__1__Impl )
            // InternalT1.g:1197:2: rule__Value__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group_12__1__Impl();

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
    // $ANTLR end "rule__Value__Group_12__1"


    // $ANTLR start "rule__Value__Group_12__1__Impl"
    // InternalT1.g:1203:1: rule__Value__Group_12__1__Impl : ( RULE_INT ) ;
    public final void rule__Value__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1207:1: ( ( RULE_INT ) )
            // InternalT1.g:1208:1: ( RULE_INT )
            {
            // InternalT1.g:1208:1: ( RULE_INT )
            // InternalT1.g:1209:2: RULE_INT
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_12_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getINTTerminalRuleCall_12_1()); 

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
    // $ANTLR end "rule__Value__Group_12__1__Impl"


    // $ANTLR start "rule__Value__Group_13__0"
    // InternalT1.g:1219:1: rule__Value__Group_13__0 : rule__Value__Group_13__0__Impl rule__Value__Group_13__1 ;
    public final void rule__Value__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1223:1: ( rule__Value__Group_13__0__Impl rule__Value__Group_13__1 )
            // InternalT1.g:1224:2: rule__Value__Group_13__0__Impl rule__Value__Group_13__1
            {
            pushFollow(FOLLOW_12);
            rule__Value__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_13__1();

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
    // $ANTLR end "rule__Value__Group_13__0"


    // $ANTLR start "rule__Value__Group_13__0__Impl"
    // InternalT1.g:1231:1: rule__Value__Group_13__0__Impl : ( '-' ) ;
    public final void rule__Value__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1235:1: ( ( '-' ) )
            // InternalT1.g:1236:1: ( '-' )
            {
            // InternalT1.g:1236:1: ( '-' )
            // InternalT1.g:1237:2: '-'
            {
             before(grammarAccess.getValueAccess().getHyphenMinusKeyword_13_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getHyphenMinusKeyword_13_0()); 

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
    // $ANTLR end "rule__Value__Group_13__0__Impl"


    // $ANTLR start "rule__Value__Group_13__1"
    // InternalT1.g:1246:1: rule__Value__Group_13__1 : rule__Value__Group_13__1__Impl rule__Value__Group_13__2 ;
    public final void rule__Value__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1250:1: ( rule__Value__Group_13__1__Impl rule__Value__Group_13__2 )
            // InternalT1.g:1251:2: rule__Value__Group_13__1__Impl rule__Value__Group_13__2
            {
            pushFollow(FOLLOW_12);
            rule__Value__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_13__2();

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
    // $ANTLR end "rule__Value__Group_13__1"


    // $ANTLR start "rule__Value__Group_13__1__Impl"
    // InternalT1.g:1258:1: rule__Value__Group_13__1__Impl : ( ( RULE_INT )* ) ;
    public final void rule__Value__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1262:1: ( ( ( RULE_INT )* ) )
            // InternalT1.g:1263:1: ( ( RULE_INT )* )
            {
            // InternalT1.g:1263:1: ( ( RULE_INT )* )
            // InternalT1.g:1264:2: ( RULE_INT )*
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_13_1()); 
            // InternalT1.g:1265:2: ( RULE_INT )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_INT) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalT1.g:1265:3: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_8); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getValueAccess().getINTTerminalRuleCall_13_1()); 

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
    // $ANTLR end "rule__Value__Group_13__1__Impl"


    // $ANTLR start "rule__Value__Group_13__2"
    // InternalT1.g:1273:1: rule__Value__Group_13__2 : rule__Value__Group_13__2__Impl rule__Value__Group_13__3 ;
    public final void rule__Value__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1277:1: ( rule__Value__Group_13__2__Impl rule__Value__Group_13__3 )
            // InternalT1.g:1278:2: rule__Value__Group_13__2__Impl rule__Value__Group_13__3
            {
            pushFollow(FOLLOW_10);
            rule__Value__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_13__3();

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
    // $ANTLR end "rule__Value__Group_13__2"


    // $ANTLR start "rule__Value__Group_13__2__Impl"
    // InternalT1.g:1285:1: rule__Value__Group_13__2__Impl : ( '+' ) ;
    public final void rule__Value__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1289:1: ( ( '+' ) )
            // InternalT1.g:1290:1: ( '+' )
            {
            // InternalT1.g:1290:1: ( '+' )
            // InternalT1.g:1291:2: '+'
            {
             before(grammarAccess.getValueAccess().getPlusSignKeyword_13_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getPlusSignKeyword_13_2()); 

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
    // $ANTLR end "rule__Value__Group_13__2__Impl"


    // $ANTLR start "rule__Value__Group_13__3"
    // InternalT1.g:1300:1: rule__Value__Group_13__3 : rule__Value__Group_13__3__Impl rule__Value__Group_13__4 ;
    public final void rule__Value__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1304:1: ( rule__Value__Group_13__3__Impl rule__Value__Group_13__4 )
            // InternalT1.g:1305:2: rule__Value__Group_13__3__Impl rule__Value__Group_13__4
            {
            pushFollow(FOLLOW_10);
            rule__Value__Group_13__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_13__4();

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
    // $ANTLR end "rule__Value__Group_13__3"


    // $ANTLR start "rule__Value__Group_13__3__Impl"
    // InternalT1.g:1312:1: rule__Value__Group_13__3__Impl : ( ( '.' )? ) ;
    public final void rule__Value__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1316:1: ( ( ( '.' )? ) )
            // InternalT1.g:1317:1: ( ( '.' )? )
            {
            // InternalT1.g:1317:1: ( ( '.' )? )
            // InternalT1.g:1318:2: ( '.' )?
            {
             before(grammarAccess.getValueAccess().getFullStopKeyword_13_3()); 
            // InternalT1.g:1319:2: ( '.' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==11) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalT1.g:1319:3: '.'
                    {
                    match(input,11,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getValueAccess().getFullStopKeyword_13_3()); 

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
    // $ANTLR end "rule__Value__Group_13__3__Impl"


    // $ANTLR start "rule__Value__Group_13__4"
    // InternalT1.g:1327:1: rule__Value__Group_13__4 : rule__Value__Group_13__4__Impl ;
    public final void rule__Value__Group_13__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1331:1: ( rule__Value__Group_13__4__Impl )
            // InternalT1.g:1332:2: rule__Value__Group_13__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group_13__4__Impl();

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
    // $ANTLR end "rule__Value__Group_13__4"


    // $ANTLR start "rule__Value__Group_13__4__Impl"
    // InternalT1.g:1338:1: rule__Value__Group_13__4__Impl : ( ( RULE_INT )* ) ;
    public final void rule__Value__Group_13__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1342:1: ( ( ( RULE_INT )* ) )
            // InternalT1.g:1343:1: ( ( RULE_INT )* )
            {
            // InternalT1.g:1343:1: ( ( RULE_INT )* )
            // InternalT1.g:1344:2: ( RULE_INT )*
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_13_4()); 
            // InternalT1.g:1345:2: ( RULE_INT )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_INT) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalT1.g:1345:3: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_8); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getValueAccess().getINTTerminalRuleCall_13_4()); 

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
    // $ANTLR end "rule__Value__Group_13__4__Impl"


    // $ANTLR start "rule__Value__Group_14__0"
    // InternalT1.g:1354:1: rule__Value__Group_14__0 : rule__Value__Group_14__0__Impl rule__Value__Group_14__1 ;
    public final void rule__Value__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1358:1: ( rule__Value__Group_14__0__Impl rule__Value__Group_14__1 )
            // InternalT1.g:1359:2: rule__Value__Group_14__0__Impl rule__Value__Group_14__1
            {
            pushFollow(FOLLOW_7);
            rule__Value__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_14__1();

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
    // $ANTLR end "rule__Value__Group_14__0"


    // $ANTLR start "rule__Value__Group_14__0__Impl"
    // InternalT1.g:1366:1: rule__Value__Group_14__0__Impl : ( '-' ) ;
    public final void rule__Value__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1370:1: ( ( '-' ) )
            // InternalT1.g:1371:1: ( '-' )
            {
            // InternalT1.g:1371:1: ( '-' )
            // InternalT1.g:1372:2: '-'
            {
             before(grammarAccess.getValueAccess().getHyphenMinusKeyword_14_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getHyphenMinusKeyword_14_0()); 

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
    // $ANTLR end "rule__Value__Group_14__0__Impl"


    // $ANTLR start "rule__Value__Group_14__1"
    // InternalT1.g:1381:1: rule__Value__Group_14__1 : rule__Value__Group_14__1__Impl rule__Value__Group_14__2 ;
    public final void rule__Value__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1385:1: ( rule__Value__Group_14__1__Impl rule__Value__Group_14__2 )
            // InternalT1.g:1386:2: rule__Value__Group_14__1__Impl rule__Value__Group_14__2
            {
            pushFollow(FOLLOW_11);
            rule__Value__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_14__2();

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
    // $ANTLR end "rule__Value__Group_14__1"


    // $ANTLR start "rule__Value__Group_14__1__Impl"
    // InternalT1.g:1393:1: rule__Value__Group_14__1__Impl : ( RULE_INT ) ;
    public final void rule__Value__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1397:1: ( ( RULE_INT ) )
            // InternalT1.g:1398:1: ( RULE_INT )
            {
            // InternalT1.g:1398:1: ( RULE_INT )
            // InternalT1.g:1399:2: RULE_INT
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_14_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getINTTerminalRuleCall_14_1()); 

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
    // $ANTLR end "rule__Value__Group_14__1__Impl"


    // $ANTLR start "rule__Value__Group_14__2"
    // InternalT1.g:1408:1: rule__Value__Group_14__2 : rule__Value__Group_14__2__Impl rule__Value__Group_14__3 ;
    public final void rule__Value__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1412:1: ( rule__Value__Group_14__2__Impl rule__Value__Group_14__3 )
            // InternalT1.g:1413:2: rule__Value__Group_14__2__Impl rule__Value__Group_14__3
            {
            pushFollow(FOLLOW_10);
            rule__Value__Group_14__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_14__3();

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
    // $ANTLR end "rule__Value__Group_14__2"


    // $ANTLR start "rule__Value__Group_14__2__Impl"
    // InternalT1.g:1420:1: rule__Value__Group_14__2__Impl : ( '-' ) ;
    public final void rule__Value__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1424:1: ( ( '-' ) )
            // InternalT1.g:1425:1: ( '-' )
            {
            // InternalT1.g:1425:1: ( '-' )
            // InternalT1.g:1426:2: '-'
            {
             before(grammarAccess.getValueAccess().getHyphenMinusKeyword_14_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getHyphenMinusKeyword_14_2()); 

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
    // $ANTLR end "rule__Value__Group_14__2__Impl"


    // $ANTLR start "rule__Value__Group_14__3"
    // InternalT1.g:1435:1: rule__Value__Group_14__3 : rule__Value__Group_14__3__Impl rule__Value__Group_14__4 ;
    public final void rule__Value__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1439:1: ( rule__Value__Group_14__3__Impl rule__Value__Group_14__4 )
            // InternalT1.g:1440:2: rule__Value__Group_14__3__Impl rule__Value__Group_14__4
            {
            pushFollow(FOLLOW_10);
            rule__Value__Group_14__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_14__4();

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
    // $ANTLR end "rule__Value__Group_14__3"


    // $ANTLR start "rule__Value__Group_14__3__Impl"
    // InternalT1.g:1447:1: rule__Value__Group_14__3__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Value__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1451:1: ( ( ( RULE_INT )? ) )
            // InternalT1.g:1452:1: ( ( RULE_INT )? )
            {
            // InternalT1.g:1452:1: ( ( RULE_INT )? )
            // InternalT1.g:1453:2: ( RULE_INT )?
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_14_3()); 
            // InternalT1.g:1454:2: ( RULE_INT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalT1.g:1454:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getValueAccess().getINTTerminalRuleCall_14_3()); 

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
    // $ANTLR end "rule__Value__Group_14__3__Impl"


    // $ANTLR start "rule__Value__Group_14__4"
    // InternalT1.g:1462:1: rule__Value__Group_14__4 : rule__Value__Group_14__4__Impl rule__Value__Group_14__5 ;
    public final void rule__Value__Group_14__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1466:1: ( rule__Value__Group_14__4__Impl rule__Value__Group_14__5 )
            // InternalT1.g:1467:2: rule__Value__Group_14__4__Impl rule__Value__Group_14__5
            {
            pushFollow(FOLLOW_7);
            rule__Value__Group_14__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_14__5();

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
    // $ANTLR end "rule__Value__Group_14__4"


    // $ANTLR start "rule__Value__Group_14__4__Impl"
    // InternalT1.g:1474:1: rule__Value__Group_14__4__Impl : ( '.' ) ;
    public final void rule__Value__Group_14__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1478:1: ( ( '.' ) )
            // InternalT1.g:1479:1: ( '.' )
            {
            // InternalT1.g:1479:1: ( '.' )
            // InternalT1.g:1480:2: '.'
            {
             before(grammarAccess.getValueAccess().getFullStopKeyword_14_4()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getFullStopKeyword_14_4()); 

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
    // $ANTLR end "rule__Value__Group_14__4__Impl"


    // $ANTLR start "rule__Value__Group_14__5"
    // InternalT1.g:1489:1: rule__Value__Group_14__5 : rule__Value__Group_14__5__Impl ;
    public final void rule__Value__Group_14__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1493:1: ( rule__Value__Group_14__5__Impl )
            // InternalT1.g:1494:2: rule__Value__Group_14__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group_14__5__Impl();

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
    // $ANTLR end "rule__Value__Group_14__5"


    // $ANTLR start "rule__Value__Group_14__5__Impl"
    // InternalT1.g:1500:1: rule__Value__Group_14__5__Impl : ( ( RULE_INT )* ) ;
    public final void rule__Value__Group_14__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1504:1: ( ( ( RULE_INT )* ) )
            // InternalT1.g:1505:1: ( ( RULE_INT )* )
            {
            // InternalT1.g:1505:1: ( ( RULE_INT )* )
            // InternalT1.g:1506:2: ( RULE_INT )*
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_14_5()); 
            // InternalT1.g:1507:2: ( RULE_INT )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_INT) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalT1.g:1507:3: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_8); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getValueAccess().getINTTerminalRuleCall_14_5()); 

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
    // $ANTLR end "rule__Value__Group_14__5__Impl"


    // $ANTLR start "rule__Attribution__Group__0"
    // InternalT1.g:1516:1: rule__Attribution__Group__0 : rule__Attribution__Group__0__Impl rule__Attribution__Group__1 ;
    public final void rule__Attribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1520:1: ( rule__Attribution__Group__0__Impl rule__Attribution__Group__1 )
            // InternalT1.g:1521:2: rule__Attribution__Group__0__Impl rule__Attribution__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalT1.g:1528:1: rule__Attribution__Group__0__Impl : ( '=' ) ;
    public final void rule__Attribution__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1532:1: ( ( '=' ) )
            // InternalT1.g:1533:1: ( '=' )
            {
            // InternalT1.g:1533:1: ( '=' )
            // InternalT1.g:1534:2: '='
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
    // InternalT1.g:1543:1: rule__Attribution__Group__1 : rule__Attribution__Group__1__Impl ;
    public final void rule__Attribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1547:1: ( rule__Attribution__Group__1__Impl )
            // InternalT1.g:1548:2: rule__Attribution__Group__1__Impl
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
    // InternalT1.g:1554:1: rule__Attribution__Group__1__Impl : ( ruleValue ) ;
    public final void rule__Attribution__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1558:1: ( ( ruleValue ) )
            // InternalT1.g:1559:1: ( ruleValue )
            {
            // InternalT1.g:1559:1: ( ruleValue )
            // InternalT1.g:1560:2: ruleValue
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
    // InternalT1.g:1570:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1574:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // InternalT1.g:1575:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalT1.g:1582:1: rule__Declaration__Group__0__Impl : ( ruleName ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1586:1: ( ( ruleName ) )
            // InternalT1.g:1587:1: ( ruleName )
            {
            // InternalT1.g:1587:1: ( ruleName )
            // InternalT1.g:1588:2: ruleName
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
    // InternalT1.g:1597:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1601:1: ( rule__Declaration__Group__1__Impl )
            // InternalT1.g:1602:2: rule__Declaration__Group__1__Impl
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
    // InternalT1.g:1608:1: rule__Declaration__Group__1__Impl : ( ruleAttribution ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1612:1: ( ( ruleAttribution ) )
            // InternalT1.g:1613:1: ( ruleAttribution )
            {
            // InternalT1.g:1613:1: ( ruleAttribution )
            // InternalT1.g:1614:2: ruleAttribution
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
    // InternalT1.g:1624:1: rule__Var__Group__0 : rule__Var__Group__0__Impl rule__Var__Group__1 ;
    public final void rule__Var__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1628:1: ( rule__Var__Group__0__Impl rule__Var__Group__1 )
            // InternalT1.g:1629:2: rule__Var__Group__0__Impl rule__Var__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalT1.g:1636:1: rule__Var__Group__0__Impl : ( 'var' ) ;
    public final void rule__Var__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1640:1: ( ( 'var' ) )
            // InternalT1.g:1641:1: ( 'var' )
            {
            // InternalT1.g:1641:1: ( 'var' )
            // InternalT1.g:1642:2: 'var'
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
    // InternalT1.g:1651:1: rule__Var__Group__1 : rule__Var__Group__1__Impl rule__Var__Group__2 ;
    public final void rule__Var__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1655:1: ( rule__Var__Group__1__Impl rule__Var__Group__2 )
            // InternalT1.g:1656:2: rule__Var__Group__1__Impl rule__Var__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalT1.g:1663:1: rule__Var__Group__1__Impl : ( ( rule__Var__DeclarationsAssignment_1 ) ) ;
    public final void rule__Var__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1667:1: ( ( ( rule__Var__DeclarationsAssignment_1 ) ) )
            // InternalT1.g:1668:1: ( ( rule__Var__DeclarationsAssignment_1 ) )
            {
            // InternalT1.g:1668:1: ( ( rule__Var__DeclarationsAssignment_1 ) )
            // InternalT1.g:1669:2: ( rule__Var__DeclarationsAssignment_1 )
            {
             before(grammarAccess.getVarAccess().getDeclarationsAssignment_1()); 
            // InternalT1.g:1670:2: ( rule__Var__DeclarationsAssignment_1 )
            // InternalT1.g:1670:3: rule__Var__DeclarationsAssignment_1
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
    // InternalT1.g:1678:1: rule__Var__Group__2 : rule__Var__Group__2__Impl rule__Var__Group__3 ;
    public final void rule__Var__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1682:1: ( rule__Var__Group__2__Impl rule__Var__Group__3 )
            // InternalT1.g:1683:2: rule__Var__Group__2__Impl rule__Var__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalT1.g:1690:1: rule__Var__Group__2__Impl : ( ( rule__Var__Group_2__0 )* ) ;
    public final void rule__Var__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1694:1: ( ( ( rule__Var__Group_2__0 )* ) )
            // InternalT1.g:1695:1: ( ( rule__Var__Group_2__0 )* )
            {
            // InternalT1.g:1695:1: ( ( rule__Var__Group_2__0 )* )
            // InternalT1.g:1696:2: ( rule__Var__Group_2__0 )*
            {
             before(grammarAccess.getVarAccess().getGroup_2()); 
            // InternalT1.g:1697:2: ( rule__Var__Group_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==17) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalT1.g:1697:3: rule__Var__Group_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Var__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalT1.g:1705:1: rule__Var__Group__3 : rule__Var__Group__3__Impl ;
    public final void rule__Var__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1709:1: ( rule__Var__Group__3__Impl )
            // InternalT1.g:1710:2: rule__Var__Group__3__Impl
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
    // InternalT1.g:1716:1: rule__Var__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__Var__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1720:1: ( ( ( ';' )? ) )
            // InternalT1.g:1721:1: ( ( ';' )? )
            {
            // InternalT1.g:1721:1: ( ( ';' )? )
            // InternalT1.g:1722:2: ( ';' )?
            {
             before(grammarAccess.getVarAccess().getSemicolonKeyword_3()); 
            // InternalT1.g:1723:2: ( ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==16) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalT1.g:1723:3: ';'
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
    // InternalT1.g:1732:1: rule__Var__Group_2__0 : rule__Var__Group_2__0__Impl rule__Var__Group_2__1 ;
    public final void rule__Var__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1736:1: ( rule__Var__Group_2__0__Impl rule__Var__Group_2__1 )
            // InternalT1.g:1737:2: rule__Var__Group_2__0__Impl rule__Var__Group_2__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalT1.g:1744:1: rule__Var__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Var__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1748:1: ( ( ',' ) )
            // InternalT1.g:1749:1: ( ',' )
            {
            // InternalT1.g:1749:1: ( ',' )
            // InternalT1.g:1750:2: ','
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
    // InternalT1.g:1759:1: rule__Var__Group_2__1 : rule__Var__Group_2__1__Impl ;
    public final void rule__Var__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1763:1: ( rule__Var__Group_2__1__Impl )
            // InternalT1.g:1764:2: rule__Var__Group_2__1__Impl
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
    // InternalT1.g:1770:1: rule__Var__Group_2__1__Impl : ( ( rule__Var__DeclarationsAssignment_2_1 ) ) ;
    public final void rule__Var__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1774:1: ( ( ( rule__Var__DeclarationsAssignment_2_1 ) ) )
            // InternalT1.g:1775:1: ( ( rule__Var__DeclarationsAssignment_2_1 ) )
            {
            // InternalT1.g:1775:1: ( ( rule__Var__DeclarationsAssignment_2_1 ) )
            // InternalT1.g:1776:2: ( rule__Var__DeclarationsAssignment_2_1 )
            {
             before(grammarAccess.getVarAccess().getDeclarationsAssignment_2_1()); 
            // InternalT1.g:1777:2: ( rule__Var__DeclarationsAssignment_2_1 )
            // InternalT1.g:1777:3: rule__Var__DeclarationsAssignment_2_1
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
    // InternalT1.g:1786:1: rule__Model__VarsAssignment : ( ruleVar ) ;
    public final void rule__Model__VarsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1790:1: ( ( ruleVar ) )
            // InternalT1.g:1791:2: ( ruleVar )
            {
            // InternalT1.g:1791:2: ( ruleVar )
            // InternalT1.g:1792:3: ruleVar
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
    // InternalT1.g:1801:1: rule__Var__DeclarationsAssignment_1 : ( ruleDeclaration ) ;
    public final void rule__Var__DeclarationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1805:1: ( ( ruleDeclaration ) )
            // InternalT1.g:1806:2: ( ruleDeclaration )
            {
            // InternalT1.g:1806:2: ( ruleDeclaration )
            // InternalT1.g:1807:3: ruleDeclaration
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
    // InternalT1.g:1816:1: rule__Var__DeclarationsAssignment_2_1 : ( ruleDeclaration ) ;
    public final void rule__Var__DeclarationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:1820:1: ( ( ruleDeclaration ) )
            // InternalT1.g:1821:2: ( ruleDeclaration )
            {
            // InternalT1.g:1821:2: ( ruleDeclaration )
            // InternalT1.g:1822:3: ruleDeclaration
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


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\32\uffff";
    static final String dfa_2s = "\1\6\2\uffff\1\10\1\14\1\17\1\uffff\1\21\1\uffff\1\24\1\14\2\uffff\1\17\2\uffff\1\30\2\uffff\1\31\2\uffff\1\17\3\uffff";
    static final String dfa_3s = "\1\4\2\uffff\1\13\2\6\1\uffff\1\6\1\uffff\2\6\2\uffff\1\6\2\uffff\1\13\2\uffff\1\13\2\uffff\1\6\3\uffff";
    static final String dfa_4s = "\1\21\2\uffff\3\21\1\uffff\1\21\1\uffff\2\21\2\uffff\1\21\2\uffff\1\21\2\uffff\1\21\2\uffff\1\21\3\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\3\uffff\1\15\1\uffff\1\3\2\uffff\1\13\1\4\1\uffff\1\16\1\14\1\uffff\1\12\1\11\1\uffff\1\7\1\6\1\uffff\1\17\1\10\1\5";
    static final String dfa_6s = "\32\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\4\uffff\1\4\1\uffff\1\5\4\6",
            "",
            "",
            "\1\4\1\11\1\7\4\10",
            "\1\12\5\uffff\1\13\1\uffff\4\14",
            "\1\15\5\uffff\1\16\1\uffff\4\17",
            "",
            "\1\20\4\uffff\1\22\2\uffff\4\21",
            "",
            "\1\23\4\uffff\1\25\2\uffff\4\24",
            "\1\12\5\uffff\1\13\1\uffff\4\14",
            "",
            "",
            "\1\26\5\uffff\1\16\1\27\4\17",
            "",
            "",
            "\1\22\2\uffff\4\30",
            "",
            "",
            "\1\25\2\uffff\4\31",
            "",
            "",
            "\1\26\5\uffff\1\16\1\uffff\4\17",
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "202:1: rule__Value__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( ( rule__Value__Group_3__0 ) ) | ( ( rule__Value__Group_4__0 ) ) | ( ( rule__Value__Group_5__0 ) ) | ( ( rule__Value__Group_6__0 ) ) | ( ( rule__Value__Group_7__0 ) ) | ( ( rule__Value__Group_8__0 ) ) | ( ( rule__Value__Group_9__0 ) ) | ( ( rule__Value__Group_10__0 ) ) | ( ( rule__Value__Group_11__0 ) ) | ( ( rule__Value__Group_12__0 )* ) | ( ( rule__Value__Group_13__0 ) ) | ( ( rule__Value__Group_14__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002870L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020002L});

}