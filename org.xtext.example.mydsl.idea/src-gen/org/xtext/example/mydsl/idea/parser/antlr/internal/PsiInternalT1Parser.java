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

                if ( (LA1_0==15) ) {
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
    // PsiInternalT1.g:105:1: ruleValue returns [Boolean current=false] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | ( (this_INT_3= RULE_INT )? kw= '.' (this_INT_5= RULE_INT )* ) | (this_INT_6= RULE_INT kw= '+' this_INT_8= RULE_INT ) | (this_INT_9= RULE_INT kw= '+' (this_INT_11= RULE_INT )? kw= '.' (this_INT_13= RULE_INT )* ) | (this_INT_14= RULE_INT kw= '+' (this_INT_16= RULE_INT )* ) | (this_INT_17= RULE_INT kw= '-' this_INT_19= RULE_INT ) | (this_INT_20= RULE_INT kw= '-' (this_INT_22= RULE_INT )? kw= '.' (this_INT_24= RULE_INT )* ) | (this_INT_25= RULE_INT kw= '-' (this_INT_27= RULE_INT )* ) | ( (this_INT_28= RULE_INT )? kw= '.' (this_INT_30= RULE_INT )* kw= '+' this_INT_32= RULE_INT ) ) ;
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

        try {
            // PsiInternalT1.g:106:1: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | ( (this_INT_3= RULE_INT )? kw= '.' (this_INT_5= RULE_INT )* ) | (this_INT_6= RULE_INT kw= '+' this_INT_8= RULE_INT ) | (this_INT_9= RULE_INT kw= '+' (this_INT_11= RULE_INT )? kw= '.' (this_INT_13= RULE_INT )* ) | (this_INT_14= RULE_INT kw= '+' (this_INT_16= RULE_INT )* ) | (this_INT_17= RULE_INT kw= '-' this_INT_19= RULE_INT ) | (this_INT_20= RULE_INT kw= '-' (this_INT_22= RULE_INT )? kw= '.' (this_INT_24= RULE_INT )* ) | (this_INT_25= RULE_INT kw= '-' (this_INT_27= RULE_INT )* ) | ( (this_INT_28= RULE_INT )? kw= '.' (this_INT_30= RULE_INT )* kw= '+' this_INT_32= RULE_INT ) ) )
            // PsiInternalT1.g:107:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | ( (this_INT_3= RULE_INT )? kw= '.' (this_INT_5= RULE_INT )* ) | (this_INT_6= RULE_INT kw= '+' this_INT_8= RULE_INT ) | (this_INT_9= RULE_INT kw= '+' (this_INT_11= RULE_INT )? kw= '.' (this_INT_13= RULE_INT )* ) | (this_INT_14= RULE_INT kw= '+' (this_INT_16= RULE_INT )* ) | (this_INT_17= RULE_INT kw= '-' this_INT_19= RULE_INT ) | (this_INT_20= RULE_INT kw= '-' (this_INT_22= RULE_INT )? kw= '.' (this_INT_24= RULE_INT )* ) | (this_INT_25= RULE_INT kw= '-' (this_INT_27= RULE_INT )* ) | ( (this_INT_28= RULE_INT )? kw= '.' (this_INT_30= RULE_INT )* kw= '+' this_INT_32= RULE_INT ) )
            {
            // PsiInternalT1.g:107:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | ( (this_INT_3= RULE_INT )? kw= '.' (this_INT_5= RULE_INT )* ) | (this_INT_6= RULE_INT kw= '+' this_INT_8= RULE_INT ) | (this_INT_9= RULE_INT kw= '+' (this_INT_11= RULE_INT )? kw= '.' (this_INT_13= RULE_INT )* ) | (this_INT_14= RULE_INT kw= '+' (this_INT_16= RULE_INT )* ) | (this_INT_17= RULE_INT kw= '-' this_INT_19= RULE_INT ) | (this_INT_20= RULE_INT kw= '-' (this_INT_22= RULE_INT )? kw= '.' (this_INT_24= RULE_INT )* ) | (this_INT_25= RULE_INT kw= '-' (this_INT_27= RULE_INT )* ) | ( (this_INT_28= RULE_INT )? kw= '.' (this_INT_30= RULE_INT )* kw= '+' this_INT_32= RULE_INT ) )
            int alt12=11;
            alt12 = dfa12.predict(input);
            switch (alt12) {
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
                case 6 :
                    // PsiInternalT1.g:184:3: (this_INT_9= RULE_INT kw= '+' (this_INT_11= RULE_INT )? kw= '.' (this_INT_13= RULE_INT )* )
                    {
                    // PsiInternalT1.g:184:3: (this_INT_9= RULE_INT kw= '+' (this_INT_11= RULE_INT )? kw= '.' (this_INT_13= RULE_INT )* )
                    // PsiInternalT1.g:185:4: this_INT_9= RULE_INT kw= '+' (this_INT_11= RULE_INT )? kw= '.' (this_INT_13= RULE_INT )*
                    {

                    				markLeaf(elementTypeProvider.getValue_INTTerminalRuleCall_5_0ElementType());
                    			
                    this_INT_9=(Token)match(input,RULE_INT,FOLLOW_6); 

                    				doneLeaf(this_INT_9);
                    			

                    				markLeaf(elementTypeProvider.getValue_PlusSignKeyword_5_1ElementType());
                    			
                    kw=(Token)match(input,12,FOLLOW_8); 

                    				doneLeaf(kw);
                    			
                    // PsiInternalT1.g:199:4: (this_INT_11= RULE_INT )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_INT) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // PsiInternalT1.g:200:5: this_INT_11= RULE_INT
                            {

                            					markLeaf(elementTypeProvider.getValue_INTTerminalRuleCall_5_2ElementType());
                            				
                            this_INT_11=(Token)match(input,RULE_INT,FOLLOW_4); 

                            					doneLeaf(this_INT_11);
                            				

                            }
                            break;

                    }


                    				markLeaf(elementTypeProvider.getValue_FullStopKeyword_5_3ElementType());
                    			
                    kw=(Token)match(input,11,FOLLOW_5); 

                    				doneLeaf(kw);
                    			
                    // PsiInternalT1.g:215:4: (this_INT_13= RULE_INT )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_INT) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // PsiInternalT1.g:216:5: this_INT_13= RULE_INT
                    	    {

                    	    					markLeaf(elementTypeProvider.getValue_INTTerminalRuleCall_5_4ElementType());
                    	    				
                    	    this_INT_13=(Token)match(input,RULE_INT,FOLLOW_5); 

                    	    					doneLeaf(this_INT_13);
                    	    				

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
                    // PsiInternalT1.g:226:3: (this_INT_14= RULE_INT kw= '+' (this_INT_16= RULE_INT )* )
                    {
                    // PsiInternalT1.g:226:3: (this_INT_14= RULE_INT kw= '+' (this_INT_16= RULE_INT )* )
                    // PsiInternalT1.g:227:4: this_INT_14= RULE_INT kw= '+' (this_INT_16= RULE_INT )*
                    {

                    				markLeaf(elementTypeProvider.getValue_INTTerminalRuleCall_6_0ElementType());
                    			
                    this_INT_14=(Token)match(input,RULE_INT,FOLLOW_6); 

                    				doneLeaf(this_INT_14);
                    			

                    				markLeaf(elementTypeProvider.getValue_PlusSignKeyword_6_1ElementType());
                    			
                    kw=(Token)match(input,12,FOLLOW_5); 

                    				doneLeaf(kw);
                    			
                    // PsiInternalT1.g:241:4: (this_INT_16= RULE_INT )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_INT) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // PsiInternalT1.g:242:5: this_INT_16= RULE_INT
                    	    {

                    	    					markLeaf(elementTypeProvider.getValue_INTTerminalRuleCall_6_2ElementType());
                    	    				
                    	    this_INT_16=(Token)match(input,RULE_INT,FOLLOW_5); 

                    	    					doneLeaf(this_INT_16);
                    	    				

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
                    // PsiInternalT1.g:252:3: (this_INT_17= RULE_INT kw= '-' this_INT_19= RULE_INT )
                    {
                    // PsiInternalT1.g:252:3: (this_INT_17= RULE_INT kw= '-' this_INT_19= RULE_INT )
                    // PsiInternalT1.g:253:4: this_INT_17= RULE_INT kw= '-' this_INT_19= RULE_INT
                    {

                    				markLeaf(elementTypeProvider.getValue_INTTerminalRuleCall_7_0ElementType());
                    			
                    this_INT_17=(Token)match(input,RULE_INT,FOLLOW_9); 

                    				doneLeaf(this_INT_17);
                    			

                    				markLeaf(elementTypeProvider.getValue_HyphenMinusKeyword_7_1ElementType());
                    			
                    kw=(Token)match(input,13,FOLLOW_7); 

                    				doneLeaf(kw);
                    			

                    				markLeaf(elementTypeProvider.getValue_INTTerminalRuleCall_7_2ElementType());
                    			
                    this_INT_19=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				doneLeaf(this_INT_19);
                    			

                    }


                    }
                    break;
                case 9 :
                    // PsiInternalT1.g:276:3: (this_INT_20= RULE_INT kw= '-' (this_INT_22= RULE_INT )? kw= '.' (this_INT_24= RULE_INT )* )
                    {
                    // PsiInternalT1.g:276:3: (this_INT_20= RULE_INT kw= '-' (this_INT_22= RULE_INT )? kw= '.' (this_INT_24= RULE_INT )* )
                    // PsiInternalT1.g:277:4: this_INT_20= RULE_INT kw= '-' (this_INT_22= RULE_INT )? kw= '.' (this_INT_24= RULE_INT )*
                    {

                    				markLeaf(elementTypeProvider.getValue_INTTerminalRuleCall_8_0ElementType());
                    			
                    this_INT_20=(Token)match(input,RULE_INT,FOLLOW_9); 

                    				doneLeaf(this_INT_20);
                    			

                    				markLeaf(elementTypeProvider.getValue_HyphenMinusKeyword_8_1ElementType());
                    			
                    kw=(Token)match(input,13,FOLLOW_8); 

                    				doneLeaf(kw);
                    			
                    // PsiInternalT1.g:291:4: (this_INT_22= RULE_INT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_INT) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // PsiInternalT1.g:292:5: this_INT_22= RULE_INT
                            {

                            					markLeaf(elementTypeProvider.getValue_INTTerminalRuleCall_8_2ElementType());
                            				
                            this_INT_22=(Token)match(input,RULE_INT,FOLLOW_4); 

                            					doneLeaf(this_INT_22);
                            				

                            }
                            break;

                    }


                    				markLeaf(elementTypeProvider.getValue_FullStopKeyword_8_3ElementType());
                    			
                    kw=(Token)match(input,11,FOLLOW_5); 

                    				doneLeaf(kw);
                    			
                    // PsiInternalT1.g:307:4: (this_INT_24= RULE_INT )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_INT) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // PsiInternalT1.g:308:5: this_INT_24= RULE_INT
                    	    {

                    	    					markLeaf(elementTypeProvider.getValue_INTTerminalRuleCall_8_4ElementType());
                    	    				
                    	    this_INT_24=(Token)match(input,RULE_INT,FOLLOW_5); 

                    	    					doneLeaf(this_INT_24);
                    	    				

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
                    // PsiInternalT1.g:318:3: (this_INT_25= RULE_INT kw= '-' (this_INT_27= RULE_INT )* )
                    {
                    // PsiInternalT1.g:318:3: (this_INT_25= RULE_INT kw= '-' (this_INT_27= RULE_INT )* )
                    // PsiInternalT1.g:319:4: this_INT_25= RULE_INT kw= '-' (this_INT_27= RULE_INT )*
                    {

                    				markLeaf(elementTypeProvider.getValue_INTTerminalRuleCall_9_0ElementType());
                    			
                    this_INT_25=(Token)match(input,RULE_INT,FOLLOW_9); 

                    				doneLeaf(this_INT_25);
                    			

                    				markLeaf(elementTypeProvider.getValue_HyphenMinusKeyword_9_1ElementType());
                    			
                    kw=(Token)match(input,13,FOLLOW_5); 

                    				doneLeaf(kw);
                    			
                    // PsiInternalT1.g:333:4: (this_INT_27= RULE_INT )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_INT) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // PsiInternalT1.g:334:5: this_INT_27= RULE_INT
                    	    {

                    	    					markLeaf(elementTypeProvider.getValue_INTTerminalRuleCall_9_2ElementType());
                    	    				
                    	    this_INT_27=(Token)match(input,RULE_INT,FOLLOW_5); 

                    	    					doneLeaf(this_INT_27);
                    	    				

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
                    // PsiInternalT1.g:344:3: ( (this_INT_28= RULE_INT )? kw= '.' (this_INT_30= RULE_INT )* kw= '+' this_INT_32= RULE_INT )
                    {
                    // PsiInternalT1.g:344:3: ( (this_INT_28= RULE_INT )? kw= '.' (this_INT_30= RULE_INT )* kw= '+' this_INT_32= RULE_INT )
                    // PsiInternalT1.g:345:4: (this_INT_28= RULE_INT )? kw= '.' (this_INT_30= RULE_INT )* kw= '+' this_INT_32= RULE_INT
                    {
                    // PsiInternalT1.g:345:4: (this_INT_28= RULE_INT )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_INT) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // PsiInternalT1.g:346:5: this_INT_28= RULE_INT
                            {

                            					markLeaf(elementTypeProvider.getValue_INTTerminalRuleCall_10_0ElementType());
                            				
                            this_INT_28=(Token)match(input,RULE_INT,FOLLOW_4); 

                            					doneLeaf(this_INT_28);
                            				

                            }
                            break;

                    }


                    				markLeaf(elementTypeProvider.getValue_FullStopKeyword_10_1ElementType());
                    			
                    kw=(Token)match(input,11,FOLLOW_10); 

                    				doneLeaf(kw);
                    			
                    // PsiInternalT1.g:361:4: (this_INT_30= RULE_INT )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_INT) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // PsiInternalT1.g:362:5: this_INT_30= RULE_INT
                    	    {

                    	    					markLeaf(elementTypeProvider.getValue_INTTerminalRuleCall_10_2ElementType());
                    	    				
                    	    this_INT_30=(Token)match(input,RULE_INT,FOLLOW_10); 

                    	    					doneLeaf(this_INT_30);
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    				markLeaf(elementTypeProvider.getValue_PlusSignKeyword_10_3ElementType());
                    			
                    kw=(Token)match(input,12,FOLLOW_7); 

                    				doneLeaf(kw);
                    			

                    				markLeaf(elementTypeProvider.getValue_INTTerminalRuleCall_10_4ElementType());
                    			
                    this_INT_32=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				doneLeaf(this_INT_32);
                    			

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
    // PsiInternalT1.g:389:1: entryRuleAttribution returns [Boolean current=false] : iv_ruleAttribution= ruleAttribution EOF ;
    public final Boolean entryRuleAttribution() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAttribution = null;


        try {
            // PsiInternalT1.g:389:53: (iv_ruleAttribution= ruleAttribution EOF )
            // PsiInternalT1.g:390:2: iv_ruleAttribution= ruleAttribution EOF
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
    // PsiInternalT1.g:396:1: ruleAttribution returns [Boolean current=false] : (kw= '=' ruleValue )* ;
    public final Boolean ruleAttribution() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalT1.g:397:1: ( (kw= '=' ruleValue )* )
            // PsiInternalT1.g:398:2: (kw= '=' ruleValue )*
            {
            // PsiInternalT1.g:398:2: (kw= '=' ruleValue )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==14) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // PsiInternalT1.g:399:3: kw= '=' ruleValue
            	    {

            	    			markLeaf(elementTypeProvider.getAttribution_EqualsSignKeyword_0ElementType());
            	    		
            	    kw=(Token)match(input,14,FOLLOW_11); 

            	    			doneLeaf(kw);
            	    		

            	    			markComposite(elementTypeProvider.getAttribution_ValueParserRuleCall_1ElementType());
            	    		
            	    pushFollow(FOLLOW_12);
            	    ruleValue();

            	    state._fsp--;


            	    			doneComposite();
            	    		

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // PsiInternalT1.g:417:1: entryRuleDeclaration returns [Boolean current=false] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final Boolean entryRuleDeclaration() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleDeclaration = null;


        try {
            // PsiInternalT1.g:417:53: (iv_ruleDeclaration= ruleDeclaration EOF )
            // PsiInternalT1.g:418:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // PsiInternalT1.g:424:1: ruleDeclaration returns [Boolean current=false] : ( ruleName ruleAttribution ) ;
    public final Boolean ruleDeclaration() throws RecognitionException {
        Boolean current = false;

        try {
            // PsiInternalT1.g:425:1: ( ( ruleName ruleAttribution ) )
            // PsiInternalT1.g:426:2: ( ruleName ruleAttribution )
            {
            // PsiInternalT1.g:426:2: ( ruleName ruleAttribution )
            // PsiInternalT1.g:427:3: ruleName ruleAttribution
            {

            			markComposite(elementTypeProvider.getDeclaration_NameParserRuleCall_0ElementType());
            		
            pushFollow(FOLLOW_13);
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
    // PsiInternalT1.g:445:1: entryRuleVar returns [Boolean current=false] : iv_ruleVar= ruleVar EOF ;
    public final Boolean entryRuleVar() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleVar = null;


        try {
            // PsiInternalT1.g:445:45: (iv_ruleVar= ruleVar EOF )
            // PsiInternalT1.g:446:2: iv_ruleVar= ruleVar EOF
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
    // PsiInternalT1.g:452:1: ruleVar returns [Boolean current=false] : (otherlv_0= 'var' ( (lv_declarations_1_0= ruleDeclaration ) ) (otherlv_2= ',' ( (lv_declarations_3_0= ruleDeclaration ) ) )* (otherlv_4= ';' )? ) ;
    public final Boolean ruleVar() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Boolean lv_declarations_1_0 = null;

        Boolean lv_declarations_3_0 = null;


        try {
            // PsiInternalT1.g:453:1: ( (otherlv_0= 'var' ( (lv_declarations_1_0= ruleDeclaration ) ) (otherlv_2= ',' ( (lv_declarations_3_0= ruleDeclaration ) ) )* (otherlv_4= ';' )? ) )
            // PsiInternalT1.g:454:2: (otherlv_0= 'var' ( (lv_declarations_1_0= ruleDeclaration ) ) (otherlv_2= ',' ( (lv_declarations_3_0= ruleDeclaration ) ) )* (otherlv_4= ';' )? )
            {
            // PsiInternalT1.g:454:2: (otherlv_0= 'var' ( (lv_declarations_1_0= ruleDeclaration ) ) (otherlv_2= ',' ( (lv_declarations_3_0= ruleDeclaration ) ) )* (otherlv_4= ';' )? )
            // PsiInternalT1.g:455:3: otherlv_0= 'var' ( (lv_declarations_1_0= ruleDeclaration ) ) (otherlv_2= ',' ( (lv_declarations_3_0= ruleDeclaration ) ) )* (otherlv_4= ';' )?
            {

            			markLeaf(elementTypeProvider.getVar_VarKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,15,FOLLOW_14); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalT1.g:462:3: ( (lv_declarations_1_0= ruleDeclaration ) )
            // PsiInternalT1.g:463:4: (lv_declarations_1_0= ruleDeclaration )
            {
            // PsiInternalT1.g:463:4: (lv_declarations_1_0= ruleDeclaration )
            // PsiInternalT1.g:464:5: lv_declarations_1_0= ruleDeclaration
            {

            					markComposite(elementTypeProvider.getVar_DeclarationsDeclarationParserRuleCall_1_0ElementType());
            				
            pushFollow(FOLLOW_15);
            lv_declarations_1_0=ruleDeclaration();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalT1.g:477:3: (otherlv_2= ',' ( (lv_declarations_3_0= ruleDeclaration ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // PsiInternalT1.g:478:4: otherlv_2= ',' ( (lv_declarations_3_0= ruleDeclaration ) )
            	    {

            	    				markLeaf(elementTypeProvider.getVar_CommaKeyword_2_0ElementType());
            	    			
            	    otherlv_2=(Token)match(input,16,FOLLOW_14); 

            	    				doneLeaf(otherlv_2);
            	    			
            	    // PsiInternalT1.g:485:4: ( (lv_declarations_3_0= ruleDeclaration ) )
            	    // PsiInternalT1.g:486:5: (lv_declarations_3_0= ruleDeclaration )
            	    {
            	    // PsiInternalT1.g:486:5: (lv_declarations_3_0= ruleDeclaration )
            	    // PsiInternalT1.g:487:6: lv_declarations_3_0= ruleDeclaration
            	    {

            	    						markComposite(elementTypeProvider.getVar_DeclarationsDeclarationParserRuleCall_2_1_0ElementType());
            	    					
            	    pushFollow(FOLLOW_15);
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
            	    break loop14;
                }
            } while (true);

            // PsiInternalT1.g:501:3: (otherlv_4= ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==17) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // PsiInternalT1.g:502:4: otherlv_4= ';'
                    {

                    				markLeaf(elementTypeProvider.getVar_SemicolonKeyword_3ElementType());
                    			
                    otherlv_4=(Token)match(input,17,FOLLOW_2); 

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


    protected DFA12 dfa12 = new DFA12(this);
    static final String dfa_1s = "\23\uffff";
    static final String dfa_2s = "\3\uffff\1\7\1\11\1\15\1\20\1\uffff\1\11\2\uffff\1\21\2\uffff\1\22\4\uffff";
    static final String dfa_3s = "\1\4\2\uffff\1\13\3\6\1\uffff\1\6\2\uffff\1\13\2\uffff\1\13\4\uffff";
    static final String dfa_4s = "\1\13\2\uffff\4\21\1\uffff\1\21\2\uffff\1\21\2\uffff\1\21\4\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\4\uffff\1\3\1\uffff\1\4\1\13\1\uffff\1\11\1\12\1\uffff\1\6\1\7\1\10\1\5";
    static final String dfa_6s = "\23\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\4\uffff\1\4",
            "",
            "",
            "\1\4\1\6\1\5\4\7",
            "\1\10\5\uffff\1\12\1\uffff\4\11",
            "\1\13\4\uffff\1\14\2\uffff\4\15",
            "\1\16\4\uffff\1\17\2\uffff\4\20",
            "",
            "\1\10\5\uffff\1\12\1\uffff\4\11",
            "",
            "",
            "\1\14\2\uffff\4\21",
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

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "107:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | ( (this_INT_3= RULE_INT )? kw= '.' (this_INT_5= RULE_INT )* ) | (this_INT_6= RULE_INT kw= '+' this_INT_8= RULE_INT ) | (this_INT_9= RULE_INT kw= '+' (this_INT_11= RULE_INT )? kw= '.' (this_INT_13= RULE_INT )* ) | (this_INT_14= RULE_INT kw= '+' (this_INT_16= RULE_INT )* ) | (this_INT_17= RULE_INT kw= '-' this_INT_19= RULE_INT ) | (this_INT_20= RULE_INT kw= '-' (this_INT_22= RULE_INT )? kw= '.' (this_INT_24= RULE_INT )* ) | (this_INT_25= RULE_INT kw= '-' (this_INT_27= RULE_INT )* ) | ( (this_INT_28= RULE_INT )? kw= '.' (this_INT_30= RULE_INT )* kw= '+' this_INT_32= RULE_INT ) )";
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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000870L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000030002L});

}