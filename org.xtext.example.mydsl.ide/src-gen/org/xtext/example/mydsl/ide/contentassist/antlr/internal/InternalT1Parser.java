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
    // InternalT1.g:202:1: rule__Value__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( ( rule__Value__Group_3__0 ) ) | ( ( rule__Value__Group_4__0 ) ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:206:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( ( rule__Value__Group_3__0 ) ) | ( ( rule__Value__Group_4__0 ) ) )
            int alt3=5;
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
                switch ( input.LA(2) ) {
                case EOF:
                case 13:
                case 14:
                case 15:
                case 16:
                    {
                    alt3=3;
                    }
                    break;
                case 11:
                    {
                    alt3=4;
                    }
                    break;
                case 12:
                    {
                    alt3=5;
                    }
                    break;
                default:
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

            }
        }
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
    // InternalT1.g:241:1: rule__Value__Group_3__0 : rule__Value__Group_3__0__Impl rule__Value__Group_3__1 ;
    public final void rule__Value__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:245:1: ( rule__Value__Group_3__0__Impl rule__Value__Group_3__1 )
            // InternalT1.g:246:2: rule__Value__Group_3__0__Impl rule__Value__Group_3__1
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
    // InternalT1.g:253:1: rule__Value__Group_3__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Value__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:257:1: ( ( ( RULE_INT )? ) )
            // InternalT1.g:258:1: ( ( RULE_INT )? )
            {
            // InternalT1.g:258:1: ( ( RULE_INT )? )
            // InternalT1.g:259:2: ( RULE_INT )?
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_3_0()); 
            // InternalT1.g:260:2: ( RULE_INT )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalT1.g:260:3: RULE_INT
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
    // InternalT1.g:268:1: rule__Value__Group_3__1 : rule__Value__Group_3__1__Impl rule__Value__Group_3__2 ;
    public final void rule__Value__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:272:1: ( rule__Value__Group_3__1__Impl rule__Value__Group_3__2 )
            // InternalT1.g:273:2: rule__Value__Group_3__1__Impl rule__Value__Group_3__2
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
    // InternalT1.g:280:1: rule__Value__Group_3__1__Impl : ( '.' ) ;
    public final void rule__Value__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:284:1: ( ( '.' ) )
            // InternalT1.g:285:1: ( '.' )
            {
            // InternalT1.g:285:1: ( '.' )
            // InternalT1.g:286:2: '.'
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
    // InternalT1.g:295:1: rule__Value__Group_3__2 : rule__Value__Group_3__2__Impl ;
    public final void rule__Value__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:299:1: ( rule__Value__Group_3__2__Impl )
            // InternalT1.g:300:2: rule__Value__Group_3__2__Impl
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
    // InternalT1.g:306:1: rule__Value__Group_3__2__Impl : ( ( RULE_INT )* ) ;
    public final void rule__Value__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:310:1: ( ( ( RULE_INT )* ) )
            // InternalT1.g:311:1: ( ( RULE_INT )* )
            {
            // InternalT1.g:311:1: ( ( RULE_INT )* )
            // InternalT1.g:312:2: ( RULE_INT )*
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_3_2()); 
            // InternalT1.g:313:2: ( RULE_INT )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_INT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalT1.g:313:3: RULE_INT
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
    // InternalT1.g:322:1: rule__Value__Group_4__0 : rule__Value__Group_4__0__Impl rule__Value__Group_4__1 ;
    public final void rule__Value__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:326:1: ( rule__Value__Group_4__0__Impl rule__Value__Group_4__1 )
            // InternalT1.g:327:2: rule__Value__Group_4__0__Impl rule__Value__Group_4__1
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
    // InternalT1.g:334:1: rule__Value__Group_4__0__Impl : ( RULE_INT ) ;
    public final void rule__Value__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:338:1: ( ( RULE_INT ) )
            // InternalT1.g:339:1: ( RULE_INT )
            {
            // InternalT1.g:339:1: ( RULE_INT )
            // InternalT1.g:340:2: RULE_INT
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
    // InternalT1.g:349:1: rule__Value__Group_4__1 : rule__Value__Group_4__1__Impl rule__Value__Group_4__2 ;
    public final void rule__Value__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:353:1: ( rule__Value__Group_4__1__Impl rule__Value__Group_4__2 )
            // InternalT1.g:354:2: rule__Value__Group_4__1__Impl rule__Value__Group_4__2
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
    // InternalT1.g:361:1: rule__Value__Group_4__1__Impl : ( '+' ) ;
    public final void rule__Value__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:365:1: ( ( '+' ) )
            // InternalT1.g:366:1: ( '+' )
            {
            // InternalT1.g:366:1: ( '+' )
            // InternalT1.g:367:2: '+'
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
    // InternalT1.g:376:1: rule__Value__Group_4__2 : rule__Value__Group_4__2__Impl ;
    public final void rule__Value__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:380:1: ( rule__Value__Group_4__2__Impl )
            // InternalT1.g:381:2: rule__Value__Group_4__2__Impl
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
    // InternalT1.g:387:1: rule__Value__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__Value__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:391:1: ( ( RULE_INT ) )
            // InternalT1.g:392:1: ( RULE_INT )
            {
            // InternalT1.g:392:1: ( RULE_INT )
            // InternalT1.g:393:2: RULE_INT
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


    // $ANTLR start "rule__Attribution__Group__0"
    // InternalT1.g:403:1: rule__Attribution__Group__0 : rule__Attribution__Group__0__Impl rule__Attribution__Group__1 ;
    public final void rule__Attribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:407:1: ( rule__Attribution__Group__0__Impl rule__Attribution__Group__1 )
            // InternalT1.g:408:2: rule__Attribution__Group__0__Impl rule__Attribution__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalT1.g:415:1: rule__Attribution__Group__0__Impl : ( '=' ) ;
    public final void rule__Attribution__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:419:1: ( ( '=' ) )
            // InternalT1.g:420:1: ( '=' )
            {
            // InternalT1.g:420:1: ( '=' )
            // InternalT1.g:421:2: '='
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
    // InternalT1.g:430:1: rule__Attribution__Group__1 : rule__Attribution__Group__1__Impl ;
    public final void rule__Attribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:434:1: ( rule__Attribution__Group__1__Impl )
            // InternalT1.g:435:2: rule__Attribution__Group__1__Impl
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
    // InternalT1.g:441:1: rule__Attribution__Group__1__Impl : ( ruleValue ) ;
    public final void rule__Attribution__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:445:1: ( ( ruleValue ) )
            // InternalT1.g:446:1: ( ruleValue )
            {
            // InternalT1.g:446:1: ( ruleValue )
            // InternalT1.g:447:2: ruleValue
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
    // InternalT1.g:457:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:461:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // InternalT1.g:462:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalT1.g:469:1: rule__Declaration__Group__0__Impl : ( ruleName ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:473:1: ( ( ruleName ) )
            // InternalT1.g:474:1: ( ruleName )
            {
            // InternalT1.g:474:1: ( ruleName )
            // InternalT1.g:475:2: ruleName
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
    // InternalT1.g:484:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:488:1: ( rule__Declaration__Group__1__Impl )
            // InternalT1.g:489:2: rule__Declaration__Group__1__Impl
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
    // InternalT1.g:495:1: rule__Declaration__Group__1__Impl : ( ruleAttribution ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:499:1: ( ( ruleAttribution ) )
            // InternalT1.g:500:1: ( ruleAttribution )
            {
            // InternalT1.g:500:1: ( ruleAttribution )
            // InternalT1.g:501:2: ruleAttribution
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
    // InternalT1.g:511:1: rule__Var__Group__0 : rule__Var__Group__0__Impl rule__Var__Group__1 ;
    public final void rule__Var__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:515:1: ( rule__Var__Group__0__Impl rule__Var__Group__1 )
            // InternalT1.g:516:2: rule__Var__Group__0__Impl rule__Var__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalT1.g:523:1: rule__Var__Group__0__Impl : ( 'var' ) ;
    public final void rule__Var__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:527:1: ( ( 'var' ) )
            // InternalT1.g:528:1: ( 'var' )
            {
            // InternalT1.g:528:1: ( 'var' )
            // InternalT1.g:529:2: 'var'
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
    // InternalT1.g:538:1: rule__Var__Group__1 : rule__Var__Group__1__Impl rule__Var__Group__2 ;
    public final void rule__Var__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:542:1: ( rule__Var__Group__1__Impl rule__Var__Group__2 )
            // InternalT1.g:543:2: rule__Var__Group__1__Impl rule__Var__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalT1.g:550:1: rule__Var__Group__1__Impl : ( ( rule__Var__DeclarationsAssignment_1 ) ) ;
    public final void rule__Var__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:554:1: ( ( ( rule__Var__DeclarationsAssignment_1 ) ) )
            // InternalT1.g:555:1: ( ( rule__Var__DeclarationsAssignment_1 ) )
            {
            // InternalT1.g:555:1: ( ( rule__Var__DeclarationsAssignment_1 ) )
            // InternalT1.g:556:2: ( rule__Var__DeclarationsAssignment_1 )
            {
             before(grammarAccess.getVarAccess().getDeclarationsAssignment_1()); 
            // InternalT1.g:557:2: ( rule__Var__DeclarationsAssignment_1 )
            // InternalT1.g:557:3: rule__Var__DeclarationsAssignment_1
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
    // InternalT1.g:565:1: rule__Var__Group__2 : rule__Var__Group__2__Impl rule__Var__Group__3 ;
    public final void rule__Var__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:569:1: ( rule__Var__Group__2__Impl rule__Var__Group__3 )
            // InternalT1.g:570:2: rule__Var__Group__2__Impl rule__Var__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalT1.g:577:1: rule__Var__Group__2__Impl : ( ( rule__Var__Group_2__0 )* ) ;
    public final void rule__Var__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:581:1: ( ( ( rule__Var__Group_2__0 )* ) )
            // InternalT1.g:582:1: ( ( rule__Var__Group_2__0 )* )
            {
            // InternalT1.g:582:1: ( ( rule__Var__Group_2__0 )* )
            // InternalT1.g:583:2: ( rule__Var__Group_2__0 )*
            {
             before(grammarAccess.getVarAccess().getGroup_2()); 
            // InternalT1.g:584:2: ( rule__Var__Group_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalT1.g:584:3: rule__Var__Group_2__0
            	    {
            	    pushFollow(FOLLOW_13);
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
    // InternalT1.g:592:1: rule__Var__Group__3 : rule__Var__Group__3__Impl ;
    public final void rule__Var__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:596:1: ( rule__Var__Group__3__Impl )
            // InternalT1.g:597:2: rule__Var__Group__3__Impl
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
    // InternalT1.g:603:1: rule__Var__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__Var__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:607:1: ( ( ( ';' )? ) )
            // InternalT1.g:608:1: ( ( ';' )? )
            {
            // InternalT1.g:608:1: ( ( ';' )? )
            // InternalT1.g:609:2: ( ';' )?
            {
             before(grammarAccess.getVarAccess().getSemicolonKeyword_3()); 
            // InternalT1.g:610:2: ( ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalT1.g:610:3: ';'
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
    // InternalT1.g:619:1: rule__Var__Group_2__0 : rule__Var__Group_2__0__Impl rule__Var__Group_2__1 ;
    public final void rule__Var__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:623:1: ( rule__Var__Group_2__0__Impl rule__Var__Group_2__1 )
            // InternalT1.g:624:2: rule__Var__Group_2__0__Impl rule__Var__Group_2__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalT1.g:631:1: rule__Var__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Var__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:635:1: ( ( ',' ) )
            // InternalT1.g:636:1: ( ',' )
            {
            // InternalT1.g:636:1: ( ',' )
            // InternalT1.g:637:2: ','
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
    // InternalT1.g:646:1: rule__Var__Group_2__1 : rule__Var__Group_2__1__Impl ;
    public final void rule__Var__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:650:1: ( rule__Var__Group_2__1__Impl )
            // InternalT1.g:651:2: rule__Var__Group_2__1__Impl
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
    // InternalT1.g:657:1: rule__Var__Group_2__1__Impl : ( ( rule__Var__DeclarationsAssignment_2_1 ) ) ;
    public final void rule__Var__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:661:1: ( ( ( rule__Var__DeclarationsAssignment_2_1 ) ) )
            // InternalT1.g:662:1: ( ( rule__Var__DeclarationsAssignment_2_1 ) )
            {
            // InternalT1.g:662:1: ( ( rule__Var__DeclarationsAssignment_2_1 ) )
            // InternalT1.g:663:2: ( rule__Var__DeclarationsAssignment_2_1 )
            {
             before(grammarAccess.getVarAccess().getDeclarationsAssignment_2_1()); 
            // InternalT1.g:664:2: ( rule__Var__DeclarationsAssignment_2_1 )
            // InternalT1.g:664:3: rule__Var__DeclarationsAssignment_2_1
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
    // InternalT1.g:673:1: rule__Model__VarsAssignment : ( ruleVar ) ;
    public final void rule__Model__VarsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:677:1: ( ( ruleVar ) )
            // InternalT1.g:678:2: ( ruleVar )
            {
            // InternalT1.g:678:2: ( ruleVar )
            // InternalT1.g:679:3: ruleVar
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
    // InternalT1.g:688:1: rule__Var__DeclarationsAssignment_1 : ( ruleDeclaration ) ;
    public final void rule__Var__DeclarationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:692:1: ( ( ruleDeclaration ) )
            // InternalT1.g:693:2: ( ruleDeclaration )
            {
            // InternalT1.g:693:2: ( ruleDeclaration )
            // InternalT1.g:694:3: ruleDeclaration
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
    // InternalT1.g:703:1: rule__Var__DeclarationsAssignment_2_1 : ( ruleDeclaration ) ;
    public final void rule__Var__DeclarationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT1.g:707:1: ( ( ruleDeclaration ) )
            // InternalT1.g:708:2: ( ruleDeclaration )
            {
            // InternalT1.g:708:2: ( ruleDeclaration )
            // InternalT1.g:709:3: ruleDeclaration
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000870L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010002L});

}