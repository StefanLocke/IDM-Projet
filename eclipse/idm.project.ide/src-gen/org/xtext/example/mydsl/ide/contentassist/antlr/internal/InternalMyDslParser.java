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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'Load('", "')'", "'{'", "'}'", "'Create()'", "';'", "'InsertCol('", "','", "'RemoveCol('", "'InsertLine('", "'RemoveLine('", "'Insert('", "'Print('", "'Store('", "'Export('", "'('", "'Selectcell('", "'Linesum('", "'Colsum('", "'Lineprod('", "'Colprod('", "'None'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_INT=4;
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
    // InternalMyDsl.g:212:1: ruleRemoveCol : ( ( rule__RemoveCol__Group__0 ) ) ;
    public final void ruleRemoveCol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__RemoveCol__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__RemoveCol__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__RemoveCol__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__RemoveCol__Group__0 )
            {
             before(grammarAccess.getRemoveColAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__RemoveCol__Group__0 )
            // InternalMyDsl.g:219:4: rule__RemoveCol__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RemoveCol__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRemoveColAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleMathExpression"
    // InternalMyDsl.g:403:1: entryRuleMathExpression : ruleMathExpression EOF ;
    public final void entryRuleMathExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleMathExpression EOF )
            // InternalMyDsl.g:405:1: ruleMathExpression EOF
            {
             before(grammarAccess.getMathExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleMathExpression();

            state._fsp--;

             after(grammarAccess.getMathExpressionRule()); 
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
    // $ANTLR end "entryRuleMathExpression"


    // $ANTLR start "ruleMathExpression"
    // InternalMyDsl.g:412:1: ruleMathExpression : ( ( rule__MathExpression__Alternatives ) ) ;
    public final void ruleMathExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__MathExpression__Alternatives ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__MathExpression__Alternatives ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__MathExpression__Alternatives ) )
            // InternalMyDsl.g:418:3: ( rule__MathExpression__Alternatives )
            {
             before(grammarAccess.getMathExpressionAccess().getAlternatives()); 
            // InternalMyDsl.g:419:3: ( rule__MathExpression__Alternatives )
            // InternalMyDsl.g:419:4: rule__MathExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MathExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMathExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMathExpression"


    // $ANTLR start "entryRuleBinaryExpression"
    // InternalMyDsl.g:428:1: entryRuleBinaryExpression : ruleBinaryExpression EOF ;
    public final void entryRuleBinaryExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleBinaryExpression EOF )
            // InternalMyDsl.g:430:1: ruleBinaryExpression EOF
            {
             before(grammarAccess.getBinaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleBinaryExpression();

            state._fsp--;

             after(grammarAccess.getBinaryExpressionRule()); 
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
    // $ANTLR end "entryRuleBinaryExpression"


    // $ANTLR start "ruleBinaryExpression"
    // InternalMyDsl.g:437:1: ruleBinaryExpression : ( ( rule__BinaryExpression__Group__0 ) ) ;
    public final void ruleBinaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__BinaryExpression__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__BinaryExpression__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__BinaryExpression__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__BinaryExpression__Group__0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__BinaryExpression__Group__0 )
            // InternalMyDsl.g:444:4: rule__BinaryExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryExpression"


    // $ANTLR start "entryRuleMathPrimaryExpression"
    // InternalMyDsl.g:453:1: entryRuleMathPrimaryExpression : ruleMathPrimaryExpression EOF ;
    public final void entryRuleMathPrimaryExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleMathPrimaryExpression EOF )
            // InternalMyDsl.g:455:1: ruleMathPrimaryExpression EOF
            {
             before(grammarAccess.getMathPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleMathPrimaryExpression();

            state._fsp--;

             after(grammarAccess.getMathPrimaryExpressionRule()); 
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
    // $ANTLR end "entryRuleMathPrimaryExpression"


    // $ANTLR start "ruleMathPrimaryExpression"
    // InternalMyDsl.g:462:1: ruleMathPrimaryExpression : ( ( rule__MathPrimaryExpression__Alternatives ) ) ;
    public final void ruleMathPrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__MathPrimaryExpression__Alternatives ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__MathPrimaryExpression__Alternatives ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__MathPrimaryExpression__Alternatives ) )
            // InternalMyDsl.g:468:3: ( rule__MathPrimaryExpression__Alternatives )
            {
             before(grammarAccess.getMathPrimaryExpressionAccess().getAlternatives()); 
            // InternalMyDsl.g:469:3: ( rule__MathPrimaryExpression__Alternatives )
            // InternalMyDsl.g:469:4: rule__MathPrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MathPrimaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMathPrimaryExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMathPrimaryExpression"


    // $ANTLR start "entryRuleSelectcell"
    // InternalMyDsl.g:478:1: entryRuleSelectcell : ruleSelectcell EOF ;
    public final void entryRuleSelectcell() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleSelectcell EOF )
            // InternalMyDsl.g:480:1: ruleSelectcell EOF
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
    // InternalMyDsl.g:487:1: ruleSelectcell : ( ( rule__Selectcell__Group__0 ) ) ;
    public final void ruleSelectcell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__Selectcell__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__Selectcell__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__Selectcell__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__Selectcell__Group__0 )
            {
             before(grammarAccess.getSelectcellAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__Selectcell__Group__0 )
            // InternalMyDsl.g:494:4: rule__Selectcell__Group__0
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
    // InternalMyDsl.g:503:1: entryRuleLinesum : ruleLinesum EOF ;
    public final void entryRuleLinesum() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleLinesum EOF )
            // InternalMyDsl.g:505:1: ruleLinesum EOF
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
    // InternalMyDsl.g:512:1: ruleLinesum : ( ( rule__Linesum__Group__0 ) ) ;
    public final void ruleLinesum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__Linesum__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__Linesum__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__Linesum__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__Linesum__Group__0 )
            {
             before(grammarAccess.getLinesumAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__Linesum__Group__0 )
            // InternalMyDsl.g:519:4: rule__Linesum__Group__0
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
    // InternalMyDsl.g:528:1: entryRuleColsum : ruleColsum EOF ;
    public final void entryRuleColsum() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleColsum EOF )
            // InternalMyDsl.g:530:1: ruleColsum EOF
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
    // InternalMyDsl.g:537:1: ruleColsum : ( ( rule__Colsum__Group__0 ) ) ;
    public final void ruleColsum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__Colsum__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__Colsum__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__Colsum__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__Colsum__Group__0 )
            {
             before(grammarAccess.getColsumAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__Colsum__Group__0 )
            // InternalMyDsl.g:544:4: rule__Colsum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Colsum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColsumAccess().getGroup()); 

            }


            }

        }
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
    // InternalMyDsl.g:553:1: entryRuleLineprod : ruleLineprod EOF ;
    public final void entryRuleLineprod() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleLineprod EOF )
            // InternalMyDsl.g:555:1: ruleLineprod EOF
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
    // InternalMyDsl.g:562:1: ruleLineprod : ( ( rule__Lineprod__Group__0 ) ) ;
    public final void ruleLineprod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__Lineprod__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__Lineprod__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__Lineprod__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__Lineprod__Group__0 )
            {
             before(grammarAccess.getLineprodAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__Lineprod__Group__0 )
            // InternalMyDsl.g:569:4: rule__Lineprod__Group__0
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
    // InternalMyDsl.g:578:1: entryRuleColprod : ruleColprod EOF ;
    public final void entryRuleColprod() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleColprod EOF )
            // InternalMyDsl.g:580:1: ruleColprod EOF
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
    // InternalMyDsl.g:587:1: ruleColprod : ( ( rule__Colprod__Group__0 ) ) ;
    public final void ruleColprod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__Colprod__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__Colprod__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__Colprod__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__Colprod__Group__0 )
            {
             before(grammarAccess.getColprodAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__Colprod__Group__0 )
            // InternalMyDsl.g:594:4: rule__Colprod__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Colprod__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColprodAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleOp"
    // InternalMyDsl.g:603:1: entryRuleOp : ruleOp EOF ;
    public final void entryRuleOp() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleOp EOF )
            // InternalMyDsl.g:605:1: ruleOp EOF
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
    // InternalMyDsl.g:612:1: ruleOp : ( ( rule__Op__Alternatives ) ) ;
    public final void ruleOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__Op__Alternatives ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__Op__Alternatives ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__Op__Alternatives ) )
            // InternalMyDsl.g:618:3: ( rule__Op__Alternatives )
            {
             before(grammarAccess.getOpAccess().getAlternatives()); 
            // InternalMyDsl.g:619:3: ( rule__Op__Alternatives )
            // InternalMyDsl.g:619:4: rule__Op__Alternatives
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
    // InternalMyDsl.g:628:1: entryRuleNoneValue : ruleNoneValue EOF ;
    public final void entryRuleNoneValue() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleNoneValue EOF )
            // InternalMyDsl.g:630:1: ruleNoneValue EOF
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
    // InternalMyDsl.g:637:1: ruleNoneValue : ( ( rule__NoneValue__ValueAssignment ) ) ;
    public final void ruleNoneValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__NoneValue__ValueAssignment ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__NoneValue__ValueAssignment ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__NoneValue__ValueAssignment ) )
            // InternalMyDsl.g:643:3: ( rule__NoneValue__ValueAssignment )
            {
             before(grammarAccess.getNoneValueAccess().getValueAssignment()); 
            // InternalMyDsl.g:644:3: ( rule__NoneValue__ValueAssignment )
            // InternalMyDsl.g:644:4: rule__NoneValue__ValueAssignment
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
    // InternalMyDsl.g:653:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleIntValue EOF )
            // InternalMyDsl.g:655:1: ruleIntValue EOF
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
    // InternalMyDsl.g:662:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__IntValue__ValueAssignment ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__IntValue__ValueAssignment ) )
            // InternalMyDsl.g:668:3: ( rule__IntValue__ValueAssignment )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            // InternalMyDsl.g:669:3: ( rule__IntValue__ValueAssignment )
            // InternalMyDsl.g:669:4: rule__IntValue__ValueAssignment
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
    // InternalMyDsl.g:678:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalMyDsl.g:679:1: ( ruleStringValue EOF )
            // InternalMyDsl.g:680:1: ruleStringValue EOF
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
    // InternalMyDsl.g:687:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalMyDsl.g:692:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalMyDsl.g:692:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalMyDsl.g:693:3: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // InternalMyDsl.g:694:3: ( rule__StringValue__ValueAssignment )
            // InternalMyDsl.g:694:4: rule__StringValue__ValueAssignment
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
    // InternalMyDsl.g:702:1: rule__Loadscope__Alternatives : ( ( ruleLoad ) | ( ruleCreate ) );
    public final void rule__Loadscope__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:706:1: ( ( ruleLoad ) | ( ruleCreate ) )
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
                    // InternalMyDsl.g:707:2: ( ruleLoad )
                    {
                    // InternalMyDsl.g:707:2: ( ruleLoad )
                    // InternalMyDsl.g:708:3: ruleLoad
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
                    // InternalMyDsl.g:713:2: ( ruleCreate )
                    {
                    // InternalMyDsl.g:713:2: ( ruleCreate )
                    // InternalMyDsl.g:714:3: ruleCreate
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
    // InternalMyDsl.g:723:1: rule__Instruction__Alternatives_0 : ( ( ruleInsertLine ) | ( ruleRemoveLine ) | ( ruleInsertCol ) | ( ruleRemoveCol ) | ( ruleInsert ) | ( ruleExportJSON ) | ( ruleExportCSV ) | ( rulePrint ) );
    public final void rule__Instruction__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:727:1: ( ( ruleInsertLine ) | ( ruleRemoveLine ) | ( ruleInsertCol ) | ( ruleRemoveCol ) | ( ruleInsert ) | ( ruleExportJSON ) | ( ruleExportCSV ) | ( rulePrint ) )
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
                    // InternalMyDsl.g:728:2: ( ruleInsertLine )
                    {
                    // InternalMyDsl.g:728:2: ( ruleInsertLine )
                    // InternalMyDsl.g:729:3: ruleInsertLine
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
                    // InternalMyDsl.g:734:2: ( ruleRemoveLine )
                    {
                    // InternalMyDsl.g:734:2: ( ruleRemoveLine )
                    // InternalMyDsl.g:735:3: ruleRemoveLine
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
                    // InternalMyDsl.g:740:2: ( ruleInsertCol )
                    {
                    // InternalMyDsl.g:740:2: ( ruleInsertCol )
                    // InternalMyDsl.g:741:3: ruleInsertCol
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
                    // InternalMyDsl.g:746:2: ( ruleRemoveCol )
                    {
                    // InternalMyDsl.g:746:2: ( ruleRemoveCol )
                    // InternalMyDsl.g:747:3: ruleRemoveCol
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
                    // InternalMyDsl.g:752:2: ( ruleInsert )
                    {
                    // InternalMyDsl.g:752:2: ( ruleInsert )
                    // InternalMyDsl.g:753:3: ruleInsert
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
                    // InternalMyDsl.g:758:2: ( ruleExportJSON )
                    {
                    // InternalMyDsl.g:758:2: ( ruleExportJSON )
                    // InternalMyDsl.g:759:3: ruleExportJSON
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
                    // InternalMyDsl.g:764:2: ( ruleExportCSV )
                    {
                    // InternalMyDsl.g:764:2: ( ruleExportCSV )
                    // InternalMyDsl.g:765:3: ruleExportCSV
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
                    // InternalMyDsl.g:770:2: ( rulePrint )
                    {
                    // InternalMyDsl.g:770:2: ( rulePrint )
                    // InternalMyDsl.g:771:3: rulePrint
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


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalMyDsl.g:780:1: rule__Expression__Alternatives : ( ( ruleMathPrimaryExpression ) | ( ruleBinaryExpression ) | ( ruleNoneValue ) | ( ruleStringValue ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:784:1: ( ( ruleMathPrimaryExpression ) | ( ruleBinaryExpression ) | ( ruleNoneValue ) | ( ruleStringValue ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                {
                alt4=1;
                }
                break;
            case 30:
                {
                alt4=2;
                }
                break;
            case 36:
                {
                alt4=3;
                }
                break;
            case RULE_STRING:
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
                    // InternalMyDsl.g:785:2: ( ruleMathPrimaryExpression )
                    {
                    // InternalMyDsl.g:785:2: ( ruleMathPrimaryExpression )
                    // InternalMyDsl.g:786:3: ruleMathPrimaryExpression
                    {
                     before(grammarAccess.getExpressionAccess().getMathPrimaryExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMathPrimaryExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getMathPrimaryExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:791:2: ( ruleBinaryExpression )
                    {
                    // InternalMyDsl.g:791:2: ( ruleBinaryExpression )
                    // InternalMyDsl.g:792:3: ruleBinaryExpression
                    {
                     before(grammarAccess.getExpressionAccess().getBinaryExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBinaryExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getBinaryExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:797:2: ( ruleNoneValue )
                    {
                    // InternalMyDsl.g:797:2: ( ruleNoneValue )
                    // InternalMyDsl.g:798:3: ruleNoneValue
                    {
                     before(grammarAccess.getExpressionAccess().getNoneValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNoneValue();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getNoneValueParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:803:2: ( ruleStringValue )
                    {
                    // InternalMyDsl.g:803:2: ( ruleStringValue )
                    // InternalMyDsl.g:804:3: ruleStringValue
                    {
                     before(grammarAccess.getExpressionAccess().getStringValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getStringValueParserRuleCall_3()); 

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


    // $ANTLR start "rule__MathExpression__Alternatives"
    // InternalMyDsl.g:813:1: rule__MathExpression__Alternatives : ( ( ruleMathPrimaryExpression ) | ( ruleBinaryExpression ) );
    public final void rule__MathExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:817:1: ( ( ruleMathPrimaryExpression ) | ( ruleBinaryExpression ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT||(LA5_0>=31 && LA5_0<=35)) ) {
                alt5=1;
            }
            else if ( (LA5_0==30) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:818:2: ( ruleMathPrimaryExpression )
                    {
                    // InternalMyDsl.g:818:2: ( ruleMathPrimaryExpression )
                    // InternalMyDsl.g:819:3: ruleMathPrimaryExpression
                    {
                     before(grammarAccess.getMathExpressionAccess().getMathPrimaryExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMathPrimaryExpression();

                    state._fsp--;

                     after(grammarAccess.getMathExpressionAccess().getMathPrimaryExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:824:2: ( ruleBinaryExpression )
                    {
                    // InternalMyDsl.g:824:2: ( ruleBinaryExpression )
                    // InternalMyDsl.g:825:3: ruleBinaryExpression
                    {
                     before(grammarAccess.getMathExpressionAccess().getBinaryExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBinaryExpression();

                    state._fsp--;

                     after(grammarAccess.getMathExpressionAccess().getBinaryExpressionParserRuleCall_1()); 

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
    // $ANTLR end "rule__MathExpression__Alternatives"


    // $ANTLR start "rule__MathPrimaryExpression__Alternatives"
    // InternalMyDsl.g:834:1: rule__MathPrimaryExpression__Alternatives : ( ( ruleIntValue ) | ( ruleSelectcell ) | ( ruleLinesum ) | ( ruleColsum ) | ( ruleLineprod ) | ( ruleColprod ) );
    public final void rule__MathPrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:838:1: ( ( ruleIntValue ) | ( ruleSelectcell ) | ( ruleLinesum ) | ( ruleColsum ) | ( ruleLineprod ) | ( ruleColprod ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt6=1;
                }
                break;
            case 31:
                {
                alt6=2;
                }
                break;
            case 32:
                {
                alt6=3;
                }
                break;
            case 33:
                {
                alt6=4;
                }
                break;
            case 34:
                {
                alt6=5;
                }
                break;
            case 35:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:839:2: ( ruleIntValue )
                    {
                    // InternalMyDsl.g:839:2: ( ruleIntValue )
                    // InternalMyDsl.g:840:3: ruleIntValue
                    {
                     before(grammarAccess.getMathPrimaryExpressionAccess().getIntValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntValue();

                    state._fsp--;

                     after(grammarAccess.getMathPrimaryExpressionAccess().getIntValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:845:2: ( ruleSelectcell )
                    {
                    // InternalMyDsl.g:845:2: ( ruleSelectcell )
                    // InternalMyDsl.g:846:3: ruleSelectcell
                    {
                     before(grammarAccess.getMathPrimaryExpressionAccess().getSelectcellParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSelectcell();

                    state._fsp--;

                     after(grammarAccess.getMathPrimaryExpressionAccess().getSelectcellParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:851:2: ( ruleLinesum )
                    {
                    // InternalMyDsl.g:851:2: ( ruleLinesum )
                    // InternalMyDsl.g:852:3: ruleLinesum
                    {
                     before(grammarAccess.getMathPrimaryExpressionAccess().getLinesumParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLinesum();

                    state._fsp--;

                     after(grammarAccess.getMathPrimaryExpressionAccess().getLinesumParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:857:2: ( ruleColsum )
                    {
                    // InternalMyDsl.g:857:2: ( ruleColsum )
                    // InternalMyDsl.g:858:3: ruleColsum
                    {
                     before(grammarAccess.getMathPrimaryExpressionAccess().getColsumParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleColsum();

                    state._fsp--;

                     after(grammarAccess.getMathPrimaryExpressionAccess().getColsumParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:863:2: ( ruleLineprod )
                    {
                    // InternalMyDsl.g:863:2: ( ruleLineprod )
                    // InternalMyDsl.g:864:3: ruleLineprod
                    {
                     before(grammarAccess.getMathPrimaryExpressionAccess().getLineprodParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleLineprod();

                    state._fsp--;

                     after(grammarAccess.getMathPrimaryExpressionAccess().getLineprodParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:869:2: ( ruleColprod )
                    {
                    // InternalMyDsl.g:869:2: ( ruleColprod )
                    // InternalMyDsl.g:870:3: ruleColprod
                    {
                     before(grammarAccess.getMathPrimaryExpressionAccess().getColprodParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleColprod();

                    state._fsp--;

                     after(grammarAccess.getMathPrimaryExpressionAccess().getColprodParserRuleCall_5()); 

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
    // $ANTLR end "rule__MathPrimaryExpression__Alternatives"


    // $ANTLR start "rule__Op__Alternatives"
    // InternalMyDsl.g:879:1: rule__Op__Alternatives : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) );
    public final void rule__Op__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:883:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt7=1;
                }
                break;
            case 12:
                {
                alt7=2;
                }
                break;
            case 13:
                {
                alt7=3;
                }
                break;
            case 14:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:884:2: ( '+' )
                    {
                    // InternalMyDsl.g:884:2: ( '+' )
                    // InternalMyDsl.g:885:3: '+'
                    {
                     before(grammarAccess.getOpAccess().getPlusSignKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:890:2: ( '-' )
                    {
                    // InternalMyDsl.g:890:2: ( '-' )
                    // InternalMyDsl.g:891:3: '-'
                    {
                     before(grammarAccess.getOpAccess().getHyphenMinusKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:896:2: ( '*' )
                    {
                    // InternalMyDsl.g:896:2: ( '*' )
                    // InternalMyDsl.g:897:3: '*'
                    {
                     before(grammarAccess.getOpAccess().getAsteriskKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getAsteriskKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:902:2: ( '/' )
                    {
                    // InternalMyDsl.g:902:2: ( '/' )
                    // InternalMyDsl.g:903:3: '/'
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
    // InternalMyDsl.g:912:1: rule__Load__Group__0 : rule__Load__Group__0__Impl rule__Load__Group__1 ;
    public final void rule__Load__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:916:1: ( rule__Load__Group__0__Impl rule__Load__Group__1 )
            // InternalMyDsl.g:917:2: rule__Load__Group__0__Impl rule__Load__Group__1
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
    // InternalMyDsl.g:924:1: rule__Load__Group__0__Impl : ( 'Load(' ) ;
    public final void rule__Load__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:928:1: ( ( 'Load(' ) )
            // InternalMyDsl.g:929:1: ( 'Load(' )
            {
            // InternalMyDsl.g:929:1: ( 'Load(' )
            // InternalMyDsl.g:930:2: 'Load('
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
    // InternalMyDsl.g:939:1: rule__Load__Group__1 : rule__Load__Group__1__Impl rule__Load__Group__2 ;
    public final void rule__Load__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:943:1: ( rule__Load__Group__1__Impl rule__Load__Group__2 )
            // InternalMyDsl.g:944:2: rule__Load__Group__1__Impl rule__Load__Group__2
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
    // InternalMyDsl.g:951:1: rule__Load__Group__1__Impl : ( ( rule__Load__PathAssignment_1 ) ) ;
    public final void rule__Load__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:955:1: ( ( ( rule__Load__PathAssignment_1 ) ) )
            // InternalMyDsl.g:956:1: ( ( rule__Load__PathAssignment_1 ) )
            {
            // InternalMyDsl.g:956:1: ( ( rule__Load__PathAssignment_1 ) )
            // InternalMyDsl.g:957:2: ( rule__Load__PathAssignment_1 )
            {
             before(grammarAccess.getLoadAccess().getPathAssignment_1()); 
            // InternalMyDsl.g:958:2: ( rule__Load__PathAssignment_1 )
            // InternalMyDsl.g:958:3: rule__Load__PathAssignment_1
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
    // InternalMyDsl.g:966:1: rule__Load__Group__2 : rule__Load__Group__2__Impl rule__Load__Group__3 ;
    public final void rule__Load__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:970:1: ( rule__Load__Group__2__Impl rule__Load__Group__3 )
            // InternalMyDsl.g:971:2: rule__Load__Group__2__Impl rule__Load__Group__3
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
    // InternalMyDsl.g:978:1: rule__Load__Group__2__Impl : ( ')' ) ;
    public final void rule__Load__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:982:1: ( ( ')' ) )
            // InternalMyDsl.g:983:1: ( ')' )
            {
            // InternalMyDsl.g:983:1: ( ')' )
            // InternalMyDsl.g:984:2: ')'
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
    // InternalMyDsl.g:993:1: rule__Load__Group__3 : rule__Load__Group__3__Impl rule__Load__Group__4 ;
    public final void rule__Load__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:997:1: ( rule__Load__Group__3__Impl rule__Load__Group__4 )
            // InternalMyDsl.g:998:2: rule__Load__Group__3__Impl rule__Load__Group__4
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
    // InternalMyDsl.g:1005:1: rule__Load__Group__3__Impl : ( '{' ) ;
    public final void rule__Load__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1009:1: ( ( '{' ) )
            // InternalMyDsl.g:1010:1: ( '{' )
            {
            // InternalMyDsl.g:1010:1: ( '{' )
            // InternalMyDsl.g:1011:2: '{'
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
    // InternalMyDsl.g:1020:1: rule__Load__Group__4 : rule__Load__Group__4__Impl rule__Load__Group__5 ;
    public final void rule__Load__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1024:1: ( rule__Load__Group__4__Impl rule__Load__Group__5 )
            // InternalMyDsl.g:1025:2: rule__Load__Group__4__Impl rule__Load__Group__5
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
    // InternalMyDsl.g:1032:1: rule__Load__Group__4__Impl : ( ( rule__Load__InstructionsAssignment_4 )* ) ;
    public final void rule__Load__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1036:1: ( ( ( rule__Load__InstructionsAssignment_4 )* ) )
            // InternalMyDsl.g:1037:1: ( ( rule__Load__InstructionsAssignment_4 )* )
            {
            // InternalMyDsl.g:1037:1: ( ( rule__Load__InstructionsAssignment_4 )* )
            // InternalMyDsl.g:1038:2: ( rule__Load__InstructionsAssignment_4 )*
            {
             before(grammarAccess.getLoadAccess().getInstructionsAssignment_4()); 
            // InternalMyDsl.g:1039:2: ( rule__Load__InstructionsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21||(LA8_0>=23 && LA8_0<=29)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1039:3: rule__Load__InstructionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Load__InstructionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalMyDsl.g:1047:1: rule__Load__Group__5 : rule__Load__Group__5__Impl ;
    public final void rule__Load__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1051:1: ( rule__Load__Group__5__Impl )
            // InternalMyDsl.g:1052:2: rule__Load__Group__5__Impl
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
    // InternalMyDsl.g:1058:1: rule__Load__Group__5__Impl : ( '}' ) ;
    public final void rule__Load__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1062:1: ( ( '}' ) )
            // InternalMyDsl.g:1063:1: ( '}' )
            {
            // InternalMyDsl.g:1063:1: ( '}' )
            // InternalMyDsl.g:1064:2: '}'
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
    // InternalMyDsl.g:1074:1: rule__Create__Group__0 : rule__Create__Group__0__Impl rule__Create__Group__1 ;
    public final void rule__Create__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1078:1: ( rule__Create__Group__0__Impl rule__Create__Group__1 )
            // InternalMyDsl.g:1079:2: rule__Create__Group__0__Impl rule__Create__Group__1
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
    // InternalMyDsl.g:1086:1: rule__Create__Group__0__Impl : ( 'Create()' ) ;
    public final void rule__Create__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1090:1: ( ( 'Create()' ) )
            // InternalMyDsl.g:1091:1: ( 'Create()' )
            {
            // InternalMyDsl.g:1091:1: ( 'Create()' )
            // InternalMyDsl.g:1092:2: 'Create()'
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
    // InternalMyDsl.g:1101:1: rule__Create__Group__1 : rule__Create__Group__1__Impl rule__Create__Group__2 ;
    public final void rule__Create__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1105:1: ( rule__Create__Group__1__Impl rule__Create__Group__2 )
            // InternalMyDsl.g:1106:2: rule__Create__Group__1__Impl rule__Create__Group__2
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
    // InternalMyDsl.g:1113:1: rule__Create__Group__1__Impl : ( '{' ) ;
    public final void rule__Create__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1117:1: ( ( '{' ) )
            // InternalMyDsl.g:1118:1: ( '{' )
            {
            // InternalMyDsl.g:1118:1: ( '{' )
            // InternalMyDsl.g:1119:2: '{'
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
    // InternalMyDsl.g:1128:1: rule__Create__Group__2 : rule__Create__Group__2__Impl rule__Create__Group__3 ;
    public final void rule__Create__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1132:1: ( rule__Create__Group__2__Impl rule__Create__Group__3 )
            // InternalMyDsl.g:1133:2: rule__Create__Group__2__Impl rule__Create__Group__3
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
    // InternalMyDsl.g:1140:1: rule__Create__Group__2__Impl : ( ( rule__Create__InstructionsAssignment_2 )* ) ;
    public final void rule__Create__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1144:1: ( ( ( rule__Create__InstructionsAssignment_2 )* ) )
            // InternalMyDsl.g:1145:1: ( ( rule__Create__InstructionsAssignment_2 )* )
            {
            // InternalMyDsl.g:1145:1: ( ( rule__Create__InstructionsAssignment_2 )* )
            // InternalMyDsl.g:1146:2: ( rule__Create__InstructionsAssignment_2 )*
            {
             before(grammarAccess.getCreateAccess().getInstructionsAssignment_2()); 
            // InternalMyDsl.g:1147:2: ( rule__Create__InstructionsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21||(LA9_0>=23 && LA9_0<=29)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1147:3: rule__Create__InstructionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Create__InstructionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalMyDsl.g:1155:1: rule__Create__Group__3 : rule__Create__Group__3__Impl ;
    public final void rule__Create__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1159:1: ( rule__Create__Group__3__Impl )
            // InternalMyDsl.g:1160:2: rule__Create__Group__3__Impl
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
    // InternalMyDsl.g:1166:1: rule__Create__Group__3__Impl : ( '}' ) ;
    public final void rule__Create__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1170:1: ( ( '}' ) )
            // InternalMyDsl.g:1171:1: ( '}' )
            {
            // InternalMyDsl.g:1171:1: ( '}' )
            // InternalMyDsl.g:1172:2: '}'
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
    // InternalMyDsl.g:1182:1: rule__Instruction__Group__0 : rule__Instruction__Group__0__Impl rule__Instruction__Group__1 ;
    public final void rule__Instruction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1186:1: ( rule__Instruction__Group__0__Impl rule__Instruction__Group__1 )
            // InternalMyDsl.g:1187:2: rule__Instruction__Group__0__Impl rule__Instruction__Group__1
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
    // InternalMyDsl.g:1194:1: rule__Instruction__Group__0__Impl : ( ( rule__Instruction__Alternatives_0 ) ) ;
    public final void rule__Instruction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1198:1: ( ( ( rule__Instruction__Alternatives_0 ) ) )
            // InternalMyDsl.g:1199:1: ( ( rule__Instruction__Alternatives_0 ) )
            {
            // InternalMyDsl.g:1199:1: ( ( rule__Instruction__Alternatives_0 ) )
            // InternalMyDsl.g:1200:2: ( rule__Instruction__Alternatives_0 )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives_0()); 
            // InternalMyDsl.g:1201:2: ( rule__Instruction__Alternatives_0 )
            // InternalMyDsl.g:1201:3: rule__Instruction__Alternatives_0
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
    // InternalMyDsl.g:1209:1: rule__Instruction__Group__1 : rule__Instruction__Group__1__Impl ;
    public final void rule__Instruction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1213:1: ( rule__Instruction__Group__1__Impl )
            // InternalMyDsl.g:1214:2: rule__Instruction__Group__1__Impl
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
    // InternalMyDsl.g:1220:1: rule__Instruction__Group__1__Impl : ( ';' ) ;
    public final void rule__Instruction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1224:1: ( ( ';' ) )
            // InternalMyDsl.g:1225:1: ( ';' )
            {
            // InternalMyDsl.g:1225:1: ( ';' )
            // InternalMyDsl.g:1226:2: ';'
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
    // InternalMyDsl.g:1236:1: rule__InsertCol__Group__0 : rule__InsertCol__Group__0__Impl rule__InsertCol__Group__1 ;
    public final void rule__InsertCol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1240:1: ( rule__InsertCol__Group__0__Impl rule__InsertCol__Group__1 )
            // InternalMyDsl.g:1241:2: rule__InsertCol__Group__0__Impl rule__InsertCol__Group__1
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
    // InternalMyDsl.g:1248:1: rule__InsertCol__Group__0__Impl : ( 'InsertCol(' ) ;
    public final void rule__InsertCol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1252:1: ( ( 'InsertCol(' ) )
            // InternalMyDsl.g:1253:1: ( 'InsertCol(' )
            {
            // InternalMyDsl.g:1253:1: ( 'InsertCol(' )
            // InternalMyDsl.g:1254:2: 'InsertCol('
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
    // InternalMyDsl.g:1263:1: rule__InsertCol__Group__1 : rule__InsertCol__Group__1__Impl rule__InsertCol__Group__2 ;
    public final void rule__InsertCol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1267:1: ( rule__InsertCol__Group__1__Impl rule__InsertCol__Group__2 )
            // InternalMyDsl.g:1268:2: rule__InsertCol__Group__1__Impl rule__InsertCol__Group__2
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
    // InternalMyDsl.g:1275:1: rule__InsertCol__Group__1__Impl : ( ( rule__InsertCol__ColIndexAssignment_1 ) ) ;
    public final void rule__InsertCol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1279:1: ( ( ( rule__InsertCol__ColIndexAssignment_1 ) ) )
            // InternalMyDsl.g:1280:1: ( ( rule__InsertCol__ColIndexAssignment_1 ) )
            {
            // InternalMyDsl.g:1280:1: ( ( rule__InsertCol__ColIndexAssignment_1 ) )
            // InternalMyDsl.g:1281:2: ( rule__InsertCol__ColIndexAssignment_1 )
            {
             before(grammarAccess.getInsertColAccess().getColIndexAssignment_1()); 
            // InternalMyDsl.g:1282:2: ( rule__InsertCol__ColIndexAssignment_1 )
            // InternalMyDsl.g:1282:3: rule__InsertCol__ColIndexAssignment_1
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
    // InternalMyDsl.g:1290:1: rule__InsertCol__Group__2 : rule__InsertCol__Group__2__Impl rule__InsertCol__Group__3 ;
    public final void rule__InsertCol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1294:1: ( rule__InsertCol__Group__2__Impl rule__InsertCol__Group__3 )
            // InternalMyDsl.g:1295:2: rule__InsertCol__Group__2__Impl rule__InsertCol__Group__3
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
    // InternalMyDsl.g:1302:1: rule__InsertCol__Group__2__Impl : ( ',' ) ;
    public final void rule__InsertCol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1306:1: ( ( ',' ) )
            // InternalMyDsl.g:1307:1: ( ',' )
            {
            // InternalMyDsl.g:1307:1: ( ',' )
            // InternalMyDsl.g:1308:2: ','
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
    // InternalMyDsl.g:1317:1: rule__InsertCol__Group__3 : rule__InsertCol__Group__3__Impl rule__InsertCol__Group__4 ;
    public final void rule__InsertCol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1321:1: ( rule__InsertCol__Group__3__Impl rule__InsertCol__Group__4 )
            // InternalMyDsl.g:1322:2: rule__InsertCol__Group__3__Impl rule__InsertCol__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:1329:1: rule__InsertCol__Group__3__Impl : ( ( rule__InsertCol__ColNameAssignment_3 ) ) ;
    public final void rule__InsertCol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1333:1: ( ( ( rule__InsertCol__ColNameAssignment_3 ) ) )
            // InternalMyDsl.g:1334:1: ( ( rule__InsertCol__ColNameAssignment_3 ) )
            {
            // InternalMyDsl.g:1334:1: ( ( rule__InsertCol__ColNameAssignment_3 ) )
            // InternalMyDsl.g:1335:2: ( rule__InsertCol__ColNameAssignment_3 )
            {
             before(grammarAccess.getInsertColAccess().getColNameAssignment_3()); 
            // InternalMyDsl.g:1336:2: ( rule__InsertCol__ColNameAssignment_3 )
            // InternalMyDsl.g:1336:3: rule__InsertCol__ColNameAssignment_3
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
    // InternalMyDsl.g:1344:1: rule__InsertCol__Group__4 : rule__InsertCol__Group__4__Impl ;
    public final void rule__InsertCol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1348:1: ( rule__InsertCol__Group__4__Impl )
            // InternalMyDsl.g:1349:2: rule__InsertCol__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InsertCol__Group__4__Impl();

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
    // InternalMyDsl.g:1355:1: rule__InsertCol__Group__4__Impl : ( ')' ) ;
    public final void rule__InsertCol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1359:1: ( ( ')' ) )
            // InternalMyDsl.g:1360:1: ( ')' )
            {
            // InternalMyDsl.g:1360:1: ( ')' )
            // InternalMyDsl.g:1361:2: ')'
            {
             before(grammarAccess.getInsertColAccess().getRightParenthesisKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getInsertColAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__RemoveCol__Group__0"
    // InternalMyDsl.g:1371:1: rule__RemoveCol__Group__0 : rule__RemoveCol__Group__0__Impl rule__RemoveCol__Group__1 ;
    public final void rule__RemoveCol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1375:1: ( rule__RemoveCol__Group__0__Impl rule__RemoveCol__Group__1 )
            // InternalMyDsl.g:1376:2: rule__RemoveCol__Group__0__Impl rule__RemoveCol__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__RemoveCol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RemoveCol__Group__1();

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
    // $ANTLR end "rule__RemoveCol__Group__0"


    // $ANTLR start "rule__RemoveCol__Group__0__Impl"
    // InternalMyDsl.g:1383:1: rule__RemoveCol__Group__0__Impl : ( 'RemoveCol(' ) ;
    public final void rule__RemoveCol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1387:1: ( ( 'RemoveCol(' ) )
            // InternalMyDsl.g:1388:1: ( 'RemoveCol(' )
            {
            // InternalMyDsl.g:1388:1: ( 'RemoveCol(' )
            // InternalMyDsl.g:1389:2: 'RemoveCol('
            {
             before(grammarAccess.getRemoveColAccess().getRemoveColKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRemoveColAccess().getRemoveColKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveCol__Group__0__Impl"


    // $ANTLR start "rule__RemoveCol__Group__1"
    // InternalMyDsl.g:1398:1: rule__RemoveCol__Group__1 : rule__RemoveCol__Group__1__Impl rule__RemoveCol__Group__2 ;
    public final void rule__RemoveCol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1402:1: ( rule__RemoveCol__Group__1__Impl rule__RemoveCol__Group__2 )
            // InternalMyDsl.g:1403:2: rule__RemoveCol__Group__1__Impl rule__RemoveCol__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__RemoveCol__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RemoveCol__Group__2();

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
    // $ANTLR end "rule__RemoveCol__Group__1"


    // $ANTLR start "rule__RemoveCol__Group__1__Impl"
    // InternalMyDsl.g:1410:1: rule__RemoveCol__Group__1__Impl : ( ( rule__RemoveCol__ColNameAssignment_1 ) ) ;
    public final void rule__RemoveCol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1414:1: ( ( ( rule__RemoveCol__ColNameAssignment_1 ) ) )
            // InternalMyDsl.g:1415:1: ( ( rule__RemoveCol__ColNameAssignment_1 ) )
            {
            // InternalMyDsl.g:1415:1: ( ( rule__RemoveCol__ColNameAssignment_1 ) )
            // InternalMyDsl.g:1416:2: ( rule__RemoveCol__ColNameAssignment_1 )
            {
             before(grammarAccess.getRemoveColAccess().getColNameAssignment_1()); 
            // InternalMyDsl.g:1417:2: ( rule__RemoveCol__ColNameAssignment_1 )
            // InternalMyDsl.g:1417:3: rule__RemoveCol__ColNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RemoveCol__ColNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRemoveColAccess().getColNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveCol__Group__1__Impl"


    // $ANTLR start "rule__RemoveCol__Group__2"
    // InternalMyDsl.g:1425:1: rule__RemoveCol__Group__2 : rule__RemoveCol__Group__2__Impl ;
    public final void rule__RemoveCol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1429:1: ( rule__RemoveCol__Group__2__Impl )
            // InternalMyDsl.g:1430:2: rule__RemoveCol__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RemoveCol__Group__2__Impl();

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
    // $ANTLR end "rule__RemoveCol__Group__2"


    // $ANTLR start "rule__RemoveCol__Group__2__Impl"
    // InternalMyDsl.g:1436:1: rule__RemoveCol__Group__2__Impl : ( ')' ) ;
    public final void rule__RemoveCol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1440:1: ( ( ')' ) )
            // InternalMyDsl.g:1441:1: ( ')' )
            {
            // InternalMyDsl.g:1441:1: ( ')' )
            // InternalMyDsl.g:1442:2: ')'
            {
             before(grammarAccess.getRemoveColAccess().getRightParenthesisKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRemoveColAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveCol__Group__2__Impl"


    // $ANTLR start "rule__InsertLine__Group__0"
    // InternalMyDsl.g:1452:1: rule__InsertLine__Group__0 : rule__InsertLine__Group__0__Impl rule__InsertLine__Group__1 ;
    public final void rule__InsertLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1456:1: ( rule__InsertLine__Group__0__Impl rule__InsertLine__Group__1 )
            // InternalMyDsl.g:1457:2: rule__InsertLine__Group__0__Impl rule__InsertLine__Group__1
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
    // InternalMyDsl.g:1464:1: rule__InsertLine__Group__0__Impl : ( 'InsertLine(' ) ;
    public final void rule__InsertLine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1468:1: ( ( 'InsertLine(' ) )
            // InternalMyDsl.g:1469:1: ( 'InsertLine(' )
            {
            // InternalMyDsl.g:1469:1: ( 'InsertLine(' )
            // InternalMyDsl.g:1470:2: 'InsertLine('
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
    // InternalMyDsl.g:1479:1: rule__InsertLine__Group__1 : rule__InsertLine__Group__1__Impl rule__InsertLine__Group__2 ;
    public final void rule__InsertLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1483:1: ( rule__InsertLine__Group__1__Impl rule__InsertLine__Group__2 )
            // InternalMyDsl.g:1484:2: rule__InsertLine__Group__1__Impl rule__InsertLine__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:1491:1: rule__InsertLine__Group__1__Impl : ( ( rule__InsertLine__LineIndexAssignment_1 ) ) ;
    public final void rule__InsertLine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1495:1: ( ( ( rule__InsertLine__LineIndexAssignment_1 ) ) )
            // InternalMyDsl.g:1496:1: ( ( rule__InsertLine__LineIndexAssignment_1 ) )
            {
            // InternalMyDsl.g:1496:1: ( ( rule__InsertLine__LineIndexAssignment_1 ) )
            // InternalMyDsl.g:1497:2: ( rule__InsertLine__LineIndexAssignment_1 )
            {
             before(grammarAccess.getInsertLineAccess().getLineIndexAssignment_1()); 
            // InternalMyDsl.g:1498:2: ( rule__InsertLine__LineIndexAssignment_1 )
            // InternalMyDsl.g:1498:3: rule__InsertLine__LineIndexAssignment_1
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
    // InternalMyDsl.g:1506:1: rule__InsertLine__Group__2 : rule__InsertLine__Group__2__Impl ;
    public final void rule__InsertLine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1510:1: ( rule__InsertLine__Group__2__Impl )
            // InternalMyDsl.g:1511:2: rule__InsertLine__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InsertLine__Group__2__Impl();

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
    // InternalMyDsl.g:1517:1: rule__InsertLine__Group__2__Impl : ( ')' ) ;
    public final void rule__InsertLine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1521:1: ( ( ')' ) )
            // InternalMyDsl.g:1522:1: ( ')' )
            {
            // InternalMyDsl.g:1522:1: ( ')' )
            // InternalMyDsl.g:1523:2: ')'
            {
             before(grammarAccess.getInsertLineAccess().getRightParenthesisKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getInsertLineAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__RemoveLine__Group__0"
    // InternalMyDsl.g:1533:1: rule__RemoveLine__Group__0 : rule__RemoveLine__Group__0__Impl rule__RemoveLine__Group__1 ;
    public final void rule__RemoveLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1537:1: ( rule__RemoveLine__Group__0__Impl rule__RemoveLine__Group__1 )
            // InternalMyDsl.g:1538:2: rule__RemoveLine__Group__0__Impl rule__RemoveLine__Group__1
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
    // InternalMyDsl.g:1545:1: rule__RemoveLine__Group__0__Impl : ( 'RemoveLine(' ) ;
    public final void rule__RemoveLine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1549:1: ( ( 'RemoveLine(' ) )
            // InternalMyDsl.g:1550:1: ( 'RemoveLine(' )
            {
            // InternalMyDsl.g:1550:1: ( 'RemoveLine(' )
            // InternalMyDsl.g:1551:2: 'RemoveLine('
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
    // InternalMyDsl.g:1560:1: rule__RemoveLine__Group__1 : rule__RemoveLine__Group__1__Impl rule__RemoveLine__Group__2 ;
    public final void rule__RemoveLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1564:1: ( rule__RemoveLine__Group__1__Impl rule__RemoveLine__Group__2 )
            // InternalMyDsl.g:1565:2: rule__RemoveLine__Group__1__Impl rule__RemoveLine__Group__2
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
    // InternalMyDsl.g:1572:1: rule__RemoveLine__Group__1__Impl : ( ( rule__RemoveLine__LineIndexAssignment_1 ) ) ;
    public final void rule__RemoveLine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1576:1: ( ( ( rule__RemoveLine__LineIndexAssignment_1 ) ) )
            // InternalMyDsl.g:1577:1: ( ( rule__RemoveLine__LineIndexAssignment_1 ) )
            {
            // InternalMyDsl.g:1577:1: ( ( rule__RemoveLine__LineIndexAssignment_1 ) )
            // InternalMyDsl.g:1578:2: ( rule__RemoveLine__LineIndexAssignment_1 )
            {
             before(grammarAccess.getRemoveLineAccess().getLineIndexAssignment_1()); 
            // InternalMyDsl.g:1579:2: ( rule__RemoveLine__LineIndexAssignment_1 )
            // InternalMyDsl.g:1579:3: rule__RemoveLine__LineIndexAssignment_1
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
    // InternalMyDsl.g:1587:1: rule__RemoveLine__Group__2 : rule__RemoveLine__Group__2__Impl ;
    public final void rule__RemoveLine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1591:1: ( rule__RemoveLine__Group__2__Impl )
            // InternalMyDsl.g:1592:2: rule__RemoveLine__Group__2__Impl
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
    // InternalMyDsl.g:1598:1: rule__RemoveLine__Group__2__Impl : ( ')' ) ;
    public final void rule__RemoveLine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1602:1: ( ( ')' ) )
            // InternalMyDsl.g:1603:1: ( ')' )
            {
            // InternalMyDsl.g:1603:1: ( ')' )
            // InternalMyDsl.g:1604:2: ')'
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
    // InternalMyDsl.g:1614:1: rule__Insert__Group__0 : rule__Insert__Group__0__Impl rule__Insert__Group__1 ;
    public final void rule__Insert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1618:1: ( rule__Insert__Group__0__Impl rule__Insert__Group__1 )
            // InternalMyDsl.g:1619:2: rule__Insert__Group__0__Impl rule__Insert__Group__1
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
    // InternalMyDsl.g:1626:1: rule__Insert__Group__0__Impl : ( 'Insert(' ) ;
    public final void rule__Insert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1630:1: ( ( 'Insert(' ) )
            // InternalMyDsl.g:1631:1: ( 'Insert(' )
            {
            // InternalMyDsl.g:1631:1: ( 'Insert(' )
            // InternalMyDsl.g:1632:2: 'Insert('
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
    // InternalMyDsl.g:1641:1: rule__Insert__Group__1 : rule__Insert__Group__1__Impl rule__Insert__Group__2 ;
    public final void rule__Insert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1645:1: ( rule__Insert__Group__1__Impl rule__Insert__Group__2 )
            // InternalMyDsl.g:1646:2: rule__Insert__Group__1__Impl rule__Insert__Group__2
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
    // InternalMyDsl.g:1653:1: rule__Insert__Group__1__Impl : ( ( rule__Insert__LineIndexAssignment_1 ) ) ;
    public final void rule__Insert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1657:1: ( ( ( rule__Insert__LineIndexAssignment_1 ) ) )
            // InternalMyDsl.g:1658:1: ( ( rule__Insert__LineIndexAssignment_1 ) )
            {
            // InternalMyDsl.g:1658:1: ( ( rule__Insert__LineIndexAssignment_1 ) )
            // InternalMyDsl.g:1659:2: ( rule__Insert__LineIndexAssignment_1 )
            {
             before(grammarAccess.getInsertAccess().getLineIndexAssignment_1()); 
            // InternalMyDsl.g:1660:2: ( rule__Insert__LineIndexAssignment_1 )
            // InternalMyDsl.g:1660:3: rule__Insert__LineIndexAssignment_1
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
    // InternalMyDsl.g:1668:1: rule__Insert__Group__2 : rule__Insert__Group__2__Impl rule__Insert__Group__3 ;
    public final void rule__Insert__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1672:1: ( rule__Insert__Group__2__Impl rule__Insert__Group__3 )
            // InternalMyDsl.g:1673:2: rule__Insert__Group__2__Impl rule__Insert__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1680:1: rule__Insert__Group__2__Impl : ( ',' ) ;
    public final void rule__Insert__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1684:1: ( ( ',' ) )
            // InternalMyDsl.g:1685:1: ( ',' )
            {
            // InternalMyDsl.g:1685:1: ( ',' )
            // InternalMyDsl.g:1686:2: ','
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
    // InternalMyDsl.g:1695:1: rule__Insert__Group__3 : rule__Insert__Group__3__Impl rule__Insert__Group__4 ;
    public final void rule__Insert__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1699:1: ( rule__Insert__Group__3__Impl rule__Insert__Group__4 )
            // InternalMyDsl.g:1700:2: rule__Insert__Group__3__Impl rule__Insert__Group__4
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
    // InternalMyDsl.g:1707:1: rule__Insert__Group__3__Impl : ( ( rule__Insert__ColNameAssignment_3 ) ) ;
    public final void rule__Insert__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1711:1: ( ( ( rule__Insert__ColNameAssignment_3 ) ) )
            // InternalMyDsl.g:1712:1: ( ( rule__Insert__ColNameAssignment_3 ) )
            {
            // InternalMyDsl.g:1712:1: ( ( rule__Insert__ColNameAssignment_3 ) )
            // InternalMyDsl.g:1713:2: ( rule__Insert__ColNameAssignment_3 )
            {
             before(grammarAccess.getInsertAccess().getColNameAssignment_3()); 
            // InternalMyDsl.g:1714:2: ( rule__Insert__ColNameAssignment_3 )
            // InternalMyDsl.g:1714:3: rule__Insert__ColNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Insert__ColNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getColNameAssignment_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:1722:1: rule__Insert__Group__4 : rule__Insert__Group__4__Impl rule__Insert__Group__5 ;
    public final void rule__Insert__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1726:1: ( rule__Insert__Group__4__Impl rule__Insert__Group__5 )
            // InternalMyDsl.g:1727:2: rule__Insert__Group__4__Impl rule__Insert__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1734:1: rule__Insert__Group__4__Impl : ( ',' ) ;
    public final void rule__Insert__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1738:1: ( ( ',' ) )
            // InternalMyDsl.g:1739:1: ( ',' )
            {
            // InternalMyDsl.g:1739:1: ( ',' )
            // InternalMyDsl.g:1740:2: ','
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
    // InternalMyDsl.g:1749:1: rule__Insert__Group__5 : rule__Insert__Group__5__Impl rule__Insert__Group__6 ;
    public final void rule__Insert__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1753:1: ( rule__Insert__Group__5__Impl rule__Insert__Group__6 )
            // InternalMyDsl.g:1754:2: rule__Insert__Group__5__Impl rule__Insert__Group__6
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
    // InternalMyDsl.g:1761:1: rule__Insert__Group__5__Impl : ( ( rule__Insert__ValueAssignment_5 ) ) ;
    public final void rule__Insert__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1765:1: ( ( ( rule__Insert__ValueAssignment_5 ) ) )
            // InternalMyDsl.g:1766:1: ( ( rule__Insert__ValueAssignment_5 ) )
            {
            // InternalMyDsl.g:1766:1: ( ( rule__Insert__ValueAssignment_5 ) )
            // InternalMyDsl.g:1767:2: ( rule__Insert__ValueAssignment_5 )
            {
             before(grammarAccess.getInsertAccess().getValueAssignment_5()); 
            // InternalMyDsl.g:1768:2: ( rule__Insert__ValueAssignment_5 )
            // InternalMyDsl.g:1768:3: rule__Insert__ValueAssignment_5
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
    // InternalMyDsl.g:1776:1: rule__Insert__Group__6 : rule__Insert__Group__6__Impl ;
    public final void rule__Insert__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1780:1: ( rule__Insert__Group__6__Impl )
            // InternalMyDsl.g:1781:2: rule__Insert__Group__6__Impl
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
    // InternalMyDsl.g:1787:1: rule__Insert__Group__6__Impl : ( ')' ) ;
    public final void rule__Insert__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1791:1: ( ( ')' ) )
            // InternalMyDsl.g:1792:1: ( ')' )
            {
            // InternalMyDsl.g:1792:1: ( ')' )
            // InternalMyDsl.g:1793:2: ')'
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
    // InternalMyDsl.g:1803:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1807:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // InternalMyDsl.g:1808:2: rule__Print__Group__0__Impl rule__Print__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1815:1: rule__Print__Group__0__Impl : ( 'Print(' ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1819:1: ( ( 'Print(' ) )
            // InternalMyDsl.g:1820:1: ( 'Print(' )
            {
            // InternalMyDsl.g:1820:1: ( 'Print(' )
            // InternalMyDsl.g:1821:2: 'Print('
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
    // InternalMyDsl.g:1830:1: rule__Print__Group__1 : rule__Print__Group__1__Impl rule__Print__Group__2 ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1834:1: ( rule__Print__Group__1__Impl rule__Print__Group__2 )
            // InternalMyDsl.g:1835:2: rule__Print__Group__1__Impl rule__Print__Group__2
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
    // InternalMyDsl.g:1842:1: rule__Print__Group__1__Impl : ( ( rule__Print__ValueAssignment_1 ) ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1846:1: ( ( ( rule__Print__ValueAssignment_1 ) ) )
            // InternalMyDsl.g:1847:1: ( ( rule__Print__ValueAssignment_1 ) )
            {
            // InternalMyDsl.g:1847:1: ( ( rule__Print__ValueAssignment_1 ) )
            // InternalMyDsl.g:1848:2: ( rule__Print__ValueAssignment_1 )
            {
             before(grammarAccess.getPrintAccess().getValueAssignment_1()); 
            // InternalMyDsl.g:1849:2: ( rule__Print__ValueAssignment_1 )
            // InternalMyDsl.g:1849:3: rule__Print__ValueAssignment_1
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
    // InternalMyDsl.g:1857:1: rule__Print__Group__2 : rule__Print__Group__2__Impl ;
    public final void rule__Print__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1861:1: ( rule__Print__Group__2__Impl )
            // InternalMyDsl.g:1862:2: rule__Print__Group__2__Impl
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
    // InternalMyDsl.g:1868:1: rule__Print__Group__2__Impl : ( ')' ) ;
    public final void rule__Print__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1872:1: ( ( ')' ) )
            // InternalMyDsl.g:1873:1: ( ')' )
            {
            // InternalMyDsl.g:1873:1: ( ')' )
            // InternalMyDsl.g:1874:2: ')'
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
    // InternalMyDsl.g:1884:1: rule__ExportCSV__Group__0 : rule__ExportCSV__Group__0__Impl rule__ExportCSV__Group__1 ;
    public final void rule__ExportCSV__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1888:1: ( rule__ExportCSV__Group__0__Impl rule__ExportCSV__Group__1 )
            // InternalMyDsl.g:1889:2: rule__ExportCSV__Group__0__Impl rule__ExportCSV__Group__1
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
    // InternalMyDsl.g:1896:1: rule__ExportCSV__Group__0__Impl : ( 'Store(' ) ;
    public final void rule__ExportCSV__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1900:1: ( ( 'Store(' ) )
            // InternalMyDsl.g:1901:1: ( 'Store(' )
            {
            // InternalMyDsl.g:1901:1: ( 'Store(' )
            // InternalMyDsl.g:1902:2: 'Store('
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
    // InternalMyDsl.g:1911:1: rule__ExportCSV__Group__1 : rule__ExportCSV__Group__1__Impl rule__ExportCSV__Group__2 ;
    public final void rule__ExportCSV__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1915:1: ( rule__ExportCSV__Group__1__Impl rule__ExportCSV__Group__2 )
            // InternalMyDsl.g:1916:2: rule__ExportCSV__Group__1__Impl rule__ExportCSV__Group__2
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
    // InternalMyDsl.g:1923:1: rule__ExportCSV__Group__1__Impl : ( ( rule__ExportCSV__PathAssignment_1 ) ) ;
    public final void rule__ExportCSV__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1927:1: ( ( ( rule__ExportCSV__PathAssignment_1 ) ) )
            // InternalMyDsl.g:1928:1: ( ( rule__ExportCSV__PathAssignment_1 ) )
            {
            // InternalMyDsl.g:1928:1: ( ( rule__ExportCSV__PathAssignment_1 ) )
            // InternalMyDsl.g:1929:2: ( rule__ExportCSV__PathAssignment_1 )
            {
             before(grammarAccess.getExportCSVAccess().getPathAssignment_1()); 
            // InternalMyDsl.g:1930:2: ( rule__ExportCSV__PathAssignment_1 )
            // InternalMyDsl.g:1930:3: rule__ExportCSV__PathAssignment_1
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
    // InternalMyDsl.g:1938:1: rule__ExportCSV__Group__2 : rule__ExportCSV__Group__2__Impl ;
    public final void rule__ExportCSV__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1942:1: ( rule__ExportCSV__Group__2__Impl )
            // InternalMyDsl.g:1943:2: rule__ExportCSV__Group__2__Impl
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
    // InternalMyDsl.g:1949:1: rule__ExportCSV__Group__2__Impl : ( ')' ) ;
    public final void rule__ExportCSV__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1953:1: ( ( ')' ) )
            // InternalMyDsl.g:1954:1: ( ')' )
            {
            // InternalMyDsl.g:1954:1: ( ')' )
            // InternalMyDsl.g:1955:2: ')'
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
    // InternalMyDsl.g:1965:1: rule__ExportJSON__Group__0 : rule__ExportJSON__Group__0__Impl rule__ExportJSON__Group__1 ;
    public final void rule__ExportJSON__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1969:1: ( rule__ExportJSON__Group__0__Impl rule__ExportJSON__Group__1 )
            // InternalMyDsl.g:1970:2: rule__ExportJSON__Group__0__Impl rule__ExportJSON__Group__1
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
    // InternalMyDsl.g:1977:1: rule__ExportJSON__Group__0__Impl : ( 'Export(' ) ;
    public final void rule__ExportJSON__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1981:1: ( ( 'Export(' ) )
            // InternalMyDsl.g:1982:1: ( 'Export(' )
            {
            // InternalMyDsl.g:1982:1: ( 'Export(' )
            // InternalMyDsl.g:1983:2: 'Export('
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
    // InternalMyDsl.g:1992:1: rule__ExportJSON__Group__1 : rule__ExportJSON__Group__1__Impl rule__ExportJSON__Group__2 ;
    public final void rule__ExportJSON__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1996:1: ( rule__ExportJSON__Group__1__Impl rule__ExportJSON__Group__2 )
            // InternalMyDsl.g:1997:2: rule__ExportJSON__Group__1__Impl rule__ExportJSON__Group__2
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
    // InternalMyDsl.g:2004:1: rule__ExportJSON__Group__1__Impl : ( ( rule__ExportJSON__PathAssignment_1 ) ) ;
    public final void rule__ExportJSON__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2008:1: ( ( ( rule__ExportJSON__PathAssignment_1 ) ) )
            // InternalMyDsl.g:2009:1: ( ( rule__ExportJSON__PathAssignment_1 ) )
            {
            // InternalMyDsl.g:2009:1: ( ( rule__ExportJSON__PathAssignment_1 ) )
            // InternalMyDsl.g:2010:2: ( rule__ExportJSON__PathAssignment_1 )
            {
             before(grammarAccess.getExportJSONAccess().getPathAssignment_1()); 
            // InternalMyDsl.g:2011:2: ( rule__ExportJSON__PathAssignment_1 )
            // InternalMyDsl.g:2011:3: rule__ExportJSON__PathAssignment_1
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
    // InternalMyDsl.g:2019:1: rule__ExportJSON__Group__2 : rule__ExportJSON__Group__2__Impl ;
    public final void rule__ExportJSON__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2023:1: ( rule__ExportJSON__Group__2__Impl )
            // InternalMyDsl.g:2024:2: rule__ExportJSON__Group__2__Impl
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
    // InternalMyDsl.g:2030:1: rule__ExportJSON__Group__2__Impl : ( ')' ) ;
    public final void rule__ExportJSON__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2034:1: ( ( ')' ) )
            // InternalMyDsl.g:2035:1: ( ')' )
            {
            // InternalMyDsl.g:2035:1: ( ')' )
            // InternalMyDsl.g:2036:2: ')'
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


    // $ANTLR start "rule__BinaryExpression__Group__0"
    // InternalMyDsl.g:2046:1: rule__BinaryExpression__Group__0 : rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 ;
    public final void rule__BinaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2050:1: ( rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 )
            // InternalMyDsl.g:2051:2: rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__BinaryExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__1();

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
    // $ANTLR end "rule__BinaryExpression__Group__0"


    // $ANTLR start "rule__BinaryExpression__Group__0__Impl"
    // InternalMyDsl.g:2058:1: rule__BinaryExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__BinaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2062:1: ( ( '(' ) )
            // InternalMyDsl.g:2063:1: ( '(' )
            {
            // InternalMyDsl.g:2063:1: ( '(' )
            // InternalMyDsl.g:2064:2: '('
            {
             before(grammarAccess.getBinaryExpressionAccess().getLeftParenthesisKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBinaryExpressionAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__0__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__1"
    // InternalMyDsl.g:2073:1: rule__BinaryExpression__Group__1 : rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2 ;
    public final void rule__BinaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2077:1: ( rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2 )
            // InternalMyDsl.g:2078:2: rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__BinaryExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__2();

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
    // $ANTLR end "rule__BinaryExpression__Group__1"


    // $ANTLR start "rule__BinaryExpression__Group__1__Impl"
    // InternalMyDsl.g:2085:1: rule__BinaryExpression__Group__1__Impl : ( ( rule__BinaryExpression__LeftAssignment_1 ) ) ;
    public final void rule__BinaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2089:1: ( ( ( rule__BinaryExpression__LeftAssignment_1 ) ) )
            // InternalMyDsl.g:2090:1: ( ( rule__BinaryExpression__LeftAssignment_1 ) )
            {
            // InternalMyDsl.g:2090:1: ( ( rule__BinaryExpression__LeftAssignment_1 ) )
            // InternalMyDsl.g:2091:2: ( rule__BinaryExpression__LeftAssignment_1 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getLeftAssignment_1()); 
            // InternalMyDsl.g:2092:2: ( rule__BinaryExpression__LeftAssignment_1 )
            // InternalMyDsl.g:2092:3: rule__BinaryExpression__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__LeftAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getLeftAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__1__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__2"
    // InternalMyDsl.g:2100:1: rule__BinaryExpression__Group__2 : rule__BinaryExpression__Group__2__Impl rule__BinaryExpression__Group__3 ;
    public final void rule__BinaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2104:1: ( rule__BinaryExpression__Group__2__Impl rule__BinaryExpression__Group__3 )
            // InternalMyDsl.g:2105:2: rule__BinaryExpression__Group__2__Impl rule__BinaryExpression__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__BinaryExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__3();

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
    // $ANTLR end "rule__BinaryExpression__Group__2"


    // $ANTLR start "rule__BinaryExpression__Group__2__Impl"
    // InternalMyDsl.g:2112:1: rule__BinaryExpression__Group__2__Impl : ( ( rule__BinaryExpression__OpAssignment_2 ) ) ;
    public final void rule__BinaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2116:1: ( ( ( rule__BinaryExpression__OpAssignment_2 ) ) )
            // InternalMyDsl.g:2117:1: ( ( rule__BinaryExpression__OpAssignment_2 ) )
            {
            // InternalMyDsl.g:2117:1: ( ( rule__BinaryExpression__OpAssignment_2 ) )
            // InternalMyDsl.g:2118:2: ( rule__BinaryExpression__OpAssignment_2 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOpAssignment_2()); 
            // InternalMyDsl.g:2119:2: ( rule__BinaryExpression__OpAssignment_2 )
            // InternalMyDsl.g:2119:3: rule__BinaryExpression__OpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__OpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getOpAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__2__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__3"
    // InternalMyDsl.g:2127:1: rule__BinaryExpression__Group__3 : rule__BinaryExpression__Group__3__Impl rule__BinaryExpression__Group__4 ;
    public final void rule__BinaryExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2131:1: ( rule__BinaryExpression__Group__3__Impl rule__BinaryExpression__Group__4 )
            // InternalMyDsl.g:2132:2: rule__BinaryExpression__Group__3__Impl rule__BinaryExpression__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__BinaryExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__4();

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
    // $ANTLR end "rule__BinaryExpression__Group__3"


    // $ANTLR start "rule__BinaryExpression__Group__3__Impl"
    // InternalMyDsl.g:2139:1: rule__BinaryExpression__Group__3__Impl : ( ( rule__BinaryExpression__RightAssignment_3 ) ) ;
    public final void rule__BinaryExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2143:1: ( ( ( rule__BinaryExpression__RightAssignment_3 ) ) )
            // InternalMyDsl.g:2144:1: ( ( rule__BinaryExpression__RightAssignment_3 ) )
            {
            // InternalMyDsl.g:2144:1: ( ( rule__BinaryExpression__RightAssignment_3 ) )
            // InternalMyDsl.g:2145:2: ( rule__BinaryExpression__RightAssignment_3 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getRightAssignment_3()); 
            // InternalMyDsl.g:2146:2: ( rule__BinaryExpression__RightAssignment_3 )
            // InternalMyDsl.g:2146:3: rule__BinaryExpression__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__RightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getRightAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__3__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__4"
    // InternalMyDsl.g:2154:1: rule__BinaryExpression__Group__4 : rule__BinaryExpression__Group__4__Impl ;
    public final void rule__BinaryExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2158:1: ( rule__BinaryExpression__Group__4__Impl )
            // InternalMyDsl.g:2159:2: rule__BinaryExpression__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__4__Impl();

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
    // $ANTLR end "rule__BinaryExpression__Group__4"


    // $ANTLR start "rule__BinaryExpression__Group__4__Impl"
    // InternalMyDsl.g:2165:1: rule__BinaryExpression__Group__4__Impl : ( ')' ) ;
    public final void rule__BinaryExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2169:1: ( ( ')' ) )
            // InternalMyDsl.g:2170:1: ( ')' )
            {
            // InternalMyDsl.g:2170:1: ( ')' )
            // InternalMyDsl.g:2171:2: ')'
            {
             before(grammarAccess.getBinaryExpressionAccess().getRightParenthesisKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBinaryExpressionAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__4__Impl"


    // $ANTLR start "rule__Selectcell__Group__0"
    // InternalMyDsl.g:2181:1: rule__Selectcell__Group__0 : rule__Selectcell__Group__0__Impl rule__Selectcell__Group__1 ;
    public final void rule__Selectcell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2185:1: ( rule__Selectcell__Group__0__Impl rule__Selectcell__Group__1 )
            // InternalMyDsl.g:2186:2: rule__Selectcell__Group__0__Impl rule__Selectcell__Group__1
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
    // InternalMyDsl.g:2193:1: rule__Selectcell__Group__0__Impl : ( 'Selectcell(' ) ;
    public final void rule__Selectcell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2197:1: ( ( 'Selectcell(' ) )
            // InternalMyDsl.g:2198:1: ( 'Selectcell(' )
            {
            // InternalMyDsl.g:2198:1: ( 'Selectcell(' )
            // InternalMyDsl.g:2199:2: 'Selectcell('
            {
             before(grammarAccess.getSelectcellAccess().getSelectcellKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMyDsl.g:2208:1: rule__Selectcell__Group__1 : rule__Selectcell__Group__1__Impl rule__Selectcell__Group__2 ;
    public final void rule__Selectcell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2212:1: ( rule__Selectcell__Group__1__Impl rule__Selectcell__Group__2 )
            // InternalMyDsl.g:2213:2: rule__Selectcell__Group__1__Impl rule__Selectcell__Group__2
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
    // InternalMyDsl.g:2220:1: rule__Selectcell__Group__1__Impl : ( ( rule__Selectcell__LineIndexAssignment_1 ) ) ;
    public final void rule__Selectcell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2224:1: ( ( ( rule__Selectcell__LineIndexAssignment_1 ) ) )
            // InternalMyDsl.g:2225:1: ( ( rule__Selectcell__LineIndexAssignment_1 ) )
            {
            // InternalMyDsl.g:2225:1: ( ( rule__Selectcell__LineIndexAssignment_1 ) )
            // InternalMyDsl.g:2226:2: ( rule__Selectcell__LineIndexAssignment_1 )
            {
             before(grammarAccess.getSelectcellAccess().getLineIndexAssignment_1()); 
            // InternalMyDsl.g:2227:2: ( rule__Selectcell__LineIndexAssignment_1 )
            // InternalMyDsl.g:2227:3: rule__Selectcell__LineIndexAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Selectcell__LineIndexAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectcellAccess().getLineIndexAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:2235:1: rule__Selectcell__Group__2 : rule__Selectcell__Group__2__Impl rule__Selectcell__Group__3 ;
    public final void rule__Selectcell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2239:1: ( rule__Selectcell__Group__2__Impl rule__Selectcell__Group__3 )
            // InternalMyDsl.g:2240:2: rule__Selectcell__Group__2__Impl rule__Selectcell__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:2247:1: rule__Selectcell__Group__2__Impl : ( ',' ) ;
    public final void rule__Selectcell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2251:1: ( ( ',' ) )
            // InternalMyDsl.g:2252:1: ( ',' )
            {
            // InternalMyDsl.g:2252:1: ( ',' )
            // InternalMyDsl.g:2253:2: ','
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
    // InternalMyDsl.g:2262:1: rule__Selectcell__Group__3 : rule__Selectcell__Group__3__Impl rule__Selectcell__Group__4 ;
    public final void rule__Selectcell__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2266:1: ( rule__Selectcell__Group__3__Impl rule__Selectcell__Group__4 )
            // InternalMyDsl.g:2267:2: rule__Selectcell__Group__3__Impl rule__Selectcell__Group__4
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
    // InternalMyDsl.g:2274:1: rule__Selectcell__Group__3__Impl : ( ( rule__Selectcell__ColNameAssignment_3 ) ) ;
    public final void rule__Selectcell__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2278:1: ( ( ( rule__Selectcell__ColNameAssignment_3 ) ) )
            // InternalMyDsl.g:2279:1: ( ( rule__Selectcell__ColNameAssignment_3 ) )
            {
            // InternalMyDsl.g:2279:1: ( ( rule__Selectcell__ColNameAssignment_3 ) )
            // InternalMyDsl.g:2280:2: ( rule__Selectcell__ColNameAssignment_3 )
            {
             before(grammarAccess.getSelectcellAccess().getColNameAssignment_3()); 
            // InternalMyDsl.g:2281:2: ( rule__Selectcell__ColNameAssignment_3 )
            // InternalMyDsl.g:2281:3: rule__Selectcell__ColNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Selectcell__ColNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSelectcellAccess().getColNameAssignment_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:2289:1: rule__Selectcell__Group__4 : rule__Selectcell__Group__4__Impl ;
    public final void rule__Selectcell__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2293:1: ( rule__Selectcell__Group__4__Impl )
            // InternalMyDsl.g:2294:2: rule__Selectcell__Group__4__Impl
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
    // InternalMyDsl.g:2300:1: rule__Selectcell__Group__4__Impl : ( ')' ) ;
    public final void rule__Selectcell__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2304:1: ( ( ')' ) )
            // InternalMyDsl.g:2305:1: ( ')' )
            {
            // InternalMyDsl.g:2305:1: ( ')' )
            // InternalMyDsl.g:2306:2: ')'
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
    // InternalMyDsl.g:2316:1: rule__Linesum__Group__0 : rule__Linesum__Group__0__Impl rule__Linesum__Group__1 ;
    public final void rule__Linesum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2320:1: ( rule__Linesum__Group__0__Impl rule__Linesum__Group__1 )
            // InternalMyDsl.g:2321:2: rule__Linesum__Group__0__Impl rule__Linesum__Group__1
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
    // InternalMyDsl.g:2328:1: rule__Linesum__Group__0__Impl : ( 'Linesum(' ) ;
    public final void rule__Linesum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2332:1: ( ( 'Linesum(' ) )
            // InternalMyDsl.g:2333:1: ( 'Linesum(' )
            {
            // InternalMyDsl.g:2333:1: ( 'Linesum(' )
            // InternalMyDsl.g:2334:2: 'Linesum('
            {
             before(grammarAccess.getLinesumAccess().getLinesumKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyDsl.g:2343:1: rule__Linesum__Group__1 : rule__Linesum__Group__1__Impl rule__Linesum__Group__2 ;
    public final void rule__Linesum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2347:1: ( rule__Linesum__Group__1__Impl rule__Linesum__Group__2 )
            // InternalMyDsl.g:2348:2: rule__Linesum__Group__1__Impl rule__Linesum__Group__2
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
    // InternalMyDsl.g:2355:1: rule__Linesum__Group__1__Impl : ( ( rule__Linesum__LineIndexAssignment_1 ) ) ;
    public final void rule__Linesum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2359:1: ( ( ( rule__Linesum__LineIndexAssignment_1 ) ) )
            // InternalMyDsl.g:2360:1: ( ( rule__Linesum__LineIndexAssignment_1 ) )
            {
            // InternalMyDsl.g:2360:1: ( ( rule__Linesum__LineIndexAssignment_1 ) )
            // InternalMyDsl.g:2361:2: ( rule__Linesum__LineIndexAssignment_1 )
            {
             before(grammarAccess.getLinesumAccess().getLineIndexAssignment_1()); 
            // InternalMyDsl.g:2362:2: ( rule__Linesum__LineIndexAssignment_1 )
            // InternalMyDsl.g:2362:3: rule__Linesum__LineIndexAssignment_1
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
    // InternalMyDsl.g:2370:1: rule__Linesum__Group__2 : rule__Linesum__Group__2__Impl ;
    public final void rule__Linesum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2374:1: ( rule__Linesum__Group__2__Impl )
            // InternalMyDsl.g:2375:2: rule__Linesum__Group__2__Impl
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
    // InternalMyDsl.g:2381:1: rule__Linesum__Group__2__Impl : ( ')' ) ;
    public final void rule__Linesum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2385:1: ( ( ')' ) )
            // InternalMyDsl.g:2386:1: ( ')' )
            {
            // InternalMyDsl.g:2386:1: ( ')' )
            // InternalMyDsl.g:2387:2: ')'
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


    // $ANTLR start "rule__Colsum__Group__0"
    // InternalMyDsl.g:2397:1: rule__Colsum__Group__0 : rule__Colsum__Group__0__Impl rule__Colsum__Group__1 ;
    public final void rule__Colsum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2401:1: ( rule__Colsum__Group__0__Impl rule__Colsum__Group__1 )
            // InternalMyDsl.g:2402:2: rule__Colsum__Group__0__Impl rule__Colsum__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Colsum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colsum__Group__1();

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
    // $ANTLR end "rule__Colsum__Group__0"


    // $ANTLR start "rule__Colsum__Group__0__Impl"
    // InternalMyDsl.g:2409:1: rule__Colsum__Group__0__Impl : ( 'Colsum(' ) ;
    public final void rule__Colsum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2413:1: ( ( 'Colsum(' ) )
            // InternalMyDsl.g:2414:1: ( 'Colsum(' )
            {
            // InternalMyDsl.g:2414:1: ( 'Colsum(' )
            // InternalMyDsl.g:2415:2: 'Colsum('
            {
             before(grammarAccess.getColsumAccess().getColsumKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getColsumAccess().getColsumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colsum__Group__0__Impl"


    // $ANTLR start "rule__Colsum__Group__1"
    // InternalMyDsl.g:2424:1: rule__Colsum__Group__1 : rule__Colsum__Group__1__Impl rule__Colsum__Group__2 ;
    public final void rule__Colsum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2428:1: ( rule__Colsum__Group__1__Impl rule__Colsum__Group__2 )
            // InternalMyDsl.g:2429:2: rule__Colsum__Group__1__Impl rule__Colsum__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Colsum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colsum__Group__2();

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
    // $ANTLR end "rule__Colsum__Group__1"


    // $ANTLR start "rule__Colsum__Group__1__Impl"
    // InternalMyDsl.g:2436:1: rule__Colsum__Group__1__Impl : ( ( rule__Colsum__ColNameAssignment_1 ) ) ;
    public final void rule__Colsum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2440:1: ( ( ( rule__Colsum__ColNameAssignment_1 ) ) )
            // InternalMyDsl.g:2441:1: ( ( rule__Colsum__ColNameAssignment_1 ) )
            {
            // InternalMyDsl.g:2441:1: ( ( rule__Colsum__ColNameAssignment_1 ) )
            // InternalMyDsl.g:2442:2: ( rule__Colsum__ColNameAssignment_1 )
            {
             before(grammarAccess.getColsumAccess().getColNameAssignment_1()); 
            // InternalMyDsl.g:2443:2: ( rule__Colsum__ColNameAssignment_1 )
            // InternalMyDsl.g:2443:3: rule__Colsum__ColNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Colsum__ColNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColsumAccess().getColNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colsum__Group__1__Impl"


    // $ANTLR start "rule__Colsum__Group__2"
    // InternalMyDsl.g:2451:1: rule__Colsum__Group__2 : rule__Colsum__Group__2__Impl ;
    public final void rule__Colsum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2455:1: ( rule__Colsum__Group__2__Impl )
            // InternalMyDsl.g:2456:2: rule__Colsum__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Colsum__Group__2__Impl();

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
    // $ANTLR end "rule__Colsum__Group__2"


    // $ANTLR start "rule__Colsum__Group__2__Impl"
    // InternalMyDsl.g:2462:1: rule__Colsum__Group__2__Impl : ( ')' ) ;
    public final void rule__Colsum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2466:1: ( ( ')' ) )
            // InternalMyDsl.g:2467:1: ( ')' )
            {
            // InternalMyDsl.g:2467:1: ( ')' )
            // InternalMyDsl.g:2468:2: ')'
            {
             before(grammarAccess.getColsumAccess().getRightParenthesisKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getColsumAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colsum__Group__2__Impl"


    // $ANTLR start "rule__Lineprod__Group__0"
    // InternalMyDsl.g:2478:1: rule__Lineprod__Group__0 : rule__Lineprod__Group__0__Impl rule__Lineprod__Group__1 ;
    public final void rule__Lineprod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2482:1: ( rule__Lineprod__Group__0__Impl rule__Lineprod__Group__1 )
            // InternalMyDsl.g:2483:2: rule__Lineprod__Group__0__Impl rule__Lineprod__Group__1
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
    // InternalMyDsl.g:2490:1: rule__Lineprod__Group__0__Impl : ( 'Lineprod(' ) ;
    public final void rule__Lineprod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2494:1: ( ( 'Lineprod(' ) )
            // InternalMyDsl.g:2495:1: ( 'Lineprod(' )
            {
            // InternalMyDsl.g:2495:1: ( 'Lineprod(' )
            // InternalMyDsl.g:2496:2: 'Lineprod('
            {
             before(grammarAccess.getLineprodAccess().getLineprodKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:2505:1: rule__Lineprod__Group__1 : rule__Lineprod__Group__1__Impl rule__Lineprod__Group__2 ;
    public final void rule__Lineprod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2509:1: ( rule__Lineprod__Group__1__Impl rule__Lineprod__Group__2 )
            // InternalMyDsl.g:2510:2: rule__Lineprod__Group__1__Impl rule__Lineprod__Group__2
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
    // InternalMyDsl.g:2517:1: rule__Lineprod__Group__1__Impl : ( ( rule__Lineprod__LineIndexAssignment_1 ) ) ;
    public final void rule__Lineprod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2521:1: ( ( ( rule__Lineprod__LineIndexAssignment_1 ) ) )
            // InternalMyDsl.g:2522:1: ( ( rule__Lineprod__LineIndexAssignment_1 ) )
            {
            // InternalMyDsl.g:2522:1: ( ( rule__Lineprod__LineIndexAssignment_1 ) )
            // InternalMyDsl.g:2523:2: ( rule__Lineprod__LineIndexAssignment_1 )
            {
             before(grammarAccess.getLineprodAccess().getLineIndexAssignment_1()); 
            // InternalMyDsl.g:2524:2: ( rule__Lineprod__LineIndexAssignment_1 )
            // InternalMyDsl.g:2524:3: rule__Lineprod__LineIndexAssignment_1
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
    // InternalMyDsl.g:2532:1: rule__Lineprod__Group__2 : rule__Lineprod__Group__2__Impl ;
    public final void rule__Lineprod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2536:1: ( rule__Lineprod__Group__2__Impl )
            // InternalMyDsl.g:2537:2: rule__Lineprod__Group__2__Impl
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
    // InternalMyDsl.g:2543:1: rule__Lineprod__Group__2__Impl : ( ')' ) ;
    public final void rule__Lineprod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2547:1: ( ( ')' ) )
            // InternalMyDsl.g:2548:1: ( ')' )
            {
            // InternalMyDsl.g:2548:1: ( ')' )
            // InternalMyDsl.g:2549:2: ')'
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


    // $ANTLR start "rule__Colprod__Group__0"
    // InternalMyDsl.g:2559:1: rule__Colprod__Group__0 : rule__Colprod__Group__0__Impl rule__Colprod__Group__1 ;
    public final void rule__Colprod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2563:1: ( rule__Colprod__Group__0__Impl rule__Colprod__Group__1 )
            // InternalMyDsl.g:2564:2: rule__Colprod__Group__0__Impl rule__Colprod__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Colprod__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colprod__Group__1();

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
    // $ANTLR end "rule__Colprod__Group__0"


    // $ANTLR start "rule__Colprod__Group__0__Impl"
    // InternalMyDsl.g:2571:1: rule__Colprod__Group__0__Impl : ( 'Colprod(' ) ;
    public final void rule__Colprod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2575:1: ( ( 'Colprod(' ) )
            // InternalMyDsl.g:2576:1: ( 'Colprod(' )
            {
            // InternalMyDsl.g:2576:1: ( 'Colprod(' )
            // InternalMyDsl.g:2577:2: 'Colprod('
            {
             before(grammarAccess.getColprodAccess().getColprodKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getColprodAccess().getColprodKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colprod__Group__0__Impl"


    // $ANTLR start "rule__Colprod__Group__1"
    // InternalMyDsl.g:2586:1: rule__Colprod__Group__1 : rule__Colprod__Group__1__Impl rule__Colprod__Group__2 ;
    public final void rule__Colprod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2590:1: ( rule__Colprod__Group__1__Impl rule__Colprod__Group__2 )
            // InternalMyDsl.g:2591:2: rule__Colprod__Group__1__Impl rule__Colprod__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Colprod__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colprod__Group__2();

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
    // $ANTLR end "rule__Colprod__Group__1"


    // $ANTLR start "rule__Colprod__Group__1__Impl"
    // InternalMyDsl.g:2598:1: rule__Colprod__Group__1__Impl : ( ( rule__Colprod__ColNameAssignment_1 ) ) ;
    public final void rule__Colprod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2602:1: ( ( ( rule__Colprod__ColNameAssignment_1 ) ) )
            // InternalMyDsl.g:2603:1: ( ( rule__Colprod__ColNameAssignment_1 ) )
            {
            // InternalMyDsl.g:2603:1: ( ( rule__Colprod__ColNameAssignment_1 ) )
            // InternalMyDsl.g:2604:2: ( rule__Colprod__ColNameAssignment_1 )
            {
             before(grammarAccess.getColprodAccess().getColNameAssignment_1()); 
            // InternalMyDsl.g:2605:2: ( rule__Colprod__ColNameAssignment_1 )
            // InternalMyDsl.g:2605:3: rule__Colprod__ColNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Colprod__ColNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColprodAccess().getColNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colprod__Group__1__Impl"


    // $ANTLR start "rule__Colprod__Group__2"
    // InternalMyDsl.g:2613:1: rule__Colprod__Group__2 : rule__Colprod__Group__2__Impl ;
    public final void rule__Colprod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2617:1: ( rule__Colprod__Group__2__Impl )
            // InternalMyDsl.g:2618:2: rule__Colprod__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Colprod__Group__2__Impl();

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
    // $ANTLR end "rule__Colprod__Group__2"


    // $ANTLR start "rule__Colprod__Group__2__Impl"
    // InternalMyDsl.g:2624:1: rule__Colprod__Group__2__Impl : ( ')' ) ;
    public final void rule__Colprod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2628:1: ( ( ')' ) )
            // InternalMyDsl.g:2629:1: ( ')' )
            {
            // InternalMyDsl.g:2629:1: ( ')' )
            // InternalMyDsl.g:2630:2: ')'
            {
             before(grammarAccess.getColprodAccess().getRightParenthesisKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getColprodAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colprod__Group__2__Impl"


    // $ANTLR start "rule__Programme__LoadscopesAssignment"
    // InternalMyDsl.g:2640:1: rule__Programme__LoadscopesAssignment : ( ruleLoadscope ) ;
    public final void rule__Programme__LoadscopesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2644:1: ( ( ruleLoadscope ) )
            // InternalMyDsl.g:2645:2: ( ruleLoadscope )
            {
            // InternalMyDsl.g:2645:2: ( ruleLoadscope )
            // InternalMyDsl.g:2646:3: ruleLoadscope
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
    // InternalMyDsl.g:2655:1: rule__Load__PathAssignment_1 : ( ruleStringValue ) ;
    public final void rule__Load__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2659:1: ( ( ruleStringValue ) )
            // InternalMyDsl.g:2660:2: ( ruleStringValue )
            {
            // InternalMyDsl.g:2660:2: ( ruleStringValue )
            // InternalMyDsl.g:2661:3: ruleStringValue
            {
             before(grammarAccess.getLoadAccess().getPathStringValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getLoadAccess().getPathStringValueParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:2670:1: rule__Load__InstructionsAssignment_4 : ( ruleInstruction ) ;
    public final void rule__Load__InstructionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2674:1: ( ( ruleInstruction ) )
            // InternalMyDsl.g:2675:2: ( ruleInstruction )
            {
            // InternalMyDsl.g:2675:2: ( ruleInstruction )
            // InternalMyDsl.g:2676:3: ruleInstruction
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
    // InternalMyDsl.g:2685:1: rule__Create__InstructionsAssignment_2 : ( ruleInstruction ) ;
    public final void rule__Create__InstructionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2689:1: ( ( ruleInstruction ) )
            // InternalMyDsl.g:2690:2: ( ruleInstruction )
            {
            // InternalMyDsl.g:2690:2: ( ruleInstruction )
            // InternalMyDsl.g:2691:3: ruleInstruction
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
    // InternalMyDsl.g:2700:1: rule__InsertCol__ColIndexAssignment_1 : ( ruleMathExpression ) ;
    public final void rule__InsertCol__ColIndexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2704:1: ( ( ruleMathExpression ) )
            // InternalMyDsl.g:2705:2: ( ruleMathExpression )
            {
            // InternalMyDsl.g:2705:2: ( ruleMathExpression )
            // InternalMyDsl.g:2706:3: ruleMathExpression
            {
             before(grammarAccess.getInsertColAccess().getColIndexMathExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMathExpression();

            state._fsp--;

             after(grammarAccess.getInsertColAccess().getColIndexMathExpressionParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:2715:1: rule__InsertCol__ColNameAssignment_3 : ( ruleStringValue ) ;
    public final void rule__InsertCol__ColNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2719:1: ( ( ruleStringValue ) )
            // InternalMyDsl.g:2720:2: ( ruleStringValue )
            {
            // InternalMyDsl.g:2720:2: ( ruleStringValue )
            // InternalMyDsl.g:2721:3: ruleStringValue
            {
             before(grammarAccess.getInsertColAccess().getColNameStringValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getInsertColAccess().getColNameStringValueParserRuleCall_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__RemoveCol__ColNameAssignment_1"
    // InternalMyDsl.g:2730:1: rule__RemoveCol__ColNameAssignment_1 : ( ruleStringValue ) ;
    public final void rule__RemoveCol__ColNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2734:1: ( ( ruleStringValue ) )
            // InternalMyDsl.g:2735:2: ( ruleStringValue )
            {
            // InternalMyDsl.g:2735:2: ( ruleStringValue )
            // InternalMyDsl.g:2736:3: ruleStringValue
            {
             before(grammarAccess.getRemoveColAccess().getColNameStringValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getRemoveColAccess().getColNameStringValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveCol__ColNameAssignment_1"


    // $ANTLR start "rule__InsertLine__LineIndexAssignment_1"
    // InternalMyDsl.g:2745:1: rule__InsertLine__LineIndexAssignment_1 : ( ruleMathExpression ) ;
    public final void rule__InsertLine__LineIndexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2749:1: ( ( ruleMathExpression ) )
            // InternalMyDsl.g:2750:2: ( ruleMathExpression )
            {
            // InternalMyDsl.g:2750:2: ( ruleMathExpression )
            // InternalMyDsl.g:2751:3: ruleMathExpression
            {
             before(grammarAccess.getInsertLineAccess().getLineIndexMathExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMathExpression();

            state._fsp--;

             after(grammarAccess.getInsertLineAccess().getLineIndexMathExpressionParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__RemoveLine__LineIndexAssignment_1"
    // InternalMyDsl.g:2760:1: rule__RemoveLine__LineIndexAssignment_1 : ( ruleMathExpression ) ;
    public final void rule__RemoveLine__LineIndexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2764:1: ( ( ruleMathExpression ) )
            // InternalMyDsl.g:2765:2: ( ruleMathExpression )
            {
            // InternalMyDsl.g:2765:2: ( ruleMathExpression )
            // InternalMyDsl.g:2766:3: ruleMathExpression
            {
             before(grammarAccess.getRemoveLineAccess().getLineIndexMathExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMathExpression();

            state._fsp--;

             after(grammarAccess.getRemoveLineAccess().getLineIndexMathExpressionParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:2775:1: rule__Insert__LineIndexAssignment_1 : ( ruleMathExpression ) ;
    public final void rule__Insert__LineIndexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2779:1: ( ( ruleMathExpression ) )
            // InternalMyDsl.g:2780:2: ( ruleMathExpression )
            {
            // InternalMyDsl.g:2780:2: ( ruleMathExpression )
            // InternalMyDsl.g:2781:3: ruleMathExpression
            {
             before(grammarAccess.getInsertAccess().getLineIndexMathExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMathExpression();

            state._fsp--;

             after(grammarAccess.getInsertAccess().getLineIndexMathExpressionParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Insert__ColNameAssignment_3"
    // InternalMyDsl.g:2790:1: rule__Insert__ColNameAssignment_3 : ( ruleStringValue ) ;
    public final void rule__Insert__ColNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2794:1: ( ( ruleStringValue ) )
            // InternalMyDsl.g:2795:2: ( ruleStringValue )
            {
            // InternalMyDsl.g:2795:2: ( ruleStringValue )
            // InternalMyDsl.g:2796:3: ruleStringValue
            {
             before(grammarAccess.getInsertAccess().getColNameStringValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getInsertAccess().getColNameStringValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__ColNameAssignment_3"


    // $ANTLR start "rule__Insert__ValueAssignment_5"
    // InternalMyDsl.g:2805:1: rule__Insert__ValueAssignment_5 : ( ruleExpression ) ;
    public final void rule__Insert__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2809:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:2810:2: ( ruleExpression )
            {
            // InternalMyDsl.g:2810:2: ( ruleExpression )
            // InternalMyDsl.g:2811:3: ruleExpression
            {
             before(grammarAccess.getInsertAccess().getValueExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getInsertAccess().getValueExpressionParserRuleCall_5_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:2820:1: rule__Print__ValueAssignment_1 : ( ruleExpression ) ;
    public final void rule__Print__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2824:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:2825:2: ( ruleExpression )
            {
            // InternalMyDsl.g:2825:2: ( ruleExpression )
            // InternalMyDsl.g:2826:3: ruleExpression
            {
             before(grammarAccess.getPrintAccess().getValueExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrintAccess().getValueExpressionParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:2835:1: rule__ExportCSV__PathAssignment_1 : ( ruleStringValue ) ;
    public final void rule__ExportCSV__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2839:1: ( ( ruleStringValue ) )
            // InternalMyDsl.g:2840:2: ( ruleStringValue )
            {
            // InternalMyDsl.g:2840:2: ( ruleStringValue )
            // InternalMyDsl.g:2841:3: ruleStringValue
            {
             before(grammarAccess.getExportCSVAccess().getPathStringValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getExportCSVAccess().getPathStringValueParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:2850:1: rule__ExportJSON__PathAssignment_1 : ( ruleStringValue ) ;
    public final void rule__ExportJSON__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2854:1: ( ( ruleStringValue ) )
            // InternalMyDsl.g:2855:2: ( ruleStringValue )
            {
            // InternalMyDsl.g:2855:2: ( ruleStringValue )
            // InternalMyDsl.g:2856:3: ruleStringValue
            {
             before(grammarAccess.getExportJSONAccess().getPathStringValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getExportJSONAccess().getPathStringValueParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__BinaryExpression__LeftAssignment_1"
    // InternalMyDsl.g:2865:1: rule__BinaryExpression__LeftAssignment_1 : ( ruleMathPrimaryExpression ) ;
    public final void rule__BinaryExpression__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2869:1: ( ( ruleMathPrimaryExpression ) )
            // InternalMyDsl.g:2870:2: ( ruleMathPrimaryExpression )
            {
            // InternalMyDsl.g:2870:2: ( ruleMathPrimaryExpression )
            // InternalMyDsl.g:2871:3: ruleMathPrimaryExpression
            {
             before(grammarAccess.getBinaryExpressionAccess().getLeftMathPrimaryExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMathPrimaryExpression();

            state._fsp--;

             after(grammarAccess.getBinaryExpressionAccess().getLeftMathPrimaryExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__LeftAssignment_1"


    // $ANTLR start "rule__BinaryExpression__OpAssignment_2"
    // InternalMyDsl.g:2880:1: rule__BinaryExpression__OpAssignment_2 : ( ruleOp ) ;
    public final void rule__BinaryExpression__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2884:1: ( ( ruleOp ) )
            // InternalMyDsl.g:2885:2: ( ruleOp )
            {
            // InternalMyDsl.g:2885:2: ( ruleOp )
            // InternalMyDsl.g:2886:3: ruleOp
            {
             before(grammarAccess.getBinaryExpressionAccess().getOpOpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOp();

            state._fsp--;

             after(grammarAccess.getBinaryExpressionAccess().getOpOpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__OpAssignment_2"


    // $ANTLR start "rule__BinaryExpression__RightAssignment_3"
    // InternalMyDsl.g:2895:1: rule__BinaryExpression__RightAssignment_3 : ( ruleMathExpression ) ;
    public final void rule__BinaryExpression__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2899:1: ( ( ruleMathExpression ) )
            // InternalMyDsl.g:2900:2: ( ruleMathExpression )
            {
            // InternalMyDsl.g:2900:2: ( ruleMathExpression )
            // InternalMyDsl.g:2901:3: ruleMathExpression
            {
             before(grammarAccess.getBinaryExpressionAccess().getRightMathExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMathExpression();

            state._fsp--;

             after(grammarAccess.getBinaryExpressionAccess().getRightMathExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__RightAssignment_3"


    // $ANTLR start "rule__Selectcell__LineIndexAssignment_1"
    // InternalMyDsl.g:2910:1: rule__Selectcell__LineIndexAssignment_1 : ( ruleMathExpression ) ;
    public final void rule__Selectcell__LineIndexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2914:1: ( ( ruleMathExpression ) )
            // InternalMyDsl.g:2915:2: ( ruleMathExpression )
            {
            // InternalMyDsl.g:2915:2: ( ruleMathExpression )
            // InternalMyDsl.g:2916:3: ruleMathExpression
            {
             before(grammarAccess.getSelectcellAccess().getLineIndexMathExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMathExpression();

            state._fsp--;

             after(grammarAccess.getSelectcellAccess().getLineIndexMathExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selectcell__LineIndexAssignment_1"


    // $ANTLR start "rule__Selectcell__ColNameAssignment_3"
    // InternalMyDsl.g:2925:1: rule__Selectcell__ColNameAssignment_3 : ( ruleStringValue ) ;
    public final void rule__Selectcell__ColNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2929:1: ( ( ruleStringValue ) )
            // InternalMyDsl.g:2930:2: ( ruleStringValue )
            {
            // InternalMyDsl.g:2930:2: ( ruleStringValue )
            // InternalMyDsl.g:2931:3: ruleStringValue
            {
             before(grammarAccess.getSelectcellAccess().getColNameStringValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getSelectcellAccess().getColNameStringValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selectcell__ColNameAssignment_3"


    // $ANTLR start "rule__Linesum__LineIndexAssignment_1"
    // InternalMyDsl.g:2940:1: rule__Linesum__LineIndexAssignment_1 : ( ruleMathExpression ) ;
    public final void rule__Linesum__LineIndexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2944:1: ( ( ruleMathExpression ) )
            // InternalMyDsl.g:2945:2: ( ruleMathExpression )
            {
            // InternalMyDsl.g:2945:2: ( ruleMathExpression )
            // InternalMyDsl.g:2946:3: ruleMathExpression
            {
             before(grammarAccess.getLinesumAccess().getLineIndexMathExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMathExpression();

            state._fsp--;

             after(grammarAccess.getLinesumAccess().getLineIndexMathExpressionParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Colsum__ColNameAssignment_1"
    // InternalMyDsl.g:2955:1: rule__Colsum__ColNameAssignment_1 : ( ruleStringValue ) ;
    public final void rule__Colsum__ColNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2959:1: ( ( ruleStringValue ) )
            // InternalMyDsl.g:2960:2: ( ruleStringValue )
            {
            // InternalMyDsl.g:2960:2: ( ruleStringValue )
            // InternalMyDsl.g:2961:3: ruleStringValue
            {
             before(grammarAccess.getColsumAccess().getColNameStringValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getColsumAccess().getColNameStringValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colsum__ColNameAssignment_1"


    // $ANTLR start "rule__Lineprod__LineIndexAssignment_1"
    // InternalMyDsl.g:2970:1: rule__Lineprod__LineIndexAssignment_1 : ( ruleMathExpression ) ;
    public final void rule__Lineprod__LineIndexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2974:1: ( ( ruleMathExpression ) )
            // InternalMyDsl.g:2975:2: ( ruleMathExpression )
            {
            // InternalMyDsl.g:2975:2: ( ruleMathExpression )
            // InternalMyDsl.g:2976:3: ruleMathExpression
            {
             before(grammarAccess.getLineprodAccess().getLineIndexMathExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMathExpression();

            state._fsp--;

             after(grammarAccess.getLineprodAccess().getLineIndexMathExpressionParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Colprod__ColNameAssignment_1"
    // InternalMyDsl.g:2985:1: rule__Colprod__ColNameAssignment_1 : ( ruleStringValue ) ;
    public final void rule__Colprod__ColNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2989:1: ( ( ruleStringValue ) )
            // InternalMyDsl.g:2990:2: ( ruleStringValue )
            {
            // InternalMyDsl.g:2990:2: ( ruleStringValue )
            // InternalMyDsl.g:2991:3: ruleStringValue
            {
             before(grammarAccess.getColprodAccess().getColNameStringValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getColprodAccess().getColNameStringValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colprod__ColNameAssignment_1"


    // $ANTLR start "rule__NoneValue__ValueAssignment"
    // InternalMyDsl.g:3000:1: rule__NoneValue__ValueAssignment : ( ( 'None' ) ) ;
    public final void rule__NoneValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3004:1: ( ( ( 'None' ) ) )
            // InternalMyDsl.g:3005:2: ( ( 'None' ) )
            {
            // InternalMyDsl.g:3005:2: ( ( 'None' ) )
            // InternalMyDsl.g:3006:3: ( 'None' )
            {
             before(grammarAccess.getNoneValueAccess().getValueNoneKeyword_0()); 
            // InternalMyDsl.g:3007:3: ( 'None' )
            // InternalMyDsl.g:3008:4: 'None'
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
    // InternalMyDsl.g:3019:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3023:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3024:2: ( RULE_INT )
            {
            // InternalMyDsl.g:3024:2: ( RULE_INT )
            // InternalMyDsl.g:3025:3: RULE_INT
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
    // InternalMyDsl.g:3034:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3038:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3039:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3039:2: ( RULE_STRING )
            // InternalMyDsl.g:3040:3: RULE_STRING
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000003FA40000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000003FA00002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000FC0000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001FC0000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000F80000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000007800L});

}