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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'='", "'var'", "';'", "','"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
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

                if ( (LA1_0==13) ) {
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

                if ( (LA2_0==12) ) {
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
    // InternalT1.g:202:1: rule__Value__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( ( rule__Value__Group_3__0 ) ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:206:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( ( rule__Value__Group_3__0 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case RULE_STRING:
                {
                alt3=2;
                }
                break;
            case RULE_INT:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==11) ) {
                    alt3=4;
                }
                else if ( (LA3_3==EOF||(LA3_3>=12 && LA3_3<=15)) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 11:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

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

            }
        }
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
    // InternalT1.g:235:1: rule__Value__Group_3__0 : rule__Value__Group_3__0__Impl rule__Value__Group_3__1 ;
    public final void rule__Value__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:239:1: ( rule__Value__Group_3__0__Impl rule__Value__Group_3__1 )
            // InternalT1.g:240:2: rule__Value__Group_3__0__Impl rule__Value__Group_3__1
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
    // InternalT1.g:247:1: rule__Value__Group_3__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Value__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:251:1: ( ( ( RULE_INT )? ) )
            // InternalT1.g:252:1: ( ( RULE_INT )? )
            {
            // InternalT1.g:252:1: ( ( RULE_INT )? )
            // InternalT1.g:253:2: ( RULE_INT )?
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_3_0()); 
            // InternalT1.g:254:2: ( RULE_INT )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalT1.g:254:3: RULE_INT
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
    // InternalT1.g:262:1: rule__Value__Group_3__1 : rule__Value__Group_3__1__Impl rule__Value__Group_3__2 ;
    public final void rule__Value__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:266:1: ( rule__Value__Group_3__1__Impl rule__Value__Group_3__2 )
            // InternalT1.g:267:2: rule__Value__Group_3__1__Impl rule__Value__Group_3__2
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
    // InternalT1.g:274:1: rule__Value__Group_3__1__Impl : ( '.' ) ;
    public final void rule__Value__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:278:1: ( ( '.' ) )
            // InternalT1.g:279:1: ( '.' )
            {
            // InternalT1.g:279:1: ( '.' )
            // InternalT1.g:280:2: '.'
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
    // InternalT1.g:289:1: rule__Value__Group_3__2 : rule__Value__Group_3__2__Impl ;
    public final void rule__Value__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:293:1: ( rule__Value__Group_3__2__Impl )
            // InternalT1.g:294:2: rule__Value__Group_3__2__Impl
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
    // InternalT1.g:300:1: rule__Value__Group_3__2__Impl : ( ( RULE_INT )* ) ;
    public final void rule__Value__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:304:1: ( ( ( RULE_INT )* ) )
            // InternalT1.g:305:1: ( ( RULE_INT )* )
            {
            // InternalT1.g:305:1: ( ( RULE_INT )* )
            // InternalT1.g:306:2: ( RULE_INT )*
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_3_2()); 
            // InternalT1.g:307:2: ( RULE_INT )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_INT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalT1.g:307:3: RULE_INT
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


    // $ANTLR start "rule__Attribution__Group__0"
    // InternalT1.g:316:1: rule__Attribution__Group__0 : rule__Attribution__Group__0__Impl rule__Attribution__Group__1 ;
    public final void rule__Attribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:320:1: ( rule__Attribution__Group__0__Impl rule__Attribution__Group__1 )
            // InternalT1.g:321:2: rule__Attribution__Group__0__Impl rule__Attribution__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalT1.g:328:1: rule__Attribution__Group__0__Impl : ( '=' ) ;
    public final void rule__Attribution__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:332:1: ( ( '=' ) )
            // InternalT1.g:333:1: ( '=' )
            {
            // InternalT1.g:333:1: ( '=' )
            // InternalT1.g:334:2: '='
            {
             before(grammarAccess.getAttributionAccess().getEqualsSignKeyword_0()); 
            match(input,12,FOLLOW_2); 
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
    // InternalT1.g:343:1: rule__Attribution__Group__1 : rule__Attribution__Group__1__Impl ;
    public final void rule__Attribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:347:1: ( rule__Attribution__Group__1__Impl )
            // InternalT1.g:348:2: rule__Attribution__Group__1__Impl
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
    // InternalT1.g:354:1: rule__Attribution__Group__1__Impl : ( ruleValue ) ;
    public final void rule__Attribution__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:358:1: ( ( ruleValue ) )
            // InternalT1.g:359:1: ( ruleValue )
            {
            // InternalT1.g:359:1: ( ruleValue )
            // InternalT1.g:360:2: ruleValue
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
    // InternalT1.g:370:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:374:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // InternalT1.g:375:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalT1.g:382:1: rule__Declaration__Group__0__Impl : ( ruleName ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:386:1: ( ( ruleName ) )
            // InternalT1.g:387:1: ( ruleName )
            {
            // InternalT1.g:387:1: ( ruleName )
            // InternalT1.g:388:2: ruleName
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
    // InternalT1.g:397:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:401:1: ( rule__Declaration__Group__1__Impl )
            // InternalT1.g:402:2: rule__Declaration__Group__1__Impl
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
    // InternalT1.g:408:1: rule__Declaration__Group__1__Impl : ( ruleAttribution ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:412:1: ( ( ruleAttribution ) )
            // InternalT1.g:413:1: ( ruleAttribution )
            {
            // InternalT1.g:413:1: ( ruleAttribution )
            // InternalT1.g:414:2: ruleAttribution
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
    // InternalT1.g:424:1: rule__Var__Group__0 : rule__Var__Group__0__Impl rule__Var__Group__1 ;
    public final void rule__Var__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:428:1: ( rule__Var__Group__0__Impl rule__Var__Group__1 )
            // InternalT1.g:429:2: rule__Var__Group__0__Impl rule__Var__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalT1.g:436:1: rule__Var__Group__0__Impl : ( 'var' ) ;
    public final void rule__Var__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:440:1: ( ( 'var' ) )
            // InternalT1.g:441:1: ( 'var' )
            {
            // InternalT1.g:441:1: ( 'var' )
            // InternalT1.g:442:2: 'var'
            {
             before(grammarAccess.getVarAccess().getVarKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalT1.g:451:1: rule__Var__Group__1 : rule__Var__Group__1__Impl rule__Var__Group__2 ;
    public final void rule__Var__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:455:1: ( rule__Var__Group__1__Impl rule__Var__Group__2 )
            // InternalT1.g:456:2: rule__Var__Group__1__Impl rule__Var__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalT1.g:463:1: rule__Var__Group__1__Impl : ( ( rule__Var__DeclarationsAssignment_1 ) ) ;
    public final void rule__Var__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:467:1: ( ( ( rule__Var__DeclarationsAssignment_1 ) ) )
            // InternalT1.g:468:1: ( ( rule__Var__DeclarationsAssignment_1 ) )
            {
            // InternalT1.g:468:1: ( ( rule__Var__DeclarationsAssignment_1 ) )
            // InternalT1.g:469:2: ( rule__Var__DeclarationsAssignment_1 )
            {
             before(grammarAccess.getVarAccess().getDeclarationsAssignment_1()); 
            // InternalT1.g:470:2: ( rule__Var__DeclarationsAssignment_1 )
            // InternalT1.g:470:3: rule__Var__DeclarationsAssignment_1
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
    // InternalT1.g:478:1: rule__Var__Group__2 : rule__Var__Group__2__Impl rule__Var__Group__3 ;
    public final void rule__Var__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:482:1: ( rule__Var__Group__2__Impl rule__Var__Group__3 )
            // InternalT1.g:483:2: rule__Var__Group__2__Impl rule__Var__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalT1.g:490:1: rule__Var__Group__2__Impl : ( ( rule__Var__Group_2__0 )* ) ;
    public final void rule__Var__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:494:1: ( ( ( rule__Var__Group_2__0 )* ) )
            // InternalT1.g:495:1: ( ( rule__Var__Group_2__0 )* )
            {
            // InternalT1.g:495:1: ( ( rule__Var__Group_2__0 )* )
            // InternalT1.g:496:2: ( rule__Var__Group_2__0 )*
            {
             before(grammarAccess.getVarAccess().getGroup_2()); 
            // InternalT1.g:497:2: ( rule__Var__Group_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalT1.g:497:3: rule__Var__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Var__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalT1.g:505:1: rule__Var__Group__3 : rule__Var__Group__3__Impl ;
    public final void rule__Var__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:509:1: ( rule__Var__Group__3__Impl )
            // InternalT1.g:510:2: rule__Var__Group__3__Impl
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
    // InternalT1.g:516:1: rule__Var__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__Var__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:520:1: ( ( ( ';' )? ) )
            // InternalT1.g:521:1: ( ( ';' )? )
            {
            // InternalT1.g:521:1: ( ( ';' )? )
            // InternalT1.g:522:2: ( ';' )?
            {
             before(grammarAccess.getVarAccess().getSemicolonKeyword_3()); 
            // InternalT1.g:523:2: ( ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalT1.g:523:3: ';'
                    {
                    match(input,14,FOLLOW_2); 

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
    // InternalT1.g:532:1: rule__Var__Group_2__0 : rule__Var__Group_2__0__Impl rule__Var__Group_2__1 ;
    public final void rule__Var__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:536:1: ( rule__Var__Group_2__0__Impl rule__Var__Group_2__1 )
            // InternalT1.g:537:2: rule__Var__Group_2__0__Impl rule__Var__Group_2__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalT1.g:544:1: rule__Var__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Var__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:548:1: ( ( ',' ) )
            // InternalT1.g:549:1: ( ',' )
            {
            // InternalT1.g:549:1: ( ',' )
            // InternalT1.g:550:2: ','
            {
             before(grammarAccess.getVarAccess().getCommaKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalT1.g:559:1: rule__Var__Group_2__1 : rule__Var__Group_2__1__Impl ;
    public final void rule__Var__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:563:1: ( rule__Var__Group_2__1__Impl )
            // InternalT1.g:564:2: rule__Var__Group_2__1__Impl
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
    // InternalT1.g:570:1: rule__Var__Group_2__1__Impl : ( ( rule__Var__DeclarationsAssignment_2_1 ) ) ;
    public final void rule__Var__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:574:1: ( ( ( rule__Var__DeclarationsAssignment_2_1 ) ) )
            // InternalT1.g:575:1: ( ( rule__Var__DeclarationsAssignment_2_1 ) )
            {
            // InternalT1.g:575:1: ( ( rule__Var__DeclarationsAssignment_2_1 ) )
            // InternalT1.g:576:2: ( rule__Var__DeclarationsAssignment_2_1 )
            {
             before(grammarAccess.getVarAccess().getDeclarationsAssignment_2_1()); 
            // InternalT1.g:577:2: ( rule__Var__DeclarationsAssignment_2_1 )
            // InternalT1.g:577:3: rule__Var__DeclarationsAssignment_2_1
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
    // InternalT1.g:586:1: rule__Model__VarsAssignment : ( ruleVar ) ;
    public final void rule__Model__VarsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:590:1: ( ( ruleVar ) )
            // InternalT1.g:591:2: ( ruleVar )
            {
            // InternalT1.g:591:2: ( ruleVar )
            // InternalT1.g:592:3: ruleVar
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
    // InternalT1.g:601:1: rule__Var__DeclarationsAssignment_1 : ( ruleDeclaration ) ;
    public final void rule__Var__DeclarationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:605:1: ( ( ruleDeclaration ) )
            // InternalT1.g:606:2: ( ruleDeclaration )
            {
            // InternalT1.g:606:2: ( ruleDeclaration )
            // InternalT1.g:607:3: ruleDeclaration
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
    // InternalT1.g:616:1: rule__Var__DeclarationsAssignment_2_1 : ( ruleDeclaration ) ;
    public final void rule__Var__DeclarationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:620:1: ( ( ruleDeclaration ) )
            // InternalT1.g:621:2: ( ruleDeclaration )
            {
            // InternalT1.g:621:2: ( ruleDeclaration )
            // InternalT1.g:622:3: ruleDeclaration
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000870L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008002L});

}