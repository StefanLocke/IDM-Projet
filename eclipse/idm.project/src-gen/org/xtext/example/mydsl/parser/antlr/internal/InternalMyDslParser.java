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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Load('", "')'", "'{'", "'}'", "'Create()'", "';'", "'InsertCol('", "','", "'RemoveCol('", "'InsertLine('", "'RemoveLine('", "'Modify('", "'Print('", "'Store('", "'Export('", "'Selectcell('", "'Linesum('", "'Colsum('", "'Lineprod('", "'Colprod('", "'('", "'+'", "'-'", "'*'", "'/'"
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
    // InternalMyDsl.g:107:1: ruleLoadscope returns [EObject current=null] : ( (otherlv_0= 'Load(' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}' ) | (otherlv_6= 'Create()' otherlv_7= '{' ( (lv_instructions_8_0= ruleInstruction ) )* otherlv_9= '}' ) ) ;
    public final EObject ruleLoadscope() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_instructions_4_0 = null;

        EObject lv_instructions_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( ( (otherlv_0= 'Load(' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}' ) | (otherlv_6= 'Create()' otherlv_7= '{' ( (lv_instructions_8_0= ruleInstruction ) )* otherlv_9= '}' ) ) )
            // InternalMyDsl.g:114:2: ( (otherlv_0= 'Load(' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}' ) | (otherlv_6= 'Create()' otherlv_7= '{' ( (lv_instructions_8_0= ruleInstruction ) )* otherlv_9= '}' ) )
            {
            // InternalMyDsl.g:114:2: ( (otherlv_0= 'Load(' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}' ) | (otherlv_6= 'Create()' otherlv_7= '{' ( (lv_instructions_8_0= ruleInstruction ) )* otherlv_9= '}' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:115:3: (otherlv_0= 'Load(' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}' )
                    {
                    // InternalMyDsl.g:115:3: (otherlv_0= 'Load(' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}' )
                    // InternalMyDsl.g:116:4: otherlv_0= 'Load(' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getLoadscopeAccess().getLoadKeyword_0_0());
                    			
                    // InternalMyDsl.g:120:4: ( (lv_url_1_0= RULE_STRING ) )
                    // InternalMyDsl.g:121:5: (lv_url_1_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:121:5: (lv_url_1_0= RULE_STRING )
                    // InternalMyDsl.g:122:6: lv_url_1_0= RULE_STRING
                    {
                    lv_url_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_url_1_0, grammarAccess.getLoadscopeAccess().getUrlSTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLoadscopeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"url",
                    							lv_url_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getLoadscopeAccess().getRightParenthesisKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getLoadscopeAccess().getLeftCurlyBracketKeyword_0_3());
                    			
                    // InternalMyDsl.g:146:4: ( (lv_instructions_4_0= ruleInstruction ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==17||(LA2_0>=19 && LA2_0<=25)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMyDsl.g:147:5: (lv_instructions_4_0= ruleInstruction )
                    	    {
                    	    // InternalMyDsl.g:147:5: (lv_instructions_4_0= ruleInstruction )
                    	    // InternalMyDsl.g:148:6: lv_instructions_4_0= ruleInstruction
                    	    {

                    	    						newCompositeNode(grammarAccess.getLoadscopeAccess().getInstructionsInstructionParserRuleCall_0_4_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_instructions_4_0=ruleInstruction();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLoadscopeRule());
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
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getLoadscopeAccess().getRightCurlyBracketKeyword_0_5());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:171:3: (otherlv_6= 'Create()' otherlv_7= '{' ( (lv_instructions_8_0= ruleInstruction ) )* otherlv_9= '}' )
                    {
                    // InternalMyDsl.g:171:3: (otherlv_6= 'Create()' otherlv_7= '{' ( (lv_instructions_8_0= ruleInstruction ) )* otherlv_9= '}' )
                    // InternalMyDsl.g:172:4: otherlv_6= 'Create()' otherlv_7= '{' ( (lv_instructions_8_0= ruleInstruction ) )* otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getLoadscopeAccess().getCreateKeyword_1_0());
                    			
                    otherlv_7=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getLoadscopeAccess().getLeftCurlyBracketKeyword_1_1());
                    			
                    // InternalMyDsl.g:180:4: ( (lv_instructions_8_0= ruleInstruction ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==17||(LA3_0>=19 && LA3_0<=25)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMyDsl.g:181:5: (lv_instructions_8_0= ruleInstruction )
                    	    {
                    	    // InternalMyDsl.g:181:5: (lv_instructions_8_0= ruleInstruction )
                    	    // InternalMyDsl.g:182:6: lv_instructions_8_0= ruleInstruction
                    	    {

                    	    						newCompositeNode(grammarAccess.getLoadscopeAccess().getInstructionsInstructionParserRuleCall_1_2_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_instructions_8_0=ruleInstruction();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLoadscopeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"instructions",
                    	    							lv_instructions_8_0,
                    	    							"org.xtext.example.mydsl.MyDsl.Instruction");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getLoadscopeAccess().getRightCurlyBracketKeyword_1_3());
                    			

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
    // $ANTLR end "ruleLoadscope"


    // $ANTLR start "entryRuleInstruction"
    // InternalMyDsl.g:208:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalMyDsl.g:208:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalMyDsl.g:209:2: iv_ruleInstruction= ruleInstruction EOF
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
    // InternalMyDsl.g:215:1: ruleInstruction returns [EObject current=null] : ( (this_InsertLine_0= ruleInsertLine | this_RemoveLine_1= ruleRemoveLine | this_InsertCol_2= ruleInsertCol | this_RemoveCol_3= ruleRemoveCol | this_Modify_4= ruleModify | this_Store_5= ruleStore | this_Export_6= ruleExport | this_Print_7= rulePrint ) otherlv_8= ';' ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_8=null;
        EObject this_InsertLine_0 = null;

        EObject this_RemoveLine_1 = null;

        EObject this_InsertCol_2 = null;

        EObject this_RemoveCol_3 = null;

        EObject this_Modify_4 = null;

        EObject this_Store_5 = null;

        EObject this_Export_6 = null;

        EObject this_Print_7 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:221:2: ( ( (this_InsertLine_0= ruleInsertLine | this_RemoveLine_1= ruleRemoveLine | this_InsertCol_2= ruleInsertCol | this_RemoveCol_3= ruleRemoveCol | this_Modify_4= ruleModify | this_Store_5= ruleStore | this_Export_6= ruleExport | this_Print_7= rulePrint ) otherlv_8= ';' ) )
            // InternalMyDsl.g:222:2: ( (this_InsertLine_0= ruleInsertLine | this_RemoveLine_1= ruleRemoveLine | this_InsertCol_2= ruleInsertCol | this_RemoveCol_3= ruleRemoveCol | this_Modify_4= ruleModify | this_Store_5= ruleStore | this_Export_6= ruleExport | this_Print_7= rulePrint ) otherlv_8= ';' )
            {
            // InternalMyDsl.g:222:2: ( (this_InsertLine_0= ruleInsertLine | this_RemoveLine_1= ruleRemoveLine | this_InsertCol_2= ruleInsertCol | this_RemoveCol_3= ruleRemoveCol | this_Modify_4= ruleModify | this_Store_5= ruleStore | this_Export_6= ruleExport | this_Print_7= rulePrint ) otherlv_8= ';' )
            // InternalMyDsl.g:223:3: (this_InsertLine_0= ruleInsertLine | this_RemoveLine_1= ruleRemoveLine | this_InsertCol_2= ruleInsertCol | this_RemoveCol_3= ruleRemoveCol | this_Modify_4= ruleModify | this_Store_5= ruleStore | this_Export_6= ruleExport | this_Print_7= rulePrint ) otherlv_8= ';'
            {
            // InternalMyDsl.g:223:3: (this_InsertLine_0= ruleInsertLine | this_RemoveLine_1= ruleRemoveLine | this_InsertCol_2= ruleInsertCol | this_RemoveCol_3= ruleRemoveCol | this_Modify_4= ruleModify | this_Store_5= ruleStore | this_Export_6= ruleExport | this_Print_7= rulePrint )
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
            case 24:
                {
                alt5=6;
                }
                break;
            case 25:
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
                    // InternalMyDsl.g:224:4: this_InsertLine_0= ruleInsertLine
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
                    // InternalMyDsl.g:233:4: this_RemoveLine_1= ruleRemoveLine
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
                    // InternalMyDsl.g:242:4: this_InsertCol_2= ruleInsertCol
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
                    // InternalMyDsl.g:251:4: this_RemoveCol_3= ruleRemoveCol
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
                    // InternalMyDsl.g:260:4: this_Modify_4= ruleModify
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getModifyParserRuleCall_0_4());
                    			
                    pushFollow(FOLLOW_8);
                    this_Modify_4=ruleModify();

                    state._fsp--;


                    				current = this_Modify_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:269:4: this_Store_5= ruleStore
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getStoreParserRuleCall_0_5());
                    			
                    pushFollow(FOLLOW_8);
                    this_Store_5=ruleStore();

                    state._fsp--;


                    				current = this_Store_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:278:4: this_Export_6= ruleExport
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getExportParserRuleCall_0_6());
                    			
                    pushFollow(FOLLOW_8);
                    this_Export_6=ruleExport();

                    state._fsp--;


                    				current = this_Export_6;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:287:4: this_Print_7= rulePrint
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
    // InternalMyDsl.g:304:1: entryRuleInsertCol returns [EObject current=null] : iv_ruleInsertCol= ruleInsertCol EOF ;
    public final EObject entryRuleInsertCol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertCol = null;


        try {
            // InternalMyDsl.g:304:50: (iv_ruleInsertCol= ruleInsertCol EOF )
            // InternalMyDsl.g:305:2: iv_ruleInsertCol= ruleInsertCol EOF
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
    // InternalMyDsl.g:311:1: ruleInsertCol returns [EObject current=null] : (otherlv_0= 'InsertCol(' ( (lv_colIndex_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_colName_3_0= RULE_STRING ) ) otherlv_4= ')' ) ;
    public final EObject ruleInsertCol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_colName_3_0=null;
        Token otherlv_4=null;
        EObject lv_colIndex_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:317:2: ( (otherlv_0= 'InsertCol(' ( (lv_colIndex_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_colName_3_0= RULE_STRING ) ) otherlv_4= ')' ) )
            // InternalMyDsl.g:318:2: (otherlv_0= 'InsertCol(' ( (lv_colIndex_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_colName_3_0= RULE_STRING ) ) otherlv_4= ')' )
            {
            // InternalMyDsl.g:318:2: (otherlv_0= 'InsertCol(' ( (lv_colIndex_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_colName_3_0= RULE_STRING ) ) otherlv_4= ')' )
            // InternalMyDsl.g:319:3: otherlv_0= 'InsertCol(' ( (lv_colIndex_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_colName_3_0= RULE_STRING ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertColAccess().getInsertColKeyword_0());
            		
            // InternalMyDsl.g:323:3: ( (lv_colIndex_1_0= ruleExpression ) )
            // InternalMyDsl.g:324:4: (lv_colIndex_1_0= ruleExpression )
            {
            // InternalMyDsl.g:324:4: (lv_colIndex_1_0= ruleExpression )
            // InternalMyDsl.g:325:5: lv_colIndex_1_0= ruleExpression
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
            		
            // InternalMyDsl.g:346:3: ( (lv_colName_3_0= RULE_STRING ) )
            // InternalMyDsl.g:347:4: (lv_colName_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:347:4: (lv_colName_3_0= RULE_STRING )
            // InternalMyDsl.g:348:5: lv_colName_3_0= RULE_STRING
            {
            lv_colName_3_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

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
    // InternalMyDsl.g:372:1: entryRuleRemoveCol returns [EObject current=null] : iv_ruleRemoveCol= ruleRemoveCol EOF ;
    public final EObject entryRuleRemoveCol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveCol = null;


        try {
            // InternalMyDsl.g:372:50: (iv_ruleRemoveCol= ruleRemoveCol EOF )
            // InternalMyDsl.g:373:2: iv_ruleRemoveCol= ruleRemoveCol EOF
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
    // InternalMyDsl.g:379:1: ruleRemoveCol returns [EObject current=null] : (otherlv_0= 'RemoveCol(' ( (lv_colIndex_1_0= ruleExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleRemoveCol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_colIndex_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:385:2: ( (otherlv_0= 'RemoveCol(' ( (lv_colIndex_1_0= ruleExpression ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:386:2: (otherlv_0= 'RemoveCol(' ( (lv_colIndex_1_0= ruleExpression ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:386:2: (otherlv_0= 'RemoveCol(' ( (lv_colIndex_1_0= ruleExpression ) ) otherlv_2= ')' )
            // InternalMyDsl.g:387:3: otherlv_0= 'RemoveCol(' ( (lv_colIndex_1_0= ruleExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveColAccess().getRemoveColKeyword_0());
            		
            // InternalMyDsl.g:391:3: ( (lv_colIndex_1_0= ruleExpression ) )
            // InternalMyDsl.g:392:4: (lv_colIndex_1_0= ruleExpression )
            {
            // InternalMyDsl.g:392:4: (lv_colIndex_1_0= ruleExpression )
            // InternalMyDsl.g:393:5: lv_colIndex_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getRemoveColAccess().getColIndexExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:418:1: entryRuleInsertLine returns [EObject current=null] : iv_ruleInsertLine= ruleInsertLine EOF ;
    public final EObject entryRuleInsertLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertLine = null;


        try {
            // InternalMyDsl.g:418:51: (iv_ruleInsertLine= ruleInsertLine EOF )
            // InternalMyDsl.g:419:2: iv_ruleInsertLine= ruleInsertLine EOF
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
    // InternalMyDsl.g:425:1: ruleInsertLine returns [EObject current=null] : (otherlv_0= 'InsertLine(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleInsertLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_lineIndex_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:431:2: ( (otherlv_0= 'InsertLine(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:432:2: (otherlv_0= 'InsertLine(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:432:2: (otherlv_0= 'InsertLine(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')' )
            // InternalMyDsl.g:433:3: otherlv_0= 'InsertLine(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertLineAccess().getInsertLineKeyword_0());
            		
            // InternalMyDsl.g:437:3: ( (lv_lineIndex_1_0= ruleExpression ) )
            // InternalMyDsl.g:438:4: (lv_lineIndex_1_0= ruleExpression )
            {
            // InternalMyDsl.g:438:4: (lv_lineIndex_1_0= ruleExpression )
            // InternalMyDsl.g:439:5: lv_lineIndex_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getInsertLineAccess().getLineIndexExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:464:1: entryRuleRemoveLine returns [EObject current=null] : iv_ruleRemoveLine= ruleRemoveLine EOF ;
    public final EObject entryRuleRemoveLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveLine = null;


        try {
            // InternalMyDsl.g:464:51: (iv_ruleRemoveLine= ruleRemoveLine EOF )
            // InternalMyDsl.g:465:2: iv_ruleRemoveLine= ruleRemoveLine EOF
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
    // InternalMyDsl.g:471:1: ruleRemoveLine returns [EObject current=null] : (otherlv_0= 'RemoveLine(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleRemoveLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_lineIndex_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:477:2: ( (otherlv_0= 'RemoveLine(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:478:2: (otherlv_0= 'RemoveLine(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:478:2: (otherlv_0= 'RemoveLine(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')' )
            // InternalMyDsl.g:479:3: otherlv_0= 'RemoveLine(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveLineAccess().getRemoveLineKeyword_0());
            		
            // InternalMyDsl.g:483:3: ( (lv_lineIndex_1_0= ruleExpression ) )
            // InternalMyDsl.g:484:4: (lv_lineIndex_1_0= ruleExpression )
            {
            // InternalMyDsl.g:484:4: (lv_lineIndex_1_0= ruleExpression )
            // InternalMyDsl.g:485:5: lv_lineIndex_1_0= ruleExpression
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


    // $ANTLR start "entryRuleModify"
    // InternalMyDsl.g:510:1: entryRuleModify returns [EObject current=null] : iv_ruleModify= ruleModify EOF ;
    public final EObject entryRuleModify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModify = null;


        try {
            // InternalMyDsl.g:510:47: (iv_ruleModify= ruleModify EOF )
            // InternalMyDsl.g:511:2: iv_ruleModify= ruleModify EOF
            {
             newCompositeNode(grammarAccess.getModifyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModify=ruleModify();

            state._fsp--;

             current =iv_ruleModify; 
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
    // $ANTLR end "entryRuleModify"


    // $ANTLR start "ruleModify"
    // InternalMyDsl.g:517:1: ruleModify returns [EObject current=null] : (otherlv_0= 'Modify(' ( (lv_colIndex_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_rowIndex_3_0= ruleExpression ) ) otherlv_4= ',' ( ( (lv_value_5_1= ruleExpression | lv_value_5_2= ruleStringValue ) ) ) otherlv_6= ')' ) ;
    public final EObject ruleModify() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_colIndex_1_0 = null;

        EObject lv_rowIndex_3_0 = null;

        EObject lv_value_5_1 = null;

        EObject lv_value_5_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:523:2: ( (otherlv_0= 'Modify(' ( (lv_colIndex_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_rowIndex_3_0= ruleExpression ) ) otherlv_4= ',' ( ( (lv_value_5_1= ruleExpression | lv_value_5_2= ruleStringValue ) ) ) otherlv_6= ')' ) )
            // InternalMyDsl.g:524:2: (otherlv_0= 'Modify(' ( (lv_colIndex_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_rowIndex_3_0= ruleExpression ) ) otherlv_4= ',' ( ( (lv_value_5_1= ruleExpression | lv_value_5_2= ruleStringValue ) ) ) otherlv_6= ')' )
            {
            // InternalMyDsl.g:524:2: (otherlv_0= 'Modify(' ( (lv_colIndex_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_rowIndex_3_0= ruleExpression ) ) otherlv_4= ',' ( ( (lv_value_5_1= ruleExpression | lv_value_5_2= ruleStringValue ) ) ) otherlv_6= ')' )
            // InternalMyDsl.g:525:3: otherlv_0= 'Modify(' ( (lv_colIndex_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_rowIndex_3_0= ruleExpression ) ) otherlv_4= ',' ( ( (lv_value_5_1= ruleExpression | lv_value_5_2= ruleStringValue ) ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getModifyAccess().getModifyKeyword_0());
            		
            // InternalMyDsl.g:529:3: ( (lv_colIndex_1_0= ruleExpression ) )
            // InternalMyDsl.g:530:4: (lv_colIndex_1_0= ruleExpression )
            {
            // InternalMyDsl.g:530:4: (lv_colIndex_1_0= ruleExpression )
            // InternalMyDsl.g:531:5: lv_colIndex_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getModifyAccess().getColIndexExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_colIndex_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModifyRule());
            					}
            					set(
            						current,
            						"colIndex",
            						lv_colIndex_1_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getModifyAccess().getCommaKeyword_2());
            		
            // InternalMyDsl.g:552:3: ( (lv_rowIndex_3_0= ruleExpression ) )
            // InternalMyDsl.g:553:4: (lv_rowIndex_3_0= ruleExpression )
            {
            // InternalMyDsl.g:553:4: (lv_rowIndex_3_0= ruleExpression )
            // InternalMyDsl.g:554:5: lv_rowIndex_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getModifyAccess().getRowIndexExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_rowIndex_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModifyRule());
            					}
            					set(
            						current,
            						"rowIndex",
            						lv_rowIndex_3_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getModifyAccess().getCommaKeyword_4());
            		
            // InternalMyDsl.g:575:3: ( ( (lv_value_5_1= ruleExpression | lv_value_5_2= ruleStringValue ) ) )
            // InternalMyDsl.g:576:4: ( (lv_value_5_1= ruleExpression | lv_value_5_2= ruleStringValue ) )
            {
            // InternalMyDsl.g:576:4: ( (lv_value_5_1= ruleExpression | lv_value_5_2= ruleStringValue ) )
            // InternalMyDsl.g:577:5: (lv_value_5_1= ruleExpression | lv_value_5_2= ruleStringValue )
            {
            // InternalMyDsl.g:577:5: (lv_value_5_1= ruleExpression | lv_value_5_2= ruleStringValue )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT||(LA6_0>=26 && LA6_0<=31)) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:578:6: lv_value_5_1= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getModifyAccess().getValueExpressionParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_value_5_1=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModifyRule());
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
                    // InternalMyDsl.g:594:6: lv_value_5_2= ruleStringValue
                    {

                    						newCompositeNode(grammarAccess.getModifyAccess().getValueStringValueParserRuleCall_5_0_1());
                    					
                    pushFollow(FOLLOW_5);
                    lv_value_5_2=ruleStringValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModifyRule());
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

            			newLeafNode(otherlv_6, grammarAccess.getModifyAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleModify"


    // $ANTLR start "entryRulePrint"
    // InternalMyDsl.g:620:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalMyDsl.g:620:46: (iv_rulePrint= rulePrint EOF )
            // InternalMyDsl.g:621:2: iv_rulePrint= rulePrint EOF
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
    // InternalMyDsl.g:627:1: rulePrint returns [EObject current=null] : (otherlv_0= 'Print(' ( ( (lv_value_1_1= ruleExpression | lv_value_1_2= ruleStringValue ) ) ) otherlv_2= ')' ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_1 = null;

        EObject lv_value_1_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:633:2: ( (otherlv_0= 'Print(' ( ( (lv_value_1_1= ruleExpression | lv_value_1_2= ruleStringValue ) ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:634:2: (otherlv_0= 'Print(' ( ( (lv_value_1_1= ruleExpression | lv_value_1_2= ruleStringValue ) ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:634:2: (otherlv_0= 'Print(' ( ( (lv_value_1_1= ruleExpression | lv_value_1_2= ruleStringValue ) ) ) otherlv_2= ')' )
            // InternalMyDsl.g:635:3: otherlv_0= 'Print(' ( ( (lv_value_1_1= ruleExpression | lv_value_1_2= ruleStringValue ) ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPrintKeyword_0());
            		
            // InternalMyDsl.g:639:3: ( ( (lv_value_1_1= ruleExpression | lv_value_1_2= ruleStringValue ) ) )
            // InternalMyDsl.g:640:4: ( (lv_value_1_1= ruleExpression | lv_value_1_2= ruleStringValue ) )
            {
            // InternalMyDsl.g:640:4: ( (lv_value_1_1= ruleExpression | lv_value_1_2= ruleStringValue ) )
            // InternalMyDsl.g:641:5: (lv_value_1_1= ruleExpression | lv_value_1_2= ruleStringValue )
            {
            // InternalMyDsl.g:641:5: (lv_value_1_1= ruleExpression | lv_value_1_2= ruleStringValue )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT||(LA7_0>=26 && LA7_0<=31)) ) {
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
                    // InternalMyDsl.g:642:6: lv_value_1_1= ruleExpression
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
                    // InternalMyDsl.g:658:6: lv_value_1_2= ruleStringValue
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


    // $ANTLR start "entryRuleStore"
    // InternalMyDsl.g:684:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalMyDsl.g:684:46: (iv_ruleStore= ruleStore EOF )
            // InternalMyDsl.g:685:2: iv_ruleStore= ruleStore EOF
            {
             newCompositeNode(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStore=ruleStore();

            state._fsp--;

             current =iv_ruleStore; 
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
    // $ANTLR end "entryRuleStore"


    // $ANTLR start "ruleStore"
    // InternalMyDsl.g:691:1: ruleStore returns [EObject current=null] : (otherlv_0= 'Store(' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= ')' ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:697:2: ( (otherlv_0= 'Store(' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:698:2: (otherlv_0= 'Store(' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:698:2: (otherlv_0= 'Store(' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= ')' )
            // InternalMyDsl.g:699:3: otherlv_0= 'Store(' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreAccess().getStoreKeyword_0());
            		
            // InternalMyDsl.g:703:3: ( (lv_url_1_0= RULE_STRING ) )
            // InternalMyDsl.g:704:4: (lv_url_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:704:4: (lv_url_1_0= RULE_STRING )
            // InternalMyDsl.g:705:5: lv_url_1_0= RULE_STRING
            {
            lv_url_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_url_1_0, grammarAccess.getStoreAccess().getUrlSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getStoreAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRuleExport"
    // InternalMyDsl.g:729:1: entryRuleExport returns [EObject current=null] : iv_ruleExport= ruleExport EOF ;
    public final EObject entryRuleExport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExport = null;


        try {
            // InternalMyDsl.g:729:47: (iv_ruleExport= ruleExport EOF )
            // InternalMyDsl.g:730:2: iv_ruleExport= ruleExport EOF
            {
             newCompositeNode(grammarAccess.getExportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExport=ruleExport();

            state._fsp--;

             current =iv_ruleExport; 
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
    // $ANTLR end "entryRuleExport"


    // $ANTLR start "ruleExport"
    // InternalMyDsl.g:736:1: ruleExport returns [EObject current=null] : (otherlv_0= 'Export(' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= ')' ) ;
    public final EObject ruleExport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:742:2: ( (otherlv_0= 'Export(' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:743:2: (otherlv_0= 'Export(' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:743:2: (otherlv_0= 'Export(' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= ')' )
            // InternalMyDsl.g:744:3: otherlv_0= 'Export(' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExportAccess().getExportKeyword_0());
            		
            // InternalMyDsl.g:748:3: ( (lv_url_1_0= RULE_STRING ) )
            // InternalMyDsl.g:749:4: (lv_url_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:749:4: (lv_url_1_0= RULE_STRING )
            // InternalMyDsl.g:750:5: lv_url_1_0= RULE_STRING
            {
            lv_url_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_url_1_0, grammarAccess.getExportAccess().getUrlSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getExportAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleExport"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:774:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:774:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:775:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalMyDsl.g:781:1: ruleExpression returns [EObject current=null] : ( ( (lv_value_0_1= rulePrimaryExpression | lv_value_0_2= ruleBinexpr ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_1 = null;

        EObject lv_value_0_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:787:2: ( ( ( (lv_value_0_1= rulePrimaryExpression | lv_value_0_2= ruleBinexpr ) ) ) )
            // InternalMyDsl.g:788:2: ( ( (lv_value_0_1= rulePrimaryExpression | lv_value_0_2= ruleBinexpr ) ) )
            {
            // InternalMyDsl.g:788:2: ( ( (lv_value_0_1= rulePrimaryExpression | lv_value_0_2= ruleBinexpr ) ) )
            // InternalMyDsl.g:789:3: ( (lv_value_0_1= rulePrimaryExpression | lv_value_0_2= ruleBinexpr ) )
            {
            // InternalMyDsl.g:789:3: ( (lv_value_0_1= rulePrimaryExpression | lv_value_0_2= ruleBinexpr ) )
            // InternalMyDsl.g:790:4: (lv_value_0_1= rulePrimaryExpression | lv_value_0_2= ruleBinexpr )
            {
            // InternalMyDsl.g:790:4: (lv_value_0_1= rulePrimaryExpression | lv_value_0_2= ruleBinexpr )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT||(LA8_0>=26 && LA8_0<=30)) ) {
                alt8=1;
            }
            else if ( (LA8_0==31) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:791:5: lv_value_0_1= rulePrimaryExpression
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getValuePrimaryExpressionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_1=rulePrimaryExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_1,
                    						"org.xtext.example.mydsl.MyDsl.PrimaryExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:807:5: lv_value_0_2= ruleBinexpr
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getValueBinexprParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_2=ruleBinexpr();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_2,
                    						"org.xtext.example.mydsl.MyDsl.Binexpr");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalMyDsl.g:828:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalMyDsl.g:828:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalMyDsl.g:829:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalMyDsl.g:835:1: rulePrimaryExpression returns [EObject current=null] : ( ( (lv_value_0_1= ruleIntValue | lv_value_0_2= ruleSelectcell | lv_value_0_3= ruleLinesum | lv_value_0_4= ruleColsum | lv_value_0_5= ruleLineprod | lv_value_0_6= ruleColprod ) ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_1 = null;

        EObject lv_value_0_2 = null;

        EObject lv_value_0_3 = null;

        EObject lv_value_0_4 = null;

        EObject lv_value_0_5 = null;

        EObject lv_value_0_6 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:841:2: ( ( ( (lv_value_0_1= ruleIntValue | lv_value_0_2= ruleSelectcell | lv_value_0_3= ruleLinesum | lv_value_0_4= ruleColsum | lv_value_0_5= ruleLineprod | lv_value_0_6= ruleColprod ) ) ) )
            // InternalMyDsl.g:842:2: ( ( (lv_value_0_1= ruleIntValue | lv_value_0_2= ruleSelectcell | lv_value_0_3= ruleLinesum | lv_value_0_4= ruleColsum | lv_value_0_5= ruleLineprod | lv_value_0_6= ruleColprod ) ) )
            {
            // InternalMyDsl.g:842:2: ( ( (lv_value_0_1= ruleIntValue | lv_value_0_2= ruleSelectcell | lv_value_0_3= ruleLinesum | lv_value_0_4= ruleColsum | lv_value_0_5= ruleLineprod | lv_value_0_6= ruleColprod ) ) )
            // InternalMyDsl.g:843:3: ( (lv_value_0_1= ruleIntValue | lv_value_0_2= ruleSelectcell | lv_value_0_3= ruleLinesum | lv_value_0_4= ruleColsum | lv_value_0_5= ruleLineprod | lv_value_0_6= ruleColprod ) )
            {
            // InternalMyDsl.g:843:3: ( (lv_value_0_1= ruleIntValue | lv_value_0_2= ruleSelectcell | lv_value_0_3= ruleLinesum | lv_value_0_4= ruleColsum | lv_value_0_5= ruleLineprod | lv_value_0_6= ruleColprod ) )
            // InternalMyDsl.g:844:4: (lv_value_0_1= ruleIntValue | lv_value_0_2= ruleSelectcell | lv_value_0_3= ruleLinesum | lv_value_0_4= ruleColsum | lv_value_0_5= ruleLineprod | lv_value_0_6= ruleColprod )
            {
            // InternalMyDsl.g:844:4: (lv_value_0_1= ruleIntValue | lv_value_0_2= ruleSelectcell | lv_value_0_3= ruleLinesum | lv_value_0_4= ruleColsum | lv_value_0_5= ruleLineprod | lv_value_0_6= ruleColprod )
            int alt9=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case 26:
                {
                alt9=2;
                }
                break;
            case 27:
                {
                alt9=3;
                }
                break;
            case 28:
                {
                alt9=4;
                }
                break;
            case 29:
                {
                alt9=5;
                }
                break;
            case 30:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:845:5: lv_value_0_1= ruleIntValue
                    {

                    					newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getValueIntValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_1=ruleIntValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_1,
                    						"org.xtext.example.mydsl.MyDsl.IntValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:861:5: lv_value_0_2= ruleSelectcell
                    {

                    					newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getValueSelectcellParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_2=ruleSelectcell();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_2,
                    						"org.xtext.example.mydsl.MyDsl.Selectcell");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:877:5: lv_value_0_3= ruleLinesum
                    {

                    					newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getValueLinesumParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_3=ruleLinesum();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_3,
                    						"org.xtext.example.mydsl.MyDsl.Linesum");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:893:5: lv_value_0_4= ruleColsum
                    {

                    					newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getValueColsumParserRuleCall_0_3());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_4=ruleColsum();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_4,
                    						"org.xtext.example.mydsl.MyDsl.Colsum");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:909:5: lv_value_0_5= ruleLineprod
                    {

                    					newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getValueLineprodParserRuleCall_0_4());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_5=ruleLineprod();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_5,
                    						"org.xtext.example.mydsl.MyDsl.Lineprod");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:925:5: lv_value_0_6= ruleColprod
                    {

                    					newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getValueColprodParserRuleCall_0_5());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_6=ruleColprod();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_6,
                    						"org.xtext.example.mydsl.MyDsl.Colprod");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleSelectcell"
    // InternalMyDsl.g:946:1: entryRuleSelectcell returns [EObject current=null] : iv_ruleSelectcell= ruleSelectcell EOF ;
    public final EObject entryRuleSelectcell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectcell = null;


        try {
            // InternalMyDsl.g:946:51: (iv_ruleSelectcell= ruleSelectcell EOF )
            // InternalMyDsl.g:947:2: iv_ruleSelectcell= ruleSelectcell EOF
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
    // InternalMyDsl.g:953:1: ruleSelectcell returns [EObject current=null] : (otherlv_0= 'Selectcell(' ( (lv_cellX_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_cellY_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleSelectcell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_cellX_1_0 = null;

        EObject lv_cellY_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:959:2: ( (otherlv_0= 'Selectcell(' ( (lv_cellX_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_cellY_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalMyDsl.g:960:2: (otherlv_0= 'Selectcell(' ( (lv_cellX_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_cellY_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalMyDsl.g:960:2: (otherlv_0= 'Selectcell(' ( (lv_cellX_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_cellY_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalMyDsl.g:961:3: otherlv_0= 'Selectcell(' ( (lv_cellX_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_cellY_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectcellAccess().getSelectcellKeyword_0());
            		
            // InternalMyDsl.g:965:3: ( (lv_cellX_1_0= ruleExpression ) )
            // InternalMyDsl.g:966:4: (lv_cellX_1_0= ruleExpression )
            {
            // InternalMyDsl.g:966:4: (lv_cellX_1_0= ruleExpression )
            // InternalMyDsl.g:967:5: lv_cellX_1_0= ruleExpression
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
            		
            // InternalMyDsl.g:988:3: ( (lv_cellY_3_0= ruleExpression ) )
            // InternalMyDsl.g:989:4: (lv_cellY_3_0= ruleExpression )
            {
            // InternalMyDsl.g:989:4: (lv_cellY_3_0= ruleExpression )
            // InternalMyDsl.g:990:5: lv_cellY_3_0= ruleExpression
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
    // InternalMyDsl.g:1015:1: entryRuleLinesum returns [EObject current=null] : iv_ruleLinesum= ruleLinesum EOF ;
    public final EObject entryRuleLinesum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinesum = null;


        try {
            // InternalMyDsl.g:1015:48: (iv_ruleLinesum= ruleLinesum EOF )
            // InternalMyDsl.g:1016:2: iv_ruleLinesum= ruleLinesum EOF
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
    // InternalMyDsl.g:1022:1: ruleLinesum returns [EObject current=null] : (otherlv_0= 'Linesum(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleLinesum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_lineIndex_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1028:2: ( (otherlv_0= 'Linesum(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:1029:2: (otherlv_0= 'Linesum(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:1029:2: (otherlv_0= 'Linesum(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')' )
            // InternalMyDsl.g:1030:3: otherlv_0= 'Linesum(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLinesumAccess().getLinesumKeyword_0());
            		
            // InternalMyDsl.g:1034:3: ( (lv_lineIndex_1_0= ruleExpression ) )
            // InternalMyDsl.g:1035:4: (lv_lineIndex_1_0= ruleExpression )
            {
            // InternalMyDsl.g:1035:4: (lv_lineIndex_1_0= ruleExpression )
            // InternalMyDsl.g:1036:5: lv_lineIndex_1_0= ruleExpression
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
    // InternalMyDsl.g:1061:1: entryRuleColsum returns [EObject current=null] : iv_ruleColsum= ruleColsum EOF ;
    public final EObject entryRuleColsum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColsum = null;


        try {
            // InternalMyDsl.g:1061:47: (iv_ruleColsum= ruleColsum EOF )
            // InternalMyDsl.g:1062:2: iv_ruleColsum= ruleColsum EOF
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
    // InternalMyDsl.g:1068:1: ruleColsum returns [EObject current=null] : (otherlv_0= 'Colsum(' ( (lv_colIndex_1_0= ruleExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleColsum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_colIndex_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1074:2: ( (otherlv_0= 'Colsum(' ( (lv_colIndex_1_0= ruleExpression ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:1075:2: (otherlv_0= 'Colsum(' ( (lv_colIndex_1_0= ruleExpression ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:1075:2: (otherlv_0= 'Colsum(' ( (lv_colIndex_1_0= ruleExpression ) ) otherlv_2= ')' )
            // InternalMyDsl.g:1076:3: otherlv_0= 'Colsum(' ( (lv_colIndex_1_0= ruleExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getColsumAccess().getColsumKeyword_0());
            		
            // InternalMyDsl.g:1080:3: ( (lv_colIndex_1_0= ruleExpression ) )
            // InternalMyDsl.g:1081:4: (lv_colIndex_1_0= ruleExpression )
            {
            // InternalMyDsl.g:1081:4: (lv_colIndex_1_0= ruleExpression )
            // InternalMyDsl.g:1082:5: lv_colIndex_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getColsumAccess().getColIndexExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:1107:1: entryRuleLineprod returns [EObject current=null] : iv_ruleLineprod= ruleLineprod EOF ;
    public final EObject entryRuleLineprod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineprod = null;


        try {
            // InternalMyDsl.g:1107:49: (iv_ruleLineprod= ruleLineprod EOF )
            // InternalMyDsl.g:1108:2: iv_ruleLineprod= ruleLineprod EOF
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
    // InternalMyDsl.g:1114:1: ruleLineprod returns [EObject current=null] : (otherlv_0= 'Lineprod(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleLineprod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_lineIndex_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1120:2: ( (otherlv_0= 'Lineprod(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:1121:2: (otherlv_0= 'Lineprod(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:1121:2: (otherlv_0= 'Lineprod(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')' )
            // InternalMyDsl.g:1122:3: otherlv_0= 'Lineprod(' ( (lv_lineIndex_1_0= ruleExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLineprodAccess().getLineprodKeyword_0());
            		
            // InternalMyDsl.g:1126:3: ( (lv_lineIndex_1_0= ruleExpression ) )
            // InternalMyDsl.g:1127:4: (lv_lineIndex_1_0= ruleExpression )
            {
            // InternalMyDsl.g:1127:4: (lv_lineIndex_1_0= ruleExpression )
            // InternalMyDsl.g:1128:5: lv_lineIndex_1_0= ruleExpression
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
    // InternalMyDsl.g:1153:1: entryRuleColprod returns [EObject current=null] : iv_ruleColprod= ruleColprod EOF ;
    public final EObject entryRuleColprod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColprod = null;


        try {
            // InternalMyDsl.g:1153:48: (iv_ruleColprod= ruleColprod EOF )
            // InternalMyDsl.g:1154:2: iv_ruleColprod= ruleColprod EOF
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
    // InternalMyDsl.g:1160:1: ruleColprod returns [EObject current=null] : (otherlv_0= 'Colprod(' ( (lv_colIndex_1_0= ruleExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleColprod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_colIndex_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1166:2: ( (otherlv_0= 'Colprod(' ( (lv_colIndex_1_0= ruleExpression ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:1167:2: (otherlv_0= 'Colprod(' ( (lv_colIndex_1_0= ruleExpression ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:1167:2: (otherlv_0= 'Colprod(' ( (lv_colIndex_1_0= ruleExpression ) ) otherlv_2= ')' )
            // InternalMyDsl.g:1168:3: otherlv_0= 'Colprod(' ( (lv_colIndex_1_0= ruleExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getColprodAccess().getColprodKeyword_0());
            		
            // InternalMyDsl.g:1172:3: ( (lv_colIndex_1_0= ruleExpression ) )
            // InternalMyDsl.g:1173:4: (lv_colIndex_1_0= ruleExpression )
            {
            // InternalMyDsl.g:1173:4: (lv_colIndex_1_0= ruleExpression )
            // InternalMyDsl.g:1174:5: lv_colIndex_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getColprodAccess().getColIndexExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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


    // $ANTLR start "entryRuleBinexpr"
    // InternalMyDsl.g:1199:1: entryRuleBinexpr returns [EObject current=null] : iv_ruleBinexpr= ruleBinexpr EOF ;
    public final EObject entryRuleBinexpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinexpr = null;


        try {
            // InternalMyDsl.g:1199:48: (iv_ruleBinexpr= ruleBinexpr EOF )
            // InternalMyDsl.g:1200:2: iv_ruleBinexpr= ruleBinexpr EOF
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
    // InternalMyDsl.g:1206:1: ruleBinexpr returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= rulePrimaryExpression ) ) ( (lv_op_2_0= ruleOp ) ) ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleBinexpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1212:2: ( (otherlv_0= '(' ( (lv_left_1_0= rulePrimaryExpression ) ) ( (lv_op_2_0= ruleOp ) ) ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalMyDsl.g:1213:2: (otherlv_0= '(' ( (lv_left_1_0= rulePrimaryExpression ) ) ( (lv_op_2_0= ruleOp ) ) ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalMyDsl.g:1213:2: (otherlv_0= '(' ( (lv_left_1_0= rulePrimaryExpression ) ) ( (lv_op_2_0= ruleOp ) ) ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalMyDsl.g:1214:3: otherlv_0= '(' ( (lv_left_1_0= rulePrimaryExpression ) ) ( (lv_op_2_0= ruleOp ) ) ( (lv_right_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getBinexprAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyDsl.g:1218:3: ( (lv_left_1_0= rulePrimaryExpression ) )
            // InternalMyDsl.g:1219:4: (lv_left_1_0= rulePrimaryExpression )
            {
            // InternalMyDsl.g:1219:4: (lv_left_1_0= rulePrimaryExpression )
            // InternalMyDsl.g:1220:5: lv_left_1_0= rulePrimaryExpression
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

            // InternalMyDsl.g:1237:3: ( (lv_op_2_0= ruleOp ) )
            // InternalMyDsl.g:1238:4: (lv_op_2_0= ruleOp )
            {
            // InternalMyDsl.g:1238:4: (lv_op_2_0= ruleOp )
            // InternalMyDsl.g:1239:5: lv_op_2_0= ruleOp
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

            // InternalMyDsl.g:1256:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalMyDsl.g:1257:4: (lv_right_3_0= ruleExpression )
            {
            // InternalMyDsl.g:1257:4: (lv_right_3_0= ruleExpression )
            // InternalMyDsl.g:1258:5: lv_right_3_0= ruleExpression
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
    // InternalMyDsl.g:1283:1: entryRuleOp returns [String current=null] : iv_ruleOp= ruleOp EOF ;
    public final String entryRuleOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOp = null;


        try {
            // InternalMyDsl.g:1283:42: (iv_ruleOp= ruleOp EOF )
            // InternalMyDsl.g:1284:2: iv_ruleOp= ruleOp EOF
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
    // InternalMyDsl.g:1290:1: ruleOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1296:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) )
            // InternalMyDsl.g:1297:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            {
            // InternalMyDsl.g:1297:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt10=1;
                }
                break;
            case 33:
                {
                alt10=2;
                }
                break;
            case 34:
                {
                alt10=3;
                }
                break;
            case 35:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1298:3: kw= '+'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1304:3: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1310:3: kw= '*'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1316:3: kw= '/'
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


    // $ANTLR start "entryRuleIntValue"
    // InternalMyDsl.g:1325:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalMyDsl.g:1325:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalMyDsl.g:1326:2: iv_ruleIntValue= ruleIntValue EOF
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
    // InternalMyDsl.g:1332:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1338:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalMyDsl.g:1339:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalMyDsl.g:1339:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalMyDsl.g:1340:3: (lv_value_0_0= RULE_INT )
            {
            // InternalMyDsl.g:1340:3: (lv_value_0_0= RULE_INT )
            // InternalMyDsl.g:1341:4: lv_value_0_0= RULE_INT
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
    // InternalMyDsl.g:1360:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalMyDsl.g:1360:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalMyDsl.g:1361:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalMyDsl.g:1367:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1373:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1374:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:1374:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMyDsl.g:1375:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:1375:3: (lv_value_0_0= RULE_STRING )
            // InternalMyDsl.g:1376:4: lv_value_0_0= RULE_STRING
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000003FA4000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000FC000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000FC000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000007C000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000F00000000L});

}