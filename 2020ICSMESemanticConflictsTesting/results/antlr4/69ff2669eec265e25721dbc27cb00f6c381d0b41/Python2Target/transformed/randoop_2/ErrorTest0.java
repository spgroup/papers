import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = python2Target0.getElementName("");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = python2Target0.getElementListName("\"hi!\"");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup1 = python2Target0.loadTemplates();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python2Target0.getImplicitTokenLabel("");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = python2Target0.getImplicitTokenLabel("\"\"hi!\"\"");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python2Target0.getAltLabelContextStructName("\"i\"");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target0.getTemplates();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python2Target0.getListLabel("\"i\"");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target0.loadTemplates();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = python2Target0.getListLabel("\"i\"");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.language = "";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getElementName("_\"i\"");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python2Target0.getListLabel("\\1");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = python2Target0.getListLabel("i");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target0.loadTemplates();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target0.loadTemplates();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python2Target0.getElementListName("\\0");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python2Target0.getElementName("hi!");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        int int9 = python2Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python2Target0.getListLabel("\"\\\\\\\"i\"");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        java.lang.String str4 = python2Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getElementListName("\\\"i");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python2Target0.getElementListName("\"_\"i\"\"");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        java.lang.String str4 = python2Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getListLabel("\"i\"");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python2Target0.getListLabel("\\\"i");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        int int4 = python2Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getImplicitSetLabel("\"\"hi!\"\"Context");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python2Target0.getListLabel("");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python2Target0.getListLabel("\"\"hi!\"\"Context");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target0.getTemplates();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python2Target0.getListLabel("\"\"");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getSerializedATNSegmentLimit();
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getElementListName("");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean7 = python2Target0.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python2Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python2Target0.getElementListName(" ");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python2Target0.getImplicitTokenLabel("");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str9 = python2Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python2Target0.getImplicitRuleLabel("\"_\"i\"\"");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        java.lang.String str4 = python2Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getElementName("\"_\"i\"\"");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        java.lang.String str4 = python2Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target0.loadTemplates();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromString("_\"i\"", true);
        java.lang.String str9 = python2Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python2Target0.getListLabel("\"i\"");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromString("_\"i\"", true);
        java.lang.String str9 = python2Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python2Target0.getListLabel("");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        java.lang.String[] strArray12 = new java.lang.String[] { "\\0", "\\1", "\"hi!\"", "\\0", "i", "\"i\"", "\"\"hi!\"\"", "\"hi!\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python2Target0.badWords = strSet13;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = python2Target0.getImplicitSetLabel("");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target0.gen;
        java.lang.String str6 = python2Target0.getLanguage();
        boolean boolean7 = python2Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python2Target0.getElementName("");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        boolean boolean4 = python2Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getImplicitTokenLabel("\"hi!\"");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        int int9 = python2Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python2Target0.getElementListName("\"\\\"i\"");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target0.loadTemplates();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target0.getTemplates();
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        java.lang.String str4 = python2Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getAltLabelContextStructName("\" \"");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        java.lang.String str4 = python2Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getElementListName("\" \"");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target0.gen;
        java.lang.String str6 = python2Target0.getLanguage();
        boolean boolean7 = python2Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target0.loadTemplates();
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        boolean boolean4 = python2Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getImplicitSetLabel("\\\"i");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        python2Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python2Target0.getImplicitSetLabel("\"\\12Context\"");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python2Target0.getElementListName("\\\"i");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        python2Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python2Target0.getElementName("4.5.2.1");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python2Target0.getElementListName("\" \"");
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.language = "";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target0.loadTemplates();
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        java.lang.String str4 = python2Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target0.loadTemplates();
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = python2Target0.getElementName("\\\"i\\\"");
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        java.lang.String str4 = python2Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getElementListName("\"_\"i\"\"");
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getImplicitRuleLabel("");
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup3 = python2Target0.getTemplates();
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getListLabel("\"\"hi!\"\"");
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup1 = python2Target0.getTemplates();
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromString("_\"i\"", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python2Target0.getElementName("\"\\\"\\\\\\\"i\\\\\\\"\\\"\"");
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = python2Target0.getAltLabelContextStructName("\"\"\"hi!\"\"\"");
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromString("_\"i\"", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target0.loadTemplates();
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        python2Target0.addBadWords();
        python2Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target0.loadTemplates();
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python2Target0.getAltLabelContextStructName("\"\\12Context\"Context");
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        java.lang.String str4 = python2Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getImplicitSetLabel("\"\\12Context\"Context");
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str3 = python2Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python2Target0.getElementListName("\\1");
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python2Target0.getElementListName("\"\"\\12Context\"\"");
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        python2Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python2Target0.getAltLabelContextStructName("\"\\\"hi!\\\"\\\"Contex\"");
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
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
        java.lang.String str14 = python2Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = python2Target0.getAltLabelContextStructName("\"\\\"\\\\\\\"i\\\\\\\"\\\"\"");
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.language = "";
        java.lang.String[] strArray5 = python2Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python2Target0.getImplicitSetLabel("\"0\"");
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.addBadWords();
        org.antlr.v4.codegen.target.Python2Target python2Target4 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str6 = python2Target4.getTargetStringLiteralFromString("hi!");
        python2Target4.language = "hi!";
        java.lang.String str10 = python2Target4.encodeIntAsCharEscape((int) (byte) 10);
        java.util.Set<java.lang.String> strSet11 = python2Target4.badWords;
        python2Target0.badWords = strSet11;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python2Target0.getElementName("\"\"\"\\12Context\"Context\"\"");
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        java.util.Set<java.lang.String> strSet7 = python2Target0.badWords;
        java.lang.String str9 = python2Target0.encodeIntAsCharEscape((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python2Target0.getAltLabelContextStructName("\"hi!\"");
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
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
        java.util.Set<java.lang.String> strSet15 = python2Target0.badWords;
        int int16 = python2Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = python2Target0.getAltLabelContextStructName("\"\"\"i\"\"\"");
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str3 = python2Target0.getLanguage();
        java.lang.String[] strArray4 = python2Target0.targetCharValueEscape;
        boolean boolean5 = python2Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target0.loadTemplates();
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target0.gen;
        java.lang.String str6 = python2Target0.getLanguage();
        int int7 = python2Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target0.loadTemplates();
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.util.Set<java.lang.String> strSet5 = python2Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python2Target0.getElementListName("\\12");
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str9 = python2Target0.getVersion();
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromString("\" \"Context", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python2Target0.getImplicitRuleLabel("i");
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        int int4 = python2Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getAltLabelContextStructName("\"\"i\"\"");
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        java.util.Set<java.lang.String> strSet11 = python2Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python2Target0.getImplicitTokenLabel("_\\1");
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.language = "";
        java.lang.String[] strArray5 = python2Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python2Target0.getImplicitRuleLabel("\"12Context\"");
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getAltLabelContextStructName("\"\\\"0\\\"Context\"");
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test80");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        python2Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python2Target0.getElementListName("_\"\\\\\\\"i\"");
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test81");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String str13 = python2Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python2Target0.getElementListName("i");
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test82");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str7 = python2Target0.getTargetStringLiteralFromString("i", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python2Target0.getElementName("");
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test83");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        java.lang.String str6 = python2Target0.getLanguage();
        java.lang.String str7 = python2Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python2Target0.getImplicitTokenLabel("\"\"\"\"i\"\"\"\"");
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test84");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean7 = python2Target0.wantsBaseListener();
        java.lang.String str9 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python2Target0.getImplicitRuleLabel("\"\\\"0\\\"Context\"");
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test85");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        java.util.Set<java.lang.String> strSet11 = python2Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target0.getTemplates();
    }
}

