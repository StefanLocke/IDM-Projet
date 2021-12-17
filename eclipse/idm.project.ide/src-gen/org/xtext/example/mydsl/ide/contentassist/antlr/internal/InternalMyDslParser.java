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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'Load('", "')'", "'{'", "'}'", "'Create()'", "';'", "'InsertCol('", "','", "'RemoveCol('", "'InsertLine('", "'RemoveLine('", "'Insert('", "'Print('", "'Store('", "'Export('", "'Selectcell('", "'Linesum('", "'Colsum('", "'Lineprod('", "'Colprod('", "'('", "'None'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProgramme"
    // InternalMyDsl.g:53:1: entryRuleProgramme : ruleProgramme EOF ;
    public final void entryRuleProgramme() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleProgramme EOF )
            // InternalMyDsl.g:55:1: ruleProgramme EOF
            {
             before(grammarAccess.getProgrammeRule()); 
            pushFollow(FOLLOW_1);
            ruleProgramme();

            state._fsp--;

             after(grammarAccess.getProgrammeRule()); 
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
    // $ANTLR end "entryRuleProgramme"


    // $ANTLR start "ruleProgramme"
    // InternalMyDsl.g:62:1: ruleProgramme : ( ( rule__Programme__LoadscopesAssignment )* ) ;
    public final void ruleProgramme() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Programme__LoadscopesAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Programme__LoadscopesAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Programme__LoadscopesAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Programme__LoadscopesAssignment )*
            {
             before(grammarAccess.getProgrammeAccess().getLoadscopesAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Programme__LoadscopesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Programme__LoadscopesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Programme__LoadscopesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgrammeAccess().getLoadscopesAssignment()); 

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
    // $ANTLR end "ruleProgramme"


    // $ANTLR start "entryRuleLoadscope"
    // InternalMyDsl.g:78:1: entryRuleLoadscope : ruleLoadscope EOF ;
    public final void entryRuleLoadscope() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleLoadscope EOF )
            // InternalMyDsl.g:80:1: ruleLoadscope EOF
            {
             before(grammarAccess.getLoadscopeRule()); 
            pushFollow(FOLLOW_1);
            ruleLoadscope();

            state._fsp--;

             after(grammarAccess.getLoadscopeRule()); 
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
    // $ANTLR end "entryRuleLoadscope"


    // $ANTLR start "ruleLoadscope"
    // InternalMyDsl.g:87:1: ruleLoadscope : ( ( rule__Loadscope__Alternatives ) ) ;
    public final void ruleLoadscope() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Loadscope__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Loadscope__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Loadscope__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Loadscope__Alternatives )
            {
             before(grammarAccess.getLoadscopeAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Loadscope__Alternatives )
            // InternalMyDsl.g:94:4: rule__Loadscope__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Loadscope__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLoadscopeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLoadscope"


    // $ANTLR start "entryRuleLoad"
    // InternalMyDsl.g:103:1: entryRuleLoad : ruleLoad EOF ;
    public final void entryRuleLoad() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleLoad EOF )
            // InternalMyDsl.g:105:1: ruleLoad EOF
            {
             before(grammarAccess.getLoadRule()); 
            pushFollow(FOLLOW_1);
            ruleLoad();

            state._fsp--;

             after(grammarAccess.getLoadRule()); 
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
    // $ANTLR end "entryRuleLoad"


    // $ANTLR start "ruleLoad"
    // InternalMyDsl.g:112:1: ruleLoad : ( ( rule__Load__Group__0 ) ) ;
    public final void ruleLoad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Load__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Load__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Load__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Load__Group__0 )
            {
             before(grammarAccess.getLoadAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Load__Group__0 )
            // InternalMyDsl.g:119:4: rule__Load__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Load__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoadAccess().getGroup()); 

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
    // $ANTLR end "ruleLoad"


    // $ANTLR start "entryRuleCreate"
    // InternalMyDsl.g:128:1: entryRuleCreate : ruleCreate EOF ;
    public final void entryRuleCreate() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleCreate EOF )
            // InternalMyDsl.g:130:1: ruleCreate EOF
            {
             before(grammarAccess.getCreateRule()); 
            pushFollow(FOLLOW_1);
            ruleCreate();

            state._fsp--;

             after(grammarAccess.getCreateRule()); 
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
    // $ANTLR end "entryRuleCreate"


    // $ANTLR start "ruleCreate"
    // InternalMyDsl.g:137:1: ruleCreate : ( ( rule__Create__Group__0 ) ) ;
    public final void ruleCreate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Create__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Create__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Create__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Create__Group__0 )
            {
             before(grammarAccess.getCreateAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Create__Group__0 )
            // InternalMyDsl.g:144:4: rule__Create__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Create__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCreateAccess().getGroup()); 

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
    // $ANTLR end "ruleCreate"


    // $ANTLR start "entryRuleInstruction"
    // InternalMyDsl.g:153:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleInstruction EOF )
            // InternalMyDsl.g:155:1: ruleInstruction EOF
            {
             before(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getInstructionRule()); 
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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalMyDsl.g:162:1: ruleInstruction : ( ( rule__Instruction__Group__0 ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Instruction__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Instruction__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Instruction__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Instruction__Group__0 )
            {
             before(grammarAccess.getInstructionAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Instruction__Group__0 )
            // InternalMyDsl.g:169:4: rule__Instruction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstructionAccess().getGroup()); 

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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleInsertCol"
    // InternalMyDsl.g:178:1: entryRuleInsertCol : ruleInsertCol EOF ;
    public final void entryRuleInsertCol() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleInsertCol EOF )
            // InternalMyDsl.g:180:1: ruleInsertCol EOF
            {
             before(grammarAccess.getInsertColRule()); 
            pushFollow(FOLLOW_1);
            ruleInsertCol();

            state._fsp--;

             after(grammarAccess.getInsertColRule()); 
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
    // $ANTLR end "entryRuleInsertCol"


    // $ANTLR start "ruleInsertCol"
    // InternalMyDsl.g:187:1: ruleInsertCol : ( ( rule__InsertCol__Group__0 ) ) ;
    public final void ruleInsertCol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__InsertCol__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__InsertCol__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__InsertCol__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__InsertCol__Group__0 )
            {
             before(grammarAccess.getInsertColAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__InsertCol__Group__0 )
            // InternalMyDsl.g:194:4: rule__InsertCol__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InsertCol__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInsertColAccess().getGroup()); 

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
    // $ANTLR end "ruleInsertCol"


    // $ANTLR start "entryRuleRemoveCol"
    // InternalMyDsl.g:203:1: entryRuleRemoveCol : ruleRemoveCol EOF ;
    public final void entryRuleRemoveCol() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleRemoveCol EOF )
            // InternalMyDsl.g:205:1: ruleRemoveCol EOF
            {
             before(grammarAccess.getRemoveColRule()); 
            pushFollow(FOLLOW_1);
            ruleRemoveCol();

            state._fsp--;

             after(grammarAccess.getRemoveColRule()); 
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
    // $ANTLR end "entryRuleRemoveCol"


    // $ANTLR start "ruleRemoveCol"
    // InternalMyDsl.g:212:1: ruleRemoveCol : ( ( rule__RemoveCol__Alternatives ) ) ;
    public final void ruleRemoveCol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__RemoveCol__Alternatives ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__RemoveCol__Alternatives ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__RemoveCol__Alternatives ) )
            // InternalMyDsl.g:218:3: ( rule__RemoveCol__Alternatives )
            {
             before(grammarAccess.getRemoveColAccess().getAlternatives()); 
            // InternalMyDsl.g:219:3: ( rule__RemoveCol__Alternatives )
            // InternalMyDsl.g:219:4: rule__RemoveCol__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RemoveCol__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRemoveColAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRemoveCol"


    // $ANTLR start "entryRuleInsertLine"
    // InternalMyDsl.g:228:1: entryRuleInsertLine : ruleInsertLine EOF ;
    public final void entryRuleInsertLine() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleInsertLine EOF )
            // InternalMyDsl.g:230:1: ruleInsertLine EOF
            {
             before(grammarAccess.getInsertLineRule()); 
            pushFollow(FOLLOW_1);
            ruleInsertLine();

            state._fsp--;

             after(grammarAccess.getInsertLineRule()); 
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
    // $ANTLR end "entryRuleInsertLine"


    // $ANTLR start "ruleInsertLine"
    // InternalMyDsl.g:237:1: ruleInsertLine : ( ( rule__InsertLine__Group__0 ) ) ;
    public final void ruleInsertLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__InsertLine__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__InsertLine__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__InsertLine__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__InsertLine__Group__0 )
            {
             before(grammarAccess.getInsertLineAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__InsertLine__Group__0 )
            // InternalMyDsl.g:244:4: rule__InsertLine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InsertLine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInsertLineAccess().getGroup()); 

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
    // $ANTLR end "ruleInsertLine"


    // $ANTLR start "entryRuleRemoveLine"
    // InternalMyDsl.g:253:1: entryRuleRemoveLine : ruleRemoveLine EOF ;
    public final void entryRuleRemoveLine() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleRemoveLine EOF )
            // InternalMyDsl.g:255:1: ruleRemoveLine EOF
            {
             before(grammarAccess.getRemoveLineRule()); 
            pushFollow(FOLLOW_1);
            ruleRemoveLine();

            state._fsp--;

             after(grammarAccess.getRemoveLineRule()); 
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
    // $ANTLR end "entryRuleRemoveLine"


    // $ANTLR start "ruleRemoveLine"
    // InternalMyDsl.g:262:1: ruleRemoveLine : ( ( rule__RemoveLine__Group__0 ) ) ;
    public final void ruleRemoveLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__RemoveLine__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__RemoveLine__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__RemoveLine__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__RemoveLine__Group__0 )
            {
             before(grammarAccess.getRemoveLineAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__RemoveLine__Group__0 )
            // InternalMyDsl.g:269:4: rule__RemoveLine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RemoveLine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRemoveLineAccess().getGroup()); 

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
    // $ANTLR end "ruleRemoveLine"


    // $ANTLR start "entryRuleInsert"
    // InternalMyDsl.g:278:1: entryRuleInsert : ruleInsert EOF ;
    public final void entryRuleInsert() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleInsert EOF )
            // InternalMyDsl.g:280:1: ruleInsert EOF
            {
             before(grammarAccess.getInsertRule()); 
            pushFollow(FOLLOW_1);
            ruleInsert();

            state._fsp--;

             after(grammarAccess.getInsertRule()); 
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
    // $ANTLR end "entryRuleInsert"


    // $ANTLR start "ruleInsert"
    // InternalMyDsl.g:287:1: ruleInsert : ( ( rule__Insert__Group__0 ) ) ;
    public final void ruleInsert() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Insert__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Insert__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Insert__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Insert__Group__0 )
            {
             before(grammarAccess.getInsertAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Insert__Group__0 )
            // InternalMyDsl.g:294:4: rule__Insert__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getGroup()); 

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
    // $ANTLR end "ruleInsert"


    // $ANTLR start "entryRulePrint"
    // InternalMyDsl.g:303:1: entryRulePrint : rulePrint EOF ;
    public final void entryRulePrint() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( rulePrint EOF )
            // InternalMyDsl.g:305:1: rulePrint EOF
            {
             before(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_1);
            rulePrint();

            state._fsp--;

             after(grammarAccess.getPrintRule()); 
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
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // InternalMyDsl.g:312:1: rulePrint : ( ( rule__Print__Group__0 ) ) ;
    public final void rulePrint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Print__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Print__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Print__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Print__Group__0 )
            {
             before(grammarAccess.getPrintAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Print__Group__0 )
            // InternalMyDsl.g:319:4: rule__Print__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Print__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrintAccess().getGroup()); 

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
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRuleExportCSV"
    // InternalMyDsl.g:328:1: entryRuleExportCSV : ruleExportCSV EOF ;
    public final void entryRuleExportCSV() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleExportCSV EOF )
            // InternalMyDsl.g:330:1: ruleExportCSV EOF
            {
             before(grammarAccess.getExportCSVRule()); 
            pushFollow(FOLLOW_1);
            ruleExportCSV();

            state._fsp--;

             after(grammarAccess.getExportCSVRule()); 
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
    // $ANTLR end "entryRuleExportCSV"


    // $ANTLR start "ruleExportCSV"
    // InternalMyDsl.g:337:1: ruleExportCSV : ( ( rule__ExportCSV__Group__0 ) ) ;
    public final void ruleExportCSV() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__ExportCSV__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__ExportCSV__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__ExportCSV__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__ExportCSV__Group__0 )
            {
             before(grammarAccess.getExportCSVAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__ExportCSV__Group__0 )
            // InternalMyDsl.g:344:4: rule__ExportCSV__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExportCSV__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExportCSVAccess().getGroup()); 

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
    // $ANTLR end "ruleExportCSV"


    // $ANTLR start "entryRuleExportJSON"
    // InternalMyDsl.g:353:1: entryRuleExportJSON : ruleExportJSON EOF ;
    public final void entryRuleExportJSON() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleExportJSON EOF )
            // InternalMyDsl.g:355:1: ruleExportJSON EOF
            {
             before(grammarAccess.getExportJSONRule()); 
            pushFollow(FOLLOW_1);
            ruleExportJSON();

            state._fsp--;

             after(grammarAccess.getExportJSONRule()); 
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
    // $ANTLR end "entryRuleExportJSON"


    // $ANTLR start "ruleExportJSON"
    // InternalMyDsl.g:362:1: ruleExportJSON : ( ( rule__ExportJSON__Group__0 ) ) ;
    public final void ruleExportJSON() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__ExportJSON__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__ExportJSON__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__ExportJSON__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__ExportJSON__Group__0 )
            {
             before(grammarAccess.getExportJSONAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__ExportJSON__Group__0 )
            // InternalMyDsl.g:369:4: rule__ExportJSON__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExportJSON__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExportJSONAccess().getGroup()); 

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
    // $ANTLR end "ruleExportJSON"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:378:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleExpression EOF )
            // InternalMyDsl.g:380:1: ruleExpression EOF
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
    // InternalMyDsl.g:387:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Expression__Alternatives ) )
            // InternalMyDsl.g:393:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalMyDsl.g:394:3: ( rule__Expression__Alternatives )
            // InternalMyDsl.g:394:4: rule__Expression__Alternatives
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


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalMyDsl.g:403:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( rulePrimaryExpression EOF )
            // InternalMyDsl.g:405:1: rulePrimaryExpression EOF
            {
             before(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalMyDsl.g:412:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalMyDsl.g:418:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalMyDsl.g:419:3: ( rule__PrimaryExpression__Alternatives )
            // InternalMyDsl.g:419:4: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleSelectcell"
    // InternalMyDsl.g:428:1: entryRuleSelectcell : ruleSelectcell EOF ;
    public final void entryRuleSelectcell() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleSelectcell EOF )
            // InternalMyDsl.g:430:1: ruleSelectcell EOF
            {
             before(grammarAccess.getSelectcellRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectcell();

            state._fsp--;

             after(grammarAccess.getSelectcellRule()); 
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
    // $ANTLR end "entryRuleSelectcell"


    // $ANTLR start "ruleSelectcell"
    // InternalMyDsl.g:437:1: ruleSelectcell : ( ( rule__Selectcell__Group__0 ) ) ;
    public final void ruleSelectcell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__Selectcell__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__Selectcell__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__Selectcell__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__Selectcell__Group__0 )
            {
             before(grammarAccess.getSelectcellAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__Selectcell__Group__0 )
            // InternalMyDsl.g:444:4: rule__Selectcell__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Selectcell__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectcellAccess().getGroup()); 

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
    // $ANTLR end "ruleSelectcell"


    // $ANTLR start "entryRuleLinesum"
    // InternalMyDsl.g:453:1: entryRuleLinesum : ruleLinesum EOF ;
    public final void entryRuleLinesum() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleLinesum EOF )
            // InternalMyDsl.g:455:1: ruleLinesum EOF
            {
             before(grammarAccess.getLinesumRule()); 
            pushFollow(FOLLOW_1);
            ruleLinesum();

            state._fsp--;

             after(grammarAccess.getLinesumRule()); 
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
    // $ANTLR end "entryRuleLinesum"


    // $ANTLR start "ruleLinesum"
    // InternalMyDsl.g:462:1: ruleLinesum : ( ( rule__Linesum__Group__0 ) ) ;
    public final void ruleLinesum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__Linesum__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__Linesum__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__Linesum__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__Linesum__Group__0 )
            {
             before(grammarAccess.getLinesumAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__Linesum__Group__0 )
            // InternalMyDsl.g:469:4: rule__Linesum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Linesum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinesumAccess().getGroup()); 

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
    // $ANTLR end "ruleLinesum"


    // $ANTLR start "entryRuleColsum"
    // InternalMyDsl.g:478:1: entryRuleColsum : ruleColsum EOF ;
    public final void entryRuleColsum() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleColsum EOF )
            // InternalMyDsl.g:480:1: ruleColsum EOF
            {
             before(grammarAccess.getColsumRule()); 
            pushFollow(FOLLOW_1);
            ruleColsum();

            state._fsp--;

             after(grammarAccess.getColsumRule()); 
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
    // $ANTLR end "entryRuleColsum"


    // $ANTLR start "ruleColsum"
    // InternalMyDsl.g:487:1: ruleColsum : ( ( rule__Colsum__Alternatives ) ) ;
    public final void ruleColsum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__Colsum__Alternatives ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__Colsum__Alternatives ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__Colsum__Alternatives ) )
            // InternalMyDsl.g:493:3: ( rule__Colsum__Alternatives )
            {
             before(grammarAccess.getColsumAccess().getAlternatives()); 
            // InternalMyDsl.g:494:3: ( rule__Colsum__Alternatives )
            // InternalMyDsl.g:494:4: rule__Colsum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Colsum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColsumAccess().getAlternatives()); 

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
    // $ANTLR end "ruleColsum"


    // $ANTLR start "entryRuleLineprod"
    // InternalMyDsl.g:503:1: entryRuleLineprod : ruleLineprod EOF ;
    public final void entryRuleLineprod() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleLineprod EOF )
            // InternalMyDsl.g:505:1: ruleLineprod EOF
            {
             before(grammarAccess.getLineprodRule()); 
            pushFollow(FOLLOW_1);
            ruleLineprod();

            state._fsp--;

             after(grammarAccess.getLineprodRule()); 
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
    // $ANTLR end "entryRuleLineprod"


    // $ANTLR start "ruleLineprod"
    // InternalMyDsl.g:512:1: ruleLineprod : ( ( rule__Lineprod__Group__0 ) ) ;
    public final void ruleLineprod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__Lineprod__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__Lineprod__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__Lineprod__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__Lineprod__Group__0 )
            {
             before(grammarAccess.getLineprodAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__Lineprod__Group__0 )
            // InternalMyDsl.g:519:4: rule__Lineprod__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Lineprod__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLineprodAccess().getGroup()); 

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
    // $ANTLR end "ruleLineprod"


    // $ANTLR start "entryRuleColprod"
    // InternalMyDsl.g:528:1: entryRuleColprod : ruleColprod EOF ;
    public final void entryRuleColprod() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleColprod EOF )
            // InternalMyDsl.g:530:1: ruleColprod EOF
            {
             before(grammarAccess.getColprodRule()); 
            pushFollow(FOLLOW_1);
            ruleColprod();

            state._fsp--;

             after(grammarAccess.getColprodRule()); 
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
    // $ANTLR end "entryRuleColprod"


    // $ANTLR start "ruleColprod"
    // InternalMyDsl.g:537:1: ruleColprod : ( ( rule__Colprod__Alternatives ) ) ;
    public final void ruleColprod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__Colprod__Alternatives ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__Colprod__Alternatives ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__Colprod__Alternatives ) )
            // InternalMyDsl.g:543:3: ( rule__Colprod__Alternatives )
            {
             before(grammarAccess.getColprodAccess().getAlternatives()); 
            // InternalMyDsl.g:544:3: ( rule__Colprod__Alternatives )
            // InternalMyDsl.g:544:4: rule__Colprod__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Colprod__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColprodAccess().getAlternatives()); 

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
    // $ANTLR end "ruleColprod"


    // $ANTLR start "entryRuleBinexpr"
    // InternalMyDsl.g:553:1: entryRuleBinexpr : ruleBinexpr EOF ;
    public final void entryRuleBinexpr() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleBinexpr EOF )
            // InternalMyDsl.g:555:1: ruleBinexpr EOF
            {
             before(grammarAccess.getBinexprRule()); 
            pushFollow(FOLLOW_1);
            ruleBinexpr();

            state._fsp--;

             after(grammarAccess.getBinexprRule()); 
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
    // $ANTLR end "entryRuleBinexpr"


    // $ANTLR start "ruleBinexpr"
    // InternalMyDsl.g:562:1: ruleBinexpr : ( ( rule__Binexpr__Group__0 ) ) ;
    public final void ruleBinexpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__Binexpr__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__Binexpr__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__Binexpr__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__Binexpr__Group__0 )
            {
             before(grammarAccess.getBinexprAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__Binexpr__Group__0 )
            // InternalMyDsl.g:569:4: rule__Binexpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Binexpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinexprAccess().getGroup()); 

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
    // $ANTLR end "ruleBinexpr"


    // $ANTLR start "entryRuleOp"
    // InternalMyDsl.g:578:1: entryRuleOp : ruleOp EOF ;
    public final void entryRuleOp() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleOp EOF )
            // InternalMyDsl.g:580:1: ruleOp EOF
            {
             before(grammarAccess.getOpRule()); 
            pushFollow(FOLLOW_1);
            ruleOp();

            state._fsp--;

             after(grammarAccess.getOpRule()); 
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
    // $ANTLR end "entryRuleOp"


    // $ANTLR start "ruleOp"
    // InternalMyDsl.g:587:1: ruleOp : ( ( rule__Op__Alternatives ) ) ;
    public final void ruleOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__Op__Alternatives ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__Op__Alternatives ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__Op__Alternatives ) )
            // InternalMyDsl.g:593:3: ( rule__Op__Alternatives )
            {
             before(grammarAccess.getOpAccess().getAlternatives()); 
            // InternalMyDsl.g:594:3: ( rule__Op__Alternatives )
            // InternalMyDsl.g:594:4: rule__Op__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Op__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOpAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOp"


    // $ANTLR start "entryRuleNoneValue"
    // InternalMyDsl.g:603:1: entryRuleNoneValue : ruleNoneValue EOF ;
    public final void entryRuleNoneValue() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleNoneValue EOF )
            // InternalMyDsl.g:605:1: ruleNoneValue EOF
            {
             before(grammarAccess.getNoneValueRule()); 
            pushFollow(FOLLOW_1);
            ruleNoneValue();

            state._fsp--;

             after(grammarAccess.getNoneValueRule()); 
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
    // $ANTLR end "entryRuleNoneValue"


    // $ANTLR start "ruleNoneValue"
    // InternalMyDsl.g:612:1: ruleNoneValue : ( ( rule__NoneValue__ValueAssignment ) ) ;
    public final void ruleNoneValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__NoneValue__ValueAssignment ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__NoneValue__ValueAssignment ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__NoneValue__ValueAssignment ) )
            // InternalMyDsl.g:618:3: ( rule__NoneValue__ValueAssignment )
            {
             before(grammarAccess.getNoneValueAccess().getValueAssignment()); 
            // InternalMyDsl.g:619:3: ( rule__NoneValue__ValueAssignment )
            // InternalMyDsl.g:619:4: rule__NoneValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NoneValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNoneValueAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleNoneValue"


    // $ANTLR start "entryRuleIntValue"
    // InternalMyDsl.g:628:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleIntValue EOF )
            // InternalMyDsl.g:630:1: ruleIntValue EOF
            {
             before(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            ruleIntValue();

            state._fsp--;

             after(grammarAccess.getIntValueRule()); 
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
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalMyDsl.g:637:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__IntValue__ValueAssignment ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__IntValue__ValueAssignment ) )
            // InternalMyDsl.g:643:3: ( rule__IntValue__ValueAssignment )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            // InternalMyDsl.g:644:3: ( rule__IntValue__ValueAssignment )
            // InternalMyDsl.g:644:4: rule__IntValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntValueAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalMyDsl.g:653:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleStringValue EOF )
            // InternalMyDsl.g:655:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalMyDsl.g:662:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalMyDsl.g:668:3: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // InternalMyDsl.g:669:3: ( rule__StringValue__ValueAssignment )
            // InternalMyDsl.g:669:4: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "rule__Loadscope__Alternatives"
    // InternalMyDsl.g:677:1: rule__Loadscope__Alternatives : ( ( ruleLoad ) | ( ruleCreate ) );
    public final void rule__Loadscope__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:681:1: ( ( ruleLoad ) | ( ruleCreate ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==19) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:682:2: ( ruleLoad )
                    {
                    // InternalMyDsl.g:682:2: ( ruleLoad )
                    // InternalMyDsl.g:683:3: ruleLoad
                    {
                     before(grammarAccess.getLoadscopeAccess().getLoadParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLoad();

                    state._fsp--;

                     after(grammarAccess.getLoadscopeAccess().getLoadParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:688:2: ( ruleCreate )
                    {
                    // InternalMyDsl.g:688:2: ( ruleCreate )
                    // InternalMyDsl.g:689:3: ruleCreate
                    {
                     before(grammarAccess.getLoadscopeAccess().getCreateParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCreate();

                    state._fsp--;

                     after(grammarAccess.getLoadscopeAccess().getCreateParserRuleCall_1()); 

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
    // $ANTLR end "rule__Loadscope__Alternatives"


    // $ANTLR start "rule__Instruction__Alternatives_0"
    // InternalMyDsl.g:698:1: rule__Instruction__Alternatives_0 : ( ( ruleInsertLine ) | ( ruleRemoveLine ) | ( ruleInsertCol ) | ( ruleRemoveCol ) | ( ruleInsert ) | ( ruleExportJSON ) | ( ruleExportCSV ) | ( rulePrint ) );
    public final void rule__Instruction__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:702:1: ( ( ruleInsertLine ) | ( ruleRemoveLine ) | ( ruleInsertCol ) | ( ruleRemoveCol ) | ( ruleInsert ) | ( ruleExportJSON ) | ( ruleExportCSV ) | ( rulePrint ) )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt3=1;
                }
                break;
            case 25:
                {
                alt3=2;
                }
                break;
            case 21:
                {
                alt3=3;
                }
                break;
            case RULE_STRING:
            case 23:
                {
                alt3=4;
                }
                break;
            case 26:
                {
                alt3=5;
                }
                break;
            case 29:
                {
                alt3=6;
                }
                break;
            case 28:
                {
                alt3=7;
                }
                break;
            case 27:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:703:2: ( ruleInsertLine )
                    {
                    // InternalMyDsl.g:703:2: ( ruleInsertLine )
                    // InternalMyDsl.g:704:3: ruleInsertLine
                    {
                     before(grammarAccess.getInstructionAccess().getInsertLineParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInsertLine();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getInsertLineParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:709:2: ( ruleRemoveLine )
                    {
                    // InternalMyDsl.g:709:2: ( ruleRemoveLine )
                    // InternalMyDsl.g:710:3: ruleRemoveLine
                    {
                     before(grammarAccess.getInstructionAccess().getRemoveLineParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRemoveLine();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getRemoveLineParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:715:2: ( ruleInsertCol )
                    {
                    // InternalMyDsl.g:715:2: ( ruleInsertCol )
                    // InternalMyDsl.g:716:3: ruleInsertCol
                    {
                     before(grammarAccess.getInstructionAccess().getInsertColParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInsertCol();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getInsertColParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:721:2: ( ruleRemoveCol )
                    {
                    // InternalMyDsl.g:721:2: ( ruleRemoveCol )
                    // InternalMyDsl.g:722:3: ruleRemoveCol
                    {
                     before(grammarAccess.getInstructionAccess().getRemoveColParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRemoveCol();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getRemoveColParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:727:2: ( ruleInsert )
                    {
                    // InternalMyDsl.g:727:2: ( ruleInsert )
                    // InternalMyDsl.g:728:3: ruleInsert
                    {
                     before(grammarAccess.getInstructionAccess().getInsertParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleInsert();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getInsertParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:733:2: ( ruleExportJSON )
                    {
                    // InternalMyDsl.g:733:2: ( ruleExportJSON )
                    // InternalMyDsl.g:734:3: ruleExportJSON
                    {
                     before(grammarAccess.getInstructionAccess().getExportJSONParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_2);
                    ruleExportJSON();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getExportJSONParserRuleCall_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:739:2: ( ruleExportCSV )
                    {
                    // InternalMyDsl.g:739:2: ( ruleExportCSV )
                    // InternalMyDsl.g:740:3: ruleExportCSV
                    {
                     before(grammarAccess.getInstructionAccess().getExportCSVParserRuleCall_0_6()); 
                    pushFollow(FOLLOW_2);
                    ruleExportCSV();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getExportCSVParserRuleCall_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:745:2: ( rulePrint )
                    {
                    // InternalMyDsl.g:745:2: ( rulePrint )
                    // InternalMyDsl.g:746:3: rulePrint
                    {
                     before(grammarAccess.getInstructionAccess().getPrintParserRuleCall_0_7()); 
                    pushFollow(FOLLOW_2);
                    rulePrint();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getPrintParserRuleCall_0_7()); 

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
    // $ANTLR end "rule__Instruction__Alternatives_0"


    // $ANTLR start "rule__RemoveCol__Alternatives"
    // InternalMyDsl.g:755:1: rule__RemoveCol__Alternatives : ( ( ( rule__RemoveCol__Group_0__0 ) ) | ( ( rule__RemoveCol__Group_1__0 ) ) );
    public final void rule__RemoveCol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:759:1: ( ( ( rule__RemoveCol__Group_0__0 ) ) | ( ( rule__RemoveCol__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:760:2: ( ( rule__RemoveCol__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:760:2: ( ( rule__RemoveCol__Group_0__0 ) )
                    // InternalMyDsl.g:761:3: ( rule__RemoveCol__Group_0__0 )
                    {
                     before(grammarAccess.getRemoveColAccess().getGroup_0()); 
                    // InternalMyDsl.g:762:3: ( rule__RemoveCol__Group_0__0 )
                    // InternalMyDsl.g:762:4: rule__RemoveCol__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RemoveCol__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRemoveColAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:766:2: ( ( rule__RemoveCol__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:766:2: ( ( rule__RemoveCol__Group_1__0 ) )
                    // InternalMyDsl.g:767:3: ( rule__RemoveCol__Group_1__0 )
                    {
                     before(grammarAccess.getRemoveColAccess().getGroup_1()); 
                    // InternalMyDsl.g:768:3: ( rule__RemoveCol__Group_1__0 )
                    // InternalMyDsl.g:768:4: rule__RemoveCol__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RemoveCol__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRemoveColAccess().getGroup_1()); 

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
    // $ANTLR end "rule__RemoveCol__Alternatives"


    // $ANTLR start "rule__Insert__ValueAlternatives_5_0"
    // InternalMyDsl.g:776:1: rule__Insert__ValueAlternatives_5_0 : ( ( ruleExpression ) | ( ruleStringValue ) );
    public final void rule__Insert__ValueAlternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:780:1: ( ( ruleExpression ) | ( ruleStringValue ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT||(LA5_0>=30 && LA5_0<=36)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==16) ) {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3==EOF||LA5_3==20) ) {
                        alt5=2;
                    }
                    else if ( (LA5_3==16) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:781:2: ( ruleExpression )
                    {
                    // InternalMyDsl.g:781:2: ( ruleExpression )
                    // InternalMyDsl.g:782:3: ruleExpression
                    {
                     before(grammarAccess.getInsertAccess().getValueExpressionParserRuleCall_5_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExpression();

                    state._fsp--;

                     after(grammarAccess.getInsertAccess().getValueExpressionParserRuleCall_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:787:2: ( ruleStringValue )
                    {
                    // InternalMyDsl.g:787:2: ( ruleStringValue )
                    // InternalMyDsl.g:788:3: ruleStringValue
                    {
                     before(grammarAccess.getInsertAccess().getValueStringValueParserRuleCall_5_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getInsertAccess().getValueStringValueParserRuleCall_5_0_1()); 

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
    // $ANTLR end "rule__Insert__ValueAlternatives_5_0"


    // $ANTLR start "rule__Print__ValueAlternatives_1_0"
    // InternalMyDsl.g:797:1: rule__Print__ValueAlternatives_1_0 : ( ( ruleExpression ) | ( ruleStringValue ) );
    public final void rule__Print__ValueAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:801:1: ( ( ruleExpression ) | ( ruleStringValue ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT||(LA6_0>=30 && LA6_0<=36)) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==16) ) {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==EOF||LA6_3==20) ) {
                        alt6=2;
                    }
                    else if ( (LA6_3==16) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

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
                    // InternalMyDsl.g:802:2: ( ruleExpression )
                    {
                    // InternalMyDsl.g:802:2: ( ruleExpression )
                    // InternalMyDsl.g:803:3: ruleExpression
                    {
                     before(grammarAccess.getPrintAccess().getValueExpressionParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExpression();

                    state._fsp--;

                     after(grammarAccess.getPrintAccess().getValueExpressionParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:808:2: ( ruleStringValue )
                    {
                    // InternalMyDsl.g:808:2: ( ruleStringValue )
                    // InternalMyDsl.g:809:3: ruleStringValue
                    {
                     before(grammarAccess.getPrintAccess().getValueStringValueParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getPrintAccess().getValueStringValueParserRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__Print__ValueAlternatives_1_0"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalMyDsl.g:818:1: rule__Expression__Alternatives : ( ( rulePrimaryExpression ) | ( ruleBinexpr ) | ( ruleNoneValue ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:822:1: ( ( rulePrimaryExpression ) | ( ruleBinexpr ) | ( ruleNoneValue ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
                {
                alt7=1;
                }
                break;
            case 35:
                {
                alt7=2;
                }
                break;
            case 36:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:823:2: ( rulePrimaryExpression )
                    {
                    // InternalMyDsl.g:823:2: ( rulePrimaryExpression )
                    // InternalMyDsl.g:824:3: rulePrimaryExpression
                    {
                     before(grammarAccess.getExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimaryExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:829:2: ( ruleBinexpr )
                    {
                    // InternalMyDsl.g:829:2: ( ruleBinexpr )
                    // InternalMyDsl.g:830:3: ruleBinexpr
                    {
                     before(grammarAccess.getExpressionAccess().getBinexprParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBinexpr();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getBinexprParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:835:2: ( ruleNoneValue )
                    {
                    // InternalMyDsl.g:835:2: ( ruleNoneValue )
                    // InternalMyDsl.g:836:3: ruleNoneValue
                    {
                     before(grammarAccess.getExpressionAccess().getNoneValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNoneValue();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getNoneValueParserRuleCall_2()); 

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


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // InternalMyDsl.g:845:1: rule__PrimaryExpression__Alternatives : ( ( ruleIntValue ) | ( ruleSelectcell ) | ( ruleLinesum ) | ( ruleColsum ) | ( ruleLineprod ) | ( ruleColprod ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:849:1: ( ( ruleIntValue ) | ( ruleSelectcell ) | ( ruleLinesum ) | ( ruleColsum ) | ( ruleLineprod ) | ( ruleColprod ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt8=1;
                }
                break;
            case 30:
                {
                alt8=2;
                }
                break;
            case 31:
                {
                alt8=3;
                }
                break;
            case 32:
                {
                alt8=4;
                }
                break;
            case RULE_STRING:
                {
                int LA8_5 = input.LA(2);

                if ( (LA8_5==16) ) {
                    alt8=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 5, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                alt8=5;
                }
                break;
            case 34:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:850:2: ( ruleIntValue )
                    {
                    // InternalMyDsl.g:850:2: ( ruleIntValue )
                    // InternalMyDsl.g:851:3: ruleIntValue
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getIntValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntValue();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getIntValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:856:2: ( ruleSelectcell )
                    {
                    // InternalMyDsl.g:856:2: ( ruleSelectcell )
                    // InternalMyDsl.g:857:3: ruleSelectcell
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getSelectcellParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSelectcell();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getSelectcellParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:862:2: ( ruleLinesum )
                    {
                    // InternalMyDsl.g:862:2: ( ruleLinesum )
                    // InternalMyDsl.g:863:3: ruleLinesum
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getLinesumParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLinesum();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getLinesumParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:868:2: ( ruleColsum )
                    {
                    // InternalMyDsl.g:868:2: ( ruleColsum )
                    // InternalMyDsl.g:869:3: ruleColsum
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getColsumParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleColsum();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getColsumParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:874:2: ( ruleLineprod )
                    {
                    // InternalMyDsl.g:874:2: ( ruleLineprod )
                    // InternalMyDsl.g:875:3: ruleLineprod
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getLineprodParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleLineprod();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getLineprodParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:880:2: ( ruleColprod )
                    {
                    // InternalMyDsl.g:880:2: ( ruleColprod )
                    // InternalMyDsl.g:881:3: ruleColprod
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getColprodParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleColprod();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getColprodParserRuleCall_5()); 

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
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__Colsum__Alternatives"
    // InternalMyDsl.g:890:1: rule__Colsum__Alternatives : ( ( ( rule__Colsum__Group_0__0 ) ) | ( ( rule__Colsum__Group_1__0 ) ) );
    public final void rule__Colsum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:894:1: ( ( ( rule__Colsum__Group_0__0 ) ) | ( ( rule__Colsum__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_STRING) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:895:2: ( ( rule__Colsum__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:895:2: ( ( rule__Colsum__Group_0__0 ) )
                    // InternalMyDsl.g:896:3: ( rule__Colsum__Group_0__0 )
                    {
                     before(grammarAccess.getColsumAccess().getGroup_0()); 
                    // InternalMyDsl.g:897:3: ( rule__Colsum__Group_0__0 )
                    // InternalMyDsl.g:897:4: rule__Colsum__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Colsum__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColsumAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:901:2: ( ( rule__Colsum__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:901:2: ( ( rule__Colsum__Group_1__0 ) )
                    // InternalMyDsl.g:902:3: ( rule__Colsum__Group_1__0 )
                    {
                     before(grammarAccess.getColsumAccess().getGroup_1()); 
                    // InternalMyDsl.g:903:3: ( rule__Colsum__Group_1__0 )
                    // InternalMyDsl.g:903:4: rule__Colsum__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Colsum__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColsumAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Colsum__Alternatives"


    // $ANTLR start "rule__Colprod__Alternatives"
    // InternalMyDsl.g:911:1: rule__Colprod__Alternatives : ( ( ( rule__Colprod__Group_0__0 ) ) | ( ( rule__Colprod__Group_1__0 ) ) );
    public final void rule__Colprod__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:915:1: ( ( ( rule__Colprod__Group_0__0 ) ) | ( ( rule__Colprod__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==34) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_STRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:916:2: ( ( rule__Colprod__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:916:2: ( ( rule__Colprod__Group_0__0 ) )
                    // InternalMyDsl.g:917:3: ( rule__Colprod__Group_0__0 )
                    {
                     before(grammarAccess.getColprodAccess().getGroup_0()); 
                    // InternalMyDsl.g:918:3: ( rule__Colprod__Group_0__0 )
                    // InternalMyDsl.g:918:4: rule__Colprod__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Colprod__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColprodAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:922:2: ( ( rule__Colprod__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:922:2: ( ( rule__Colprod__Group_1__0 ) )
                    // InternalMyDsl.g:923:3: ( rule__Colprod__Group_1__0 )
                    {
                     before(grammarAccess.getColprodAccess().getGroup_1()); 
                    // InternalMyDsl.g:924:3: ( rule__Colprod__Group_1__0 )
                    // InternalMyDsl.g:924:4: rule__Colprod__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Colprod__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColprodAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Colprod__Alternatives"


    // $ANTLR start "rule__Op__Alternatives"
    // InternalMyDsl.g:932:1: rule__Op__Alternatives : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) );
    public final void rule__Op__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:936:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt11=1;
                }
                break;
            case 12:
                {
                alt11=2;
                }
                break;
            case 13:
                {
                alt11=3;
                }
                break;
            case 14:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:937:2: ( '+' )
                    {
                    // InternalMyDsl.g:937:2: ( '+' )
                    // InternalMyDsl.g:938:3: '+'
                    {
                     before(grammarAccess.getOpAccess().getPlusSignKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:943:2: ( '-' )
                    {
                    // InternalMyDsl.g:943:2: ( '-' )
                    // InternalMyDsl.g:944:3: '-'
                    {
                     before(grammarAccess.getOpAccess().getHyphenMinusKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:949:2: ( '*' )
                    {
                    // InternalMyDsl.g:949:2: ( '*' )
                    // InternalMyDsl.g:950:3: '*'
                    {
                     before(grammarAccess.getOpAccess().getAsteriskKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getAsteriskKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:955:2: ( '/' )
                    {
                    // InternalMyDsl.g:955:2: ( '/' )
                    // InternalMyDsl.g:956:3: '/'
                    {
                     before(grammarAccess.getOpAccess().getSolidusKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getSolidusKeyword_3()); 

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
    // $ANTLR end "rule__Op__Alternatives"


    // $ANTLR start "rule__Load__Group__0"
    // InternalMyDsl.g:965:1: rule__Load__Group__0 : rule__Load__Group__0__Impl rule__Load__Group__1 ;
    public final void rule__Load__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:969:1: ( rule__Load__Group__0__Impl rule__Load__Group__1 )
            // InternalMyDsl.g:970:2: rule__Load__Group__0__Impl rule__Load__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Load__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Load__Group__1();

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
    // $ANTLR end "rule__Load__Group__0"


    // $ANTLR start "rule__Load__Group__0__Impl"
    // InternalMyDsl.g:977:1: rule__Load__Group__0__Impl : ( 'Load(' ) ;
    public final void rule__Load__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:981:1: ( ( 'Load(' ) )
            // InternalMyDsl.g:982:1: ( 'Load(' )
            {
            // InternalMyDsl.g:982:1: ( 'Load(' )
            // InternalMyDsl.g:983:2: 'Load('
            {
             before(grammarAccess.getLoadAccess().getLoadKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLoadAccess().getLoadKeyword_0()); 

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
    // $ANTLR end "rule__Load__Group__0__Impl"


    // $ANTLR start "rule__Load__Group__1"
    // InternalMyDsl.g:992:1: rule__Load__Group__1 : rule__Load__Group__1__Impl rule__Load__Group__2 ;
    public final void rule__Load__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:996:1: ( rule__Load__Group__1__Impl rule__Load__Group__2 )
            // InternalMyDsl.g:997:2: rule__Load__Group__1__Impl rule__Load__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Load__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Load__Group__2();

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
    // $ANTLR end "rule__Load__Group__1"


    // $ANTLR start "rule__Load__Group__1__Impl"
    // InternalMyDsl.g:1004:1: rule__Load__Group__1__Impl : ( ( rule__Load__PathAssignment_1 ) ) ;
    public final void rule__Load__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1008:1: ( ( ( rule__Load__PathAssignment_1 ) ) )
            // InternalMyDsl.g:1009:1: ( ( rule__Load__PathAssignment_1 ) )
            {
            // InternalMyDsl.g:1009:1: ( ( rule__Load__PathAssignment_1 ) )
            // InternalMyDsl.g:1010:2: ( rule__Load__PathAssignment_1 )
            {
             before(grammarAccess.getLoadAccess().getPathAssignment_1()); 
            // InternalMyDsl.g:1011:2: ( rule__Load__PathAssignment_1 )
            // InternalMyDsl.g:1011:3: rule__Load__PathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Load__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLoadAccess().getPathAssignment_1()); 

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
    // $ANTLR end "rule__Load__Group__1__Impl"


    // $ANTLR start "rule__Load__Group__2"
    // InternalMyDsl.g:1019:1: rule__Load__Group__2 : rule__Load__Group__2__Impl rule__Load__Group__3 ;
    public final void rule__Load__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1023:1: ( rule__Load__Group__2__Impl rule__Load__Group__3 )
            // InternalMyDsl.g:1024:2: rule__Load__Group__2__Impl rule__Load__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Load__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Load__Group__3();

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
    // $ANTLR end "rule__Load__Group__2"


    // $ANTLR start "rule__Load__Group__2__Impl"
    // InternalMyDsl.g:1031:1: rule__Load__Group__2__Impl : ( ')' ) ;
    public final void rule__Load__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1035:1: ( ( ')' ) )
            // InternalMyDsl.g:1036:1: ( ')' )
            {
            // InternalMyDsl.g:1036:1: ( ')' )
            // InternalMyDsl.g:1037:2: ')'
            {
             before(grammarAccess.getLoadAccess().getRightParenthesisKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLoadAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Load__Group__2__Impl"


    // $ANTLR start "rule__Load__Group__3"
    // InternalMyDsl.g:1046:1: rule__Load__Group__3 : rule__Load__Group__3__Impl rule__Load__Group__4 ;
    public final void rule__Load__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1050:1: ( rule__Load__Group__3__Impl rule__Load__Group__4 )
            // InternalMyDsl.g:1051:2: rule__Load__Group__3__Impl rule__Load__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Load__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Load__Group__4();

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
    // $ANTLR end "rule__Load__Group__3"


    // $ANTLR start "rule__Load__Group__3__Impl"
    // InternalMyDsl.g:1058:1: rule__Load__Group__3__Impl : ( '{' ) ;
    public final void rule__Load__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1062:1: ( ( '{' ) )
            // InternalMyDsl.g:1063:1: ( '{' )
            {
            // InternalMyDsl.g:1063:1: ( '{' )
            // InternalMyDsl.g:1064:2: '{'
            {
             before(grammarAccess.getLoadAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLoadAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Load__Group__3__Impl"


    // $ANTLR start "rule__Load__Group__4"
    // InternalMyDsl.g:1073:1: rule__Load__Group__4 : rule__Load__Group__4__Impl rule__Load__Group__5 ;
    public final void rule__Load__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1077:1: ( rule__Load__Group__4__Impl rule__Load__Group__5 )
            // InternalMyDsl.g:1078:2: rule__Load__Group__4__Impl rule__Load__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Load__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Load__Group__5();

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
    // $ANTLR end "rule__Load__Group__4"


    // $ANTLR start "rule__Load__Group__4__Impl"
    // InternalMyDsl.g:1085:1: rule__Load__Group__4__Impl : ( ( rule__Load__InstructionsAssignment_4 )* ) ;
    public final void rule__Load__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1089:1: ( ( ( rule__Load__InstructionsAssignment_4 )* ) )
            // InternalMyDsl.g:1090:1: ( ( rule__Load__InstructionsAssignment_4 )* )
            {
            // InternalMyDsl.g:1090:1: ( ( rule__Load__InstructionsAssignment_4 )* )
            // InternalMyDsl.g:1091:2: ( rule__Load__InstructionsAssignment_4 )*
            {
             before(grammarAccess.getLoadAccess().getInstructionsAssignment_4()); 
            // InternalMyDsl.g:1092:2: ( rule__Load__InstructionsAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_STRING||LA12_0==21||(LA12_0>=23 && LA12_0<=29)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1092:3: rule__Load__InstructionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Load__InstructionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getLoadAccess().getInstructionsAssignment_4()); 

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
    // $ANTLR end "rule__Load__Group__4__Impl"


    // $ANTLR start "rule__Load__Group__5"
    // InternalMyDsl.g:1100:1: rule__Load__Group__5 : rule__Load__Group__5__Impl ;
    public final void rule__Load__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1104:1: ( rule__Load__Group__5__Impl )
            // InternalMyDsl.g:1105:2: rule__Load__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Load__Group__5__Impl();

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
    // $ANTLR end "rule__Load__Group__5"


    // $ANTLR start "rule__Load__Group__5__Impl"
    // InternalMyDsl.g:1111:1: rule__Load__Group__5__Impl : ( '}' ) ;
    public final void rule__Load__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1115:1: ( ( '}' ) )
            // InternalMyDsl.g:1116:1: ( '}' )
            {
            // InternalMyDsl.g:1116:1: ( '}' )
            // InternalMyDsl.g:1117:2: '}'
            {
             before(grammarAccess.getLoadAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLoadAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Load__Group__5__Impl"


    // $ANTLR start "rule__Create__Group__0"
    // InternalMyDsl.g:1127:1: rule__Create__Group__0 : rule__Create__Group__0__Impl rule__Create__Group__1 ;
    public final void rule__Create__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1131:1: ( rule__Create__Group__0__Impl rule__Create__Group__1 )
            // InternalMyDsl.g:1132:2: rule__Create__Group__0__Impl rule__Create__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Create__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Create__Group__1();

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
    // $ANTLR end "rule__Create__Group__0"


    // $ANTLR start "rule__Create__Group__0__Impl"
    // InternalMyDsl.g:1139:1: rule__Create__Group__0__Impl : ( 'Create()' ) ;
    public final void rule__Create__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1143:1: ( ( 'Create()' ) )
            // InternalMyDsl.g:1144:1: ( 'Create()' )
            {
            // InternalMyDsl.g:1144:1: ( 'Create()' )
            // InternalMyDsl.g:1145:2: 'Create()'
            {
             before(grammarAccess.getCreateAccess().getCreateKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCreateAccess().getCreateKeyword_0()); 

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
    // $ANTLR end "rule__Create__Group__0__Impl"


    // $ANTLR start "rule__Create__Group__1"
    // InternalMyDsl.g:1154:1: rule__Create__Group__1 : rule__Create__Group__1__Impl rule__Create__Group__2 ;
    public final void rule__Create__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1158:1: ( rule__Create__Group__1__Impl rule__Create__Group__2 )
            // InternalMyDsl.g:1159:2: rule__Create__Group__1__Impl rule__Create__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Create__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Create__Group__2();

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
    // $ANTLR end "rule__Create__Group__1"


    // $ANTLR start "rule__Create__Group__1__Impl"
    // InternalMyDsl.g:1166:1: rule__Create__Group__1__Impl : ( '{' ) ;
    public final void rule__Create__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1170:1: ( ( '{' ) )
            // InternalMyDsl.g:1171:1: ( '{' )
            {
            // InternalMyDsl.g:1171:1: ( '{' )
            // InternalMyDsl.g:1172:2: '{'
            {
             before(grammarAccess.getCreateAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCreateAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Create__Group__1__Impl"


    // $ANTLR start "rule__Create__Group__2"
    // InternalMyDsl.g:1181:1: rule__Create__Group__2 : rule__Create__Group__2__Impl rule__Create__Group__3 ;
    public final void rule__Create__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1185:1: ( rule__Create__Group__2__Impl rule__Create__Group__3 )
            // InternalMyDsl.g:1186:2: rule__Create__Group__2__Impl rule__Create__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Create__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Create__Group__3();

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
    // $ANTLR end "rule__Create__Group__2"


    // $ANTLR start "rule__Create__Group__2__Impl"
    // InternalMyDsl.g:1193:1: rule__Create__Group__2__Impl : ( ( rule__Create__InstructionsAssignment_2 )* ) ;
    public final void rule__Create__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1197:1: ( ( ( rule__Create__InstructionsAssignment_2 )* ) )
            // InternalMyDsl.g:1198:1: ( ( rule__Create__InstructionsAssignment_2 )* )
            {
            // InternalMyDsl.g:1198:1: ( ( rule__Create__InstructionsAssignment_2 )* )
            // InternalMyDsl.g:1199:2: ( rule__Create__InstructionsAssignment_2 )*
            {
             before(grammarAccess.getCreateAccess().getInstructionsAssignment_2()); 
            // InternalMyDsl.g:1200:2: ( rule__Create__InstructionsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STRING||LA13_0==21||(LA13_0>=23 && LA13_0<=29)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1200:3: rule__Create__InstructionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Create__InstructionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getCreateAccess().getInstructionsAssignment_2()); 

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
    // $ANTLR end "rule__Create__Group__2__Impl"


    // $ANTLR start "rule__Create__Group__3"
    // InternalMyDsl.g:1208:1: rule__Create__Group__3 : rule__Create__Group__3__Impl ;
    public final void rule__Create__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1212:1: ( rule__Create__Group__3__Impl )
            // InternalMyDsl.g:1213:2: rule__Create__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Create__Group__3__Impl();

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
    // $ANTLR end "rule__Create__Group__3"


    // $ANTLR start "rule__Create__Group__3__Impl"
    // InternalMyDsl.g:1219:1: rule__Create__Group__3__Impl : ( '}' ) ;
    public final void rule__Create__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1223:1: ( ( '}' ) )
            // InternalMyDsl.g:1224:1: ( '}' )
            {
            // InternalMyDsl.g:1224:1: ( '}' )
            // InternalMyDsl.g:1225:2: '}'
            {
             before(grammarAccess.getCreateAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCreateAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Create__Group__3__Impl"


    // $ANTLR start "rule__Instruction__Group__0"
    // InternalMyDsl.g:1235:1: rule__Instruction__Group__0 : rule__Instruction__Group__0__Impl rule__Instruction__Group__1 ;
    public final void rule__Instruction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1239:1: ( rule__Instruction__Group__0__Impl rule__Instruction__Group__1 )
            // InternalMyDsl.g:1240:2: rule__Instruction__Group__0__Impl rule__Instruction__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Instruction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruction__Group__1();

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
    // $ANTLR end "rule__Instruction__Group__0"


    // $ANTLR start "rule__Instruction__Group__0__Impl"
    // InternalMyDsl.g:1247:1: rule__Instruction__Group__0__Impl : ( ( rule__Instruction__Alternatives_0 ) ) ;
    public final void rule__Instruction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1251:1: ( ( ( rule__Instruction__Alternatives_0 ) ) )
            // InternalMyDsl.g:1252:1: ( ( rule__Instruction__Alternatives_0 ) )
            {
            // InternalMyDsl.g:1252:1: ( ( rule__Instruction__Alternatives_0 ) )
            // InternalMyDsl.g:1253:2: ( rule__Instruction__Alternatives_0 )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives_0()); 
            // InternalMyDsl.g:1254:2: ( rule__Instruction__Alternatives_0 )
            // InternalMyDsl.g:1254:3: rule__Instruction__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getInstructionAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Instruction__Group__0__Impl"


    // $ANTLR start "rule__Instruction__Group__1"
    // InternalMyDsl.g:1262:1: rule__Instruction__Group__1 : rule__Instruction__Group__1__Impl ;
    public final void rule__Instruction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1266:1: ( rule__Instruction__Group__1__Impl )
            // InternalMyDsl.g:1267:2: rule__Instruction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Group__1__Impl();

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
    // $ANTLR end "rule__Instruction__Group__1"


    // $ANTLR start "rule__Instruction__Group__1__Impl"
    // InternalMyDsl.g:1273:1: rule__Instruction__Group__1__Impl : ( ';' ) ;
    public final void rule__Instruction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1277:1: ( ( ';' ) )
            // InternalMyDsl.g:1278:1: ( ';' )
            {
            // InternalMyDsl.g:1278:1: ( ';' )
            // InternalMyDsl.g:1279:2: ';'
            {
             before(grammarAccess.getInstructionAccess().getSemicolonKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getInstructionAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__Instruction__Group__1__Impl"


    // $ANTLR start "rule__InsertCol__Group__0"
    // InternalMyDsl.g:1289:1: rule__InsertCol__Group__0 : rule__InsertCol__Group__0__Impl rule__InsertCol__Group__1 ;
    public final void rule__InsertCol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1293:1: ( rule__InsertCol__Group__0__Impl rule__InsertCol__Group__1 )
            // InternalMyDsl.g:1294:2: rule__InsertCol__Group__0__Impl rule__InsertCol__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__InsertCol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertCol__Group__1();

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
    // $ANTLR end "rule__InsertCol__Group__0"


    // $ANTLR start "rule__InsertCol__Group__0__Impl"
    // InternalMyDsl.g:1301:1: rule__InsertCol__Group__0__Impl : ( 'InsertCol(' ) ;
    public final void rule__InsertCol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1305:1: ( ( 'InsertCol(' ) )
            // InternalMyDsl.g:1306:1: ( 'InsertCol(' )
            {
            // InternalMyDsl.g:1306:1: ( 'InsertCol(' )
            // InternalMyDsl.g:1307:2: 'InsertCol('
            {
             before(grammarAccess.getInsertColAccess().getInsertColKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getInsertColAccess().getInsertColKeyword_0()); 

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
    // $ANTLR end "rule__InsertCol__Group__0__Impl"


    // $ANTLR start "rule__InsertCol__Group__1"
    // InternalMyDsl.g:1316:1: rule__InsertCol__Group__1 : rule__InsertCol__Group__1__Impl rule__InsertCol__Group__2 ;
    public final void rule__InsertCol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1320:1: ( rule__InsertCol__Group__1__Impl rule__InsertCol__Group__2 )
            // InternalMyDsl.g:1321:2: rule__InsertCol__Group__1__Impl rule__InsertCol__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__InsertCol__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertCol__Group__2();

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
    // $ANTLR end "rule__InsertCol__Group__1"


    // $ANTLR start "rule__InsertCol__Group__1__Impl"
    // InternalMyDsl.g:1328:1: rule__InsertCol__Group__1__Impl : ( ( rule__InsertCol__ColIndexAssignment_1 ) ) ;
    public final void rule__InsertCol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1332:1: ( ( ( rule__InsertCol__ColIndexAssignment_1 ) ) )
            // InternalMyDsl.g:1333:1: ( ( rule__InsertCol__ColIndexAssignment_1 ) )
            {
            // InternalMyDsl.g:1333:1: ( ( rule__InsertCol__ColIndexAssignment_1 ) )
            // InternalMyDsl.g:1334:2: ( rule__InsertCol__ColIndexAssignment_1 )
            {
             before(grammarAccess.getInsertColAccess().getColIndexAssignment_1()); 
            // InternalMyDsl.g:1335:2: ( rule__InsertCol__ColIndexAssignment_1 )
            // InternalMyDsl.g:1335:3: rule__InsertCol__ColIndexAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InsertCol__ColIndexAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInsertColAccess().getColIndexAssignment_1()); 

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
    // $ANTLR end "rule__InsertCol__Group__1__Impl"


    // $ANTLR start "rule__InsertCol__Group__2"
    // InternalMyDsl.g:1343:1: rule__InsertCol__Group__2 : rule__InsertCol__Group__2__Impl rule__InsertCol__Group__3 ;
    public final void rule__InsertCol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1347:1: ( rule__InsertCol__Group__2__Impl rule__InsertCol__Group__3 )
            // InternalMyDsl.g:1348:2: rule__InsertCol__Group__2__Impl rule__InsertCol__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__InsertCol__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertCol__Group__3();

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
    // $ANTLR end "rule__InsertCol__Group__2"


    // $ANTLR start "rule__InsertCol__Group__2__Impl"
    // InternalMyDsl.g:1355:1: rule__InsertCol__Group__2__Impl : ( ',' ) ;
    public final void rule__InsertCol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1359:1: ( ( ',' ) )
            // InternalMyDsl.g:1360:1: ( ',' )
            {
            // InternalMyDsl.g:1360:1: ( ',' )
            // InternalMyDsl.g:1361:2: ','
            {
             before(grammarAccess.getInsertColAccess().getCommaKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInsertColAccess().getCommaKeyword_2()); 

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
    // $ANTLR end "rule__InsertCol__Group__2__Impl"


    // $ANTLR start "rule__InsertCol__Group__3"
    // InternalMyDsl.g:1370:1: rule__InsertCol__Group__3 : rule__InsertCol__Group__3__Impl rule__InsertCol__Group__4 ;
    public final void rule__InsertCol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1374:1: ( rule__InsertCol__Group__3__Impl rule__InsertCol__Group__4 )
            // InternalMyDsl.g:1375:2: rule__InsertCol__Group__3__Impl rule__InsertCol__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__InsertCol__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertCol__Group__4();

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
    // $ANTLR end "rule__InsertCol__Group__3"


    // $ANTLR start "rule__InsertCol__Group__3__Impl"
    // InternalMyDsl.g:1382:1: rule__InsertCol__Group__3__Impl : ( ( rule__InsertCol__ColNameAssignment_3 ) ) ;
    public final void rule__InsertCol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1386:1: ( ( ( rule__InsertCol__ColNameAssignment_3 ) ) )
            // InternalMyDsl.g:1387:1: ( ( rule__InsertCol__ColNameAssignment_3 ) )
            {
            // InternalMyDsl.g:1387:1: ( ( rule__InsertCol__ColNameAssignment_3 ) )
            // InternalMyDsl.g:1388:2: ( rule__InsertCol__ColNameAssignment_3 )
            {
             before(grammarAccess.getInsertColAccess().getColNameAssignment_3()); 
            // InternalMyDsl.g:1389:2: ( rule__InsertCol__ColNameAssignment_3 )
            // InternalMyDsl.g:1389:3: rule__InsertCol__ColNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InsertCol__ColNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInsertColAccess().getColNameAssignment_3()); 

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
    // $ANTLR end "rule__InsertCol__Group__3__Impl"


    // $ANTLR start "rule__InsertCol__Group__4"
    // InternalMyDsl.g:1397:1: rule__InsertCol__Group__4 : rule__InsertCol__Group__4__Impl rule__InsertCol__Group__5 ;
    public final void rule__InsertCol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1401:1: ( rule__InsertCol__Group__4__Impl rule__InsertCol__Group__5 )
            // InternalMyDsl.g:1402:2: rule__InsertCol__Group__4__Impl rule__InsertCol__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__InsertCol__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertCol__Group__5();

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
    // $ANTLR end "rule__InsertCol__Group__4"


    // $ANTLR start "rule__InsertCol__Group__4__Impl"
    // InternalMyDsl.g:1409:1: rule__InsertCol__Group__4__Impl : ( ( rule__InsertCol__Group_4__0 )? ) ;
    public final void rule__InsertCol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1413:1: ( ( ( rule__InsertCol__Group_4__0 )? ) )
            // InternalMyDsl.g:1414:1: ( ( rule__InsertCol__Group_4__0 )? )
            {
            // InternalMyDsl.g:1414:1: ( ( rule__InsertCol__Group_4__0 )? )
            // InternalMyDsl.g:1415:2: ( rule__InsertCol__Group_4__0 )?
            {
             before(grammarAccess.getInsertColAccess().getGroup_4()); 
            // InternalMyDsl.g:1416:2: ( rule__InsertCol__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1416:3: rule__InsertCol__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InsertCol__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInsertColAccess().getGroup_4()); 

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
    // $ANTLR end "rule__InsertCol__Group__4__Impl"


    // $ANTLR start "rule__InsertCol__Group__5"
    // InternalMyDsl.g:1424:1: rule__InsertCol__Group__5 : rule__InsertCol__Group__5__Impl ;
    public final void rule__InsertCol__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1428:1: ( rule__InsertCol__Group__5__Impl )
            // InternalMyDsl.g:1429:2: rule__InsertCol__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InsertCol__Group__5__Impl();

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
    // $ANTLR end "rule__InsertCol__Group__5"


    // $ANTLR start "rule__InsertCol__Group__5__Impl"
    // InternalMyDsl.g:1435:1: rule__InsertCol__Group__5__Impl : ( ')' ) ;
    public final void rule__InsertCol__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1439:1: ( ( ')' ) )
            // InternalMyDsl.g:1440:1: ( ')' )
            {
            // InternalMyDsl.g:1440:1: ( ')' )
            // InternalMyDsl.g:1441:2: ')'
            {
             before(grammarAccess.getInsertColAccess().getRightParenthesisKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getInsertColAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__InsertCol__Group__5__Impl"


    // $ANTLR start "rule__InsertCol__Group_4__0"
    // InternalMyDsl.g:1451:1: rule__InsertCol__Group_4__0 : rule__InsertCol__Group_4__0__Impl rule__InsertCol__Group_4__1 ;
    public final void rule__InsertCol__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1455:1: ( rule__InsertCol__Group_4__0__Impl rule__InsertCol__Group_4__1 )
            // InternalMyDsl.g:1456:2: rule__InsertCol__Group_4__0__Impl rule__InsertCol__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__InsertCol__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertCol__Group_4__1();

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
    // $ANTLR end "rule__InsertCol__Group_4__0"


    // $ANTLR start "rule__InsertCol__Group_4__0__Impl"
    // InternalMyDsl.g:1463:1: rule__InsertCol__Group_4__0__Impl : ( ',' ) ;
    public final void rule__InsertCol__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1467:1: ( ( ',' ) )
            // InternalMyDsl.g:1468:1: ( ',' )
            {
            // InternalMyDsl.g:1468:1: ( ',' )
            // InternalMyDsl.g:1469:2: ','
            {
             before(grammarAccess.getInsertColAccess().getCommaKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInsertColAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__InsertCol__Group_4__0__Impl"


    // $ANTLR start "rule__InsertCol__Group_4__1"
    // InternalMyDsl.g:1478:1: rule__InsertCol__Group_4__1 : rule__InsertCol__Group_4__1__Impl ;
    public final void rule__InsertCol__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1482:1: ( rule__InsertCol__Group_4__1__Impl )
            // InternalMyDsl.g:1483:2: rule__InsertCol__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InsertCol__Group_4__1__Impl();

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
    // $ANTLR end "rule__InsertCol__Group_4__1"


    // $ANTLR start "rule__InsertCol__Group_4__1__Impl"
    // InternalMyDsl.g:1489:1: rule__InsertCol__Group_4__1__Impl : ( ( rule__InsertCol__ExpAssignment_4_1 ) ) ;
    public final void rule__InsertCol__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1493:1: ( ( ( rule__InsertCol__ExpAssignment_4_1 ) ) )
            // InternalMyDsl.g:1494:1: ( ( rule__InsertCol__ExpAssignment_4_1 ) )
            {
            // InternalMyDsl.g:1494:1: ( ( rule__InsertCol__ExpAssignment_4_1 ) )
            // InternalMyDsl.g:1495:2: ( rule__InsertCol__ExpAssignment_4_1 )
            {
             before(grammarAccess.getInsertColAccess().getExpAssignment_4_1()); 
            // InternalMyDsl.g:1496:2: ( rule__InsertCol__ExpAssignment_4_1 )
            // InternalMyDsl.g:1496:3: rule__InsertCol__ExpAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__InsertCol__ExpAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInsertColAccess().getExpAssignment_4_1()); 

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
    // $ANTLR end "rule__InsertCol__Group_4__1__Impl"


    // $ANTLR start "rule__RemoveCol__Group_0__0"
    // InternalMyDsl.g:1505:1: rule__RemoveCol__Group_0__0 : rule__RemoveCol__Group_0__0__Impl rule__RemoveCol__Group_0__1 ;
    public final void rule__RemoveCol__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1509:1: ( rule__RemoveCol__Group_0__0__Impl rule__RemoveCol__Group_0__1 )
            // InternalMyDsl.g:1510:2: rule__RemoveCol__Group_0__0__Impl rule__RemoveCol__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__RemoveCol__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RemoveCol__Group_0__1();

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
    // $ANTLR end "rule__RemoveCol__Group_0__0"


    // $ANTLR start "rule__RemoveCol__Group_0__0__Impl"
    // InternalMyDsl.g:1517:1: rule__RemoveCol__Group_0__0__Impl : ( 'RemoveCol(' ) ;
    public final void rule__RemoveCol__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1521:1: ( ( 'RemoveCol(' ) )
            // InternalMyDsl.g:1522:1: ( 'RemoveCol(' )
            {
            // InternalMyDsl.g:1522:1: ( 'RemoveCol(' )
            // InternalMyDsl.g:1523:2: 'RemoveCol('
            {
             before(grammarAccess.getRemoveColAccess().getRemoveColKeyword_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRemoveColAccess().getRemoveColKeyword_0_0()); 

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
    // $ANTLR end "rule__RemoveCol__Group_0__0__Impl"


    // $ANTLR start "rule__RemoveCol__Group_0__1"
    // InternalMyDsl.g:1532:1: rule__RemoveCol__Group_0__1 : rule__RemoveCol__Group_0__1__Impl ;
    public final void rule__RemoveCol__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1536:1: ( rule__RemoveCol__Group_0__1__Impl )
            // InternalMyDsl.g:1537:2: rule__RemoveCol__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RemoveCol__Group_0__1__Impl();

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
    // $ANTLR end "rule__RemoveCol__Group_0__1"


    // $ANTLR start "rule__RemoveCol__Group_0__1__Impl"
    // InternalMyDsl.g:1543:1: rule__RemoveCol__Group_0__1__Impl : ( ( rule__RemoveCol__ColIndexAssignment_0_1 ) ) ;
    public final void rule__RemoveCol__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1547:1: ( ( ( rule__RemoveCol__ColIndexAssignment_0_1 ) ) )
            // InternalMyDsl.g:1548:1: ( ( rule__RemoveCol__ColIndexAssignment_0_1 ) )
            {
            // InternalMyDsl.g:1548:1: ( ( rule__RemoveCol__ColIndexAssignment_0_1 ) )
            // InternalMyDsl.g:1549:2: ( rule__RemoveCol__ColIndexAssignment_0_1 )
            {
             before(grammarAccess.getRemoveColAccess().getColIndexAssignment_0_1()); 
            // InternalMyDsl.g:1550:2: ( rule__RemoveCol__ColIndexAssignment_0_1 )
            // InternalMyDsl.g:1550:3: rule__RemoveCol__ColIndexAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__RemoveCol__ColIndexAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getRemoveColAccess().getColIndexAssignment_0_1()); 

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
    // $ANTLR end "rule__RemoveCol__Group_0__1__Impl"


    // $ANTLR start "rule__RemoveCol__Group_1__0"
    // InternalMyDsl.g:1559:1: rule__RemoveCol__Group_1__0 : rule__RemoveCol__Group_1__0__Impl rule__RemoveCol__Group_1__1 ;
    public final void rule__RemoveCol__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1563:1: ( rule__RemoveCol__Group_1__0__Impl rule__RemoveCol__Group_1__1 )
            // InternalMyDsl.g:1564:2: rule__RemoveCol__Group_1__0__Impl rule__RemoveCol__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__RemoveCol__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RemoveCol__Group_1__1();

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
    // $ANTLR end "rule__RemoveCol__Group_1__0"


    // $ANTLR start "rule__RemoveCol__Group_1__0__Impl"
    // InternalMyDsl.g:1571:1: rule__RemoveCol__Group_1__0__Impl : ( ( rule__RemoveCol__NameAssignment_1_0 ) ) ;
    public final void rule__RemoveCol__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1575:1: ( ( ( rule__RemoveCol__NameAssignment_1_0 ) ) )
            // InternalMyDsl.g:1576:1: ( ( rule__RemoveCol__NameAssignment_1_0 ) )
            {
            // InternalMyDsl.g:1576:1: ( ( rule__RemoveCol__NameAssignment_1_0 ) )
            // InternalMyDsl.g:1577:2: ( rule__RemoveCol__NameAssignment_1_0 )
            {
             before(grammarAccess.getRemoveColAccess().getNameAssignment_1_0()); 
            // InternalMyDsl.g:1578:2: ( rule__RemoveCol__NameAssignment_1_0 )
            // InternalMyDsl.g:1578:3: rule__RemoveCol__NameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__RemoveCol__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRemoveColAccess().getNameAssignment_1_0()); 

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
    // $ANTLR end "rule__RemoveCol__Group_1__0__Impl"


    // $ANTLR start "rule__RemoveCol__Group_1__1"
    // InternalMyDsl.g:1586:1: rule__RemoveCol__Group_1__1 : rule__RemoveCol__Group_1__1__Impl ;
    public final void rule__RemoveCol__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1590:1: ( rule__RemoveCol__Group_1__1__Impl )
            // InternalMyDsl.g:1591:2: rule__RemoveCol__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RemoveCol__Group_1__1__Impl();

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
    // $ANTLR end "rule__RemoveCol__Group_1__1"


    // $ANTLR start "rule__RemoveCol__Group_1__1__Impl"
    // InternalMyDsl.g:1597:1: rule__RemoveCol__Group_1__1__Impl : ( ')' ) ;
    public final void rule__RemoveCol__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1601:1: ( ( ')' ) )
            // InternalMyDsl.g:1602:1: ( ')' )
            {
            // InternalMyDsl.g:1602:1: ( ')' )
            // InternalMyDsl.g:1603:2: ')'
            {
             before(grammarAccess.getRemoveColAccess().getRightParenthesisKeyword_1_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRemoveColAccess().getRightParenthesisKeyword_1_1()); 

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
    // $ANTLR end "rule__RemoveCol__Group_1__1__Impl"


    // $ANTLR start "rule__InsertLine__Group__0"
    // InternalMyDsl.g:1613:1: rule__InsertLine__Group__0 : rule__InsertLine__Group__0__Impl rule__InsertLine__Group__1 ;
    public final void rule__InsertLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1617:1: ( rule__InsertLine__Group__0__Impl rule__InsertLine__Group__1 )
            // InternalMyDsl.g:1618:2: rule__InsertLine__Group__0__Impl rule__InsertLine__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__InsertLine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertLine__Group__1();

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
    // $ANTLR end "rule__InsertLine__Group__0"


    // $ANTLR start "rule__InsertLine__Group__0__Impl"
    // InternalMyDsl.g:1625:1: rule__InsertLine__Group__0__Impl : ( 'InsertLine(' ) ;
    public final void rule__InsertLine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1629:1: ( ( 'InsertLine(' ) )
            // InternalMyDsl.g:1630:1: ( 'InsertLine(' )
            {
            // InternalMyDsl.g:1630:1: ( 'InsertLine(' )
            // InternalMyDsl.g:1631:2: 'InsertLine('
            {
             before(grammarAccess.getInsertLineAccess().getInsertLineKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInsertLineAccess().getInsertLineKeyword_0()); 

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
    // $ANTLR end "rule__InsertLine__Group__0__Impl"


    // $ANTLR start "rule__InsertLine__Group__1"
    // InternalMyDsl.g:1640:1: rule__InsertLine__Group__1 : rule__InsertLine__Group__1__Impl rule__InsertLine__Group__2 ;
    public final void rule__InsertLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1644:1: ( rule__InsertLine__Group__1__Impl rule__InsertLine__Group__2 )
            // InternalMyDsl.g:1645:2: rule__InsertLine__Group__1__Impl rule__InsertLine__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__InsertLine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertLine__Group__2();

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
    // $ANTLR end "rule__InsertLine__Group__1"


    // $ANTLR start "rule__InsertLine__Group__1__Impl"
    // InternalMyDsl.g:1652:1: rule__InsertLine__Group__1__Impl : ( ( rule__InsertLine__LineIndexAssignment_1 ) ) ;
    public final void rule__InsertLine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1656:1: ( ( ( rule__InsertLine__LineIndexAssignment_1 ) ) )
            // InternalMyDsl.g:1657:1: ( ( rule__InsertLine__LineIndexAssignment_1 ) )
            {
            // InternalMyDsl.g:1657:1: ( ( rule__InsertLine__LineIndexAssignment_1 ) )
            // InternalMyDsl.g:1658:2: ( rule__InsertLine__LineIndexAssignment_1 )
            {
             before(grammarAccess.getInsertLineAccess().getLineIndexAssignment_1()); 
            // InternalMyDsl.g:1659:2: ( rule__InsertLine__LineIndexAssignment_1 )
            // InternalMyDsl.g:1659:3: rule__InsertLine__LineIndexAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InsertLine__LineIndexAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInsertLineAccess().getLineIndexAssignment_1()); 

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
    // $ANTLR end "rule__InsertLine__Group__1__Impl"


    // $ANTLR start "rule__InsertLine__Group__2"
    // InternalMyDsl.g:1667:1: rule__InsertLine__Group__2 : rule__InsertLine__Group__2__Impl rule__InsertLine__Group__3 ;
    public final void rule__InsertLine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1671:1: ( rule__InsertLine__Group__2__Impl rule__InsertLine__Group__3 )
            // InternalMyDsl.g:1672:2: rule__InsertLine__Group__2__Impl rule__InsertLine__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__InsertLine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertLine__Group__3();

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
    // $ANTLR end "rule__InsertLine__Group__2"


    // $ANTLR start "rule__InsertLine__Group__2__Impl"
    // InternalMyDsl.g:1679:1: rule__InsertLine__Group__2__Impl : ( ( ( rule__InsertLine__Group_2__0 ) ) ( ( rule__InsertLine__Group_2__0 )* ) ) ;
    public final void rule__InsertLine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1683:1: ( ( ( ( rule__InsertLine__Group_2__0 ) ) ( ( rule__InsertLine__Group_2__0 )* ) ) )
            // InternalMyDsl.g:1684:1: ( ( ( rule__InsertLine__Group_2__0 ) ) ( ( rule__InsertLine__Group_2__0 )* ) )
            {
            // InternalMyDsl.g:1684:1: ( ( ( rule__InsertLine__Group_2__0 ) ) ( ( rule__InsertLine__Group_2__0 )* ) )
            // InternalMyDsl.g:1685:2: ( ( rule__InsertLine__Group_2__0 ) ) ( ( rule__InsertLine__Group_2__0 )* )
            {
            // InternalMyDsl.g:1685:2: ( ( rule__InsertLine__Group_2__0 ) )
            // InternalMyDsl.g:1686:3: ( rule__InsertLine__Group_2__0 )
            {
             before(grammarAccess.getInsertLineAccess().getGroup_2()); 
            // InternalMyDsl.g:1687:3: ( rule__InsertLine__Group_2__0 )
            // InternalMyDsl.g:1687:4: rule__InsertLine__Group_2__0
            {
            pushFollow(FOLLOW_13);
            rule__InsertLine__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getInsertLineAccess().getGroup_2()); 

            }

            // InternalMyDsl.g:1690:2: ( ( rule__InsertLine__Group_2__0 )* )
            // InternalMyDsl.g:1691:3: ( rule__InsertLine__Group_2__0 )*
            {
             before(grammarAccess.getInsertLineAccess().getGroup_2()); 
            // InternalMyDsl.g:1692:3: ( rule__InsertLine__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==22) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1692:4: rule__InsertLine__Group_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__InsertLine__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getInsertLineAccess().getGroup_2()); 

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
    // $ANTLR end "rule__InsertLine__Group__2__Impl"


    // $ANTLR start "rule__InsertLine__Group__3"
    // InternalMyDsl.g:1701:1: rule__InsertLine__Group__3 : rule__InsertLine__Group__3__Impl ;
    public final void rule__InsertLine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1705:1: ( rule__InsertLine__Group__3__Impl )
            // InternalMyDsl.g:1706:2: rule__InsertLine__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InsertLine__Group__3__Impl();

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
    // $ANTLR end "rule__InsertLine__Group__3"


    // $ANTLR start "rule__InsertLine__Group__3__Impl"
    // InternalMyDsl.g:1712:1: rule__InsertLine__Group__3__Impl : ( ')' ) ;
    public final void rule__InsertLine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1716:1: ( ( ')' ) )
            // InternalMyDsl.g:1717:1: ( ')' )
            {
            // InternalMyDsl.g:1717:1: ( ')' )
            // InternalMyDsl.g:1718:2: ')'
            {
             before(grammarAccess.getInsertLineAccess().getRightParenthesisKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getInsertLineAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__InsertLine__Group__3__Impl"


    // $ANTLR start "rule__InsertLine__Group_2__0"
    // InternalMyDsl.g:1728:1: rule__InsertLine__Group_2__0 : rule__InsertLine__Group_2__0__Impl rule__InsertLine__Group_2__1 ;
    public final void rule__InsertLine__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1732:1: ( rule__InsertLine__Group_2__0__Impl rule__InsertLine__Group_2__1 )
            // InternalMyDsl.g:1733:2: rule__InsertLine__Group_2__0__Impl rule__InsertLine__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__InsertLine__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertLine__Group_2__1();

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
    // $ANTLR end "rule__InsertLine__Group_2__0"


    // $ANTLR start "rule__InsertLine__Group_2__0__Impl"
    // InternalMyDsl.g:1740:1: rule__InsertLine__Group_2__0__Impl : ( ',' ) ;
    public final void rule__InsertLine__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1744:1: ( ( ',' ) )
            // InternalMyDsl.g:1745:1: ( ',' )
            {
            // InternalMyDsl.g:1745:1: ( ',' )
            // InternalMyDsl.g:1746:2: ','
            {
             before(grammarAccess.getInsertLineAccess().getCommaKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInsertLineAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__InsertLine__Group_2__0__Impl"


    // $ANTLR start "rule__InsertLine__Group_2__1"
    // InternalMyDsl.g:1755:1: rule__InsertLine__Group_2__1 : rule__InsertLine__Group_2__1__Impl ;
    public final void rule__InsertLine__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1759:1: ( rule__InsertLine__Group_2__1__Impl )
            // InternalMyDsl.g:1760:2: rule__InsertLine__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InsertLine__Group_2__1__Impl();

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
    // $ANTLR end "rule__InsertLine__Group_2__1"


    // $ANTLR start "rule__InsertLine__Group_2__1__Impl"
    // InternalMyDsl.g:1766:1: rule__InsertLine__Group_2__1__Impl : ( ( rule__InsertLine__ExpsAssignment_2_1 ) ) ;
    public final void rule__InsertLine__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1770:1: ( ( ( rule__InsertLine__ExpsAssignment_2_1 ) ) )
            // InternalMyDsl.g:1771:1: ( ( rule__InsertLine__ExpsAssignment_2_1 ) )
            {
            // InternalMyDsl.g:1771:1: ( ( rule__InsertLine__ExpsAssignment_2_1 ) )
            // InternalMyDsl.g:1772:2: ( rule__InsertLine__ExpsAssignment_2_1 )
            {
             before(grammarAccess.getInsertLineAccess().getExpsAssignment_2_1()); 
            // InternalMyDsl.g:1773:2: ( rule__InsertLine__ExpsAssignment_2_1 )
            // InternalMyDsl.g:1773:3: rule__InsertLine__ExpsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__InsertLine__ExpsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInsertLineAccess().getExpsAssignment_2_1()); 

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
    // $ANTLR end "rule__InsertLine__Group_2__1__Impl"


    // $ANTLR start "rule__RemoveLine__Group__0"
    // InternalMyDsl.g:1782:1: rule__RemoveLine__Group__0 : rule__RemoveLine__Group__0__Impl rule__RemoveLine__Group__1 ;
    public final void rule__RemoveLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1786:1: ( rule__RemoveLine__Group__0__Impl rule__RemoveLine__Group__1 )
            // InternalMyDsl.g:1787:2: rule__RemoveLine__Group__0__Impl rule__RemoveLine__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__RemoveLine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RemoveLine__Group__1();

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
    // $ANTLR end "rule__RemoveLine__Group__0"


    // $ANTLR start "rule__RemoveLine__Group__0__Impl"
    // InternalMyDsl.g:1794:1: rule__RemoveLine__Group__0__Impl : ( 'RemoveLine(' ) ;
    public final void rule__RemoveLine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1798:1: ( ( 'RemoveLine(' ) )
            // InternalMyDsl.g:1799:1: ( 'RemoveLine(' )
            {
            // InternalMyDsl.g:1799:1: ( 'RemoveLine(' )
            // InternalMyDsl.g:1800:2: 'RemoveLine('
            {
             before(grammarAccess.getRemoveLineAccess().getRemoveLineKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRemoveLineAccess().getRemoveLineKeyword_0()); 

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
    // $ANTLR end "rule__RemoveLine__Group__0__Impl"


    // $ANTLR start "rule__RemoveLine__Group__1"
    // InternalMyDsl.g:1809:1: rule__RemoveLine__Group__1 : rule__RemoveLine__Group__1__Impl rule__RemoveLine__Group__2 ;
    public final void rule__RemoveLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1813:1: ( rule__RemoveLine__Group__1__Impl rule__RemoveLine__Group__2 )
            // InternalMyDsl.g:1814:2: rule__RemoveLine__Group__1__Impl rule__RemoveLine__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__RemoveLine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RemoveLine__Group__2();

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
    // $ANTLR end "rule__RemoveLine__Group__1"


    // $ANTLR start "rule__RemoveLine__Group__1__Impl"
    // InternalMyDsl.g:1821:1: rule__RemoveLine__Group__1__Impl : ( ( rule__RemoveLine__LineIndexAssignment_1 ) ) ;
    public final void rule__RemoveLine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1825:1: ( ( ( rule__RemoveLine__LineIndexAssignment_1 ) ) )
            // InternalMyDsl.g:1826:1: ( ( rule__RemoveLine__LineIndexAssignment_1 ) )
            {
            // InternalMyDsl.g:1826:1: ( ( rule__RemoveLine__LineIndexAssignment_1 ) )
            // InternalMyDsl.g:1827:2: ( rule__RemoveLine__LineIndexAssignment_1 )
            {
             before(grammarAccess.getRemoveLineAccess().getLineIndexAssignment_1()); 
            // InternalMyDsl.g:1828:2: ( rule__RemoveLine__LineIndexAssignment_1 )
            // InternalMyDsl.g:1828:3: rule__RemoveLine__LineIndexAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RemoveLine__LineIndexAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRemoveLineAccess().getLineIndexAssignment_1()); 

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
    // $ANTLR end "rule__RemoveLine__Group__1__Impl"


    // $ANTLR start "rule__RemoveLine__Group__2"
    // InternalMyDsl.g:1836:1: rule__RemoveLine__Group__2 : rule__RemoveLine__Group__2__Impl ;
    public final void rule__RemoveLine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1840:1: ( rule__RemoveLine__Group__2__Impl )
            // InternalMyDsl.g:1841:2: rule__RemoveLine__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RemoveLine__Group__2__Impl();

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
    // $ANTLR end "rule__RemoveLine__Group__2"


    // $ANTLR start "rule__RemoveLine__Group__2__Impl"
    // InternalMyDsl.g:1847:1: rule__RemoveLine__Group__2__Impl : ( ')' ) ;
    public final void rule__RemoveLine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1851:1: ( ( ')' ) )
            // InternalMyDsl.g:1852:1: ( ')' )
            {
            // InternalMyDsl.g:1852:1: ( ')' )
            // InternalMyDsl.g:1853:2: ')'
            {
             before(grammarAccess.getRemoveLineAccess().getRightParenthesisKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRemoveLineAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__RemoveLine__Group__2__Impl"


    // $ANTLR start "rule__Insert__Group__0"
    // InternalMyDsl.g:1863:1: rule__Insert__Group__0 : rule__Insert__Group__0__Impl rule__Insert__Group__1 ;
    public final void rule__Insert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1867:1: ( rule__Insert__Group__0__Impl rule__Insert__Group__1 )
            // InternalMyDsl.g:1868:2: rule__Insert__Group__0__Impl rule__Insert__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Insert__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group__1();

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
    // $ANTLR end "rule__Insert__Group__0"


    // $ANTLR start "rule__Insert__Group__0__Impl"
    // InternalMyDsl.g:1875:1: rule__Insert__Group__0__Impl : ( 'Insert(' ) ;
    public final void rule__Insert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1879:1: ( ( 'Insert(' ) )
            // InternalMyDsl.g:1880:1: ( 'Insert(' )
            {
            // InternalMyDsl.g:1880:1: ( 'Insert(' )
            // InternalMyDsl.g:1881:2: 'Insert('
            {
             before(grammarAccess.getInsertAccess().getInsertKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getInsertKeyword_0()); 

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
    // $ANTLR end "rule__Insert__Group__0__Impl"


    // $ANTLR start "rule__Insert__Group__1"
    // InternalMyDsl.g:1890:1: rule__Insert__Group__1 : rule__Insert__Group__1__Impl rule__Insert__Group__2 ;
    public final void rule__Insert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1894:1: ( rule__Insert__Group__1__Impl rule__Insert__Group__2 )
            // InternalMyDsl.g:1895:2: rule__Insert__Group__1__Impl rule__Insert__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Insert__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group__2();

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
    // $ANTLR end "rule__Insert__Group__1"


    // $ANTLR start "rule__Insert__Group__1__Impl"
    // InternalMyDsl.g:1902:1: rule__Insert__Group__1__Impl : ( ( rule__Insert__LineIndexAssignment_1 ) ) ;
    public final void rule__Insert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1906:1: ( ( ( rule__Insert__LineIndexAssignment_1 ) ) )
            // InternalMyDsl.g:1907:1: ( ( rule__Insert__LineIndexAssignment_1 ) )
            {
            // InternalMyDsl.g:1907:1: ( ( rule__Insert__LineIndexAssignment_1 ) )
            // InternalMyDsl.g:1908:2: ( rule__Insert__LineIndexAssignment_1 )
            {
             before(grammarAccess.getInsertAccess().getLineIndexAssignment_1()); 
            // InternalMyDsl.g:1909:2: ( rule__Insert__LineIndexAssignment_1 )
            // InternalMyDsl.g:1909:3: rule__Insert__LineIndexAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Insert__LineIndexAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getLineIndexAssignment_1()); 

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
    // $ANTLR end "rule__Insert__Group__1__Impl"


    // $ANTLR start "rule__Insert__Group__2"
    // InternalMyDsl.g:1917:1: rule__Insert__Group__2 : rule__Insert__Group__2__Impl rule__Insert__Group__3 ;
    public final void rule__Insert__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1921:1: ( rule__Insert__Group__2__Impl rule__Insert__Group__3 )
            // InternalMyDsl.g:1922:2: rule__Insert__Group__2__Impl rule__Insert__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Insert__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group__3();

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
    // $ANTLR end "rule__Insert__Group__2"


    // $ANTLR start "rule__Insert__Group__2__Impl"
    // InternalMyDsl.g:1929:1: rule__Insert__Group__2__Impl : ( ',' ) ;
    public final void rule__Insert__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1933:1: ( ( ',' ) )
            // InternalMyDsl.g:1934:1: ( ',' )
            {
            // InternalMyDsl.g:1934:1: ( ',' )
            // InternalMyDsl.g:1935:2: ','
            {
             before(grammarAccess.getInsertAccess().getCommaKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getCommaKeyword_2()); 

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
    // $ANTLR end "rule__Insert__Group__2__Impl"


    // $ANTLR start "rule__Insert__Group__3"
    // InternalMyDsl.g:1944:1: rule__Insert__Group__3 : rule__Insert__Group__3__Impl rule__Insert__Group__4 ;
    public final void rule__Insert__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1948:1: ( rule__Insert__Group__3__Impl rule__Insert__Group__4 )
            // InternalMyDsl.g:1949:2: rule__Insert__Group__3__Impl rule__Insert__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Insert__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group__4();

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
    // $ANTLR end "rule__Insert__Group__3"


    // $ANTLR start "rule__Insert__Group__3__Impl"
    // InternalMyDsl.g:1956:1: rule__Insert__Group__3__Impl : ( ( rule__Insert__ColNameOrIndexAssignment_3 ) ) ;
    public final void rule__Insert__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1960:1: ( ( ( rule__Insert__ColNameOrIndexAssignment_3 ) ) )
            // InternalMyDsl.g:1961:1: ( ( rule__Insert__ColNameOrIndexAssignment_3 ) )
            {
            // InternalMyDsl.g:1961:1: ( ( rule__Insert__ColNameOrIndexAssignment_3 ) )
            // InternalMyDsl.g:1962:2: ( rule__Insert__ColNameOrIndexAssignment_3 )
            {
             before(grammarAccess.getInsertAccess().getColNameOrIndexAssignment_3()); 
            // InternalMyDsl.g:1963:2: ( rule__Insert__ColNameOrIndexAssignment_3 )
            // InternalMyDsl.g:1963:3: rule__Insert__ColNameOrIndexAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Insert__ColNameOrIndexAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getColNameOrIndexAssignment_3()); 

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
    // $ANTLR end "rule__Insert__Group__3__Impl"


    // $ANTLR start "rule__Insert__Group__4"
    // InternalMyDsl.g:1971:1: rule__Insert__Group__4 : rule__Insert__Group__4__Impl rule__Insert__Group__5 ;
    public final void rule__Insert__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1975:1: ( rule__Insert__Group__4__Impl rule__Insert__Group__5 )
            // InternalMyDsl.g:1976:2: rule__Insert__Group__4__Impl rule__Insert__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Insert__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group__5();

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
    // $ANTLR end "rule__Insert__Group__4"


    // $ANTLR start "rule__Insert__Group__4__Impl"
    // InternalMyDsl.g:1983:1: rule__Insert__Group__4__Impl : ( ',' ) ;
    public final void rule__Insert__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1987:1: ( ( ',' ) )
            // InternalMyDsl.g:1988:1: ( ',' )
            {
            // InternalMyDsl.g:1988:1: ( ',' )
            // InternalMyDsl.g:1989:2: ','
            {
             before(grammarAccess.getInsertAccess().getCommaKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getCommaKeyword_4()); 

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
    // $ANTLR end "rule__Insert__Group__4__Impl"


    // $ANTLR start "rule__Insert__Group__5"
    // InternalMyDsl.g:1998:1: rule__Insert__Group__5 : rule__Insert__Group__5__Impl rule__Insert__Group__6 ;
    public final void rule__Insert__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2002:1: ( rule__Insert__Group__5__Impl rule__Insert__Group__6 )
            // InternalMyDsl.g:2003:2: rule__Insert__Group__5__Impl rule__Insert__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Insert__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group__6();

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
    // $ANTLR end "rule__Insert__Group__5"


    // $ANTLR start "rule__Insert__Group__5__Impl"
    // InternalMyDsl.g:2010:1: rule__Insert__Group__5__Impl : ( ( rule__Insert__ValueAssignment_5 ) ) ;
    public final void rule__Insert__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2014:1: ( ( ( rule__Insert__ValueAssignment_5 ) ) )
            // InternalMyDsl.g:2015:1: ( ( rule__Insert__ValueAssignment_5 ) )
            {
            // InternalMyDsl.g:2015:1: ( ( rule__Insert__ValueAssignment_5 ) )
            // InternalMyDsl.g:2016:2: ( rule__Insert__ValueAssignment_5 )
            {
             before(grammarAccess.getInsertAccess().getValueAssignment_5()); 
            // InternalMyDsl.g:2017:2: ( rule__Insert__ValueAssignment_5 )
            // InternalMyDsl.g:2017:3: rule__Insert__ValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Insert__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getValueAssignment_5()); 

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
    // $ANTLR end "rule__Insert__Group__5__Impl"


    // $ANTLR start "rule__Insert__Group__6"
    // InternalMyDsl.g:2025:1: rule__Insert__Group__6 : rule__Insert__Group__6__Impl ;
    public final void rule__Insert__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2029:1: ( rule__Insert__Group__6__Impl )
            // InternalMyDsl.g:2030:2: rule__Insert__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Group__6__Impl();

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
    // $ANTLR end "rule__Insert__Group__6"


    // $ANTLR start "rule__Insert__Group__6__Impl"
    // InternalMyDsl.g:2036:1: rule__Insert__Group__6__Impl : ( ')' ) ;
    public final void rule__Insert__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2040:1: ( ( ')' ) )
            // InternalMyDsl.g:2041:1: ( ')' )
            {
            // InternalMyDsl.g:2041:1: ( ')' )
            // InternalMyDsl.g:2042:2: ')'
            {
             before(grammarAccess.getInsertAccess().getRightParenthesisKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__Insert__Group__6__Impl"


    // $ANTLR start "rule__Print__Group__0"
    // InternalMyDsl.g:2052:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2056:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // InternalMyDsl.g:2057:2: rule__Print__Group__0__Impl rule__Print__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Print__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Print__Group__1();

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
    // $ANTLR end "rule__Print__Group__0"


    // $ANTLR start "rule__Print__Group__0__Impl"
    // InternalMyDsl.g:2064:1: rule__Print__Group__0__Impl : ( 'Print(' ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2068:1: ( ( 'Print(' ) )
            // InternalMyDsl.g:2069:1: ( 'Print(' )
            {
            // InternalMyDsl.g:2069:1: ( 'Print(' )
            // InternalMyDsl.g:2070:2: 'Print('
            {
             before(grammarAccess.getPrintAccess().getPrintKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPrintAccess().getPrintKeyword_0()); 

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
    // $ANTLR end "rule__Print__Group__0__Impl"


    // $ANTLR start "rule__Print__Group__1"
    // InternalMyDsl.g:2079:1: rule__Print__Group__1 : rule__Print__Group__1__Impl rule__Print__Group__2 ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2083:1: ( rule__Print__Group__1__Impl rule__Print__Group__2 )
            // InternalMyDsl.g:2084:2: rule__Print__Group__1__Impl rule__Print__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Print__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Print__Group__2();

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
    // $ANTLR end "rule__Print__Group__1"


    // $ANTLR start "rule__Print__Group__1__Impl"
    // InternalMyDsl.g:2091:1: rule__Print__Group__1__Impl : ( ( rule__Print__ValueAssignment_1 ) ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2095:1: ( ( ( rule__Print__ValueAssignment_1 ) ) )
            // InternalMyDsl.g:2096:1: ( ( rule__Print__ValueAssignment_1 ) )
            {
            // InternalMyDsl.g:2096:1: ( ( rule__Print__ValueAssignment_1 ) )
            // InternalMyDsl.g:2097:2: ( rule__Print__ValueAssignment_1 )
            {
             before(grammarAccess.getPrintAccess().getValueAssignment_1()); 
            // InternalMyDsl.g:2098:2: ( rule__Print__ValueAssignment_1 )
            // InternalMyDsl.g:2098:3: rule__Print__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Print__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrintAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__Print__Group__1__Impl"


    // $ANTLR start "rule__Print__Group__2"
    // InternalMyDsl.g:2106:1: rule__Print__Group__2 : rule__Print__Group__2__Impl ;
    public final void rule__Print__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2110:1: ( rule__Print__Group__2__Impl )
            // InternalMyDsl.g:2111:2: rule__Print__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Print__Group__2__Impl();

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
    // $ANTLR end "rule__Print__Group__2"


    // $ANTLR start "rule__Print__Group__2__Impl"
    // InternalMyDsl.g:2117:1: rule__Print__Group__2__Impl : ( ')' ) ;
    public final void rule__Print__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2121:1: ( ( ')' ) )
            // InternalMyDsl.g:2122:1: ( ')' )
            {
            // InternalMyDsl.g:2122:1: ( ')' )
            // InternalMyDsl.g:2123:2: ')'
            {
             before(grammarAccess.getPrintAccess().getRightParenthesisKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPrintAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Print__Group__2__Impl"


    // $ANTLR start "rule__ExportCSV__Group__0"
    // InternalMyDsl.g:2133:1: rule__ExportCSV__Group__0 : rule__ExportCSV__Group__0__Impl rule__ExportCSV__Group__1 ;
    public final void rule__ExportCSV__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2137:1: ( rule__ExportCSV__Group__0__Impl rule__ExportCSV__Group__1 )
            // InternalMyDsl.g:2138:2: rule__ExportCSV__Group__0__Impl rule__ExportCSV__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ExportCSV__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExportCSV__Group__1();

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
    // $ANTLR end "rule__ExportCSV__Group__0"


    // $ANTLR start "rule__ExportCSV__Group__0__Impl"
    // InternalMyDsl.g:2145:1: rule__ExportCSV__Group__0__Impl : ( 'Store(' ) ;
    public final void rule__ExportCSV__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2149:1: ( ( 'Store(' ) )
            // InternalMyDsl.g:2150:1: ( 'Store(' )
            {
            // InternalMyDsl.g:2150:1: ( 'Store(' )
            // InternalMyDsl.g:2151:2: 'Store('
            {
             before(grammarAccess.getExportCSVAccess().getStoreKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getExportCSVAccess().getStoreKeyword_0()); 

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
    // $ANTLR end "rule__ExportCSV__Group__0__Impl"


    // $ANTLR start "rule__ExportCSV__Group__1"
    // InternalMyDsl.g:2160:1: rule__ExportCSV__Group__1 : rule__ExportCSV__Group__1__Impl rule__ExportCSV__Group__2 ;
    public final void rule__ExportCSV__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2164:1: ( rule__ExportCSV__Group__1__Impl rule__ExportCSV__Group__2 )
            // InternalMyDsl.g:2165:2: rule__ExportCSV__Group__1__Impl rule__ExportCSV__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ExportCSV__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExportCSV__Group__2();

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
    // $ANTLR end "rule__ExportCSV__Group__1"


    // $ANTLR start "rule__ExportCSV__Group__1__Impl"
    // InternalMyDsl.g:2172:1: rule__ExportCSV__Group__1__Impl : ( ( rule__ExportCSV__PathAssignment_1 ) ) ;
    public final void rule__ExportCSV__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2176:1: ( ( ( rule__ExportCSV__PathAssignment_1 ) ) )
            // InternalMyDsl.g:2177:1: ( ( rule__ExportCSV__PathAssignment_1 ) )
            {
            // InternalMyDsl.g:2177:1: ( ( rule__ExportCSV__PathAssignment_1 ) )
            // InternalMyDsl.g:2178:2: ( rule__ExportCSV__PathAssignment_1 )
            {
             before(grammarAccess.getExportCSVAccess().getPathAssignment_1()); 
            // InternalMyDsl.g:2179:2: ( rule__ExportCSV__PathAssignment_1 )
            // InternalMyDsl.g:2179:3: rule__ExportCSV__PathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExportCSV__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExportCSVAccess().getPathAssignment_1()); 

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
    // $ANTLR end "rule__ExportCSV__Group__1__Impl"


    // $ANTLR start "rule__ExportCSV__Group__2"
    // InternalMyDsl.g:2187:1: rule__ExportCSV__Group__2 : rule__ExportCSV__Group__2__Impl ;
    public final void rule__ExportCSV__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2191:1: ( rule__ExportCSV__Group__2__Impl )
            // InternalMyDsl.g:2192:2: rule__ExportCSV__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExportCSV__Group__2__Impl();

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
    // $ANTLR end "rule__ExportCSV__Group__2"


    // $ANTLR start "rule__ExportCSV__Group__2__Impl"
    // InternalMyDsl.g:2198:1: rule__ExportCSV__Group__2__Impl : ( ')' ) ;
    public final void rule__ExportCSV__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2202:1: ( ( ')' ) )
            // InternalMyDsl.g:2203:1: ( ')' )
            {
            // InternalMyDsl.g:2203:1: ( ')' )
            // InternalMyDsl.g:2204:2: ')'
            {
             before(grammarAccess.getExportCSVAccess().getRightParenthesisKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExportCSVAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__ExportCSV__Group__2__Impl"


    // $ANTLR start "rule__ExportJSON__Group__0"
    // InternalMyDsl.g:2214:1: rule__ExportJSON__Group__0 : rule__ExportJSON__Group__0__Impl rule__ExportJSON__Group__1 ;
    public final void rule__ExportJSON__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2218:1: ( rule__ExportJSON__Group__0__Impl rule__ExportJSON__Group__1 )
            // InternalMyDsl.g:2219:2: rule__ExportJSON__Group__0__Impl rule__ExportJSON__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ExportJSON__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExportJSON__Group__1();

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
    // $ANTLR end "rule__ExportJSON__Group__0"


    // $ANTLR start "rule__ExportJSON__Group__0__Impl"
    // InternalMyDsl.g:2226:1: rule__ExportJSON__Group__0__Impl : ( 'Export(' ) ;
    public final void rule__ExportJSON__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2230:1: ( ( 'Export(' ) )
            // InternalMyDsl.g:2231:1: ( 'Export(' )
            {
            // InternalMyDsl.g:2231:1: ( 'Export(' )
            // InternalMyDsl.g:2232:2: 'Export('
            {
             before(grammarAccess.getExportJSONAccess().getExportKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getExportJSONAccess().getExportKeyword_0()); 

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
    // $ANTLR end "rule__ExportJSON__Group__0__Impl"


    // $ANTLR start "rule__ExportJSON__Group__1"
    // InternalMyDsl.g:2241:1: rule__ExportJSON__Group__1 : rule__ExportJSON__Group__1__Impl rule__ExportJSON__Group__2 ;
    public final void rule__ExportJSON__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2245:1: ( rule__ExportJSON__Group__1__Impl rule__ExportJSON__Group__2 )
            // InternalMyDsl.g:2246:2: rule__ExportJSON__Group__1__Impl rule__ExportJSON__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ExportJSON__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExportJSON__Group__2();

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
    // $ANTLR end "rule__ExportJSON__Group__1"


    // $ANTLR start "rule__ExportJSON__Group__1__Impl"
    // InternalMyDsl.g:2253:1: rule__ExportJSON__Group__1__Impl : ( ( rule__ExportJSON__PathAssignment_1 ) ) ;
    public final void rule__ExportJSON__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2257:1: ( ( ( rule__ExportJSON__PathAssignment_1 ) ) )
            // InternalMyDsl.g:2258:1: ( ( rule__ExportJSON__PathAssignment_1 ) )
            {
            // InternalMyDsl.g:2258:1: ( ( rule__ExportJSON__PathAssignment_1 ) )
            // InternalMyDsl.g:2259:2: ( rule__ExportJSON__PathAssignment_1 )
            {
             before(grammarAccess.getExportJSONAccess().getPathAssignment_1()); 
            // InternalMyDsl.g:2260:2: ( rule__ExportJSON__PathAssignment_1 )
            // InternalMyDsl.g:2260:3: rule__ExportJSON__PathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExportJSON__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExportJSONAccess().getPathAssignment_1()); 

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
    // $ANTLR end "rule__ExportJSON__Group__1__Impl"


    // $ANTLR start "rule__ExportJSON__Group__2"
    // InternalMyDsl.g:2268:1: rule__ExportJSON__Group__2 : rule__ExportJSON__Group__2__Impl ;
    public final void rule__ExportJSON__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2272:1: ( rule__ExportJSON__Group__2__Impl )
            // InternalMyDsl.g:2273:2: rule__ExportJSON__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExportJSON__Group__2__Impl();

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
    // $ANTLR end "rule__ExportJSON__Group__2"


    // $ANTLR start "rule__ExportJSON__Group__2__Impl"
    // InternalMyDsl.g:2279:1: rule__ExportJSON__Group__2__Impl : ( ')' ) ;
    public final void rule__ExportJSON__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2283:1: ( ( ')' ) )
            // InternalMyDsl.g:2284:1: ( ')' )
            {
            // InternalMyDsl.g:2284:1: ( ')' )
            // InternalMyDsl.g:2285:2: ')'
            {
             before(grammarAccess.getExportJSONAccess().getRightParenthesisKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExportJSONAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__ExportJSON__Group__2__Impl"


    // $ANTLR start "rule__Selectcell__Group__0"
    // InternalMyDsl.g:2295:1: rule__Selectcell__Group__0 : rule__Selectcell__Group__0__Impl rule__Selectcell__Group__1 ;
    public final void rule__Selectcell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2299:1: ( rule__Selectcell__Group__0__Impl rule__Selectcell__Group__1 )
            // InternalMyDsl.g:2300:2: rule__Selectcell__Group__0__Impl rule__Selectcell__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Selectcell__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selectcell__Group__1();

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
    // $ANTLR end "rule__Selectcell__Group__0"


    // $ANTLR start "rule__Selectcell__Group__0__Impl"
    // InternalMyDsl.g:2307:1: rule__Selectcell__Group__0__Impl : ( 'Selectcell(' ) ;
    public final void rule__Selectcell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2311:1: ( ( 'Selectcell(' ) )
            // InternalMyDsl.g:2312:1: ( 'Selectcell(' )
            {
            // InternalMyDsl.g:2312:1: ( 'Selectcell(' )
            // InternalMyDsl.g:2313:2: 'Selectcell('
            {
             before(grammarAccess.getSelectcellAccess().getSelectcellKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSelectcellAccess().getSelectcellKeyword_0()); 

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
    // $ANTLR end "rule__Selectcell__Group__0__Impl"


    // $ANTLR start "rule__Selectcell__Group__1"
    // InternalMyDsl.g:2322:1: rule__Selectcell__Group__1 : rule__Selectcell__Group__1__Impl rule__Selectcell__Group__2 ;
    public final void rule__Selectcell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2326:1: ( rule__Selectcell__Group__1__Impl rule__Selectcell__Group__2 )
            // InternalMyDsl.g:2327:2: rule__Selectcell__Group__1__Impl rule__Selectcell__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Selectcell__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selectcell__Group__2();

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
    // $ANTLR end "rule__Selectcell__Group__1"


    // $ANTLR start "rule__Selectcell__Group__1__Impl"
    // InternalMyDsl.g:2334:1: rule__Selectcell__Group__1__Impl : ( ( rule__Selectcell__CellXAssignment_1 ) ) ;
    public final void rule__Selectcell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2338:1: ( ( ( rule__Selectcell__CellXAssignment_1 ) ) )
            // InternalMyDsl.g:2339:1: ( ( rule__Selectcell__CellXAssignment_1 ) )
            {
            // InternalMyDsl.g:2339:1: ( ( rule__Selectcell__CellXAssignment_1 ) )
            // InternalMyDsl.g:2340:2: ( rule__Selectcell__CellXAssignment_1 )
            {
             before(grammarAccess.getSelectcellAccess().getCellXAssignment_1()); 
            // InternalMyDsl.g:2341:2: ( rule__Selectcell__CellXAssignment_1 )
            // InternalMyDsl.g:2341:3: rule__Selectcell__CellXAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Selectcell__CellXAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectcellAccess().getCellXAssignment_1()); 

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
    // $ANTLR end "rule__Selectcell__Group__1__Impl"


    // $ANTLR start "rule__Selectcell__Group__2"
    // InternalMyDsl.g:2349:1: rule__Selectcell__Group__2 : rule__Selectcell__Group__2__Impl rule__Selectcell__Group__3 ;
    public final void rule__Selectcell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2353:1: ( rule__Selectcell__Group__2__Impl rule__Selectcell__Group__3 )
            // InternalMyDsl.g:2354:2: rule__Selectcell__Group__2__Impl rule__Selectcell__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Selectcell__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selectcell__Group__3();

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
    // $ANTLR end "rule__Selectcell__Group__2"


    // $ANTLR start "rule__Selectcell__Group__2__Impl"
    // InternalMyDsl.g:2361:1: rule__Selectcell__Group__2__Impl : ( ',' ) ;
    public final void rule__Selectcell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2365:1: ( ( ',' ) )
            // InternalMyDsl.g:2366:1: ( ',' )
            {
            // InternalMyDsl.g:2366:1: ( ',' )
            // InternalMyDsl.g:2367:2: ','
            {
             before(grammarAccess.getSelectcellAccess().getCommaKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSelectcellAccess().getCommaKeyword_2()); 

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
    // $ANTLR end "rule__Selectcell__Group__2__Impl"


    // $ANTLR start "rule__Selectcell__Group__3"
    // InternalMyDsl.g:2376:1: rule__Selectcell__Group__3 : rule__Selectcell__Group__3__Impl rule__Selectcell__Group__4 ;
    public final void rule__Selectcell__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2380:1: ( rule__Selectcell__Group__3__Impl rule__Selectcell__Group__4 )
            // InternalMyDsl.g:2381:2: rule__Selectcell__Group__3__Impl rule__Selectcell__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Selectcell__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selectcell__Group__4();

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
    // $ANTLR end "rule__Selectcell__Group__3"


    // $ANTLR start "rule__Selectcell__Group__3__Impl"
    // InternalMyDsl.g:2388:1: rule__Selectcell__Group__3__Impl : ( ( rule__Selectcell__CellYAssignment_3 ) ) ;
    public final void rule__Selectcell__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2392:1: ( ( ( rule__Selectcell__CellYAssignment_3 ) ) )
            // InternalMyDsl.g:2393:1: ( ( rule__Selectcell__CellYAssignment_3 ) )
            {
            // InternalMyDsl.g:2393:1: ( ( rule__Selectcell__CellYAssignment_3 ) )
            // InternalMyDsl.g:2394:2: ( rule__Selectcell__CellYAssignment_3 )
            {
             before(grammarAccess.getSelectcellAccess().getCellYAssignment_3()); 
            // InternalMyDsl.g:2395:2: ( rule__Selectcell__CellYAssignment_3 )
            // InternalMyDsl.g:2395:3: rule__Selectcell__CellYAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Selectcell__CellYAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSelectcellAccess().getCellYAssignment_3()); 

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
    // $ANTLR end "rule__Selectcell__Group__3__Impl"


    // $ANTLR start "rule__Selectcell__Group__4"
    // InternalMyDsl.g:2403:1: rule__Selectcell__Group__4 : rule__Selectcell__Group__4__Impl ;
    public final void rule__Selectcell__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2407:1: ( rule__Selectcell__Group__4__Impl )
            // InternalMyDsl.g:2408:2: rule__Selectcell__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selectcell__Group__4__Impl();

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
    // $ANTLR end "rule__Selectcell__Group__4"


    // $ANTLR start "rule__Selectcell__Group__4__Impl"
    // InternalMyDsl.g:2414:1: rule__Selectcell__Group__4__Impl : ( ')' ) ;
    public final void rule__Selectcell__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2418:1: ( ( ')' ) )
            // InternalMyDsl.g:2419:1: ( ')' )
            {
            // InternalMyDsl.g:2419:1: ( ')' )
            // InternalMyDsl.g:2420:2: ')'
            {
             before(grammarAccess.getSelectcellAccess().getRightParenthesisKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSelectcellAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Selectcell__Group__4__Impl"


    // $ANTLR start "rule__Linesum__Group__0"
    // InternalMyDsl.g:2430:1: rule__Linesum__Group__0 : rule__Linesum__Group__0__Impl rule__Linesum__Group__1 ;
    public final void rule__Linesum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2434:1: ( rule__Linesum__Group__0__Impl rule__Linesum__Group__1 )
            // InternalMyDsl.g:2435:2: rule__Linesum__Group__0__Impl rule__Linesum__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Linesum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Linesum__Group__1();

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
    // $ANTLR end "rule__Linesum__Group__0"


    // $ANTLR start "rule__Linesum__Group__0__Impl"
    // InternalMyDsl.g:2442:1: rule__Linesum__Group__0__Impl : ( 'Linesum(' ) ;
    public final void rule__Linesum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2446:1: ( ( 'Linesum(' ) )
            // InternalMyDsl.g:2447:1: ( 'Linesum(' )
            {
            // InternalMyDsl.g:2447:1: ( 'Linesum(' )
            // InternalMyDsl.g:2448:2: 'Linesum('
            {
             before(grammarAccess.getLinesumAccess().getLinesumKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLinesumAccess().getLinesumKeyword_0()); 

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
    // $ANTLR end "rule__Linesum__Group__0__Impl"


    // $ANTLR start "rule__Linesum__Group__1"
    // InternalMyDsl.g:2457:1: rule__Linesum__Group__1 : rule__Linesum__Group__1__Impl rule__Linesum__Group__2 ;
    public final void rule__Linesum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2461:1: ( rule__Linesum__Group__1__Impl rule__Linesum__Group__2 )
            // InternalMyDsl.g:2462:2: rule__Linesum__Group__1__Impl rule__Linesum__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Linesum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Linesum__Group__2();

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
    // $ANTLR end "rule__Linesum__Group__1"


    // $ANTLR start "rule__Linesum__Group__1__Impl"
    // InternalMyDsl.g:2469:1: rule__Linesum__Group__1__Impl : ( ( rule__Linesum__LineIndexAssignment_1 ) ) ;
    public final void rule__Linesum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2473:1: ( ( ( rule__Linesum__LineIndexAssignment_1 ) ) )
            // InternalMyDsl.g:2474:1: ( ( rule__Linesum__LineIndexAssignment_1 ) )
            {
            // InternalMyDsl.g:2474:1: ( ( rule__Linesum__LineIndexAssignment_1 ) )
            // InternalMyDsl.g:2475:2: ( rule__Linesum__LineIndexAssignment_1 )
            {
             before(grammarAccess.getLinesumAccess().getLineIndexAssignment_1()); 
            // InternalMyDsl.g:2476:2: ( rule__Linesum__LineIndexAssignment_1 )
            // InternalMyDsl.g:2476:3: rule__Linesum__LineIndexAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Linesum__LineIndexAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLinesumAccess().getLineIndexAssignment_1()); 

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
    // $ANTLR end "rule__Linesum__Group__1__Impl"


    // $ANTLR start "rule__Linesum__Group__2"
    // InternalMyDsl.g:2484:1: rule__Linesum__Group__2 : rule__Linesum__Group__2__Impl ;
    public final void rule__Linesum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2488:1: ( rule__Linesum__Group__2__Impl )
            // InternalMyDsl.g:2489:2: rule__Linesum__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Linesum__Group__2__Impl();

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
    // $ANTLR end "rule__Linesum__Group__2"


    // $ANTLR start "rule__Linesum__Group__2__Impl"
    // InternalMyDsl.g:2495:1: rule__Linesum__Group__2__Impl : ( ')' ) ;
    public final void rule__Linesum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2499:1: ( ( ')' ) )
            // InternalMyDsl.g:2500:1: ( ')' )
            {
            // InternalMyDsl.g:2500:1: ( ')' )
            // InternalMyDsl.g:2501:2: ')'
            {
             before(grammarAccess.getLinesumAccess().getRightParenthesisKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLinesumAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Linesum__Group__2__Impl"


    // $ANTLR start "rule__Colsum__Group_0__0"
    // InternalMyDsl.g:2511:1: rule__Colsum__Group_0__0 : rule__Colsum__Group_0__0__Impl rule__Colsum__Group_0__1 ;
    public final void rule__Colsum__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2515:1: ( rule__Colsum__Group_0__0__Impl rule__Colsum__Group_0__1 )
            // InternalMyDsl.g:2516:2: rule__Colsum__Group_0__0__Impl rule__Colsum__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Colsum__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colsum__Group_0__1();

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
    // $ANTLR end "rule__Colsum__Group_0__0"


    // $ANTLR start "rule__Colsum__Group_0__0__Impl"
    // InternalMyDsl.g:2523:1: rule__Colsum__Group_0__0__Impl : ( 'Colsum(' ) ;
    public final void rule__Colsum__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2527:1: ( ( 'Colsum(' ) )
            // InternalMyDsl.g:2528:1: ( 'Colsum(' )
            {
            // InternalMyDsl.g:2528:1: ( 'Colsum(' )
            // InternalMyDsl.g:2529:2: 'Colsum('
            {
             before(grammarAccess.getColsumAccess().getColsumKeyword_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getColsumAccess().getColsumKeyword_0_0()); 

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
    // $ANTLR end "rule__Colsum__Group_0__0__Impl"


    // $ANTLR start "rule__Colsum__Group_0__1"
    // InternalMyDsl.g:2538:1: rule__Colsum__Group_0__1 : rule__Colsum__Group_0__1__Impl ;
    public final void rule__Colsum__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2542:1: ( rule__Colsum__Group_0__1__Impl )
            // InternalMyDsl.g:2543:2: rule__Colsum__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Colsum__Group_0__1__Impl();

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
    // $ANTLR end "rule__Colsum__Group_0__1"


    // $ANTLR start "rule__Colsum__Group_0__1__Impl"
    // InternalMyDsl.g:2549:1: rule__Colsum__Group_0__1__Impl : ( ( rule__Colsum__ColIndexAssignment_0_1 ) ) ;
    public final void rule__Colsum__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2553:1: ( ( ( rule__Colsum__ColIndexAssignment_0_1 ) ) )
            // InternalMyDsl.g:2554:1: ( ( rule__Colsum__ColIndexAssignment_0_1 ) )
            {
            // InternalMyDsl.g:2554:1: ( ( rule__Colsum__ColIndexAssignment_0_1 ) )
            // InternalMyDsl.g:2555:2: ( rule__Colsum__ColIndexAssignment_0_1 )
            {
             before(grammarAccess.getColsumAccess().getColIndexAssignment_0_1()); 
            // InternalMyDsl.g:2556:2: ( rule__Colsum__ColIndexAssignment_0_1 )
            // InternalMyDsl.g:2556:3: rule__Colsum__ColIndexAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Colsum__ColIndexAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getColsumAccess().getColIndexAssignment_0_1()); 

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
    // $ANTLR end "rule__Colsum__Group_0__1__Impl"


    // $ANTLR start "rule__Colsum__Group_1__0"
    // InternalMyDsl.g:2565:1: rule__Colsum__Group_1__0 : rule__Colsum__Group_1__0__Impl rule__Colsum__Group_1__1 ;
    public final void rule__Colsum__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2569:1: ( rule__Colsum__Group_1__0__Impl rule__Colsum__Group_1__1 )
            // InternalMyDsl.g:2570:2: rule__Colsum__Group_1__0__Impl rule__Colsum__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Colsum__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colsum__Group_1__1();

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
    // $ANTLR end "rule__Colsum__Group_1__0"


    // $ANTLR start "rule__Colsum__Group_1__0__Impl"
    // InternalMyDsl.g:2577:1: rule__Colsum__Group_1__0__Impl : ( ( rule__Colsum__NameAssignment_1_0 ) ) ;
    public final void rule__Colsum__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2581:1: ( ( ( rule__Colsum__NameAssignment_1_0 ) ) )
            // InternalMyDsl.g:2582:1: ( ( rule__Colsum__NameAssignment_1_0 ) )
            {
            // InternalMyDsl.g:2582:1: ( ( rule__Colsum__NameAssignment_1_0 ) )
            // InternalMyDsl.g:2583:2: ( rule__Colsum__NameAssignment_1_0 )
            {
             before(grammarAccess.getColsumAccess().getNameAssignment_1_0()); 
            // InternalMyDsl.g:2584:2: ( rule__Colsum__NameAssignment_1_0 )
            // InternalMyDsl.g:2584:3: rule__Colsum__NameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Colsum__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getColsumAccess().getNameAssignment_1_0()); 

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
    // $ANTLR end "rule__Colsum__Group_1__0__Impl"


    // $ANTLR start "rule__Colsum__Group_1__1"
    // InternalMyDsl.g:2592:1: rule__Colsum__Group_1__1 : rule__Colsum__Group_1__1__Impl ;
    public final void rule__Colsum__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2596:1: ( rule__Colsum__Group_1__1__Impl )
            // InternalMyDsl.g:2597:2: rule__Colsum__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Colsum__Group_1__1__Impl();

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
    // $ANTLR end "rule__Colsum__Group_1__1"


    // $ANTLR start "rule__Colsum__Group_1__1__Impl"
    // InternalMyDsl.g:2603:1: rule__Colsum__Group_1__1__Impl : ( ')' ) ;
    public final void rule__Colsum__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2607:1: ( ( ')' ) )
            // InternalMyDsl.g:2608:1: ( ')' )
            {
            // InternalMyDsl.g:2608:1: ( ')' )
            // InternalMyDsl.g:2609:2: ')'
            {
             before(grammarAccess.getColsumAccess().getRightParenthesisKeyword_1_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getColsumAccess().getRightParenthesisKeyword_1_1()); 

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
    // $ANTLR end "rule__Colsum__Group_1__1__Impl"


    // $ANTLR start "rule__Lineprod__Group__0"
    // InternalMyDsl.g:2619:1: rule__Lineprod__Group__0 : rule__Lineprod__Group__0__Impl rule__Lineprod__Group__1 ;
    public final void rule__Lineprod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2623:1: ( rule__Lineprod__Group__0__Impl rule__Lineprod__Group__1 )
            // InternalMyDsl.g:2624:2: rule__Lineprod__Group__0__Impl rule__Lineprod__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Lineprod__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lineprod__Group__1();

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
    // $ANTLR end "rule__Lineprod__Group__0"


    // $ANTLR start "rule__Lineprod__Group__0__Impl"
    // InternalMyDsl.g:2631:1: rule__Lineprod__Group__0__Impl : ( 'Lineprod(' ) ;
    public final void rule__Lineprod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2635:1: ( ( 'Lineprod(' ) )
            // InternalMyDsl.g:2636:1: ( 'Lineprod(' )
            {
            // InternalMyDsl.g:2636:1: ( 'Lineprod(' )
            // InternalMyDsl.g:2637:2: 'Lineprod('
            {
             before(grammarAccess.getLineprodAccess().getLineprodKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLineprodAccess().getLineprodKeyword_0()); 

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
    // $ANTLR end "rule__Lineprod__Group__0__Impl"


    // $ANTLR start "rule__Lineprod__Group__1"
    // InternalMyDsl.g:2646:1: rule__Lineprod__Group__1 : rule__Lineprod__Group__1__Impl rule__Lineprod__Group__2 ;
    public final void rule__Lineprod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2650:1: ( rule__Lineprod__Group__1__Impl rule__Lineprod__Group__2 )
            // InternalMyDsl.g:2651:2: rule__Lineprod__Group__1__Impl rule__Lineprod__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Lineprod__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lineprod__Group__2();

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
    // $ANTLR end "rule__Lineprod__Group__1"


    // $ANTLR start "rule__Lineprod__Group__1__Impl"
    // InternalMyDsl.g:2658:1: rule__Lineprod__Group__1__Impl : ( ( rule__Lineprod__LineIndexAssignment_1 ) ) ;
    public final void rule__Lineprod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2662:1: ( ( ( rule__Lineprod__LineIndexAssignment_1 ) ) )
            // InternalMyDsl.g:2663:1: ( ( rule__Lineprod__LineIndexAssignment_1 ) )
            {
            // InternalMyDsl.g:2663:1: ( ( rule__Lineprod__LineIndexAssignment_1 ) )
            // InternalMyDsl.g:2664:2: ( rule__Lineprod__LineIndexAssignment_1 )
            {
             before(grammarAccess.getLineprodAccess().getLineIndexAssignment_1()); 
            // InternalMyDsl.g:2665:2: ( rule__Lineprod__LineIndexAssignment_1 )
            // InternalMyDsl.g:2665:3: rule__Lineprod__LineIndexAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Lineprod__LineIndexAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLineprodAccess().getLineIndexAssignment_1()); 

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
    // $ANTLR end "rule__Lineprod__Group__1__Impl"


    // $ANTLR start "rule__Lineprod__Group__2"
    // InternalMyDsl.g:2673:1: rule__Lineprod__Group__2 : rule__Lineprod__Group__2__Impl ;
    public final void rule__Lineprod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2677:1: ( rule__Lineprod__Group__2__Impl )
            // InternalMyDsl.g:2678:2: rule__Lineprod__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lineprod__Group__2__Impl();

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
    // $ANTLR end "rule__Lineprod__Group__2"


    // $ANTLR start "rule__Lineprod__Group__2__Impl"
    // InternalMyDsl.g:2684:1: rule__Lineprod__Group__2__Impl : ( ')' ) ;
    public final void rule__Lineprod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2688:1: ( ( ')' ) )
            // InternalMyDsl.g:2689:1: ( ')' )
            {
            // InternalMyDsl.g:2689:1: ( ')' )
            // InternalMyDsl.g:2690:2: ')'
            {
             before(grammarAccess.getLineprodAccess().getRightParenthesisKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLineprodAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Lineprod__Group__2__Impl"


    // $ANTLR start "rule__Colprod__Group_0__0"
    // InternalMyDsl.g:2700:1: rule__Colprod__Group_0__0 : rule__Colprod__Group_0__0__Impl rule__Colprod__Group_0__1 ;
    public final void rule__Colprod__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2704:1: ( rule__Colprod__Group_0__0__Impl rule__Colprod__Group_0__1 )
            // InternalMyDsl.g:2705:2: rule__Colprod__Group_0__0__Impl rule__Colprod__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Colprod__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colprod__Group_0__1();

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
    // $ANTLR end "rule__Colprod__Group_0__0"


    // $ANTLR start "rule__Colprod__Group_0__0__Impl"
    // InternalMyDsl.g:2712:1: rule__Colprod__Group_0__0__Impl : ( 'Colprod(' ) ;
    public final void rule__Colprod__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2716:1: ( ( 'Colprod(' ) )
            // InternalMyDsl.g:2717:1: ( 'Colprod(' )
            {
            // InternalMyDsl.g:2717:1: ( 'Colprod(' )
            // InternalMyDsl.g:2718:2: 'Colprod('
            {
             before(grammarAccess.getColprodAccess().getColprodKeyword_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getColprodAccess().getColprodKeyword_0_0()); 

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
    // $ANTLR end "rule__Colprod__Group_0__0__Impl"


    // $ANTLR start "rule__Colprod__Group_0__1"
    // InternalMyDsl.g:2727:1: rule__Colprod__Group_0__1 : rule__Colprod__Group_0__1__Impl ;
    public final void rule__Colprod__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2731:1: ( rule__Colprod__Group_0__1__Impl )
            // InternalMyDsl.g:2732:2: rule__Colprod__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Colprod__Group_0__1__Impl();

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
    // $ANTLR end "rule__Colprod__Group_0__1"


    // $ANTLR start "rule__Colprod__Group_0__1__Impl"
    // InternalMyDsl.g:2738:1: rule__Colprod__Group_0__1__Impl : ( ( rule__Colprod__ColIndexAssignment_0_1 ) ) ;
    public final void rule__Colprod__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2742:1: ( ( ( rule__Colprod__ColIndexAssignment_0_1 ) ) )
            // InternalMyDsl.g:2743:1: ( ( rule__Colprod__ColIndexAssignment_0_1 ) )
            {
            // InternalMyDsl.g:2743:1: ( ( rule__Colprod__ColIndexAssignment_0_1 ) )
            // InternalMyDsl.g:2744:2: ( rule__Colprod__ColIndexAssignment_0_1 )
            {
             before(grammarAccess.getColprodAccess().getColIndexAssignment_0_1()); 
            // InternalMyDsl.g:2745:2: ( rule__Colprod__ColIndexAssignment_0_1 )
            // InternalMyDsl.g:2745:3: rule__Colprod__ColIndexAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Colprod__ColIndexAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getColprodAccess().getColIndexAssignment_0_1()); 

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
    // $ANTLR end "rule__Colprod__Group_0__1__Impl"


    // $ANTLR start "rule__Colprod__Group_1__0"
    // InternalMyDsl.g:2754:1: rule__Colprod__Group_1__0 : rule__Colprod__Group_1__0__Impl rule__Colprod__Group_1__1 ;
    public final void rule__Colprod__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2758:1: ( rule__Colprod__Group_1__0__Impl rule__Colprod__Group_1__1 )
            // InternalMyDsl.g:2759:2: rule__Colprod__Group_1__0__Impl rule__Colprod__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Colprod__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colprod__Group_1__1();

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
    // $ANTLR end "rule__Colprod__Group_1__0"


    // $ANTLR start "rule__Colprod__Group_1__0__Impl"
    // InternalMyDsl.g:2766:1: rule__Colprod__Group_1__0__Impl : ( ( rule__Colprod__NameAssignment_1_0 ) ) ;
    public final void rule__Colprod__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2770:1: ( ( ( rule__Colprod__NameAssignment_1_0 ) ) )
            // InternalMyDsl.g:2771:1: ( ( rule__Colprod__NameAssignment_1_0 ) )
            {
            // InternalMyDsl.g:2771:1: ( ( rule__Colprod__NameAssignment_1_0 ) )
            // InternalMyDsl.g:2772:2: ( rule__Colprod__NameAssignment_1_0 )
            {
             before(grammarAccess.getColprodAccess().getNameAssignment_1_0()); 
            // InternalMyDsl.g:2773:2: ( rule__Colprod__NameAssignment_1_0 )
            // InternalMyDsl.g:2773:3: rule__Colprod__NameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Colprod__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getColprodAccess().getNameAssignment_1_0()); 

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
    // $ANTLR end "rule__Colprod__Group_1__0__Impl"


    // $ANTLR start "rule__Colprod__Group_1__1"
    // InternalMyDsl.g:2781:1: rule__Colprod__Group_1__1 : rule__Colprod__Group_1__1__Impl ;
    public final void rule__Colprod__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2785:1: ( rule__Colprod__Group_1__1__Impl )
            // InternalMyDsl.g:2786:2: rule__Colprod__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Colprod__Group_1__1__Impl();

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
    // $ANTLR end "rule__Colprod__Group_1__1"


    // $ANTLR start "rule__Colprod__Group_1__1__Impl"
    // InternalMyDsl.g:2792:1: rule__Colprod__Group_1__1__Impl : ( ')' ) ;
    public final void rule__Colprod__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2796:1: ( ( ')' ) )
            // InternalMyDsl.g:2797:1: ( ')' )
            {
            // InternalMyDsl.g:2797:1: ( ')' )
            // InternalMyDsl.g:2798:2: ')'
            {
             before(grammarAccess.getColprodAccess().getRightParenthesisKeyword_1_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getColprodAccess().getRightParenthesisKeyword_1_1()); 

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
    // $ANTLR end "rule__Colprod__Group_1__1__Impl"


    // $ANTLR start "rule__Binexpr__Group__0"
    // InternalMyDsl.g:2808:1: rule__Binexpr__Group__0 : rule__Binexpr__Group__0__Impl rule__Binexpr__Group__1 ;
    public final void rule__Binexpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2812:1: ( rule__Binexpr__Group__0__Impl rule__Binexpr__Group__1 )
            // InternalMyDsl.g:2813:2: rule__Binexpr__Group__0__Impl rule__Binexpr__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Binexpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binexpr__Group__1();

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
    // $ANTLR end "rule__Binexpr__Group__0"


    // $ANTLR start "rule__Binexpr__Group__0__Impl"
    // InternalMyDsl.g:2820:1: rule__Binexpr__Group__0__Impl : ( '(' ) ;
    public final void rule__Binexpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2824:1: ( ( '(' ) )
            // InternalMyDsl.g:2825:1: ( '(' )
            {
            // InternalMyDsl.g:2825:1: ( '(' )
            // InternalMyDsl.g:2826:2: '('
            {
             before(grammarAccess.getBinexprAccess().getLeftParenthesisKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBinexprAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Binexpr__Group__0__Impl"


    // $ANTLR start "rule__Binexpr__Group__1"
    // InternalMyDsl.g:2835:1: rule__Binexpr__Group__1 : rule__Binexpr__Group__1__Impl rule__Binexpr__Group__2 ;
    public final void rule__Binexpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2839:1: ( rule__Binexpr__Group__1__Impl rule__Binexpr__Group__2 )
            // InternalMyDsl.g:2840:2: rule__Binexpr__Group__1__Impl rule__Binexpr__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Binexpr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binexpr__Group__2();

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
    // $ANTLR end "rule__Binexpr__Group__1"


    // $ANTLR start "rule__Binexpr__Group__1__Impl"
    // InternalMyDsl.g:2847:1: rule__Binexpr__Group__1__Impl : ( ( rule__Binexpr__LeftAssignment_1 ) ) ;
    public final void rule__Binexpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2851:1: ( ( ( rule__Binexpr__LeftAssignment_1 ) ) )
            // InternalMyDsl.g:2852:1: ( ( rule__Binexpr__LeftAssignment_1 ) )
            {
            // InternalMyDsl.g:2852:1: ( ( rule__Binexpr__LeftAssignment_1 ) )
            // InternalMyDsl.g:2853:2: ( rule__Binexpr__LeftAssignment_1 )
            {
             before(grammarAccess.getBinexprAccess().getLeftAssignment_1()); 
            // InternalMyDsl.g:2854:2: ( rule__Binexpr__LeftAssignment_1 )
            // InternalMyDsl.g:2854:3: rule__Binexpr__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Binexpr__LeftAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBinexprAccess().getLeftAssignment_1()); 

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
    // $ANTLR end "rule__Binexpr__Group__1__Impl"


    // $ANTLR start "rule__Binexpr__Group__2"
    // InternalMyDsl.g:2862:1: rule__Binexpr__Group__2 : rule__Binexpr__Group__2__Impl rule__Binexpr__Group__3 ;
    public final void rule__Binexpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2866:1: ( rule__Binexpr__Group__2__Impl rule__Binexpr__Group__3 )
            // InternalMyDsl.g:2867:2: rule__Binexpr__Group__2__Impl rule__Binexpr__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Binexpr__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binexpr__Group__3();

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
    // $ANTLR end "rule__Binexpr__Group__2"


    // $ANTLR start "rule__Binexpr__Group__2__Impl"
    // InternalMyDsl.g:2874:1: rule__Binexpr__Group__2__Impl : ( ( rule__Binexpr__OpAssignment_2 ) ) ;
    public final void rule__Binexpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2878:1: ( ( ( rule__Binexpr__OpAssignment_2 ) ) )
            // InternalMyDsl.g:2879:1: ( ( rule__Binexpr__OpAssignment_2 ) )
            {
            // InternalMyDsl.g:2879:1: ( ( rule__Binexpr__OpAssignment_2 ) )
            // InternalMyDsl.g:2880:2: ( rule__Binexpr__OpAssignment_2 )
            {
             before(grammarAccess.getBinexprAccess().getOpAssignment_2()); 
            // InternalMyDsl.g:2881:2: ( rule__Binexpr__OpAssignment_2 )
            // InternalMyDsl.g:2881:3: rule__Binexpr__OpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Binexpr__OpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBinexprAccess().getOpAssignment_2()); 

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
    // $ANTLR end "rule__Binexpr__Group__2__Impl"


    // $ANTLR start "rule__Binexpr__Group__3"
    // InternalMyDsl.g:2889:1: rule__Binexpr__Group__3 : rule__Binexpr__Group__3__Impl rule__Binexpr__Group__4 ;
    public final void rule__Binexpr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2893:1: ( rule__Binexpr__Group__3__Impl rule__Binexpr__Group__4 )
            // InternalMyDsl.g:2894:2: rule__Binexpr__Group__3__Impl rule__Binexpr__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Binexpr__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binexpr__Group__4();

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
    // $ANTLR end "rule__Binexpr__Group__3"


    // $ANTLR start "rule__Binexpr__Group__3__Impl"
    // InternalMyDsl.g:2901:1: rule__Binexpr__Group__3__Impl : ( ( rule__Binexpr__RightAssignment_3 ) ) ;
    public final void rule__Binexpr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2905:1: ( ( ( rule__Binexpr__RightAssignment_3 ) ) )
            // InternalMyDsl.g:2906:1: ( ( rule__Binexpr__RightAssignment_3 ) )
            {
            // InternalMyDsl.g:2906:1: ( ( rule__Binexpr__RightAssignment_3 ) )
            // InternalMyDsl.g:2907:2: ( rule__Binexpr__RightAssignment_3 )
            {
             before(grammarAccess.getBinexprAccess().getRightAssignment_3()); 
            // InternalMyDsl.g:2908:2: ( rule__Binexpr__RightAssignment_3 )
            // InternalMyDsl.g:2908:3: rule__Binexpr__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Binexpr__RightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBinexprAccess().getRightAssignment_3()); 

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
    // $ANTLR end "rule__Binexpr__Group__3__Impl"


    // $ANTLR start "rule__Binexpr__Group__4"
    // InternalMyDsl.g:2916:1: rule__Binexpr__Group__4 : rule__Binexpr__Group__4__Impl ;
    public final void rule__Binexpr__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2920:1: ( rule__Binexpr__Group__4__Impl )
            // InternalMyDsl.g:2921:2: rule__Binexpr__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binexpr__Group__4__Impl();

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
    // $ANTLR end "rule__Binexpr__Group__4"


    // $ANTLR start "rule__Binexpr__Group__4__Impl"
    // InternalMyDsl.g:2927:1: rule__Binexpr__Group__4__Impl : ( ')' ) ;
    public final void rule__Binexpr__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2931:1: ( ( ')' ) )
            // InternalMyDsl.g:2932:1: ( ')' )
            {
            // InternalMyDsl.g:2932:1: ( ')' )
            // InternalMyDsl.g:2933:2: ')'
            {
             before(grammarAccess.getBinexprAccess().getRightParenthesisKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBinexprAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Binexpr__Group__4__Impl"


    // $ANTLR start "rule__Programme__LoadscopesAssignment"
    // InternalMyDsl.g:2943:1: rule__Programme__LoadscopesAssignment : ( ruleLoadscope ) ;
    public final void rule__Programme__LoadscopesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2947:1: ( ( ruleLoadscope ) )
            // InternalMyDsl.g:2948:2: ( ruleLoadscope )
            {
            // InternalMyDsl.g:2948:2: ( ruleLoadscope )
            // InternalMyDsl.g:2949:3: ruleLoadscope
            {
             before(grammarAccess.getProgrammeAccess().getLoadscopesLoadscopeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleLoadscope();

            state._fsp--;

             after(grammarAccess.getProgrammeAccess().getLoadscopesLoadscopeParserRuleCall_0()); 

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
    // $ANTLR end "rule__Programme__LoadscopesAssignment"


    // $ANTLR start "rule__Load__PathAssignment_1"
    // InternalMyDsl.g:2958:1: rule__Load__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Load__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2962:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2963:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2963:2: ( RULE_STRING )
            // InternalMyDsl.g:2964:3: RULE_STRING
            {
             before(grammarAccess.getLoadAccess().getPathSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoadAccess().getPathSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Load__PathAssignment_1"


    // $ANTLR start "rule__Load__InstructionsAssignment_4"
    // InternalMyDsl.g:2973:1: rule__Load__InstructionsAssignment_4 : ( ruleInstruction ) ;
    public final void rule__Load__InstructionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2977:1: ( ( ruleInstruction ) )
            // InternalMyDsl.g:2978:2: ( ruleInstruction )
            {
            // InternalMyDsl.g:2978:2: ( ruleInstruction )
            // InternalMyDsl.g:2979:3: ruleInstruction
            {
             before(grammarAccess.getLoadAccess().getInstructionsInstructionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getLoadAccess().getInstructionsInstructionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Load__InstructionsAssignment_4"


    // $ANTLR start "rule__Create__InstructionsAssignment_2"
    // InternalMyDsl.g:2988:1: rule__Create__InstructionsAssignment_2 : ( ruleInstruction ) ;
    public final void rule__Create__InstructionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2992:1: ( ( ruleInstruction ) )
            // InternalMyDsl.g:2993:2: ( ruleInstruction )
            {
            // InternalMyDsl.g:2993:2: ( ruleInstruction )
            // InternalMyDsl.g:2994:3: ruleInstruction
            {
             before(grammarAccess.getCreateAccess().getInstructionsInstructionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getCreateAccess().getInstructionsInstructionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Create__InstructionsAssignment_2"


    // $ANTLR start "rule__InsertCol__ColIndexAssignment_1"
    // InternalMyDsl.g:3003:1: rule__InsertCol__ColIndexAssignment_1 : ( ruleExpression ) ;
    public final void rule__InsertCol__ColIndexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3007:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:3008:2: ( ruleExpression )
            {
            // InternalMyDsl.g:3008:2: ( ruleExpression )
            // InternalMyDsl.g:3009:3: ruleExpression
            {
             before(grammarAccess.getInsertColAccess().getColIndexExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getInsertColAccess().getColIndexExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__InsertCol__ColIndexAssignment_1"


    // $ANTLR start "rule__InsertCol__ColNameAssignment_3"
    // InternalMyDsl.g:3018:1: rule__InsertCol__ColNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__InsertCol__ColNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3022:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3023:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3023:2: ( RULE_STRING )
            // InternalMyDsl.g:3024:3: RULE_STRING
            {
             before(grammarAccess.getInsertColAccess().getColNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInsertColAccess().getColNameSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__InsertCol__ColNameAssignment_3"


    // $ANTLR start "rule__InsertCol__ExpAssignment_4_1"
    // InternalMyDsl.g:3033:1: rule__InsertCol__ExpAssignment_4_1 : ( ruleExpression ) ;
    public final void rule__InsertCol__ExpAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3037:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:3038:2: ( ruleExpression )
            {
            // InternalMyDsl.g:3038:2: ( ruleExpression )
            // InternalMyDsl.g:3039:3: ruleExpression
            {
             before(grammarAccess.getInsertColAccess().getExpExpressionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getInsertColAccess().getExpExpressionParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__InsertCol__ExpAssignment_4_1"


    // $ANTLR start "rule__RemoveCol__ColIndexAssignment_0_1"
    // InternalMyDsl.g:3048:1: rule__RemoveCol__ColIndexAssignment_0_1 : ( ruleExpression ) ;
    public final void rule__RemoveCol__ColIndexAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3052:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:3053:2: ( ruleExpression )
            {
            // InternalMyDsl.g:3053:2: ( ruleExpression )
            // InternalMyDsl.g:3054:3: ruleExpression
            {
             before(grammarAccess.getRemoveColAccess().getColIndexExpressionParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getRemoveColAccess().getColIndexExpressionParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__RemoveCol__ColIndexAssignment_0_1"


    // $ANTLR start "rule__RemoveCol__NameAssignment_1_0"
    // InternalMyDsl.g:3063:1: rule__RemoveCol__NameAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__RemoveCol__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3067:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3068:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3068:2: ( RULE_STRING )
            // InternalMyDsl.g:3069:3: RULE_STRING
            {
             before(grammarAccess.getRemoveColAccess().getNameSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRemoveColAccess().getNameSTRINGTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__RemoveCol__NameAssignment_1_0"


    // $ANTLR start "rule__InsertLine__LineIndexAssignment_1"
    // InternalMyDsl.g:3078:1: rule__InsertLine__LineIndexAssignment_1 : ( ruleExpression ) ;
    public final void rule__InsertLine__LineIndexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3082:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:3083:2: ( ruleExpression )
            {
            // InternalMyDsl.g:3083:2: ( ruleExpression )
            // InternalMyDsl.g:3084:3: ruleExpression
            {
             before(grammarAccess.getInsertLineAccess().getLineIndexExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getInsertLineAccess().getLineIndexExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__InsertLine__LineIndexAssignment_1"


    // $ANTLR start "rule__InsertLine__ExpsAssignment_2_1"
    // InternalMyDsl.g:3093:1: rule__InsertLine__ExpsAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__InsertLine__ExpsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3097:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:3098:2: ( ruleExpression )
            {
            // InternalMyDsl.g:3098:2: ( ruleExpression )
            // InternalMyDsl.g:3099:3: ruleExpression
            {
             before(grammarAccess.getInsertLineAccess().getExpsExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getInsertLineAccess().getExpsExpressionParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__InsertLine__ExpsAssignment_2_1"


    // $ANTLR start "rule__RemoveLine__LineIndexAssignment_1"
    // InternalMyDsl.g:3108:1: rule__RemoveLine__LineIndexAssignment_1 : ( ruleExpression ) ;
    public final void rule__RemoveLine__LineIndexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3112:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:3113:2: ( ruleExpression )
            {
            // InternalMyDsl.g:3113:2: ( ruleExpression )
            // InternalMyDsl.g:3114:3: ruleExpression
            {
             before(grammarAccess.getRemoveLineAccess().getLineIndexExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getRemoveLineAccess().getLineIndexExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__RemoveLine__LineIndexAssignment_1"


    // $ANTLR start "rule__Insert__LineIndexAssignment_1"
    // InternalMyDsl.g:3123:1: rule__Insert__LineIndexAssignment_1 : ( ruleExpression ) ;
    public final void rule__Insert__LineIndexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3127:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:3128:2: ( ruleExpression )
            {
            // InternalMyDsl.g:3128:2: ( ruleExpression )
            // InternalMyDsl.g:3129:3: ruleExpression
            {
             before(grammarAccess.getInsertAccess().getLineIndexExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getInsertAccess().getLineIndexExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Insert__LineIndexAssignment_1"


    // $ANTLR start "rule__Insert__ColNameOrIndexAssignment_3"
    // InternalMyDsl.g:3138:1: rule__Insert__ColNameOrIndexAssignment_3 : ( ruleExpression ) ;
    public final void rule__Insert__ColNameOrIndexAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3142:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:3143:2: ( ruleExpression )
            {
            // InternalMyDsl.g:3143:2: ( ruleExpression )
            // InternalMyDsl.g:3144:3: ruleExpression
            {
             before(grammarAccess.getInsertAccess().getColNameOrIndexExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getInsertAccess().getColNameOrIndexExpressionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Insert__ColNameOrIndexAssignment_3"


    // $ANTLR start "rule__Insert__ValueAssignment_5"
    // InternalMyDsl.g:3153:1: rule__Insert__ValueAssignment_5 : ( ( rule__Insert__ValueAlternatives_5_0 ) ) ;
    public final void rule__Insert__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3157:1: ( ( ( rule__Insert__ValueAlternatives_5_0 ) ) )
            // InternalMyDsl.g:3158:2: ( ( rule__Insert__ValueAlternatives_5_0 ) )
            {
            // InternalMyDsl.g:3158:2: ( ( rule__Insert__ValueAlternatives_5_0 ) )
            // InternalMyDsl.g:3159:3: ( rule__Insert__ValueAlternatives_5_0 )
            {
             before(grammarAccess.getInsertAccess().getValueAlternatives_5_0()); 
            // InternalMyDsl.g:3160:3: ( rule__Insert__ValueAlternatives_5_0 )
            // InternalMyDsl.g:3160:4: rule__Insert__ValueAlternatives_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Insert__ValueAlternatives_5_0();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getValueAlternatives_5_0()); 

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
    // $ANTLR end "rule__Insert__ValueAssignment_5"


    // $ANTLR start "rule__Print__ValueAssignment_1"
    // InternalMyDsl.g:3168:1: rule__Print__ValueAssignment_1 : ( ( rule__Print__ValueAlternatives_1_0 ) ) ;
    public final void rule__Print__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3172:1: ( ( ( rule__Print__ValueAlternatives_1_0 ) ) )
            // InternalMyDsl.g:3173:2: ( ( rule__Print__ValueAlternatives_1_0 ) )
            {
            // InternalMyDsl.g:3173:2: ( ( rule__Print__ValueAlternatives_1_0 ) )
            // InternalMyDsl.g:3174:3: ( rule__Print__ValueAlternatives_1_0 )
            {
             before(grammarAccess.getPrintAccess().getValueAlternatives_1_0()); 
            // InternalMyDsl.g:3175:3: ( rule__Print__ValueAlternatives_1_0 )
            // InternalMyDsl.g:3175:4: rule__Print__ValueAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Print__ValueAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPrintAccess().getValueAlternatives_1_0()); 

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
    // $ANTLR end "rule__Print__ValueAssignment_1"


    // $ANTLR start "rule__ExportCSV__PathAssignment_1"
    // InternalMyDsl.g:3183:1: rule__ExportCSV__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ExportCSV__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3187:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3188:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3188:2: ( RULE_STRING )
            // InternalMyDsl.g:3189:3: RULE_STRING
            {
             before(grammarAccess.getExportCSVAccess().getPathSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExportCSVAccess().getPathSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ExportCSV__PathAssignment_1"


    // $ANTLR start "rule__ExportJSON__PathAssignment_1"
    // InternalMyDsl.g:3198:1: rule__ExportJSON__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ExportJSON__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3202:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3203:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3203:2: ( RULE_STRING )
            // InternalMyDsl.g:3204:3: RULE_STRING
            {
             before(grammarAccess.getExportJSONAccess().getPathSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExportJSONAccess().getPathSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ExportJSON__PathAssignment_1"


    // $ANTLR start "rule__Selectcell__CellXAssignment_1"
    // InternalMyDsl.g:3213:1: rule__Selectcell__CellXAssignment_1 : ( ruleExpression ) ;
    public final void rule__Selectcell__CellXAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3217:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:3218:2: ( ruleExpression )
            {
            // InternalMyDsl.g:3218:2: ( ruleExpression )
            // InternalMyDsl.g:3219:3: ruleExpression
            {
             before(grammarAccess.getSelectcellAccess().getCellXExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSelectcellAccess().getCellXExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Selectcell__CellXAssignment_1"


    // $ANTLR start "rule__Selectcell__CellYAssignment_3"
    // InternalMyDsl.g:3228:1: rule__Selectcell__CellYAssignment_3 : ( ruleExpression ) ;
    public final void rule__Selectcell__CellYAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3232:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:3233:2: ( ruleExpression )
            {
            // InternalMyDsl.g:3233:2: ( ruleExpression )
            // InternalMyDsl.g:3234:3: ruleExpression
            {
             before(grammarAccess.getSelectcellAccess().getCellYExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSelectcellAccess().getCellYExpressionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Selectcell__CellYAssignment_3"


    // $ANTLR start "rule__Linesum__LineIndexAssignment_1"
    // InternalMyDsl.g:3243:1: rule__Linesum__LineIndexAssignment_1 : ( ruleExpression ) ;
    public final void rule__Linesum__LineIndexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3247:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:3248:2: ( ruleExpression )
            {
            // InternalMyDsl.g:3248:2: ( ruleExpression )
            // InternalMyDsl.g:3249:3: ruleExpression
            {
             before(grammarAccess.getLinesumAccess().getLineIndexExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getLinesumAccess().getLineIndexExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Linesum__LineIndexAssignment_1"


    // $ANTLR start "rule__Colsum__ColIndexAssignment_0_1"
    // InternalMyDsl.g:3258:1: rule__Colsum__ColIndexAssignment_0_1 : ( ruleExpression ) ;
    public final void rule__Colsum__ColIndexAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3262:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:3263:2: ( ruleExpression )
            {
            // InternalMyDsl.g:3263:2: ( ruleExpression )
            // InternalMyDsl.g:3264:3: ruleExpression
            {
             before(grammarAccess.getColsumAccess().getColIndexExpressionParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getColsumAccess().getColIndexExpressionParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Colsum__ColIndexAssignment_0_1"


    // $ANTLR start "rule__Colsum__NameAssignment_1_0"
    // InternalMyDsl.g:3273:1: rule__Colsum__NameAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__Colsum__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3277:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3278:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3278:2: ( RULE_STRING )
            // InternalMyDsl.g:3279:3: RULE_STRING
            {
             before(grammarAccess.getColsumAccess().getNameSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getColsumAccess().getNameSTRINGTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Colsum__NameAssignment_1_0"


    // $ANTLR start "rule__Lineprod__LineIndexAssignment_1"
    // InternalMyDsl.g:3288:1: rule__Lineprod__LineIndexAssignment_1 : ( ruleExpression ) ;
    public final void rule__Lineprod__LineIndexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3292:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:3293:2: ( ruleExpression )
            {
            // InternalMyDsl.g:3293:2: ( ruleExpression )
            // InternalMyDsl.g:3294:3: ruleExpression
            {
             before(grammarAccess.getLineprodAccess().getLineIndexExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getLineprodAccess().getLineIndexExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Lineprod__LineIndexAssignment_1"


    // $ANTLR start "rule__Colprod__ColIndexAssignment_0_1"
    // InternalMyDsl.g:3303:1: rule__Colprod__ColIndexAssignment_0_1 : ( ruleExpression ) ;
    public final void rule__Colprod__ColIndexAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3307:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:3308:2: ( ruleExpression )
            {
            // InternalMyDsl.g:3308:2: ( ruleExpression )
            // InternalMyDsl.g:3309:3: ruleExpression
            {
             before(grammarAccess.getColprodAccess().getColIndexExpressionParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getColprodAccess().getColIndexExpressionParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Colprod__ColIndexAssignment_0_1"


    // $ANTLR start "rule__Colprod__NameAssignment_1_0"
    // InternalMyDsl.g:3318:1: rule__Colprod__NameAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__Colprod__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3322:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3323:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3323:2: ( RULE_STRING )
            // InternalMyDsl.g:3324:3: RULE_STRING
            {
             before(grammarAccess.getColprodAccess().getNameSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getColprodAccess().getNameSTRINGTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Colprod__NameAssignment_1_0"


    // $ANTLR start "rule__Binexpr__LeftAssignment_1"
    // InternalMyDsl.g:3333:1: rule__Binexpr__LeftAssignment_1 : ( rulePrimaryExpression ) ;
    public final void rule__Binexpr__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3337:1: ( ( rulePrimaryExpression ) )
            // InternalMyDsl.g:3338:2: ( rulePrimaryExpression )
            {
            // InternalMyDsl.g:3338:2: ( rulePrimaryExpression )
            // InternalMyDsl.g:3339:3: rulePrimaryExpression
            {
             before(grammarAccess.getBinexprAccess().getLeftPrimaryExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getBinexprAccess().getLeftPrimaryExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Binexpr__LeftAssignment_1"


    // $ANTLR start "rule__Binexpr__OpAssignment_2"
    // InternalMyDsl.g:3348:1: rule__Binexpr__OpAssignment_2 : ( ruleOp ) ;
    public final void rule__Binexpr__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3352:1: ( ( ruleOp ) )
            // InternalMyDsl.g:3353:2: ( ruleOp )
            {
            // InternalMyDsl.g:3353:2: ( ruleOp )
            // InternalMyDsl.g:3354:3: ruleOp
            {
             before(grammarAccess.getBinexprAccess().getOpOpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOp();

            state._fsp--;

             after(grammarAccess.getBinexprAccess().getOpOpParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Binexpr__OpAssignment_2"


    // $ANTLR start "rule__Binexpr__RightAssignment_3"
    // InternalMyDsl.g:3363:1: rule__Binexpr__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__Binexpr__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3367:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:3368:2: ( ruleExpression )
            {
            // InternalMyDsl.g:3368:2: ( ruleExpression )
            // InternalMyDsl.g:3369:3: ruleExpression
            {
             before(grammarAccess.getBinexprAccess().getRightExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBinexprAccess().getRightExpressionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Binexpr__RightAssignment_3"


    // $ANTLR start "rule__NoneValue__ValueAssignment"
    // InternalMyDsl.g:3378:1: rule__NoneValue__ValueAssignment : ( ( 'None' ) ) ;
    public final void rule__NoneValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3382:1: ( ( ( 'None' ) ) )
            // InternalMyDsl.g:3383:2: ( ( 'None' ) )
            {
            // InternalMyDsl.g:3383:2: ( ( 'None' ) )
            // InternalMyDsl.g:3384:3: ( 'None' )
            {
             before(grammarAccess.getNoneValueAccess().getValueNoneKeyword_0()); 
            // InternalMyDsl.g:3385:3: ( 'None' )
            // InternalMyDsl.g:3386:4: 'None'
            {
             before(grammarAccess.getNoneValueAccess().getValueNoneKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getNoneValueAccess().getValueNoneKeyword_0()); 

            }

             after(grammarAccess.getNoneValueAccess().getValueNoneKeyword_0()); 

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
    // $ANTLR end "rule__NoneValue__ValueAssignment"


    // $ANTLR start "rule__IntValue__ValueAssignment"
    // InternalMyDsl.g:3397:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3401:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3402:2: ( RULE_INT )
            {
            // InternalMyDsl.g:3402:2: ( RULE_INT )
            // InternalMyDsl.g:3403:3: RULE_INT
            {
             before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__IntValue__ValueAssignment"


    // $ANTLR start "rule__StringValue__ValueAssignment"
    // InternalMyDsl.g:3412:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3416:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3417:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3417:2: ( RULE_STRING )
            // InternalMyDsl.g:3418:3: RULE_STRING
            {
             before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__StringValue__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000088002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000003FA40010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000003FA00012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001FC0000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000007C0000030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000007800L});

}