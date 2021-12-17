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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Load('", "')'", "'{'", "'}'", "'Create()'", "';'", "'InsertCol('", "','", "'RemoveCol('", "'InsertLine('", "'RemoveLine('", "'Insert('", "'Print('", "'Store('", "'Export('", "'Selectcell('", "'Linesum('", "'Colsum('", "'Lineprod('", "'Colprod('", "'('", "'+'", "'-'", "'*'", "'/'", "'None'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Programme";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgramme"
    // InternalMyDsl.g:64:1: entryRuleProgramme returns [EObject current=null] : iv_ruleProgramme= ruleProgramme EOF ;
    public final EObject entryRuleProgramme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgramme = null;


        try {
            // InternalMyDsl.g:64:50: (iv_ruleProgramme= ruleProgramme EOF )
            // InternalMyDsl.g:65:2: iv_ruleProgramme= ruleProgramme EOF
            {
             newCompositeNode(grammarAccess.getProgrammeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgramme=ruleProgramme();

            state._fsp--;

             current =iv_ruleProgramme; 
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
    // $ANTLR end "entryRuleProgramme"


    // $ANTLR start "ruleProgramme"
    // InternalMyDsl.g:71:1: ruleProgramme returns [EObject current=null] : ( (lv_loadscopes_0_0= ruleLoadscope ) )* ;
    public final EObject ruleProgramme() throws RecognitionException {
        EObject current = null;

        EObject lv_loadscopes_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_loadscopes_0_0= ruleLoadscope ) )* )
            // InternalMyDsl.g:78:2: ( (lv_loadscopes_0_0= ruleLoadscope ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_loadscopes_0_0= ruleLoadscope ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_loadscopes_0_0= ruleLoadscope )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_loadscopes_0_0= ruleLoadscope )
            	    // InternalMyDsl.g:80:4: lv_loadscopes_0_0= ruleLoadscope
            	    {

            	    				newCompositeNode(grammarAccess.getProgrammeAccess().getLoadscopesLoadscopeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_loadscopes_0_0=ruleLoadscope();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getProgrammeRule());
            	    				}
            	    				add(
            	    					current,
            	    					"loadscopes",
            	    					lv_loadscopes_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.Loadscope");
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
    // $ANTLR end "ruleProgramme"


    // $ANTLR start "entryRuleLoadscope"
    // InternalMyDsl.g:100:1: entryRuleLoadscope returns [EObject current=null] : iv_ruleLoadscope= ruleLoadscope EOF ;
    public final EObject entryRuleLoadscope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadscope = null;


        try {
            // InternalMyDsl.g:100:50: (iv_ruleLoadscope= ruleLoadscope EOF )
            // InternalMyDsl.g:101:2: iv_ruleLoadscope= ruleLoadscope EOF
            {
             newCompositeNode(grammarAccess.getLoadscopeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoadscope=ruleLoadscope();

            state._fsp--;

             current =iv_ruleLoadscope; 
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
    // $ANTLR end "entryRuleLoadscope"


    // $ANTLR start "ruleLoadscope"
    // InternalMyDsl.g:107:1: ruleLoadscope returns [EObject current=null] : (this_Load_0= ruleLoad | this_Create_1= ruleCreate ) ;
    public final EObject ruleLoadscope() throws RecognitionException {
        EObject current = null;

        EObject this_Load_0 = null;

        EObject this_Create_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (this_Load_0= ruleLoad | this_Create_1= ruleCreate ) )
            // InternalMyDsl.g:114:2: (this_Load_0= ruleLoad | this_Create_1= ruleCreate )
            {
            // InternalMyDsl.g:114:2: (this_Load_0= ruleLoad | this_Create_1= ruleCreate )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:115:3: this_Load_0= ruleLoad
                    {

                    			newCompositeNode(grammarAccess.getLoadscopeAccess().getLoadParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Load_0=ruleLoad();

                    state._fsp--;


                    			current = this_Load_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:124:3: this_Create_1= ruleCreate
                    {

                    			newCompositeNode(grammarAccess.getLoadscopeAccess().getCreateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Create_1=ruleCreate();

                    state._fsp--;


                    			current = this_Create_1;
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
    // $ANTLR end "ruleLoadscope"


    // $ANTLR start "entryRuleLoad"
    // InternalMyDsl.g:136:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // InternalMyDsl.g:136:45: (iv_ruleLoad= ruleLoad EOF )
            // InternalMyDsl.g:137:2: iv_ruleLoad= ruleLoad EOF
            {
             newCompositeNode(grammarAccess.getLoadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoad=ruleLoad();

            state._fsp--;

             current =iv_ruleLoad; 
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
    // $ANTLR end "entryRuleLoad"


    // $ANTLR start "ruleLoad"
    // InternalMyDsl.g:143:1: ruleLoad returns [EObject current=null] : (otherlv_0= 'Load(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}' ) ;
    public final EObject ruleLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_path_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_instructions_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:149:2: ( (otherlv_0= 'Load(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}' ) )
            // InternalMyDsl.g:150:2: (otherlv_0= 'Load(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}' )
            {
            // InternalMyDsl.g:150:2: (otherlv_0= 'Load(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}' )
            // InternalMyDsl.g:151:3: otherlv_0= 'Load(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadAccess().getLoadKeyword_0());
            		
            // InternalMyDsl.g:155:3: ( (lv_path_1_0= RULE_STRING ) )
            // InternalMyDsl.g:156:4: (lv_path_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:156:4: (lv_path_1_0= RULE_STRING )
            // InternalMyDsl.g:157:5: lv_path_1_0= RULE_STRING
            {
            lv_path_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_path_1_0, grammarAccess.getLoadAccess().getPathSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLoadAccess().getRightParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getLoadAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:181:3: ( (lv_instructions_4_0= ruleInstruction ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING||LA3_0==17||(LA3_0>=19 && LA3_0<=25)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:182:4: (lv_instructions_4_0= ruleInstruction )
            	    {
            	    // InternalMyDsl.g:182:4: (lv_instructions_4_0= ruleInstruction )
            	    // InternalMyDsl.g:183:5: lv_instructions_4_0= ruleInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getLoadAccess().getInstructionsInstructionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_instructions_4_0=ruleInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLoadRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instructions",
            	    						lv_instructions_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.Instruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLoadAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleLoad"


    // $ANTLR start "entryRuleCreate"
    // InternalMyDsl.g:208:1: entryRuleCreate returns [EObject current=null] : iv_ruleCreate= ruleCreate EOF ;
    public final EObject entryRuleCreate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreate = null;


        try {
            // InternalMyDsl.g:208:47: (iv_ruleCreate= ruleCreate EOF )
            // InternalMyDsl.g:209:2: iv_ruleCreate= ruleCreate EOF
            {
             newCompositeNode(grammarAccess.getCreateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreate=ruleCreate();

            state._fsp--;

             current =iv_ruleCreate; 
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
    // $ANTLR end "entryRuleCreate"


    // $ANTLR start "ruleCreate"
    // InternalMyDsl.g:215:1: ruleCreate returns [EObject current=null] : (otherlv_0= 'Create()' otherlv_1= '{' ( (lv_instructions_2_0= ruleInstruction ) )* otherlv_3= '}' ) ;
    public final EObject ruleCreate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_instructions_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:221:2: ( (otherlv_0= 'Create()' otherlv_1= '{' ( (lv_instructions_2_0= ruleInstruction ) )* otherlv_3= '}' ) )
            // InternalMyDsl.g:222:2: (otherlv_0= 'Create()' otherlv_1= '{' ( (lv_instructions_2_0= ruleInstruction ) )* otherlv_3= '}' )
            {
            // InternalMyDsl.g:222:2: (otherlv_0= 'Create()' otherlv_1= '{' ( (lv_instructions_2_0= ruleInstruction ) )* otherlv_3= '}' )
            // InternalMyDsl.g:223:3: otherlv_0= 'Create()' otherlv_1= '{' ( (lv_instructions_2_0= ruleInstruction ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:231:3: ( (lv_instructions_2_0= ruleInstruction ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING||LA4_0==17||(LA4_0>=19 && LA4_0<=25)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:232:4: (lv_instructions_2_0= ruleInstruction )
            	    {
            	    // InternalMyDsl.g:232:4: (lv_instructions_2_0= ruleInstruction )
            	    // InternalMyDsl.g:233:5: lv_instructions_2_0= ruleInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getCreateAccess().getInstructionsInstructionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_instructions_2_0=ruleInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCreateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instructions",
            	    						lv_instructions_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.Instruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCreateAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleCreate"


    // $ANTLR start "entryRuleInstruction"
    // InternalMyDsl.g:258:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalMyDsl.g:258:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalMyDsl.g:259:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalMyDsl.g:265:1: ruleInstruction returns [EObject current=null] : ( (this_InsertLine_0= ruleInsertLine | this_RemoveLine_1= ruleRemoveLine | this_InsertCol_2= ruleInsertCol | this_RemoveCol_3= ruleRemoveCol | this_Insert_4= ruleInsert | this_ExportJSON_5= ruleExportJSON | this_ExportCSV_6= ruleExportCSV | this_Print_7= rulePrint ) otherlv_8= ';' ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_8=null;
        EObject this_InsertLine_0 = null;

        EObject this_RemoveLine_1 = null;

        EObject this_InsertCol_2 = null;

        EObject this_RemoveCol_3 = null;

        EObject this_Insert_4 = null;

        EObject this_ExportJSON_5 = null;

        EObject this_ExportCSV_6 = null;

        EObject this_Print_7 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:271:2: ( ( (this_InsertLine_0= ruleInsertLine | this_RemoveLine_1= ruleRemoveLine | this_InsertCol_2= ruleInsertCol | this_RemoveCol_3= ruleRemoveCol | this_Insert_4= ruleInsert | this_ExportJSON_5= ruleExportJSON | this_ExportCSV_6= ruleExportCSV | this_Print_7= rulePrint ) otherlv_8= ';' ) )
            // InternalMyDsl.g:272:2: ( (this_InsertLine_0= ruleInsertLine | this_RemoveLine_1= ruleRemoveLine | this_InsertCol_2= ruleInsertCol | this_RemoveCol_3= ruleRemoveCol | this_Insert_4= ruleInsert | this_ExportJSON_5= ruleExportJSON | this_ExportCSV_6= ruleExportCSV | this_Print_7= rulePrint ) otherlv_8= ';' )
            {
            // InternalMyDsl.g:272:2: ( (this_InsertLine_0= ruleInsertLine | this_RemoveLine_1= ruleRemoveLine | this_InsertCol_2= ruleInsertCol | this_RemoveCol_3= ruleRemoveCol | this_Insert_4= ruleInsert | this_ExportJSON_5= ruleExportJSON | this_ExportCSV_6= ruleExportCSV | this_Print_7= rulePrint ) otherlv_8= ';' )
            // InternalMyDsl.g:273:3: (this_InsertLine_0= ruleInsertLine | this_RemoveLine_1= ruleRemoveLine | this_InsertCol_2= ruleInsertCol | this_RemoveCol_3= ruleRemoveCol | this_Insert_4= ruleInsert | this_ExportJSON_5= ruleExportJSON | this_ExportCSV_6= ruleExportCSV | this_Print_7= rulePrint ) otherlv_8= ';'
            {
            // InternalMyDsl.g:273:3: (this_InsertLine_0= ruleInsertLine | this_RemoveLine_1= ruleRemoveLine | this_InsertCol_2= ruleInsertCol | this_RemoveCol_3= ruleRemoveCol | this_Insert_4= ruleInsert | this_ExportJSON_5= ruleExportJSON | this_ExportCSV_6= ruleExportCSV | this_Print_7= rulePrint )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            case RULE_STRING:
            case 19:
                {
                alt5=4;
                }
                break;
            case 22:
                {
                alt5=5;
                }
                break;
            case 25:
                {
                alt5=6;
                }
                break;
            case 24:
                {
                alt5=7;
                }
                break;
            case 23:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:274:4: this_InsertLine_0= ruleInsertLine
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getInsertLineParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_8);
                    this_InsertLine_0=ruleInsertLine();

                    state._fsp--;


                    				current = this_InsertLine_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:283:4: this_RemoveLine_1= ruleRemoveLine
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getRemoveLineParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_8);
                    this_RemoveLine_1=ruleRemoveLine();

                    state._fsp--;


                    				current = this_RemoveLine_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:292:4: this_InsertCol_2= ruleInsertCol
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getInsertColParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_8);
                    this_InsertCol_2=ruleInsertCol();

                    state._fsp--;


                    				current = this_InsertCol_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:301:4: this_RemoveCol_3= ruleRemoveCol
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getRemoveColParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_8);
                    this_RemoveCol_3=ruleRemoveCol();

                    state._fsp--;


                    				current = this_RemoveCol_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:310:4: this_Insert_4= ruleInsert
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getInsertParserRuleCall_0_4());
                    			
                    pushFollow(FOLLOW_8);
                    this_Insert_4=ruleInsert();

                    state._fsp--;


                    				current = this_Insert_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:319:4: this_ExportJSON_5= ruleExportJSON
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getExportJSONParserRuleCall_0_5());
                    			
                    pushFollow(FOLLOW_8);
                    this_ExportJSON_5=ruleExportJSON();

                    state._fsp--;


                    				current = this_ExportJSON_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:328:4: this_ExportCSV_6= ruleExportCSV
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getExportCSVParserRuleCall_0_6());
                    			
                    pushFollow(FOLLOW_8);
                    this_ExportCSV_6=ruleExportCSV();

                    state._fsp--;


                    				current = this_ExportCSV_6;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:337:4: this_Print_7= rulePrint
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getPrintParserRuleCall_0_7());
                    			
                    pushFollow(FOLLOW_8);
                    this_Print_7=rulePrint();

                    state._fsp--;


                    				current = this_Print_7;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getInstructionAccess().getSemicolonKeyword_1());
            		

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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleInsertCol"
    // InternalMyDsl.g:354:1: entryRuleInsertCol returns [EObject current=null] : iv_ruleInsertCol= ruleInsertCol EOF ;
    public final EObject entryRuleInsertCol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertCol = null;


        try {
            // InternalMyDsl.g:354:50: (iv_ruleInsertCol= ruleInsertCol EOF )
            // InternalMyDsl.g:355:2: iv_ruleInsertCol= ruleInsertCol EOF
            {
             newCompositeNode(grammarAccess.getInsertColRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsertCol=ruleInsertCol();

            state._fsp--;

             current =iv_ruleInsertCol; 
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
    // $ANTLR end "entryRuleInsertCol"


    // $ANTLR start "ruleInsertCol"
    // InternalMyDsl.g:361:1: ruleInsertCol returns [EObject current=null] : (otherlv_0= 'InsertCol(' ( (lv_colIndex_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_colName_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_exp_5_0= ruleExpression ) ) )? otherlv_6= ')' ) ;
    public final EObject ruleInsertCol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_colName_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_colIndex_1_0 = null;

        EObject lv_exp_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:367:2: ( (otherlv_0= 'InsertCol(' ( (lv_colIndex_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_colName_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_exp_5_0= ruleExpression ) ) )? otherlv_6= ')' ) )
            // InternalMyDsl.g:368:2: (otherlv_0= 'InsertCol(' ( (lv_colIndex_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_colName_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_exp_5_0= ruleExpression ) ) )? otherlv_6= ')' )
            {
            // InternalMyDsl.g:368:2: (otherlv_0= 'InsertCol(' ( (lv_colIndex_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_colName_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_exp_5_0= ruleExpression ) ) )? otherlv_6= ')' )
            // InternalMyDsl.g:369:3: otherlv_0= 'InsertCol(' ( (lv_colIndex_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_colName_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_exp_5_0= ruleExpression ) ) )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertColAccess().getInsertColKeyword_0());
            		
            // InternalMyDsl.g:373:3: ( (lv_colIndex_1_0= ruleExpression ) )
            // InternalMyDsl.g:374:4: (lv_colIndex_1_0= ruleExpression )
            {
            // InternalMyDsl.g:374:4: (lv_colIndex_1_0= ruleExpression )
            // InternalMyDsl.g:375:5: lv_colIndex_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getInsertColAccess().getColIndexExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_colIndex_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertColRule());
            					}
            					set(
            						current,
            						"colIndex",
            						lv_colIndex_1_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getInsertColAccess().getCommaKeyword_2());
            		
            // InternalMyDsl.g:396:3: ( (lv_colName_3_0= RULE_STRING ) )
            // InternalMyDsl.g:397:4: (lv_colName_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:397:4: (lv_colName_3_0= RULE_STRING )
            // InternalMyDsl.g:398:5: lv_colName_3_0= RULE_STRING
            {
            lv_colName_3_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_colName_3_0, grammarAccess.getInsertColAccess().getColNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInsertColRule());
            					}
            					setWithLastConsumed(
            						current,
            						"colName",
            						lv_colName_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:414:3: (otherlv_4= ',' ( (lv_exp_5_0= ruleExpression ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:415:4: otherlv_4= ',' ( (lv_exp_5_0= ruleExpression ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getInsertColAccess().getCommaKeyword_4_0());
                    			
                    // InternalMyDsl.g:419:4: ( (lv_exp_5_0= ruleExpression ) )
                    // InternalMyDsl.g:420:5: (lv_exp_5_0= ruleExpression )
                    {
                    // InternalMyDsl.g:420:5: (lv_exp_5_0= ruleExpression )
                    // InternalMyDsl.g:421:6: lv_exp_5_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getInsertColAccess().getExpExpressionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_exp_5_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInsertColRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_5_0,
                    							"org.xtext.example.mydsl.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getInsertColAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleInsertCol"


    // $ANTLR start "entryRuleRemoveCol"
    // InternalMyDsl.g:447:1: entryRuleRemoveCol returns [EObject current=null] : iv_ruleRemoveCol= ruleRemoveCol EOF ;
    public final EObject entryRuleRemoveCol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveCol = null;


        try {
            // InternalMyDsl.g:447:50: (iv_ruleRemoveCol= ruleRemoveCol EOF )
            // InternalMyDsl.g:448:2: iv_ruleRemoveCol= ruleRemoveCol EOF
            {
             newCompositeNode(grammarAccess.getRemoveColRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemoveCol=ruleRemoveCol();

            state._fsp--;

             current =iv_ruleRemoveCol; 
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
    // $ANTLR end "entryRuleRemoveCol"


    // $ANTLR start "ruleRemoveCol"
    // InternalMyDsl.g:454:1: ruleRemoveCol returns [EObject current=null] : ( (otherlv_0= 'RemoveCol(' ( (lv_colIndex_1_0= ruleExpression ) ) ) | ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' ) ) ;
    public final EObject ruleRemoveCol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_colIndex_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:460:2: ( ( (otherlv_0= 'RemoveCol(' ( (lv_colIndex_1_0= ruleExpression ) ) ) | ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' ) ) )
            // InternalMyDsl.g:461:2: ( (otherlv_0= 'RemoveCol(' ( (lv_colIndex_1_0= ruleExpression ) ) ) | ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            {
            // InternalMyDsl.g:461:2: ( (otherlv_0= 'RemoveCol(' ( (lv_colIndex_1_0= ruleExpression ) ) ) | ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:462:3: (otherlv_0= 'RemoveCol(' ( (lv_colIndex_1_0= ruleExpression ) ) )
                    {
                    // InternalMyDsl.g:462:3: (otherlv_0= 'RemoveCol(' ( (lv_colIndex_1_0= ruleExpression ) ) )
                    // InternalMyDsl.g:463:4: otherlv_0= 'RemoveCol(' ( (lv_colIndex_1_0= ruleExpression ) )
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getRemoveColAccess().getRemoveColKeyword_0_0());
                    			
                    // InternalMyDsl.g:467:4: ( (lv_colIndex_1_0= ruleExpression ) )
                    // InternalMyDsl.g:468:5: (lv_colIndex_1_0= ruleExpression )
                    {
                    // InternalMyDsl.g:468:5: (lv_colIndex_1_0= ruleExpression )
                    // InternalMyDsl.g:469:6: lv_colIndex_1_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getRemoveColAccess().getColIndexExpressionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_colIndex_1_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRemoveColRule());
                    						}
                    						set(
                    							current,
                    							"colIndex",
                    							lv_colIndex_1_0,
                    							"org.xtext.example.mydsl.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:488:3: ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' )
                    {
                    // InternalMyDsl.g:488:3: ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' )
                    // InternalMyDsl.g:489:4: ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')'
                    {
                    // InternalMyDsl.g:489:4: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalMyDsl.g:490:5: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:490:5: (lv_name_2_0= RULE_STRING )
                    // InternalMyDsl.g:491:6: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getRemoveColAccess().getNameSTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRemoveColRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getRemoveColAccess().getRightParenthesisKeyword_1_1());
                    			

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
    // $ANTLR end "ruleRemoveCol"


    // $ANTLR start "entryRuleInsertLine"
    // InternalMyDsl.g:516:1: entryRuleInsertLine returns [EObject current=null] : iv_ruleInsertLine= ruleInsertLine EOF ;
    public final EObject entryRuleInsertLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertLine = null;


        try {
            // InternalMyDsl.g:516:51: (iv_ruleInsertLine= ruleInsertLine EOF )
            // InternalMyDsl.g:517:2: iv_ruleInsertLine= ruleInsertLine EOF
            {
             newCompositeNode(grammarAccess.getInsertLineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsertLine=ruleInsertLine();

            state._fsp--;

             current =iv_ruleInsertLine; 
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
    // $ANTLR end "entryRuleInsertLine"


    // $ANTLR start "ruleInsertLine"
    // InternalMyDsl.g:523:1: ruleInsertLine returns [EObject current=null] : (otherlv_0= 'InsertLine(' ( (lv_lineIndex_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_exps_3_0= ruleExpression ) ) )+ otherlv_4= ')' ) ;
    public final EObject ruleInsertLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_lineIndex_1_0 = null;

        EObject lv_exps_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:529:2: ( (otherlv_0= 'InsertLine(' ( (lv_lineIndex_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_exps_3_0= ruleExpression ) ) )+ otherlv_4= ')' ) )
            // InternalMyDsl.g:530:2: (otherlv_0= 'InsertLine(' ( (lv_lineIndex_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_exps_3_0= ruleExpression ) ) )+ otherlv_4= ')' )
            {
            // InternalMyDsl.g:530:2: (otherlv_0= 'InsertLine(' ( (lv_lineIndex_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_exps_3_0= ruleExpression ) ) )+ otherlv_4= ')' )
            // InternalMyDsl.g:531:3: otherlv_0= 'InsertLine(' ( (lv_lineIndex_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_exps_3_0= ruleExpression ) ) )+ otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertLineAccess().getInsertLineKeyword_0());
            		
            // InternalMyDsl.g:535:3: ( (lv_lineIndex_1_0= ruleExpression ) )
            // InternalMyDsl.g:536:4: (lv_lineIndex_1_0= ruleExpression )
            {
            // InternalMyDsl.g:536:4: (lv_lineIndex_1_0= ruleExpression )
            // InternalMyDsl.g:537:5: lv_lineIndex_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getInsertLineAccess().getLineIndexExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_lineIndex_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertLineRule());
            					}
            					set(
            						current,
            						"lineIndex",
            						lv_lineIndex_1_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:554:3: (otherlv_2= ',' ( (lv_exps_3_0= ruleExpression ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:555:4: otherlv_2= ',' ( (lv_exps_3_0= ruleExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_9); 

            	    				newLeafNode(otherlv_2, grammarAccess.getInsertLineAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMyDsl.g:559:4: ( (lv_exps_3_0= ruleExpression ) )
            	    // InternalMyDsl.g:560:5: (lv_exps_3_0= ruleExpression )
            	    {
            	    // InternalMyDsl.g:560:5: (lv_exps_3_0= ruleExpression )
            	    // InternalMyDsl.g:561:6: lv_exps_3_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getInsertLineAccess().getExpsExpressionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_exps_3_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInsertLineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"exps",
            	    							lv_exps_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInsertLineAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleInsertLine"


    // $ANTLR start "entryRuleRemoveLine"
    // InternalMyDsl.g:587:1: entryRuleRemoveLine returns [EObject current=null] : iv_ruleRemoveLine= ruleRemoveLine EOF ;
    public final EObject entryRuleRemoveLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveLine = null;


        try {
            // InternalMyDsl.g:587:51: (iv_ruleRemoveLine= ruleRemoveLine EOF )
            // InternalMyDsl.g:588:2: iv_ruleRemoveLine= ruleRemoveLine EOF
            {
             newCompositeNode(grammarAccess.getRemoveLineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemoveLine=ruleRemoveLine();

            state._fsp--;

             current =iv_ruleRemoveLine; 
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
    // $ANTLR end "entryRuleRemoveLine"


    // $ANTLR start "ruleRemoveLine"
    // InternalMyDsl.g:594:1: ruleRemoveLine returns [EObject current=null] : (otherlv_0= 'RemoveLine(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleRemoveLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_lineIndex_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:600:2: ( (otherlv_0= 'RemoveLine(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:601:2: (otherlv_0= 'RemoveLine(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:601:2: (otherlv_0= 'RemoveLine(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')' )
            // InternalMyDsl.g:602:3: otherlv_0= 'RemoveLine(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveLineAccess().getRemoveLineKeyword_0());
            		
            // InternalMyDsl.g:606:3: ( (lv_lineIndex_1_0= ruleExpression ) )
            // InternalMyDsl.g:607:4: (lv_lineIndex_1_0= ruleExpression )
            {
            // InternalMyDsl.g:607:4: (lv_lineIndex_1_0= ruleExpression )
            // InternalMyDsl.g:608:5: lv_lineIndex_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getRemoveLineAccess().getLineIndexExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_lineIndex_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRemoveLineRule());
            					}
            					set(
            						current,
            						"lineIndex",
            						lv_lineIndex_1_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRemoveLineAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleRemoveLine"


    // $ANTLR start "entryRuleInsert"
    // InternalMyDsl.g:633:1: entryRuleInsert returns [EObject current=null] : iv_ruleInsert= ruleInsert EOF ;
    public final EObject entryRuleInsert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsert = null;


        try {
            // InternalMyDsl.g:633:47: (iv_ruleInsert= ruleInsert EOF )
            // InternalMyDsl.g:634:2: iv_ruleInsert= ruleInsert EOF
            {
             newCompositeNode(grammarAccess.getInsertRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsert=ruleInsert();

            state._fsp--;

             current =iv_ruleInsert; 
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
    // $ANTLR end "entryRuleInsert"


    // $ANTLR start "ruleInsert"
    // InternalMyDsl.g:640:1: ruleInsert returns [EObject current=null] : (otherlv_0= 'Insert(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_colNameOrIndex_3_0= ruleExpression ) ) otherlv_4= ',' ( ( (lv_value_5_1= ruleExpression | lv_value_5_2= ruleStringValue ) ) ) otherlv_6= ')' ) ;
    public final EObject ruleInsert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_lineIndex_1_0 = null;

        EObject lv_colNameOrIndex_3_0 = null;

        EObject lv_value_5_1 = null;

        EObject lv_value_5_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:646:2: ( (otherlv_0= 'Insert(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_colNameOrIndex_3_0= ruleExpression ) ) otherlv_4= ',' ( ( (lv_value_5_1= ruleExpression | lv_value_5_2= ruleStringValue ) ) ) otherlv_6= ')' ) )
            // InternalMyDsl.g:647:2: (otherlv_0= 'Insert(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_colNameOrIndex_3_0= ruleExpression ) ) otherlv_4= ',' ( ( (lv_value_5_1= ruleExpression | lv_value_5_2= ruleStringValue ) ) ) otherlv_6= ')' )
            {
            // InternalMyDsl.g:647:2: (otherlv_0= 'Insert(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_colNameOrIndex_3_0= ruleExpression ) ) otherlv_4= ',' ( ( (lv_value_5_1= ruleExpression | lv_value_5_2= ruleStringValue ) ) ) otherlv_6= ')' )
            // InternalMyDsl.g:648:3: otherlv_0= 'Insert(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_colNameOrIndex_3_0= ruleExpression ) ) otherlv_4= ',' ( ( (lv_value_5_1= ruleExpression | lv_value_5_2= ruleStringValue ) ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertAccess().getInsertKeyword_0());
            		
            // InternalMyDsl.g:652:3: ( (lv_lineIndex_1_0= ruleExpression ) )
            // InternalMyDsl.g:653:4: (lv_lineIndex_1_0= ruleExpression )
            {
            // InternalMyDsl.g:653:4: (lv_lineIndex_1_0= ruleExpression )
            // InternalMyDsl.g:654:5: lv_lineIndex_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getLineIndexExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_lineIndex_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertRule());
            					}
            					set(
            						current,
            						"lineIndex",
            						lv_lineIndex_1_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getInsertAccess().getCommaKeyword_2());
            		
            // InternalMyDsl.g:675:3: ( (lv_colNameOrIndex_3_0= ruleExpression ) )
            // InternalMyDsl.g:676:4: (lv_colNameOrIndex_3_0= ruleExpression )
            {
            // InternalMyDsl.g:676:4: (lv_colNameOrIndex_3_0= ruleExpression )
            // InternalMyDsl.g:677:5: lv_colNameOrIndex_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getColNameOrIndexExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_colNameOrIndex_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertRule());
            					}
            					set(
            						current,
            						"colNameOrIndex",
            						lv_colNameOrIndex_3_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getInsertAccess().getCommaKeyword_4());
            		
            // InternalMyDsl.g:698:3: ( ( (lv_value_5_1= ruleExpression | lv_value_5_2= ruleStringValue ) ) )
            // InternalMyDsl.g:699:4: ( (lv_value_5_1= ruleExpression | lv_value_5_2= ruleStringValue ) )
            {
            // InternalMyDsl.g:699:4: ( (lv_value_5_1= ruleExpression | lv_value_5_2= ruleStringValue ) )
            // InternalMyDsl.g:700:5: (lv_value_5_1= ruleExpression | lv_value_5_2= ruleStringValue )
            {
            // InternalMyDsl.g:700:5: (lv_value_5_1= ruleExpression | lv_value_5_2= ruleStringValue )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT||(LA9_0>=26 && LA9_0<=31)||LA9_0==36) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_STRING) ) {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==12) ) {
                    int LA9_3 = input.LA(3);

                    if ( (LA9_3==EOF||LA9_3==16) ) {
                        alt9=2;
                    }
                    else if ( (LA9_3==12) ) {
                        alt9=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:701:6: lv_value_5_1= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getInsertAccess().getValueExpressionParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_value_5_1=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInsertRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_1,
                    							"org.xtext.example.mydsl.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:717:6: lv_value_5_2= ruleStringValue
                    {

                    						newCompositeNode(grammarAccess.getInsertAccess().getValueStringValueParserRuleCall_5_0_1());
                    					
                    pushFollow(FOLLOW_5);
                    lv_value_5_2=ruleStringValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInsertRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_2,
                    							"org.xtext.example.mydsl.MyDsl.StringValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getInsertAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleInsert"


    // $ANTLR start "entryRulePrint"
    // InternalMyDsl.g:743:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalMyDsl.g:743:46: (iv_rulePrint= rulePrint EOF )
            // InternalMyDsl.g:744:2: iv_rulePrint= rulePrint EOF
            {
             newCompositeNode(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrint=rulePrint();

            state._fsp--;

             current =iv_rulePrint; 
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
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // InternalMyDsl.g:750:1: rulePrint returns [EObject current=null] : (otherlv_0= 'Print(' ( ( (lv_value_1_1= ruleExpression | lv_value_1_2= ruleStringValue ) ) ) otherlv_2= ')' ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_1 = null;

        EObject lv_value_1_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:756:2: ( (otherlv_0= 'Print(' ( ( (lv_value_1_1= ruleExpression | lv_value_1_2= ruleStringValue ) ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:757:2: (otherlv_0= 'Print(' ( ( (lv_value_1_1= ruleExpression | lv_value_1_2= ruleStringValue ) ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:757:2: (otherlv_0= 'Print(' ( ( (lv_value_1_1= ruleExpression | lv_value_1_2= ruleStringValue ) ) ) otherlv_2= ')' )
            // InternalMyDsl.g:758:3: otherlv_0= 'Print(' ( ( (lv_value_1_1= ruleExpression | lv_value_1_2= ruleStringValue ) ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPrintKeyword_0());
            		
            // InternalMyDsl.g:762:3: ( ( (lv_value_1_1= ruleExpression | lv_value_1_2= ruleStringValue ) ) )
            // InternalMyDsl.g:763:4: ( (lv_value_1_1= ruleExpression | lv_value_1_2= ruleStringValue ) )
            {
            // InternalMyDsl.g:763:4: ( (lv_value_1_1= ruleExpression | lv_value_1_2= ruleStringValue ) )
            // InternalMyDsl.g:764:5: (lv_value_1_1= ruleExpression | lv_value_1_2= ruleStringValue )
            {
            // InternalMyDsl.g:764:5: (lv_value_1_1= ruleExpression | lv_value_1_2= ruleStringValue )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT||(LA10_0>=26 && LA10_0<=31)||LA10_0==36) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_STRING) ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==12) ) {
                    int LA10_3 = input.LA(3);

                    if ( (LA10_3==12) ) {
                        alt10=1;
                    }
                    else if ( (LA10_3==EOF||LA10_3==16) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:765:6: lv_value_1_1= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getPrintAccess().getValueExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_value_1_1=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrintRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_1_1,
                    							"org.xtext.example.mydsl.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:781:6: lv_value_1_2= ruleStringValue
                    {

                    						newCompositeNode(grammarAccess.getPrintAccess().getValueStringValueParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_5);
                    lv_value_1_2=ruleStringValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrintRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_1_2,
                    							"org.xtext.example.mydsl.MyDsl.StringValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPrintAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRuleExportCSV"
    // InternalMyDsl.g:807:1: entryRuleExportCSV returns [EObject current=null] : iv_ruleExportCSV= ruleExportCSV EOF ;
    public final EObject entryRuleExportCSV() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExportCSV = null;


        try {
            // InternalMyDsl.g:807:50: (iv_ruleExportCSV= ruleExportCSV EOF )
            // InternalMyDsl.g:808:2: iv_ruleExportCSV= ruleExportCSV EOF
            {
             newCompositeNode(grammarAccess.getExportCSVRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExportCSV=ruleExportCSV();

            state._fsp--;

             current =iv_ruleExportCSV; 
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
    // $ANTLR end "entryRuleExportCSV"


    // $ANTLR start "ruleExportCSV"
    // InternalMyDsl.g:814:1: ruleExportCSV returns [EObject current=null] : (otherlv_0= 'Store(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ')' ) ;
    public final EObject ruleExportCSV() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_path_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:820:2: ( (otherlv_0= 'Store(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:821:2: (otherlv_0= 'Store(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:821:2: (otherlv_0= 'Store(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ')' )
            // InternalMyDsl.g:822:3: otherlv_0= 'Store(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExportCSVAccess().getStoreKeyword_0());
            		
            // InternalMyDsl.g:826:3: ( (lv_path_1_0= RULE_STRING ) )
            // InternalMyDsl.g:827:4: (lv_path_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:827:4: (lv_path_1_0= RULE_STRING )
            // InternalMyDsl.g:828:5: lv_path_1_0= RULE_STRING
            {
            lv_path_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_path_1_0, grammarAccess.getExportCSVAccess().getPathSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExportCSVRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getExportCSVAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleExportCSV"


    // $ANTLR start "entryRuleExportJSON"
    // InternalMyDsl.g:852:1: entryRuleExportJSON returns [EObject current=null] : iv_ruleExportJSON= ruleExportJSON EOF ;
    public final EObject entryRuleExportJSON() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExportJSON = null;


        try {
            // InternalMyDsl.g:852:51: (iv_ruleExportJSON= ruleExportJSON EOF )
            // InternalMyDsl.g:853:2: iv_ruleExportJSON= ruleExportJSON EOF
            {
             newCompositeNode(grammarAccess.getExportJSONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExportJSON=ruleExportJSON();

            state._fsp--;

             current =iv_ruleExportJSON; 
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
    // $ANTLR end "entryRuleExportJSON"


    // $ANTLR start "ruleExportJSON"
    // InternalMyDsl.g:859:1: ruleExportJSON returns [EObject current=null] : (otherlv_0= 'Export(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ')' ) ;
    public final EObject ruleExportJSON() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_path_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:865:2: ( (otherlv_0= 'Export(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:866:2: (otherlv_0= 'Export(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:866:2: (otherlv_0= 'Export(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ')' )
            // InternalMyDsl.g:867:3: otherlv_0= 'Export(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExportJSONAccess().getExportKeyword_0());
            		
            // InternalMyDsl.g:871:3: ( (lv_path_1_0= RULE_STRING ) )
            // InternalMyDsl.g:872:4: (lv_path_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:872:4: (lv_path_1_0= RULE_STRING )
            // InternalMyDsl.g:873:5: lv_path_1_0= RULE_STRING
            {
            lv_path_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_path_1_0, grammarAccess.getExportJSONAccess().getPathSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExportJSONRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getExportJSONAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleExportJSON"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:897:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:897:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:898:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalMyDsl.g:904:1: ruleExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | this_Binexpr_1= ruleBinexpr | this_NoneValue_2= ruleNoneValue ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        EObject this_Binexpr_1 = null;

        EObject this_NoneValue_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:910:2: ( (this_PrimaryExpression_0= rulePrimaryExpression | this_Binexpr_1= ruleBinexpr | this_NoneValue_2= ruleNoneValue ) )
            // InternalMyDsl.g:911:2: (this_PrimaryExpression_0= rulePrimaryExpression | this_Binexpr_1= ruleBinexpr | this_NoneValue_2= ruleNoneValue )
            {
            // InternalMyDsl.g:911:2: (this_PrimaryExpression_0= rulePrimaryExpression | this_Binexpr_1= ruleBinexpr | this_NoneValue_2= ruleNoneValue )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                {
                alt11=1;
                }
                break;
            case 31:
                {
                alt11=2;
                }
                break;
            case 36:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:912:3: this_PrimaryExpression_0= rulePrimaryExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getPrimaryExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpression_0=rulePrimaryExpression();

                    state._fsp--;


                    			current = this_PrimaryExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:921:3: this_Binexpr_1= ruleBinexpr
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getBinexprParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Binexpr_1=ruleBinexpr();

                    state._fsp--;


                    			current = this_Binexpr_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:930:3: this_NoneValue_2= ruleNoneValue
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getNoneValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NoneValue_2=ruleNoneValue();

                    state._fsp--;


                    			current = this_NoneValue_2;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalMyDsl.g:942:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalMyDsl.g:942:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalMyDsl.g:943:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalMyDsl.g:949:1: rulePrimaryExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_Selectcell_1= ruleSelectcell | this_Linesum_2= ruleLinesum | this_Colsum_3= ruleColsum | this_Lineprod_4= ruleLineprod | this_Colprod_5= ruleColprod ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_Selectcell_1 = null;

        EObject this_Linesum_2 = null;

        EObject this_Colsum_3 = null;

        EObject this_Lineprod_4 = null;

        EObject this_Colprod_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:955:2: ( (this_IntValue_0= ruleIntValue | this_Selectcell_1= ruleSelectcell | this_Linesum_2= ruleLinesum | this_Colsum_3= ruleColsum | this_Lineprod_4= ruleLineprod | this_Colprod_5= ruleColprod ) )
            // InternalMyDsl.g:956:2: (this_IntValue_0= ruleIntValue | this_Selectcell_1= ruleSelectcell | this_Linesum_2= ruleLinesum | this_Colsum_3= ruleColsum | this_Lineprod_4= ruleLineprod | this_Colprod_5= ruleColprod )
            {
            // InternalMyDsl.g:956:2: (this_IntValue_0= ruleIntValue | this_Selectcell_1= ruleSelectcell | this_Linesum_2= ruleLinesum | this_Colsum_3= ruleColsum | this_Lineprod_4= ruleLineprod | this_Colprod_5= ruleColprod )
            int alt12=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt12=1;
                }
                break;
            case 26:
                {
                alt12=2;
                }
                break;
            case 27:
                {
                alt12=3;
                }
                break;
            case 28:
                {
                alt12=4;
                }
                break;
            case RULE_STRING:
                {
                int LA12_5 = input.LA(2);

                if ( (LA12_5==12) ) {
                    alt12=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 5, input);

                    throw nvae;
                }
                }
                break;
            case 29:
                {
                alt12=5;
                }
                break;
            case 30:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:957:3: this_IntValue_0= ruleIntValue
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getIntValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntValue_0=ruleIntValue();

                    state._fsp--;


                    			current = this_IntValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:966:3: this_Selectcell_1= ruleSelectcell
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getSelectcellParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Selectcell_1=ruleSelectcell();

                    state._fsp--;


                    			current = this_Selectcell_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:975:3: this_Linesum_2= ruleLinesum
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLinesumParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Linesum_2=ruleLinesum();

                    state._fsp--;


                    			current = this_Linesum_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:984:3: this_Colsum_3= ruleColsum
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getColsumParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Colsum_3=ruleColsum();

                    state._fsp--;


                    			current = this_Colsum_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:993:3: this_Lineprod_4= ruleLineprod
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLineprodParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Lineprod_4=ruleLineprod();

                    state._fsp--;


                    			current = this_Lineprod_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1002:3: this_Colprod_5= ruleColprod
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getColprodParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Colprod_5=ruleColprod();

                    state._fsp--;


                    			current = this_Colprod_5;
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleSelectcell"
    // InternalMyDsl.g:1014:1: entryRuleSelectcell returns [EObject current=null] : iv_ruleSelectcell= ruleSelectcell EOF ;
    public final EObject entryRuleSelectcell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectcell = null;


        try {
            // InternalMyDsl.g:1014:51: (iv_ruleSelectcell= ruleSelectcell EOF )
            // InternalMyDsl.g:1015:2: iv_ruleSelectcell= ruleSelectcell EOF
            {
             newCompositeNode(grammarAccess.getSelectcellRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectcell=ruleSelectcell();

            state._fsp--;

             current =iv_ruleSelectcell; 
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
    // $ANTLR end "entryRuleSelectcell"


    // $ANTLR start "ruleSelectcell"
    // InternalMyDsl.g:1021:1: ruleSelectcell returns [EObject current=null] : (otherlv_0= 'Selectcell(' ( (lv_cellX_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_cellY_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleSelectcell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_cellX_1_0 = null;

        EObject lv_cellY_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1027:2: ( (otherlv_0= 'Selectcell(' ( (lv_cellX_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_cellY_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalMyDsl.g:1028:2: (otherlv_0= 'Selectcell(' ( (lv_cellX_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_cellY_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalMyDsl.g:1028:2: (otherlv_0= 'Selectcell(' ( (lv_cellX_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_cellY_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalMyDsl.g:1029:3: otherlv_0= 'Selectcell(' ( (lv_cellX_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_cellY_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectcellAccess().getSelectcellKeyword_0());
            		
            // InternalMyDsl.g:1033:3: ( (lv_cellX_1_0= ruleExpression ) )
            // InternalMyDsl.g:1034:4: (lv_cellX_1_0= ruleExpression )
            {
            // InternalMyDsl.g:1034:4: (lv_cellX_1_0= ruleExpression )
            // InternalMyDsl.g:1035:5: lv_cellX_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSelectcellAccess().getCellXExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_cellX_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectcellRule());
            					}
            					set(
            						current,
            						"cellX",
            						lv_cellX_1_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectcellAccess().getCommaKeyword_2());
            		
            // InternalMyDsl.g:1056:3: ( (lv_cellY_3_0= ruleExpression ) )
            // InternalMyDsl.g:1057:4: (lv_cellY_3_0= ruleExpression )
            {
            // InternalMyDsl.g:1057:4: (lv_cellY_3_0= ruleExpression )
            // InternalMyDsl.g:1058:5: lv_cellY_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSelectcellAccess().getCellYExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_cellY_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectcellRule());
            					}
            					set(
            						current,
            						"cellY",
            						lv_cellY_3_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSelectcellAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleSelectcell"


    // $ANTLR start "entryRuleLinesum"
    // InternalMyDsl.g:1083:1: entryRuleLinesum returns [EObject current=null] : iv_ruleLinesum= ruleLinesum EOF ;
    public final EObject entryRuleLinesum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinesum = null;


        try {
            // InternalMyDsl.g:1083:48: (iv_ruleLinesum= ruleLinesum EOF )
            // InternalMyDsl.g:1084:2: iv_ruleLinesum= ruleLinesum EOF
            {
             newCompositeNode(grammarAccess.getLinesumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinesum=ruleLinesum();

            state._fsp--;

             current =iv_ruleLinesum; 
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
    // $ANTLR end "entryRuleLinesum"


    // $ANTLR start "ruleLinesum"
    // InternalMyDsl.g:1090:1: ruleLinesum returns [EObject current=null] : (otherlv_0= 'Linesum(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleLinesum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_lineIndex_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1096:2: ( (otherlv_0= 'Linesum(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:1097:2: (otherlv_0= 'Linesum(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:1097:2: (otherlv_0= 'Linesum(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')' )
            // InternalMyDsl.g:1098:3: otherlv_0= 'Linesum(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLinesumAccess().getLinesumKeyword_0());
            		
            // InternalMyDsl.g:1102:3: ( (lv_lineIndex_1_0= ruleExpression ) )
            // InternalMyDsl.g:1103:4: (lv_lineIndex_1_0= ruleExpression )
            {
            // InternalMyDsl.g:1103:4: (lv_lineIndex_1_0= ruleExpression )
            // InternalMyDsl.g:1104:5: lv_lineIndex_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getLinesumAccess().getLineIndexExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_lineIndex_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinesumRule());
            					}
            					set(
            						current,
            						"lineIndex",
            						lv_lineIndex_1_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getLinesumAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleLinesum"


    // $ANTLR start "entryRuleColsum"
    // InternalMyDsl.g:1129:1: entryRuleColsum returns [EObject current=null] : iv_ruleColsum= ruleColsum EOF ;
    public final EObject entryRuleColsum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColsum = null;


        try {
            // InternalMyDsl.g:1129:47: (iv_ruleColsum= ruleColsum EOF )
            // InternalMyDsl.g:1130:2: iv_ruleColsum= ruleColsum EOF
            {
             newCompositeNode(grammarAccess.getColsumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColsum=ruleColsum();

            state._fsp--;

             current =iv_ruleColsum; 
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
    // $ANTLR end "entryRuleColsum"


    // $ANTLR start "ruleColsum"
    // InternalMyDsl.g:1136:1: ruleColsum returns [EObject current=null] : ( (otherlv_0= 'Colsum(' ( (lv_colIndex_1_0= ruleExpression ) ) ) | ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' ) ) ;
    public final EObject ruleColsum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_colIndex_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1142:2: ( ( (otherlv_0= 'Colsum(' ( (lv_colIndex_1_0= ruleExpression ) ) ) | ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' ) ) )
            // InternalMyDsl.g:1143:2: ( (otherlv_0= 'Colsum(' ( (lv_colIndex_1_0= ruleExpression ) ) ) | ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            {
            // InternalMyDsl.g:1143:2: ( (otherlv_0= 'Colsum(' ( (lv_colIndex_1_0= ruleExpression ) ) ) | ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_STRING) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1144:3: (otherlv_0= 'Colsum(' ( (lv_colIndex_1_0= ruleExpression ) ) )
                    {
                    // InternalMyDsl.g:1144:3: (otherlv_0= 'Colsum(' ( (lv_colIndex_1_0= ruleExpression ) ) )
                    // InternalMyDsl.g:1145:4: otherlv_0= 'Colsum(' ( (lv_colIndex_1_0= ruleExpression ) )
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getColsumAccess().getColsumKeyword_0_0());
                    			
                    // InternalMyDsl.g:1149:4: ( (lv_colIndex_1_0= ruleExpression ) )
                    // InternalMyDsl.g:1150:5: (lv_colIndex_1_0= ruleExpression )
                    {
                    // InternalMyDsl.g:1150:5: (lv_colIndex_1_0= ruleExpression )
                    // InternalMyDsl.g:1151:6: lv_colIndex_1_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getColsumAccess().getColIndexExpressionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_colIndex_1_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColsumRule());
                    						}
                    						set(
                    							current,
                    							"colIndex",
                    							lv_colIndex_1_0,
                    							"org.xtext.example.mydsl.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1170:3: ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' )
                    {
                    // InternalMyDsl.g:1170:3: ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' )
                    // InternalMyDsl.g:1171:4: ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')'
                    {
                    // InternalMyDsl.g:1171:4: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalMyDsl.g:1172:5: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:1172:5: (lv_name_2_0= RULE_STRING )
                    // InternalMyDsl.g:1173:6: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getColsumAccess().getNameSTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColsumRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getColsumAccess().getRightParenthesisKeyword_1_1());
                    			

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
    // $ANTLR end "ruleColsum"


    // $ANTLR start "entryRuleLineprod"
    // InternalMyDsl.g:1198:1: entryRuleLineprod returns [EObject current=null] : iv_ruleLineprod= ruleLineprod EOF ;
    public final EObject entryRuleLineprod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineprod = null;


        try {
            // InternalMyDsl.g:1198:49: (iv_ruleLineprod= ruleLineprod EOF )
            // InternalMyDsl.g:1199:2: iv_ruleLineprod= ruleLineprod EOF
            {
             newCompositeNode(grammarAccess.getLineprodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLineprod=ruleLineprod();

            state._fsp--;

             current =iv_ruleLineprod; 
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
    // $ANTLR end "entryRuleLineprod"


    // $ANTLR start "ruleLineprod"
    // InternalMyDsl.g:1205:1: ruleLineprod returns [EObject current=null] : (otherlv_0= 'Lineprod(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleLineprod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_lineIndex_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1211:2: ( (otherlv_0= 'Lineprod(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:1212:2: (otherlv_0= 'Lineprod(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:1212:2: (otherlv_0= 'Lineprod(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')' )
            // InternalMyDsl.g:1213:3: otherlv_0= 'Lineprod(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLineprodAccess().getLineprodKeyword_0());
            		
            // InternalMyDsl.g:1217:3: ( (lv_lineIndex_1_0= ruleExpression ) )
            // InternalMyDsl.g:1218:4: (lv_lineIndex_1_0= ruleExpression )
            {
            // InternalMyDsl.g:1218:4: (lv_lineIndex_1_0= ruleExpression )
            // InternalMyDsl.g:1219:5: lv_lineIndex_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getLineprodAccess().getLineIndexExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_lineIndex_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLineprodRule());
            					}
            					set(
            						current,
            						"lineIndex",
            						lv_lineIndex_1_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getLineprodAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleLineprod"


    // $ANTLR start "entryRuleColprod"
    // InternalMyDsl.g:1244:1: entryRuleColprod returns [EObject current=null] : iv_ruleColprod= ruleColprod EOF ;
    public final EObject entryRuleColprod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColprod = null;


        try {
            // InternalMyDsl.g:1244:48: (iv_ruleColprod= ruleColprod EOF )
            // InternalMyDsl.g:1245:2: iv_ruleColprod= ruleColprod EOF
            {
             newCompositeNode(grammarAccess.getColprodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColprod=ruleColprod();

            state._fsp--;

             current =iv_ruleColprod; 
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
    // $ANTLR end "entryRuleColprod"


    // $ANTLR start "ruleColprod"
    // InternalMyDsl.g:1251:1: ruleColprod returns [EObject current=null] : ( (otherlv_0= 'Colprod(' ( (lv_colIndex_1_0= ruleExpression ) ) ) | ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' ) ) ;
    public final EObject ruleColprod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_colIndex_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1257:2: ( ( (otherlv_0= 'Colprod(' ( (lv_colIndex_1_0= ruleExpression ) ) ) | ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' ) ) )
            // InternalMyDsl.g:1258:2: ( (otherlv_0= 'Colprod(' ( (lv_colIndex_1_0= ruleExpression ) ) ) | ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            {
            // InternalMyDsl.g:1258:2: ( (otherlv_0= 'Colprod(' ( (lv_colIndex_1_0= ruleExpression ) ) ) | ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_STRING) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1259:3: (otherlv_0= 'Colprod(' ( (lv_colIndex_1_0= ruleExpression ) ) )
                    {
                    // InternalMyDsl.g:1259:3: (otherlv_0= 'Colprod(' ( (lv_colIndex_1_0= ruleExpression ) ) )
                    // InternalMyDsl.g:1260:4: otherlv_0= 'Colprod(' ( (lv_colIndex_1_0= ruleExpression ) )
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getColprodAccess().getColprodKeyword_0_0());
                    			
                    // InternalMyDsl.g:1264:4: ( (lv_colIndex_1_0= ruleExpression ) )
                    // InternalMyDsl.g:1265:5: (lv_colIndex_1_0= ruleExpression )
                    {
                    // InternalMyDsl.g:1265:5: (lv_colIndex_1_0= ruleExpression )
                    // InternalMyDsl.g:1266:6: lv_colIndex_1_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getColprodAccess().getColIndexExpressionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_colIndex_1_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColprodRule());
                    						}
                    						set(
                    							current,
                    							"colIndex",
                    							lv_colIndex_1_0,
                    							"org.xtext.example.mydsl.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1285:3: ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' )
                    {
                    // InternalMyDsl.g:1285:3: ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' )
                    // InternalMyDsl.g:1286:4: ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')'
                    {
                    // InternalMyDsl.g:1286:4: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalMyDsl.g:1287:5: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:1287:5: (lv_name_2_0= RULE_STRING )
                    // InternalMyDsl.g:1288:6: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getColprodAccess().getNameSTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColprodRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getColprodAccess().getRightParenthesisKeyword_1_1());
                    			

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
    // $ANTLR end "ruleColprod"


    // $ANTLR start "entryRuleBinexpr"
    // InternalMyDsl.g:1313:1: entryRuleBinexpr returns [EObject current=null] : iv_ruleBinexpr= ruleBinexpr EOF ;
    public final EObject entryRuleBinexpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinexpr = null;


        try {
            // InternalMyDsl.g:1313:48: (iv_ruleBinexpr= ruleBinexpr EOF )
            // InternalMyDsl.g:1314:2: iv_ruleBinexpr= ruleBinexpr EOF
            {
             newCompositeNode(grammarAccess.getBinexprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinexpr=ruleBinexpr();

            state._fsp--;

             current =iv_ruleBinexpr; 
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
    // $ANTLR end "entryRuleBinexpr"


    // $ANTLR start "ruleBinexpr"
    // InternalMyDsl.g:1320:1: ruleBinexpr returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= rulePrimaryExpression ) ) ( (lv_op_2_0= ruleOp ) ) ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleBinexpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1326:2: ( (otherlv_0= '(' ( (lv_left_1_0= rulePrimaryExpression ) ) ( (lv_op_2_0= ruleOp ) ) ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalMyDsl.g:1327:2: (otherlv_0= '(' ( (lv_left_1_0= rulePrimaryExpression ) ) ( (lv_op_2_0= ruleOp ) ) ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalMyDsl.g:1327:2: (otherlv_0= '(' ( (lv_left_1_0= rulePrimaryExpression ) ) ( (lv_op_2_0= ruleOp ) ) ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalMyDsl.g:1328:3: otherlv_0= '(' ( (lv_left_1_0= rulePrimaryExpression ) ) ( (lv_op_2_0= ruleOp ) ) ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getBinexprAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyDsl.g:1332:3: ( (lv_left_1_0= rulePrimaryExpression ) )
            // InternalMyDsl.g:1333:4: (lv_left_1_0= rulePrimaryExpression )
            {
            // InternalMyDsl.g:1333:4: (lv_left_1_0= rulePrimaryExpression )
            // InternalMyDsl.g:1334:5: lv_left_1_0= rulePrimaryExpression
            {

            					newCompositeNode(grammarAccess.getBinexprAccess().getLeftPrimaryExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_left_1_0=rulePrimaryExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinexprRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_1_0,
            						"org.xtext.example.mydsl.MyDsl.PrimaryExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1351:3: ( (lv_op_2_0= ruleOp ) )
            // InternalMyDsl.g:1352:4: (lv_op_2_0= ruleOp )
            {
            // InternalMyDsl.g:1352:4: (lv_op_2_0= ruleOp )
            // InternalMyDsl.g:1353:5: lv_op_2_0= ruleOp
            {

            					newCompositeNode(grammarAccess.getBinexprAccess().getOpOpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_op_2_0=ruleOp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinexprRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_2_0,
            						"org.xtext.example.mydsl.MyDsl.Op");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1370:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalMyDsl.g:1371:4: (lv_right_3_0= ruleExpression )
            {
            // InternalMyDsl.g:1371:4: (lv_right_3_0= ruleExpression )
            // InternalMyDsl.g:1372:5: lv_right_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBinexprAccess().getRightExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_right_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinexprRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_3_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBinexprAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleBinexpr"


    // $ANTLR start "entryRuleOp"
    // InternalMyDsl.g:1397:1: entryRuleOp returns [String current=null] : iv_ruleOp= ruleOp EOF ;
    public final String entryRuleOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOp = null;


        try {
            // InternalMyDsl.g:1397:42: (iv_ruleOp= ruleOp EOF )
            // InternalMyDsl.g:1398:2: iv_ruleOp= ruleOp EOF
            {
             newCompositeNode(grammarAccess.getOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOp=ruleOp();

            state._fsp--;

             current =iv_ruleOp.getText(); 
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
    // $ANTLR end "entryRuleOp"


    // $ANTLR start "ruleOp"
    // InternalMyDsl.g:1404:1: ruleOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1410:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) )
            // InternalMyDsl.g:1411:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            {
            // InternalMyDsl.g:1411:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt15=1;
                }
                break;
            case 33:
                {
                alt15=2;
                }
                break;
            case 34:
                {
                alt15=3;
                }
                break;
            case 35:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1412:3: kw= '+'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1418:3: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1424:3: kw= '*'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1430:3: kw= '/'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpAccess().getSolidusKeyword_3());
                    		

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
    // $ANTLR end "ruleOp"


    // $ANTLR start "entryRuleNoneValue"
    // InternalMyDsl.g:1439:1: entryRuleNoneValue returns [EObject current=null] : iv_ruleNoneValue= ruleNoneValue EOF ;
    public final EObject entryRuleNoneValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoneValue = null;


        try {
            // InternalMyDsl.g:1439:50: (iv_ruleNoneValue= ruleNoneValue EOF )
            // InternalMyDsl.g:1440:2: iv_ruleNoneValue= ruleNoneValue EOF
            {
             newCompositeNode(grammarAccess.getNoneValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNoneValue=ruleNoneValue();

            state._fsp--;

             current =iv_ruleNoneValue; 
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
    // $ANTLR end "entryRuleNoneValue"


    // $ANTLR start "ruleNoneValue"
    // InternalMyDsl.g:1446:1: ruleNoneValue returns [EObject current=null] : ( (lv_value_0_0= 'None' ) ) ;
    public final EObject ruleNoneValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1452:2: ( ( (lv_value_0_0= 'None' ) ) )
            // InternalMyDsl.g:1453:2: ( (lv_value_0_0= 'None' ) )
            {
            // InternalMyDsl.g:1453:2: ( (lv_value_0_0= 'None' ) )
            // InternalMyDsl.g:1454:3: (lv_value_0_0= 'None' )
            {
            // InternalMyDsl.g:1454:3: (lv_value_0_0= 'None' )
            // InternalMyDsl.g:1455:4: lv_value_0_0= 'None'
            {
            lv_value_0_0=(Token)match(input,36,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNoneValueAccess().getValueNoneKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNoneValueRule());
            				}
            				setWithLastConsumed(current, "value", lv_value_0_0, "None");
            			

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
    // $ANTLR end "ruleNoneValue"


    // $ANTLR start "entryRuleIntValue"
    // InternalMyDsl.g:1470:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalMyDsl.g:1470:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalMyDsl.g:1471:2: iv_ruleIntValue= ruleIntValue EOF
            {
             newCompositeNode(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;

             current =iv_ruleIntValue; 
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
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalMyDsl.g:1477:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1483:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalMyDsl.g:1484:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalMyDsl.g:1484:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalMyDsl.g:1485:3: (lv_value_0_0= RULE_INT )
            {
            // InternalMyDsl.g:1485:3: (lv_value_0_0= RULE_INT )
            // InternalMyDsl.g:1486:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalMyDsl.g:1505:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalMyDsl.g:1505:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalMyDsl.g:1506:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalMyDsl.g:1512:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1518:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1519:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:1519:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMyDsl.g:1520:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:1520:3: (lv_value_0_0= RULE_STRING )
            // InternalMyDsl.g:1521:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleStringValue"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000003FA4010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000010FC000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000007C000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000F00000000L});

}