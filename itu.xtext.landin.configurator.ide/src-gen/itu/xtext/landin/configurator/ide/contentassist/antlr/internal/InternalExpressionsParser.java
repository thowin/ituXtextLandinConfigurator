package itu.xtext.landin.configurator.ide.contentassist.antlr.internal;

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
import itu.xtext.landin.configurator.services.ExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpressionsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'not'", "','", "'and'", "'or'", "'equals'", "'requires'", "'is'", "'are'", "'excludes'", "'('", "')'"
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

    	public void setGrammarAccess(ExpressionsGrammarAccess grammarAccess) {
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
    // InternalExpressions.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalExpressions.g:54:1: ( ruleModel EOF )
            // InternalExpressions.g:55:1: ruleModel EOF
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
    // InternalExpressions.g:62:1: ruleModel : ( ( rule__Model__ConfiguratorAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:66:2: ( ( ( rule__Model__ConfiguratorAssignment ) ) )
            // InternalExpressions.g:67:2: ( ( rule__Model__ConfiguratorAssignment ) )
            {
            // InternalExpressions.g:67:2: ( ( rule__Model__ConfiguratorAssignment ) )
            // InternalExpressions.g:68:3: ( rule__Model__ConfiguratorAssignment )
            {
             before(grammarAccess.getModelAccess().getConfiguratorAssignment()); 
            // InternalExpressions.g:69:3: ( rule__Model__ConfiguratorAssignment )
            // InternalExpressions.g:69:4: rule__Model__ConfiguratorAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Model__ConfiguratorAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getConfiguratorAssignment()); 

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


    // $ANTLR start "entryRuleConfigurator"
    // InternalExpressions.g:78:1: entryRuleConfigurator : ruleConfigurator EOF ;
    public final void entryRuleConfigurator() throws RecognitionException {
        try {
            // InternalExpressions.g:79:1: ( ruleConfigurator EOF )
            // InternalExpressions.g:80:1: ruleConfigurator EOF
            {
             before(grammarAccess.getConfiguratorRule()); 
            pushFollow(FOLLOW_1);
            ruleConfigurator();

            state._fsp--;

             after(grammarAccess.getConfiguratorRule()); 
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
    // $ANTLR end "entryRuleConfigurator"


    // $ANTLR start "ruleConfigurator"
    // InternalExpressions.g:87:1: ruleConfigurator : ( ( rule__Configurator__Group__0 ) ) ;
    public final void ruleConfigurator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:91:2: ( ( ( rule__Configurator__Group__0 ) ) )
            // InternalExpressions.g:92:2: ( ( rule__Configurator__Group__0 ) )
            {
            // InternalExpressions.g:92:2: ( ( rule__Configurator__Group__0 ) )
            // InternalExpressions.g:93:3: ( rule__Configurator__Group__0 )
            {
             before(grammarAccess.getConfiguratorAccess().getGroup()); 
            // InternalExpressions.g:94:3: ( rule__Configurator__Group__0 )
            // InternalExpressions.g:94:4: rule__Configurator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Configurator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfiguratorAccess().getGroup()); 

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
    // $ANTLR end "ruleConfigurator"


    // $ANTLR start "entryRuleTitle"
    // InternalExpressions.g:103:1: entryRuleTitle : ruleTitle EOF ;
    public final void entryRuleTitle() throws RecognitionException {
        try {
            // InternalExpressions.g:104:1: ( ruleTitle EOF )
            // InternalExpressions.g:105:1: ruleTitle EOF
            {
             before(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getTitleRule()); 
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
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalExpressions.g:112:1: ruleTitle : ( ruleFreeText ) ;
    public final void ruleTitle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:116:2: ( ( ruleFreeText ) )
            // InternalExpressions.g:117:2: ( ruleFreeText )
            {
            // InternalExpressions.g:117:2: ( ruleFreeText )
            // InternalExpressions.g:118:3: ruleFreeText
            {
             before(grammarAccess.getTitleAccess().getFreeTextParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleFreeText();

            state._fsp--;

             after(grammarAccess.getTitleAccess().getFreeTextParserRuleCall()); 

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
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleExpression"
    // InternalExpressions.g:128:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalExpressions.g:129:1: ( ruleExpression EOF )
            // InternalExpressions.g:130:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalExpressions.g:137:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:141:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalExpressions.g:142:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalExpressions.g:142:2: ( ( rule__Expression__Alternatives ) )
            // InternalExpressions.g:143:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalExpressions.g:144:3: ( rule__Expression__Alternatives )
            // InternalExpressions.g:144:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleParenthesisExpression"
    // InternalExpressions.g:153:1: entryRuleParenthesisExpression : ruleParenthesisExpression EOF ;
    public final void entryRuleParenthesisExpression() throws RecognitionException {
        try {
            // InternalExpressions.g:154:1: ( ruleParenthesisExpression EOF )
            // InternalExpressions.g:155:1: ruleParenthesisExpression EOF
            {
             before(grammarAccess.getParenthesisExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleParenthesisExpression();

            state._fsp--;

             after(grammarAccess.getParenthesisExpressionRule()); 
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
    // $ANTLR end "entryRuleParenthesisExpression"


    // $ANTLR start "ruleParenthesisExpression"
    // InternalExpressions.g:162:1: ruleParenthesisExpression : ( ( rule__ParenthesisExpression__Group__0 ) ) ;
    public final void ruleParenthesisExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:166:2: ( ( ( rule__ParenthesisExpression__Group__0 ) ) )
            // InternalExpressions.g:167:2: ( ( rule__ParenthesisExpression__Group__0 ) )
            {
            // InternalExpressions.g:167:2: ( ( rule__ParenthesisExpression__Group__0 ) )
            // InternalExpressions.g:168:3: ( rule__ParenthesisExpression__Group__0 )
            {
             before(grammarAccess.getParenthesisExpressionAccess().getGroup()); 
            // InternalExpressions.g:169:3: ( rule__ParenthesisExpression__Group__0 )
            // InternalExpressions.g:169:4: rule__ParenthesisExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParenthesisExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParenthesisExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleParenthesisExpression"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalExpressions.g:178:1: entryRuleAtomicExpression : ruleAtomicExpression EOF ;
    public final void entryRuleAtomicExpression() throws RecognitionException {
        try {
            // InternalExpressions.g:179:1: ( ruleAtomicExpression EOF )
            // InternalExpressions.g:180:1: ruleAtomicExpression EOF
            {
             before(grammarAccess.getAtomicExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAtomicExpression();

            state._fsp--;

             after(grammarAccess.getAtomicExpressionRule()); 
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
    // $ANTLR end "entryRuleAtomicExpression"


    // $ANTLR start "ruleAtomicExpression"
    // InternalExpressions.g:187:1: ruleAtomicExpression : ( ( rule__AtomicExpression__Group__0 ) ) ;
    public final void ruleAtomicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:191:2: ( ( ( rule__AtomicExpression__Group__0 ) ) )
            // InternalExpressions.g:192:2: ( ( rule__AtomicExpression__Group__0 ) )
            {
            // InternalExpressions.g:192:2: ( ( rule__AtomicExpression__Group__0 ) )
            // InternalExpressions.g:193:3: ( rule__AtomicExpression__Group__0 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getGroup()); 
            // InternalExpressions.g:194:3: ( rule__AtomicExpression__Group__0 )
            // InternalExpressions.g:194:4: rule__AtomicExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AtomicExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleAtomicExpression"


    // $ANTLR start "entryRuleFreeText"
    // InternalExpressions.g:203:1: entryRuleFreeText : ruleFreeText EOF ;
    public final void entryRuleFreeText() throws RecognitionException {
        try {
            // InternalExpressions.g:204:1: ( ruleFreeText EOF )
            // InternalExpressions.g:205:1: ruleFreeText EOF
            {
             before(grammarAccess.getFreeTextRule()); 
            pushFollow(FOLLOW_1);
            ruleFreeText();

            state._fsp--;

             after(grammarAccess.getFreeTextRule()); 
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
    // $ANTLR end "entryRuleFreeText"


    // $ANTLR start "ruleFreeText"
    // InternalExpressions.g:212:1: ruleFreeText : ( ( rule__FreeText__Group__0 ) ) ;
    public final void ruleFreeText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:216:2: ( ( ( rule__FreeText__Group__0 ) ) )
            // InternalExpressions.g:217:2: ( ( rule__FreeText__Group__0 ) )
            {
            // InternalExpressions.g:217:2: ( ( rule__FreeText__Group__0 ) )
            // InternalExpressions.g:218:3: ( rule__FreeText__Group__0 )
            {
             before(grammarAccess.getFreeTextAccess().getGroup()); 
            // InternalExpressions.g:219:3: ( rule__FreeText__Group__0 )
            // InternalExpressions.g:219:4: rule__FreeText__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FreeText__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFreeTextAccess().getGroup()); 

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
    // $ANTLR end "ruleFreeText"


    // $ANTLR start "entryRuleSep"
    // InternalExpressions.g:228:1: entryRuleSep : ruleSep EOF ;
    public final void entryRuleSep() throws RecognitionException {
        try {
            // InternalExpressions.g:229:1: ( ruleSep EOF )
            // InternalExpressions.g:230:1: ruleSep EOF
            {
             before(grammarAccess.getSepRule()); 
            pushFollow(FOLLOW_1);
            ruleSep();

            state._fsp--;

             after(grammarAccess.getSepRule()); 
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
    // $ANTLR end "entryRuleSep"


    // $ANTLR start "ruleSep"
    // InternalExpressions.g:237:1: ruleSep : ( ( rule__Sep__Alternatives ) ) ;
    public final void ruleSep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:241:2: ( ( ( rule__Sep__Alternatives ) ) )
            // InternalExpressions.g:242:2: ( ( rule__Sep__Alternatives ) )
            {
            // InternalExpressions.g:242:2: ( ( rule__Sep__Alternatives ) )
            // InternalExpressions.g:243:3: ( rule__Sep__Alternatives )
            {
             before(grammarAccess.getSepAccess().getAlternatives()); 
            // InternalExpressions.g:244:3: ( rule__Sep__Alternatives )
            // InternalExpressions.g:244:4: rule__Sep__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Sep__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSepAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSep"


    // $ANTLR start "entryRuleOperation"
    // InternalExpressions.g:253:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalExpressions.g:254:1: ( ruleOperation EOF )
            // InternalExpressions.g:255:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalExpressions.g:262:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:266:2: ( ( ( rule__Operation__Alternatives ) ) )
            // InternalExpressions.g:267:2: ( ( rule__Operation__Alternatives ) )
            {
            // InternalExpressions.g:267:2: ( ( rule__Operation__Alternatives ) )
            // InternalExpressions.g:268:3: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // InternalExpressions.g:269:3: ( rule__Operation__Alternatives )
            // InternalExpressions.g:269:4: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleBinop"
    // InternalExpressions.g:278:1: entryRuleBinop : ruleBinop EOF ;
    public final void entryRuleBinop() throws RecognitionException {
        try {
            // InternalExpressions.g:279:1: ( ruleBinop EOF )
            // InternalExpressions.g:280:1: ruleBinop EOF
            {
             before(grammarAccess.getBinopRule()); 
            pushFollow(FOLLOW_1);
            ruleBinop();

            state._fsp--;

             after(grammarAccess.getBinopRule()); 
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
    // $ANTLR end "entryRuleBinop"


    // $ANTLR start "ruleBinop"
    // InternalExpressions.g:287:1: ruleBinop : ( ( rule__Binop__Alternatives ) ) ;
    public final void ruleBinop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:291:2: ( ( ( rule__Binop__Alternatives ) ) )
            // InternalExpressions.g:292:2: ( ( rule__Binop__Alternatives ) )
            {
            // InternalExpressions.g:292:2: ( ( rule__Binop__Alternatives ) )
            // InternalExpressions.g:293:3: ( rule__Binop__Alternatives )
            {
             before(grammarAccess.getBinopAccess().getAlternatives()); 
            // InternalExpressions.g:294:3: ( rule__Binop__Alternatives )
            // InternalExpressions.g:294:4: rule__Binop__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Binop__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinopAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBinop"


    // $ANTLR start "entryRuleUnop"
    // InternalExpressions.g:303:1: entryRuleUnop : ruleUnop EOF ;
    public final void entryRuleUnop() throws RecognitionException {
        try {
            // InternalExpressions.g:304:1: ( ruleUnop EOF )
            // InternalExpressions.g:305:1: ruleUnop EOF
            {
             before(grammarAccess.getUnopRule()); 
            pushFollow(FOLLOW_1);
            ruleUnop();

            state._fsp--;

             after(grammarAccess.getUnopRule()); 
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
    // $ANTLR end "entryRuleUnop"


    // $ANTLR start "ruleUnop"
    // InternalExpressions.g:312:1: ruleUnop : ( 'not' ) ;
    public final void ruleUnop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:316:2: ( ( 'not' ) )
            // InternalExpressions.g:317:2: ( 'not' )
            {
            // InternalExpressions.g:317:2: ( 'not' )
            // InternalExpressions.g:318:3: 'not'
            {
             before(grammarAccess.getUnopAccess().getNotKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getUnopAccess().getNotKeyword()); 

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
    // $ANTLR end "ruleUnop"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalExpressions.g:327:1: rule__Expression__Alternatives : ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__ParanthesisAssignment_1 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:331:1: ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__ParanthesisAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==20) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalExpressions.g:332:2: ( ( rule__Expression__Group_0__0 ) )
                    {
                    // InternalExpressions.g:332:2: ( ( rule__Expression__Group_0__0 ) )
                    // InternalExpressions.g:333:3: ( rule__Expression__Group_0__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_0()); 
                    // InternalExpressions.g:334:3: ( rule__Expression__Group_0__0 )
                    // InternalExpressions.g:334:4: rule__Expression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:338:2: ( ( rule__Expression__ParanthesisAssignment_1 ) )
                    {
                    // InternalExpressions.g:338:2: ( ( rule__Expression__ParanthesisAssignment_1 ) )
                    // InternalExpressions.g:339:3: ( rule__Expression__ParanthesisAssignment_1 )
                    {
                     before(grammarAccess.getExpressionAccess().getParanthesisAssignment_1()); 
                    // InternalExpressions.g:340:3: ( rule__Expression__ParanthesisAssignment_1 )
                    // InternalExpressions.g:340:4: rule__Expression__ParanthesisAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__ParanthesisAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getParanthesisAssignment_1()); 

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Sep__Alternatives"
    // InternalExpressions.g:348:1: rule__Sep__Alternatives : ( ( ',' ) | ( ( rule__Sep__Group_1__0 ) ) );
    public final void rule__Sep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:352:1: ( ( ',' ) | ( ( rule__Sep__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_WS) ) {
                    alt2=2;
                }
                else if ( (LA2_1==EOF||LA2_1==RULE_ID) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalExpressions.g:353:2: ( ',' )
                    {
                    // InternalExpressions.g:353:2: ( ',' )
                    // InternalExpressions.g:354:3: ','
                    {
                     before(grammarAccess.getSepAccess().getCommaKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSepAccess().getCommaKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:359:2: ( ( rule__Sep__Group_1__0 ) )
                    {
                    // InternalExpressions.g:359:2: ( ( rule__Sep__Group_1__0 ) )
                    // InternalExpressions.g:360:3: ( rule__Sep__Group_1__0 )
                    {
                     before(grammarAccess.getSepAccess().getGroup_1()); 
                    // InternalExpressions.g:361:3: ( rule__Sep__Group_1__0 )
                    // InternalExpressions.g:361:4: rule__Sep__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sep__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSepAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Sep__Alternatives"


    // $ANTLR start "rule__Operation__Alternatives"
    // InternalExpressions.g:369:1: rule__Operation__Alternatives : ( ( ruleBinop ) | ( ruleUnop ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:373:1: ( ( ruleBinop ) | ( ruleUnop ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=13 && LA3_0<=19)) ) {
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
                    // InternalExpressions.g:374:2: ( ruleBinop )
                    {
                    // InternalExpressions.g:374:2: ( ruleBinop )
                    // InternalExpressions.g:375:3: ruleBinop
                    {
                     before(grammarAccess.getOperationAccess().getBinopParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBinop();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getBinopParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:380:2: ( ruleUnop )
                    {
                    // InternalExpressions.g:380:2: ( ruleUnop )
                    // InternalExpressions.g:381:3: ruleUnop
                    {
                     before(grammarAccess.getOperationAccess().getUnopParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUnop();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getUnopParserRuleCall_1()); 

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
    // $ANTLR end "rule__Operation__Alternatives"


    // $ANTLR start "rule__Binop__Alternatives"
    // InternalExpressions.g:390:1: rule__Binop__Alternatives : ( ( 'and' ) | ( 'or' ) | ( 'equals' ) | ( 'requires' ) | ( 'is' ) | ( 'are' ) | ( 'excludes' ) );
    public final void rule__Binop__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:394:1: ( ( 'and' ) | ( 'or' ) | ( 'equals' ) | ( 'requires' ) | ( 'is' ) | ( 'are' ) | ( 'excludes' ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            case 17:
                {
                alt4=5;
                }
                break;
            case 18:
                {
                alt4=6;
                }
                break;
            case 19:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalExpressions.g:395:2: ( 'and' )
                    {
                    // InternalExpressions.g:395:2: ( 'and' )
                    // InternalExpressions.g:396:3: 'and'
                    {
                     before(grammarAccess.getBinopAccess().getAndKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBinopAccess().getAndKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:401:2: ( 'or' )
                    {
                    // InternalExpressions.g:401:2: ( 'or' )
                    // InternalExpressions.g:402:3: 'or'
                    {
                     before(grammarAccess.getBinopAccess().getOrKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBinopAccess().getOrKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExpressions.g:407:2: ( 'equals' )
                    {
                    // InternalExpressions.g:407:2: ( 'equals' )
                    // InternalExpressions.g:408:3: 'equals'
                    {
                     before(grammarAccess.getBinopAccess().getEqualsKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBinopAccess().getEqualsKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExpressions.g:413:2: ( 'requires' )
                    {
                    // InternalExpressions.g:413:2: ( 'requires' )
                    // InternalExpressions.g:414:3: 'requires'
                    {
                     before(grammarAccess.getBinopAccess().getRequiresKeyword_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBinopAccess().getRequiresKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalExpressions.g:419:2: ( 'is' )
                    {
                    // InternalExpressions.g:419:2: ( 'is' )
                    // InternalExpressions.g:420:3: 'is'
                    {
                     before(grammarAccess.getBinopAccess().getIsKeyword_4()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBinopAccess().getIsKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalExpressions.g:425:2: ( 'are' )
                    {
                    // InternalExpressions.g:425:2: ( 'are' )
                    // InternalExpressions.g:426:3: 'are'
                    {
                     before(grammarAccess.getBinopAccess().getAreKeyword_5()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getBinopAccess().getAreKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalExpressions.g:431:2: ( 'excludes' )
                    {
                    // InternalExpressions.g:431:2: ( 'excludes' )
                    // InternalExpressions.g:432:3: 'excludes'
                    {
                     before(grammarAccess.getBinopAccess().getExcludesKeyword_6()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getBinopAccess().getExcludesKeyword_6()); 

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
    // $ANTLR end "rule__Binop__Alternatives"


    // $ANTLR start "rule__Configurator__Group__0"
    // InternalExpressions.g:441:1: rule__Configurator__Group__0 : rule__Configurator__Group__0__Impl rule__Configurator__Group__1 ;
    public final void rule__Configurator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:445:1: ( rule__Configurator__Group__0__Impl rule__Configurator__Group__1 )
            // InternalExpressions.g:446:2: rule__Configurator__Group__0__Impl rule__Configurator__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Configurator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configurator__Group__1();

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
    // $ANTLR end "rule__Configurator__Group__0"


    // $ANTLR start "rule__Configurator__Group__0__Impl"
    // InternalExpressions.g:453:1: rule__Configurator__Group__0__Impl : ( ( rule__Configurator__TitleAssignment_0 ) ) ;
    public final void rule__Configurator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:457:1: ( ( ( rule__Configurator__TitleAssignment_0 ) ) )
            // InternalExpressions.g:458:1: ( ( rule__Configurator__TitleAssignment_0 ) )
            {
            // InternalExpressions.g:458:1: ( ( rule__Configurator__TitleAssignment_0 ) )
            // InternalExpressions.g:459:2: ( rule__Configurator__TitleAssignment_0 )
            {
             before(grammarAccess.getConfiguratorAccess().getTitleAssignment_0()); 
            // InternalExpressions.g:460:2: ( rule__Configurator__TitleAssignment_0 )
            // InternalExpressions.g:460:3: rule__Configurator__TitleAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Configurator__TitleAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConfiguratorAccess().getTitleAssignment_0()); 

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
    // $ANTLR end "rule__Configurator__Group__0__Impl"


    // $ANTLR start "rule__Configurator__Group__1"
    // InternalExpressions.g:468:1: rule__Configurator__Group__1 : rule__Configurator__Group__1__Impl ;
    public final void rule__Configurator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:472:1: ( rule__Configurator__Group__1__Impl )
            // InternalExpressions.g:473:2: rule__Configurator__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configurator__Group__1__Impl();

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
    // $ANTLR end "rule__Configurator__Group__1"


    // $ANTLR start "rule__Configurator__Group__1__Impl"
    // InternalExpressions.g:479:1: rule__Configurator__Group__1__Impl : ( ( ( rule__Configurator__ExpressionAssignment_1 ) ) ( ( rule__Configurator__ExpressionAssignment_1 )* ) ) ;
    public final void rule__Configurator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:483:1: ( ( ( ( rule__Configurator__ExpressionAssignment_1 ) ) ( ( rule__Configurator__ExpressionAssignment_1 )* ) ) )
            // InternalExpressions.g:484:1: ( ( ( rule__Configurator__ExpressionAssignment_1 ) ) ( ( rule__Configurator__ExpressionAssignment_1 )* ) )
            {
            // InternalExpressions.g:484:1: ( ( ( rule__Configurator__ExpressionAssignment_1 ) ) ( ( rule__Configurator__ExpressionAssignment_1 )* ) )
            // InternalExpressions.g:485:2: ( ( rule__Configurator__ExpressionAssignment_1 ) ) ( ( rule__Configurator__ExpressionAssignment_1 )* )
            {
            // InternalExpressions.g:485:2: ( ( rule__Configurator__ExpressionAssignment_1 ) )
            // InternalExpressions.g:486:3: ( rule__Configurator__ExpressionAssignment_1 )
            {
             before(grammarAccess.getConfiguratorAccess().getExpressionAssignment_1()); 
            // InternalExpressions.g:487:3: ( rule__Configurator__ExpressionAssignment_1 )
            // InternalExpressions.g:487:4: rule__Configurator__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_4);
            rule__Configurator__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConfiguratorAccess().getExpressionAssignment_1()); 

            }

            // InternalExpressions.g:490:2: ( ( rule__Configurator__ExpressionAssignment_1 )* )
            // InternalExpressions.g:491:3: ( rule__Configurator__ExpressionAssignment_1 )*
            {
             before(grammarAccess.getConfiguratorAccess().getExpressionAssignment_1()); 
            // InternalExpressions.g:492:3: ( rule__Configurator__ExpressionAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalExpressions.g:492:4: rule__Configurator__ExpressionAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Configurator__ExpressionAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getConfiguratorAccess().getExpressionAssignment_1()); 

            }


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
    // $ANTLR end "rule__Configurator__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_0__0"
    // InternalExpressions.g:502:1: rule__Expression__Group_0__0 : rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1 ;
    public final void rule__Expression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:506:1: ( rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1 )
            // InternalExpressions.g:507:2: rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__Expression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__1();

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
    // $ANTLR end "rule__Expression__Group_0__0"


    // $ANTLR start "rule__Expression__Group_0__0__Impl"
    // InternalExpressions.g:514:1: rule__Expression__Group_0__0__Impl : ( ( rule__Expression__LeftAssignment_0_0 ) ) ;
    public final void rule__Expression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:518:1: ( ( ( rule__Expression__LeftAssignment_0_0 ) ) )
            // InternalExpressions.g:519:1: ( ( rule__Expression__LeftAssignment_0_0 ) )
            {
            // InternalExpressions.g:519:1: ( ( rule__Expression__LeftAssignment_0_0 ) )
            // InternalExpressions.g:520:2: ( rule__Expression__LeftAssignment_0_0 )
            {
             before(grammarAccess.getExpressionAccess().getLeftAssignment_0_0()); 
            // InternalExpressions.g:521:2: ( rule__Expression__LeftAssignment_0_0 )
            // InternalExpressions.g:521:3: rule__Expression__LeftAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__LeftAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getLeftAssignment_0_0()); 

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
    // $ANTLR end "rule__Expression__Group_0__0__Impl"


    // $ANTLR start "rule__Expression__Group_0__1"
    // InternalExpressions.g:529:1: rule__Expression__Group_0__1 : rule__Expression__Group_0__1__Impl ;
    public final void rule__Expression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:533:1: ( rule__Expression__Group_0__1__Impl )
            // InternalExpressions.g:534:2: rule__Expression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__1__Impl();

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
    // $ANTLR end "rule__Expression__Group_0__1"


    // $ANTLR start "rule__Expression__Group_0__1__Impl"
    // InternalExpressions.g:540:1: rule__Expression__Group_0__1__Impl : ( ( rule__Expression__Group_0_1__0 )* ) ;
    public final void rule__Expression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:544:1: ( ( ( rule__Expression__Group_0_1__0 )* ) )
            // InternalExpressions.g:545:1: ( ( rule__Expression__Group_0_1__0 )* )
            {
            // InternalExpressions.g:545:1: ( ( rule__Expression__Group_0_1__0 )* )
            // InternalExpressions.g:546:2: ( rule__Expression__Group_0_1__0 )*
            {
             before(grammarAccess.getExpressionAccess().getGroup_0_1()); 
            // InternalExpressions.g:547:2: ( rule__Expression__Group_0_1__0 )*
            loop6:
            do {
                int alt6=2;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // InternalExpressions.g:547:3: rule__Expression__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Expression__Group_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getExpressionAccess().getGroup_0_1()); 

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
    // $ANTLR end "rule__Expression__Group_0__1__Impl"


    // $ANTLR start "rule__Expression__Group_0_1__0"
    // InternalExpressions.g:556:1: rule__Expression__Group_0_1__0 : rule__Expression__Group_0_1__0__Impl rule__Expression__Group_0_1__1 ;
    public final void rule__Expression__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:560:1: ( rule__Expression__Group_0_1__0__Impl rule__Expression__Group_0_1__1 )
            // InternalExpressions.g:561:2: rule__Expression__Group_0_1__0__Impl rule__Expression__Group_0_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Expression__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_0_1__1();

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
    // $ANTLR end "rule__Expression__Group_0_1__0"


    // $ANTLR start "rule__Expression__Group_0_1__0__Impl"
    // InternalExpressions.g:568:1: rule__Expression__Group_0_1__0__Impl : ( ( rule__Expression__OperationAssignment_0_1_0 ) ) ;
    public final void rule__Expression__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:572:1: ( ( ( rule__Expression__OperationAssignment_0_1_0 ) ) )
            // InternalExpressions.g:573:1: ( ( rule__Expression__OperationAssignment_0_1_0 ) )
            {
            // InternalExpressions.g:573:1: ( ( rule__Expression__OperationAssignment_0_1_0 ) )
            // InternalExpressions.g:574:2: ( rule__Expression__OperationAssignment_0_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getOperationAssignment_0_1_0()); 
            // InternalExpressions.g:575:2: ( rule__Expression__OperationAssignment_0_1_0 )
            // InternalExpressions.g:575:3: rule__Expression__OperationAssignment_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__OperationAssignment_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getOperationAssignment_0_1_0()); 

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
    // $ANTLR end "rule__Expression__Group_0_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_0_1__1"
    // InternalExpressions.g:583:1: rule__Expression__Group_0_1__1 : rule__Expression__Group_0_1__1__Impl ;
    public final void rule__Expression__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:587:1: ( rule__Expression__Group_0_1__1__Impl )
            // InternalExpressions.g:588:2: rule__Expression__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_0_1__1__Impl();

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
    // $ANTLR end "rule__Expression__Group_0_1__1"


    // $ANTLR start "rule__Expression__Group_0_1__1__Impl"
    // InternalExpressions.g:594:1: rule__Expression__Group_0_1__1__Impl : ( ( rule__Expression__RightAssignment_0_1_1 ) ) ;
    public final void rule__Expression__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:598:1: ( ( ( rule__Expression__RightAssignment_0_1_1 ) ) )
            // InternalExpressions.g:599:1: ( ( rule__Expression__RightAssignment_0_1_1 ) )
            {
            // InternalExpressions.g:599:1: ( ( rule__Expression__RightAssignment_0_1_1 ) )
            // InternalExpressions.g:600:2: ( rule__Expression__RightAssignment_0_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_0_1_1()); 
            // InternalExpressions.g:601:2: ( rule__Expression__RightAssignment_0_1_1 )
            // InternalExpressions.g:601:3: rule__Expression__RightAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__RightAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRightAssignment_0_1_1()); 

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
    // $ANTLR end "rule__Expression__Group_0_1__1__Impl"


    // $ANTLR start "rule__ParenthesisExpression__Group__0"
    // InternalExpressions.g:610:1: rule__ParenthesisExpression__Group__0 : rule__ParenthesisExpression__Group__0__Impl rule__ParenthesisExpression__Group__1 ;
    public final void rule__ParenthesisExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:614:1: ( rule__ParenthesisExpression__Group__0__Impl rule__ParenthesisExpression__Group__1 )
            // InternalExpressions.g:615:2: rule__ParenthesisExpression__Group__0__Impl rule__ParenthesisExpression__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ParenthesisExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParenthesisExpression__Group__1();

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
    // $ANTLR end "rule__ParenthesisExpression__Group__0"


    // $ANTLR start "rule__ParenthesisExpression__Group__0__Impl"
    // InternalExpressions.g:622:1: rule__ParenthesisExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesisExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:626:1: ( ( '(' ) )
            // InternalExpressions.g:627:1: ( '(' )
            {
            // InternalExpressions.g:627:1: ( '(' )
            // InternalExpressions.g:628:2: '('
            {
             before(grammarAccess.getParenthesisExpressionAccess().getLeftParenthesisKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getParenthesisExpressionAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__ParenthesisExpression__Group__0__Impl"


    // $ANTLR start "rule__ParenthesisExpression__Group__1"
    // InternalExpressions.g:637:1: rule__ParenthesisExpression__Group__1 : rule__ParenthesisExpression__Group__1__Impl rule__ParenthesisExpression__Group__2 ;
    public final void rule__ParenthesisExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:641:1: ( rule__ParenthesisExpression__Group__1__Impl rule__ParenthesisExpression__Group__2 )
            // InternalExpressions.g:642:2: rule__ParenthesisExpression__Group__1__Impl rule__ParenthesisExpression__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ParenthesisExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParenthesisExpression__Group__2();

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
    // $ANTLR end "rule__ParenthesisExpression__Group__1"


    // $ANTLR start "rule__ParenthesisExpression__Group__1__Impl"
    // InternalExpressions.g:649:1: rule__ParenthesisExpression__Group__1__Impl : ( ruleExpression ) ;
    public final void rule__ParenthesisExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:653:1: ( ( ruleExpression ) )
            // InternalExpressions.g:654:1: ( ruleExpression )
            {
            // InternalExpressions.g:654:1: ( ruleExpression )
            // InternalExpressions.g:655:2: ruleExpression
            {
             before(grammarAccess.getParenthesisExpressionAccess().getExpressionParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getParenthesisExpressionAccess().getExpressionParserRuleCall_1()); 

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
    // $ANTLR end "rule__ParenthesisExpression__Group__1__Impl"


    // $ANTLR start "rule__ParenthesisExpression__Group__2"
    // InternalExpressions.g:664:1: rule__ParenthesisExpression__Group__2 : rule__ParenthesisExpression__Group__2__Impl ;
    public final void rule__ParenthesisExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:668:1: ( rule__ParenthesisExpression__Group__2__Impl )
            // InternalExpressions.g:669:2: rule__ParenthesisExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParenthesisExpression__Group__2__Impl();

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
    // $ANTLR end "rule__ParenthesisExpression__Group__2"


    // $ANTLR start "rule__ParenthesisExpression__Group__2__Impl"
    // InternalExpressions.g:675:1: rule__ParenthesisExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesisExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:679:1: ( ( ')' ) )
            // InternalExpressions.g:680:1: ( ')' )
            {
            // InternalExpressions.g:680:1: ( ')' )
            // InternalExpressions.g:681:2: ')'
            {
             before(grammarAccess.getParenthesisExpressionAccess().getRightParenthesisKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getParenthesisExpressionAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__ParenthesisExpression__Group__2__Impl"


    // $ANTLR start "rule__AtomicExpression__Group__0"
    // InternalExpressions.g:691:1: rule__AtomicExpression__Group__0 : rule__AtomicExpression__Group__0__Impl rule__AtomicExpression__Group__1 ;
    public final void rule__AtomicExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:695:1: ( rule__AtomicExpression__Group__0__Impl rule__AtomicExpression__Group__1 )
            // InternalExpressions.g:696:2: rule__AtomicExpression__Group__0__Impl rule__AtomicExpression__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AtomicExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicExpression__Group__1();

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
    // $ANTLR end "rule__AtomicExpression__Group__0"


    // $ANTLR start "rule__AtomicExpression__Group__0__Impl"
    // InternalExpressions.g:703:1: rule__AtomicExpression__Group__0__Impl : ( ( rule__AtomicExpression__NameAssignment_0 ) ) ;
    public final void rule__AtomicExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:707:1: ( ( ( rule__AtomicExpression__NameAssignment_0 ) ) )
            // InternalExpressions.g:708:1: ( ( rule__AtomicExpression__NameAssignment_0 ) )
            {
            // InternalExpressions.g:708:1: ( ( rule__AtomicExpression__NameAssignment_0 ) )
            // InternalExpressions.g:709:2: ( rule__AtomicExpression__NameAssignment_0 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getNameAssignment_0()); 
            // InternalExpressions.g:710:2: ( rule__AtomicExpression__NameAssignment_0 )
            // InternalExpressions.g:710:3: rule__AtomicExpression__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AtomicExpression__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicExpressionAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__AtomicExpression__Group__0__Impl"


    // $ANTLR start "rule__AtomicExpression__Group__1"
    // InternalExpressions.g:718:1: rule__AtomicExpression__Group__1 : rule__AtomicExpression__Group__1__Impl ;
    public final void rule__AtomicExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:722:1: ( rule__AtomicExpression__Group__1__Impl )
            // InternalExpressions.g:723:2: rule__AtomicExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicExpression__Group__1__Impl();

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
    // $ANTLR end "rule__AtomicExpression__Group__1"


    // $ANTLR start "rule__AtomicExpression__Group__1__Impl"
    // InternalExpressions.g:729:1: rule__AtomicExpression__Group__1__Impl : ( ( rule__AtomicExpression__Group_1__0 )* ) ;
    public final void rule__AtomicExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:733:1: ( ( ( rule__AtomicExpression__Group_1__0 )* ) )
            // InternalExpressions.g:734:1: ( ( rule__AtomicExpression__Group_1__0 )* )
            {
            // InternalExpressions.g:734:1: ( ( rule__AtomicExpression__Group_1__0 )* )
            // InternalExpressions.g:735:2: ( rule__AtomicExpression__Group_1__0 )*
            {
             before(grammarAccess.getAtomicExpressionAccess().getGroup_1()); 
            // InternalExpressions.g:736:2: ( rule__AtomicExpression__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==12) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalExpressions.g:736:3: rule__AtomicExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__AtomicExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getAtomicExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AtomicExpression__Group__1__Impl"


    // $ANTLR start "rule__AtomicExpression__Group_1__0"
    // InternalExpressions.g:745:1: rule__AtomicExpression__Group_1__0 : rule__AtomicExpression__Group_1__0__Impl rule__AtomicExpression__Group_1__1 ;
    public final void rule__AtomicExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:749:1: ( rule__AtomicExpression__Group_1__0__Impl rule__AtomicExpression__Group_1__1 )
            // InternalExpressions.g:750:2: rule__AtomicExpression__Group_1__0__Impl rule__AtomicExpression__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__AtomicExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicExpression__Group_1__1();

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
    // $ANTLR end "rule__AtomicExpression__Group_1__0"


    // $ANTLR start "rule__AtomicExpression__Group_1__0__Impl"
    // InternalExpressions.g:757:1: rule__AtomicExpression__Group_1__0__Impl : ( ruleSep ) ;
    public final void rule__AtomicExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:761:1: ( ( ruleSep ) )
            // InternalExpressions.g:762:1: ( ruleSep )
            {
            // InternalExpressions.g:762:1: ( ruleSep )
            // InternalExpressions.g:763:2: ruleSep
            {
             before(grammarAccess.getAtomicExpressionAccess().getSepParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSep();

            state._fsp--;

             after(grammarAccess.getAtomicExpressionAccess().getSepParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__AtomicExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AtomicExpression__Group_1__1"
    // InternalExpressions.g:772:1: rule__AtomicExpression__Group_1__1 : rule__AtomicExpression__Group_1__1__Impl ;
    public final void rule__AtomicExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:776:1: ( rule__AtomicExpression__Group_1__1__Impl )
            // InternalExpressions.g:777:2: rule__AtomicExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicExpression__Group_1__1__Impl();

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
    // $ANTLR end "rule__AtomicExpression__Group_1__1"


    // $ANTLR start "rule__AtomicExpression__Group_1__1__Impl"
    // InternalExpressions.g:783:1: rule__AtomicExpression__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__AtomicExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:787:1: ( ( RULE_ID ) )
            // InternalExpressions.g:788:1: ( RULE_ID )
            {
            // InternalExpressions.g:788:1: ( RULE_ID )
            // InternalExpressions.g:789:2: RULE_ID
            {
             before(grammarAccess.getAtomicExpressionAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtomicExpressionAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__AtomicExpression__Group_1__1__Impl"


    // $ANTLR start "rule__FreeText__Group__0"
    // InternalExpressions.g:799:1: rule__FreeText__Group__0 : rule__FreeText__Group__0__Impl rule__FreeText__Group__1 ;
    public final void rule__FreeText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:803:1: ( rule__FreeText__Group__0__Impl rule__FreeText__Group__1 )
            // InternalExpressions.g:804:2: rule__FreeText__Group__0__Impl rule__FreeText__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__FreeText__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FreeText__Group__1();

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
    // $ANTLR end "rule__FreeText__Group__0"


    // $ANTLR start "rule__FreeText__Group__0__Impl"
    // InternalExpressions.g:811:1: rule__FreeText__Group__0__Impl : ( ( rule__FreeText__NameAssignment_0 ) ) ;
    public final void rule__FreeText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:815:1: ( ( ( rule__FreeText__NameAssignment_0 ) ) )
            // InternalExpressions.g:816:1: ( ( rule__FreeText__NameAssignment_0 ) )
            {
            // InternalExpressions.g:816:1: ( ( rule__FreeText__NameAssignment_0 ) )
            // InternalExpressions.g:817:2: ( rule__FreeText__NameAssignment_0 )
            {
             before(grammarAccess.getFreeTextAccess().getNameAssignment_0()); 
            // InternalExpressions.g:818:2: ( rule__FreeText__NameAssignment_0 )
            // InternalExpressions.g:818:3: rule__FreeText__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FreeText__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFreeTextAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__FreeText__Group__0__Impl"


    // $ANTLR start "rule__FreeText__Group__1"
    // InternalExpressions.g:826:1: rule__FreeText__Group__1 : rule__FreeText__Group__1__Impl ;
    public final void rule__FreeText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:830:1: ( rule__FreeText__Group__1__Impl )
            // InternalExpressions.g:831:2: rule__FreeText__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FreeText__Group__1__Impl();

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
    // $ANTLR end "rule__FreeText__Group__1"


    // $ANTLR start "rule__FreeText__Group__1__Impl"
    // InternalExpressions.g:837:1: rule__FreeText__Group__1__Impl : ( ( rule__FreeText__Group_1__0 )* ) ;
    public final void rule__FreeText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:841:1: ( ( ( rule__FreeText__Group_1__0 )* ) )
            // InternalExpressions.g:842:1: ( ( rule__FreeText__Group_1__0 )* )
            {
            // InternalExpressions.g:842:1: ( ( rule__FreeText__Group_1__0 )* )
            // InternalExpressions.g:843:2: ( rule__FreeText__Group_1__0 )*
            {
             before(grammarAccess.getFreeTextAccess().getGroup_1()); 
            // InternalExpressions.g:844:2: ( rule__FreeText__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_WS) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalExpressions.g:844:3: rule__FreeText__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__FreeText__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getFreeTextAccess().getGroup_1()); 

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
    // $ANTLR end "rule__FreeText__Group__1__Impl"


    // $ANTLR start "rule__FreeText__Group_1__0"
    // InternalExpressions.g:853:1: rule__FreeText__Group_1__0 : rule__FreeText__Group_1__0__Impl rule__FreeText__Group_1__1 ;
    public final void rule__FreeText__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:857:1: ( rule__FreeText__Group_1__0__Impl rule__FreeText__Group_1__1 )
            // InternalExpressions.g:858:2: rule__FreeText__Group_1__0__Impl rule__FreeText__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__FreeText__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FreeText__Group_1__1();

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
    // $ANTLR end "rule__FreeText__Group_1__0"


    // $ANTLR start "rule__FreeText__Group_1__0__Impl"
    // InternalExpressions.g:865:1: rule__FreeText__Group_1__0__Impl : ( RULE_WS ) ;
    public final void rule__FreeText__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:869:1: ( ( RULE_WS ) )
            // InternalExpressions.g:870:1: ( RULE_WS )
            {
            // InternalExpressions.g:870:1: ( RULE_WS )
            // InternalExpressions.g:871:2: RULE_WS
            {
             before(grammarAccess.getFreeTextAccess().getWSTerminalRuleCall_1_0()); 
            match(input,RULE_WS,FOLLOW_2); 
             after(grammarAccess.getFreeTextAccess().getWSTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__FreeText__Group_1__0__Impl"


    // $ANTLR start "rule__FreeText__Group_1__1"
    // InternalExpressions.g:880:1: rule__FreeText__Group_1__1 : rule__FreeText__Group_1__1__Impl ;
    public final void rule__FreeText__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:884:1: ( rule__FreeText__Group_1__1__Impl )
            // InternalExpressions.g:885:2: rule__FreeText__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FreeText__Group_1__1__Impl();

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
    // $ANTLR end "rule__FreeText__Group_1__1"


    // $ANTLR start "rule__FreeText__Group_1__1__Impl"
    // InternalExpressions.g:891:1: rule__FreeText__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FreeText__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:895:1: ( ( RULE_ID ) )
            // InternalExpressions.g:896:1: ( RULE_ID )
            {
            // InternalExpressions.g:896:1: ( RULE_ID )
            // InternalExpressions.g:897:2: RULE_ID
            {
             before(grammarAccess.getFreeTextAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFreeTextAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__FreeText__Group_1__1__Impl"


    // $ANTLR start "rule__Sep__Group_1__0"
    // InternalExpressions.g:907:1: rule__Sep__Group_1__0 : rule__Sep__Group_1__0__Impl rule__Sep__Group_1__1 ;
    public final void rule__Sep__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:911:1: ( rule__Sep__Group_1__0__Impl rule__Sep__Group_1__1 )
            // InternalExpressions.g:912:2: rule__Sep__Group_1__0__Impl rule__Sep__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Sep__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sep__Group_1__1();

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
    // $ANTLR end "rule__Sep__Group_1__0"


    // $ANTLR start "rule__Sep__Group_1__0__Impl"
    // InternalExpressions.g:919:1: rule__Sep__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Sep__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:923:1: ( ( ',' ) )
            // InternalExpressions.g:924:1: ( ',' )
            {
            // InternalExpressions.g:924:1: ( ',' )
            // InternalExpressions.g:925:2: ','
            {
             before(grammarAccess.getSepAccess().getCommaKeyword_1_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSepAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__Sep__Group_1__0__Impl"


    // $ANTLR start "rule__Sep__Group_1__1"
    // InternalExpressions.g:934:1: rule__Sep__Group_1__1 : rule__Sep__Group_1__1__Impl ;
    public final void rule__Sep__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:938:1: ( rule__Sep__Group_1__1__Impl )
            // InternalExpressions.g:939:2: rule__Sep__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sep__Group_1__1__Impl();

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
    // $ANTLR end "rule__Sep__Group_1__1"


    // $ANTLR start "rule__Sep__Group_1__1__Impl"
    // InternalExpressions.g:945:1: rule__Sep__Group_1__1__Impl : ( RULE_WS ) ;
    public final void rule__Sep__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:949:1: ( ( RULE_WS ) )
            // InternalExpressions.g:950:1: ( RULE_WS )
            {
            // InternalExpressions.g:950:1: ( RULE_WS )
            // InternalExpressions.g:951:2: RULE_WS
            {
             before(grammarAccess.getSepAccess().getWSTerminalRuleCall_1_1()); 
            match(input,RULE_WS,FOLLOW_2); 
             after(grammarAccess.getSepAccess().getWSTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__Sep__Group_1__1__Impl"


    // $ANTLR start "rule__Model__ConfiguratorAssignment"
    // InternalExpressions.g:961:1: rule__Model__ConfiguratorAssignment : ( ruleConfigurator ) ;
    public final void rule__Model__ConfiguratorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:965:1: ( ( ruleConfigurator ) )
            // InternalExpressions.g:966:2: ( ruleConfigurator )
            {
            // InternalExpressions.g:966:2: ( ruleConfigurator )
            // InternalExpressions.g:967:3: ruleConfigurator
            {
             before(grammarAccess.getModelAccess().getConfiguratorConfiguratorParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleConfigurator();

            state._fsp--;

             after(grammarAccess.getModelAccess().getConfiguratorConfiguratorParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__ConfiguratorAssignment"


    // $ANTLR start "rule__Configurator__TitleAssignment_0"
    // InternalExpressions.g:976:1: rule__Configurator__TitleAssignment_0 : ( ruleTitle ) ;
    public final void rule__Configurator__TitleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:980:1: ( ( ruleTitle ) )
            // InternalExpressions.g:981:2: ( ruleTitle )
            {
            // InternalExpressions.g:981:2: ( ruleTitle )
            // InternalExpressions.g:982:3: ruleTitle
            {
             before(grammarAccess.getConfiguratorAccess().getTitleTitleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getConfiguratorAccess().getTitleTitleParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Configurator__TitleAssignment_0"


    // $ANTLR start "rule__Configurator__ExpressionAssignment_1"
    // InternalExpressions.g:991:1: rule__Configurator__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Configurator__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:995:1: ( ( ruleExpression ) )
            // InternalExpressions.g:996:2: ( ruleExpression )
            {
            // InternalExpressions.g:996:2: ( ruleExpression )
            // InternalExpressions.g:997:3: ruleExpression
            {
             before(grammarAccess.getConfiguratorAccess().getExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getConfiguratorAccess().getExpressionExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Configurator__ExpressionAssignment_1"


    // $ANTLR start "rule__Expression__LeftAssignment_0_0"
    // InternalExpressions.g:1006:1: rule__Expression__LeftAssignment_0_0 : ( ruleAtomicExpression ) ;
    public final void rule__Expression__LeftAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1010:1: ( ( ruleAtomicExpression ) )
            // InternalExpressions.g:1011:2: ( ruleAtomicExpression )
            {
            // InternalExpressions.g:1011:2: ( ruleAtomicExpression )
            // InternalExpressions.g:1012:3: ruleAtomicExpression
            {
             before(grammarAccess.getExpressionAccess().getLeftAtomicExpressionParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAtomicExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getLeftAtomicExpressionParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Expression__LeftAssignment_0_0"


    // $ANTLR start "rule__Expression__OperationAssignment_0_1_0"
    // InternalExpressions.g:1021:1: rule__Expression__OperationAssignment_0_1_0 : ( ruleOperation ) ;
    public final void rule__Expression__OperationAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1025:1: ( ( ruleOperation ) )
            // InternalExpressions.g:1026:2: ( ruleOperation )
            {
            // InternalExpressions.g:1026:2: ( ruleOperation )
            // InternalExpressions.g:1027:3: ruleOperation
            {
             before(grammarAccess.getExpressionAccess().getOperationOperationParserRuleCall_0_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOperationOperationParserRuleCall_0_1_0_0()); 

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
    // $ANTLR end "rule__Expression__OperationAssignment_0_1_0"


    // $ANTLR start "rule__Expression__RightAssignment_0_1_1"
    // InternalExpressions.g:1036:1: rule__Expression__RightAssignment_0_1_1 : ( ruleExpression ) ;
    public final void rule__Expression__RightAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1040:1: ( ( ruleExpression ) )
            // InternalExpressions.g:1041:2: ( ruleExpression )
            {
            // InternalExpressions.g:1041:2: ( ruleExpression )
            // InternalExpressions.g:1042:3: ruleExpression
            {
             before(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_0_1_1_0()); 

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
    // $ANTLR end "rule__Expression__RightAssignment_0_1_1"


    // $ANTLR start "rule__Expression__ParanthesisAssignment_1"
    // InternalExpressions.g:1051:1: rule__Expression__ParanthesisAssignment_1 : ( ruleParenthesisExpression ) ;
    public final void rule__Expression__ParanthesisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1055:1: ( ( ruleParenthesisExpression ) )
            // InternalExpressions.g:1056:2: ( ruleParenthesisExpression )
            {
            // InternalExpressions.g:1056:2: ( ruleParenthesisExpression )
            // InternalExpressions.g:1057:3: ruleParenthesisExpression
            {
             before(grammarAccess.getExpressionAccess().getParanthesisParenthesisExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParenthesisExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getParanthesisParenthesisExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Expression__ParanthesisAssignment_1"


    // $ANTLR start "rule__AtomicExpression__NameAssignment_0"
    // InternalExpressions.g:1066:1: rule__AtomicExpression__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__AtomicExpression__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1070:1: ( ( RULE_ID ) )
            // InternalExpressions.g:1071:2: ( RULE_ID )
            {
            // InternalExpressions.g:1071:2: ( RULE_ID )
            // InternalExpressions.g:1072:3: RULE_ID
            {
             before(grammarAccess.getAtomicExpressionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtomicExpressionAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__AtomicExpression__NameAssignment_0"


    // $ANTLR start "rule__FreeText__NameAssignment_0"
    // InternalExpressions.g:1081:1: rule__FreeText__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FreeText__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1085:1: ( ( RULE_ID ) )
            // InternalExpressions.g:1086:2: ( RULE_ID )
            {
            // InternalExpressions.g:1086:2: ( RULE_ID )
            // InternalExpressions.g:1087:3: RULE_ID
            {
             before(grammarAccess.getFreeTextAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFreeTextAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__FreeText__NameAssignment_0"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\1\11\uffff";
    static final String dfa_3s = "\1\4\11\uffff";
    static final String dfa_4s = "\1\25\11\uffff";
    static final String dfa_5s = "\1\uffff\1\2\10\1";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\6\uffff\1\11\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\1",
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
            return "()* loopback of 547:2: ( rule__Expression__Group_0_1__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000FE800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000FE802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000022L});

}