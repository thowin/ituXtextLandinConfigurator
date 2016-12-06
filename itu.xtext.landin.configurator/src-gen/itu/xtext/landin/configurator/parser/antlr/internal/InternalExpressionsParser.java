package itu.xtext.landin.configurator.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import itu.xtext.landin.configurator.services.ExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpressionsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'('", "')'", "','", "'and'", "'or'", "'equals'", "'requires'", "'is'", "'are'", "'excludes'", "'not'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalExpressionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExpressionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExpressionsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalExpressions.g"; }



     	private ExpressionsGrammarAccess grammarAccess;

        public InternalExpressionsParser(TokenStream input, ExpressionsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ExpressionsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalExpressions.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalExpressions.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalExpressions.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalExpressions.g:71:1: ruleModel returns [EObject current=null] : ( (lv_configurator_0_0= ruleConfigurator ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_configurator_0_0 = null;



        	enterRule();

        try {
            // InternalExpressions.g:77:2: ( ( (lv_configurator_0_0= ruleConfigurator ) ) )
            // InternalExpressions.g:78:2: ( (lv_configurator_0_0= ruleConfigurator ) )
            {
            // InternalExpressions.g:78:2: ( (lv_configurator_0_0= ruleConfigurator ) )
            // InternalExpressions.g:79:3: (lv_configurator_0_0= ruleConfigurator )
            {
            // InternalExpressions.g:79:3: (lv_configurator_0_0= ruleConfigurator )
            // InternalExpressions.g:80:4: lv_configurator_0_0= ruleConfigurator
            {

            				newCompositeNode(grammarAccess.getModelAccess().getConfiguratorConfiguratorParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_configurator_0_0=ruleConfigurator();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				add(
            					current,
            					"configurator",
            					lv_configurator_0_0,
            					"itu.xtext.landin.configurator.Expressions.Configurator");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleConfigurator"
    // InternalExpressions.g:100:1: entryRuleConfigurator returns [EObject current=null] : iv_ruleConfigurator= ruleConfigurator EOF ;
    public final EObject entryRuleConfigurator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurator = null;


        try {
            // InternalExpressions.g:100:53: (iv_ruleConfigurator= ruleConfigurator EOF )
            // InternalExpressions.g:101:2: iv_ruleConfigurator= ruleConfigurator EOF
            {
             newCompositeNode(grammarAccess.getConfiguratorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigurator=ruleConfigurator();

            state._fsp--;

             current =iv_ruleConfigurator; 
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
    // $ANTLR end "entryRuleConfigurator"


    // $ANTLR start "ruleConfigurator"
    // InternalExpressions.g:107:1: ruleConfigurator returns [EObject current=null] : ( ( (lv_title_0_0= ruleTitle ) ) ( (lv_expression_1_0= ruleExpression ) )+ ) ;
    public final EObject ruleConfigurator() throws RecognitionException {
        EObject current = null;

        EObject lv_title_0_0 = null;

        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalExpressions.g:113:2: ( ( ( (lv_title_0_0= ruleTitle ) ) ( (lv_expression_1_0= ruleExpression ) )+ ) )
            // InternalExpressions.g:114:2: ( ( (lv_title_0_0= ruleTitle ) ) ( (lv_expression_1_0= ruleExpression ) )+ )
            {
            // InternalExpressions.g:114:2: ( ( (lv_title_0_0= ruleTitle ) ) ( (lv_expression_1_0= ruleExpression ) )+ )
            // InternalExpressions.g:115:3: ( (lv_title_0_0= ruleTitle ) ) ( (lv_expression_1_0= ruleExpression ) )+
            {
            // InternalExpressions.g:115:3: ( (lv_title_0_0= ruleTitle ) )
            // InternalExpressions.g:116:4: (lv_title_0_0= ruleTitle )
            {
            // InternalExpressions.g:116:4: (lv_title_0_0= ruleTitle )
            // InternalExpressions.g:117:5: lv_title_0_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getConfiguratorAccess().getTitleTitleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_title_0_0=ruleTitle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfiguratorRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_0_0,
            						"itu.xtext.landin.configurator.Expressions.Title");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalExpressions.g:134:3: ( (lv_expression_1_0= ruleExpression ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalExpressions.g:135:4: (lv_expression_1_0= ruleExpression )
            	    {
            	    // InternalExpressions.g:135:4: (lv_expression_1_0= ruleExpression )
            	    // InternalExpressions.g:136:5: lv_expression_1_0= ruleExpression
            	    {

            	    					newCompositeNode(grammarAccess.getConfiguratorAccess().getExpressionExpressionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_expression_1_0=ruleExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfiguratorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"expression",
            	    						lv_expression_1_0,
            	    						"itu.xtext.landin.configurator.Expressions.Expression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


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
    // $ANTLR end "ruleConfigurator"


    // $ANTLR start "entryRuleTitle"
    // InternalExpressions.g:157:1: entryRuleTitle returns [EObject current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final EObject entryRuleTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitle = null;


        try {
            // InternalExpressions.g:157:46: (iv_ruleTitle= ruleTitle EOF )
            // InternalExpressions.g:158:2: iv_ruleTitle= ruleTitle EOF
            {
             newCompositeNode(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTitle=ruleTitle();

            state._fsp--;

             current =iv_ruleTitle; 
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
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalExpressions.g:164:1: ruleTitle returns [EObject current=null] : this_FreeText_0= ruleFreeText ;
    public final EObject ruleTitle() throws RecognitionException {
        EObject current = null;

        EObject this_FreeText_0 = null;



        	enterRule();

        try {
            // InternalExpressions.g:170:2: (this_FreeText_0= ruleFreeText )
            // InternalExpressions.g:171:2: this_FreeText_0= ruleFreeText
            {

            		newCompositeNode(grammarAccess.getTitleAccess().getFreeTextParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_FreeText_0=ruleFreeText();

            state._fsp--;


            		current = this_FreeText_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleExpression"
    // InternalExpressions.g:182:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalExpressions.g:182:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalExpressions.g:183:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalExpressions.g:189:1: ruleExpression returns [EObject current=null] : ( ( ( (lv_left_0_0= ruleAtomicExpression ) ) ( ( (lv_operation_1_0= ruleOperation ) ) ( (lv_right_2_0= ruleExpression ) ) )* ) | ( (lv_paranthesis_3_0= ruleParenthesisExpression ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_operation_1_0 = null;

        EObject lv_right_2_0 = null;

        EObject lv_paranthesis_3_0 = null;



        	enterRule();

        try {
            // InternalExpressions.g:195:2: ( ( ( ( (lv_left_0_0= ruleAtomicExpression ) ) ( ( (lv_operation_1_0= ruleOperation ) ) ( (lv_right_2_0= ruleExpression ) ) )* ) | ( (lv_paranthesis_3_0= ruleParenthesisExpression ) ) ) )
            // InternalExpressions.g:196:2: ( ( ( (lv_left_0_0= ruleAtomicExpression ) ) ( ( (lv_operation_1_0= ruleOperation ) ) ( (lv_right_2_0= ruleExpression ) ) )* ) | ( (lv_paranthesis_3_0= ruleParenthesisExpression ) ) )
            {
            // InternalExpressions.g:196:2: ( ( ( (lv_left_0_0= ruleAtomicExpression ) ) ( ( (lv_operation_1_0= ruleOperation ) ) ( (lv_right_2_0= ruleExpression ) ) )* ) | ( (lv_paranthesis_3_0= ruleParenthesisExpression ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==11) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalExpressions.g:197:3: ( ( (lv_left_0_0= ruleAtomicExpression ) ) ( ( (lv_operation_1_0= ruleOperation ) ) ( (lv_right_2_0= ruleExpression ) ) )* )
                    {
                    // InternalExpressions.g:197:3: ( ( (lv_left_0_0= ruleAtomicExpression ) ) ( ( (lv_operation_1_0= ruleOperation ) ) ( (lv_right_2_0= ruleExpression ) ) )* )
                    // InternalExpressions.g:198:4: ( (lv_left_0_0= ruleAtomicExpression ) ) ( ( (lv_operation_1_0= ruleOperation ) ) ( (lv_right_2_0= ruleExpression ) ) )*
                    {
                    // InternalExpressions.g:198:4: ( (lv_left_0_0= ruleAtomicExpression ) )
                    // InternalExpressions.g:199:5: (lv_left_0_0= ruleAtomicExpression )
                    {
                    // InternalExpressions.g:199:5: (lv_left_0_0= ruleAtomicExpression )
                    // InternalExpressions.g:200:6: lv_left_0_0= ruleAtomicExpression
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getLeftAtomicExpressionParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_left_0_0=ruleAtomicExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"left",
                    							lv_left_0_0,
                    							"itu.xtext.landin.configurator.Expressions.AtomicExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalExpressions.g:217:4: ( ( (lv_operation_1_0= ruleOperation ) ) ( (lv_right_2_0= ruleExpression ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        alt2 = dfa2.predict(input);
                        switch (alt2) {
                    	case 1 :
                    	    // InternalExpressions.g:218:5: ( (lv_operation_1_0= ruleOperation ) ) ( (lv_right_2_0= ruleExpression ) )
                    	    {
                    	    // InternalExpressions.g:218:5: ( (lv_operation_1_0= ruleOperation ) )
                    	    // InternalExpressions.g:219:6: (lv_operation_1_0= ruleOperation )
                    	    {
                    	    // InternalExpressions.g:219:6: (lv_operation_1_0= ruleOperation )
                    	    // InternalExpressions.g:220:7: lv_operation_1_0= ruleOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getExpressionAccess().getOperationOperationParserRuleCall_0_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_3);
                    	    lv_operation_1_0=ruleOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"operation",
                    	    								lv_operation_1_0,
                    	    								"itu.xtext.landin.configurator.Expressions.Operation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalExpressions.g:237:5: ( (lv_right_2_0= ruleExpression ) )
                    	    // InternalExpressions.g:238:6: (lv_right_2_0= ruleExpression )
                    	    {
                    	    // InternalExpressions.g:238:6: (lv_right_2_0= ruleExpression )
                    	    // InternalExpressions.g:239:7: lv_right_2_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_0_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_right_2_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"right",
                    	    								lv_right_2_0,
                    	    								"itu.xtext.landin.configurator.Expressions.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:259:3: ( (lv_paranthesis_3_0= ruleParenthesisExpression ) )
                    {
                    // InternalExpressions.g:259:3: ( (lv_paranthesis_3_0= ruleParenthesisExpression ) )
                    // InternalExpressions.g:260:4: (lv_paranthesis_3_0= ruleParenthesisExpression )
                    {
                    // InternalExpressions.g:260:4: (lv_paranthesis_3_0= ruleParenthesisExpression )
                    // InternalExpressions.g:261:5: lv_paranthesis_3_0= ruleParenthesisExpression
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getParanthesisParenthesisExpressionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_paranthesis_3_0=ruleParenthesisExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"paranthesis",
                    						lv_paranthesis_3_0,
                    						"itu.xtext.landin.configurator.Expressions.ParenthesisExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleParenthesisExpression"
    // InternalExpressions.g:282:1: entryRuleParenthesisExpression returns [EObject current=null] : iv_ruleParenthesisExpression= ruleParenthesisExpression EOF ;
    public final EObject entryRuleParenthesisExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesisExpression = null;


        try {
            // InternalExpressions.g:282:62: (iv_ruleParenthesisExpression= ruleParenthesisExpression EOF )
            // InternalExpressions.g:283:2: iv_ruleParenthesisExpression= ruleParenthesisExpression EOF
            {
             newCompositeNode(grammarAccess.getParenthesisExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesisExpression=ruleParenthesisExpression();

            state._fsp--;

             current =iv_ruleParenthesisExpression; 
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
    // $ANTLR end "entryRuleParenthesisExpression"


    // $ANTLR start "ruleParenthesisExpression"
    // InternalExpressions.g:289:1: ruleParenthesisExpression returns [EObject current=null] : (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) ;
    public final EObject ruleParenthesisExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalExpressions.g:295:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) )
            // InternalExpressions.g:296:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            {
            // InternalExpressions.g:296:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            // InternalExpressions.g:297:3: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisExpressionAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParenthesisExpressionAccess().getExpressionParserRuleCall_1());
            		
            pushFollow(FOLLOW_6);
            this_Expression_1=ruleExpression();

            state._fsp--;


            			current = this_Expression_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesisExpressionAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleParenthesisExpression"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalExpressions.g:317:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalExpressions.g:317:57: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalExpressions.g:318:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
             newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;

             current =iv_ruleAtomicExpression; 
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
    // $ANTLR end "entryRuleAtomicExpression"


    // $ANTLR start "ruleAtomicExpression"
    // InternalExpressions.g:324:1: ruleAtomicExpression returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ruleSep this_ID_2= RULE_ID )* ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalExpressions.g:330:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ruleSep this_ID_2= RULE_ID )* ) )
            // InternalExpressions.g:331:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ruleSep this_ID_2= RULE_ID )* )
            {
            // InternalExpressions.g:331:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ruleSep this_ID_2= RULE_ID )* )
            // InternalExpressions.g:332:3: ( (lv_name_0_0= RULE_ID ) ) ( ruleSep this_ID_2= RULE_ID )*
            {
            // InternalExpressions.g:332:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalExpressions.g:333:4: (lv_name_0_0= RULE_ID )
            {
            // InternalExpressions.g:333:4: (lv_name_0_0= RULE_ID )
            // InternalExpressions.g:334:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAtomicExpressionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomicExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalExpressions.g:350:3: ( ruleSep this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalExpressions.g:351:4: ruleSep this_ID_2= RULE_ID
            	    {

            	    				newCompositeNode(grammarAccess.getAtomicExpressionAccess().getSepParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_8);
            	    ruleSep();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    				newLeafNode(this_ID_2, grammarAccess.getAtomicExpressionAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "ruleAtomicExpression"


    // $ANTLR start "entryRuleFreeText"
    // InternalExpressions.g:367:1: entryRuleFreeText returns [EObject current=null] : iv_ruleFreeText= ruleFreeText EOF ;
    public final EObject entryRuleFreeText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreeText = null;


        try {
            // InternalExpressions.g:367:49: (iv_ruleFreeText= ruleFreeText EOF )
            // InternalExpressions.g:368:2: iv_ruleFreeText= ruleFreeText EOF
            {
             newCompositeNode(grammarAccess.getFreeTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFreeText=ruleFreeText();

            state._fsp--;

             current =iv_ruleFreeText; 
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
    // $ANTLR end "entryRuleFreeText"


    // $ANTLR start "ruleFreeText"
    // InternalExpressions.g:374:1: ruleFreeText returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (this_WS_1= RULE_WS this_ID_2= RULE_ID )* ) ;
    public final EObject ruleFreeText() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_WS_1=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalExpressions.g:380:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (this_WS_1= RULE_WS this_ID_2= RULE_ID )* ) )
            // InternalExpressions.g:381:2: ( ( (lv_name_0_0= RULE_ID ) ) (this_WS_1= RULE_WS this_ID_2= RULE_ID )* )
            {
            // InternalExpressions.g:381:2: ( ( (lv_name_0_0= RULE_ID ) ) (this_WS_1= RULE_WS this_ID_2= RULE_ID )* )
            // InternalExpressions.g:382:3: ( (lv_name_0_0= RULE_ID ) ) (this_WS_1= RULE_WS this_ID_2= RULE_ID )*
            {
            // InternalExpressions.g:382:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalExpressions.g:383:4: (lv_name_0_0= RULE_ID )
            {
            // InternalExpressions.g:383:4: (lv_name_0_0= RULE_ID )
            // InternalExpressions.g:384:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFreeTextAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFreeTextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalExpressions.g:400:3: (this_WS_1= RULE_WS this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_WS) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalExpressions.g:401:4: this_WS_1= RULE_WS this_ID_2= RULE_ID
            	    {
            	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_8); 

            	    				newLeafNode(this_WS_1, grammarAccess.getFreeTextAccess().getWSTerminalRuleCall_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    				newLeafNode(this_ID_2, grammarAccess.getFreeTextAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // $ANTLR end "ruleFreeText"


    // $ANTLR start "entryRuleSep"
    // InternalExpressions.g:414:1: entryRuleSep returns [String current=null] : iv_ruleSep= ruleSep EOF ;
    public final String entryRuleSep() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSep = null;


        try {
            // InternalExpressions.g:414:43: (iv_ruleSep= ruleSep EOF )
            // InternalExpressions.g:415:2: iv_ruleSep= ruleSep EOF
            {
             newCompositeNode(grammarAccess.getSepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSep=ruleSep();

            state._fsp--;

             current =iv_ruleSep.getText(); 
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
    // $ANTLR end "entryRuleSep"


    // $ANTLR start "ruleSep"
    // InternalExpressions.g:421:1: ruleSep returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ',' | (kw= ',' this_WS_2= RULE_WS ) ) ;
    public final AntlrDatatypeRuleToken ruleSep() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_WS_2=null;


        	enterRule();

        try {
            // InternalExpressions.g:427:2: ( (kw= ',' | (kw= ',' this_WS_2= RULE_WS ) ) )
            // InternalExpressions.g:428:2: (kw= ',' | (kw= ',' this_WS_2= RULE_WS ) )
            {
            // InternalExpressions.g:428:2: (kw= ',' | (kw= ',' this_WS_2= RULE_WS ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||LA6_1==RULE_ID) ) {
                    alt6=1;
                }
                else if ( (LA6_1==RULE_WS) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalExpressions.g:429:3: kw= ','
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSepAccess().getCommaKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalExpressions.g:435:3: (kw= ',' this_WS_2= RULE_WS )
                    {
                    // InternalExpressions.g:435:3: (kw= ',' this_WS_2= RULE_WS )
                    // InternalExpressions.g:436:4: kw= ',' this_WS_2= RULE_WS
                    {
                    kw=(Token)match(input,13,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSepAccess().getCommaKeyword_1_0());
                    			
                    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_2); 

                    				current.merge(this_WS_2);
                    			

                    				newLeafNode(this_WS_2, grammarAccess.getSepAccess().getWSTerminalRuleCall_1_1());
                    			

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
    // $ANTLR end "ruleSep"


    // $ANTLR start "entryRuleOperation"
    // InternalExpressions.g:453:1: entryRuleOperation returns [String current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final String entryRuleOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperation = null;


        try {
            // InternalExpressions.g:453:49: (iv_ruleOperation= ruleOperation EOF )
            // InternalExpressions.g:454:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation.getText(); 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalExpressions.g:460:1: ruleOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Binop_0= ruleBinop | this_Unop_1= ruleUnop ) ;
    public final AntlrDatatypeRuleToken ruleOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Binop_0 = null;

        AntlrDatatypeRuleToken this_Unop_1 = null;



        	enterRule();

        try {
            // InternalExpressions.g:466:2: ( (this_Binop_0= ruleBinop | this_Unop_1= ruleUnop ) )
            // InternalExpressions.g:467:2: (this_Binop_0= ruleBinop | this_Unop_1= ruleUnop )
            {
            // InternalExpressions.g:467:2: (this_Binop_0= ruleBinop | this_Unop_1= ruleUnop )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=14 && LA7_0<=20)) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalExpressions.g:468:3: this_Binop_0= ruleBinop
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getBinopParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Binop_0=ruleBinop();

                    state._fsp--;


                    			current.merge(this_Binop_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalExpressions.g:479:3: this_Unop_1= ruleUnop
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getUnopParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Unop_1=ruleUnop();

                    state._fsp--;


                    			current.merge(this_Unop_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleBinop"
    // InternalExpressions.g:493:1: entryRuleBinop returns [String current=null] : iv_ruleBinop= ruleBinop EOF ;
    public final String entryRuleBinop() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinop = null;


        try {
            // InternalExpressions.g:493:45: (iv_ruleBinop= ruleBinop EOF )
            // InternalExpressions.g:494:2: iv_ruleBinop= ruleBinop EOF
            {
             newCompositeNode(grammarAccess.getBinopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinop=ruleBinop();

            state._fsp--;

             current =iv_ruleBinop.getText(); 
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
    // $ANTLR end "entryRuleBinop"


    // $ANTLR start "ruleBinop"
    // InternalExpressions.g:500:1: ruleBinop returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'and' | kw= 'or' | kw= 'equals' | kw= 'requires' | kw= 'is' | kw= 'are' | kw= 'excludes' ) ;
    public final AntlrDatatypeRuleToken ruleBinop() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalExpressions.g:506:2: ( (kw= 'and' | kw= 'or' | kw= 'equals' | kw= 'requires' | kw= 'is' | kw= 'are' | kw= 'excludes' ) )
            // InternalExpressions.g:507:2: (kw= 'and' | kw= 'or' | kw= 'equals' | kw= 'requires' | kw= 'is' | kw= 'are' | kw= 'excludes' )
            {
            // InternalExpressions.g:507:2: (kw= 'and' | kw= 'or' | kw= 'equals' | kw= 'requires' | kw= 'is' | kw= 'are' | kw= 'excludes' )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt8=1;
                }
                break;
            case 15:
                {
                alt8=2;
                }
                break;
            case 16:
                {
                alt8=3;
                }
                break;
            case 17:
                {
                alt8=4;
                }
                break;
            case 18:
                {
                alt8=5;
                }
                break;
            case 19:
                {
                alt8=6;
                }
                break;
            case 20:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalExpressions.g:508:3: kw= 'and'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinopAccess().getAndKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalExpressions.g:514:3: kw= 'or'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinopAccess().getOrKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalExpressions.g:520:3: kw= 'equals'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinopAccess().getEqualsKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalExpressions.g:526:3: kw= 'requires'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinopAccess().getRequiresKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalExpressions.g:532:3: kw= 'is'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinopAccess().getIsKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalExpressions.g:538:3: kw= 'are'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinopAccess().getAreKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalExpressions.g:544:3: kw= 'excludes'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinopAccess().getExcludesKeyword_6());
                    		

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
    // $ANTLR end "ruleBinop"


    // $ANTLR start "entryRuleUnop"
    // InternalExpressions.g:553:1: entryRuleUnop returns [String current=null] : iv_ruleUnop= ruleUnop EOF ;
    public final String entryRuleUnop() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnop = null;


        try {
            // InternalExpressions.g:553:44: (iv_ruleUnop= ruleUnop EOF )
            // InternalExpressions.g:554:2: iv_ruleUnop= ruleUnop EOF
            {
             newCompositeNode(grammarAccess.getUnopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnop=ruleUnop();

            state._fsp--;

             current =iv_ruleUnop.getText(); 
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
    // $ANTLR end "entryRuleUnop"


    // $ANTLR start "ruleUnop"
    // InternalExpressions.g:560:1: ruleUnop returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'not' ;
    public final AntlrDatatypeRuleToken ruleUnop() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalExpressions.g:566:2: (kw= 'not' )
            // InternalExpressions.g:567:2: kw= 'not'
            {
            kw=(Token)match(input,21,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getUnopAccess().getNotKeyword());
            	

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
    // $ANTLR end "ruleUnop"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\1\11\uffff";
    static final String dfa_3s = "\1\4\11\uffff";
    static final String dfa_4s = "\1\25\11\uffff";
    static final String dfa_5s = "\1\uffff\1\2\10\1";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\6\uffff\2\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
            "",
            "",
            "",
            "",
            "",
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

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 217:4: ( ( (lv_operation_1_0= ruleOperation ) ) ( (lv_right_2_0= ruleExpression ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000003FC002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});

}