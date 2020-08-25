import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        int int13 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str16 = python2Target0.getTargetStringLiteralFromString("_tset\"\"", false);
        boolean boolean17 = python2Target0.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup18 = null;
        python2Target0.templates = sTGroup18;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\0" + "'", str2.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "_tset\"\"" + "'", str16.equals("_tset\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str5 = python2Target0.getLanguage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str8 = python2Target6.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target18.loadTemplates();
        python2Target6.templates = sTGroup19;
        python2Target0.templates = sTGroup19;
        java.lang.String[] strArray22 = python2Target0.targetCharValueEscape;
        int int23 = python2Target0.getSerializedATNSegmentLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4.equals("\"\"hi!\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"hi!\"" + "'", str8.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\"" + "'", str12.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\"\"" + "'", str16.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.getCodeGenerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator4);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        boolean boolean5 = python2Target0.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python2Target0.genRecognizerHeaderFile(grammar6, sT7, "\"\\12\"");
        java.lang.String str10 = python2Target0.language;
        int int11 = python2Target0.getSerializedATNSegmentLimit();
        java.lang.String str14 = python2Target0.getTargetStringLiteralFromString("\"_\\\\0\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target0.getImplicitSetLabel("\"\\\"0\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\0" + "'", str2.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"\"_\\\\0\"\"" + "'", str14.equals("\"\"_\\\\0\"\""));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        boolean boolean4 = python2Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target0.templates;
        boolean boolean6 = python2Target0.templatesExist();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        java.lang.String str11 = python2Target0.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup12 = null;
        python2Target0.templates = sTGroup12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\"i\"" + "'", str10.equals("\"\\\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromString("_\"i\"", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"_\"i\"\"" + "'", str8.equals("\"_\"i\"\""));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str13 = python2Target11.getTargetStringLiteralFromString("hi!");
        python2Target11.language = "hi!";
        java.util.Set<java.lang.String> strSet16 = python2Target11.badWords;
        python2Target0.badWords = strSet16;
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        java.lang.String str21 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator18, "hi!", true);
        org.antlr.v4.tool.Grammar grammar22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python2Target0.getTokenTypeAsTargetLabel(grammar22, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\"i\"" + "'", str10.equals("\"\\\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"hi!\"" + "'", str13.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\"i\"" + "'", str21.equals("\"i\""));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        java.lang.String str26 = python2Target0.getTargetStringLiteralFromString("\"i\"");
        boolean boolean27 = python2Target0.wantsBaseListener();
        java.lang.String[] strArray28 = null;
        python2Target0.targetCharValueEscape = strArray28;
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str33 = python2Target31.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        python2Target31.gen = codeGenerator34;
        java.lang.String str37 = python2Target31.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar38 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target39 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str41 = python2Target39.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        python2Target39.gen = codeGenerator42;
        java.lang.String str45 = python2Target39.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar46 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target47 = new org.antlr.v4.codegen.target.Python2Target();
        int int48 = python2Target47.getInlineTestSetWordSize();
        java.lang.String[] strArray52 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        python2Target47.badWords = strSet53;
        org.stringtemplate.v4.STGroup sTGroup56 = null;
        python2Target47.templates = sTGroup56;
        org.antlr.v4.codegen.CodeGenerator codeGenerator58 = null;
        python2Target47.gen = codeGenerator58;
        java.util.Set<java.lang.String> strSet60 = python2Target47.getBadWords();
        java.lang.String str61 = python2Target47.getVersion();
        org.antlr.v4.tool.Grammar grammar62 = null;
        int[] intArray63 = new int[] {};
        java.lang.String[] strArray64 = python2Target47.getTokenTypesAsTargetLabels(grammar62, intArray63);
        java.lang.String[] strArray65 = python2Target39.getTokenTypesAsTargetLabels(grammar46, intArray63);
        java.lang.String[] strArray66 = python2Target31.getTokenTypesAsTargetLabels(grammar38, intArray63);
        java.lang.String[] strArray67 = python2Target0.getTokenTypesAsTargetLabels(grammar30, intArray63);
        org.stringtemplate.v4.STGroup sTGroup68 = python2Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator69 = python2Target0.gen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str71 = python2Target0.getAltLabelContextStructName("\"\\\"0\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\0" + "'", str12.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "\"\"i\"\"" + "'", str26.equals("\"\"i\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "\\0" + "'", str33.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "\\12" + "'", str37.equals("\\12"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "\\0" + "'", str41.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "\\12" + "'", str45.equals("\\12"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 64 + "'", int48 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "4.5.2.1" + "'", str61.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator69);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        java.lang.String str6 = python2Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\\\"\\\"\\\"hi!\\\"\\\"\\\"", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4.equals("\"\"hi!\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\\\"\\\"\\\"hi!\\\"\\\"\\\"" + "'", str10.equals("\\\"\\\"\\\"hi!\\\"\\\"\\\""));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str8 = python2Target6.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target18.loadTemplates();
        python2Target6.templates = sTGroup19;
        python2Target0.templates = sTGroup19;
        java.lang.String[] strArray22 = python2Target0.targetCharValueEscape;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python2Target0.getImplicitTokenLabel("Python2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4.equals("\"\"hi!\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"hi!\"" + "'", str8.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\"" + "'", str12.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\"\"" + "'", str16.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromString("_\"i\"", true);
        java.lang.String str9 = python2Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\"\\\"i\"", true);
        java.lang.Class<?> wildcardClass14 = python2Target0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"_\"i\"\"" + "'", str8.equals("\"_\"i\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"\\\"i\"" + "'", str13.equals("\"\\\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        int int2 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python2Target1.badWords = strSet7;
        python2Target0.badWords = strSet7;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "\\12", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python2Target0.gen;
        java.util.Set<java.lang.String> strSet16 = python2Target0.getBadWords();
        java.util.Set<java.lang.String> strSet17 = python2Target0.badWords;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "1" + "'", str14.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        int int2 = python2Target1.getInlineTestSetWordSize();
        int int3 = python2Target1.getInlineTestSetWordSize();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.gen;
        java.util.Locale locale7 = null;
        java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator5, "\"\"i\"\"", locale7);
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = pythonStringRenderer0.toString((java.lang.Object) (short) -1, "_\\1", locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\"i\"\"" + "'", str8.equals("\"\"i\"\""));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        int int2 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python2Target1.badWords = strSet7;
        python2Target0.badWords = strSet7;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "\\12", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python2Target0.gen;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str18 = python2Target16.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target19 = new org.antlr.v4.codegen.target.Python2Target();
        int int20 = python2Target19.getInlineTestSetWordSize();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        python2Target19.badWords = strSet25;
        python2Target16.badWords = strSet25;
        java.lang.String[] strArray29 = python2Target16.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        java.lang.String str33 = python2Target16.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator30, "\\0", true);
        java.lang.String str36 = python2Target16.getTargetStringLiteralFromString("\"\"hi!\"\"", true);
        boolean boolean37 = python2Target16.templatesExist();
        org.antlr.v4.codegen.target.Python2Target python2Target38 = new org.antlr.v4.codegen.target.Python2Target();
        int int39 = python2Target38.getInlineTestSetWordSize();
        java.lang.String str42 = python2Target38.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str43 = python2Target38.getVersion();
        java.lang.String str44 = python2Target38.getLanguage();
        org.antlr.v4.codegen.target.Python2Target python2Target45 = new org.antlr.v4.codegen.target.Python2Target();
        int int46 = python2Target45.getInlineTestSetWordSize();
        java.lang.String str49 = python2Target45.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str50 = python2Target45.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target51 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str53 = python2Target51.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator54 = null;
        java.lang.String str57 = python2Target51.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator54, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator58 = null;
        java.lang.String str61 = python2Target51.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator58, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator62 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target63 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator62);
        org.stringtemplate.v4.STGroup sTGroup64 = python2Target63.loadTemplates();
        python2Target51.templates = sTGroup64;
        python2Target45.templates = sTGroup64;
        python2Target38.templates = sTGroup64;
        python2Target16.templates = sTGroup64;
        python2Target0.templates = sTGroup64;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "1" + "'", str14.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\\0" + "'", str18.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "\"\"" + "'", str33.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "\"\"\"hi!\"\"\"" + "'", str36.equals("\"\"\"hi!\"\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 64 + "'", int39 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "\"\"hi!\"\"" + "'", str42.equals("\"\"hi!\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "4.5.2.1" + "'", str43.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 64 + "'", int46 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "\"\"hi!\"\"" + "'", str49.equals("\"\"hi!\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "4.5.2.1" + "'", str50.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "\"hi!\"" + "'", str53.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "\"\"" + "'", str57.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "\"\"" + "'", str61.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup64);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        java.lang.String str25 = python2Target0.getLanguage();
        java.lang.String str26 = python2Target0.getVersion();
        boolean boolean27 = python2Target0.templatesExist();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\0" + "'", str12.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "4.5.2.1" + "'", str26.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str31 = python2Target0.getTargetStringLiteralFromString("\"i\"");
        java.lang.String str33 = python2Target0.getTargetStringLiteralFromString("\"\"i\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = python2Target0.gen;
        org.antlr.v4.tool.Rule rule35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = python2Target0.getRuleFunctionContextStructName(rule35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\0" + "'", str12.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "\"\\12\"" + "'", str29.equals("\"\\12\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "\"\"i\"\"" + "'", str31.equals("\"\"i\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "\"\"\"i\"\"\"" + "'", str33.equals("\"\"\"i\"\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator34);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str31 = python2Target0.getTargetStringLiteralFromString("\"i\"");
        java.lang.String str33 = python2Target0.getTargetStringLiteralFromString("\"\"i\"\"");
        java.lang.String str34 = python2Target0.language;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\0" + "'", str12.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "\"\\12\"" + "'", str29.equals("\"\\12\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "\"\"i\"\"" + "'", str31.equals("\"\"i\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "\"\"\"i\"\"\"" + "'", str33.equals("\"\"\"i\"\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.util.Set<java.lang.String> strSet1 = python2Target0.getBadWords();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        java.lang.String str4 = python2Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target0.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target0.getLoopLabel(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator5);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("\\\"i");
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.templates;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target();
        int int9 = python2Target8.getInlineTestSetWordSize();
        int int10 = python2Target8.getInlineTestSetWordSize();
        boolean boolean11 = python2Target8.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target8.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target8.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "_\"i\"", false);
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target();
        int int18 = python2Target17.getInlineTestSetWordSize();
        java.lang.String[] strArray22 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        python2Target17.badWords = strSet23;
        python2Target8.badWords = strSet23;
        python2Target1.badWords = strSet23;
        java.lang.String str29 = python2Target1.getAltLabelContextStructName("\"\\\"0\\\"Context\"");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4.5.2.1" + "'", str4.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"\\\\\\\"i\"" + "'", str6.equals("\"\\\\\\\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\\\"i" + "'", str16.equals("\\\"i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "\"\\\"0\\\"Context\"Context" + "'", str29.equals("\"\\\"0\\\"Context\"Context"));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_\"i\"", false);
        java.lang.String[] strArray14 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray14;
        python2Target0.targetCharValueEscape = strArray14;
        java.lang.String[] strArray17 = python2Target0.targetCharValueEscape;
        java.lang.String[] strArray18 = python2Target0.targetCharValueEscape;
        java.lang.String str21 = python2Target0.getTargetStringLiteralFromString("i", true);
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.stringtemplate.v4.ST sT23 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar22, sT23, "\\12Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\\"i" + "'", str8.equals("\\\"i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\"i\"" + "'", str21.equals("\"i\""));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target0.gen = codeGenerator6;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target0.getCodeGenerator();
        python2Target0.language = "\\12Context";
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target0.gen;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator12);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getLanguage();
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target();
        int int6 = python2Target5.getInlineTestSetWordSize();
        int int7 = python2Target5.getInlineTestSetWordSize();
        boolean boolean8 = python2Target5.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target5.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target5.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "_\"i\"", false);
        java.lang.String[] strArray19 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray19;
        python2Target5.targetCharValueEscape = strArray19;
        python2Target1.targetCharValueEscape = strArray19;
        java.lang.String str23 = python2Target1.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str26 = python2Target24.getTargetStringLiteralFromString("hi!");
        python2Target24.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = null;
        java.lang.String str32 = python2Target24.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator29, "hi!", false);
        int int33 = python2Target24.getInlineTestSetWordSize();
        boolean boolean34 = python2Target24.templatesExist();
        java.lang.String str36 = python2Target24.getTargetStringLiteralFromString("hi!");
        java.util.Set<java.lang.String> strSet37 = python2Target24.badWords;
        python2Target1.badWords = strSet37;
        org.antlr.v4.tool.Rule rule39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = python2Target1.getRuleFunctionContextStructName(rule39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Python2" + "'", str4.equals("Python2"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\\\"i" + "'", str13.equals("\\\"i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "4.5.2.1" + "'", str23.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "\"hi!\"" + "'", str26.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "i" + "'", str32.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 64 + "'", int33 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "\"hi!\"" + "'", str36.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet37);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        boolean boolean4 = python2Target1.templatesExist();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python2Target1.badWords;
        java.lang.String str9 = python2Target1.getListLabel("\"\\12Context\"Context");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"\\12Context\"Context" + "'", str9.equals("\"\\12Context\"Context"));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_\"i\"", false);
        java.lang.String[] strArray14 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray14;
        python2Target0.targetCharValueEscape = strArray14;
        boolean boolean17 = python2Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet18 = python2Target0.badWords;
        python2Target0.addBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\\"i" + "'", str8.equals("\\\"i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_\"i\"", false);
        org.antlr.v4.tool.Rule rule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target0.getRuleFunctionContextStructName(rule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\\"i" + "'", str8.equals("\\\"i"));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromString("\"\\\\\\\"i\"", false);
        java.util.Set<java.lang.String> strSet33 = python2Target0.badWords;
        java.lang.String str34 = python2Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        python2Target0.gen = codeGenerator35;
        org.antlr.v4.tool.Grammar grammar37 = null;
        org.stringtemplate.v4.ST sT38 = null;
        python2Target0.genRecognizerHeaderFile(grammar37, sT38, "_tset\"\\\\\\\"i\"");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\0" + "'", str12.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "\"\\12\"" + "'", str29.equals("\"\\12\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "\"\\\\\\\"i\"" + "'", str32.equals("\"\\\\\\\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        java.lang.String[] strArray4 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target0.targetCharValueEscape = strArray4;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target();
        int int8 = python2Target7.getInlineTestSetWordSize();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python2Target7.badWords = strSet13;
        python2Target6.badWords = strSet13;
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str19 = python2Target17.getTargetStringLiteralFromString("hi!");
        python2Target17.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        java.lang.String str25 = python2Target17.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator22, "hi!", false);
        int int26 = python2Target17.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target27 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str29 = python2Target27.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target30 = new org.antlr.v4.codegen.target.Python2Target();
        int int31 = python2Target30.getInlineTestSetWordSize();
        java.lang.String[] strArray35 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        python2Target30.badWords = strSet36;
        python2Target27.badWords = strSet36;
        python2Target17.badWords = strSet36;
        python2Target17.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup42 = null;
        python2Target17.templates = sTGroup42;
        java.lang.String str46 = python2Target17.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str49 = python2Target17.getTargetStringLiteralFromString("\"\\\\\\\"i\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator50 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target51 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator50);
        java.lang.String str53 = python2Target51.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str54 = python2Target51.getLanguage();
        org.antlr.v4.codegen.target.Python2Target python2Target55 = new org.antlr.v4.codegen.target.Python2Target();
        int int56 = python2Target55.getInlineTestSetWordSize();
        int int57 = python2Target55.getInlineTestSetWordSize();
        boolean boolean58 = python2Target55.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator59 = python2Target55.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator60 = null;
        java.lang.String str63 = python2Target55.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator60, "_\"i\"", false);
        java.lang.String[] strArray69 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray69;
        python2Target55.targetCharValueEscape = strArray69;
        python2Target51.targetCharValueEscape = strArray69;
        python2Target17.targetCharValueEscape = strArray69;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray69;
        python2Target6.targetCharValueEscape = strArray69;
        python2Target0.targetCharValueEscape = strArray69;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\"hi!\"" + "'", str19.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "i" + "'", str25.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 64 + "'", int26 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "\\0" + "'", str29.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 64 + "'", int31 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "\"\\12\"" + "'", str46.equals("\"\\12\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "\"\\\\\\\"i\"" + "'", str49.equals("\"\\\\\\\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "\"\"hi!\"\"Context" + "'", str53.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "Python2" + "'", str54.equals("Python2"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 64 + "'", int56 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 64 + "'", int57 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "\\\"i" + "'", str63.equals("\\\"i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray69);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        python2Target0.gen = codeGenerator11;
        java.util.Set<java.lang.String> strSet13 = python2Target0.getBadWords();
        java.lang.String str14 = python2Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar15 = null;
        int[] intArray16 = new int[] {};
        java.lang.String[] strArray17 = python2Target0.getTokenTypesAsTargetLabels(grammar15, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target0.getImplicitRuleLabel("\\12");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "4.5.2.1" + "'", str14.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String str14 = python2Target0.getTargetStringLiteralFromString("\\12");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "\\1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"hi!\"" + "'", str12.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"\\12\"" + "'", str14.equals("\"\\12\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String str9 = python2Target7.getAltLabelContextStructName("\"\"hi!\"\"");
        boolean boolean10 = python2Target7.templatesExist();
        boolean boolean11 = python2Target7.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target7.getCodeGenerator();
        java.util.Set<java.lang.String> strSet13 = python2Target7.badWords;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target();
        int int15 = python2Target14.getInlineTestSetWordSize();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python2Target14.badWords = strSet20;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        org.stringtemplate.v4.STGroup sTGroup25 = python2Target24.loadTemplates();
        python2Target14.templates = sTGroup25;
        python2Target7.templates = sTGroup25;
        python2Target1.templates = sTGroup25;
        org.antlr.v4.tool.ast.GrammarAST grammarAST29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = python2Target1.getLoopLabel(grammarAST29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Python2" + "'", str4.equals("Python2"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"\"hi!\"\"Context" + "'", str9.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup25);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        python2Target0.gen = codeGenerator11;
        java.lang.String str13 = python2Target0.getVersion();
        java.lang.String str14 = python2Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.stringtemplate.v4.ST sT16 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar15, sT16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4.5.2.1" + "'", str13.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "4.5.2.1" + "'", str14.equals("4.5.2.1"));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        python2Target0.gen = codeGenerator11;
        java.util.Set<java.lang.String> strSet13 = python2Target0.getBadWords();
        java.lang.String str14 = python2Target0.getVersion();
        python2Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator16);
        java.lang.String str19 = python2Target17.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str21 = python2Target17.getImplicitRuleLabel("\"i\"");
        boolean boolean22 = python2Target17.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet23 = python2Target17.badWords;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str26 = python2Target24.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        java.lang.String str30 = python2Target24.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator27, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = null;
        java.lang.String str34 = python2Target24.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator31, "", true);
        java.util.Set<java.lang.String> strSet35 = python2Target24.getBadWords();
        python2Target17.badWords = strSet35;
        org.antlr.v4.codegen.target.Python2Target python2Target37 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str39 = python2Target37.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target40 = new org.antlr.v4.codegen.target.Python2Target();
        int int41 = python2Target40.getInlineTestSetWordSize();
        java.lang.String[] strArray45 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        python2Target40.badWords = strSet46;
        python2Target37.badWords = strSet46;
        python2Target17.badWords = strSet46;
        org.antlr.v4.codegen.target.Python2Target python2Target51 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str53 = python2Target51.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator54 = null;
        java.lang.String str57 = python2Target51.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator54, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator58 = null;
        java.lang.String str61 = python2Target51.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator58, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator62 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target63 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator62);
        org.stringtemplate.v4.STGroup sTGroup64 = python2Target63.loadTemplates();
        python2Target51.templates = sTGroup64;
        java.lang.String str66 = python2Target51.language;
        org.stringtemplate.v4.STGroup sTGroup67 = python2Target51.templates;
        python2Target17.templates = sTGroup67;
        python2Target0.templates = sTGroup67;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "4.5.2.1" + "'", str14.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\"\"hi!\"\"Context" + "'", str19.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "_\"i\"" + "'", str21.equals("_\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "\"hi!\"" + "'", str26.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "\"\"" + "'", str30.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "\"\"" + "'", str34.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "\\0" + "'", str39.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 64 + "'", int41 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "\"hi!\"" + "'", str53.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "\"\"" + "'", str57.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "\"\"" + "'", str61.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup67);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromString("_\"i\"", true);
        java.lang.String str11 = python2Target0.getTargetStringLiteralFromString("\"\"\\12Context\"\"", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"_\"i\"\"" + "'", str8.equals("\"_\"i\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"\"\"\\12Context\"\"\"" + "'", str11.equals("\"\"\"\\12Context\"\"\""));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str8 = python2Target6.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target18.loadTemplates();
        python2Target6.templates = sTGroup19;
        python2Target0.templates = sTGroup19;
        boolean boolean22 = python2Target0.supportsOverloadedMethods();
        python2Target0.language = "_\"i\"";
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.stringtemplate.v4.ST sT26 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar25, sT26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4.equals("\"\"hi!\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"hi!\"" + "'", str8.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\"" + "'", str12.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\"\"" + "'", str16.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", true);
        python2Target1.addBadWords();
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\"\\12Context\"");
        java.lang.String str12 = python2Target1.encodeIntAsCharEscape((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getElementListName("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4.5.2.1" + "'", str4.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"\"" + "'", str7.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\12Context\"Context" + "'", str10.equals("\"\\12Context\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\0" + "'", str12.equals("\\0"));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        int int4 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"\"hi!\"\"\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\\\"\\\"\\\"hi!\\\"\\\"\\\"" + "'", str7.equals("\\\"\\\"\\\"hi!\\\"\\\"\\\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python2Target0.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.stringtemplate.v4.ST sT16 = null;
        python2Target0.genRecognizerHeaderFile(grammar15, sT16, "\"\\\\\\\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        python2Target0.gen = codeGenerator19;
        int int21 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str22 = python2Target0.getLanguage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\0" + "'", str2.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("\\12", true);
        int int30 = python2Target0.getInlineTestSetWordSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\0" + "'", str12.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "\"\\12\"" + "'", str29.equals("\"\\12\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 64 + "'", int30 == 64);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        java.lang.String[] strArray10 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray10;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray10;
        python2Target0.targetCharValueEscape = strArray10;
        java.lang.String str16 = python2Target0.getTargetStringLiteralFromString(" ", true);
        python2Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target0.getCodeGenerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\0" + "'", str2.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\" \"" + "'", str16.equals("\" \""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator18);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        java.lang.String str26 = python2Target0.getTargetStringLiteralFromString("\"i\"");
        boolean boolean27 = python2Target0.wantsBaseListener();
        java.lang.String[] strArray28 = null;
        python2Target0.targetCharValueEscape = strArray28;
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str33 = python2Target31.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        python2Target31.gen = codeGenerator34;
        java.lang.String str37 = python2Target31.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar38 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target39 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str41 = python2Target39.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        python2Target39.gen = codeGenerator42;
        java.lang.String str45 = python2Target39.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar46 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target47 = new org.antlr.v4.codegen.target.Python2Target();
        int int48 = python2Target47.getInlineTestSetWordSize();
        java.lang.String[] strArray52 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        python2Target47.badWords = strSet53;
        org.stringtemplate.v4.STGroup sTGroup56 = null;
        python2Target47.templates = sTGroup56;
        org.antlr.v4.codegen.CodeGenerator codeGenerator58 = null;
        python2Target47.gen = codeGenerator58;
        java.util.Set<java.lang.String> strSet60 = python2Target47.getBadWords();
        java.lang.String str61 = python2Target47.getVersion();
        org.antlr.v4.tool.Grammar grammar62 = null;
        int[] intArray63 = new int[] {};
        java.lang.String[] strArray64 = python2Target47.getTokenTypesAsTargetLabels(grammar62, intArray63);
        java.lang.String[] strArray65 = python2Target39.getTokenTypesAsTargetLabels(grammar46, intArray63);
        java.lang.String[] strArray66 = python2Target31.getTokenTypesAsTargetLabels(grammar38, intArray63);
        java.lang.String[] strArray67 = python2Target0.getTokenTypesAsTargetLabels(grammar30, intArray63);
        boolean boolean68 = python2Target0.wantsBaseListener();
        java.lang.Class<?> wildcardClass69 = python2Target0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\0" + "'", str12.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "\"\"i\"\"" + "'", str26.equals("\"\"i\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "\\0" + "'", str33.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "\\12" + "'", str37.equals("\\12"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "\\0" + "'", str41.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "\\12" + "'", str45.equals("\\12"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 64 + "'", int48 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "4.5.2.1" + "'", str61.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_\"i\"", false);
        java.lang.String[] strArray14 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray14;
        python2Target0.targetCharValueEscape = strArray14;
        java.lang.String[] strArray17 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str20 = python2Target18.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target();
        int int22 = python2Target21.getInlineTestSetWordSize();
        java.lang.String[] strArray26 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        python2Target21.badWords = strSet27;
        python2Target18.badWords = strSet27;
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str33 = python2Target31.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        python2Target31.gen = codeGenerator34;
        java.lang.String[] strArray41 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray41;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray41;
        python2Target31.targetCharValueEscape = strArray41;
        python2Target18.targetCharValueEscape = strArray41;
        java.lang.String[] strArray46 = python2Target18.targetCharValueEscape;
        python2Target0.targetCharValueEscape = strArray46;
        int int48 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target49 = new org.antlr.v4.codegen.target.Python2Target();
        int int50 = python2Target49.getInlineTestSetWordSize();
        int int51 = python2Target49.getInlineTestSetWordSize();
        boolean boolean52 = python2Target49.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator53 = python2Target49.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator54 = null;
        java.lang.String str57 = python2Target49.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator54, "_\"i\"", false);
        java.lang.String[] strArray63 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray63;
        python2Target49.targetCharValueEscape = strArray63;
        org.antlr.v4.codegen.CodeGenerator codeGenerator66 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target67 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator66);
        java.lang.String str69 = python2Target67.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str70 = python2Target67.getVersion();
        java.lang.String str72 = python2Target67.getTargetStringLiteralFromString("\\\"i");
        org.stringtemplate.v4.STGroup sTGroup73 = python2Target67.templates;
        python2Target49.templates = sTGroup73;
        python2Target0.templates = sTGroup73;
        java.lang.String str77 = python2Target0.encodeIntAsCharEscape(0);
        java.util.Set<java.lang.String> strSet78 = python2Target0.badWords;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\\"i" + "'", str8.equals("\\\"i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\\0" + "'", str20.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 64 + "'", int22 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "\\0" + "'", str33.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 64 + "'", int48 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 64 + "'", int50 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 64 + "'", int51 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "\\\"i" + "'", str57.equals("\\\"i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "\"\"hi!\"\"Context" + "'", str69.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "4.5.2.1" + "'", str70.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "\"\\\\\\\"i\"" + "'", str72.equals("\"\\\\\\\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "\\\"i" + "'", str77.equals("\\\"i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet78);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        java.lang.String[] strArray10 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray10;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray10;
        python2Target0.targetCharValueEscape = strArray10;
        java.lang.String str16 = python2Target0.getTargetStringLiteralFromString(" ", true);
        python2Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        python2Target0.gen = codeGenerator18;
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.stringtemplate.v4.ST sT21 = null;
        python2Target0.genRecognizerHeaderFile(grammar20, sT21, "\"\"i\"\"");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\0" + "'", str2.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\" \"" + "'", str16.equals("\" \""));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator8);
        java.lang.String str11 = python2Target9.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str13 = python2Target9.getImplicitRuleLabel("\"i\"");
        boolean boolean14 = python2Target9.wantsBaseVisitor();
        boolean boolean15 = python2Target9.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str19 = python2Target17.getTargetStringLiteralFromString("hi!");
        python2Target17.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        java.lang.String str25 = python2Target17.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator22, "hi!", false);
        int int26 = python2Target17.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target27 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str29 = python2Target27.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target30 = new org.antlr.v4.codegen.target.Python2Target();
        int int31 = python2Target30.getInlineTestSetWordSize();
        java.lang.String[] strArray35 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        python2Target30.badWords = strSet36;
        python2Target27.badWords = strSet36;
        python2Target17.badWords = strSet36;
        python2Target17.addBadWords();
        java.lang.String str43 = python2Target17.getTargetStringLiteralFromString("\"i\"");
        boolean boolean44 = python2Target17.wantsBaseListener();
        java.lang.String[] strArray45 = null;
        python2Target17.targetCharValueEscape = strArray45;
        org.antlr.v4.tool.Grammar grammar47 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target48 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str50 = python2Target48.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator51 = null;
        python2Target48.gen = codeGenerator51;
        java.lang.String str54 = python2Target48.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar55 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target56 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str58 = python2Target56.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator59 = null;
        python2Target56.gen = codeGenerator59;
        java.lang.String str62 = python2Target56.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar63 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target64 = new org.antlr.v4.codegen.target.Python2Target();
        int int65 = python2Target64.getInlineTestSetWordSize();
        java.lang.String[] strArray69 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet70 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet70, strArray69);
        python2Target64.badWords = strSet70;
        org.stringtemplate.v4.STGroup sTGroup73 = null;
        python2Target64.templates = sTGroup73;
        org.antlr.v4.codegen.CodeGenerator codeGenerator75 = null;
        python2Target64.gen = codeGenerator75;
        java.util.Set<java.lang.String> strSet77 = python2Target64.getBadWords();
        java.lang.String str78 = python2Target64.getVersion();
        org.antlr.v4.tool.Grammar grammar79 = null;
        int[] intArray80 = new int[] {};
        java.lang.String[] strArray81 = python2Target64.getTokenTypesAsTargetLabels(grammar79, intArray80);
        java.lang.String[] strArray82 = python2Target56.getTokenTypesAsTargetLabels(grammar63, intArray80);
        java.lang.String[] strArray83 = python2Target48.getTokenTypesAsTargetLabels(grammar55, intArray80);
        java.lang.String[] strArray84 = python2Target17.getTokenTypesAsTargetLabels(grammar47, intArray80);
        java.lang.String[] strArray85 = python2Target9.getTokenTypesAsTargetLabels(grammar16, intArray80);
        java.lang.String[] strArray86 = python2Target1.getTokenTypesAsTargetLabels(grammar7, intArray80);
        java.lang.String str88 = python2Target1.getTargetStringLiteralFromString("hi!");
        int int89 = python2Target1.getInlineTestSetWordSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_\"i\"" + "'", str5.equals("_\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"\"hi!\"\"Context" + "'", str11.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "_\"i\"" + "'", str13.equals("_\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\"hi!\"" + "'", str19.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "i" + "'", str25.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 64 + "'", int26 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "\\0" + "'", str29.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 64 + "'", int31 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "\"\"i\"\"" + "'", str43.equals("\"\"i\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "\\0" + "'", str50.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "\\12" + "'", str54.equals("\\12"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "\\0" + "'", str58.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "\\12" + "'", str62.equals("\\12"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 64 + "'", int65 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "4.5.2.1" + "'", str78.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str88 + "' != '" + "\"hi!\"" + "'", str88.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 64 + "'", int89 == 64);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getLanguage();
        boolean boolean5 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python2Target1.genRecognizerHeaderFile(grammar6, sT7, "\"\"0\"Context\"");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Python2" + "'", str4.equals("Python2"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        java.lang.String[] strArray6 = python2Target0.targetCharValueEscape;
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        int int4 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"\"hi!\"\"\"", false);
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target();
        int int9 = python2Target8.getInlineTestSetWordSize();
        java.lang.String str12 = python2Target8.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str13 = python2Target8.getLanguage();
        boolean boolean14 = python2Target8.wantsBaseVisitor();
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target();
        int int16 = python2Target15.getInlineTestSetWordSize();
        int int17 = python2Target15.getInlineTestSetWordSize();
        boolean boolean18 = python2Target15.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = python2Target15.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        java.lang.String str23 = python2Target15.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator20, "_\"i\"", false);
        java.lang.String[] strArray29 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray29;
        python2Target15.targetCharValueEscape = strArray29;
        python2Target8.targetCharValueEscape = strArray29;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray29;
        python2Target1.targetCharValueEscape = strArray29;
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        java.lang.String str38 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator35, "\" \"", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\\\"\\\"\\\"hi!\\\"\\\"\\\"" + "'", str7.equals("\\\"\\\"\\\"hi!\\\"\\\"\\\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\"hi!\"\"" + "'", str12.equals("\"\"hi!\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "\\\"i" + "'", str23.equals("\\\"i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + " " + "'", str38.equals(" "));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        java.lang.String[] strArray3 = python2Target1.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "_tset\"\\\\\\\"i\"", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"tset\\\"\\\\\\\"i\"" + "'", str7.equals("\"tset\\\"\\\\\\\"i\""));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        python2Target0.language = "\"\"\\12Context\"Context\"";
        java.lang.String str3 = python2Target0.getLanguage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"\"\\12Context\"Context\"" + "'", str3.equals("\"\"\\12Context\"Context\""));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_\"i\"", false);
        java.lang.String[] strArray14 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray14;
        python2Target0.targetCharValueEscape = strArray14;
        java.lang.String[] strArray17 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str20 = python2Target18.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target();
        int int22 = python2Target21.getInlineTestSetWordSize();
        java.lang.String[] strArray26 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        python2Target21.badWords = strSet27;
        python2Target18.badWords = strSet27;
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str33 = python2Target31.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        python2Target31.gen = codeGenerator34;
        java.lang.String[] strArray41 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray41;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray41;
        python2Target31.targetCharValueEscape = strArray41;
        python2Target18.targetCharValueEscape = strArray41;
        java.lang.String[] strArray46 = python2Target18.targetCharValueEscape;
        python2Target0.targetCharValueEscape = strArray46;
        java.util.Set<java.lang.String> strSet48 = python2Target0.getBadWords();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\\"i" + "'", str8.equals("\\\"i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\\0" + "'", str20.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 64 + "'", int22 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "\\0" + "'", str33.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet48);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str8 = python2Target6.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target18.loadTemplates();
        python2Target6.templates = sTGroup19;
        python2Target0.templates = sTGroup19;
        java.lang.String[] strArray22 = python2Target0.targetCharValueEscape;
        java.lang.String str23 = python2Target0.getVersion();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4.equals("\"\"hi!\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"hi!\"" + "'", str8.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\"" + "'", str12.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\"\"" + "'", str16.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "4.5.2.1" + "'", str23.equals("4.5.2.1"));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("\\\"i");
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("\\12");
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        int int11 = python2Target10.getInlineTestSetWordSize();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        python2Target10.badWords = strSet16;
        org.stringtemplate.v4.STGroup sTGroup19 = null;
        python2Target10.templates = sTGroup19;
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        python2Target10.gen = codeGenerator21;
        java.util.Set<java.lang.String> strSet23 = python2Target10.getBadWords();
        java.lang.String str24 = python2Target10.getVersion();
        org.antlr.v4.tool.Grammar grammar25 = null;
        int[] intArray26 = new int[] {};
        java.lang.String[] strArray27 = python2Target10.getTokenTypesAsTargetLabels(grammar25, intArray26);
        java.lang.String[] strArray28 = python2Target1.getTokenTypesAsTargetLabels(grammar9, intArray26);
        python2Target1.addBadWords();
        boolean boolean30 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST31 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4.5.2.1" + "'", str4.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"\\\\\\\"i\"" + "'", str6.equals("\"\\\\\\\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\12Context" + "'", str8.equals("\\12Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "4.5.2.1" + "'", str24.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        python2Target0.addBadWords();
        java.lang.String[] strArray6 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\" \"", true);
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromString("\"\\\"i\"");
        java.lang.String str14 = python2Target0.getTargetStringLiteralFromString("\\0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\0" + "'", str2.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\" \"" + "'", str10.equals("\" \""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\"\\\"i\"\"" + "'", str12.equals("\"\"\\\"i\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"\\0\"" + "'", str14.equals("\"\\0\""));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"\"hi!\"\"Context", true);
        boolean boolean18 = python2Target0.supportsOverloadedMethods();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\0" + "'", str2.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\"\\\"hi!\\\"\\\"Contex\"" + "'", str17.equals("\"\\\"hi!\\\"\\\"Contex\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        java.lang.String str6 = python2Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\\\"\\\"\\\"hi!\\\"\\\"\\\"", false);
        java.lang.String str11 = python2Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target0.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target0.getListLabel("__\"i\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4.equals("\"\"hi!\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\\\"\\\"\\\"hi!\\\"\\\"\\\"" + "'", str10.equals("\\\"\\\"\\\"hi!\\\"\\\"\\\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator12);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\\0", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        python2Target0.gen = codeGenerator18;
        java.lang.String str20 = python2Target0.getLanguage();
        java.util.Set<java.lang.String> strSet21 = python2Target0.badWords;
        java.lang.String[] strArray22 = python2Target0.targetCharValueEscape;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup23 = python2Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\0" + "'", str2.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\"\"" + "'", str17.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target0.gen;
        java.util.Set<java.lang.String> strSet12 = python2Target0.getBadWords();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"\"" + "'", str6.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"" + "'", str10.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        boolean boolean27 = python2Target0.templatesExist();
        java.lang.String str29 = python2Target0.encodeIntAsCharEscape((int) '#');
        int int30 = python2Target0.getInlineTestSetWordSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\0" + "'", str12.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "#" + "'", str29.equals("#"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 64 + "'", int30 == 64);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", true);
        python2Target1.addBadWords();
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\"\\12Context\"");
        java.lang.String str12 = python2Target1.encodeIntAsCharEscape((int) (byte) 0);
        python2Target1.language = "d";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4.5.2.1" + "'", str4.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"\"" + "'", str7.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\12Context\"Context" + "'", str10.equals("\"\\12Context\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\0" + "'", str12.equals("\\0"));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\\1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\\1" + "'", str1.equals("\\1"));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        python2Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target7.loadTemplates();
        python2Target0.templates = sTGroup8;
        java.lang.String str11 = python2Target0.getTargetStringLiteralFromString("\\12Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target0.gen;
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target0.getLoopLabel(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\0" + "'", str2.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"\\12Context\"" + "'", str11.equals("\"\\12Context\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator12);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        java.lang.String str6 = python2Target1.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python2Target1.gen = codeGenerator7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_\"i\"" + "'", str5.equals("_\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Python2" + "'", str6.equals("Python2"));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        boolean boolean4 = python2Target0.supportsOverloadedMethods();
        java.lang.String str7 = python2Target0.getTargetStringLiteralFromString("\"\\12\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target0.getCodeGenerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"\"\\12\"\"" + "'", str7.equals("\"\"\\12\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", true);
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\" \"");
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("\\64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4.5.2.1" + "'", str4.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"\"" + "'", str7.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Python2" + "'", str8.equals("Python2"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\" \"Context" + "'", str10.equals("\" \"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\64Context" + "'", str12.equals("\\64Context"));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str11 = python2Target9.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target();
        int int13 = python2Target12.getInlineTestSetWordSize();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        python2Target12.badWords = strSet18;
        python2Target9.badWords = strSet18;
        python2Target0.badWords = strSet18;
        org.antlr.v4.tool.Grammar grammar23 = null;
        org.stringtemplate.v4.ST sT24 = null;
        python2Target0.genRecognizerHeaderFile(grammar23, sT24, "_\"i\"");
        java.lang.String str28 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = python2Target0.getElementName("_ \\\"Contex");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\\0" + "'", str11.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "\"\\\"i\"" + "'", str28.equals("\"\\\"i\""));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target0.getCodeGenerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.gen;
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\"\\\"i\\\"\"");
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getLoopCounter(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_\"i\"" + "'", str5.equals("_\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"\\\"\\\\\\\"i\\\\\\\"\\\"\"" + "'", str9.equals("\"\\\"\\\\\\\"i\\\\\\\"\\\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        boolean boolean5 = python2Target0.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target0.getElementListName("\"tset\\\"\\\\\\\"i\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\0" + "'", str2.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        boolean boolean4 = python2Target1.templatesExist();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        int int13 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str16 = python2Target0.getTargetStringLiteralFromString("_tset\"\"", false);
        boolean boolean17 = python2Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target0.gen;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\0" + "'", str2.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "_tset\"\"" + "'", str16.equals("_tset\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator18);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup10 = python2Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = python2Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        java.lang.String str28 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator25, "_tset\"\\\\\\\"i\"", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\0" + "'", str12.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "tset\\\"\\\\\\\"i" + "'", str28.equals("tset\\\"\\\\\\\"i"));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str8 = python2Target6.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target18.loadTemplates();
        python2Target6.templates = sTGroup19;
        python2Target0.templates = sTGroup19;
        java.util.Set<java.lang.String> strSet22 = python2Target0.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = python2Target0.getCodeGenerator();
        boolean boolean24 = python2Target0.wantsBaseListener();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4.equals("\"\"hi!\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"hi!\"" + "'", str8.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\"" + "'", str12.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\"\"" + "'", str16.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        boolean boolean11 = python2Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "\"hi!\"", false);
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target();
        int int17 = python2Target16.getInlineTestSetWordSize();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        python2Target16.badWords = strSet22;
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target16.templates = sTGroup25;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        python2Target16.gen = codeGenerator27;
        java.util.Set<java.lang.String> strSet29 = python2Target16.getBadWords();
        python2Target0.badWords = strSet29;
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromString("\"\\12\"");
        python2Target0.addBadWords();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "\"\"\\12\"\"" + "'", str32.equals("\"\"\\12\"\""));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.util.Set<java.lang.String> strSet13 = python2Target0.getBadWords();
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.stringtemplate.v4.ST sT15 = null;
        python2Target0.genRecognizerHeaderFile(grammar14, sT15, "\"\"\\12Context\"\"");
        boolean boolean18 = python2Target0.templatesExist();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"hi!\"" + "'", str12.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.gen;
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        java.lang.String str9 = python2Target1.getListLabel("\"\"\"\\12Context\"\"\"");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_\"i\"" + "'", str5.equals("_\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"\"\"\\12Context\"\"\"" + "'", str9.equals("\"\"\"\\12Context\"\"\""));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String str9 = python2Target7.getAltLabelContextStructName("\"\"hi!\"\"");
        boolean boolean10 = python2Target7.templatesExist();
        boolean boolean11 = python2Target7.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target7.getCodeGenerator();
        java.util.Set<java.lang.String> strSet13 = python2Target7.badWords;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target();
        int int15 = python2Target14.getInlineTestSetWordSize();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python2Target14.badWords = strSet20;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        org.stringtemplate.v4.STGroup sTGroup25 = python2Target24.loadTemplates();
        python2Target14.templates = sTGroup25;
        python2Target7.templates = sTGroup25;
        python2Target1.templates = sTGroup25;
        java.lang.String str31 = python2Target1.getTargetStringLiteralFromString("\"\\\\\\\"i\"", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Python2" + "'", str4.equals("Python2"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"\"hi!\"\"Context" + "'", str9.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "\\\"\\\\\\\\\\\\\\\"i\\\"" + "'", str31.equals("\\\"\\\\\\\\\\\\\\\"i\\\""));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\\0", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target0.gen;
        org.antlr.v4.codegen.target.Python2Target python2Target19 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        python2Target19.gen = codeGenerator20;
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str24 = python2Target22.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        python2Target22.gen = codeGenerator25;
        python2Target22.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target29 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator28);
        org.stringtemplate.v4.STGroup sTGroup30 = python2Target29.loadTemplates();
        python2Target22.templates = sTGroup30;
        python2Target19.templates = sTGroup30;
        python2Target0.templates = sTGroup30;
        java.lang.String str34 = python2Target0.getLanguage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\0" + "'", str2.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\"\"" + "'", str17.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "\\0" + "'", str24.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromString("\"\\\\\\\"i\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = python2Target0.getCodeGenerator();
        java.lang.String str34 = python2Target0.language;
        boolean boolean35 = python2Target0.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup36 = python2Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\0" + "'", str12.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "\"\\12\"" + "'", str29.equals("\"\\12\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "\"\\\\\\\"i\"" + "'", str32.equals("\"\\\\\\\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        boolean boolean11 = python2Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "\"hi!\"", false);
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target();
        int int17 = python2Target16.getInlineTestSetWordSize();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        python2Target16.badWords = strSet22;
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target16.templates = sTGroup25;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        python2Target16.gen = codeGenerator27;
        java.util.Set<java.lang.String> strSet29 = python2Target16.getBadWords();
        python2Target0.badWords = strSet29;
        boolean boolean31 = python2Target0.templatesExist();
        boolean boolean32 = python2Target0.templatesExist();
        java.lang.String str33 = python2Target0.getVersion();
        python2Target0.addBadWords();
        java.lang.String str36 = python2Target0.getTargetStringLiteralFromString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "4.5.2.1" + "'", str33.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "\"\"" + "'", str36.equals("\"\""));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet7 = python2Target1.badWords;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str10 = python2Target8.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python2Target8.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python2Target8.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "", true);
        java.util.Set<java.lang.String> strSet19 = python2Target8.getBadWords();
        python2Target1.badWords = strSet19;
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str23 = python2Target21.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target();
        int int25 = python2Target24.getInlineTestSetWordSize();
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        python2Target24.badWords = strSet30;
        python2Target21.badWords = strSet30;
        python2Target1.badWords = strSet30;
        java.lang.String str35 = python2Target1.language;
        org.antlr.v4.tool.Grammar grammar36 = null;
        org.stringtemplate.v4.ST sT37 = null;
        python2Target1.genRecognizerHeaderFile(grammar36, sT37, "@");
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar41 = null;
        org.stringtemplate.v4.ST sT42 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar41, sT42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_\"i\"" + "'", str5.equals("_\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"hi!\"" + "'", str10.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"\"" + "'", str14.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\"\"" + "'", str18.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "\\0" + "'", str23.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 64 + "'", int25 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "Python2" + "'", str35.equals("Python2"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator40);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        boolean boolean4 = python2Target1.templatesExist();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target1.gen = codeGenerator6;
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\\0", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        java.lang.String str22 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator19, "\"\"\\12\"\"", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\0" + "'", str2.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\"\"" + "'", str17.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "\"\\\"12\\\"\"" + "'", str22.equals("\"\\\"12\\\"\""));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.gen;
        java.lang.String str5 = python2Target0.getVersion();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python2Target1.getLoopCounter(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup2);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.addBadWords();
        java.lang.String str5 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target0.getLoopCounter(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "__\"i\"", true);
        java.lang.String str9 = python2Target0.getLanguage();
        python2Target0.language = "\"#\"";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4.equals("\"\"hi!\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"_\\\"i\"" + "'", str8.equals("\"_\\\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target12.loadTemplates();
        python2Target0.templates = sTGroup13;
        org.antlr.v4.tool.Grammar grammar15 = null;
        int[] intArray18 = new int[] { 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray19 = python2Target0.getTokenTypesAsTargetLabels(grammar15, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"\"" + "'", str6.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"" + "'", str10.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 100]");
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_\"i\"", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\\"i" + "'", str8.equals("\\\"i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.templatesExist();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_\"i\"" + "'", str5.equals("_\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean7 = python2Target0.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python2Target0.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\"\"i\"\"", false);
        java.lang.String str13 = python2Target0.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target0.getImplicitRuleLabel("\"\\\"i\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\\12" + "'", str6.equals("\\12"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\\"i\\\"" + "'", str12.equals("\\\"i\\\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "__\"i\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target0.getImplicitSetLabel("\"\"\"hi!\"\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4.equals("\"\"hi!\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"_\\\"i\"" + "'", str8.equals("\"_\\\"i\""));
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str8 = python2Target6.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target18.loadTemplates();
        python2Target6.templates = sTGroup19;
        python2Target0.templates = sTGroup19;
        int int22 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str24 = python2Target0.getImplicitRuleLabel("\"\\\\\\\"i\"");
        java.lang.String str26 = python2Target0.getListLabel("\"\\\"0\\\"Context\"Context");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = python2Target0.getElementListName("\"\\\"hi!\\\"\\\"Contex\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4.equals("\"\"hi!\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"hi!\"" + "'", str8.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\"" + "'", str12.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\"\"" + "'", str16.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 64 + "'", int22 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "_\"\\\\\\\"i\"" + "'", str24.equals("_\"\\\\\\\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "\"\\\"0\\\"Context\"Context" + "'", str26.equals("\"\\\"0\\\"Context\"Context"));
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        java.lang.String[] strArray3 = python2Target1.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target python2Target4 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str6 = python2Target4.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target4.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python2Target4.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target16.loadTemplates();
        python2Target4.templates = sTGroup17;
        java.lang.String str19 = python2Target4.language;
        org.stringtemplate.v4.STGroup sTGroup20 = python2Target4.templates;
        python2Target1.templates = sTGroup20;
        boolean boolean22 = python2Target1.supportsOverloadedMethods();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"hi!\"" + "'", str6.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"" + "'", str10.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"\"" + "'", str14.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        boolean boolean4 = python2Target1.templatesExist();
        boolean boolean5 = python2Target1.templatesExist();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", true);
        boolean boolean8 = python2Target1.templatesExist();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4.5.2.1" + "'", str4.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"\"" + "'", str7.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target10.loadTemplates();
        python2Target0.templates = sTGroup11;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target0.getElementListName("\"_\\\\0\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup11);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        boolean boolean5 = python2Target0.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python2Target0.genRecognizerHeaderFile(grammar6, sT7, "\"\\12\"");
        java.lang.String str10 = python2Target0.language;
        int int11 = python2Target0.getSerializedATNSegmentLimit();
        java.lang.String str14 = python2Target0.getTargetStringLiteralFromString("\"_\\\\0\"", true);
        python2Target0.addBadWords();
        boolean boolean16 = python2Target0.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target0.getLoopLabel(grammarAST17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\0" + "'", str2.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"\"_\\\\0\"\"" + "'", str14.equals("\"\"_\\\\0\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        int int2 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python2Target1.badWords = strSet7;
        python2Target0.badWords = strSet7;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "\\12", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python2Target0.gen;
        int int16 = python2Target0.getSerializedATNSegmentLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "1" + "'", str14.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python2Target0.getCodeGenerator();
        boolean boolean15 = python2Target0.templatesExist();
        python2Target0.addBadWords();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\0" + "'", str2.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target0.getAltLabelContextStructName("_\"\\\\\\\"i\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"hi!\"" + "'", str12.equals("\"hi!\""));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        int int13 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str16 = python2Target0.getTargetStringLiteralFromString("_tset\"\"", false);
        boolean boolean17 = python2Target0.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target0.getTokenTypeAsTargetLabel(grammar18, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\0" + "'", str2.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "_tset\"\"" + "'", str16.equals("_tset\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        java.lang.String str15 = python2Target0.encodeIntAsCharEscape((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\0" + "'", str2.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#" + "'", str15.equals("#"));
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        boolean boolean11 = python2Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "\"hi!\"", false);
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target();
        int int17 = python2Target16.getInlineTestSetWordSize();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        python2Target16.badWords = strSet22;
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target16.templates = sTGroup25;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        python2Target16.gen = codeGenerator27;
        java.util.Set<java.lang.String> strSet29 = python2Target16.getBadWords();
        python2Target0.badWords = strSet29;
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromString("\"\\12\"");
        org.antlr.v4.tool.Grammar grammar33 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target34 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str36 = python2Target34.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = null;
        python2Target34.gen = codeGenerator37;
        java.lang.String str40 = python2Target34.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar41 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target42 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str44 = python2Target42.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = null;
        python2Target42.gen = codeGenerator45;
        java.lang.String str48 = python2Target42.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar49 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target50 = new org.antlr.v4.codegen.target.Python2Target();
        int int51 = python2Target50.getInlineTestSetWordSize();
        java.lang.String[] strArray55 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        python2Target50.badWords = strSet56;
        org.stringtemplate.v4.STGroup sTGroup59 = null;
        python2Target50.templates = sTGroup59;
        org.antlr.v4.codegen.CodeGenerator codeGenerator61 = null;
        python2Target50.gen = codeGenerator61;
        java.util.Set<java.lang.String> strSet63 = python2Target50.getBadWords();
        java.lang.String str64 = python2Target50.getVersion();
        org.antlr.v4.tool.Grammar grammar65 = null;
        int[] intArray66 = new int[] {};
        java.lang.String[] strArray67 = python2Target50.getTokenTypesAsTargetLabels(grammar65, intArray66);
        java.lang.String[] strArray68 = python2Target42.getTokenTypesAsTargetLabels(grammar49, intArray66);
        java.lang.String[] strArray69 = python2Target34.getTokenTypesAsTargetLabels(grammar41, intArray66);
        java.lang.String[] strArray70 = python2Target0.getTokenTypesAsTargetLabels(grammar33, intArray66);
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray70;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "\"\"\\12\"\"" + "'", str32.equals("\"\"\\12\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "\\0" + "'", str36.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "\\12" + "'", str40.equals("\\12"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "\\0" + "'", str44.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "\\12" + "'", str48.equals("\\12"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 64 + "'", int51 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "4.5.2.1" + "'", str64.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray70);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        java.lang.String str26 = python2Target0.getTargetStringLiteralFromString("\"i\"");
        boolean boolean27 = python2Target0.wantsBaseListener();
        java.lang.String[] strArray28 = null;
        python2Target0.targetCharValueEscape = strArray28;
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str33 = python2Target31.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        python2Target31.gen = codeGenerator34;
        java.lang.String str37 = python2Target31.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar38 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target39 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str41 = python2Target39.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        python2Target39.gen = codeGenerator42;
        java.lang.String str45 = python2Target39.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar46 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target47 = new org.antlr.v4.codegen.target.Python2Target();
        int int48 = python2Target47.getInlineTestSetWordSize();
        java.lang.String[] strArray52 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        python2Target47.badWords = strSet53;
        org.stringtemplate.v4.STGroup sTGroup56 = null;
        python2Target47.templates = sTGroup56;
        org.antlr.v4.codegen.CodeGenerator codeGenerator58 = null;
        python2Target47.gen = codeGenerator58;
        java.util.Set<java.lang.String> strSet60 = python2Target47.getBadWords();
        java.lang.String str61 = python2Target47.getVersion();
        org.antlr.v4.tool.Grammar grammar62 = null;
        int[] intArray63 = new int[] {};
        java.lang.String[] strArray64 = python2Target47.getTokenTypesAsTargetLabels(grammar62, intArray63);
        java.lang.String[] strArray65 = python2Target39.getTokenTypesAsTargetLabels(grammar46, intArray63);
        java.lang.String[] strArray66 = python2Target31.getTokenTypesAsTargetLabels(grammar38, intArray63);
        java.lang.String[] strArray67 = python2Target0.getTokenTypesAsTargetLabels(grammar30, intArray63);
        boolean boolean68 = python2Target0.wantsBaseListener();
        boolean boolean69 = python2Target0.templatesExist();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\0" + "'", str12.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "\"\"i\"\"" + "'", str26.equals("\"\"i\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "\\0" + "'", str33.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "\\12" + "'", str37.equals("\\12"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "\\0" + "'", str41.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "\\12" + "'", str45.equals("\\12"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 64 + "'", int48 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "4.5.2.1" + "'", str61.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str7 = python2Target0.getTargetStringLiteralFromString("i", true);
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromString("\"\"\\12Context\"\"", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"i\"" + "'", str7.equals("\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"\\12Context\"\"" + "'", str10.equals("\"\"\\12Context\"\""));
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str7 = python2Target0.getTargetStringLiteralFromString("i", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python2Target0.gen = codeGenerator8;
        boolean boolean10 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target0.getCodeGenerator();
        java.lang.String str13 = python2Target0.encodeIntAsCharEscape((int) '4');
        java.util.Set<java.lang.String> strSet14 = python2Target0.getBadWords();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"i\"" + "'", str7.equals("\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\\64" + "'", str13.equals("\\64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        boolean boolean11 = python2Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "\"hi!\"", false);
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target();
        int int17 = python2Target16.getInlineTestSetWordSize();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        python2Target16.badWords = strSet22;
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target16.templates = sTGroup25;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        python2Target16.gen = codeGenerator27;
        java.util.Set<java.lang.String> strSet29 = python2Target16.getBadWords();
        python2Target0.badWords = strSet29;
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromString("\"\\12\"");
        java.lang.String str35 = python2Target0.getTargetStringLiteralFromString("\\12Context", true);
        java.lang.String str37 = python2Target0.getTargetStringLiteralFromString("\"\"hi!\"\"Context");
        java.lang.String str38 = python2Target0.getLanguage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "\"\"\\12\"\"" + "'", str32.equals("\"\"\\12\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "\"\\12Context\"" + "'", str35.equals("\"\\12Context\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "\"\"\"hi!\"\"Context\"" + "'", str37.equals("\"\"\"hi!\"\"Context\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        int int2 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python2Target1.badWords = strSet7;
        python2Target0.badWords = strSet7;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar11, sT12, "\"\\12Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        int int13 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str16 = python2Target0.getTargetStringLiteralFromString("_tset\"\"", false);
        boolean boolean17 = python2Target0.templatesExist();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\0" + "'", str2.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "_tset\"\"" + "'", str16.equals("_tset\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromString("_\"i\"", true);
        java.lang.String str9 = python2Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\"\\\"i\"", true);
        boolean boolean14 = python2Target0.templatesExist();
        boolean boolean15 = python2Target0.templatesExist();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"_\"i\"\"" + "'", str8.equals("\"_\"i\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"\\\"i\"" + "'", str13.equals("\"\\\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        boolean boolean11 = python2Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "\"hi!\"", false);
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target();
        int int17 = python2Target16.getInlineTestSetWordSize();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        python2Target16.badWords = strSet22;
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target16.templates = sTGroup25;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        python2Target16.gen = codeGenerator27;
        java.util.Set<java.lang.String> strSet29 = python2Target16.getBadWords();
        python2Target0.badWords = strSet29;
        boolean boolean31 = python2Target0.templatesExist();
        boolean boolean32 = python2Target0.templatesExist();
        java.lang.String str33 = python2Target0.language;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target0.gen;
        java.lang.String str8 = python2Target0.getLanguage();
        boolean boolean9 = python2Target0.wantsBaseVisitor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\\12" + "'", str6.equals("\\12"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        java.lang.String str6 = python2Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\\\"\\\"\\\"hi!\\\"\\\"\\\"", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target0.getAltLabelContextStructName("\"\"\"\\12Context\"Context\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4.equals("\"\"hi!\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\\\"\\\"\\\"hi!\\\"\\\"\\\"" + "'", str10.equals("\\\"\\\"\\\"hi!\\\"\\\"\\\""));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target12.loadTemplates();
        python2Target0.templates = sTGroup13;
        org.stringtemplate.v4.STGroup sTGroup15 = null;
        python2Target0.templates = sTGroup15;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup17 = python2Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"\"" + "'", str6.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"" + "'", str10.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup13);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        java.util.Set<java.lang.String> strSet7 = python2Target0.badWords;
        java.lang.String str9 = python2Target0.getTargetStringLiteralFromString("\"\"\\12Context\"Context\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python2Target0.gen = codeGenerator10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\\12" + "'", str6.equals("\\12"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"\"\"\\12Context\"Context\"\"" + "'", str9.equals("\"\"\"\\12Context\"Context\"\""));
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.gen;
        int int7 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_\"i\"" + "'", str5.equals("_\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target0.gen = codeGenerator6;
        boolean boolean8 = python2Target0.templatesExist();
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar9, sT10, "\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str8 = python2Target6.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target18.loadTemplates();
        python2Target6.templates = sTGroup19;
        python2Target0.templates = sTGroup19;
        java.lang.String[] strArray22 = python2Target0.targetCharValueEscape;
        java.lang.String str24 = python2Target0.getImplicitRuleLabel("\"i\"");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4.equals("\"\"hi!\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"hi!\"" + "'", str8.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\"" + "'", str12.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\"\"" + "'", str16.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "_\"i\"" + "'", str24.equals("_\"i\""));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str15 = python2Target13.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        python2Target13.gen = codeGenerator16;
        java.lang.String[] strArray23 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray23;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray23;
        python2Target13.targetCharValueEscape = strArray23;
        python2Target0.targetCharValueEscape = strArray23;
        java.lang.String[] strArray28 = python2Target0.targetCharValueEscape;
        int int29 = python2Target0.getInlineTestSetWordSize();
        python2Target0.language = "\"\"\\12Context\"Context\"";
        org.antlr.v4.tool.Grammar grammar32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = python2Target0.getTokenTypeAsTargetLabel(grammar32, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\0" + "'", str2.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\\0" + "'", str15.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 64 + "'", int29 == 64);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        boolean boolean24 = python2Target0.templatesExist();
        java.lang.String str27 = python2Target0.getTargetStringLiteralFromString("\"\\\"hi!\\\"\\\"Contex\"", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = python2Target0.getLoopLabel(grammarAST28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\0" + "'", str12.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\"\\\"hi!\\\"\\\"Contex\"" + "'", str27.equals("\"\\\"hi!\\\"\\\"Contex\""));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        boolean boolean5 = python2Target0.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python2Target0.genRecognizerHeaderFile(grammar6, sT7, "\"\\12\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\"\\\"hi!\\\"\\\"Contex\"", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\0" + "'", str2.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\\\"hi!\\\"\\\"Contex" + "'", str13.equals("\\\"hi!\\\"\\\"Contex"));
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        boolean boolean11 = python2Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "\"hi!\"", false);
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target();
        int int17 = python2Target16.getInlineTestSetWordSize();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        python2Target16.badWords = strSet22;
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target16.templates = sTGroup25;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        python2Target16.gen = codeGenerator27;
        java.util.Set<java.lang.String> strSet29 = python2Target16.getBadWords();
        python2Target0.badWords = strSet29;
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromString("\"\\12\"");
        boolean boolean33 = python2Target0.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = python2Target0.getImplicitRuleLabel("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "\"\"\\12\"\"" + "'", str32.equals("\"\"\\12\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString((java.lang.Object) "\"\\\\\\\"i\"", "\\12", locale3);
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str7 = python2Target5.encodeIntAsCharEscape(0);
        java.lang.String str9 = python2Target5.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target5.gen;
        java.lang.String str11 = python2Target5.getLanguage();
        boolean boolean12 = python2Target5.wantsBaseVisitor();
        java.lang.String str13 = python2Target5.language;
        java.util.Locale locale15 = null;
        java.lang.String str16 = pythonStringRenderer0.toString((java.lang.Object) str13, "\"\\\\\\\"i\"", locale15);
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str19 = python2Target17.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target20 = new org.antlr.v4.codegen.target.Python2Target();
        int int21 = python2Target20.getInlineTestSetWordSize();
        java.lang.String[] strArray25 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        python2Target20.badWords = strSet26;
        python2Target17.badWords = strSet26;
        java.lang.String[] strArray30 = python2Target17.targetCharValueEscape;
        boolean boolean31 = python2Target17.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = python2Target17.gen;
        java.util.Locale locale34 = null;
        java.lang.String str35 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator32, "\"\"i\"\"", locale34);
        org.antlr.v4.codegen.target.Python2Target python2Target36 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str38 = python2Target36.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target39 = new org.antlr.v4.codegen.target.Python2Target();
        int int40 = python2Target39.getInlineTestSetWordSize();
        java.lang.String[] strArray44 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        python2Target39.badWords = strSet45;
        python2Target36.badWords = strSet45;
        java.lang.String[] strArray49 = python2Target36.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator50 = null;
        java.lang.String str53 = python2Target36.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator50, "\\0", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator54 = python2Target36.gen;
        org.antlr.v4.codegen.target.Python2Target python2Target55 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.CodeGenerator codeGenerator56 = null;
        python2Target55.gen = codeGenerator56;
        org.antlr.v4.codegen.target.Python2Target python2Target58 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str60 = python2Target58.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator61 = null;
        python2Target58.gen = codeGenerator61;
        python2Target58.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator64 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target65 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator64);
        org.stringtemplate.v4.STGroup sTGroup66 = python2Target65.loadTemplates();
        python2Target58.templates = sTGroup66;
        python2Target55.templates = sTGroup66;
        python2Target36.templates = sTGroup66;
        java.util.Locale locale71 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str72 = pythonStringRenderer0.toString((java.lang.Object) sTGroup66, "", locale71);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.stringtemplate.v4.STGroupFile cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\12" + "'", str4.equals("\\12"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\\0" + "'", str7.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\\1" + "'", str9.equals("\\1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\"\\\\\\\"i\"" + "'", str16.equals("\"\\\\\\\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\\0" + "'", str19.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "\"\"i\"\"" + "'", str35.equals("\"\"i\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "\\0" + "'", str38.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 64 + "'", int40 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "\"\"" + "'", str53.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "\\0" + "'", str60.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup66);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.addBadWords();
        java.lang.String str5 = python2Target0.encodeIntAsCharEscape((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "d" + "'", str5.equals("d"));
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        python2Target1.gen = codeGenerator4;
        java.lang.String[] strArray6 = python2Target1.targetCharValueEscape;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target0.gen = codeGenerator6;
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.lang.String str12 = python2Target10.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str14 = python2Target10.getImplicitRuleLabel("\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python2Target10.gen;
        boolean boolean16 = python2Target10.wantsBaseVisitor();
        java.lang.String str18 = python2Target10.getTargetStringLiteralFromString("\"\\\"i\\\"\"");
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target10.getTemplates();
        python2Target0.templates = sTGroup19;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\"hi!\"\"Context" + "'", str12.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "_\"i\"" + "'", str14.equals("_\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\"\\\"\\\\\\\"i\\\\\\\"\\\"\"" + "'", str18.equals("\"\\\"\\\\\\\"i\\\\\\\"\\\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup19);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str11 = python2Target9.getTargetStringLiteralFromString("hi!");
        python2Target9.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target9.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "hi!", false);
        int int18 = python2Target9.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target19 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str21 = python2Target19.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target();
        int int23 = python2Target22.getInlineTestSetWordSize();
        java.lang.String[] strArray27 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        python2Target22.badWords = strSet28;
        python2Target19.badWords = strSet28;
        python2Target9.badWords = strSet28;
        python2Target9.addBadWords();
        java.lang.String str35 = python2Target9.getTargetStringLiteralFromString("\"i\"");
        boolean boolean36 = python2Target9.wantsBaseListener();
        java.lang.String[] strArray37 = null;
        python2Target9.targetCharValueEscape = strArray37;
        org.antlr.v4.tool.Grammar grammar39 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target40 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str42 = python2Target40.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator43 = null;
        python2Target40.gen = codeGenerator43;
        java.lang.String str46 = python2Target40.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar47 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target48 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str50 = python2Target48.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator51 = null;
        python2Target48.gen = codeGenerator51;
        java.lang.String str54 = python2Target48.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar55 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target56 = new org.antlr.v4.codegen.target.Python2Target();
        int int57 = python2Target56.getInlineTestSetWordSize();
        java.lang.String[] strArray61 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet62 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet62, strArray61);
        python2Target56.badWords = strSet62;
        org.stringtemplate.v4.STGroup sTGroup65 = null;
        python2Target56.templates = sTGroup65;
        org.antlr.v4.codegen.CodeGenerator codeGenerator67 = null;
        python2Target56.gen = codeGenerator67;
        java.util.Set<java.lang.String> strSet69 = python2Target56.getBadWords();
        java.lang.String str70 = python2Target56.getVersion();
        org.antlr.v4.tool.Grammar grammar71 = null;
        int[] intArray72 = new int[] {};
        java.lang.String[] strArray73 = python2Target56.getTokenTypesAsTargetLabels(grammar71, intArray72);
        java.lang.String[] strArray74 = python2Target48.getTokenTypesAsTargetLabels(grammar55, intArray72);
        java.lang.String[] strArray75 = python2Target40.getTokenTypesAsTargetLabels(grammar47, intArray72);
        java.lang.String[] strArray76 = python2Target9.getTokenTypesAsTargetLabels(grammar39, intArray72);
        java.lang.String[] strArray77 = python2Target1.getTokenTypesAsTargetLabels(grammar8, intArray72);
        org.antlr.v4.tool.ast.GrammarAST grammarAST78 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str79 = python2Target1.getLoopLabel(grammarAST78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_\"i\"" + "'", str5.equals("_\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"hi!\"" + "'", str11.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "i" + "'", str17.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\\0" + "'", str21.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 64 + "'", int23 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "\"\"i\"\"" + "'", str35.equals("\"\"i\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "\\0" + "'", str42.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "\\12" + "'", str46.equals("\\12"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "\\0" + "'", str50.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "\\12" + "'", str54.equals("\\12"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 64 + "'", int57 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "4.5.2.1" + "'", str70.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray77);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\"_\"i\"\"\"");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\"\"_\"i\"\"\"" + "'", str1.equals("\"\"_\"i\"\"\""));
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        python2Target0.language = "\\1";
        java.lang.String str13 = python2Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        java.lang.String str17 = python2Target15.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str18 = python2Target15.getLanguage();
        java.util.Set<java.lang.String> strSet19 = python2Target15.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator20);
        java.lang.String str23 = python2Target21.getAltLabelContextStructName("\"\"hi!\"\"");
        boolean boolean24 = python2Target21.templatesExist();
        boolean boolean25 = python2Target21.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = python2Target21.getCodeGenerator();
        java.util.Set<java.lang.String> strSet27 = python2Target21.badWords;
        org.antlr.v4.codegen.target.Python2Target python2Target28 = new org.antlr.v4.codegen.target.Python2Target();
        int int29 = python2Target28.getInlineTestSetWordSize();
        java.lang.String[] strArray33 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        python2Target28.badWords = strSet34;
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target38 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator37);
        org.stringtemplate.v4.STGroup sTGroup39 = python2Target38.loadTemplates();
        python2Target28.templates = sTGroup39;
        python2Target21.templates = sTGroup39;
        python2Target15.templates = sTGroup39;
        python2Target0.templates = sTGroup39;
        org.antlr.v4.codegen.CodeGenerator codeGenerator44 = null;
        java.lang.String str47 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator44, "\"\\12\"Context", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4.5.2.1" + "'", str13.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\"\"hi!\"\"Context" + "'", str17.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Python2" + "'", str18.equals("Python2"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "\"\"hi!\"\"Context" + "'", str23.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 64 + "'", int29 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "\"12\\\"Contex\"" + "'", str47.equals("\"12\\\"Contex\""));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target0.gen;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup14 = python2Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"hi!\"" + "'", str12.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator13);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str11 = python2Target9.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target();
        int int13 = python2Target12.getInlineTestSetWordSize();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        python2Target12.badWords = strSet18;
        python2Target9.badWords = strSet18;
        python2Target0.badWords = strSet18;
        int int23 = python2Target0.getSerializedATNSegmentLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\\0" + "'", str11.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target();
        int int9 = python2Target8.getInlineTestSetWordSize();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        python2Target8.badWords = strSet14;
        org.stringtemplate.v4.STGroup sTGroup17 = null;
        python2Target8.templates = sTGroup17;
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        python2Target8.gen = codeGenerator19;
        java.util.Set<java.lang.String> strSet21 = python2Target8.getBadWords();
        java.lang.String str22 = python2Target8.getVersion();
        org.antlr.v4.tool.Grammar grammar23 = null;
        int[] intArray24 = new int[] {};
        java.lang.String[] strArray25 = python2Target8.getTokenTypesAsTargetLabels(grammar23, intArray24);
        java.lang.String[] strArray26 = python2Target0.getTokenTypesAsTargetLabels(grammar7, intArray24);
        java.lang.String str27 = python2Target0.language;
        org.antlr.v4.codegen.target.Python2Target python2Target28 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str30 = python2Target28.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target();
        int int32 = python2Target31.getInlineTestSetWordSize();
        java.lang.String[] strArray36 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        python2Target31.badWords = strSet37;
        python2Target28.badWords = strSet37;
        java.lang.String[] strArray41 = python2Target28.targetCharValueEscape;
        python2Target0.targetCharValueEscape = strArray41;
        int int43 = python2Target0.getInlineTestSetWordSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\0" + "'", str2.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\\12" + "'", str6.equals("\\12"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "4.5.2.1" + "'", str22.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "\\0" + "'", str30.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 64 + "'", int32 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 64 + "'", int43 == 64);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        java.lang.String str6 = python2Target0.getLanguage();
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target();
        int int8 = python2Target7.getInlineTestSetWordSize();
        java.lang.String str11 = python2Target7.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str12 = python2Target7.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str15 = python2Target13.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        java.lang.String str19 = python2Target13.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator16, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        java.lang.String str23 = python2Target13.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator20, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target25 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator24);
        org.stringtemplate.v4.STGroup sTGroup26 = python2Target25.loadTemplates();
        python2Target13.templates = sTGroup26;
        python2Target7.templates = sTGroup26;
        python2Target0.templates = sTGroup26;
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        java.lang.String str33 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator30, "_\\0", true);
        java.lang.String str35 = python2Target0.getListLabel("_\\1");
        org.antlr.v4.tool.ast.GrammarAST grammarAST36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = python2Target0.getLoopLabel(grammarAST36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4.equals("\"\"hi!\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"\"hi!\"\"" + "'", str11.equals("\"\"hi!\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "4.5.2.1" + "'", str12.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"hi!\"" + "'", str15.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\"\"" + "'", str19.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "\"\"" + "'", str23.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "\"0\"" + "'", str33.equals("\"0\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "_\\1" + "'", str35.equals("_\\1"));
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str31 = python2Target0.getTargetStringLiteralFromString("\"i\"");
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup32 = python2Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\0" + "'", str12.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "\"\\12\"" + "'", str29.equals("\"\\12\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "\"\"i\"\"" + "'", str31.equals("\"\"i\"\""));
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.stringtemplate.v4.ST sT15 = null;
        python2Target0.genRecognizerHeaderFile(grammar14, sT15, "_\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target0.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar19, sT20, "\"\\\"0\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\0" + "'", str2.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator18);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromString("_\"i\"", true);
        java.lang.String str9 = python2Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "1", false);
        java.lang.String str14 = python2Target0.getVersion();
        java.lang.String str17 = python2Target0.getTargetStringLiteralFromString("\"\\\"#\\\"\"", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"_\"i\"\"" + "'", str8.equals("\"_\"i\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "4.5.2.1" + "'", str14.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\"\"\\\"#\\\"\"\"" + "'", str17.equals("\"\"\\\"#\\\"\"\""));
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str13 = python2Target11.getTargetStringLiteralFromString("hi!");
        python2Target11.language = "hi!";
        java.util.Set<java.lang.String> strSet16 = python2Target11.badWords;
        python2Target0.badWords = strSet16;
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target0.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target0.getLoopLabel(grammarAST19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\\\"i\"" + "'", str10.equals("\"\\\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"hi!\"" + "'", str13.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator18);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        python2Target0.language = "\\1";
        java.lang.String str13 = python2Target0.language;
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target0.templates;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\\1" + "'", str13.equals("\\1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup14);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str8 = python2Target6.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target18.loadTemplates();
        python2Target6.templates = sTGroup19;
        python2Target0.templates = sTGroup19;
        java.lang.String[] strArray22 = python2Target0.targetCharValueEscape;
        java.lang.String str24 = python2Target0.getImplicitSetLabel("d");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4.equals("\"\"hi!\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"hi!\"" + "'", str8.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\"" + "'", str12.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\"\"" + "'", str16.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "_tsetd" + "'", str24.equals("_tsetd"));
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getSerializedATNSegmentLimit();
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape(1);
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) ' ');
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target();
        int int8 = python2Target7.getInlineTestSetWordSize();
        java.lang.String str11 = python2Target7.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str12 = python2Target7.getLanguage();
        boolean boolean13 = python2Target7.wantsBaseVisitor();
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target();
        int int15 = python2Target14.getInlineTestSetWordSize();
        int int16 = python2Target14.getInlineTestSetWordSize();
        boolean boolean17 = python2Target14.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target14.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        java.lang.String str22 = python2Target14.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator19, "_\"i\"", false);
        java.lang.String[] strArray28 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray28;
        python2Target14.targetCharValueEscape = strArray28;
        python2Target7.targetCharValueEscape = strArray28;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray28;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray28;
        python2Target0.targetCharValueEscape = strArray28;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\1" + "'", str4.equals("\\1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + " " + "'", str6.equals(" "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"\"hi!\"\"" + "'", str11.equals("\"\"hi!\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "\\\"i" + "'", str22.equals("\\\"i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        python2Target0.language = "\\1";
        java.lang.String str13 = python2Target0.language;
        boolean boolean14 = python2Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target0.templates;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\\1" + "'", str13.equals("\\1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup15);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet7 = python2Target1.badWords;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str10 = python2Target8.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python2Target8.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python2Target8.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "", true);
        java.util.Set<java.lang.String> strSet19 = python2Target8.getBadWords();
        python2Target1.badWords = strSet19;
        java.lang.String str22 = python2Target1.getAltLabelContextStructName("\"\\12\"");
        boolean boolean23 = python2Target1.wantsBaseVisitor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_\"i\"" + "'", str5.equals("_\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"hi!\"" + "'", str10.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"\"" + "'", str14.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\"\"" + "'", str18.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "\"\\12\"Context" + "'", str22.equals("\"\\12\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.gen;
        int int7 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getTokenTypeAsTargetLabel(grammar8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_\"i\"" + "'", str5.equals("_\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_\"i\"", false);
        java.lang.String[] strArray14 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray14;
        python2Target0.targetCharValueEscape = strArray14;
        java.lang.String[] strArray17 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str20 = python2Target18.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target();
        int int22 = python2Target21.getInlineTestSetWordSize();
        java.lang.String[] strArray26 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        python2Target21.badWords = strSet27;
        python2Target18.badWords = strSet27;
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str33 = python2Target31.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        python2Target31.gen = codeGenerator34;
        java.lang.String[] strArray41 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray41;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray41;
        python2Target31.targetCharValueEscape = strArray41;
        python2Target18.targetCharValueEscape = strArray41;
        java.lang.String[] strArray46 = python2Target18.targetCharValueEscape;
        python2Target0.targetCharValueEscape = strArray46;
        int int48 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray49 = python2Target0.targetCharValueEscape;
        python2Target0.language = "\"\"\"\\12Context\"\"\"";
        python2Target0.addBadWords();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\\"i" + "'", str8.equals("\\\"i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\\0" + "'", str20.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 64 + "'", int22 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "\\0" + "'", str33.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 64 + "'", int48 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray49);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("\\\"i");
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("\\12");
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        int int11 = python2Target10.getInlineTestSetWordSize();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        python2Target10.badWords = strSet16;
        org.stringtemplate.v4.STGroup sTGroup19 = null;
        python2Target10.templates = sTGroup19;
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        python2Target10.gen = codeGenerator21;
        java.util.Set<java.lang.String> strSet23 = python2Target10.getBadWords();
        java.lang.String str24 = python2Target10.getVersion();
        org.antlr.v4.tool.Grammar grammar25 = null;
        int[] intArray26 = new int[] {};
        java.lang.String[] strArray27 = python2Target10.getTokenTypesAsTargetLabels(grammar25, intArray26);
        java.lang.String[] strArray28 = python2Target1.getTokenTypesAsTargetLabels(grammar9, intArray26);
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray28;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4.5.2.1" + "'", str4.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"\\\\\\\"i\"" + "'", str6.equals("\"\\\\\\\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\12Context" + "'", str8.equals("\\12Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "4.5.2.1" + "'", str24.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getLoopLabel(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4.5.2.1" + "'", str4.equals("4.5.2.1"));
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_\"i\"", false);
        java.lang.String[] strArray14 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray14;
        python2Target0.targetCharValueEscape = strArray14;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        java.lang.String str20 = python2Target18.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str21 = python2Target18.getVersion();
        java.lang.String str23 = python2Target18.getTargetStringLiteralFromString("\\\"i");
        org.stringtemplate.v4.STGroup sTGroup24 = python2Target18.templates;
        python2Target0.templates = sTGroup24;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python2Target0.getElementName("\\12");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\\"i" + "'", str8.equals("\\\"i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\"\"hi!\"\"Context" + "'", str20.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "4.5.2.1" + "'", str21.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "\"\\\\\\\"i\"" + "'", str23.equals("\"\\\\\\\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup24);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        boolean boolean5 = python2Target0.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target0.gen = codeGenerator6;
        python2Target0.language = "\" \"Context";
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target0.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\0" + "'", str2.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromString("\"\\\\\\\"i\"", false);
        java.util.Set<java.lang.String> strSet33 = python2Target0.badWords;
        java.lang.String str34 = python2Target0.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = python2Target0.getImplicitSetLabel("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\0" + "'", str12.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "\"\\12\"" + "'", str29.equals("\"\\12\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "\"\\\\\\\"i\"" + "'", str32.equals("\"\\\\\\\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\\0", true);
        java.lang.String str20 = python2Target0.getTargetStringLiteralFromString("\"\"hi!\"\"", true);
        boolean boolean21 = python2Target0.templatesExist();
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target();
        int int23 = python2Target22.getInlineTestSetWordSize();
        java.lang.String str26 = python2Target22.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str27 = python2Target22.getVersion();
        java.lang.String str28 = python2Target22.getLanguage();
        org.antlr.v4.codegen.target.Python2Target python2Target29 = new org.antlr.v4.codegen.target.Python2Target();
        int int30 = python2Target29.getInlineTestSetWordSize();
        java.lang.String str33 = python2Target29.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str34 = python2Target29.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target35 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str37 = python2Target35.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator38 = null;
        java.lang.String str41 = python2Target35.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator38, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        java.lang.String str45 = python2Target35.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator42, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator46 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target47 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator46);
        org.stringtemplate.v4.STGroup sTGroup48 = python2Target47.loadTemplates();
        python2Target35.templates = sTGroup48;
        python2Target29.templates = sTGroup48;
        python2Target22.templates = sTGroup48;
        python2Target0.templates = sTGroup48;
        boolean boolean53 = python2Target0.templatesExist();
        org.antlr.v4.tool.Grammar grammar54 = null;
        org.stringtemplate.v4.ST sT55 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar54, sT55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\0" + "'", str2.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\"\"" + "'", str17.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\"\"\"hi!\"\"\"" + "'", str20.equals("\"\"\"hi!\"\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 64 + "'", int23 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "\"\"hi!\"\"" + "'", str26.equals("\"\"hi!\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "4.5.2.1" + "'", str27.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 64 + "'", int30 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "\"\"hi!\"\"" + "'", str33.equals("\"\"hi!\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "4.5.2.1" + "'", str34.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "\"hi!\"" + "'", str37.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "\"\"" + "'", str41.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "\"\"" + "'", str45.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        python2Target0.gen = codeGenerator11;
        java.util.Set<java.lang.String> strSet13 = python2Target0.getBadWords();
        java.lang.String str14 = python2Target0.getVersion();
        java.lang.String str16 = python2Target0.getTargetStringLiteralFromString("_tset\"\"");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "4.5.2.1" + "'", str14.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\"_tset\"\"\"" + "'", str16.equals("\"_tset\"\"\""));
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        python2Target0.language = "\\1";
        java.lang.String str13 = python2Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target0.getTokenTypeAsTargetLabel(grammar14, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4.5.2.1" + "'", str13.equals("4.5.2.1"));
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        boolean boolean4 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.language;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Python2" + "'", str6.equals("Python2"));
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.util.Set<java.lang.String> strSet13 = python2Target0.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        python2Target0.gen = codeGenerator14;
        python2Target0.language = "\"_\"i\"\"";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"hi!\"" + "'", str12.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_\"i\"", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target0.getAltLabelContextStructName("__\"i\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\\"i" + "'", str8.equals("\\\"i"));
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        python2Target1.gen = codeGenerator4;
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python2Target1.genRecognizerHeaderFile(grammar6, sT7, "i");
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        boolean boolean5 = python2Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target0.gen = codeGenerator6;
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar8, sT9, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\0" + "'", str2.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4.equals("\"\"hi!\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        python2Target0.gen = codeGenerator11;
        int int13 = python2Target0.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup14 = python2Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromString("\"\\\\\\\"i\"", false);
        java.util.Set<java.lang.String> strSet33 = python2Target0.badWords;
        java.lang.String str34 = python2Target0.getLanguage();
        int int35 = python2Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = python2Target0.getLoopLabel(grammarAST36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\0" + "'", str12.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "\"\\12\"" + "'", str29.equals("\"\\12\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "\"\\\\\\\"i\"" + "'", str32.equals("\"\\\\\\\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\\0", true);
        java.lang.String str20 = python2Target0.getTargetStringLiteralFromString("\"\"hi!\"\"", true);
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str23 = python2Target21.getTargetStringLiteralFromString("hi!");
        python2Target21.language = "hi!";
        java.lang.String str27 = python2Target21.encodeIntAsCharEscape((int) (byte) 10);
        java.util.Set<java.lang.String> strSet28 = python2Target21.badWords;
        python2Target0.badWords = strSet28;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\0" + "'", str2.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\"\"" + "'", str17.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\"\"\"hi!\"\"\"" + "'", str20.equals("\"\"\"hi!\"\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "\"hi!\"" + "'", str23.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\\12" + "'", str27.equals("\\12"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String str14 = python2Target0.getTargetStringLiteralFromString("\\12");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        python2Target0.gen = codeGenerator15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"hi!\"" + "'", str12.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\"\\12\"" + "'", str14.equals("\"\\12\""));
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        boolean boolean24 = python2Target0.templatesExist();
        java.lang.String[] strArray25 = python2Target0.targetCharValueEscape;
        java.lang.Class<?> wildcardClass26 = strArray25.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\0" + "'", str12.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target12.loadTemplates();
        python2Target0.templates = sTGroup13;
        java.lang.String str16 = python2Target0.getImplicitRuleLabel("\"\\\"\\\\\\\"i\\\\\\\"\\\"\"");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"\"" + "'", str6.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"" + "'", str10.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "_\"\\\"\\\\\\\"i\\\\\\\"\\\"\"" + "'", str16.equals("_\"\\\"\\\\\\\"i\\\\\\\"\\\"\""));
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python2Target0.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.stringtemplate.v4.ST sT16 = null;
        python2Target0.genRecognizerHeaderFile(grammar15, sT16, "\"\\\\\\\"i\"");
        java.lang.String str19 = python2Target0.getLanguage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\0" + "'", str2.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target0.gen = codeGenerator6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4.equals("\"\"hi!\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.util.Set<java.lang.String> strSet13 = python2Target0.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        python2Target0.gen = codeGenerator14;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target0.getRuleFunctionContextStructName(ruleFunction16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"hi!\"" + "'", str12.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        boolean boolean5 = python2Target0.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python2Target0.genRecognizerHeaderFile(grammar6, sT7, "\"\\12\"");
        java.lang.String str10 = python2Target0.language;
        boolean boolean11 = python2Target0.templatesExist();
        java.lang.String str13 = python2Target0.getTargetStringLiteralFromString("\\64Context");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\0" + "'", str2.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"\\64Context\"" + "'", str13.equals("\"\\64Context\""));
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        java.lang.String str4 = python2Target0.getLanguage();
        java.lang.String str5 = python2Target0.getVersion();
        java.lang.String[] strArray6 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        python2Target0.language = "";
        java.lang.String str13 = python2Target0.getVersion();
        python2Target0.language = "\"\"\"\\12Context\"Context\"\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python2Target0.getCodeGenerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"\"" + "'", str6.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\"\"" + "'", str10.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4.5.2.1" + "'", str13.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator16);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        boolean boolean11 = python2Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "\"hi!\"", false);
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target();
        int int17 = python2Target16.getInlineTestSetWordSize();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        python2Target16.badWords = strSet22;
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target16.templates = sTGroup25;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        python2Target16.gen = codeGenerator27;
        java.util.Set<java.lang.String> strSet29 = python2Target16.getBadWords();
        python2Target0.badWords = strSet29;
        python2Target0.addBadWords();
        int int32 = python2Target0.getInlineTestSetWordSize();
        int int33 = python2Target0.getSerializedATNSegmentLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 64 + "'", int32 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        python2Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target7.loadTemplates();
        python2Target0.templates = sTGroup8;
        java.lang.String str11 = python2Target0.getTargetStringLiteralFromString("\\12Context");
        boolean boolean12 = python2Target0.wantsBaseVisitor();
        java.lang.String str14 = python2Target0.encodeIntAsCharEscape(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\0" + "'", str2.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"\\12Context\"" + "'", str11.equals("\"\\12Context\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "d" + "'", str14.equals("d"));
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.getCodeGenerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator3);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        python2Target0.language = "\\1";
        java.lang.String str13 = python2Target0.language;
        boolean boolean14 = python2Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "\"\\12Context\"", true);
        org.antlr.v4.tool.Rule rule19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target0.getRuleFunctionContextStructName(rule19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\\1" + "'", str13.equals("\\1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\"12Context\"" + "'", str18.equals("\"12Context\""));
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        java.lang.String str26 = python2Target0.getTargetStringLiteralFromString("\"i\"");
        boolean boolean27 = python2Target0.wantsBaseListener();
        org.antlr.v4.codegen.target.Python2Target python2Target28 = new org.antlr.v4.codegen.target.Python2Target();
        int int29 = python2Target28.getInlineTestSetWordSize();
        java.lang.String str32 = python2Target28.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str33 = python2Target28.getVersion();
        java.lang.String str34 = python2Target28.getLanguage();
        org.antlr.v4.codegen.target.Python2Target python2Target35 = new org.antlr.v4.codegen.target.Python2Target();
        int int36 = python2Target35.getInlineTestSetWordSize();
        java.lang.String str39 = python2Target35.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str40 = python2Target35.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target41 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str43 = python2Target41.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator44 = null;
        java.lang.String str47 = python2Target41.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator44, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator48 = null;
        java.lang.String str51 = python2Target41.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator48, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target53 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator52);
        org.stringtemplate.v4.STGroup sTGroup54 = python2Target53.loadTemplates();
        python2Target41.templates = sTGroup54;
        python2Target35.templates = sTGroup54;
        python2Target28.templates = sTGroup54;
        java.util.Set<java.lang.String> strSet58 = python2Target28.getBadWords();
        python2Target0.badWords = strSet58;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str61 = python2Target0.getImplicitTokenLabel("\"\"\"\"i\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\0" + "'", str12.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "\"\"i\"\"" + "'", str26.equals("\"\"i\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 64 + "'", int29 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "\"\"hi!\"\"" + "'", str32.equals("\"\"hi!\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "4.5.2.1" + "'", str33.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 64 + "'", int36 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "\"\"hi!\"\"" + "'", str39.equals("\"\"hi!\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "4.5.2.1" + "'", str40.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "\"hi!\"" + "'", str43.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "\"\"" + "'", str47.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "\"\"" + "'", str51.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet58);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        java.lang.String str25 = python2Target0.getLanguage();
        java.lang.String str26 = python2Target0.getVersion();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = python2Target0.getRuleFunctionContextStructName(ruleFunction27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\0" + "'", str12.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "4.5.2.1" + "'", str26.equals("4.5.2.1"));
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("\\\"i");
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.templates;
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4.5.2.1" + "'", str4.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"\\\\\\\"i\"" + "'", str6.equals("\"\\\\\\\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        python2Target0.language = "\\1";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target0.getElementName("\"\\\"0\\\"Context\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.gen;
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\"\\\"i\\\"\"");
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getLoopLabel(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "_\"i\"" + "'", str5.equals("_\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"\\\"\\\\\\\"i\\\\\\\"\\\"\"" + "'", str9.equals("\"\\\"\\\\\\\"i\\\\\\\"\\\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        java.lang.String str6 = python2Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\\\"\\\"\\\"hi!\\\"\\\"\\\"", false);
        java.lang.String str11 = python2Target0.language;
        boolean boolean12 = python2Target0.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4.equals("\"\"hi!\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\\\"\\\"\\\"hi!\\\"\\\"\\\"" + "'", str10.equals("\\\"\\\"\\\"hi!\\\"\\\"\\\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        int int4 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"\"hi!\"\"\"", false);
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target();
        int int9 = python2Target8.getInlineTestSetWordSize();
        java.lang.String str12 = python2Target8.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str13 = python2Target8.getLanguage();
        boolean boolean14 = python2Target8.wantsBaseVisitor();
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target();
        int int16 = python2Target15.getInlineTestSetWordSize();
        int int17 = python2Target15.getInlineTestSetWordSize();
        boolean boolean18 = python2Target15.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = python2Target15.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        java.lang.String str23 = python2Target15.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator20, "_\"i\"", false);
        java.lang.String[] strArray29 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray29;
        python2Target15.targetCharValueEscape = strArray29;
        python2Target8.targetCharValueEscape = strArray29;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray29;
        python2Target1.targetCharValueEscape = strArray29;
        org.antlr.v4.tool.Grammar grammar35 = null;
        org.stringtemplate.v4.ST sT36 = null;
        python2Target1.genRecognizerHeaderFile(grammar35, sT36, "\"#\"");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\\\"\\\"\\\"hi!\\\"\\\"\\\"" + "'", str7.equals("\\\"\\\"\\\"hi!\\\"\\\"\\\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\"hi!\"\"" + "'", str12.equals("\"\"hi!\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "\\\"i" + "'", str23.equals("\\\"i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray29);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        java.lang.String str4 = python2Target0.getLanguage();
        java.lang.String str5 = python2Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python2Target0.genRecognizerHeaderFile(grammar6, sT7, "\"\"\\12\"\"");
        java.lang.String[] strArray10 = python2Target0.targetCharValueEscape;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4.5.2.1" + "'", str5.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        boolean boolean11 = python2Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "\"hi!\"", false);
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target();
        int int17 = python2Target16.getInlineTestSetWordSize();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        python2Target16.badWords = strSet22;
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target16.templates = sTGroup25;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        python2Target16.gen = codeGenerator27;
        java.util.Set<java.lang.String> strSet29 = python2Target16.getBadWords();
        python2Target0.badWords = strSet29;
        boolean boolean31 = python2Target0.templatesExist();
        boolean boolean32 = python2Target0.templatesExist();
        java.lang.String str33 = python2Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar34 = null;
        org.stringtemplate.v4.ST sT35 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar34, sT35, "\"tset\\\"\\\\\\\"i\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "4.5.2.1" + "'", str33.equals("4.5.2.1"));
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet3 = python2Target1.badWords;
        org.antlr.v4.codegen.target.Python2Target python2Target4 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str6 = python2Target4.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target();
        int int8 = python2Target7.getInlineTestSetWordSize();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python2Target7.badWords = strSet13;
        python2Target4.badWords = strSet13;
        java.lang.String[] strArray17 = python2Target4.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray17;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray17;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray17;
        python2Target1.targetCharValueEscape = strArray17;
        java.lang.String str23 = python2Target1.getImplicitSetLabel("\"\"");
        java.util.Set<java.lang.String> strSet24 = python2Target1.getBadWords();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\\0" + "'", str6.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "_tset\"\"" + "'", str23.equals("_tset\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet24);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = python2Target0.getCodeGenerator();
        boolean boolean25 = python2Target0.supportsOverloadedMethods();
        python2Target0.language = "\"\"\"\\12Context\"\"\"";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"hi!\"" + "'", str2.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i" + "'", str8.equals("i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\\0" + "'", str12.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getLanguage();
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target();
        int int6 = python2Target5.getInlineTestSetWordSize();
        int int7 = python2Target5.getInlineTestSetWordSize();
        boolean boolean8 = python2Target5.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target5.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target5.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "_\"i\"", false);
        java.lang.String[] strArray19 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray19;
        python2Target5.targetCharValueEscape = strArray19;
        python2Target1.targetCharValueEscape = strArray19;
        java.lang.String str23 = python2Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup24 = python2Target1.loadTemplates();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Python2" + "'", str4.equals("Python2"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\\\"i" + "'", str13.equals("\\\"i"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "4.5.2.1" + "'", str23.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sTGroup24);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        python2Target0.addBadWords();
        java.lang.String[] strArray6 = python2Target0.targetCharValueEscape;
        java.lang.String str7 = python2Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target0.gen;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\0" + "'", str2.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "4.5.2.1" + "'", str7.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        python2Target0.genRecognizerHeaderFile(grammar5, sT6, "\\1");
        int int9 = python2Target0.getSerializedATNSegmentLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\0" + "'", str2.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        int int2 = python2Target1.getInlineTestSetWordSize();
        int int3 = python2Target1.getInlineTestSetWordSize();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.gen;
        java.util.Locale locale7 = null;
        java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator5, "\"\"i\"\"", locale7);
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target();
        int int10 = python2Target9.getInlineTestSetWordSize();
        java.lang.String str13 = python2Target9.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str14 = python2Target9.getVersion();
        java.lang.String str15 = python2Target9.getLanguage();
        java.util.Locale locale17 = null;
        java.lang.String str18 = pythonStringRenderer0.toString((java.lang.Object) str15, "\"\"hi!\"\"Context", locale17);
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target20 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator19);
        java.lang.String str22 = python2Target20.getAltLabelContextStructName("\"\"hi!\"\"");
        boolean boolean23 = python2Target20.templatesExist();
        boolean boolean24 = python2Target20.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = python2Target20.getCodeGenerator();
        java.util.Set<java.lang.String> strSet26 = python2Target20.badWords;
        python2Target20.language = "\"\"hi!\"\"Context";
        java.util.Locale locale30 = null;
        java.lang.String str31 = pythonStringRenderer0.toString((java.lang.Object) "\"\"hi!\"\"Context", "\"\\\"hi!\\\"\\\"Contex\"", locale30);
        java.util.Locale locale34 = null;
        java.lang.String str35 = pythonStringRenderer0.toString((java.lang.Object) "\"tset\\\"\\\\\\\"i\"", "_\"i\"", locale34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\"i\"\"" + "'", str8.equals("\"\"i\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"\"hi!\"\"" + "'", str13.equals("\"\"hi!\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "4.5.2.1" + "'", str14.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\"\"hi!\"\"Context" + "'", str18.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "\"\"hi!\"\"Context" + "'", str22.equals("\"\"hi!\"\"Context"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "\"\\\"hi!\\\"\\\"Contex\"" + "'", str31.equals("\"\\\"hi!\\\"\\\"Contex\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "_\"i\"" + "'", str35.equals("_\"i\""));
    }
}

