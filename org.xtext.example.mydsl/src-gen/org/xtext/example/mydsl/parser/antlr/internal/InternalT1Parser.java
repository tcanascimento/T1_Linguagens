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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'+'", "'-'", "'='", "'var'", "','", "';'"
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

                if ( (LA1_0==15) ) {
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
    // InternalT1.g:131:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | ( (this_INT_3= RULE_INT )? kw= '.' (this_INT_5= RULE_INT )* ) | (this_INT_6= RULE_INT kw= '+' this_INT_8= RULE_INT ) | (this_INT_9= RULE_INT kw= '+' (this_INT_11= RULE_INT )? kw= '.' (this_INT_13= RULE_INT )* ) | (this_INT_14= RULE_INT kw= '+' (this_INT_16= RULE_INT )* ) | (this_INT_17= RULE_INT kw= '-' this_INT_19= RULE_INT ) | (this_INT_20= RULE_INT kw= '-' (this_INT_22= RULE_INT )? kw= '.' (this_INT_24= RULE_INT )* ) | (this_INT_25= RULE_INT kw= '-' (this_INT_27= RULE_INT )* ) | ( (this_INT_28= RULE_INT )? kw= '.' (this_INT_30= RULE_INT )* kw= '+' this_INT_32= RULE_INT ) | (kw= '-' (this_INT_34= RULE_INT )* ) | (kw= '-' this_INT_36= RULE_INT )* | (kw= '-' (this_INT_38= RULE_INT )* kw= '+' (kw= '.' )? (this_INT_41= RULE_INT )* ) | (kw= '-' this_INT_43= RULE_INT kw= '-' (this_INT_45= RULE_INT )? kw= '.' (this_INT_47= RULE_INT )* ) ) ;
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
        Token this_INT_14=null;
        Token this_INT_16=null;
        Token this_INT_17=null;
        Token this_INT_19=null;
        Token this_INT_20=null;
        Token this_INT_22=null;
        Token this_INT_24=null;
        Token this_INT_25=null;
        Token this_INT_27=null;
        Token this_INT_28=null;
        Token this_INT_30=null;
        Token this_INT_32=null;
        Token this_INT_34=null;
        Token this_INT_36=null;
        Token this_INT_38=null;
        Token this_INT_41=null;
        Token this_INT_43=null;
        Token this_INT_45=null;
        Token this_INT_47=null;


        	enterRule();

        try {
            // InternalT1.g:137:2: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | ( (this_INT_3= RULE_INT )? kw= '.' (this_INT_5= RULE_INT )* ) | (this_INT_6= RULE_INT kw= '+' this_INT_8= RULE_INT ) | (this_INT_9= RULE_INT kw= '+' (this_INT_11= RULE_INT )? kw= '.' (this_INT_13= RULE_INT )* ) | (this_INT_14= RULE_INT kw= '+' (this_INT_16= RULE_INT )* ) | (this_INT_17= RULE_INT kw= '-' this_INT_19= RULE_INT ) | (this_INT_20= RULE_INT kw= '-' (this_INT_22= RULE_INT )? kw= '.' (this_INT_24= RULE_INT )* ) | (this_INT_25= RULE_INT kw= '-' (this_INT_27= RULE_INT )* ) | ( (this_INT_28= RULE_INT )? kw= '.' (this_INT_30= RULE_INT )* kw= '+' this_INT_32= RULE_INT ) | (kw= '-' (this_INT_34= RULE_INT )* ) | (kw= '-' this_INT_36= RULE_INT )* | (kw= '-' (this_INT_38= RULE_INT )* kw= '+' (kw= '.' )? (this_INT_41= RULE_INT )* ) | (kw= '-' this_INT_43= RULE_INT kw= '-' (this_INT_45= RULE_INT )? kw= '.' (this_INT_47= RULE_INT )* ) ) )
            // InternalT1.g:138:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | ( (this_INT_3= RULE_INT )? kw= '.' (this_INT_5= RULE_INT )* ) | (this_INT_6= RULE_INT kw= '+' this_INT_8= RULE_INT ) | (this_INT_9= RULE_INT kw= '+' (this_INT_11= RULE_INT )? kw= '.' (this_INT_13= RULE_INT )* ) | (this_INT_14= RULE_INT kw= '+' (this_INT_16= RULE_INT )* ) | (this_INT_17= RULE_INT kw= '-' this_INT_19= RULE_INT ) | (this_INT_20= RULE_INT kw= '-' (this_INT_22= RULE_INT )? kw= '.' (this_INT_24= RULE_INT )* ) | (this_INT_25= RULE_INT kw= '-' (this_INT_27= RULE_INT )* ) | ( (this_INT_28= RULE_INT )? kw= '.' (this_INT_30= RULE_INT )* kw= '+' this_INT_32= RULE_INT ) | (kw= '-' (this_INT_34= RULE_INT )* ) | (kw= '-' this_INT_36= RULE_INT )* | (kw= '-' (this_INT_38= RULE_INT )* kw= '+' (kw= '.' )? (this_INT_41= RULE_INT )* ) | (kw= '-' this_INT_43= RULE_INT kw= '-' (this_INT_45= RULE_INT )? kw= '.' (this_INT_47= RULE_INT )* ) )
            {
            // InternalT1.g:138:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | ( (this_INT_3= RULE_INT )? kw= '.' (this_INT_5= RULE_INT )* ) | (this_INT_6= RULE_INT kw= '+' this_INT_8= RULE_INT ) | (this_INT_9= RULE_INT kw= '+' (this_INT_11= RULE_INT )? kw= '.' (this_INT_13= RULE_INT )* ) | (this_INT_14= RULE_INT kw= '+' (this_INT_16= RULE_INT )* ) | (this_INT_17= RULE_INT kw= '-' this_INT_19= RULE_INT ) | (this_INT_20= RULE_INT kw= '-' (this_INT_22= RULE_INT )? kw= '.' (this_INT_24= RULE_INT )* ) | (this_INT_25= RULE_INT kw= '-' (this_INT_27= RULE_INT )* ) | ( (this_INT_28= RULE_INT )? kw= '.' (this_INT_30= RULE_INT )* kw= '+' this_INT_32= RULE_INT ) | (kw= '-' (this_INT_34= RULE_INT )* ) | (kw= '-' this_INT_36= RULE_INT )* | (kw= '-' (this_INT_38= RULE_INT )* kw= '+' (kw= '.' )? (this_INT_41= RULE_INT )* ) | (kw= '-' this_INT_43= RULE_INT kw= '-' (this_INT_45= RULE_INT )? kw= '.' (this_INT_47= RULE_INT )* ) )
            int alt19=15;
            alt19 = dfa19.predict(input);
            switch (alt19) {
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
                case 7 :
                    // InternalT1.g:249:3: (this_INT_14= RULE_INT kw= '+' (this_INT_16= RULE_INT )* )
                    {
                    // InternalT1.g:249:3: (this_INT_14= RULE_INT kw= '+' (this_INT_16= RULE_INT )* )
                    // InternalT1.g:250:4: this_INT_14= RULE_INT kw= '+' (this_INT_16= RULE_INT )*
                    {
                    this_INT_14=(Token)match(input,RULE_INT,FOLLOW_6); 

                    				current.merge(this_INT_14);
                    			

                    				newLeafNode(this_INT_14, grammarAccess.getValueAccess().getINTTerminalRuleCall_6_0());
                    			
                    kw=(Token)match(input,12,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getValueAccess().getPlusSignKeyword_6_1());
                    			
                    // InternalT1.g:262:4: (this_INT_16= RULE_INT )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_INT) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalT1.g:263:5: this_INT_16= RULE_INT
                    	    {
                    	    this_INT_16=(Token)match(input,RULE_INT,FOLLOW_5); 

                    	    					current.merge(this_INT_16);
                    	    				

                    	    					newLeafNode(this_INT_16, grammarAccess.getValueAccess().getINTTerminalRuleCall_6_2());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 8 :
                    // InternalT1.g:273:3: (this_INT_17= RULE_INT kw= '-' this_INT_19= RULE_INT )
                    {
                    // InternalT1.g:273:3: (this_INT_17= RULE_INT kw= '-' this_INT_19= RULE_INT )
                    // InternalT1.g:274:4: this_INT_17= RULE_INT kw= '-' this_INT_19= RULE_INT
                    {
                    this_INT_17=(Token)match(input,RULE_INT,FOLLOW_9); 

                    				current.merge(this_INT_17);
                    			

                    				newLeafNode(this_INT_17, grammarAccess.getValueAccess().getINTTerminalRuleCall_7_0());
                    			
                    kw=(Token)match(input,13,FOLLOW_7); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getValueAccess().getHyphenMinusKeyword_7_1());
                    			
                    this_INT_19=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_19);
                    			

                    				newLeafNode(this_INT_19, grammarAccess.getValueAccess().getINTTerminalRuleCall_7_2());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalT1.g:295:3: (this_INT_20= RULE_INT kw= '-' (this_INT_22= RULE_INT )? kw= '.' (this_INT_24= RULE_INT )* )
                    {
                    // InternalT1.g:295:3: (this_INT_20= RULE_INT kw= '-' (this_INT_22= RULE_INT )? kw= '.' (this_INT_24= RULE_INT )* )
                    // InternalT1.g:296:4: this_INT_20= RULE_INT kw= '-' (this_INT_22= RULE_INT )? kw= '.' (this_INT_24= RULE_INT )*
                    {
                    this_INT_20=(Token)match(input,RULE_INT,FOLLOW_9); 

                    				current.merge(this_INT_20);
                    			

                    				newLeafNode(this_INT_20, grammarAccess.getValueAccess().getINTTerminalRuleCall_8_0());
                    			
                    kw=(Token)match(input,13,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getValueAccess().getHyphenMinusKeyword_8_1());
                    			
                    // InternalT1.g:308:4: (this_INT_22= RULE_INT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_INT) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalT1.g:309:5: this_INT_22= RULE_INT
                            {
                            this_INT_22=(Token)match(input,RULE_INT,FOLLOW_4); 

                            					current.merge(this_INT_22);
                            				

                            					newLeafNode(this_INT_22, grammarAccess.getValueAccess().getINTTerminalRuleCall_8_2());
                            				

                            }
                            break;

                    }

                    kw=(Token)match(input,11,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getValueAccess().getFullStopKeyword_8_3());
                    			
                    // InternalT1.g:322:4: (this_INT_24= RULE_INT )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_INT) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalT1.g:323:5: this_INT_24= RULE_INT
                    	    {
                    	    this_INT_24=(Token)match(input,RULE_INT,FOLLOW_5); 

                    	    					current.merge(this_INT_24);
                    	    				

                    	    					newLeafNode(this_INT_24, grammarAccess.getValueAccess().getINTTerminalRuleCall_8_4());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 10 :
                    // InternalT1.g:333:3: (this_INT_25= RULE_INT kw= '-' (this_INT_27= RULE_INT )* )
                    {
                    // InternalT1.g:333:3: (this_INT_25= RULE_INT kw= '-' (this_INT_27= RULE_INT )* )
                    // InternalT1.g:334:4: this_INT_25= RULE_INT kw= '-' (this_INT_27= RULE_INT )*
                    {
                    this_INT_25=(Token)match(input,RULE_INT,FOLLOW_9); 

                    				current.merge(this_INT_25);
                    			

                    				newLeafNode(this_INT_25, grammarAccess.getValueAccess().getINTTerminalRuleCall_9_0());
                    			
                    kw=(Token)match(input,13,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getValueAccess().getHyphenMinusKeyword_9_1());
                    			
                    // InternalT1.g:346:4: (this_INT_27= RULE_INT )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_INT) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalT1.g:347:5: this_INT_27= RULE_INT
                    	    {
                    	    this_INT_27=(Token)match(input,RULE_INT,FOLLOW_5); 

                    	    					current.merge(this_INT_27);
                    	    				

                    	    					newLeafNode(this_INT_27, grammarAccess.getValueAccess().getINTTerminalRuleCall_9_2());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 11 :
                    // InternalT1.g:357:3: ( (this_INT_28= RULE_INT )? kw= '.' (this_INT_30= RULE_INT )* kw= '+' this_INT_32= RULE_INT )
                    {
                    // InternalT1.g:357:3: ( (this_INT_28= RULE_INT )? kw= '.' (this_INT_30= RULE_INT )* kw= '+' this_INT_32= RULE_INT )
                    // InternalT1.g:358:4: (this_INT_28= RULE_INT )? kw= '.' (this_INT_30= RULE_INT )* kw= '+' this_INT_32= RULE_INT
                    {
                    // InternalT1.g:358:4: (this_INT_28= RULE_INT )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_INT) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalT1.g:359:5: this_INT_28= RULE_INT
                            {
                            this_INT_28=(Token)match(input,RULE_INT,FOLLOW_4); 

                            					current.merge(this_INT_28);
                            				

                            					newLeafNode(this_INT_28, grammarAccess.getValueAccess().getINTTerminalRuleCall_10_0());
                            				

                            }
                            break;

                    }

                    kw=(Token)match(input,11,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getValueAccess().getFullStopKeyword_10_1());
                    			
                    // InternalT1.g:372:4: (this_INT_30= RULE_INT )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_INT) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalT1.g:373:5: this_INT_30= RULE_INT
                    	    {
                    	    this_INT_30=(Token)match(input,RULE_INT,FOLLOW_10); 

                    	    					current.merge(this_INT_30);
                    	    				

                    	    					newLeafNode(this_INT_30, grammarAccess.getValueAccess().getINTTerminalRuleCall_10_2());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    kw=(Token)match(input,12,FOLLOW_7); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getValueAccess().getPlusSignKeyword_10_3());
                    			
                    this_INT_32=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_32);
                    			

                    				newLeafNode(this_INT_32, grammarAccess.getValueAccess().getINTTerminalRuleCall_10_4());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalT1.g:395:3: (kw= '-' (this_INT_34= RULE_INT )* )
                    {
                    // InternalT1.g:395:3: (kw= '-' (this_INT_34= RULE_INT )* )
                    // InternalT1.g:396:4: kw= '-' (this_INT_34= RULE_INT )*
                    {
                    kw=(Token)match(input,13,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getValueAccess().getHyphenMinusKeyword_11_0());
                    			
                    // InternalT1.g:401:4: (this_INT_34= RULE_INT )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_INT) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalT1.g:402:5: this_INT_34= RULE_INT
                    	    {
                    	    this_INT_34=(Token)match(input,RULE_INT,FOLLOW_5); 

                    	    					current.merge(this_INT_34);
                    	    				

                    	    					newLeafNode(this_INT_34, grammarAccess.getValueAccess().getINTTerminalRuleCall_11_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 13 :
                    // InternalT1.g:412:3: (kw= '-' this_INT_36= RULE_INT )*
                    {
                    // InternalT1.g:412:3: (kw= '-' this_INT_36= RULE_INT )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==13) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalT1.g:413:4: kw= '-' this_INT_36= RULE_INT
                    	    {
                    	    kw=(Token)match(input,13,FOLLOW_7); 

                    	    				current.merge(kw);
                    	    				newLeafNode(kw, grammarAccess.getValueAccess().getHyphenMinusKeyword_12_0());
                    	    			
                    	    this_INT_36=(Token)match(input,RULE_INT,FOLLOW_11); 

                    	    				current.merge(this_INT_36);
                    	    			

                    	    				newLeafNode(this_INT_36, grammarAccess.getValueAccess().getINTTerminalRuleCall_12_1());
                    	    			

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;
                case 14 :
                    // InternalT1.g:427:3: (kw= '-' (this_INT_38= RULE_INT )* kw= '+' (kw= '.' )? (this_INT_41= RULE_INT )* )
                    {
                    // InternalT1.g:427:3: (kw= '-' (this_INT_38= RULE_INT )* kw= '+' (kw= '.' )? (this_INT_41= RULE_INT )* )
                    // InternalT1.g:428:4: kw= '-' (this_INT_38= RULE_INT )* kw= '+' (kw= '.' )? (this_INT_41= RULE_INT )*
                    {
                    kw=(Token)match(input,13,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getValueAccess().getHyphenMinusKeyword_13_0());
                    			
                    // InternalT1.g:433:4: (this_INT_38= RULE_INT )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_INT) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalT1.g:434:5: this_INT_38= RULE_INT
                    	    {
                    	    this_INT_38=(Token)match(input,RULE_INT,FOLLOW_10); 

                    	    					current.merge(this_INT_38);
                    	    				

                    	    					newLeafNode(this_INT_38, grammarAccess.getValueAccess().getINTTerminalRuleCall_13_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    kw=(Token)match(input,12,FOLLOW_12); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getValueAccess().getPlusSignKeyword_13_2());
                    			
                    // InternalT1.g:447:4: (kw= '.' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==11) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalT1.g:448:5: kw= '.'
                            {
                            kw=(Token)match(input,11,FOLLOW_5); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getValueAccess().getFullStopKeyword_13_3());
                            				

                            }
                            break;

                    }

                    // InternalT1.g:454:4: (this_INT_41= RULE_INT )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_INT) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalT1.g:455:5: this_INT_41= RULE_INT
                    	    {
                    	    this_INT_41=(Token)match(input,RULE_INT,FOLLOW_5); 

                    	    					current.merge(this_INT_41);
                    	    				

                    	    					newLeafNode(this_INT_41, grammarAccess.getValueAccess().getINTTerminalRuleCall_13_4());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 15 :
                    // InternalT1.g:465:3: (kw= '-' this_INT_43= RULE_INT kw= '-' (this_INT_45= RULE_INT )? kw= '.' (this_INT_47= RULE_INT )* )
                    {
                    // InternalT1.g:465:3: (kw= '-' this_INT_43= RULE_INT kw= '-' (this_INT_45= RULE_INT )? kw= '.' (this_INT_47= RULE_INT )* )
                    // InternalT1.g:466:4: kw= '-' this_INT_43= RULE_INT kw= '-' (this_INT_45= RULE_INT )? kw= '.' (this_INT_47= RULE_INT )*
                    {
                    kw=(Token)match(input,13,FOLLOW_7); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getValueAccess().getHyphenMinusKeyword_14_0());
                    			
                    this_INT_43=(Token)match(input,RULE_INT,FOLLOW_9); 

                    				current.merge(this_INT_43);
                    			

                    				newLeafNode(this_INT_43, grammarAccess.getValueAccess().getINTTerminalRuleCall_14_1());
                    			
                    kw=(Token)match(input,13,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getValueAccess().getHyphenMinusKeyword_14_2());
                    			
                    // InternalT1.g:483:4: (this_INT_45= RULE_INT )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_INT) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalT1.g:484:5: this_INT_45= RULE_INT
                            {
                            this_INT_45=(Token)match(input,RULE_INT,FOLLOW_4); 

                            					current.merge(this_INT_45);
                            				

                            					newLeafNode(this_INT_45, grammarAccess.getValueAccess().getINTTerminalRuleCall_14_3());
                            				

                            }
                            break;

                    }

                    kw=(Token)match(input,11,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getValueAccess().getFullStopKeyword_14_4());
                    			
                    // InternalT1.g:497:4: (this_INT_47= RULE_INT )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_INT) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalT1.g:498:5: this_INT_47= RULE_INT
                    	    {
                    	    this_INT_47=(Token)match(input,RULE_INT,FOLLOW_5); 

                    	    					current.merge(this_INT_47);
                    	    				

                    	    					newLeafNode(this_INT_47, grammarAccess.getValueAccess().getINTTerminalRuleCall_14_5());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
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
    // InternalT1.g:511:1: entryRuleAttribution returns [String current=null] : iv_ruleAttribution= ruleAttribution EOF ;
    public final String entryRuleAttribution() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttribution = null;


        try {
            // InternalT1.g:511:51: (iv_ruleAttribution= ruleAttribution EOF )
            // InternalT1.g:512:2: iv_ruleAttribution= ruleAttribution EOF
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
    // InternalT1.g:518:1: ruleAttribution returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' this_Value_1= ruleValue )* ;
    public final AntlrDatatypeRuleToken ruleAttribution() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Value_1 = null;



        	enterRule();

        try {
            // InternalT1.g:524:2: ( (kw= '=' this_Value_1= ruleValue )* )
            // InternalT1.g:525:2: (kw= '=' this_Value_1= ruleValue )*
            {
            // InternalT1.g:525:2: (kw= '=' this_Value_1= ruleValue )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==14) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalT1.g:526:3: kw= '=' this_Value_1= ruleValue
            	    {
            	    kw=(Token)match(input,14,FOLLOW_13); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAttributionAccess().getEqualsSignKeyword_0());
            	    		

            	    			newCompositeNode(grammarAccess.getAttributionAccess().getValueParserRuleCall_1());
            	    		
            	    pushFollow(FOLLOW_14);
            	    this_Value_1=ruleValue();

            	    state._fsp--;


            	    			current.merge(this_Value_1);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalT1.g:545:1: entryRuleDeclaration returns [String current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final String entryRuleDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclaration = null;


        try {
            // InternalT1.g:545:51: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalT1.g:546:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalT1.g:552:1: ruleDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName this_Attribution_1= ruleAttribution ) ;
    public final AntlrDatatypeRuleToken ruleDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Attribution_1 = null;



        	enterRule();

        try {
            // InternalT1.g:558:2: ( (this_Name_0= ruleName this_Attribution_1= ruleAttribution ) )
            // InternalT1.g:559:2: (this_Name_0= ruleName this_Attribution_1= ruleAttribution )
            {
            // InternalT1.g:559:2: (this_Name_0= ruleName this_Attribution_1= ruleAttribution )
            // InternalT1.g:560:3: this_Name_0= ruleName this_Attribution_1= ruleAttribution
            {

            			newCompositeNode(grammarAccess.getDeclarationAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
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
    // InternalT1.g:584:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalT1.g:584:44: (iv_ruleVar= ruleVar EOF )
            // InternalT1.g:585:2: iv_ruleVar= ruleVar EOF
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
    // InternalT1.g:591:1: ruleVar returns [EObject current=null] : (otherlv_0= 'var' ( (lv_declarations_1_0= ruleDeclaration ) ) (otherlv_2= ',' ( (lv_declarations_3_0= ruleDeclaration ) ) )* (otherlv_4= ';' )? ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_declarations_1_0 = null;

        AntlrDatatypeRuleToken lv_declarations_3_0 = null;



        	enterRule();

        try {
            // InternalT1.g:597:2: ( (otherlv_0= 'var' ( (lv_declarations_1_0= ruleDeclaration ) ) (otherlv_2= ',' ( (lv_declarations_3_0= ruleDeclaration ) ) )* (otherlv_4= ';' )? ) )
            // InternalT1.g:598:2: (otherlv_0= 'var' ( (lv_declarations_1_0= ruleDeclaration ) ) (otherlv_2= ',' ( (lv_declarations_3_0= ruleDeclaration ) ) )* (otherlv_4= ';' )? )
            {
            // InternalT1.g:598:2: (otherlv_0= 'var' ( (lv_declarations_1_0= ruleDeclaration ) ) (otherlv_2= ',' ( (lv_declarations_3_0= ruleDeclaration ) ) )* (otherlv_4= ';' )? )
            // InternalT1.g:599:3: otherlv_0= 'var' ( (lv_declarations_1_0= ruleDeclaration ) ) (otherlv_2= ',' ( (lv_declarations_3_0= ruleDeclaration ) ) )* (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getVarAccess().getVarKeyword_0());
            		
            // InternalT1.g:603:3: ( (lv_declarations_1_0= ruleDeclaration ) )
            // InternalT1.g:604:4: (lv_declarations_1_0= ruleDeclaration )
            {
            // InternalT1.g:604:4: (lv_declarations_1_0= ruleDeclaration )
            // InternalT1.g:605:5: lv_declarations_1_0= ruleDeclaration
            {

            					newCompositeNode(grammarAccess.getVarAccess().getDeclarationsDeclarationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalT1.g:622:3: (otherlv_2= ',' ( (lv_declarations_3_0= ruleDeclaration ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==16) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalT1.g:623:4: otherlv_2= ',' ( (lv_declarations_3_0= ruleDeclaration ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_16); 

            	    				newLeafNode(otherlv_2, grammarAccess.getVarAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalT1.g:627:4: ( (lv_declarations_3_0= ruleDeclaration ) )
            	    // InternalT1.g:628:5: (lv_declarations_3_0= ruleDeclaration )
            	    {
            	    // InternalT1.g:628:5: (lv_declarations_3_0= ruleDeclaration )
            	    // InternalT1.g:629:6: lv_declarations_3_0= ruleDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getVarAccess().getDeclarationsDeclarationParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
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
            	    break loop21;
                }
            } while (true);

            // InternalT1.g:647:3: (otherlv_4= ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==17) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalT1.g:648:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_2); 

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


    protected DFA19 dfa19 = new DFA19(this);
    static final String dfa_1s = "\32\uffff";
    static final String dfa_2s = "\1\6\2\uffff\1\10\1\14\1\17\1\uffff\1\22\1\uffff\1\24\1\14\2\uffff\1\17\2\uffff\1\30\2\uffff\1\31\2\uffff\1\17\3\uffff";
    static final String dfa_3s = "\1\4\2\uffff\1\13\2\6\1\uffff\1\6\1\uffff\2\6\2\uffff\1\6\2\uffff\1\13\2\uffff\1\13\2\uffff\1\6\3\uffff";
    static final String dfa_4s = "\1\21\2\uffff\3\21\1\uffff\1\21\1\uffff\2\21\2\uffff\1\21\2\uffff\1\21\2\uffff\1\21\2\uffff\1\21\3\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\3\uffff\1\15\1\uffff\1\3\2\uffff\1\13\1\4\1\uffff\1\16\1\14\1\uffff\1\11\1\12\1\uffff\1\7\1\6\1\uffff\1\17\1\10\1\5";
    static final String dfa_6s = "\32\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\4\uffff\1\4\1\uffff\1\5\4\6",
            "",
            "",
            "\1\4\1\11\1\7\4\10",
            "\1\12\5\uffff\1\13\1\uffff\4\14",
            "\1\15\5\uffff\1\16\1\uffff\4\17",
            "",
            "\1\20\4\uffff\1\21\2\uffff\4\22",
            "",
            "\1\23\4\uffff\1\25\2\uffff\4\24",
            "\1\12\5\uffff\1\13\1\uffff\4\14",
            "",
            "",
            "\1\26\5\uffff\1\16\1\27\4\17",
            "",
            "",
            "\1\21\2\uffff\4\30",
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

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "138:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | ( (this_INT_3= RULE_INT )? kw= '.' (this_INT_5= RULE_INT )* ) | (this_INT_6= RULE_INT kw= '+' this_INT_8= RULE_INT ) | (this_INT_9= RULE_INT kw= '+' (this_INT_11= RULE_INT )? kw= '.' (this_INT_13= RULE_INT )* ) | (this_INT_14= RULE_INT kw= '+' (this_INT_16= RULE_INT )* ) | (this_INT_17= RULE_INT kw= '-' this_INT_19= RULE_INT ) | (this_INT_20= RULE_INT kw= '-' (this_INT_22= RULE_INT )? kw= '.' (this_INT_24= RULE_INT )* ) | (this_INT_25= RULE_INT kw= '-' (this_INT_27= RULE_INT )* ) | ( (this_INT_28= RULE_INT )? kw= '.' (this_INT_30= RULE_INT )* kw= '+' this_INT_32= RULE_INT ) | (kw= '-' (this_INT_34= RULE_INT )* ) | (kw= '-' this_INT_36= RULE_INT )* | (kw= '-' (this_INT_38= RULE_INT )* kw= '+' (kw= '.' )? (this_INT_41= RULE_INT )* ) | (kw= '-' this_INT_43= RULE_INT kw= '-' (this_INT_45= RULE_INT )? kw= '.' (this_INT_47= RULE_INT )* ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000842L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000006870L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000030002L});

}