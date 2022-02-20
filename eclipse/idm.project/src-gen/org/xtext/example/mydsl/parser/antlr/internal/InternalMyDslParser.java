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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Load('", "')'", "'{'", "'}'", "'Create()'", "';'", "'InsertCol('", "','", "'RemoveCol('", "'InsertLine('", "'RemoveLine('", "'Insert('", "'Print('", "'Store('", "'Export('", "'('", "'Selectcell('", "'Linesum('", "'Colsum('", "'Lineprod('", "'Colprod('", "'+'", "'-'", "'*'", "'/'", "'None'"
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
    // InternalMyDsl.g:143:1: ruleLoad returns [EObject current=null] : (otherlv_0= 'Load(' ( (lv_path_1_0= ruleStringValue ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}' ) ;
    public final EObject ruleLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_path_1_0 = null;

        EObject lv_instructions_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:149:2: ( (otherlv_0= 'Load(' ( (lv_path_1_0= ruleStringValue ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}' ) )
            // InternalMyDsl.g:150:2: (otherlv_0= 'Load(' ( (lv_path_1_0= ruleStringValue ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}' )
            {
            // InternalMyDsl.g:150:2: (otherlv_0= 'Load(' ( (lv_path_1_0= ruleStringValue ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}' )
            // InternalMyDsl.g:151:3: otherlv_0= 'Load(' ( (lv_path_1_0= ruleStringValue ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadAccess().getLoadKeyword_0());
            		
            // InternalMyDsl.g:155:3: ( (lv_path_1_0= ruleStringValue ) )
            // InternalMyDsl.g:156:4: (lv_path_1_0= ruleStringValue )
            {
            // InternalMyDsl.g:156:4: (lv_path_1_0= ruleStringValue )
            // InternalMyDsl.g:157:5: lv_path_1_0= ruleStringValue
            {

            					newCompositeNode(grammarAccess.getLoadAccess().getPathStringValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_path_1_0=ruleStringValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoadRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_1_0,
            						"org.xtext.example.mydsl.MyDsl.StringValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLoadAccess().getRightParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getLoadAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:182:3: ( (lv_instructions_4_0= ruleInstruction ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17||(LA3_0>=19 && LA3_0<=25)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:183:4: (lv_instructions_4_0= ruleInstruction )
            	    {
            	    // InternalMyDsl.g:183:4: (lv_instructions_4_0= ruleInstruction )
            	    // InternalMyDsl.g:184:5: lv_instructions_4_0= ruleInstruction
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
    // InternalMyDsl.g:209:1: entryRuleCreate returns [EObject current=null] : iv_ruleCreate= ruleCreate EOF ;
    public final EObject entryRuleCreate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreate = null;


        try {
            // InternalMyDsl.g:209:47: (iv_ruleCreate= ruleCreate EOF )
            // InternalMyDsl.g:210:2: iv_ruleCreate= ruleCreate EOF
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
    // InternalMyDsl.g:216:1: ruleCreate returns [EObject current=null] : (otherlv_0= 'Create()' otherlv_1= '{' ( (lv_instructions_2_0= ruleInstruction ) )* otherlv_3= '}' ) ;
    public final EObject ruleCreate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_instructions_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:222:2: ( (otherlv_0= 'Create()' otherlv_1= '{' ( (lv_instructions_2_0= ruleInstruction ) )* otherlv_3= '}' ) )
            // InternalMyDsl.g:223:2: (otherlv_0= 'Create()' otherlv_1= '{' ( (lv_instructions_2_0= ruleInstruction ) )* otherlv_3= '}' )
            {
            // InternalMyDsl.g:223:2: (otherlv_0= 'Create()' otherlv_1= '{' ( (lv_instructions_2_0= ruleInstruction ) )* otherlv_3= '}' )
            // InternalMyDsl.g:224:3: otherlv_0= 'Create()' otherlv_1= '{' ( (lv_instructions_2_0= ruleInstruction ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:232:3: ( (lv_instructions_2_0= ruleInstruction ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17||(LA4_0>=19 && LA4_0<=25)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:233:4: (lv_instructions_2_0= ruleInstruction )
            	    {
            	    // InternalMyDsl.g:233:4: (lv_instructions_2_0= ruleInstruction )
            	    // InternalMyDsl.g:234:5: lv_instructions_2_0= ruleInstruction
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
    // InternalMyDsl.g:259:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalMyDsl.g:259:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalMyDsl.g:260:2: iv_ruleInstruction= ruleInstruction EOF
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
    // InternalMyDsl.g:266:1: ruleInstruction returns [EObject current=null] : ( (this_InsertLine_0= ruleInsertLine | this_RemoveLine_1= ruleRemoveLine | this_InsertCol_2= ruleInsertCol | this_RemoveCol_3= ruleRemoveCol | this_Insert_4= ruleInsert | this_ExportJSON_5= ruleExportJSON | this_ExportCSV_6= ruleExportCSV | this_Print_7= rulePrint ) otherlv_8= ';' ) ;
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
            // InternalMyDsl.g:272:2: ( ( (this_InsertLine_0= ruleInsertLine | this_RemoveLine_1= ruleRemoveLine | this_InsertCol_2= ruleInsertCol | this_RemoveCol_3= ruleRemoveCol | this_Insert_4= ruleInsert | this_ExportJSON_5= ruleExportJSON | this_ExportCSV_6= ruleExportCSV | this_Print_7= rulePrint ) otherlv_8= ';' ) )
            // InternalMyDsl.g:273:2: ( (this_InsertLine_0= ruleInsertLine | this_RemoveLine_1= ruleRemoveLine | this_InsertCol_2= ruleInsertCol | this_RemoveCol_3= ruleRemoveCol | this_Insert_4= ruleInsert | this_ExportJSON_5= ruleExportJSON | this_ExportCSV_6= ruleExportCSV | this_Print_7= rulePrint ) otherlv_8= ';' )
            {
            // InternalMyDsl.g:273:2: ( (this_InsertLine_0= ruleInsertLine | this_RemoveLine_1= ruleRemoveLine | this_InsertCol_2= ruleInsertCol | this_RemoveCol_3= ruleRemoveCol | this_Insert_4= ruleInsert | this_ExportJSON_5= ruleExportJSON | this_ExportCSV_6= ruleExportCSV | this_Print_7= rulePrint ) otherlv_8= ';' )
            // InternalMyDsl.g:274:3: (this_InsertLine_0= ruleInsertLine | this_RemoveLine_1= ruleRemoveLine | this_InsertCol_2= ruleInsertCol | this_RemoveCol_3= ruleRemoveCol | this_Insert_4= ruleInsert | this_ExportJSON_5= ruleExportJSON | this_ExportCSV_6= ruleExportCSV | this_Print_7= rulePrint ) otherlv_8= ';'
            {
            // InternalMyDsl.g:274:3: (this_InsertLine_0= ruleInsertLine | this_RemoveLine_1= ruleRemoveLine | this_InsertCol_2= ruleInsertCol | this_RemoveCol_3= ruleRemoveCol | this_Insert_4= ruleInsert | this_ExportJSON_5= ruleExportJSON | this_ExportCSV_6= ruleExportCSV | this_Print_7= rulePrint )
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
                    // InternalMyDsl.g:275:4: this_InsertLine_0= ruleInsertLine
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
                    // InternalMyDsl.g:284:4: this_RemoveLine_1= ruleRemoveLine
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
                    // InternalMyDsl.g:293:4: this_InsertCol_2= ruleInsertCol
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
                    // InternalMyDsl.g:302:4: this_RemoveCol_3= ruleRemoveCol
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
                    // InternalMyDsl.g:311:4: this_Insert_4= ruleInsert
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
                    // InternalMyDsl.g:320:4: this_ExportJSON_5= ruleExportJSON
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
                    // InternalMyDsl.g:329:4: this_ExportCSV_6= ruleExportCSV
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
                    // InternalMyDsl.g:338:4: this_Print_7= rulePrint
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
    // InternalMyDsl.g:355:1: entryRuleInsertCol returns [EObject current=null] : iv_ruleInsertCol= ruleInsertCol EOF ;
    public final EObject entryRuleInsertCol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertCol = null;


        try {
            // InternalMyDsl.g:355:50: (iv_ruleInsertCol= ruleInsertCol EOF )
            // InternalMyDsl.g:356:2: iv_ruleInsertCol= ruleInsertCol EOF
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
    // InternalMyDsl.g:362:1: ruleInsertCol returns [EObject current=null] : (otherlv_0= 'InsertCol(' ( (lv_colIndex_1_0= ruleMathExpression ) ) otherlv_2= ',' ( (lv_colName_3_0= ruleStringValue ) ) otherlv_4= ')' ) ;
    public final EObject ruleInsertCol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_colIndex_1_0 = null;

        EObject lv_colName_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:368:2: ( (otherlv_0= 'InsertCol(' ( (lv_colIndex_1_0= ruleMathExpression ) ) otherlv_2= ',' ( (lv_colName_3_0= ruleStringValue ) ) otherlv_4= ')' ) )
            // InternalMyDsl.g:369:2: (otherlv_0= 'InsertCol(' ( (lv_colIndex_1_0= ruleMathExpression ) ) otherlv_2= ',' ( (lv_colName_3_0= ruleStringValue ) ) otherlv_4= ')' )
            {
            // InternalMyDsl.g:369:2: (otherlv_0= 'InsertCol(' ( (lv_colIndex_1_0= ruleMathExpression ) ) otherlv_2= ',' ( (lv_colName_3_0= ruleStringValue ) ) otherlv_4= ')' )
            // InternalMyDsl.g:370:3: otherlv_0= 'InsertCol(' ( (lv_colIndex_1_0= ruleMathExpression ) ) otherlv_2= ',' ( (lv_colName_3_0= ruleStringValue ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertColAccess().getInsertColKeyword_0());
            		
            // InternalMyDsl.g:374:3: ( (lv_colIndex_1_0= ruleMathExpression ) )
            // InternalMyDsl.g:375:4: (lv_colIndex_1_0= ruleMathExpression )
            {
            // InternalMyDsl.g:375:4: (lv_colIndex_1_0= ruleMathExpression )
            // InternalMyDsl.g:376:5: lv_colIndex_1_0= ruleMathExpression
            {

            					newCompositeNode(grammarAccess.getInsertColAccess().getColIndexMathExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_colIndex_1_0=ruleMathExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertColRule());
            					}
            					set(
            						current,
            						"colIndex",
            						lv_colIndex_1_0,
            						"org.xtext.example.mydsl.MyDsl.MathExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getInsertColAccess().getCommaKeyword_2());
            		
            // InternalMyDsl.g:397:3: ( (lv_colName_3_0= ruleStringValue ) )
            // InternalMyDsl.g:398:4: (lv_colName_3_0= ruleStringValue )
            {
            // InternalMyDsl.g:398:4: (lv_colName_3_0= ruleStringValue )
            // InternalMyDsl.g:399:5: lv_colName_3_0= ruleStringValue
            {

            					newCompositeNode(grammarAccess.getInsertColAccess().getColNameStringValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_colName_3_0=ruleStringValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertColRule());
            					}
            					set(
            						current,
            						"colName",
            						lv_colName_3_0,
            						"org.xtext.example.mydsl.MyDsl.StringValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInsertColAccess().getRightParenthesisKeyword_4());
            		

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
    // InternalMyDsl.g:424:1: entryRuleRemoveCol returns [EObject current=null] : iv_ruleRemoveCol= ruleRemoveCol EOF ;
    public final EObject entryRuleRemoveCol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveCol = null;


        try {
            // InternalMyDsl.g:424:50: (iv_ruleRemoveCol= ruleRemoveCol EOF )
            // InternalMyDsl.g:425:2: iv_ruleRemoveCol= ruleRemoveCol EOF
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
    // InternalMyDsl.g:431:1: ruleRemoveCol returns [EObject current=null] : (otherlv_0= 'RemoveCol(' ( (lv_colName_1_0= ruleStringValue ) ) otherlv_2= ')' ) ;
    public final EObject ruleRemoveCol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_colName_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:437:2: ( (otherlv_0= 'RemoveCol(' ( (lv_colName_1_0= ruleStringValue ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:438:2: (otherlv_0= 'RemoveCol(' ( (lv_colName_1_0= ruleStringValue ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:438:2: (otherlv_0= 'RemoveCol(' ( (lv_colName_1_0= ruleStringValue ) ) otherlv_2= ')' )
            // InternalMyDsl.g:439:3: otherlv_0= 'RemoveCol(' ( (lv_colName_1_0= ruleStringValue ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveColAccess().getRemoveColKeyword_0());
            		
            // InternalMyDsl.g:443:3: ( (lv_colName_1_0= ruleStringValue ) )
            // InternalMyDsl.g:444:4: (lv_colName_1_0= ruleStringValue )
            {
            // InternalMyDsl.g:444:4: (lv_colName_1_0= ruleStringValue )
            // InternalMyDsl.g:445:5: lv_colName_1_0= ruleStringValue
            {

            					newCompositeNode(grammarAccess.getRemoveColAccess().getColNameStringValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_colName_1_0=ruleStringValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRemoveColRule());
            					}
            					set(
            						current,
            						"colName",
            						lv_colName_1_0,
            						"org.xtext.example.mydsl.MyDsl.StringValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRemoveColAccess().getRightParenthesisKeyword_2());
            		

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
    // InternalMyDsl.g:470:1: entryRuleInsertLine returns [EObject current=null] : iv_ruleInsertLine= ruleInsertLine EOF ;
    public final EObject entryRuleInsertLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertLine = null;


        try {
            // InternalMyDsl.g:470:51: (iv_ruleInsertLine= ruleInsertLine EOF )
            // InternalMyDsl.g:471:2: iv_ruleInsertLine= ruleInsertLine EOF
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
    // InternalMyDsl.g:477:1: ruleInsertLine returns [EObject current=null] : (otherlv_0= 'InsertLine(' ( (lv_lineIndex_1_0= ruleMathExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleInsertLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_lineIndex_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:483:2: ( (otherlv_0= 'InsertLine(' ( (lv_lineIndex_1_0= ruleMathExpression ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:484:2: (otherlv_0= 'InsertLine(' ( (lv_lineIndex_1_0= ruleMathExpression ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:484:2: (otherlv_0= 'InsertLine(' ( (lv_lineIndex_1_0= ruleMathExpression ) ) otherlv_2= ')' )
            // InternalMyDsl.g:485:3: otherlv_0= 'InsertLine(' ( (lv_lineIndex_1_0= ruleMathExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertLineAccess().getInsertLineKeyword_0());
            		
            // InternalMyDsl.g:489:3: ( (lv_lineIndex_1_0= ruleMathExpression ) )
            // InternalMyDsl.g:490:4: (lv_lineIndex_1_0= ruleMathExpression )
            {
            // InternalMyDsl.g:490:4: (lv_lineIndex_1_0= ruleMathExpression )
            // InternalMyDsl.g:491:5: lv_lineIndex_1_0= ruleMathExpression
            {

            					newCompositeNode(grammarAccess.getInsertLineAccess().getLineIndexMathExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_lineIndex_1_0=ruleMathExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertLineRule());
            					}
            					set(
            						current,
            						"lineIndex",
            						lv_lineIndex_1_0,
            						"org.xtext.example.mydsl.MyDsl.MathExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getInsertLineAccess().getRightParenthesisKeyword_2());
            		

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
    // InternalMyDsl.g:516:1: entryRuleRemoveLine returns [EObject current=null] : iv_ruleRemoveLine= ruleRemoveLine EOF ;
    public final EObject entryRuleRemoveLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveLine = null;


        try {
            // InternalMyDsl.g:516:51: (iv_ruleRemoveLine= ruleRemoveLine EOF )
            // InternalMyDsl.g:517:2: iv_ruleRemoveLine= ruleRemoveLine EOF
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
    // InternalMyDsl.g:523:1: ruleRemoveLine returns [EObject current=null] : (otherlv_0= 'RemoveLine(' ( (lv_lineIndex_1_0= ruleMathExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleRemoveLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_lineIndex_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:529:2: ( (otherlv_0= 'RemoveLine(' ( (lv_lineIndex_1_0= ruleMathExpression ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:530:2: (otherlv_0= 'RemoveLine(' ( (lv_lineIndex_1_0= ruleMathExpression ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:530:2: (otherlv_0= 'RemoveLine(' ( (lv_lineIndex_1_0= ruleMathExpression ) ) otherlv_2= ')' )
            // InternalMyDsl.g:531:3: otherlv_0= 'RemoveLine(' ( (lv_lineIndex_1_0= ruleMathExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveLineAccess().getRemoveLineKeyword_0());
            		
            // InternalMyDsl.g:535:3: ( (lv_lineIndex_1_0= ruleMathExpression ) )
            // InternalMyDsl.g:536:4: (lv_lineIndex_1_0= ruleMathExpression )
            {
            // InternalMyDsl.g:536:4: (lv_lineIndex_1_0= ruleMathExpression )
            // InternalMyDsl.g:537:5: lv_lineIndex_1_0= ruleMathExpression
            {

            					newCompositeNode(grammarAccess.getRemoveLineAccess().getLineIndexMathExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_lineIndex_1_0=ruleMathExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRemoveLineRule());
            					}
            					set(
            						current,
            						"lineIndex",
            						lv_lineIndex_1_0,
            						"org.xtext.example.mydsl.MyDsl.MathExpression");
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
    // InternalMyDsl.g:562:1: entryRuleInsert returns [EObject current=null] : iv_ruleInsert= ruleInsert EOF ;
    public final EObject entryRuleInsert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsert = null;


        try {
            // InternalMyDsl.g:562:47: (iv_ruleInsert= ruleInsert EOF )
            // InternalMyDsl.g:563:2: iv_ruleInsert= ruleInsert EOF
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
    // InternalMyDsl.g:569:1: ruleInsert returns [EObject current=null] : (otherlv_0= 'Insert(' ( (lv_lineIndex_1_0= ruleMathExpression ) ) otherlv_2= ',' ( (lv_colName_3_0= ruleStringValue ) ) otherlv_4= ',' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleInsert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_lineIndex_1_0 = null;

        EObject lv_colName_3_0 = null;

        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:575:2: ( (otherlv_0= 'Insert(' ( (lv_lineIndex_1_0= ruleMathExpression ) ) otherlv_2= ',' ( (lv_colName_3_0= ruleStringValue ) ) otherlv_4= ',' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ')' ) )
            // InternalMyDsl.g:576:2: (otherlv_0= 'Insert(' ( (lv_lineIndex_1_0= ruleMathExpression ) ) otherlv_2= ',' ( (lv_colName_3_0= ruleStringValue ) ) otherlv_4= ',' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ')' )
            {
            // InternalMyDsl.g:576:2: (otherlv_0= 'Insert(' ( (lv_lineIndex_1_0= ruleMathExpression ) ) otherlv_2= ',' ( (lv_colName_3_0= ruleStringValue ) ) otherlv_4= ',' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ')' )
            // InternalMyDsl.g:577:3: otherlv_0= 'Insert(' ( (lv_lineIndex_1_0= ruleMathExpression ) ) otherlv_2= ',' ( (lv_colName_3_0= ruleStringValue ) ) otherlv_4= ',' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertAccess().getInsertKeyword_0());
            		
            // InternalMyDsl.g:581:3: ( (lv_lineIndex_1_0= ruleMathExpression ) )
            // InternalMyDsl.g:582:4: (lv_lineIndex_1_0= ruleMathExpression )
            {
            // InternalMyDsl.g:582:4: (lv_lineIndex_1_0= ruleMathExpression )
            // InternalMyDsl.g:583:5: lv_lineIndex_1_0= ruleMathExpression
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getLineIndexMathExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_lineIndex_1_0=ruleMathExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertRule());
            					}
            					set(
            						current,
            						"lineIndex",
            						lv_lineIndex_1_0,
            						"org.xtext.example.mydsl.MyDsl.MathExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getInsertAccess().getCommaKeyword_2());
            		
            // InternalMyDsl.g:604:3: ( (lv_colName_3_0= ruleStringValue ) )
            // InternalMyDsl.g:605:4: (lv_colName_3_0= ruleStringValue )
            {
            // InternalMyDsl.g:605:4: (lv_colName_3_0= ruleStringValue )
            // InternalMyDsl.g:606:5: lv_colName_3_0= ruleStringValue
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getColNameStringValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_colName_3_0=ruleStringValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertRule());
            					}
            					set(
            						current,
            						"colName",
            						lv_colName_3_0,
            						"org.xtext.example.mydsl.MyDsl.StringValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getInsertAccess().getCommaKeyword_4());
            		
            // InternalMyDsl.g:627:3: ( (lv_value_5_0= ruleExpression ) )
            // InternalMyDsl.g:628:4: (lv_value_5_0= ruleExpression )
            {
            // InternalMyDsl.g:628:4: (lv_value_5_0= ruleExpression )
            // InternalMyDsl.g:629:5: lv_value_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getValueExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_5);
            lv_value_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_5_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

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
    // InternalMyDsl.g:654:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalMyDsl.g:654:46: (iv_rulePrint= rulePrint EOF )
            // InternalMyDsl.g:655:2: iv_rulePrint= rulePrint EOF
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
    // InternalMyDsl.g:661:1: rulePrint returns [EObject current=null] : (otherlv_0= 'Print(' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ')' ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:667:2: ( (otherlv_0= 'Print(' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:668:2: (otherlv_0= 'Print(' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:668:2: (otherlv_0= 'Print(' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ')' )
            // InternalMyDsl.g:669:3: otherlv_0= 'Print(' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPrintKeyword_0());
            		
            // InternalMyDsl.g:673:3: ( (lv_value_1_0= ruleExpression ) )
            // InternalMyDsl.g:674:4: (lv_value_1_0= ruleExpression )
            {
            // InternalMyDsl.g:674:4: (lv_value_1_0= ruleExpression )
            // InternalMyDsl.g:675:5: lv_value_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getPrintAccess().getValueExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_value_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrintRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

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
    // InternalMyDsl.g:700:1: entryRuleExportCSV returns [EObject current=null] : iv_ruleExportCSV= ruleExportCSV EOF ;
    public final EObject entryRuleExportCSV() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExportCSV = null;


        try {
            // InternalMyDsl.g:700:50: (iv_ruleExportCSV= ruleExportCSV EOF )
            // InternalMyDsl.g:701:2: iv_ruleExportCSV= ruleExportCSV EOF
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
    // InternalMyDsl.g:707:1: ruleExportCSV returns [EObject current=null] : (otherlv_0= 'Store(' ( (lv_path_1_0= ruleStringValue ) ) otherlv_2= ')' ) ;
    public final EObject ruleExportCSV() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_path_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:713:2: ( (otherlv_0= 'Store(' ( (lv_path_1_0= ruleStringValue ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:714:2: (otherlv_0= 'Store(' ( (lv_path_1_0= ruleStringValue ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:714:2: (otherlv_0= 'Store(' ( (lv_path_1_0= ruleStringValue ) ) otherlv_2= ')' )
            // InternalMyDsl.g:715:3: otherlv_0= 'Store(' ( (lv_path_1_0= ruleStringValue ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExportCSVAccess().getStoreKeyword_0());
            		
            // InternalMyDsl.g:719:3: ( (lv_path_1_0= ruleStringValue ) )
            // InternalMyDsl.g:720:4: (lv_path_1_0= ruleStringValue )
            {
            // InternalMyDsl.g:720:4: (lv_path_1_0= ruleStringValue )
            // InternalMyDsl.g:721:5: lv_path_1_0= ruleStringValue
            {

            					newCompositeNode(grammarAccess.getExportCSVAccess().getPathStringValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_path_1_0=ruleStringValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExportCSVRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_1_0,
            						"org.xtext.example.mydsl.MyDsl.StringValue");
            					afterParserOrEnumRuleCall();
            				

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
    // InternalMyDsl.g:746:1: entryRuleExportJSON returns [EObject current=null] : iv_ruleExportJSON= ruleExportJSON EOF ;
    public final EObject entryRuleExportJSON() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExportJSON = null;


        try {
            // InternalMyDsl.g:746:51: (iv_ruleExportJSON= ruleExportJSON EOF )
            // InternalMyDsl.g:747:2: iv_ruleExportJSON= ruleExportJSON EOF
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
    // InternalMyDsl.g:753:1: ruleExportJSON returns [EObject current=null] : (otherlv_0= 'Export(' ( (lv_path_1_0= ruleStringValue ) ) otherlv_2= ')' ) ;
    public final EObject ruleExportJSON() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_path_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:759:2: ( (otherlv_0= 'Export(' ( (lv_path_1_0= ruleStringValue ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:760:2: (otherlv_0= 'Export(' ( (lv_path_1_0= ruleStringValue ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:760:2: (otherlv_0= 'Export(' ( (lv_path_1_0= ruleStringValue ) ) otherlv_2= ')' )
            // InternalMyDsl.g:761:3: otherlv_0= 'Export(' ( (lv_path_1_0= ruleStringValue ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExportJSONAccess().getExportKeyword_0());
            		
            // InternalMyDsl.g:765:3: ( (lv_path_1_0= ruleStringValue ) )
            // InternalMyDsl.g:766:4: (lv_path_1_0= ruleStringValue )
            {
            // InternalMyDsl.g:766:4: (lv_path_1_0= ruleStringValue )
            // InternalMyDsl.g:767:5: lv_path_1_0= ruleStringValue
            {

            					newCompositeNode(grammarAccess.getExportJSONAccess().getPathStringValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_path_1_0=ruleStringValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExportJSONRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_1_0,
            						"org.xtext.example.mydsl.MyDsl.StringValue");
            					afterParserOrEnumRuleCall();
            				

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
    // InternalMyDsl.g:792:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:792:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:793:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalMyDsl.g:799:1: ruleExpression returns [EObject current=null] : (this_MathPrimaryExpression_0= ruleMathPrimaryExpression | this_BinaryExpression_1= ruleBinaryExpression | this_NoneValue_2= ruleNoneValue | this_StringValue_3= ruleStringValue ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MathPrimaryExpression_0 = null;

        EObject this_BinaryExpression_1 = null;

        EObject this_NoneValue_2 = null;

        EObject this_StringValue_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:805:2: ( (this_MathPrimaryExpression_0= ruleMathPrimaryExpression | this_BinaryExpression_1= ruleBinaryExpression | this_NoneValue_2= ruleNoneValue | this_StringValue_3= ruleStringValue ) )
            // InternalMyDsl.g:806:2: (this_MathPrimaryExpression_0= ruleMathPrimaryExpression | this_BinaryExpression_1= ruleBinaryExpression | this_NoneValue_2= ruleNoneValue | this_StringValue_3= ruleStringValue )
            {
            // InternalMyDsl.g:806:2: (this_MathPrimaryExpression_0= ruleMathPrimaryExpression | this_BinaryExpression_1= ruleBinaryExpression | this_NoneValue_2= ruleNoneValue | this_StringValue_3= ruleStringValue )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                {
                alt6=1;
                }
                break;
            case 26:
                {
                alt6=2;
                }
                break;
            case 36:
                {
                alt6=3;
                }
                break;
            case RULE_STRING:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:807:3: this_MathPrimaryExpression_0= ruleMathPrimaryExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getMathPrimaryExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MathPrimaryExpression_0=ruleMathPrimaryExpression();

                    state._fsp--;


                    			current = this_MathPrimaryExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:816:3: this_BinaryExpression_1= ruleBinaryExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getBinaryExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BinaryExpression_1=ruleBinaryExpression();

                    state._fsp--;


                    			current = this_BinaryExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:825:3: this_NoneValue_2= ruleNoneValue
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getNoneValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NoneValue_2=ruleNoneValue();

                    state._fsp--;


                    			current = this_NoneValue_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:834:3: this_StringValue_3= ruleStringValue
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getStringValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringValue_3=ruleStringValue();

                    state._fsp--;


                    			current = this_StringValue_3;
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


    // $ANTLR start "entryRuleMathExpression"
    // InternalMyDsl.g:846:1: entryRuleMathExpression returns [EObject current=null] : iv_ruleMathExpression= ruleMathExpression EOF ;
    public final EObject entryRuleMathExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExpression = null;


        try {
            // InternalMyDsl.g:846:55: (iv_ruleMathExpression= ruleMathExpression EOF )
            // InternalMyDsl.g:847:2: iv_ruleMathExpression= ruleMathExpression EOF
            {
             newCompositeNode(grammarAccess.getMathExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExpression=ruleMathExpression();

            state._fsp--;

             current =iv_ruleMathExpression; 
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
    // $ANTLR end "entryRuleMathExpression"


    // $ANTLR start "ruleMathExpression"
    // InternalMyDsl.g:853:1: ruleMathExpression returns [EObject current=null] : (this_MathPrimaryExpression_0= ruleMathPrimaryExpression | this_BinaryExpression_1= ruleBinaryExpression ) ;
    public final EObject ruleMathExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MathPrimaryExpression_0 = null;

        EObject this_BinaryExpression_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:859:2: ( (this_MathPrimaryExpression_0= ruleMathPrimaryExpression | this_BinaryExpression_1= ruleBinaryExpression ) )
            // InternalMyDsl.g:860:2: (this_MathPrimaryExpression_0= ruleMathPrimaryExpression | this_BinaryExpression_1= ruleBinaryExpression )
            {
            // InternalMyDsl.g:860:2: (this_MathPrimaryExpression_0= ruleMathPrimaryExpression | this_BinaryExpression_1= ruleBinaryExpression )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT||(LA7_0>=27 && LA7_0<=31)) ) {
                alt7=1;
            }
            else if ( (LA7_0==26) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:861:3: this_MathPrimaryExpression_0= ruleMathPrimaryExpression
                    {

                    			newCompositeNode(grammarAccess.getMathExpressionAccess().getMathPrimaryExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MathPrimaryExpression_0=ruleMathPrimaryExpression();

                    state._fsp--;


                    			current = this_MathPrimaryExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:870:3: this_BinaryExpression_1= ruleBinaryExpression
                    {

                    			newCompositeNode(grammarAccess.getMathExpressionAccess().getBinaryExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BinaryExpression_1=ruleBinaryExpression();

                    state._fsp--;


                    			current = this_BinaryExpression_1;
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
    // $ANTLR end "ruleMathExpression"


    // $ANTLR start "entryRuleBinaryExpression"
    // InternalMyDsl.g:882:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalMyDsl.g:882:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalMyDsl.g:883:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
            {
             newCompositeNode(grammarAccess.getBinaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryExpression=ruleBinaryExpression();

            state._fsp--;

             current =iv_ruleBinaryExpression; 
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
    // $ANTLR end "entryRuleBinaryExpression"


    // $ANTLR start "ruleBinaryExpression"
    // InternalMyDsl.g:889:1: ruleBinaryExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleMathPrimaryExpression ) ) ( (lv_op_2_0= ruleOp ) ) ( (lv_right_3_0= ruleMathExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleBinaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:895:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleMathPrimaryExpression ) ) ( (lv_op_2_0= ruleOp ) ) ( (lv_right_3_0= ruleMathExpression ) ) otherlv_4= ')' ) )
            // InternalMyDsl.g:896:2: (otherlv_0= '(' ( (lv_left_1_0= ruleMathPrimaryExpression ) ) ( (lv_op_2_0= ruleOp ) ) ( (lv_right_3_0= ruleMathExpression ) ) otherlv_4= ')' )
            {
            // InternalMyDsl.g:896:2: (otherlv_0= '(' ( (lv_left_1_0= ruleMathPrimaryExpression ) ) ( (lv_op_2_0= ruleOp ) ) ( (lv_right_3_0= ruleMathExpression ) ) otherlv_4= ')' )
            // InternalMyDsl.g:897:3: otherlv_0= '(' ( (lv_left_1_0= ruleMathPrimaryExpression ) ) ( (lv_op_2_0= ruleOp ) ) ( (lv_right_3_0= ruleMathExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getBinaryExpressionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyDsl.g:901:3: ( (lv_left_1_0= ruleMathPrimaryExpression ) )
            // InternalMyDsl.g:902:4: (lv_left_1_0= ruleMathPrimaryExpression )
            {
            // InternalMyDsl.g:902:4: (lv_left_1_0= ruleMathPrimaryExpression )
            // InternalMyDsl.g:903:5: lv_left_1_0= ruleMathPrimaryExpression
            {

            					newCompositeNode(grammarAccess.getBinaryExpressionAccess().getLeftMathPrimaryExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_left_1_0=ruleMathPrimaryExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_1_0,
            						"org.xtext.example.mydsl.MyDsl.MathPrimaryExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:920:3: ( (lv_op_2_0= ruleOp ) )
            // InternalMyDsl.g:921:4: (lv_op_2_0= ruleOp )
            {
            // InternalMyDsl.g:921:4: (lv_op_2_0= ruleOp )
            // InternalMyDsl.g:922:5: lv_op_2_0= ruleOp
            {

            					newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOpOpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_op_2_0=ruleOp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_2_0,
            						"org.xtext.example.mydsl.MyDsl.Op");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:939:3: ( (lv_right_3_0= ruleMathExpression ) )
            // InternalMyDsl.g:940:4: (lv_right_3_0= ruleMathExpression )
            {
            // InternalMyDsl.g:940:4: (lv_right_3_0= ruleMathExpression )
            // InternalMyDsl.g:941:5: lv_right_3_0= ruleMathExpression
            {

            					newCompositeNode(grammarAccess.getBinaryExpressionAccess().getRightMathExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_right_3_0=ruleMathExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_3_0,
            						"org.xtext.example.mydsl.MyDsl.MathExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBinaryExpressionAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleBinaryExpression"


    // $ANTLR start "entryRuleMathPrimaryExpression"
    // InternalMyDsl.g:966:1: entryRuleMathPrimaryExpression returns [EObject current=null] : iv_ruleMathPrimaryExpression= ruleMathPrimaryExpression EOF ;
    public final EObject entryRuleMathPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathPrimaryExpression = null;


        try {
            // InternalMyDsl.g:966:62: (iv_ruleMathPrimaryExpression= ruleMathPrimaryExpression EOF )
            // InternalMyDsl.g:967:2: iv_ruleMathPrimaryExpression= ruleMathPrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getMathPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathPrimaryExpression=ruleMathPrimaryExpression();

            state._fsp--;

             current =iv_ruleMathPrimaryExpression; 
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
    // $ANTLR end "entryRuleMathPrimaryExpression"


    // $ANTLR start "ruleMathPrimaryExpression"
    // InternalMyDsl.g:973:1: ruleMathPrimaryExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_Selectcell_1= ruleSelectcell | this_Linesum_2= ruleLinesum | this_Colsum_3= ruleColsum | this_Lineprod_4= ruleLineprod | this_Colprod_5= ruleColprod ) ;
    public final EObject ruleMathPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_Selectcell_1 = null;

        EObject this_Linesum_2 = null;

        EObject this_Colsum_3 = null;

        EObject this_Lineprod_4 = null;

        EObject this_Colprod_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:979:2: ( (this_IntValue_0= ruleIntValue | this_Selectcell_1= ruleSelectcell | this_Linesum_2= ruleLinesum | this_Colsum_3= ruleColsum | this_Lineprod_4= ruleLineprod | this_Colprod_5= ruleColprod ) )
            // InternalMyDsl.g:980:2: (this_IntValue_0= ruleIntValue | this_Selectcell_1= ruleSelectcell | this_Linesum_2= ruleLinesum | this_Colsum_3= ruleColsum | this_Lineprod_4= ruleLineprod | this_Colprod_5= ruleColprod )
            {
            // InternalMyDsl.g:980:2: (this_IntValue_0= ruleIntValue | this_Selectcell_1= ruleSelectcell | this_Linesum_2= ruleLinesum | this_Colsum_3= ruleColsum | this_Lineprod_4= ruleLineprod | this_Colprod_5= ruleColprod )
            int alt8=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt8=1;
                }
                break;
            case 27:
                {
                alt8=2;
                }
                break;
            case 28:
                {
                alt8=3;
                }
                break;
            case 29:
                {
                alt8=4;
                }
                break;
            case 30:
                {
                alt8=5;
                }
                break;
            case 31:
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
                    // InternalMyDsl.g:981:3: this_IntValue_0= ruleIntValue
                    {

                    			newCompositeNode(grammarAccess.getMathPrimaryExpressionAccess().getIntValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntValue_0=ruleIntValue();

                    state._fsp--;


                    			current = this_IntValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:990:3: this_Selectcell_1= ruleSelectcell
                    {

                    			newCompositeNode(grammarAccess.getMathPrimaryExpressionAccess().getSelectcellParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Selectcell_1=ruleSelectcell();

                    state._fsp--;


                    			current = this_Selectcell_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:999:3: this_Linesum_2= ruleLinesum
                    {

                    			newCompositeNode(grammarAccess.getMathPrimaryExpressionAccess().getLinesumParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Linesum_2=ruleLinesum();

                    state._fsp--;


                    			current = this_Linesum_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1008:3: this_Colsum_3= ruleColsum
                    {

                    			newCompositeNode(grammarAccess.getMathPrimaryExpressionAccess().getColsumParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Colsum_3=ruleColsum();

                    state._fsp--;


                    			current = this_Colsum_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1017:3: this_Lineprod_4= ruleLineprod
                    {

                    			newCompositeNode(grammarAccess.getMathPrimaryExpressionAccess().getLineprodParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Lineprod_4=ruleLineprod();

                    state._fsp--;


                    			current = this_Lineprod_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1026:3: this_Colprod_5= ruleColprod
                    {

                    			newCompositeNode(grammarAccess.getMathPrimaryExpressionAccess().getColprodParserRuleCall_5());
                    		
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
    // $ANTLR end "ruleMathPrimaryExpression"


    // $ANTLR start "entryRuleSelectcell"
    // InternalMyDsl.g:1038:1: entryRuleSelectcell returns [EObject current=null] : iv_ruleSelectcell= ruleSelectcell EOF ;
    public final EObject entryRuleSelectcell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectcell = null;


        try {
            // InternalMyDsl.g:1038:51: (iv_ruleSelectcell= ruleSelectcell EOF )
            // InternalMyDsl.g:1039:2: iv_ruleSelectcell= ruleSelectcell EOF
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
    // InternalMyDsl.g:1045:1: ruleSelectcell returns [EObject current=null] : (otherlv_0= 'Selectcell(' ( (lv_lineIndex_1_0= ruleMathExpression ) ) otherlv_2= ',' ( (lv_colName_3_0= ruleStringValue ) ) otherlv_4= ')' ) ;
    public final EObject ruleSelectcell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_lineIndex_1_0 = null;

        EObject lv_colName_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1051:2: ( (otherlv_0= 'Selectcell(' ( (lv_lineIndex_1_0= ruleMathExpression ) ) otherlv_2= ',' ( (lv_colName_3_0= ruleStringValue ) ) otherlv_4= ')' ) )
            // InternalMyDsl.g:1052:2: (otherlv_0= 'Selectcell(' ( (lv_lineIndex_1_0= ruleMathExpression ) ) otherlv_2= ',' ( (lv_colName_3_0= ruleStringValue ) ) otherlv_4= ')' )
            {
            // InternalMyDsl.g:1052:2: (otherlv_0= 'Selectcell(' ( (lv_lineIndex_1_0= ruleMathExpression ) ) otherlv_2= ',' ( (lv_colName_3_0= ruleStringValue ) ) otherlv_4= ')' )
            // InternalMyDsl.g:1053:3: otherlv_0= 'Selectcell(' ( (lv_lineIndex_1_0= ruleMathExpression ) ) otherlv_2= ',' ( (lv_colName_3_0= ruleStringValue ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectcellAccess().getSelectcellKeyword_0());
            		
            // InternalMyDsl.g:1057:3: ( (lv_lineIndex_1_0= ruleMathExpression ) )
            // InternalMyDsl.g:1058:4: (lv_lineIndex_1_0= ruleMathExpression )
            {
            // InternalMyDsl.g:1058:4: (lv_lineIndex_1_0= ruleMathExpression )
            // InternalMyDsl.g:1059:5: lv_lineIndex_1_0= ruleMathExpression
            {

            					newCompositeNode(grammarAccess.getSelectcellAccess().getLineIndexMathExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_lineIndex_1_0=ruleMathExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectcellRule());
            					}
            					set(
            						current,
            						"lineIndex",
            						lv_lineIndex_1_0,
            						"org.xtext.example.mydsl.MyDsl.MathExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectcellAccess().getCommaKeyword_2());
            		
            // InternalMyDsl.g:1080:3: ( (lv_colName_3_0= ruleStringValue ) )
            // InternalMyDsl.g:1081:4: (lv_colName_3_0= ruleStringValue )
            {
            // InternalMyDsl.g:1081:4: (lv_colName_3_0= ruleStringValue )
            // InternalMyDsl.g:1082:5: lv_colName_3_0= ruleStringValue
            {

            					newCompositeNode(grammarAccess.getSelectcellAccess().getColNameStringValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_colName_3_0=ruleStringValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectcellRule());
            					}
            					set(
            						current,
            						"colName",
            						lv_colName_3_0,
            						"org.xtext.example.mydsl.MyDsl.StringValue");
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
    // InternalMyDsl.g:1107:1: entryRuleLinesum returns [EObject current=null] : iv_ruleLinesum= ruleLinesum EOF ;
    public final EObject entryRuleLinesum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinesum = null;


        try {
            // InternalMyDsl.g:1107:48: (iv_ruleLinesum= ruleLinesum EOF )
            // InternalMyDsl.g:1108:2: iv_ruleLinesum= ruleLinesum EOF
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
    // InternalMyDsl.g:1114:1: ruleLinesum returns [EObject current=null] : (otherlv_0= 'Linesum(' ( (lv_lineIndex_1_0= ruleMathExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleLinesum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_lineIndex_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1120:2: ( (otherlv_0= 'Linesum(' ( (lv_lineIndex_1_0= ruleMathExpression ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:1121:2: (otherlv_0= 'Linesum(' ( (lv_lineIndex_1_0= ruleMathExpression ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:1121:2: (otherlv_0= 'Linesum(' ( (lv_lineIndex_1_0= ruleMathExpression ) ) otherlv_2= ')' )
            // InternalMyDsl.g:1122:3: otherlv_0= 'Linesum(' ( (lv_lineIndex_1_0= ruleMathExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLinesumAccess().getLinesumKeyword_0());
            		
            // InternalMyDsl.g:1126:3: ( (lv_lineIndex_1_0= ruleMathExpression ) )
            // InternalMyDsl.g:1127:4: (lv_lineIndex_1_0= ruleMathExpression )
            {
            // InternalMyDsl.g:1127:4: (lv_lineIndex_1_0= ruleMathExpression )
            // InternalMyDsl.g:1128:5: lv_lineIndex_1_0= ruleMathExpression
            {

            					newCompositeNode(grammarAccess.getLinesumAccess().getLineIndexMathExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_lineIndex_1_0=ruleMathExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinesumRule());
            					}
            					set(
            						current,
            						"lineIndex",
            						lv_lineIndex_1_0,
            						"org.xtext.example.mydsl.MyDsl.MathExpression");
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
    // InternalMyDsl.g:1153:1: entryRuleColsum returns [EObject current=null] : iv_ruleColsum= ruleColsum EOF ;
    public final EObject entryRuleColsum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColsum = null;


        try {
            // InternalMyDsl.g:1153:47: (iv_ruleColsum= ruleColsum EOF )
            // InternalMyDsl.g:1154:2: iv_ruleColsum= ruleColsum EOF
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
    // InternalMyDsl.g:1160:1: ruleColsum returns [EObject current=null] : (otherlv_0= 'Colsum(' ( (lv_colName_1_0= ruleStringValue ) ) otherlv_2= ')' ) ;
    public final EObject ruleColsum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_colName_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1166:2: ( (otherlv_0= 'Colsum(' ( (lv_colName_1_0= ruleStringValue ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:1167:2: (otherlv_0= 'Colsum(' ( (lv_colName_1_0= ruleStringValue ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:1167:2: (otherlv_0= 'Colsum(' ( (lv_colName_1_0= ruleStringValue ) ) otherlv_2= ')' )
            // InternalMyDsl.g:1168:3: otherlv_0= 'Colsum(' ( (lv_colName_1_0= ruleStringValue ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getColsumAccess().getColsumKeyword_0());
            		
            // InternalMyDsl.g:1172:3: ( (lv_colName_1_0= ruleStringValue ) )
            // InternalMyDsl.g:1173:4: (lv_colName_1_0= ruleStringValue )
            {
            // InternalMyDsl.g:1173:4: (lv_colName_1_0= ruleStringValue )
            // InternalMyDsl.g:1174:5: lv_colName_1_0= ruleStringValue
            {

            					newCompositeNode(grammarAccess.getColsumAccess().getColNameStringValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_colName_1_0=ruleStringValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColsumRule());
            					}
            					set(
            						current,
            						"colName",
            						lv_colName_1_0,
            						"org.xtext.example.mydsl.MyDsl.StringValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getColsumAccess().getRightParenthesisKeyword_2());
            		

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
    // InternalMyDsl.g:1199:1: entryRuleLineprod returns [EObject current=null] : iv_ruleLineprod= ruleLineprod EOF ;
    public final EObject entryRuleLineprod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineprod = null;


        try {
            // InternalMyDsl.g:1199:49: (iv_ruleLineprod= ruleLineprod EOF )
            // InternalMyDsl.g:1200:2: iv_ruleLineprod= ruleLineprod EOF
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
    // InternalMyDsl.g:1206:1: ruleLineprod returns [EObject current=null] : (otherlv_0= 'Lineprod(' ( (lv_lineIndex_1_0= ruleMathExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleLineprod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_lineIndex_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1212:2: ( (otherlv_0= 'Lineprod(' ( (lv_lineIndex_1_0= ruleMathExpression ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:1213:2: (otherlv_0= 'Lineprod(' ( (lv_lineIndex_1_0= ruleMathExpression ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:1213:2: (otherlv_0= 'Lineprod(' ( (lv_lineIndex_1_0= ruleMathExpression ) ) otherlv_2= ')' )
            // InternalMyDsl.g:1214:3: otherlv_0= 'Lineprod(' ( (lv_lineIndex_1_0= ruleMathExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLineprodAccess().getLineprodKeyword_0());
            		
            // InternalMyDsl.g:1218:3: ( (lv_lineIndex_1_0= ruleMathExpression ) )
            // InternalMyDsl.g:1219:4: (lv_lineIndex_1_0= ruleMathExpression )
            {
            // InternalMyDsl.g:1219:4: (lv_lineIndex_1_0= ruleMathExpression )
            // InternalMyDsl.g:1220:5: lv_lineIndex_1_0= ruleMathExpression
            {

            					newCompositeNode(grammarAccess.getLineprodAccess().getLineIndexMathExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_lineIndex_1_0=ruleMathExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLineprodRule());
            					}
            					set(
            						current,
            						"lineIndex",
            						lv_lineIndex_1_0,
            						"org.xtext.example.mydsl.MyDsl.MathExpression");
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
    // InternalMyDsl.g:1245:1: entryRuleColprod returns [EObject current=null] : iv_ruleColprod= ruleColprod EOF ;
    public final EObject entryRuleColprod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColprod = null;


        try {
            // InternalMyDsl.g:1245:48: (iv_ruleColprod= ruleColprod EOF )
            // InternalMyDsl.g:1246:2: iv_ruleColprod= ruleColprod EOF
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
    // InternalMyDsl.g:1252:1: ruleColprod returns [EObject current=null] : (otherlv_0= 'Colprod(' ( (lv_colName_1_0= ruleStringValue ) ) otherlv_2= ')' ) ;
    public final EObject ruleColprod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_colName_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1258:2: ( (otherlv_0= 'Colprod(' ( (lv_colName_1_0= ruleStringValue ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:1259:2: (otherlv_0= 'Colprod(' ( (lv_colName_1_0= ruleStringValue ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:1259:2: (otherlv_0= 'Colprod(' ( (lv_colName_1_0= ruleStringValue ) ) otherlv_2= ')' )
            // InternalMyDsl.g:1260:3: otherlv_0= 'Colprod(' ( (lv_colName_1_0= ruleStringValue ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getColprodAccess().getColprodKeyword_0());
            		
            // InternalMyDsl.g:1264:3: ( (lv_colName_1_0= ruleStringValue ) )
            // InternalMyDsl.g:1265:4: (lv_colName_1_0= ruleStringValue )
            {
            // InternalMyDsl.g:1265:4: (lv_colName_1_0= ruleStringValue )
            // InternalMyDsl.g:1266:5: lv_colName_1_0= ruleStringValue
            {

            					newCompositeNode(grammarAccess.getColprodAccess().getColNameStringValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_colName_1_0=ruleStringValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColprodRule());
            					}
            					set(
            						current,
            						"colName",
            						lv_colName_1_0,
            						"org.xtext.example.mydsl.MyDsl.StringValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getColprodAccess().getRightParenthesisKeyword_2());
            		

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


    // $ANTLR start "entryRuleOp"
    // InternalMyDsl.g:1291:1: entryRuleOp returns [String current=null] : iv_ruleOp= ruleOp EOF ;
    public final String entryRuleOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOp = null;


        try {
            // InternalMyDsl.g:1291:42: (iv_ruleOp= ruleOp EOF )
            // InternalMyDsl.g:1292:2: iv_ruleOp= ruleOp EOF
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
    // InternalMyDsl.g:1298:1: ruleOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1304:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) )
            // InternalMyDsl.g:1305:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            {
            // InternalMyDsl.g:1305:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt9=1;
                }
                break;
            case 33:
                {
                alt9=2;
                }
                break;
            case 34:
                {
                alt9=3;
                }
                break;
            case 35:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1306:3: kw= '+'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1312:3: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1318:3: kw= '*'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1324:3: kw= '/'
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
    // InternalMyDsl.g:1333:1: entryRuleNoneValue returns [EObject current=null] : iv_ruleNoneValue= ruleNoneValue EOF ;
    public final EObject entryRuleNoneValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoneValue = null;


        try {
            // InternalMyDsl.g:1333:50: (iv_ruleNoneValue= ruleNoneValue EOF )
            // InternalMyDsl.g:1334:2: iv_ruleNoneValue= ruleNoneValue EOF
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
    // InternalMyDsl.g:1340:1: ruleNoneValue returns [EObject current=null] : ( (lv_value_0_0= 'None' ) ) ;
    public final EObject ruleNoneValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1346:2: ( ( (lv_value_0_0= 'None' ) ) )
            // InternalMyDsl.g:1347:2: ( (lv_value_0_0= 'None' ) )
            {
            // InternalMyDsl.g:1347:2: ( (lv_value_0_0= 'None' ) )
            // InternalMyDsl.g:1348:3: (lv_value_0_0= 'None' )
            {
            // InternalMyDsl.g:1348:3: (lv_value_0_0= 'None' )
            // InternalMyDsl.g:1349:4: lv_value_0_0= 'None'
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
    // InternalMyDsl.g:1364:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalMyDsl.g:1364:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalMyDsl.g:1365:2: iv_ruleIntValue= ruleIntValue EOF
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
    // InternalMyDsl.g:1371:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1377:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalMyDsl.g:1378:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalMyDsl.g:1378:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalMyDsl.g:1379:3: (lv_value_0_0= RULE_INT )
            {
            // InternalMyDsl.g:1379:3: (lv_value_0_0= RULE_INT )
            // InternalMyDsl.g:1380:4: lv_value_0_0= RULE_INT
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
    // InternalMyDsl.g:1399:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalMyDsl.g:1399:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalMyDsl.g:1400:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalMyDsl.g:1406:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1412:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1413:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:1413:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMyDsl.g:1414:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:1414:3: (lv_value_0_0= RULE_STRING )
            // InternalMyDsl.g:1415:4: lv_value_0_0= RULE_STRING
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000003FA4000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000FC000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000010FC000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000F8000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000F00000000L});

}