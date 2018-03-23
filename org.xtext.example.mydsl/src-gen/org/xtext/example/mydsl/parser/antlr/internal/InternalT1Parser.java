package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.T1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalT1Parser extends AbstractInternalAntlrParser {
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


        public InternalT1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalT1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalT1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalT1.g"; }



     	private T1GrammarAccess grammarAccess;

        public InternalT1Parser(TokenStream input, T1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected T1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalT1.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalT1.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalT1.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalT1.g:71:1: ruleModel returns [EObject current=null] : ( (lv_vars_0_0= ruleVar ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_vars_0_0 = null;



        	enterRule();

        try {
            // InternalT1.g:77:2: ( ( (lv_vars_0_0= ruleVar ) )* )
            // InternalT1.g:78:2: ( (lv_vars_0_0= ruleVar ) )*
            {
            // InternalT1.g:78:2: ( (lv_vars_0_0= ruleVar ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalT1.g:79:3: (lv_vars_0_0= ruleVar )
            	    {
            	    // InternalT1.g:79:3: (lv_vars_0_0= ruleVar )
            	    // InternalT1.g:80:4: lv_vars_0_0= ruleVar
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getVarsVarParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_vars_0_0=ruleVar();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"vars",
            	    					lv_vars_0_0,
            	    					"org.xtext.example.mydsl.T1.Var");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleName"
    // InternalT1.g:100:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalT1.g:100:44: (iv_ruleName= ruleName EOF )
            // InternalT1.g:101:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalT1.g:107:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalT1.g:113:2: (this_ID_0= RULE_ID )
            // InternalT1.g:114:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleValue"
    // InternalT1.g:124:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // InternalT1.g:124:45: (iv_ruleValue= ruleValue EOF )
            // InternalT1.g:125:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalT1.g:131:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | ( (this_INT_3= RULE_INT )? kw= '.' (this_INT_5= RULE_INT )* ) | (this_INT_6= RULE_INT kw= '+' this_INT_8= RULE_INT ) | (this_INT_9= RULE_INT kw= '+' (this_INT_11= RULE_INT )? kw= '.' (this_INT_13= RULE_INT )* ) ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;
        Token this_INT_2=null;
        Token this_INT_3=null;
        Token kw=null;
        Token this_INT_5=null;
        Token this_INT_6=null;
        Token this_INT_8=null;
        Token this_INT_9=null;
        Token this_INT_11=null;
        Token this_INT_13=null;


        	enterRule();

        try {
            // InternalT1.g:137:2: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | ( (this_INT_3= RULE_INT )? kw= '.' (this_INT_5= RULE_INT )* ) | (this_INT_6= RULE_INT kw= '+' this_INT_8= RULE_INT ) | (this_INT_9= RULE_INT kw= '+' (this_INT_11= RULE_INT )? kw= '.' (this_INT_13= RULE_INT )* ) ) )
            // InternalT1.g:138:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | ( (this_INT_3= RULE_INT )? kw= '.' (this_INT_5= RULE_INT )* ) | (this_INT_6= RULE_INT kw= '+' this_INT_8= RULE_INT ) | (this_INT_9= RULE_INT kw= '+' (this_INT_11= RULE_INT )? kw= '.' (this_INT_13= RULE_INT )* ) )
            {
            // InternalT1.g:138:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | ( (this_INT_3= RULE_INT )? kw= '.' (this_INT_5= RULE_INT )* ) | (this_INT_6= RULE_INT kw= '+' this_INT_8= RULE_INT ) | (this_INT_9= RULE_INT kw= '+' (this_INT_11= RULE_INT )? kw= '.' (this_INT_13= RULE_INT )* ) )
            int alt6=6;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalT1.g:139:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getValueAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalT1.g:147:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalT1.g:155:3: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_2);
                    		

                    			newLeafNode(this_INT_2, grammarAccess.getValueAccess().getINTTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalT1.g:163:3: ( (this_INT_3= RULE_INT )? kw= '.' (this_INT_5= RULE_INT )* )
                    {
                    // InternalT1.g:163:3: ( (this_INT_3= RULE_INT )? kw= '.' (this_INT_5= RULE_INT )* )
                    // InternalT1.g:164:4: (this_INT_3= RULE_INT )? kw= '.' (this_INT_5= RULE_INT )*
                    {
                    // InternalT1.g:164:4: (this_INT_3= RULE_INT )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RULE_INT) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalT1.g:165:5: this_INT_3= RULE_INT
                            {
                            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_4); 

                            					current.merge(this_INT_3);
                            				

                            					newLeafNode(this_INT_3, grammarAccess.getValueAccess().getINTTerminalRuleCall_3_0());
                            				

                            }
                            break;

                    }

                    kw=(Token)match(input,11,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getValueAccess().getFullStopKeyword_3_1());
                    			
                    // InternalT1.g:178:4: (this_INT_5= RULE_INT )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_INT) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalT1.g:179:5: this_INT_5= RULE_INT
                    	    {
                    	    this_INT_5=(Token)match(input,RULE_INT,FOLLOW_5); 

                    	    					current.merge(this_INT_5);
                    	    				

                    	    					newLeafNode(this_INT_5, grammarAccess.getValueAccess().getINTTerminalRuleCall_3_2());
                    	    				

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
                    // InternalT1.g:189:3: (this_INT_6= RULE_INT kw= '+' this_INT_8= RULE_INT )
                    {
                    // InternalT1.g:189:3: (this_INT_6= RULE_INT kw= '+' this_INT_8= RULE_INT )
                    // InternalT1.g:190:4: this_INT_6= RULE_INT kw= '+' this_INT_8= RULE_INT
                    {
                    this_INT_6=(Token)match(input,RULE_INT,FOLLOW_6); 

                    				current.merge(this_INT_6);
                    			

                    				newLeafNode(this_INT_6, grammarAccess.getValueAccess().getINTTerminalRuleCall_4_0());
                    			
                    kw=(Token)match(input,12,FOLLOW_7); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getValueAccess().getPlusSignKeyword_4_1());
                    			
                    this_INT_8=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_8);
                    			

                    				newLeafNode(this_INT_8, grammarAccess.getValueAccess().getINTTerminalRuleCall_4_2());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalT1.g:211:3: (this_INT_9= RULE_INT kw= '+' (this_INT_11= RULE_INT )? kw= '.' (this_INT_13= RULE_INT )* )
                    {
                    // InternalT1.g:211:3: (this_INT_9= RULE_INT kw= '+' (this_INT_11= RULE_INT )? kw= '.' (this_INT_13= RULE_INT )* )
                    // InternalT1.g:212:4: this_INT_9= RULE_INT kw= '+' (this_INT_11= RULE_INT )? kw= '.' (this_INT_13= RULE_INT )*
                    {
                    this_INT_9=(Token)match(input,RULE_INT,FOLLOW_6); 

                    				current.merge(this_INT_9);
                    			

                    				newLeafNode(this_INT_9, grammarAccess.getValueAccess().getINTTerminalRuleCall_5_0());
                    			
                    kw=(Token)match(input,12,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getValueAccess().getPlusSignKeyword_5_1());
                    			
                    // InternalT1.g:224:4: (this_INT_11= RULE_INT )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_INT) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalT1.g:225:5: this_INT_11= RULE_INT
                            {
                            this_INT_11=(Token)match(input,RULE_INT,FOLLOW_4); 

                            					current.merge(this_INT_11);
                            				

                            					newLeafNode(this_INT_11, grammarAccess.getValueAccess().getINTTerminalRuleCall_5_2());
                            				

                            }
                            break;

                    }

                    kw=(Token)match(input,11,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getValueAccess().getFullStopKeyword_5_3());
                    			
                    // InternalT1.g:238:4: (this_INT_13= RULE_INT )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_INT) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalT1.g:239:5: this_INT_13= RULE_INT
                    	    {
                    	    this_INT_13=(Token)match(input,RULE_INT,FOLLOW_5); 

                    	    					current.merge(this_INT_13);
                    	    				

                    	    					newLeafNode(this_INT_13, grammarAccess.getValueAccess().getINTTerminalRuleCall_5_4());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleAttribution"
    // InternalT1.g:252:1: entryRuleAttribution returns [String current=null] : iv_ruleAttribution= ruleAttribution EOF ;
    public final String entryRuleAttribution() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttribution = null;


        try {
            // InternalT1.g:252:51: (iv_ruleAttribution= ruleAttribution EOF )
            // InternalT1.g:253:2: iv_ruleAttribution= ruleAttribution EOF
            {
             newCompositeNode(grammarAccess.getAttributionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribution=ruleAttribution();

            state._fsp--;

             current =iv_ruleAttribution.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribution"


    // $ANTLR start "ruleAttribution"
    // InternalT1.g:259:1: ruleAttribution returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' this_Value_1= ruleValue )* ;
    public final AntlrDatatypeRuleToken ruleAttribution() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Value_1 = null;



        	enterRule();

        try {
            // InternalT1.g:265:2: ( (kw= '=' this_Value_1= ruleValue )* )
            // InternalT1.g:266:2: (kw= '=' this_Value_1= ruleValue )*
            {
            // InternalT1.g:266:2: (kw= '=' this_Value_1= ruleValue )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==13) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalT1.g:267:3: kw= '=' this_Value_1= ruleValue
            	    {
            	    kw=(Token)match(input,13,FOLLOW_9); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAttributionAccess().getEqualsSignKeyword_0());
            	    		

            	    			newCompositeNode(grammarAccess.getAttributionAccess().getValueParserRuleCall_1());
            	    		
            	    pushFollow(FOLLOW_10);
            	    this_Value_1=ruleValue();

            	    state._fsp--;


            	    			current.merge(this_Value_1);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribution"


    // $ANTLR start "entryRuleDeclaration"
    // InternalT1.g:286:1: entryRuleDeclaration returns [String current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final String entryRuleDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclaration = null;


        try {
            // InternalT1.g:286:51: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalT1.g:287:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalT1.g:293:1: ruleDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName this_Attribution_1= ruleAttribution ) ;
    public final AntlrDatatypeRuleToken ruleDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Attribution_1 = null;



        	enterRule();

        try {
            // InternalT1.g:299:2: ( (this_Name_0= ruleName this_Attribution_1= ruleAttribution ) )
            // InternalT1.g:300:2: (this_Name_0= ruleName this_Attribution_1= ruleAttribution )
            {
            // InternalT1.g:300:2: (this_Name_0= ruleName this_Attribution_1= ruleAttribution )
            // InternalT1.g:301:3: this_Name_0= ruleName this_Attribution_1= ruleAttribution
            {

            			newCompositeNode(grammarAccess.getDeclarationAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getDeclarationAccess().getAttributionParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Attribution_1=ruleAttribution();

            state._fsp--;


            			current.merge(this_Attribution_1);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleVar"
    // InternalT1.g:325:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalT1.g:325:44: (iv_ruleVar= ruleVar EOF )
            // InternalT1.g:326:2: iv_ruleVar= ruleVar EOF
            {
             newCompositeNode(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVar=ruleVar();

            state._fsp--;

             current =iv_ruleVar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalT1.g:332:1: ruleVar returns [EObject current=null] : (otherlv_0= 'var' ( (lv_declarations_1_0= ruleDeclaration ) ) (otherlv_2= ',' ( (lv_declarations_3_0= ruleDeclaration ) ) )* (otherlv_4= ';' )? ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_declarations_1_0 = null;

        AntlrDatatypeRuleToken lv_declarations_3_0 = null;



        	enterRule();

        try {
            // InternalT1.g:338:2: ( (otherlv_0= 'var' ( (lv_declarations_1_0= ruleDeclaration ) ) (otherlv_2= ',' ( (lv_declarations_3_0= ruleDeclaration ) ) )* (otherlv_4= ';' )? ) )
            // InternalT1.g:339:2: (otherlv_0= 'var' ( (lv_declarations_1_0= ruleDeclaration ) ) (otherlv_2= ',' ( (lv_declarations_3_0= ruleDeclaration ) ) )* (otherlv_4= ';' )? )
            {
            // InternalT1.g:339:2: (otherlv_0= 'var' ( (lv_declarations_1_0= ruleDeclaration ) ) (otherlv_2= ',' ( (lv_declarations_3_0= ruleDeclaration ) ) )* (otherlv_4= ';' )? )
            // InternalT1.g:340:3: otherlv_0= 'var' ( (lv_declarations_1_0= ruleDeclaration ) ) (otherlv_2= ',' ( (lv_declarations_3_0= ruleDeclaration ) ) )* (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getVarAccess().getVarKeyword_0());
            		
            // InternalT1.g:344:3: ( (lv_declarations_1_0= ruleDeclaration ) )
            // InternalT1.g:345:4: (lv_declarations_1_0= ruleDeclaration )
            {
            // InternalT1.g:345:4: (lv_declarations_1_0= ruleDeclaration )
            // InternalT1.g:346:5: lv_declarations_1_0= ruleDeclaration
            {

            					newCompositeNode(grammarAccess.getVarAccess().getDeclarationsDeclarationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_declarations_1_0=ruleDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarRule());
            					}
            					add(
            						current,
            						"declarations",
            						lv_declarations_1_0,
            						"org.xtext.example.mydsl.T1.Declaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalT1.g:363:3: (otherlv_2= ',' ( (lv_declarations_3_0= ruleDeclaration ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalT1.g:364:4: otherlv_2= ',' ( (lv_declarations_3_0= ruleDeclaration ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_12); 

            	    				newLeafNode(otherlv_2, grammarAccess.getVarAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalT1.g:368:4: ( (lv_declarations_3_0= ruleDeclaration ) )
            	    // InternalT1.g:369:5: (lv_declarations_3_0= ruleDeclaration )
            	    {
            	    // InternalT1.g:369:5: (lv_declarations_3_0= ruleDeclaration )
            	    // InternalT1.g:370:6: lv_declarations_3_0= ruleDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getVarAccess().getDeclarationsDeclarationParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_declarations_3_0=ruleDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVarRule());
            	    						}
            	    						add(
            	    							current,
            	    							"declarations",
            	    							lv_declarations_3_0,
            	    							"org.xtext.example.mydsl.T1.Declaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalT1.g:388:3: (otherlv_4= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalT1.g:389:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getVarAccess().getSemicolonKeyword_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVar"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
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

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "138:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | ( (this_INT_3= RULE_INT )? kw= '.' (this_INT_5= RULE_INT )* ) | (this_INT_6= RULE_INT kw= '+' this_INT_8= RULE_INT ) | (this_INT_9= RULE_INT kw= '+' (this_INT_11= RULE_INT )? kw= '.' (this_INT_13= RULE_INT )* ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000870L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000018002L});

}