/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 30 16:13:03 GMT 2020
 */

package org.antlr.v4.codegen.target;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Python2Target_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.antlr.v4.codegen.target.Python2Target"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "BR"); 
    java.lang.System.setProperty("user.dir", "/server/study-execution/new-nimrod/nimrod-hunoroutput-test-dest/antlr4/69ff2669eec265e25721dbc27cb00f6c381d0b41/evosuite_28"); 
    java.lang.System.setProperty("user.home", "/server"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "author-name"); 
    java.lang.System.setProperty("user.timezone", "Europe/Stockholm"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Python2Target_ESTest_scaffolding.class.getClassLoader() ,
      "org.antlr.v4.automata.ATNFactory$Handle",
      "org.antlr.v4.codegen.model.ModelElement",
      "org.antlr.v4.runtime.ANTLRErrorStrategy",
      "org.antlr.v4.codegen.target.Python2Target$PythonStringRenderer",
      "org.antlr.v4.runtime.atn.ArrayPredictionContext",
      "org.antlr.v4.runtime.tree.pattern.TextChunk",
      "org.antlr.v4.codegen.model.MatchSet",
      "org.antlr.v4.runtime.misc.LogManager",
      "org.antlr.v4.codegen.model.MatchNotSet",
      "org.antlr.v4.codegen.model.PlusBlock",
      "org.antlr.v4.runtime.atn.LoopEndState",
      "org.antlr.v4.runtime.Parser$TraceListener",
      "org.antlr.runtime.LegacyCommonTokenStream",
      "org.antlr.v4.codegen.model.decl.CodeBlock",
      "org.antlr.v4.runtime.BufferedTokenStream",
      "org.antlr.v4.tool.ast.GrammarRootAST",
      "org.antlr.v4.semantics.BlankActionSplitterListener",
      "org.stringtemplate.v4.misc.MultiMap",
      "org.antlr.v4.parse.GrammarTreeVisitor$range_return",
      "org.antlr.v4.runtime.Recognizer",
      "org.stringtemplate.v4.misc.Aggregate",
      "org.antlr.v4.runtime.atn.PredicateTransition",
      "org.antlr.v4.parse.GrammarTreeVisitor$prequelConstruct_return",
      "org.antlr.v4.parse.GrammarTreeVisitor$rules_return",
      "org.antlr.v4.parse.GrammarTreeVisitor$action_return",
      "org.stringtemplate.v4.misc.STCompiletimeMessage",
      "org.stringtemplate.v4.misc.MapModelAdaptor",
      "org.antlr.v4.runtime.ANTLRFileStream",
      "org.antlr.v4.codegen.OutputModelFactory",
      "org.antlr.runtime.TokenRewriteStream",
      "org.antlr.v4.tool.Alternative",
      "org.antlr.v4.runtime.atn.EmptyPredictionContext",
      "org.antlr.v4.codegen.model.LL1PlusBlockSingleAlt",
      "org.antlr.v4.codegen.model.dbg",
      "org.antlr.runtime.tree.TreeWizard$ContextVisitor",
      "org.antlr.v4.parse.GrammarTreeVisitor$rule_return",
      "org.antlr.v4.parse.GrammarTreeVisitor$alternative_return",
      "org.antlr.runtime.tree.CommonTree",
      "org.antlr.runtime.MismatchedNotSetException",
      "org.antlr.v4.codegen.model.chunk.TokenPropertyRef_line",
      "org.antlr.v4.runtime.atn.EpsilonTransition",
      "org.antlr.v4.codegen.model.decl.Decl",
      "org.antlr.v4.codegen.model.Recognizer",
      "org.stringtemplate.v4.compiler.CompiledST",
      "org.antlr.v4.runtime.FailedPredicateException",
      "org.antlr.v4.codegen.model.VisitorFile",
      "org.antlr.v4.runtime.dfa.DFASerializer",
      "org.antlr.v4.runtime.atn.ProfilingATNSimulator",
      "org.antlr.v4.tool.ast.RuleRefAST",
      "org.antlr.v4.runtime.atn.PredictionMode",
      "org.antlr.v4.runtime.TokenSource",
      "org.antlr.v4.runtime.atn.LexerCustomAction",
      "org.antlr.v4.parse.GrammarTreeVisitor$finallyClause_return",
      "org.antlr.v4.tool.ast.BlockAST",
      "org.antlr.v4.automata.ATNFactory",
      "org.stringtemplate.v4.NumberRenderer",
      "org.antlr.v4.runtime.Parser",
      "org.antlr.v4.runtime.tree.ParseTreeListener",
      "org.antlr.v4.parse.GrammarTreeVisitor$lexerElement_return",
      "org.antlr.runtime.tree.TreeWizard",
      "org.antlr.v4.runtime.ANTLRErrorListener",
      "org.antlr.v4.runtime.atn.ATNConfigSet$AbstractConfigHashSet",
      "org.stringtemplate.v4.ST$DebugState",
      "org.antlr.v4.runtime.atn.LexerATNConfig",
      "org.antlr.v4.runtime.TokenStream",
      "org.antlr.runtime.EarlyExitException",
      "org.antlr.v4.codegen.Target",
      "org.antlr.v4.runtime.misc.EqualityComparator",
      "org.antlr.v4.tool.ErrorManager",
      "org.antlr.v4.parse.GrammarTreeVisitor$tokenSpec_return",
      "org.antlr.runtime.Token",
      "org.antlr.v4.codegen.model.MatchToken",
      "org.antlr.v4.parse.GrammarTreeVisitor$lexerRuleBlock_return",
      "org.antlr.v4.parse.GrammarTreeVisitor$optionsSpec_return",
      "org.antlr.v4.codegen.model.LeftRecursiveRuleFunction",
      "org.antlr.v4.codegen.ParserFactory",
      "org.antlr.v4.codegen.model.Choice",
      "org.antlr.v4.Tool$OptionArgType",
      "org.antlr.v4.runtime.misc.Array2DHashSet",
      "org.antlr.v4.runtime.tree.Tree",
      "org.antlr.v4.runtime.Vocabulary",
      "org.antlr.v4.runtime.WritableToken",
      "org.antlr.v4.runtime.misc.IntegerStack",
      "org.antlr.runtime.RecognizerSharedState",
      "org.antlr.v4.codegen.model.chunk.ThisRulePropertyRef_stop",
      "org.stringtemplate.v4.misc.STNoSuchAttributeException",
      "org.antlr.v4.codegen.model.SrcOp",
      "org.antlr.v4.codegen.SourceGenTriggers$alt_return",
      "org.antlr.v4.parse.GrammarTreeVisitor$delegateGrammar_return",
      "org.antlr.v4.parse.ANTLRLexer$DFA2",
      "org.antlr.runtime.tree.TreeVisitorAction",
      "org.antlr.v4.parse.GrammarTreeVisitor$mode_return",
      "org.antlr.v4.codegen.model.ListenerDispatchMethod",
      "org.antlr.v4.runtime.atn.ATNDeserializer",
      "org.antlr.v4.runtime.LexerNoViableAltException",
      "org.antlr.v4.tool.ast.GrammarASTVisitor",
      "org.antlr.v4.runtime.atn.SetTransition",
      "org.antlr.v4.codegen.model.Lexer",
      "org.antlr.v4.parse.GrammarTreeVisitor$element_return",
      "org.antlr.v4.tool.ast.RuleElementAST",
      "org.antlr.v4.codegen.model.RuleSempredFunction",
      "org.antlr.v4.runtime.atn.OrderedATNConfigSet$LexerConfigHashSet",
      "org.antlr.v4.parse.GrammarTreeVisitor$optionValue_return",
      "org.antlr.v4.runtime.atn.LexerActionExecutor",
      "org.antlr.v4.runtime.atn.BlockStartState",
      "org.stringtemplate.v4.compiler.STException",
      "org.antlr.runtime.DFA",
      "org.stringtemplate.v4.DateRenderer$1",
      "org.antlr.v4.tool.ANTLRToolListener",
      "org.antlr.v4.parse.GrammarTreeVisitor$elementOptions_return",
      "org.antlr.v4.codegen.model.LL1Choice",
      "org.antlr.runtime.MismatchedRangeException",
      "org.antlr.v4.codegen.SourceGenTriggers",
      "org.antlr.v4.runtime.misc.AbstractEqualityComparator",
      "org.antlr.v4.tool.LabelElementPair",
      "org.stringtemplate.v4.gui.STViewFrame",
      "org.antlr.runtime.tree.CommonTreeAdaptor",
      "org.antlr.v4.runtime.IntStream",
      "org.antlr.runtime.UnwantedTokenException",
      "org.stringtemplate.v4.ST$RegionType",
      "org.antlr.v4.Tool$Option",
      "org.antlr.v4.tool.Attribute",
      "org.stringtemplate.v4.debug.EvalExprEvent",
      "org.antlr.v4.runtime.misc.IntegerList",
      "org.antlr.runtime.tree.TreeAdaptor",
      "org.antlr.v4.parse.GrammarTreeVisitor$exceptionGroup_return",
      "org.antlr.v4.runtime.tree.TerminalNode",
      "org.antlr.runtime.tree.TreeParser",
      "org.antlr.v4.runtime.atn.RuleStartState",
      "org.antlr.v4.runtime.atn.Transition$1",
      "org.antlr.v4.codegen.model.chunk.TokenPropertyRef_text",
      "org.antlr.v4.runtime.ListTokenSource",
      "org.antlr.v4.runtime.atn.ATNSimulator",
      "org.antlr.v4.codegen.model.OutputModelObject",
      "org.antlr.v4.parse.ToolANTLRLexer",
      "org.antlr.v4.codegen.model.chunk.TokenPropertyRef_channel",
      "org.antlr.v4.codegen.model.DispatchMethod",
      "org.antlr.v4.codegen.model.LabeledOp",
      "org.antlr.v4.codegen.model.chunk.RulePropertyRef_ctx",
      "org.antlr.runtime.tree.BaseTree",
      "org.antlr.v4.runtime.UnbufferedTokenStream",
      "org.antlr.v4.misc.OrderedHashMap",
      "org.stringtemplate.v4.NoIndentWriter",
      "org.antlr.runtime.tree.ParseTree",
      "org.stringtemplate.v4.misc.STGroupCompiletimeMessage",
      "org.antlr.v4.codegen.model.RuleElement",
      "org.antlr.v4.runtime.RuleContext",
      "org.antlr.v4.parse.GrammarTreeVisitor$lexerBlock_return",
      "org.antlr.v4.codegen.model.chunk.RulePropertyRef_parser",
      "org.antlr.v4.runtime.CharStream",
      "org.antlr.runtime.BufferedTokenStream",
      "org.antlr.runtime.BitSet",
      "org.stringtemplate.v4.ModelAdaptor",
      "org.antlr.runtime.tree.CommonErrorNode",
      "org.antlr.v4.parse.GrammarTreeVisitor$ebnfSuffix_return",
      "org.antlr.v4.codegen.model.TestSetInline",
      "org.antlr.runtime.tree.TreeNodeStream",
      "org.antlr.v4.codegen.model.chunk.ThisRulePropertyRef_ctx",
      "org.antlr.v4.runtime.atn.LexerPopModeAction",
      "org.antlr.v4.tool.ast.RangeAST",
      "org.antlr.v4.runtime.atn.LexerAction",
      "org.antlr.v4.tool.ast.AltAST",
      "org.antlr.v4.semantics.ActionSniffer",
      "org.antlr.v4.runtime.atn.LexerIndexedCustomAction",
      "org.antlr.v4.runtime.atn.LexerSkipAction",
      "org.antlr.v4.codegen.CodeGenerator",
      "org.antlr.v4.codegen.CodeGeneratorExtension",
      "org.antlr.v4.automata.LexerATNFactory",
      "org.antlr.v4.codegen.DefaultOutputModelFactory",
      "org.antlr.v4.parse.GrammarTreeVisitor$blockSet_return",
      "org.antlr.v4.runtime.dfa.DFA",
      "org.antlr.v4.runtime.atn.WildcardTransition",
      "org.antlr.v4.runtime.atn.LexerModeAction",
      "org.stringtemplate.v4.misc.ErrorType",
      "org.stringtemplate.v4.debug.ConstructionEvent",
      "org.stringtemplate.v4.STWriter",
      "org.antlr.v4.parse.ActionSplitterListener",
      "org.antlr.v4.codegen.OutputModelController",
      "org.antlr.v4.runtime.atn.RuleTransition",
      "org.antlr.v4.runtime.tree.pattern.TagChunk",
      "org.stringtemplate.v4.AttributeRenderer",
      "org.antlr.v4.tool.AttributeDict",
      "org.antlr.v4.codegen.model.chunk.ThisRulePropertyRef_text",
      "org.stringtemplate.v4.Interpreter",
      "org.antlr.runtime.RecognitionException",
      "org.antlr.v4.codegen.model.AltBlock",
      "org.antlr.v4.tool.ToolMessage",
      "org.antlr.v4.codegen.model.ParserFile",
      "org.antlr.v4.tool.LabelType",
      "org.antlr.v4.tool.ast.OptionalBlockAST",
      "org.antlr.v4.runtime.atn.PrecedencePredicateTransition",
      "org.antlr.v4.codegen.model.ThrowNoViableAlt",
      "org.antlr.v4.runtime.atn.LexerATNSimulator",
      "org.antlr.v4.codegen.model.AddToLabelList",
      "org.antlr.runtime.TokenSource",
      "org.antlr.runtime.tree.CommonTreeNodeStream",
      "org.antlr.v4.codegen.model.Action",
      "org.antlr.v4.codegen.model.RuleActionFunction",
      "org.antlr.v4.runtime.atn.BasicBlockStartState",
      "org.antlr.v4.parse.GrammarTreeVisitor$lexerAlternative_return",
      "org.antlr.v4.parse.GrammarTreeVisitor$ruleModifier_return",
      "org.antlr.v4.codegen.model.decl.RuleContextDecl",
      "org.antlr.v4.runtime.misc.LogManager$Record",
      "org.antlr.v4.parse.GrammarTreeVisitor$ruleBlock_return",
      "org.antlr.v4.tool.LeftRecursiveRule",
      "org.antlr.v4.runtime.Parser$TrimToSizeListener",
      "org.antlr.v4.runtime.UnbufferedCharStream",
      "org.antlr.v4.runtime.misc.IntervalSet",
      "org.antlr.runtime.FailedPredicateException",
      "org.antlr.v4.parse.GrammarTreeVisitor$ruleref_return",
      "org.antlr.runtime.TokenStream",
      "org.antlr.runtime.ANTLRStringStream",
      "org.antlr.v4.runtime.atn.BasicState",
      "org.antlr.v4.runtime.NoViableAltException",
      "org.antlr.v4.runtime.atn.ATNType",
      "org.antlr.v4.semantics.AttributeChecks",
      "org.stringtemplate.v4.gui.STViz$5",
      "org.antlr.v4.parse.ActionSplitter",
      "org.antlr.v4.runtime.atn.SemanticContext$AND",
      "org.antlr.v4.codegen.model.RuleFunction",
      "org.antlr.v4.runtime.atn.ATNConfigSet",
      "org.antlr.v4.runtime.atn.SemanticContext$PrecedencePredicate",
      "org.antlr.v4.codegen.model.chunk.RulePropertyRef_text",
      "org.antlr.v4.parse.GrammarTreeVisitor$block_return",
      "org.antlr.v4.runtime.InterpreterRuleContext",
      "org.antlr.v4.runtime.InputMismatchException",
      "org.antlr.v4.automata.ParserATNFactory",
      "org.antlr.v4.parse.GrammarTreeVisitor$channelsSpec_return",
      "org.antlr.v4.runtime.CommonTokenFactory",
      "org.antlr.v4.codegen.model.chunk.RulePropertyRef",
      "org.antlr.runtime.MismatchedTokenException",
      "org.stringtemplate.v4.misc.Interval",
      "org.antlr.v4.runtime.atn.SemanticContext",
      "org.antlr.v4.parse.GrammarTreeVisitor$labeledLexerElement_return",
      "org.antlr.v4.parse.v3TreeGrammarException",
      "org.antlr.v4.parse.GrammarTreeVisitor",
      "org.antlr.v4.parse.GrammarTreeVisitor$outerAlternative_return",
      "org.antlr.v4.runtime.atn.StarLoopEntryState",
      "org.antlr.v4.tool.ast.PredAST",
      "org.antlr.v4.tool.LeftRecursionCyclesMessage",
      "org.antlr.v4.codegen.model.chunk.TokenPropertyRef_pos",
      "org.antlr.v4.codegen.BlankOutputModelFactory",
      "org.antlr.v4.codegen.model.CaptureNextTokenType",
      "org.antlr.v4.codegen.model.CodeBlockForAlt",
      "org.antlr.v4.codegen.model.chunk.TokenPropertyRef_int",
      "org.antlr.runtime.tree.TreeWizard$WildcardTreePattern",
      "org.antlr.v4.codegen.model.ArgAction",
      "org.antlr.v4.codegen.LexerFactory",
      "org.antlr.v4.tool.AttributeDict$DictType",
      "org.antlr.v4.codegen.model.ExceptionClause",
      "org.antlr.v4.runtime.tree.pattern.RuleTagToken",
      "org.antlr.v4.codegen.model.decl.RuleContextListDecl",
      "org.antlr.v4.codegen.model.LL1Loop",
      "org.antlr.v4.runtime.tree.pattern.Chunk",
      "org.antlr.runtime.UnbufferedTokenStream",
      "org.antlr.v4.runtime.tree.pattern.ParseTreeMatch",
      "org.stringtemplate.v4.STGroup",
      "org.stringtemplate.v4.misc.AggregateModelAdaptor",
      "org.antlr.v4.codegen.model.InvokeRule",
      "org.antlr.v4.codegen.model.OptionalBlock",
      "org.antlr.v4.runtime.misc.IntSet",
      "org.stringtemplate.v4.misc.AmbiguousMatchException",
      "org.antlr.v4.tool.Rule",
      "org.antlr.v4.runtime.CommonToken",
      "org.antlr.v4.runtime.ANTLRInputStream",
      "org.antlr.v4.codegen.model.Sync",
      "org.antlr.v4.codegen.model.Loop",
      "org.antlr.v4.tool.ast.QuantifierAST",
      "org.antlr.v4.codegen.model.VisitorDispatchMethod",
      "org.stringtemplate.v4.misc.STNoSuchPropertyException",
      "org.antlr.v4.codegen.model.decl.TokenTypeDecl",
      "org.antlr.runtime.misc.LookaheadStream",
      "org.antlr.v4.parse.GrammarTreeVisitor$subrule_return",
      "org.stringtemplate.v4.STGroupFile",
      "org.antlr.v4.codegen.model.OutputFile",
      "org.antlr.v4.runtime.atn.TokensStartState",
      "org.antlr.v4.runtime.atn.DecisionState",
      "org.antlr.v4.runtime.atn.ATNConfigSet$ConfigEqualityComparator",
      "org.antlr.v4.runtime.atn.BlockEndState",
      "org.antlr.runtime.tree.TreeIterator",
      "org.stringtemplate.v4.misc.ErrorBuffer",
      "org.antlr.v4.parse.ANTLRLexer$DFA34",
      "org.stringtemplate.v4.InstanceScope",
      "org.antlr.v4.tool.ast.SetAST",
      "org.antlr.v4.tool.ast.RuleAST",
      "org.antlr.v4.runtime.atn.ActionTransition",
      "org.antlr.v4.parse.ANTLRLexer",
      "org.antlr.v4.codegen.model.StarBlock",
      "org.antlr.v4.tool.ErrorSeverity",
      "org.stringtemplate.v4.misc.TypeRegistry",
      "org.antlr.v4.tool.ast.NotAST",
      "org.antlr.v4.codegen.model.chunk.ActionChunk",
      "org.antlr.v4.codegen.model.BaseListenerFile",
      "org.antlr.runtime.CharStream",
      "org.antlr.v4.runtime.atn.ParserATNSimulator",
      "org.antlr.v4.codegen.model.decl.StructDecl",
      "org.antlr.v4.codegen.model.SerializedATN",
      "org.antlr.v4.runtime.atn.LexerATNSimulator$SimState",
      "org.antlr.v4.runtime.atn.AtomTransition",
      "org.antlr.runtime.tree.TreeWizard$TreePatternTreeAdaptor",
      "org.stringtemplate.v4.StringRenderer",
      "org.antlr.runtime.tree.TreeRuleReturnScope",
      "org.antlr.v4.parse.GrammarTreeVisitor$setElement_return",
      "org.antlr.v4.runtime.RecognitionException",
      "org.stringtemplate.v4.misc.STRuntimeMessage",
      "org.antlr.v4.parse.GrammarTreeVisitor$lexerCommand_return",
      "org.antlr.v4.runtime.atn.RangeTransition",
      "org.antlr.v4.runtime.VocabularyImpl",
      "org.antlr.v4.parse.GrammarTreeVisitor$lexerElements_return",
      "org.antlr.runtime.Lexer",
      "org.antlr.v4.codegen.model.chunk.TokenPropertyRef_index",
      "org.antlr.v4.tool.Grammar$2",
      "org.stringtemplate.v4.STGroupString",
      "org.antlr.v4.codegen.model.chunk.RulePropertyRef_stop",
      "org.antlr.v4.runtime.misc.Interval",
      "org.antlr.v4.codegen.model.LL1AltBlock",
      "org.antlr.runtime.MissingTokenException",
      "org.antlr.v4.codegen.model.LexerFile",
      "org.antlr.v4.runtime.atn.StarLoopbackState",
      "org.antlr.v4.codegen.model.decl.TokenDecl",
      "org.antlr.runtime.TokenRewriteStream$RewriteOperation",
      "org.antlr.v4.runtime.atn.LexerPushModeAction",
      "org.antlr.v4.Tool",
      "org.antlr.v4.runtime.atn.OrderedATNConfigSet",
      "org.stringtemplate.v4.ST$AttributeList",
      "org.antlr.v4.codegen.model.ThrowRecognitionException",
      "org.antlr.v4.runtime.misc.MurmurHash",
      "org.antlr.v4.runtime.tree.TerminalNodeImpl",
      "org.antlr.v4.tool.AttributeResolver",
      "org.antlr.v4.codegen.model.BaseVisitorFile",
      "org.antlr.v4.codegen.model.ThrowEarlyExitException",
      "org.antlr.v4.runtime.atn.SemanticContext$Predicate",
      "org.antlr.v4.runtime.TokenFactory",
      "org.stringtemplate.v4.misc.ErrorManager$1",
      "org.antlr.v4.runtime.atn.LexerTypeAction",
      "org.stringtemplate.v4.gui.STViz",
      "org.stringtemplate.v4.misc.STLexerMessage",
      "org.stringtemplate.v4.debug.IndentEvent",
      "org.antlr.v4.runtime.tree.ErrorNodeImpl",
      "org.antlr.v4.parse.GrammarTreeVisitor$elementOption_return",
      "org.antlr.v4.runtime.atn.PredictionContext",
      "org.antlr.v4.runtime.atn.PlusLoopbackState",
      "org.antlr.runtime.NoViableAltException",
      "org.antlr.runtime.misc.IntArray",
      "org.antlr.runtime.CommonTokenStream",
      "org.antlr.runtime.RuleReturnScope",
      "org.antlr.runtime.tree.BufferedTreeNodeStream",
      "org.antlr.runtime.ANTLRReaderStream",
      "org.stringtemplate.v4.misc.STModelAdaptor",
      "org.antlr.v4.runtime.atn.PredictionContextCache",
      "org.antlr.v4.runtime.atn.SemanticContext$OR",
      "org.antlr.v4.misc.FrequencySet",
      "org.antlr.v4.tool.ast.ActionAST",
      "org.antlr.v4.tool.ErrorType",
      "org.antlr.v4.tool.GrammarSemanticsMessage",
      "org.stringtemplate.v4.STGroupDir",
      "org.antlr.v4.runtime.tree.pattern.ParseTreePatternMatcher$StartRuleDoesNotConsumeFullPattern",
      "org.antlr.v4.tool.ast.TerminalAST",
      "org.antlr.v4.runtime.atn.Transition",
      "org.antlr.v4.parse.GrammarTreeVisitor$ruleReturns_return",
      "org.antlr.v4.tool.Grammar",
      "org.antlr.v4.codegen.model.chunk.ThisRulePropertyRef_start",
      "org.antlr.v4.runtime.ParserInterpreter",
      "org.antlr.v4.parse.GrammarTreeVisitor$locals_return",
      "org.antlr.v4.codegen.model.Parser",
      "org.antlr.v4.tool.ast.PlusBlockAST",
      "org.antlr.v4.runtime.atn.SemanticContext$Operator",
      "org.antlr.v4.parse.GrammarTreeVisitor$prequelConstructs_return",
      "org.antlr.v4.runtime.tree.pattern.ParseTreePatternMatcher",
      "org.antlr.v4.codegen.model.CaptureNextToken",
      "org.antlr.v4.codegen.model.chunk.RulePropertyRef_start",
      "org.antlr.v4.runtime.atn.ATN",
      "org.antlr.v4.runtime.atn.ATNConfigSet$ConfigHashSet",
      "org.antlr.v4.runtime.dfa.LexerDFASerializer",
      "org.antlr.v4.codegen.model.CodeBlockForOuterMostAlt",
      "org.antlr.v4.tool.DefaultToolListener",
      "org.antlr.v4.codegen.model.LL1OptionalBlockSingleAlt",
      "org.antlr.v4.runtime.tree.SyntaxTree",
      "org.antlr.v4.runtime.tree.RuleNode",
      "org.stringtemplate.v4.debug.EvalTemplateEvent",
      "org.antlr.v4.runtime.atn.NotSetTransition",
      "org.stringtemplate.v4.compiler.FormalArgument",
      "org.antlr.runtime.TokenRewriteStream$InsertBeforeOp",
      "org.antlr.v4.parse.GrammarTreeVisitor$channelSpec_return",
      "org.antlr.v4.runtime.Token",
      "org.antlr.v4.runtime.atn.ATNState",
      "org.stringtemplate.v4.misc.ObjectModelAdaptor",
      "org.antlr.v4.codegen.model.TestSetInline$Bitset",
      "org.antlr.v4.runtime.atn.DecisionInfo",
      "org.antlr.v4.tool.GrammarParserInterpreter",
      "org.antlr.v4.runtime.atn.PlusBlockStartState",
      "org.antlr.v4.parse.GrammarTreeVisitor$terminal_return",
      "org.antlr.v4.runtime.misc.Pair",
      "org.antlr.v4.runtime.LexerInterpreter",
      "org.antlr.v4.runtime.atn.AbstractPredicateTransition",
      "org.antlr.v4.runtime.ProxyErrorListener",
      "org.antlr.v4.codegen.target.Python2Target",
      "org.antlr.runtime.ANTLRInputStream",
      "org.antlr.v4.codegen.model.decl.AltLabelStructDecl",
      "org.antlr.v4.runtime.atn.ATNConfig",
      "org.antlr.v4.runtime.misc.MultiMap",
      "org.antlr.runtime.CharStreamState",
      "org.stringtemplate.v4.ST",
      "org.antlr.v4.codegen.model.LL1StarBlockSingleAlt",
      "org.antlr.v4.parse.GrammarTreeVisitor$lexerAtom_return",
      "org.antlr.v4.runtime.ParserRuleContext",
      "org.antlr.v4.codegen.model.chunk.TokenPropertyRef_type",
      "org.antlr.v4.runtime.dfa.DFAState",
      "org.antlr.v4.runtime.tree.ErrorNode",
      "org.antlr.runtime.ClassicToken",
      "org.antlr.runtime.TokenRewriteStream$ReplaceOp",
      "org.antlr.runtime.tree.TreeWizard$TreePattern",
      "org.antlr.v4.codegen.SourceGenTriggers$alternative_return",
      "org.stringtemplate.v4.debug.AddAttributeEvent",
      "org.antlr.v4.codegen.ActionTranslator",
      "org.antlr.v4.runtime.atn.LexerActionType",
      "org.antlr.runtime.ANTLRFileStream",
      "org.stringtemplate.v4.Interpreter$1",
      "org.antlr.v4.parse.GrammarTreeVisitor$lexerRule_return",
      "org.antlr.v4.runtime.DefaultErrorStrategy",
      "org.antlr.v4.runtime.tree.ParseTree",
      "org.antlr.v4.analysis.LeftRecursiveRuleAltInfo",
      "org.antlr.v4.parse.GrammarTreeVisitor$tokensSpec_return",
      "org.antlr.v4.runtime.tree.pattern.ParseTreePatternMatcher$CannotInvokeStartRule",
      "org.antlr.v4.parse.GrammarTreeVisitor$exceptionHandler_return",
      "org.stringtemplate.v4.STErrorListener",
      "org.antlr.v4.codegen.model.chunk.TokenPropertyRef",
      "org.antlr.runtime.tree.BaseTreeAdaptor",
      "org.antlr.v4.runtime.BailErrorStrategy",
      "org.stringtemplate.v4.debug.InterpEvent",
      "org.antlr.v4.tool.LexerGrammar",
      "org.antlr.v4.runtime.dfa.DFAState$PredPrediction",
      "org.antlr.runtime.CommonToken",
      "org.antlr.v4.codegen.SourceGenTriggers$DFA7",
      "org.antlr.v4.parse.GrammarTreeVisitor$throwsSpec_return",
      "org.stringtemplate.v4.DateRenderer",
      "org.stringtemplate.v4.misc.STMessage",
      "org.antlr.v4.runtime.CommonTokenStream",
      "org.stringtemplate.v4.AutoIndentWriter",
      "org.stringtemplate.v4.misc.ErrorManager",
      "org.antlr.v4.runtime.BaseErrorListener",
      "org.antlr.v4.runtime.tree.ParseTreeVisitor",
      "org.antlr.v4.runtime.Lexer",
      "org.antlr.v4.codegen.model.chunk.ActionText",
      "org.antlr.v4.runtime.ConsoleErrorListener",
      "org.antlr.runtime.misc.FastQueue",
      "org.antlr.v4.parse.GrammarTreeVisitor$option_return",
      "org.antlr.v4.tool.GrammarSyntaxMessage",
      "org.antlr.v4.runtime.atn.SingletonPredictionContext",
      "org.antlr.v4.codegen.model.chunk.ThisRulePropertyRef_parser",
      "org.antlr.v4.codegen.model.decl.AttributeDecl",
      "org.antlr.v4.runtime.atn.StarBlockStartState",
      "org.antlr.v4.parse.GrammarTreeVisitor$lexerCommandExpr_return",
      "org.antlr.v4.tool.ast.GrammarASTWithOptions",
      "org.antlr.v4.runtime.atn.LexerMoreAction",
      "org.antlr.v4.codegen.model.decl.TokenListDecl",
      "org.antlr.v4.parse.GrammarTreeVisitor$grammarSpec_return",
      "org.antlr.v4.runtime.misc.OrderedHashSet",
      "org.antlr.v4.runtime.misc.DoubleKeyMap",
      "org.antlr.v4.parse.GrammarTreeVisitor$astOperand_return",
      "org.antlr.v4.tool.GrammarInterpreterRuleContext",
      "org.antlr.v4.parse.GrammarTreeVisitor$lexerSubrule_return",
      "org.antlr.v4.parse.ANTLRParser$grammarSpec_return",
      "org.antlr.runtime.MismatchedTreeNodeException",
      "org.antlr.v4.parse.GrammarTreeVisitor$delegateGrammars_return",
      "org.antlr.v4.runtime.misc.ParseCancellationException",
      "org.antlr.runtime.ParserRuleReturnScope",
      "org.antlr.v4.tool.ast.GrammarAST",
      "org.antlr.v4.parse.GrammarTreeVisitor$ruleAction_return",
      "org.antlr.runtime.IntStream",
      "org.antlr.v4.parse.GrammarTreeVisitor$labeledElement_return",
      "org.antlr.v4.codegen.model.LL1OptionalBlock",
      "org.antlr.v4.runtime.atn.ParseInfo",
      "org.antlr.v4.runtime.misc.ObjectEqualityComparator",
      "org.antlr.runtime.tree.PositionTrackingStream",
      "org.antlr.v4.parse.GrammarTreeVisitor$atom_return",
      "org.antlr.v4.tool.ast.StarBlockAST",
      "org.antlr.v4.codegen.model.SemPred",
      "org.antlr.runtime.MismatchedSetException",
      "org.antlr.v4.runtime.atn.LexerChannelAction",
      "org.antlr.v4.parse.GrammarTreeVisitor$lexerOuterAlternative_return",
      "org.antlr.v4.parse.GrammarTreeVisitor$blockSuffix_return",
      "org.antlr.v4.runtime.tree.pattern.ParseTreePattern",
      "org.antlr.v4.tool.ANTLRMessage",
      "org.antlr.runtime.tree.Tree",
      "org.antlr.v4.runtime.atn.RuleStopState",
      "org.antlr.v4.runtime.DiagnosticErrorListener",
      "org.antlr.v4.runtime.tree.AbstractParseTreeVisitor",
      "org.antlr.runtime.BaseRecognizer",
      "org.antlr.v4.parse.GrammarTreeVisitor$actionElement_return",
      "org.antlr.v4.codegen.model.ListenerFile"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Python2Target_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.antlr.v4.codegen.Target",
      "org.antlr.v4.codegen.target.Python2Target",
      "org.stringtemplate.v4.StringRenderer",
      "org.antlr.v4.codegen.target.Python2Target$PythonStringRenderer",
      "org.antlr.v4.Tool$Option",
      "org.antlr.v4.Tool$OptionArgType",
      "org.antlr.v4.Tool",
      "org.antlr.v4.runtime.misc.LogManager",
      "org.antlr.v4.tool.DefaultToolListener",
      "org.antlr.v4.tool.ErrorManager",
      "org.antlr.v4.tool.ErrorSeverity",
      "org.antlr.v4.tool.ErrorType",
      "org.stringtemplate.v4.misc.ErrorBuffer",
      "org.stringtemplate.v4.compiler.CompiledST",
      "org.stringtemplate.v4.misc.ErrorManager$1",
      "org.stringtemplate.v4.misc.ErrorManager",
      "org.stringtemplate.v4.misc.TypeRegistry",
      "org.stringtemplate.v4.misc.ObjectModelAdaptor",
      "org.stringtemplate.v4.misc.STModelAdaptor",
      "org.stringtemplate.v4.misc.MapModelAdaptor",
      "org.stringtemplate.v4.misc.AggregateModelAdaptor",
      "org.stringtemplate.v4.STGroup",
      "org.stringtemplate.v4.STGroupFile",
      "org.antlr.runtime.ANTLRStringStream",
      "org.antlr.runtime.ANTLRReaderStream",
      "org.antlr.runtime.ANTLRInputStream",
      "org.stringtemplate.v4.misc.ErrorType",
      "org.stringtemplate.v4.misc.STMessage",
      "org.antlr.runtime.tree.BaseTreeAdaptor",
      "org.antlr.runtime.tree.CommonTreeAdaptor",
      "org.antlr.runtime.tree.TreeWizard$TreePatternTreeAdaptor",
      "org.antlr.runtime.CommonToken",
      "org.antlr.runtime.tree.BaseTree",
      "org.antlr.runtime.tree.CommonTree",
      "org.antlr.v4.tool.ast.GrammarAST",
      "org.antlr.v4.tool.ast.GrammarASTWithOptions",
      "org.antlr.v4.tool.ast.BlockAST"
    );
  }
}
