package org.xtext.example.mydsl.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.xtext.example.mydsl.idea.lang.T1ElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.xtext.example.mydsl.services.T1GrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PsiInternalT1Parser extends AbstractPsiAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'+'", "'='", "'var'", "','", "';'"
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


        public PsiInternalT1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalT1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalT1Parser.tokenNames; }
    public String getGrammarFileName() { return "PsiInternalT1.g"; }



    	protected T1GrammarAccess grammarAccess;

    	protected T1ElementTypeProvider elementTypeProvider;

    	public PsiInternalT1Parser(PsiBuilder builder, TokenStream input, T1ElementTypeProvider elementTypeProvider, T1GrammarAccess grammarAccess) {
    		this(input);
    		setPsiBuilder(builder);
    		this.grammarAccess = grammarAccess;
    		this.elementTypeProvider = elementTypeProvider;
    	}

    	@Override
    	protected String getFirstRuleName() {
    		return "Model";
    	}




    // $ANTLR start "entryRuleModel"
    // PsiInternalT1.g:52:1: entryRuleModel returns [Boolean current=false] : iv_ruleModel= ruleModel EOF ;
    public final Boolean entryRuleModel() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleModel = null;


        try {
            // PsiInternalT1.g:52:47: (iv_ruleModel= ruleModel EOF )
            // PsiInternalT1.g:53:2: iv_ruleModel= ruleModel EOF
            {
             markComposite(elementTypeProvider.getModelElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // PsiInternalT1.g:59:1: ruleModel returns [Boolean current=false] : ( (lv_vars_0_0= ruleVar ) )* ;
    public final Boolean ruleModel() throws RecognitionException {
        Boolean current = false;

        Boolean lv_vars_0_0 = null;


        try {
            // PsiInternalT1.g:60:1: ( ( (lv_vars_0_0= ruleVar ) )* )
            // PsiInternalT1.g:61:2: ( (lv_vars_0_0= ruleVar ) )*
            {
            // PsiInternalT1.g:61:2: ( (lv_vars_0_0= ruleVar ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // PsiInternalT1.g:62:3: (lv_vars_0_0= ruleVar )
            	    {
            	    // PsiInternalT1.g:62:3: (lv_vars_0_0= ruleVar )
            	    // PsiInternalT1.g:63:4: lv_vars_0_0= ruleVar
            	    {

            	    				markComposite(elementTypeProvider.getModel_VarsVarParserRuleCall_0ElementType());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_vars_0_0=ruleVar();

            	    state._fsp--;


            	    				doneComposite();
            	    				if(!current) {
            	    					associateWithSemanticElement();
            	    					current = true;
            	    				}
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleName"
    // PsiInternalT1.g:79:1: entryRuleName returns [Boolean current=false] : iv_ruleName= ruleName EOF ;
    public final Boolean entryRuleName() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleName = null;


        try {
            // PsiInternalT1.g:79:46: (iv_ruleName= ruleName EOF )
            // PsiInternalT1.g:80:2: iv_ruleName= ruleName EOF
            {
             markComposite(elementTypeProvider.getNameElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // PsiInternalT1.g:86:1: ruleName returns [Boolean current=false] : this_ID_0= RULE_ID ;
    public final Boolean ruleName() throws RecognitionException {
        Boolean current = false;

        Token this_ID_0=null;

        try {
            // PsiInternalT1.g:87:1: (this_ID_0= RULE_ID )
            // PsiInternalT1.g:88:2: this_ID_0= RULE_ID
            {

            		markLeaf(elementTypeProvider.getName_IDTerminalRuleCallElementType());
            	
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		doneLeaf(this_ID_0);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleValue"
    // PsiInternalT1.g:98:1: entryRuleValue returns [Boolean current=false] : iv_ruleValue= ruleValue EOF ;
    public final Boolean entryRuleValue() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleValue = null;


        try {
            // PsiInternalT1.g:98:47: (iv_ruleValue= ruleValue EOF )
            // PsiInternalT1.g:99:2: iv_ruleValue= ruleValue EOF
            {
             markComposite(elementTypeProvider.getValueElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // PsiInternalT1.g:105:1: ruleValue returns [Boolean current=false] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | ( (this_INT_3= RULE_INT )? kw= '.' (this_INT_5= RULE_INT )* ) | (this_INT_6= RULE_INT kw= '+' this_INT_8= RULE_INT ) ) ;
    public final Boolean ruleValue() throws RecognitionException {
        Boolean current = false;

        Token this_ID_0=null;
        Token this_STRING_1=null;
        Token this_INT_2=null;
        Token this_INT_3=null;
        Token kw=null;
        Token this_INT_5=null;
        Token this_INT_6=null;
        Token this_INT_8=null;

        try {
            // PsiInternalT1.g:106:1: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | ( (this_INT_3= RULE_INT )? kw= '.' (this_INT_5= RULE_INT )* ) | (this_INT_6= RULE_INT kw= '+' this_INT_8= RULE_INT ) ) )
            // PsiInternalT1.g:107:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | ( (this_INT_3= RULE_INT )? kw= '.' (this_INT_5= RULE_INT )* ) | (this_INT_6= RULE_INT kw= '+' this_INT_8= RULE_INT ) )
            {
            // PsiInternalT1.g:107:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | ( (this_INT_3= RULE_INT )? kw= '.' (this_INT_5= RULE_INT )* ) | (this_INT_6= RULE_INT kw= '+' this_INT_8= RULE_INT ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case RULE_STRING:
                {
                alt4=2;
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
                    alt4=3;
                    }
                    break;
                case 12:
                    {
                    alt4=5;
                    }
                    break;
                case 11:
                    {
                    alt4=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }

                }
                break;
            case 11:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // PsiInternalT1.g:108:3: this_ID_0= RULE_ID
                    {

                    			markLeaf(elementTypeProvider.getValue_IDTerminalRuleCall_0ElementType());
                    		
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			doneLeaf(this_ID_0);
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalT1.g:116:3: this_STRING_1= RULE_STRING
                    {

                    			markLeaf(elementTypeProvider.getValue_STRINGTerminalRuleCall_1ElementType());
                    		
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			doneLeaf(this_STRING_1);
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalT1.g:124:3: this_INT_2= RULE_INT
                    {

                    			markLeaf(elementTypeProvider.getValue_INTTerminalRuleCall_2ElementType());
                    		
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			doneLeaf(this_INT_2);
                    		

                    }
                    break;
                case 4 :
                    // PsiInternalT1.g:132:3: ( (this_INT_3= RULE_INT )? kw= '.' (this_INT_5= RULE_INT )* )
                    {
                    // PsiInternalT1.g:132:3: ( (this_INT_3= RULE_INT )? kw= '.' (this_INT_5= RULE_INT )* )
                    // PsiInternalT1.g:133:4: (this_INT_3= RULE_INT )? kw= '.' (this_INT_5= RULE_INT )*
                    {
                    // PsiInternalT1.g:133:4: (this_INT_3= RULE_INT )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RULE_INT) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // PsiInternalT1.g:134:5: this_INT_3= RULE_INT
                            {

                            					markLeaf(elementTypeProvider.getValue_INTTerminalRuleCall_3_0ElementType());
                            				
                            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_4); 

                            					doneLeaf(this_INT_3);
                            				

                            }
                            break;

                    }


                    				markLeaf(elementTypeProvider.getValue_FullStopKeyword_3_1ElementType());
                    			
                    kw=(Token)match(input,11,FOLLOW_5); 

                    				doneLeaf(kw);
                    			
                    // PsiInternalT1.g:149:4: (this_INT_5= RULE_INT )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_INT) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // PsiInternalT1.g:150:5: this_INT_5= RULE_INT
                    	    {

                    	    					markLeaf(elementTypeProvider.getValue_INTTerminalRuleCall_3_2ElementType());
                    	    				
                    	    this_INT_5=(Token)match(input,RULE_INT,FOLLOW_5); 

                    	    					doneLeaf(this_INT_5);
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 5 :
                    // PsiInternalT1.g:160:3: (this_INT_6= RULE_INT kw= '+' this_INT_8= RULE_INT )
                    {
                    // PsiInternalT1.g:160:3: (this_INT_6= RULE_INT kw= '+' this_INT_8= RULE_INT )
                    // PsiInternalT1.g:161:4: this_INT_6= RULE_INT kw= '+' this_INT_8= RULE_INT
                    {

                    				markLeaf(elementTypeProvider.getValue_INTTerminalRuleCall_4_0ElementType());
                    			
                    this_INT_6=(Token)match(input,RULE_INT,FOLLOW_6); 

                    				doneLeaf(this_INT_6);
                    			

                    				markLeaf(elementTypeProvider.getValue_PlusSignKeyword_4_1ElementType());
                    			
                    kw=(Token)match(input,12,FOLLOW_7); 

                    				doneLeaf(kw);
                    			

                    				markLeaf(elementTypeProvider.getValue_INTTerminalRuleCall_4_2ElementType());
                    			
                    this_INT_8=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				doneLeaf(this_INT_8);
                    			

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleAttribution"
    // PsiInternalT1.g:187:1: entryRuleAttribution returns [Boolean current=false] : iv_ruleAttribution= ruleAttribution EOF ;
    public final Boolean entryRuleAttribution() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAttribution = null;


        try {
            // PsiInternalT1.g:187:53: (iv_ruleAttribution= ruleAttribution EOF )
            // PsiInternalT1.g:188:2: iv_ruleAttribution= ruleAttribution EOF
            {
             markComposite(elementTypeProvider.getAttributionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribution=ruleAttribution();

            state._fsp--;

             current =iv_ruleAttribution; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribution"


    // $ANTLR start "ruleAttribution"
    // PsiInternalT1.g:194:1: ruleAttribution returns [Boolean current=false] : (kw= '=' ruleValue )* ;
    public final Boolean ruleAttribution() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalT1.g:195:1: ( (kw= '=' ruleValue )* )
            // PsiInternalT1.g:196:2: (kw= '=' ruleValue )*
            {
            // PsiInternalT1.g:196:2: (kw= '=' ruleValue )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // PsiInternalT1.g:197:3: kw= '=' ruleValue
            	    {

            	    			markLeaf(elementTypeProvider.getAttribution_EqualsSignKeyword_0ElementType());
            	    		
            	    kw=(Token)match(input,13,FOLLOW_8); 

            	    			doneLeaf(kw);
            	    		

            	    			markComposite(elementTypeProvider.getAttribution_ValueParserRuleCall_1ElementType());
            	    		
            	    pushFollow(FOLLOW_9);
            	    ruleValue();

            	    state._fsp--;


            	    			doneComposite();
            	    		

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribution"


    // $ANTLR start "entryRuleDeclaration"
    // PsiInternalT1.g:215:1: entryRuleDeclaration returns [Boolean current=false] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final Boolean entryRuleDeclaration() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleDeclaration = null;


        try {
            // PsiInternalT1.g:215:53: (iv_ruleDeclaration= ruleDeclaration EOF )
            // PsiInternalT1.g:216:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             markComposite(elementTypeProvider.getDeclarationElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // PsiInternalT1.g:222:1: ruleDeclaration returns [Boolean current=false] : ( ruleName ruleAttribution ) ;
    public final Boolean ruleDeclaration() throws RecognitionException {
        Boolean current = false;

        try {
            // PsiInternalT1.g:223:1: ( ( ruleName ruleAttribution ) )
            // PsiInternalT1.g:224:2: ( ruleName ruleAttribution )
            {
            // PsiInternalT1.g:224:2: ( ruleName ruleAttribution )
            // PsiInternalT1.g:225:3: ruleName ruleAttribution
            {

            			markComposite(elementTypeProvider.getDeclaration_NameParserRuleCall_0ElementType());
            		
            pushFollow(FOLLOW_10);
            ruleName();

            state._fsp--;


            			doneComposite();
            		

            			markComposite(elementTypeProvider.getDeclaration_AttributionParserRuleCall_1ElementType());
            		
            pushFollow(FOLLOW_2);
            ruleAttribution();

            state._fsp--;


            			doneComposite();
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleVar"
    // PsiInternalT1.g:243:1: entryRuleVar returns [Boolean current=false] : iv_ruleVar= ruleVar EOF ;
    public final Boolean entryRuleVar() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleVar = null;


        try {
            // PsiInternalT1.g:243:45: (iv_ruleVar= ruleVar EOF )
            // PsiInternalT1.g:244:2: iv_ruleVar= ruleVar EOF
            {
             markComposite(elementTypeProvider.getVarElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleVar=ruleVar();

            state._fsp--;

             current =iv_ruleVar; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // PsiInternalT1.g:250:1: ruleVar returns [Boolean current=false] : (otherlv_0= 'var' ( (lv_declarations_1_0= ruleDeclaration ) ) (otherlv_2= ',' ( (lv_declarations_3_0= ruleDeclaration ) ) )* (otherlv_4= ';' )? ) ;
    public final Boolean ruleVar() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Boolean lv_declarations_1_0 = null;

        Boolean lv_declarations_3_0 = null;


        try {
            // PsiInternalT1.g:251:1: ( (otherlv_0= 'var' ( (lv_declarations_1_0= ruleDeclaration ) ) (otherlv_2= ',' ( (lv_declarations_3_0= ruleDeclaration ) ) )* (otherlv_4= ';' )? ) )
            // PsiInternalT1.g:252:2: (otherlv_0= 'var' ( (lv_declarations_1_0= ruleDeclaration ) ) (otherlv_2= ',' ( (lv_declarations_3_0= ruleDeclaration ) ) )* (otherlv_4= ';' )? )
            {
            // PsiInternalT1.g:252:2: (otherlv_0= 'var' ( (lv_declarations_1_0= ruleDeclaration ) ) (otherlv_2= ',' ( (lv_declarations_3_0= ruleDeclaration ) ) )* (otherlv_4= ';' )? )
            // PsiInternalT1.g:253:3: otherlv_0= 'var' ( (lv_declarations_1_0= ruleDeclaration ) ) (otherlv_2= ',' ( (lv_declarations_3_0= ruleDeclaration ) ) )* (otherlv_4= ';' )?
            {

            			markLeaf(elementTypeProvider.getVar_VarKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,14,FOLLOW_11); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalT1.g:260:3: ( (lv_declarations_1_0= ruleDeclaration ) )
            // PsiInternalT1.g:261:4: (lv_declarations_1_0= ruleDeclaration )
            {
            // PsiInternalT1.g:261:4: (lv_declarations_1_0= ruleDeclaration )
            // PsiInternalT1.g:262:5: lv_declarations_1_0= ruleDeclaration
            {

            					markComposite(elementTypeProvider.getVar_DeclarationsDeclarationParserRuleCall_1_0ElementType());
            				
            pushFollow(FOLLOW_12);
            lv_declarations_1_0=ruleDeclaration();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalT1.g:275:3: (otherlv_2= ',' ( (lv_declarations_3_0= ruleDeclaration ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // PsiInternalT1.g:276:4: otherlv_2= ',' ( (lv_declarations_3_0= ruleDeclaration ) )
            	    {

            	    				markLeaf(elementTypeProvider.getVar_CommaKeyword_2_0ElementType());
            	    			
            	    otherlv_2=(Token)match(input,15,FOLLOW_11); 

            	    				doneLeaf(otherlv_2);
            	    			
            	    // PsiInternalT1.g:283:4: ( (lv_declarations_3_0= ruleDeclaration ) )
            	    // PsiInternalT1.g:284:5: (lv_declarations_3_0= ruleDeclaration )
            	    {
            	    // PsiInternalT1.g:284:5: (lv_declarations_3_0= ruleDeclaration )
            	    // PsiInternalT1.g:285:6: lv_declarations_3_0= ruleDeclaration
            	    {

            	    						markComposite(elementTypeProvider.getVar_DeclarationsDeclarationParserRuleCall_2_1_0ElementType());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_declarations_3_0=ruleDeclaration();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // PsiInternalT1.g:299:3: (otherlv_4= ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // PsiInternalT1.g:300:4: otherlv_4= ';'
                    {

                    				markLeaf(elementTypeProvider.getVar_SemicolonKeyword_3ElementType());
                    			
                    otherlv_4=(Token)match(input,16,FOLLOW_2); 

                    				doneLeaf(otherlv_4);
                    			

                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVar"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000870L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000018002L});

}