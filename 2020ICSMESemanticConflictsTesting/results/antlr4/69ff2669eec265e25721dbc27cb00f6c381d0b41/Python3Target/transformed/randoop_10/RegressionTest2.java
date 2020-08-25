import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\".5.2.\"\"", false);
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"4.5.2.1\"\"\"\"\"", true);
        java.util.Set<java.lang.String> strSet10 = python3Target0.getBadWords();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"\".5.2.\"\"" + "'", str6.equals("\"\".5.2.\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\"" + "'", str9.equals("\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        org.antlr.v4.codegen.target.Python3Target python3Target2 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup3 = null;
        python3Target2.templates = sTGroup3;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python3Target2.badWords = strSet9;
        python3Target0.badWords = strSet9;
        python3Target0.language = "\"\"i\"\"";
        java.lang.String str15 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        python3Target0.gen = codeGenerator16;
        org.stringtemplate.v4.STGroup sTGroup18 = null;
        python3Target0.templates = sTGroup18;
        org.antlr.v4.codegen.target.Python3Target python3Target20 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str21 = python3Target20.language;
        org.antlr.v4.codegen.target.Python3Target python3Target22 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup23 = null;
        python3Target22.templates = sTGroup23;
        java.lang.String[] strArray28 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        python3Target22.badWords = strSet29;
        python3Target20.badWords = strSet29;
        org.antlr.v4.tool.Grammar grammar33 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target34 = new org.antlr.v4.codegen.target.Python3Target();
        int int35 = python3Target34.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup36 = python3Target34.templates;
        org.antlr.v4.tool.Grammar grammar37 = null;
        int[] intArray38 = new int[] {};
        java.lang.String[] strArray39 = python3Target34.getTokenTypesAsTargetLabels(grammar37, intArray38);
        java.lang.String[] strArray40 = python3Target20.getTokenTypesAsTargetLabels(grammar33, intArray38);
        python3Target0.targetCharValueEscape = strArray40;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "4.5.2.1" + "'", str15.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 64 + "'", int35 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray40);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet9 = python3Target0.badWords;
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str11 = python3Target0.getVersion();
        java.lang.String[] strArray12 = new java.lang.String[] {};
        python3Target0.targetCharValueEscape = strArray12;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"\"i\"\"", true);
        java.lang.String[] strArray18 = python3Target0.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray18;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "4.5.2.1" + "'", str11.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\"\\\"i\\\"\"" + "'", str17.equals("\"\\\"i\\\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        boolean boolean9 = python3Target0.templatesExist();
        python3Target0.addBadWords();
        java.lang.String str12 = python3Target0.encodeIntAsCharEscape((int) ' ');
        boolean boolean13 = python3Target0.templatesExist();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\0" + "'", str8.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + " " + "'", str12.equals(" "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.util.Set<java.lang.String> strSet3 = null;
        python3Target0.badWords = strSet3;
        boolean boolean5 = python3Target0.wantsBaseListener();
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target0.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strSet6);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        int int8 = python3Target7.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target7.templates;
        org.antlr.v4.tool.Grammar grammar10 = null;
        int[] intArray11 = new int[] {};
        java.lang.String[] strArray12 = python3Target7.getTokenTypesAsTargetLabels(grammar10, intArray11);
        python3Target0.targetCharValueEscape = strArray12;
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target();
        int int15 = python3Target14.getInlineTestSetWordSize();
        java.lang.String str16 = python3Target14.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target14.getCodeGenerator();
        java.util.Set<java.lang.String> strSet18 = python3Target14.getBadWords();
        java.lang.String[] strArray19 = python3Target14.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray19;
        boolean boolean21 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python3Target0.gen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python3Target0.getAltLabelContextStructName("\"\"\".5.2.\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\"\"" + "'", str5.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator22);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.templates;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup7);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.util.Set<java.lang.String> strSet3 = null;
        python3Target0.badWords = strSet3;
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        int int6 = python3Target0.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target0.gen;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python3Target0.templates = sTGroup9;
        boolean boolean11 = python3Target0.wantsBaseVisitor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        python3Target0.language = "@";
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        int int8 = python3Target7.getInlineTestSetWordSize();
        boolean boolean9 = python3Target7.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target7.gen;
        boolean boolean11 = python3Target7.supportsOverloadedMethods();
        boolean boolean12 = python3Target7.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.stringtemplate.v4.ST sT14 = null;
        python3Target7.genRecognizerHeaderFile(grammar13, sT14, "\"\"\"\"\"\"");
        boolean boolean17 = python3Target7.templatesExist();
        boolean boolean18 = python3Target7.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet19 = python3Target7.getBadWords();
        python3Target0.badWords = strSet19;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray12 = new int[] {};
        java.lang.String[] strArray13 = python3Target8.getTokenTypesAsTargetLabels(grammar11, intArray12);
        java.lang.String[] strArray14 = python3Target0.getTokenTypesAsTargetLabels(grammar7, intArray12);
        boolean boolean15 = python3Target0.supportsOverloadedMethods();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\\\"hi!\\\"\"");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str1.equals("\"\\\"hi!\\\"\""));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        int int8 = python3Target0.getInlineTestSetWordSize();
        python3Target0.language = "\"\"\"\"\"\"";
        java.lang.String str11 = python3Target0.getVersion();
        java.lang.String str12 = python3Target0.language;
        boolean boolean13 = python3Target0.templatesExist();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2.equals("\"\"\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"\"" + "'", str7.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "4.5.2.1" + "'", str11.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\"\"\"\"\"" + "'", str12.equals("\"\"\"\"\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "hi!", true);
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        boolean boolean11 = python3Target0.templatesExist();
        java.lang.String str12 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        python3Target0.gen = codeGenerator13;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target0.getAltLabelContextStructName("\"\"\\\"i\\\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\"\"" + "'", str5.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"i\"" + "'", str9.equals("\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        int int7 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str11 = python3Target9.getTargetStringLiteralFromString("\"\"");
        int int12 = python3Target9.getInlineTestSetWordSize();
        boolean boolean13 = python3Target9.supportsOverloadedMethods();
        java.lang.String str15 = python3Target9.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.stringtemplate.v4.ST sT17 = null;
        python3Target9.genRecognizerHeaderFile(grammar16, sT17, "\"\"");
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target21 = new org.antlr.v4.codegen.target.Python3Target();
        int int22 = python3Target21.getInlineTestSetWordSize();
        java.lang.String str23 = python3Target21.language;
        java.lang.String str24 = python3Target21.getVersion();
        int int25 = python3Target21.getInlineTestSetWordSize();
        java.lang.String str26 = python3Target21.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = python3Target21.gen;
        org.antlr.v4.tool.Grammar grammar28 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target29 = new org.antlr.v4.codegen.target.Python3Target();
        int int30 = python3Target29.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup31 = python3Target29.templates;
        org.antlr.v4.tool.Grammar grammar32 = null;
        int[] intArray33 = new int[] {};
        java.lang.String[] strArray34 = python3Target29.getTokenTypesAsTargetLabels(grammar32, intArray33);
        java.lang.String[] strArray35 = python3Target21.getTokenTypesAsTargetLabels(grammar28, intArray33);
        java.lang.String str36 = python3Target21.getLanguage();
        java.lang.String str37 = python3Target21.getLanguage();
        java.lang.String str39 = python3Target21.getTargetStringLiteralFromString("\"i\"");
        org.antlr.v4.tool.Grammar grammar40 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target41 = new org.antlr.v4.codegen.target.Python3Target();
        int int42 = python3Target41.getInlineTestSetWordSize();
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "" };
        python3Target41.targetCharValueEscape = strArray45;
        java.util.Set<java.lang.String> strSet47 = python3Target41.badWords;
        org.stringtemplate.v4.STGroup sTGroup48 = python3Target41.templates;
        org.antlr.v4.tool.Grammar grammar49 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target50 = new org.antlr.v4.codegen.target.Python3Target();
        int int51 = python3Target50.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup52 = python3Target50.templates;
        org.antlr.v4.tool.Grammar grammar53 = null;
        int[] intArray54 = new int[] {};
        java.lang.String[] strArray55 = python3Target50.getTokenTypesAsTargetLabels(grammar53, intArray54);
        java.lang.String[] strArray56 = python3Target41.getTokenTypesAsTargetLabels(grammar49, intArray54);
        java.lang.String[] strArray57 = python3Target21.getTokenTypesAsTargetLabels(grammar40, intArray54);
        java.lang.String[] strArray58 = python3Target9.getTokenTypesAsTargetLabels(grammar20, intArray54);
        java.lang.String[] strArray59 = python3Target0.getTokenTypesAsTargetLabels(grammar8, intArray54);
        org.antlr.v4.codegen.target.Python3Target python3Target60 = new org.antlr.v4.codegen.target.Python3Target();
        int int61 = python3Target60.getInlineTestSetWordSize();
        java.lang.String str62 = python3Target60.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator63 = python3Target60.getCodeGenerator();
        java.util.Set<java.lang.String> strSet64 = python3Target60.getBadWords();
        python3Target0.badWords = strSet64;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"\"\"\"" + "'", str11.equals("\"\"\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\\12" + "'", str15.equals("\\12"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 64 + "'", int22 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "4.5.2.1" + "'", str24.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 64 + "'", int25 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 64 + "'", int30 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "\"\"i\"\"" + "'", str39.equals("\"\"i\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 64 + "'", int42 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 64 + "'", int51 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 64 + "'", int61 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet64);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        java.lang.String str4 = python3Target0.getVersion();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target0.genRecognizerHeaderFile(grammar6, sT7, "");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target0.gen;
        boolean boolean11 = python3Target0.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target0.gen;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4.5.2.1" + "'", str4.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator12);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        python3Target0.gen = codeGenerator1;
        java.lang.String str3 = python3Target0.getVersion();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        python3Target0.language = "@";
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str9 = python3Target7.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        int int12 = python3Target11.getInlineTestSetWordSize();
        java.lang.String str13 = python3Target11.language;
        java.lang.String str14 = python3Target11.getVersion();
        int int15 = python3Target11.getInlineTestSetWordSize();
        java.lang.String str16 = python3Target11.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target11.gen;
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target19 = new org.antlr.v4.codegen.target.Python3Target();
        int int20 = python3Target19.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup21 = python3Target19.templates;
        org.antlr.v4.tool.Grammar grammar22 = null;
        int[] intArray23 = new int[] {};
        java.lang.String[] strArray24 = python3Target19.getTokenTypesAsTargetLabels(grammar22, intArray23);
        java.lang.String[] strArray25 = python3Target11.getTokenTypesAsTargetLabels(grammar18, intArray23);
        java.lang.String[] strArray26 = python3Target7.getTokenTypesAsTargetLabels(grammar10, intArray23);
        java.lang.String[] strArray27 = python3Target0.getTokenTypesAsTargetLabels(grammar6, intArray23);
        org.stringtemplate.v4.STGroup sTGroup28 = null;
        python3Target0.templates = sTGroup28;
        org.antlr.v4.codegen.target.Python3Target python3Target30 = new org.antlr.v4.codegen.target.Python3Target();
        int int31 = python3Target30.getInlineTestSetWordSize();
        boolean boolean32 = python3Target30.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = python3Target30.gen;
        boolean boolean34 = python3Target30.wantsBaseVisitor();
        boolean boolean35 = python3Target30.supportsOverloadedMethods();
        java.lang.String str38 = python3Target30.getTargetStringLiteralFromString("\\0", false);
        boolean boolean39 = python3Target30.templatesExist();
        python3Target30.addBadWords();
        org.antlr.v4.tool.Grammar grammar41 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target42 = new org.antlr.v4.codegen.target.Python3Target();
        int int43 = python3Target42.getInlineTestSetWordSize();
        java.lang.String str44 = python3Target42.language;
        java.lang.String str45 = python3Target42.getVersion();
        int int46 = python3Target42.getInlineTestSetWordSize();
        java.lang.String str47 = python3Target42.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator48 = python3Target42.gen;
        org.antlr.v4.tool.Grammar grammar49 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target50 = new org.antlr.v4.codegen.target.Python3Target();
        int int51 = python3Target50.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup52 = python3Target50.templates;
        org.antlr.v4.tool.Grammar grammar53 = null;
        int[] intArray54 = new int[] {};
        java.lang.String[] strArray55 = python3Target50.getTokenTypesAsTargetLabels(grammar53, intArray54);
        java.lang.String[] strArray56 = python3Target42.getTokenTypesAsTargetLabels(grammar49, intArray54);
        java.lang.String[] strArray57 = python3Target30.getTokenTypesAsTargetLabels(grammar41, intArray54);
        python3Target0.targetCharValueEscape = strArray57;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction59 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str60 = python3Target0.getRuleFunctionContextStructName(ruleFunction59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "d" + "'", str9.equals("d"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "4.5.2.1" + "'", str14.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 64 + "'", int31 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "\\0" + "'", str38.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 64 + "'", int43 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "4.5.2.1" + "'", str45.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 64 + "'", int46 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 64 + "'", int51 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray57);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        python3Target0.gen = codeGenerator2;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target0.getAltLabelContextStructName("\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python3Target0.genRecognizerHeaderFile(grammar11, sT12, "\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python3Target0.gen;
        java.lang.String[] strArray16 = python3Target0.targetCharValueEscape;
        java.lang.String str17 = python3Target0.getVersion();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"\"" + "'", str6.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "4.5.2.1" + "'", str17.equals("4.5.2.1"));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        python3Target0.language = "\\0";
        boolean boolean10 = python3Target0.wantsBaseVisitor();
        java.lang.String str11 = python3Target0.getLanguage();
        org.antlr.v4.tool.Grammar grammar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target0.getTokenTypeAsTargetLabel(grammar12, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\\0" + "'", str11.equals("\\0"));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"\"hi!\"\"", true);
        python3Target0.addBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getImplicitSetLabel("\"\"\\1\"\"");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str9.equals("\"\\\"hi!\\\"\""));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target0.genRecognizerHeaderFile(grammar6, sT7, "\"\"\"\"\"\"");
        boolean boolean10 = python3Target0.templatesExist();
        boolean boolean11 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet12 = python3Target0.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target0.gen;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator13);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        python3Target0.addBadWords();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("4.5.2.1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\"4.5.2.1\"" + "'", str5.equals("\"4.5.2.1\""));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target0.gen;
        java.lang.String str8 = python3Target0.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getImplicitRuleLabel("\"\"\\\"hi!\\\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"\"" + "'", str6.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        python3Target0.gen = codeGenerator9;
        python3Target0.language = "\"\\1\"";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8.equals("\"4.5.2.1\""));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (byte) 10);
        java.util.Set<java.lang.String> strSet5 = python3Target0.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        python3Target0.language = "\"\"\"i\"\"\"";
        java.lang.String str9 = python3Target0.getLanguage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2.equals("\"\"\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\12" + "'", str4.equals("\\12"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"\"\"i\"\"\"" + "'", str9.equals("\"\"\"i\"\"\""));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        python3Target0.language = "\\0";
        boolean boolean10 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        int int12 = python3Target11.getInlineTestSetWordSize();
        java.lang.String str13 = python3Target11.language;
        java.lang.String str14 = python3Target11.getVersion();
        int int15 = python3Target11.getInlineTestSetWordSize();
        java.lang.String str16 = python3Target11.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target11.gen;
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target19 = new org.antlr.v4.codegen.target.Python3Target();
        int int20 = python3Target19.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup21 = python3Target19.templates;
        org.antlr.v4.tool.Grammar grammar22 = null;
        int[] intArray23 = new int[] {};
        java.lang.String[] strArray24 = python3Target19.getTokenTypesAsTargetLabels(grammar22, intArray23);
        java.lang.String[] strArray25 = python3Target11.getTokenTypesAsTargetLabels(grammar18, intArray23);
        java.lang.String str26 = python3Target11.getLanguage();
        java.lang.String str27 = python3Target11.getLanguage();
        java.lang.String str29 = python3Target11.getTargetStringLiteralFromString("\"i\"");
        java.util.Set<java.lang.String> strSet30 = python3Target11.badWords;
        python3Target0.badWords = strSet30;
        boolean boolean32 = python3Target0.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = python3Target0.getLoopCounter(grammarAST33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "4.5.2.1" + "'", str14.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "\"\"i\"\"" + "'", str29.equals("\"\"i\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\".5.2.\"\"", false);
        int int7 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python3Target0.gen = codeGenerator8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"\".5.2.\"\"" + "'", str6.equals("\"\".5.2.\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        org.stringtemplate.v4.STGroup sTGroup6 = null;
        python3Target0.templates = sTGroup6;
        java.lang.String str8 = python3Target0.getVersion();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4.5.2.1" + "'", str8.equals("4.5.2.1"));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup5 = null;
        python3Target0.templates = sTGroup5;
        boolean boolean7 = python3Target0.templatesExist();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.target.Python3Target python3Target2 = new org.antlr.v4.codegen.target.Python3Target();
        int int3 = python3Target2.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target2.language;
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target2.templates;
        java.lang.String str7 = python3Target2.getTargetStringLiteralFromString("\"hi!\"");
        java.lang.String str9 = python3Target2.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target();
        int int11 = python3Target10.getInlineTestSetWordSize();
        java.lang.String str12 = python3Target10.language;
        java.lang.String str13 = python3Target10.getLanguage();
        java.lang.String str15 = python3Target10.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        java.lang.String str19 = python3Target10.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator16, "hi!", true);
        int int20 = python3Target10.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target22 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str23 = python3Target22.language;
        org.antlr.v4.codegen.target.Python3Target python3Target24 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python3Target24.templates = sTGroup25;
        java.lang.String[] strArray30 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        python3Target24.badWords = strSet31;
        python3Target22.badWords = strSet31;
        org.antlr.v4.tool.Grammar grammar35 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target36 = new org.antlr.v4.codegen.target.Python3Target();
        int int37 = python3Target36.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup38 = python3Target36.templates;
        org.antlr.v4.tool.Grammar grammar39 = null;
        int[] intArray40 = new int[] {};
        java.lang.String[] strArray41 = python3Target36.getTokenTypesAsTargetLabels(grammar39, intArray40);
        java.lang.String[] strArray42 = python3Target22.getTokenTypesAsTargetLabels(grammar35, intArray40);
        java.lang.String[] strArray43 = python3Target10.getTokenTypesAsTargetLabels(grammar21, intArray40);
        java.util.Set<java.lang.String> strSet44 = python3Target10.badWords;
        python3Target2.badWords = strSet44;
        python3Target1.badWords = strSet44;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = python3Target1.getImplicitTokenLabel("\"\"\\1\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"\"hi!\"\"" + "'", str7.equals("\"\"hi!\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"\"" + "'", str9.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"\"" + "'", str15.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\"i\"" + "'", str19.equals("\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 29 + "'", int20 == 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 64 + "'", int37 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet44);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        python3Target0.addBadWords();
        java.lang.String str6 = python3Target0.language;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        python3Target0.language = "\\0";
        boolean boolean10 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target0.getCodeGenerator();
        int int12 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target();
        int int15 = python3Target14.getInlineTestSetWordSize();
        java.lang.String str16 = python3Target14.language;
        org.stringtemplate.v4.STGroup sTGroup17 = python3Target14.templates;
        java.lang.String str19 = python3Target14.getTargetStringLiteralFromString("\"hi!\"");
        java.lang.String str21 = python3Target14.getTargetStringLiteralFromString("");
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target23 = new org.antlr.v4.codegen.target.Python3Target();
        int int24 = python3Target23.getInlineTestSetWordSize();
        boolean boolean25 = python3Target23.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = python3Target23.gen;
        boolean boolean27 = python3Target23.wantsBaseVisitor();
        boolean boolean28 = python3Target23.supportsOverloadedMethods();
        java.lang.String str31 = python3Target23.getTargetStringLiteralFromString("\\0", false);
        boolean boolean32 = python3Target23.templatesExist();
        python3Target23.addBadWords();
        org.antlr.v4.tool.Grammar grammar34 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target35 = new org.antlr.v4.codegen.target.Python3Target();
        int int36 = python3Target35.getInlineTestSetWordSize();
        java.lang.String str37 = python3Target35.language;
        java.lang.String str38 = python3Target35.getVersion();
        int int39 = python3Target35.getInlineTestSetWordSize();
        java.lang.String str40 = python3Target35.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = python3Target35.gen;
        org.antlr.v4.tool.Grammar grammar42 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target43 = new org.antlr.v4.codegen.target.Python3Target();
        int int44 = python3Target43.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup45 = python3Target43.templates;
        org.antlr.v4.tool.Grammar grammar46 = null;
        int[] intArray47 = new int[] {};
        java.lang.String[] strArray48 = python3Target43.getTokenTypesAsTargetLabels(grammar46, intArray47);
        java.lang.String[] strArray49 = python3Target35.getTokenTypesAsTargetLabels(grammar42, intArray47);
        java.lang.String[] strArray50 = python3Target23.getTokenTypesAsTargetLabels(grammar34, intArray47);
        java.lang.String[] strArray51 = python3Target14.getTokenTypesAsTargetLabels(grammar22, intArray47);
        java.lang.String[] strArray52 = python3Target0.getTokenTypesAsTargetLabels(grammar13, intArray47);
        java.util.Set<java.lang.String> strSet53 = python3Target0.badWords;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 29 + "'", int12 == 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\"\"hi!\"\"" + "'", str19.equals("\"\"hi!\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\"\"" + "'", str21.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 64 + "'", int24 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "\\0" + "'", str31.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 64 + "'", int36 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "4.5.2.1" + "'", str38.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 64 + "'", int39 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 64 + "'", int44 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet53);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        int int8 = python3Target7.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target7.templates;
        org.antlr.v4.tool.Grammar grammar10 = null;
        int[] intArray11 = new int[] {};
        java.lang.String[] strArray12 = python3Target7.getTokenTypesAsTargetLabels(grammar10, intArray11);
        python3Target0.targetCharValueEscape = strArray12;
        org.stringtemplate.v4.STGroup sTGroup14 = null;
        python3Target0.templates = sTGroup14;
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.stringtemplate.v4.ST sT17 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar16, sT17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\"\"" + "'", str5.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target0.genRecognizerHeaderFile(grammar4, sT5, "\"\"\"\"");
        boolean boolean8 = python3Target0.wantsBaseListener();
        python3Target0.language = "hi!";
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        int int12 = python3Target11.getInlineTestSetWordSize();
        java.lang.String str13 = python3Target11.language;
        java.lang.String str14 = python3Target11.getVersion();
        int int15 = python3Target11.getInlineTestSetWordSize();
        java.lang.String str16 = python3Target11.getLanguage();
        java.lang.String str19 = python3Target11.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean20 = python3Target11.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet21 = python3Target11.badWords;
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.stringtemplate.v4.ST sT23 = null;
        python3Target11.genRecognizerHeaderFile(grammar22, sT23, "\"4.5.2.1\"");
        java.util.Set<java.lang.String> strSet26 = python3Target11.getBadWords();
        python3Target0.badWords = strSet26;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "4.5.2.1" + "'", str14.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\"4.5.2.1\"" + "'", str19.equals("\"4.5.2.1\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        boolean boolean6 = python3Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        python3Target0.language = "\"\"\\\"hi!\\\"\"\"";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromString("hi!", true);
        int int13 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str14 = python3Target0.language;
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"hi!\"" + "'", str12.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("\"hi!\"");
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target8.language;
        java.lang.String str11 = python3Target8.getLanguage();
        java.lang.String str13 = python3Target8.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target8.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "hi!", true);
        int int18 = python3Target8.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target20 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str21 = python3Target20.language;
        org.antlr.v4.codegen.target.Python3Target python3Target22 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup23 = null;
        python3Target22.templates = sTGroup23;
        java.lang.String[] strArray28 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        python3Target22.badWords = strSet29;
        python3Target20.badWords = strSet29;
        org.antlr.v4.tool.Grammar grammar33 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target34 = new org.antlr.v4.codegen.target.Python3Target();
        int int35 = python3Target34.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup36 = python3Target34.templates;
        org.antlr.v4.tool.Grammar grammar37 = null;
        int[] intArray38 = new int[] {};
        java.lang.String[] strArray39 = python3Target34.getTokenTypesAsTargetLabels(grammar37, intArray38);
        java.lang.String[] strArray40 = python3Target20.getTokenTypesAsTargetLabels(grammar33, intArray38);
        java.lang.String[] strArray41 = python3Target8.getTokenTypesAsTargetLabels(grammar19, intArray38);
        java.util.Set<java.lang.String> strSet42 = python3Target8.badWords;
        python3Target0.badWords = strSet42;
        java.util.Set<java.lang.String> strSet44 = null;
        python3Target0.badWords = strSet44;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\"\"hi!\"\"" + "'", str5.equals("\"\"hi!\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"\"" + "'", str7.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\"\"" + "'", str13.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\"i\"" + "'", str17.equals("\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 29 + "'", int18 == 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 64 + "'", int35 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet42);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        org.stringtemplate.v4.STGroup sTGroup4 = null;
        python3Target0.templates = sTGroup4;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "d", false);
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target0.getLoopLabel(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"\"\"\"" + "'", str12.equals("\"\"\"\""));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        java.lang.String str6 = python3Target0.language;
        java.lang.String str7 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python3Target0.gen = codeGenerator8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "4.5.2.1" + "'", str7.equals("4.5.2.1"));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar7, sT8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromString("hi!", true);
        int int13 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str14 = python3Target0.language;
        boolean boolean15 = python3Target0.templatesExist();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\"hi!\"" + "'", str12.equals("\"hi!\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        python3Target0.addBadWords();
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar7, sT8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        int int8 = python3Target7.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target7.templates;
        org.antlr.v4.tool.Grammar grammar10 = null;
        int[] intArray11 = new int[] {};
        java.lang.String[] strArray12 = python3Target7.getTokenTypesAsTargetLabels(grammar10, intArray11);
        python3Target0.targetCharValueEscape = strArray12;
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target();
        int int15 = python3Target14.getInlineTestSetWordSize();
        java.lang.String str16 = python3Target14.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target14.getCodeGenerator();
        java.util.Set<java.lang.String> strSet18 = python3Target14.getBadWords();
        java.lang.String[] strArray19 = python3Target14.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray19;
        java.lang.String str21 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python3Target0.getCodeGenerator();
        java.lang.String str25 = python3Target0.getTargetStringLiteralFromString("\\\"hi!\\\"", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python3Target0.getLoopLabel(grammarAST26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\"\"" + "'", str5.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "4.5.2.1" + "'", str21.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str25.equals("\"\\\"hi!\\\"\""));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        int int8 = python3Target7.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target7.templates;
        org.antlr.v4.tool.Grammar grammar10 = null;
        int[] intArray11 = new int[] {};
        java.lang.String[] strArray12 = python3Target7.getTokenTypesAsTargetLabels(grammar10, intArray11);
        python3Target0.targetCharValueEscape = strArray12;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"\"", false);
        boolean boolean18 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet19 = python3Target0.getBadWords();
        java.lang.String str20 = python3Target0.language;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python3Target0.getRuleFunctionContextStructName(ruleFunction21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\"\"" + "'", str5.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target8.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target8.getCodeGenerator();
        java.util.Set<java.lang.String> strSet12 = python3Target8.getBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target13 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        python3Target13.badWords = strSet16;
        python3Target8.badWords = strSet16;
        python3Target0.badWords = strSet16;
        java.lang.String str23 = python3Target0.getTargetStringLiteralFromString("\".5.2.\"", true);
        java.lang.String str25 = python3Target0.getTargetStringLiteralFromString("\".5.2.\"");
        java.lang.String str27 = python3Target0.getTargetStringLiteralFromString("\"\\\"\\\"\"");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "\"\".5.2.\"\"" + "'", str23.equals("\"\".5.2.\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "\"\".5.2.\"\"" + "'", str25.equals("\"\".5.2.\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\"\"\\\"\\\"\"\"" + "'", str27.equals("\"\"\\\"\\\"\"\""));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray12 = new int[] {};
        java.lang.String[] strArray13 = python3Target8.getTokenTypesAsTargetLabels(grammar11, intArray12);
        java.lang.String[] strArray14 = python3Target0.getTokenTypesAsTargetLabels(grammar7, intArray12);
        java.lang.String str16 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target0.getListLabel("\\0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "d" + "'", str16.equals("d"));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        python3Target0.language = "\\0";
        python3Target0.addBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target0.getImplicitTokenLabel("\\\"hi!\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.util.Set<java.lang.String> strSet3 = null;
        python3Target0.badWords = strSet3;
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\12", true);
        int int9 = python3Target0.getInlineTestSetWordSize();
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\"\\12\"" + "'", str8.equals("\"\\12\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        java.lang.String[] strArray2 = python3Target0.targetCharValueEscape;
        boolean boolean3 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        boolean boolean5 = python3Target0.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target0.genRecognizerHeaderFile(grammar6, sT7, "\"4.5.2.1\"");
        boolean boolean10 = python3Target0.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target0.templates;
        java.util.Set<java.lang.String> strSet12 = python3Target0.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target0.gen;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator13);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        int int8 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\\12", false);
        org.antlr.v4.tool.Rule rule13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target0.getRuleFunctionContextStructName(rule13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2.equals("\"\"\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\0" + "'", str5.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\"\"" + "'", str7.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1" + "'", str12.equals("1"));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\"1\"\"");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\"\"1\"\"" + "'", str1.equals("\"\"1\"\""));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "", false);
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.templates;
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getElementName("\"\"\\\"\\\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        java.util.Set<java.lang.String> strSet4 = python3Target0.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup5 = null;
        python3Target0.templates = sTGroup5;
        java.util.Set<java.lang.String> strSet7 = python3Target0.badWords;
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target();
        int int10 = python3Target9.getInlineTestSetWordSize();
        java.lang.String str11 = python3Target9.language;
        java.lang.String str12 = python3Target9.getVersion();
        int int13 = python3Target9.getInlineTestSetWordSize();
        java.lang.String str14 = python3Target9.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python3Target9.gen;
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target17 = new org.antlr.v4.codegen.target.Python3Target();
        int int18 = python3Target17.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup19 = python3Target17.templates;
        org.antlr.v4.tool.Grammar grammar20 = null;
        int[] intArray21 = new int[] {};
        java.lang.String[] strArray22 = python3Target17.getTokenTypesAsTargetLabels(grammar20, intArray21);
        java.lang.String[] strArray23 = python3Target9.getTokenTypesAsTargetLabels(grammar16, intArray21);
        java.lang.String str24 = python3Target9.getLanguage();
        java.lang.String str25 = python3Target9.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        python3Target9.gen = codeGenerator26;
        org.antlr.v4.tool.Grammar grammar28 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target29 = new org.antlr.v4.codegen.target.Python3Target();
        int int30 = python3Target29.getInlineTestSetWordSize();
        java.lang.String str31 = python3Target29.language;
        java.lang.String str32 = python3Target29.getVersion();
        int int33 = python3Target29.getInlineTestSetWordSize();
        java.lang.String str34 = python3Target29.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = python3Target29.gen;
        org.antlr.v4.tool.Grammar grammar36 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target37 = new org.antlr.v4.codegen.target.Python3Target();
        int int38 = python3Target37.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup39 = python3Target37.templates;
        org.antlr.v4.tool.Grammar grammar40 = null;
        int[] intArray41 = new int[] {};
        java.lang.String[] strArray42 = python3Target37.getTokenTypesAsTargetLabels(grammar40, intArray41);
        java.lang.String[] strArray43 = python3Target29.getTokenTypesAsTargetLabels(grammar36, intArray41);
        java.lang.String str44 = python3Target29.getLanguage();
        java.lang.String str45 = python3Target29.getLanguage();
        java.lang.String str47 = python3Target29.getTargetStringLiteralFromString("\"i\"");
        org.antlr.v4.tool.Grammar grammar48 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target49 = new org.antlr.v4.codegen.target.Python3Target();
        int int50 = python3Target49.getInlineTestSetWordSize();
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "" };
        python3Target49.targetCharValueEscape = strArray53;
        java.util.Set<java.lang.String> strSet55 = python3Target49.badWords;
        org.stringtemplate.v4.STGroup sTGroup56 = python3Target49.templates;
        org.antlr.v4.tool.Grammar grammar57 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target58 = new org.antlr.v4.codegen.target.Python3Target();
        int int59 = python3Target58.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup60 = python3Target58.templates;
        org.antlr.v4.tool.Grammar grammar61 = null;
        int[] intArray62 = new int[] {};
        java.lang.String[] strArray63 = python3Target58.getTokenTypesAsTargetLabels(grammar61, intArray62);
        java.lang.String[] strArray64 = python3Target49.getTokenTypesAsTargetLabels(grammar57, intArray62);
        java.lang.String[] strArray65 = python3Target29.getTokenTypesAsTargetLabels(grammar48, intArray62);
        java.lang.String[] strArray66 = python3Target9.getTokenTypesAsTargetLabels(grammar28, intArray62);
        java.lang.String[] strArray67 = python3Target0.getTokenTypesAsTargetLabels(grammar8, intArray62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "4.5.2.1" + "'", str12.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 64 + "'", int30 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "4.5.2.1" + "'", str32.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 64 + "'", int33 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 64 + "'", int38 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "\"\"i\"\"" + "'", str47.equals("\"\"i\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 64 + "'", int50 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 64 + "'", int59 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray67);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        python3Target0.addBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean12 = python3Target11.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        python3Target11.gen = codeGenerator13;
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python3Target11.gen;
        java.util.Set<java.lang.String> strSet16 = python3Target11.badWords;
        org.antlr.v4.codegen.target.Python3Target python3Target17 = new org.antlr.v4.codegen.target.Python3Target();
        int int18 = python3Target17.getInlineTestSetWordSize();
        java.lang.String str19 = python3Target17.language;
        java.lang.String str20 = python3Target17.getVersion();
        int int21 = python3Target17.getInlineTestSetWordSize();
        java.lang.String str22 = python3Target17.getLanguage();
        java.lang.String str25 = python3Target17.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean26 = python3Target17.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet27 = python3Target17.badWords;
        org.antlr.v4.tool.Grammar grammar28 = null;
        org.stringtemplate.v4.ST sT29 = null;
        python3Target17.genRecognizerHeaderFile(grammar28, sT29, "\"4.5.2.1\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        java.lang.String str35 = python3Target17.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator32, "i", true);
        org.antlr.v4.codegen.target.Python3Target python3Target36 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup37 = null;
        python3Target36.templates = sTGroup37;
        java.lang.String[] strArray42 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        python3Target36.badWords = strSet43;
        python3Target17.badWords = strSet43;
        python3Target11.badWords = strSet43;
        python3Target0.badWords = strSet43;
        org.antlr.v4.codegen.CodeGenerator codeGenerator49 = null;
        python3Target0.gen = codeGenerator49;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "4.5.2.1" + "'", str20.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "\"4.5.2.1\"" + "'", str25.equals("\"4.5.2.1\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "\"\"" + "'", str35.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("hi!", false);
        python3Target0.language = "\"\"i\"\"";
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getLoopLabel(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python3Target0.genRecognizerHeaderFile(grammar11, sT12, "\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python3Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        python3Target0.gen = codeGenerator16;
        java.lang.String str19 = python3Target0.encodeIntAsCharEscape(1);
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target21 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str23 = python3Target21.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.Grammar grammar24 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target25 = new org.antlr.v4.codegen.target.Python3Target();
        int int26 = python3Target25.getInlineTestSetWordSize();
        java.lang.String str27 = python3Target25.language;
        java.lang.String str28 = python3Target25.getVersion();
        int int29 = python3Target25.getInlineTestSetWordSize();
        java.lang.String str30 = python3Target25.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = python3Target25.gen;
        org.antlr.v4.tool.Grammar grammar32 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target33 = new org.antlr.v4.codegen.target.Python3Target();
        int int34 = python3Target33.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup35 = python3Target33.templates;
        org.antlr.v4.tool.Grammar grammar36 = null;
        int[] intArray37 = new int[] {};
        java.lang.String[] strArray38 = python3Target33.getTokenTypesAsTargetLabels(grammar36, intArray37);
        java.lang.String[] strArray39 = python3Target25.getTokenTypesAsTargetLabels(grammar32, intArray37);
        java.lang.String[] strArray40 = python3Target21.getTokenTypesAsTargetLabels(grammar24, intArray37);
        java.lang.String[] strArray41 = python3Target0.getTokenTypesAsTargetLabels(grammar20, intArray37);
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray41;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"\"" + "'", str6.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\\1" + "'", str19.equals("\\1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "d" + "'", str23.equals("d"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 64 + "'", int26 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "4.5.2.1" + "'", str28.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 64 + "'", int29 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 64 + "'", int34 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray41);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "hi!", true);
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        boolean boolean11 = python3Target0.templatesExist();
        java.lang.String str12 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        python3Target0.gen = codeGenerator13;
        java.lang.Class<?> wildcardClass15 = python3Target0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\"\"" + "'", str5.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"i\"" + "'", str9.equals("\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        int int6 = python3Target0.getInlineTestSetWordSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        int int4 = python3Target3.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target3.language;
        java.lang.String str6 = python3Target3.getVersion();
        int int7 = python3Target3.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target3.getLanguage();
        java.lang.String str11 = python3Target3.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean12 = python3Target3.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet13 = python3Target3.badWords;
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.stringtemplate.v4.ST sT15 = null;
        python3Target3.genRecognizerHeaderFile(grammar14, sT15, "\"4.5.2.1\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        java.lang.String str21 = python3Target3.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator18, "i", true);
        org.antlr.v4.codegen.target.Python3Target python3Target22 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup23 = null;
        python3Target22.templates = sTGroup23;
        java.lang.String[] strArray28 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        python3Target22.badWords = strSet29;
        python3Target3.badWords = strSet29;
        python3Target0.badWords = strSet29;
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = python3Target0.gen;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"4.5.2.1\"" + "'", str11.equals("\"4.5.2.1\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\"\"" + "'", str21.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator34);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup6 = null;
        python3Target0.templates = sTGroup6;
        boolean boolean8 = python3Target0.supportsOverloadedMethods();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target8.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target8.getCodeGenerator();
        java.util.Set<java.lang.String> strSet12 = python3Target8.getBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target13 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        python3Target13.badWords = strSet16;
        python3Target8.badWords = strSet16;
        python3Target0.badWords = strSet16;
        boolean boolean21 = python3Target0.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet22 = python3Target0.badWords;
        python3Target0.language = "\"i\"";
        boolean boolean25 = python3Target0.templatesExist();
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.stringtemplate.v4.ST sT27 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar26, sT27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4.5.2.1" + "'", str3.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "\"\"");
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        int int12 = python3Target11.getInlineTestSetWordSize();
        boolean boolean13 = python3Target11.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target11.gen;
        boolean boolean15 = python3Target11.wantsBaseVisitor();
        java.lang.String str16 = python3Target11.language;
        java.lang.String str19 = python3Target11.getTargetStringLiteralFromString("\\0", false);
        int int20 = python3Target11.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet21 = python3Target11.getBadWords();
        python3Target0.badWords = strSet21;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        python3Target0.gen = codeGenerator23;
        org.antlr.v4.tool.ast.GrammarAST grammarAST25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2.equals("\"\"\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\\12" + "'", str6.equals("\\12"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\\0" + "'", str19.equals("\\0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        java.util.Set<java.lang.String> strSet7 = python3Target0.badWords;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        int int12 = python3Target11.getInlineTestSetWordSize();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        python3Target11.targetCharValueEscape = strArray15;
        python3Target8.targetCharValueEscape = strArray15;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray15;
        python3Target0.targetCharValueEscape = strArray15;
        org.antlr.v4.codegen.target.Python3Target python3Target20 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str22 = python3Target20.getTargetStringLiteralFromString("\"\"");
        java.lang.String[] strArray23 = python3Target20.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray23;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\"\"" + "'", str5.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "4.5.2.1" + "'", str6.equals("4.5.2.1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "\"\"\"\"" + "'", str22.equals("\"\"\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape((int) (short) 100);
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.templates;
        java.lang.String str11 = python3Target0.encodeIntAsCharEscape(29);
        boolean boolean12 = python3Target0.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target0.getImplicitTokenLabel("\"\"\"4.5.2.1\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"\"" + "'", str6.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "d" + "'", str8.equals("d"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\\35" + "'", str11.equals("\\35"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "hi!", true);
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str11 = python3Target0.getLanguage();
        python3Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target0.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\"\"" + "'", str5.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"i\"" + "'", str9.equals("\"i\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator13);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python3Target0.genRecognizerHeaderFile(grammar11, sT12, "\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python3Target0.gen;
        java.lang.String str17 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"4.5.2.1\"\"\"\"");
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target0.templates;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"\"" + "'", str6.equals("\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(codeGenerator15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\"\"\"\"\"4.5.2.1\"\"\"\"\"" + "'", str17.equals("\"\"\"\"\"4.5.2.1\"\"\"\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sTGroup18);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        java.util.Set<java.lang.String> strSet10 = python3Target0.badWords;
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getLoopCounter(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\"i\"\"");
        python3Target0.language = "\"\\\"\\\"4.5.2.1\\\"\\\"\"";
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar9, sT10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2.equals("\"\"\"\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"\"\"i\"\"\"" + "'", str6.equals("\"\"\"i\"\"\""));
    }
}

