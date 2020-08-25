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
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        boolean boolean5 = textNode2.isBlank();
        textNode2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        textNode2.setBaseUri("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        java.lang.String str5 = textNode2.text();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.toString();
        org.jsoup.nodes.Node node11 = textNode2.attr("#", "i!");
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node17 = textNode14.attr("#text", "");
        int int18 = node17.siblingIndex();
        org.jsoup.nodes.Node node19 = node17.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = node19.childNodesCopy();
        org.jsoup.nodes.Node node21 = node19.nextSibling();
        boolean boolean22 = node11.equals((java.lang.Object) node19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode6.nodeName();
        boolean boolean9 = textNode6.hasAttr("hi!");
        java.lang.String str11 = textNode6.absUrl("#");
        java.lang.String str12 = textNode6.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            textNode6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        boolean boolean9 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node4.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        org.jsoup.nodes.Attributes attributes7 = textNode6.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode6.childNodesCopy();
        java.lang.String str9 = textNode6.baseUri();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "");
        java.lang.String str8 = textNode2.nodeName();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        boolean boolean10 = textNode2.isBlank();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.lang.String str3 = textNode2.nodeName();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str8 = textNode7.getWholeText();
        java.lang.String str9 = textNode7.nodeName();
        org.jsoup.nodes.TextNode textNode11 = textNode7.text("");
        org.jsoup.nodes.Node node13 = textNode7.removeAttr("#text");
        boolean boolean15 = textNode7.hasAttr("hi!");
        org.jsoup.nodes.Node node16 = textNode7.clone();
        boolean boolean17 = textNode2.equals((java.lang.Object) node16);
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node16.siblingNodes();
        node16.setBaseUri("hi!");
        org.jsoup.nodes.Node node21 = node16.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node21.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#text" + "'", str3.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("#text");
        java.lang.String str9 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        boolean boolean6 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.text();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode6 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str7 = textNode6.getWholeText();
        org.jsoup.nodes.Node node8 = textNode6.parent();
        java.lang.String str9 = textNode6.text();
        boolean boolean10 = textNode2.equals((java.lang.Object) str9);
        java.lang.String str11 = textNode2.outerHtml();
        java.lang.String str12 = textNode2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode6.nodeName();
        boolean boolean9 = textNode6.hasAttr("hi!");
        java.lang.String str11 = textNode6.absUrl("#");
        java.lang.String str12 = textNode6.outerHtml();
        org.jsoup.nodes.Node node13 = textNode6.previousSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("#text");
        java.lang.String str10 = textNode2.attr("#text");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("i!");
        org.jsoup.nodes.Node node15 = textNode13.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode13.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode13.siblingNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node8 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str12 = textNode11.getWholeText();
        java.lang.String str13 = textNode11.nodeName();
        org.jsoup.nodes.TextNode textNode15 = textNode11.splitText((int) (short) 1);
        boolean boolean16 = textNode2.equals((java.lang.Object) textNode11);
        org.jsoup.nodes.Node node17 = textNode11.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList18 = node17.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "i!");
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("", "#text");
        int int6 = textNode5.siblingIndex();
        boolean boolean7 = textNode2.equals((java.lang.Object) textNode5);
        java.lang.String str8 = textNode5.outerHtml();
        org.jsoup.nodes.Document document9 = textNode5.ownerDocument();
        org.jsoup.nodes.Node node11 = textNode5.removeAttr("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        org.jsoup.nodes.Attributes attributes7 = textNode6.attributes();
        org.jsoup.nodes.Attributes attributes8 = textNode6.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode6.childNodes();
        java.lang.String str10 = textNode6.nodeName();
        int int11 = textNode6.siblingIndex();
        org.jsoup.nodes.Node node14 = textNode6.attr("h", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode2.attr("", "#");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode6.childNodesCopy();
        java.lang.String str8 = textNode6.text();
        java.lang.String str10 = textNode6.absUrl("#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        int int8 = textNode2.childNodeSize();
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.baseUri();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        java.lang.String str5 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        int int7 = textNode2.siblingIndex();
        boolean boolean9 = textNode2.hasAttr("i!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode2.after("#");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        java.lang.String str5 = textNode2.nodeName();
        int int6 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("", "i!");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode6.nodeName();
        boolean boolean9 = textNode6.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = textNode6.removeAttr("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = node6.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        int int7 = textNode2.childNodeSize();
        java.lang.String str9 = textNode2.absUrl("i!");
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        boolean boolean14 = textNode12.hasAttr("#text");
        java.lang.String str15 = textNode12.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode12.childNodesCopy();
        org.jsoup.nodes.TextNode textNode18 = textNode12.text("#text");
        org.jsoup.nodes.Node node19 = textNode12.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = textNode2.before(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#text" + "'", str15.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        boolean boolean7 = textNode2.hasAttr("hi!");
        boolean boolean8 = textNode2.isBlank();
        textNode2.setBaseUri("#text");
        java.lang.String str11 = textNode2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "i!");
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("", "#text");
        int int6 = textNode5.siblingIndex();
        boolean boolean7 = textNode2.equals((java.lang.Object) textNode5);
        java.lang.String str8 = textNode5.outerHtml();
        org.jsoup.nodes.Document document9 = textNode5.ownerDocument();
        java.lang.String str11 = textNode5.absUrl("#text");
        textNode5.setBaseUri("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        boolean boolean8 = textNode2.hasAttr("i!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str9 = textNode2.text();
        java.lang.String str11 = textNode2.attr("hi!");
        textNode2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        boolean boolean6 = textNode2.hasAttr("#text");
        int int7 = textNode2.childNodeSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        java.lang.String str6 = textNode2.text();
        textNode2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean14 = textNode12.hasAttr("#text");
        org.jsoup.nodes.Node node16 = textNode12.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes17 = textNode12.attributes();
        org.jsoup.nodes.Document document18 = textNode12.ownerDocument();
        boolean boolean20 = textNode12.hasAttr("");
        java.lang.String str22 = textNode12.attr("hi!");
        boolean boolean23 = textNode2.equals((java.lang.Object) textNode12);
        java.lang.String str24 = textNode12.getWholeText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        boolean boolean8 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str12 = textNode11.getWholeText();
        java.lang.String str13 = textNode11.baseUri();
        java.lang.String str14 = textNode11.nodeName();
        org.jsoup.nodes.TextNode textNode16 = textNode11.text("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = textNode2.after((org.jsoup.nodes.Node) textNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode16);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode10 = textNode8.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode8.siblingNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.lang.String str10 = textNode9.text();
        java.lang.String str11 = textNode9.outerHtml();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "i!");
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("", "#text");
        int int6 = textNode5.siblingIndex();
        boolean boolean7 = textNode2.equals((java.lang.Object) textNode5);
        java.lang.String str8 = textNode5.outerHtml();
        org.jsoup.nodes.Document document9 = textNode5.ownerDocument();
        java.lang.String str11 = textNode5.absUrl("#text");
        org.jsoup.nodes.Node node12 = textNode5.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode6.nodeName();
        int int8 = textNode6.siblingIndex();
        java.lang.String str9 = textNode6.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode6.childNodes();
        org.jsoup.nodes.Attributes attributes11 = textNode6.attributes();
        org.jsoup.nodes.Document document12 = textNode6.ownerDocument();
        java.lang.String str13 = textNode6.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode8.nextSibling();
        org.jsoup.nodes.Node node10 = textNode8.previousSibling();
        org.jsoup.nodes.TextNode textNode12 = textNode8.splitText((int) (short) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode8.childNodesCopy();
        org.jsoup.nodes.Node node14 = textNode8.previousSibling();
        org.jsoup.nodes.TextNode textNode17 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str18 = textNode17.getWholeText();
        org.jsoup.nodes.Node node19 = textNode17.parent();
        java.lang.String str20 = textNode17.text();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode17.childNodes();
        boolean boolean23 = textNode17.hasAttr("hi!");
        boolean boolean24 = textNode8.equals((java.lang.Object) textNode17);
        java.lang.String str25 = textNode8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "#" + "'", str25.equals("#"));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.lang.String str6 = textNode2.absUrl("#text");
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#", "h");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode6.nodeName();
        int int8 = textNode6.siblingIndex();
        java.lang.String str9 = textNode6.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode6.childNodes();
        org.jsoup.nodes.Attributes attributes11 = textNode6.attributes();
        boolean boolean13 = textNode6.hasAttr("i!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        boolean boolean5 = textNode2.equals((java.lang.Object) 100.0f);
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node12 = textNode2.attr("i!", "hi!");
        java.lang.String str13 = textNode2.getWholeText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.lang.String str5 = textNode2.baseUri();
        int int6 = textNode2.siblingIndex();
        textNode2.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode2.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("h", "h");
        java.lang.String str3 = textNode2.toString();
        java.lang.String str5 = textNode2.attr("#text");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h" + "'", str3.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node5 = textNode2.attr("#text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        org.jsoup.nodes.Node node10 = textNode2.attr("hi!", "");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "#");
        java.lang.String str3 = textNode2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h" + "'", str3.equals("h"));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        boolean boolean5 = textNode2.isBlank();
        textNode2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        textNode2.setBaseUri("");
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode2.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node6 = textNode2.attr("i!", "i!");
        org.jsoup.select.NodeVisitor nodeVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node6.traverse(nodeVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        boolean boolean5 = textNode2.isBlank();
        java.lang.String str6 = textNode2.outerHtml();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        java.lang.String str5 = textNode2.nodeName();
        int int6 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode6 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str7 = textNode6.getWholeText();
        org.jsoup.nodes.Node node8 = textNode6.parent();
        java.lang.String str9 = textNode6.text();
        boolean boolean10 = textNode2.equals((java.lang.Object) str9);
        java.lang.String str11 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str15 = textNode14.toString();
        org.jsoup.nodes.TextNode textNode18 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str19 = textNode18.getWholeText();
        org.jsoup.nodes.Node node20 = textNode18.parent();
        java.lang.String str21 = textNode18.text();
        boolean boolean22 = textNode14.equals((java.lang.Object) str21);
        org.jsoup.nodes.TextNode textNode24 = textNode14.text("i!");
        org.jsoup.nodes.Node node27 = textNode24.attr("#", "");
        boolean boolean28 = textNode2.equals((java.lang.Object) node27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        java.lang.String str6 = textNode2.text();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        textNode6.setBaseUri("");
        java.lang.String str9 = textNode6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("hi!");
        boolean boolean7 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        boolean boolean5 = textNode2.equals((java.lang.Object) 100.0f);
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("hi!");
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("i!");
        textNode10.setBaseUri("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode2.getWholeText();
        boolean boolean9 = textNode2.hasAttr("");
        int int10 = textNode2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.siblingNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        java.lang.String str5 = textNode2.text();
        boolean boolean6 = textNode2.isBlank();
        java.lang.String str8 = textNode2.absUrl("#text");
        java.lang.String str9 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("i!");
        java.lang.String str13 = textNode2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode15 = textNode2.splitText((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        java.lang.String str5 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node10 = textNode2.attr("#", "#");
        int int11 = textNode2.siblingIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        java.lang.String str5 = textNode2.text();
        boolean boolean6 = textNode2.isBlank();
        java.lang.String str8 = textNode2.absUrl("#text");
        java.lang.String str9 = textNode2.baseUri();
        java.lang.String str10 = textNode2.getWholeText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode12 = textNode2.splitText(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.absUrl("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        int int8 = textNode2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        textNode2.setBaseUri("#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "i!");
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("", "#text");
        int int6 = textNode5.siblingIndex();
        boolean boolean7 = textNode2.equals((java.lang.Object) textNode5);
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode2.after("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        textNode2.setBaseUri("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        textNode6.setBaseUri("");
        org.jsoup.nodes.Node node10 = textNode6.removeAttr("#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#", "#");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#" + "'", str3.equals("#"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes4);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node8 = textNode2.nextSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.baseUri();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("hi!");
        boolean boolean9 = textNode7.hasAttr("");
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str13 = textNode12.getWholeText();
        org.jsoup.nodes.Node node14 = textNode12.parent();
        org.jsoup.nodes.TextNode textNode16 = textNode12.text("#text");
        boolean boolean17 = textNode7.equals((java.lang.Object) "#text");
        boolean boolean19 = textNode7.hasAttr("hi!");
        org.jsoup.nodes.Document document20 = textNode7.ownerDocument();
        org.jsoup.nodes.TextNode textNode22 = textNode7.text("h");
        java.lang.Class<?> wildcardClass23 = textNode22.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node7 = node6.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.after("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        java.lang.String str6 = textNode2.absUrl("#text");
        java.lang.String str8 = textNode2.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        java.lang.String str10 = textNode2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode2.after("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        java.lang.String str4 = textNode2.absUrl("i!");
        textNode2.setBaseUri("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.before("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        boolean boolean5 = textNode2.isBlank();
        textNode2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        textNode2.setBaseUri("");
        textNode2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.childNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode4.getWholeText();
        java.lang.String str6 = textNode4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode4.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str13 = textNode12.getWholeText();
        java.lang.String str14 = textNode12.nodeName();
        org.jsoup.nodes.TextNode textNode16 = textNode12.text("");
        org.jsoup.nodes.Node node18 = textNode12.removeAttr("#text");
        boolean boolean19 = textNode9.equals((java.lang.Object) textNode12);
        org.jsoup.nodes.Node node20 = textNode9.nextSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.lang.String str5 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode2.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        int int7 = textNode2.childNodeSize();
        int int8 = textNode2.siblingIndex();
        boolean boolean10 = textNode2.hasAttr("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode10 = textNode8.text("");
        org.jsoup.nodes.Node node11 = textNode8.nextSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        java.lang.String str8 = textNode2.attr("");
        java.lang.Class<?> wildcardClass9 = textNode2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node5 = textNode2.attr("#text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        org.jsoup.nodes.Node node10 = textNode2.attr("hi!", "");
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str14 = textNode13.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode13.childNodes();
        org.jsoup.nodes.Attributes attributes16 = textNode13.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = textNode2.before((org.jsoup.nodes.Node) textNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode8.nextSibling();
        org.jsoup.nodes.Node node10 = textNode8.previousSibling();
        org.jsoup.nodes.TextNode textNode12 = textNode8.splitText((int) (short) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode8.childNodesCopy();
        org.jsoup.nodes.Node node14 = textNode8.parent();
        boolean boolean16 = textNode8.hasAttr("#text");
        org.jsoup.nodes.Document document17 = textNode8.ownerDocument();
        org.jsoup.nodes.Node node19 = textNode8.removeAttr("hi!");
        org.jsoup.nodes.TextNode textNode22 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str23 = textNode22.getWholeText();
        org.jsoup.nodes.Node node24 = textNode22.parent();
        org.jsoup.nodes.Document document25 = textNode22.ownerDocument();
        boolean boolean27 = textNode22.hasAttr("hi!");
        org.jsoup.nodes.Node node28 = textNode22.parent();
        org.jsoup.nodes.TextNode textNode31 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str32 = textNode31.getWholeText();
        java.lang.String str33 = textNode31.nodeName();
        org.jsoup.nodes.TextNode textNode35 = textNode31.splitText((int) (short) 1);
        boolean boolean36 = textNode22.equals((java.lang.Object) textNode31);
        boolean boolean37 = node19.equals((java.lang.Object) textNode22);
        java.lang.String str38 = textNode22.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "#text" + "'", str33.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "#text" + "'", str38.equals("#text"));
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("#text");
        java.lang.String str9 = textNode2.toString();
        int int10 = textNode2.childNodeSize();
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        java.lang.String str5 = textNode2.nodeName();
        int int6 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = document8.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        textNode2.setBaseUri("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        java.lang.String str9 = textNode2.attr("#text");
        int int10 = textNode2.siblingIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        boolean boolean7 = textNode2.hasAttr("hi!");
        java.lang.String str9 = textNode2.attr("i!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode8.nextSibling();
        org.jsoup.nodes.Node node11 = textNode8.removeAttr("hi!");
        java.lang.String str12 = textNode8.text();
        java.lang.String str13 = textNode8.text();
        boolean boolean15 = textNode8.hasAttr("i!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = textNode8.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.splitText((int) (byte) 1);
        java.lang.String str8 = textNode2.text();
        java.lang.String str9 = textNode2.text();
        java.lang.String str10 = textNode2.nodeName();
        java.lang.String str11 = textNode2.text();
        java.lang.String str13 = textNode2.attr("h");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode15 = textNode2.splitText(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "h" + "'", str8.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "h" + "'", str9.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "h" + "'", str11.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.absUrl("h");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str10 = textNode9.getWholeText();
        java.lang.String str11 = textNode9.nodeName();
        org.jsoup.nodes.TextNode textNode13 = textNode9.text("");
        java.lang.String str14 = textNode13.nodeName();
        boolean boolean16 = textNode13.hasAttr("hi!");
        java.lang.String str18 = textNode13.absUrl("#");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = textNode2.before((org.jsoup.nodes.Node) textNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str8 = textNode7.getWholeText();
        org.jsoup.nodes.Node node9 = textNode7.parent();
        java.lang.String str10 = textNode7.text();
        boolean boolean11 = textNode7.isBlank();
        java.lang.String str13 = textNode7.absUrl("#text");
        java.lang.String str14 = textNode7.baseUri();
        org.jsoup.nodes.TextNode textNode16 = textNode7.splitText(0);
        org.jsoup.nodes.Attributes attributes17 = textNode7.attributes();
        java.lang.String str18 = textNode7.toString();
        boolean boolean19 = textNode2.equals((java.lang.Object) textNode7);
        java.lang.String str20 = textNode7.text();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node6 = textNode2.attr("i!", "i!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        java.lang.String str5 = textNode2.text();
        boolean boolean6 = textNode2.isBlank();
        java.lang.String str8 = textNode2.absUrl("#text");
        java.lang.String str9 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText(0);
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str15 = textNode14.getWholeText();
        java.lang.String str16 = textNode14.nodeName();
        org.jsoup.nodes.TextNode textNode18 = textNode14.text("");
        java.lang.String str19 = textNode18.nodeName();
        boolean boolean21 = textNode18.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode18.siblingNodes();
        boolean boolean23 = textNode2.equals((java.lang.Object) nodeList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "#text" + "'", str19.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        boolean boolean5 = textNode2.isBlank();
        textNode2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        textNode2.setBaseUri("");
        textNode2.setBaseUri("");
        boolean boolean14 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node15 = textNode2.parent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode8.nextSibling();
        org.jsoup.nodes.Node node10 = textNode8.previousSibling();
        org.jsoup.nodes.TextNode textNode12 = textNode8.splitText((int) (short) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode8.childNodesCopy();
        org.jsoup.nodes.Node node14 = textNode8.parent();
        boolean boolean16 = textNode8.hasAttr("#text");
        java.lang.String str17 = textNode8.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode8.siblingNodes();
        int int19 = textNode8.siblingIndex();
        org.jsoup.nodes.Node node20 = textNode8.parent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "#text" + "'", str17.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        org.jsoup.nodes.Node node5 = textNode2.attr("#text", "#text");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("hi!");
        java.lang.String str8 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#");
        java.lang.String str11 = textNode2.outerHtml();
        org.jsoup.nodes.Node node12 = textNode2.parent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#" + "'", str11.equals("#"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.baseUri();
        java.lang.String str9 = textNode2.attr("i!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "i!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean5 = textNode2.hasAttr("#text");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.before("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.lang.String str3 = textNode2.nodeName();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str8 = textNode7.getWholeText();
        java.lang.String str9 = textNode7.nodeName();
        org.jsoup.nodes.TextNode textNode11 = textNode7.text("");
        org.jsoup.nodes.Node node13 = textNode7.removeAttr("#text");
        boolean boolean15 = textNode7.hasAttr("hi!");
        org.jsoup.nodes.Node node16 = textNode7.clone();
        boolean boolean17 = textNode2.equals((java.lang.Object) node16);
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode2.childNodesCopy();
        textNode2.setBaseUri("hi!");
        java.lang.String str21 = textNode2.getWholeText();
        java.lang.String str22 = textNode2.getWholeText();
        boolean boolean24 = textNode2.hasAttr("#text");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#text" + "'", str3.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.absUrl("#text");
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node9 = textNode2.attr("#text", "hi!");
        java.lang.String str10 = textNode2.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode6.nodeName();
        int int8 = textNode6.siblingIndex();
        java.lang.String str9 = textNode6.baseUri();
        org.jsoup.nodes.TextNode textNode11 = textNode6.text("#text");
        java.lang.String str12 = textNode11.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            textNode11.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        int int6 = textNode2.childNodeSize();
        textNode2.setBaseUri("");
        java.lang.String str9 = textNode2.baseUri();
        boolean boolean11 = textNode2.hasAttr("h");
        java.lang.String str12 = textNode2.getWholeText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        java.lang.String str5 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        boolean boolean8 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node9 = textNode2.parent();
        java.lang.String str10 = textNode2.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str4 = textNode2.text();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node11 = textNode8.attr("h", "i!");
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str15 = textNode14.getWholeText();
        java.lang.String str16 = textNode14.baseUri();
        org.jsoup.nodes.TextNode textNode18 = textNode14.text("");
        java.lang.String str20 = textNode18.attr("hi!");
        boolean boolean21 = textNode18.isBlank();
        boolean boolean22 = textNode18.isBlank();
        java.lang.String str24 = textNode18.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode26 = textNode18.text("i!");
        // The following exception was thrown during execution in test generation
        try {
            node11.replaceWith((org.jsoup.nodes.Node) textNode26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode26);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode2.getWholeText();
        boolean boolean9 = textNode2.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode2.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("#text");
        boolean boolean10 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        java.lang.String str12 = textNode2.nodeName();
        org.jsoup.nodes.Node node13 = textNode2.previousSibling();
        boolean boolean15 = textNode2.hasAttr("#");
        java.lang.String str16 = textNode2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = textNode2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.lang.String str5 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node9 = textNode2.attr("#text", "i!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        java.lang.String str5 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        boolean boolean8 = textNode2.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str12 = textNode11.getWholeText();
        java.lang.String str13 = textNode11.nodeName();
        org.jsoup.nodes.TextNode textNode15 = textNode11.text("");
        java.lang.String str16 = textNode11.getWholeText();
        boolean boolean18 = textNode11.hasAttr("");
        int int19 = textNode11.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode11.childNodesCopy();
        boolean boolean21 = textNode2.equals((java.lang.Object) nodeList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.lang.Object obj4 = null;
        boolean boolean5 = textNode2.equals(obj4);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode7 = textNode2.splitText(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str9 = textNode2.nodeName();
        java.lang.String str10 = textNode2.text();
        boolean boolean11 = textNode2.isBlank();
        java.lang.String str12 = textNode2.outerHtml();
        java.lang.String str13 = textNode2.getWholeText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node5 = textNode2.attr("#text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        org.jsoup.nodes.Node node10 = textNode2.attr("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        org.jsoup.nodes.Node node12 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("i!");
        org.jsoup.nodes.Node node15 = textNode2.parent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        java.lang.String str5 = textNode2.text();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.getWholeText();
        org.jsoup.nodes.Node node12 = textNode2.attr("h", "hi!");
        org.jsoup.nodes.Node node13 = node12.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = node13.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("#text");
        java.lang.String str10 = textNode2.attr("#text");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("i!");
        org.jsoup.nodes.Node node15 = textNode13.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode13.childNodes();
        org.jsoup.nodes.Node node18 = textNode13.removeAttr("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        boolean boolean8 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList10 = node9.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        boolean boolean7 = textNode2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.lang.Class<?> wildcardClass9 = textNode2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode6.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode6.childNodes();
        int int9 = textNode6.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode11 = textNode6.splitText((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        boolean boolean7 = textNode2.hasAttr("hi!");
        boolean boolean8 = textNode2.isBlank();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        boolean boolean10 = textNode2.isBlank();
        java.lang.String str11 = textNode2.getWholeText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.attr("hi!");
        boolean boolean9 = textNode6.isBlank();
        boolean boolean10 = textNode6.isBlank();
        java.lang.String str12 = textNode6.absUrl("hi!");
        org.jsoup.nodes.Node node13 = textNode6.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node5 = textNode2.attr("#text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        java.lang.String str8 = textNode2.getWholeText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        org.jsoup.nodes.Attributes attributes7 = textNode6.attributes();
        org.jsoup.nodes.Attributes attributes8 = textNode6.attributes();
        int int9 = textNode6.siblingIndex();
        int int10 = textNode6.siblingIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        java.lang.String str6 = textNode2.absUrl("#text");
        java.lang.String str8 = textNode2.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        java.lang.String str10 = textNode2.toString();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "#text");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Node node8 = textNode2.parent();
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        int int8 = textNode2.childNodeSize();
        java.lang.String str9 = textNode2.outerHtml();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("i!");
        org.jsoup.nodes.Node node12 = node11.clone();
        java.lang.String str13 = node11.outerHtml();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str9 = textNode2.nodeName();
        java.lang.String str10 = textNode2.toString();
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str15 = textNode14.getWholeText();
        org.jsoup.nodes.Node node16 = textNode14.parent();
        org.jsoup.nodes.Document document17 = textNode14.ownerDocument();
        boolean boolean19 = textNode14.hasAttr("hi!");
        org.jsoup.nodes.Node node20 = textNode14.previousSibling();
        java.lang.String str21 = textNode14.nodeName();
        java.lang.String str22 = textNode14.text();
        boolean boolean23 = textNode14.isBlank();
        java.lang.String str24 = textNode14.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = textNode2.before((org.jsoup.nodes.Node) textNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "#text" + "'", str21.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode5.splitText(1);
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode5.siblingNodes();
        java.lang.String str10 = textNode5.attr("h");
        org.jsoup.nodes.Node node12 = textNode5.removeAttr("h");
        org.jsoup.nodes.TextNode textNode15 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode15.childNodes();
        org.jsoup.nodes.TextNode textNode18 = textNode15.text("hi!");
        org.jsoup.nodes.TextNode textNode20 = textNode15.splitText((int) (byte) 1);
        org.jsoup.nodes.Node node21 = textNode15.clone();
        java.lang.String str22 = textNode15.toString();
        // The following exception was thrown during execution in test generation
        try {
            textNode5.replaceWith((org.jsoup.nodes.Node) textNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "h" + "'", str22.equals("h"));
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        int int6 = textNode2.childNodeSize();
        textNode2.setBaseUri("");
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node14 = textNode11.attr("#text", "");
        int int15 = node14.siblingIndex();
        org.jsoup.nodes.Node node16 = node14.clone();
        int int17 = node16.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node16.childNodesCopy();
        boolean boolean19 = textNode2.equals((java.lang.Object) node16);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode8.after("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str9 = textNode2.text();
        java.lang.String str11 = textNode2.attr("hi!");
        textNode2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode16 = textNode2.text("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode16);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node6 = textNode2.attr("i!", "i!");
        boolean boolean8 = textNode2.hasAttr("#text");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.nodeName();
        java.lang.String str8 = textNode2.attr("i!");
        java.lang.String str9 = textNode2.nodeName();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.text();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText((int) (short) 1);
        org.jsoup.nodes.Document document7 = textNode6.ownerDocument();
        java.lang.String str8 = textNode6.getWholeText();
        org.jsoup.nodes.Node node11 = textNode6.attr("#text", "hi!");
        java.lang.String str12 = textNode6.getWholeText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode6.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i!" + "'", str8.equals("i!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "i!" + "'", str12.equals("i!"));
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        int int8 = textNode2.childNodeSize();
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        java.lang.String str5 = textNode2.text();
        boolean boolean6 = textNode2.isBlank();
        java.lang.String str8 = textNode2.absUrl("#text");
        java.lang.String str9 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("i!");
        java.lang.String str13 = textNode2.outerHtml();
        java.lang.String str14 = textNode2.outerHtml();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode9.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode9.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText((int) (short) 1);
        org.jsoup.nodes.Document document7 = textNode6.ownerDocument();
        java.lang.String str8 = textNode6.getWholeText();
        org.jsoup.nodes.Node node11 = textNode6.attr("#text", "hi!");
        java.lang.String str12 = textNode6.text();
        java.lang.String str14 = textNode6.attr("");
        java.lang.String str16 = textNode6.attr("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i!" + "'", str8.equals("i!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "i!" + "'", str12.equals("i!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node8 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str12 = textNode11.getWholeText();
        java.lang.String str13 = textNode11.nodeName();
        org.jsoup.nodes.TextNode textNode15 = textNode11.splitText((int) (short) 1);
        boolean boolean16 = textNode2.equals((java.lang.Object) textNode11);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode11.siblingNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node8 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str12 = textNode11.getWholeText();
        java.lang.String str13 = textNode11.nodeName();
        org.jsoup.nodes.TextNode textNode15 = textNode11.splitText((int) (short) 1);
        boolean boolean16 = textNode2.equals((java.lang.Object) textNode11);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode11.childNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.splitText((int) (byte) 1);
        java.lang.String str8 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        java.lang.String str10 = textNode2.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "h" + "'", str8.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        boolean boolean7 = textNode2.hasAttr("hi!");
        boolean boolean8 = textNode2.isBlank();
        java.lang.String str9 = textNode2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode5.splitText(1);
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode5.childNodesCopy();
        java.lang.String str9 = textNode5.toString();
        java.lang.String str10 = textNode5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "h" + "'", str9.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "h" + "'", str10.equals("h"));
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.absUrl("#text");
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("h");
        int int9 = textNode2.siblingIndex();
        java.lang.String str10 = textNode2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "h" + "'", str10.equals("h"));
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = textNode2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "");
        org.jsoup.nodes.TextNode textNode5 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str6 = textNode5.getWholeText();
        java.lang.String str7 = textNode5.nodeName();
        org.jsoup.nodes.TextNode textNode9 = textNode5.splitText((int) (short) 1);
        org.jsoup.nodes.Document document10 = textNode9.ownerDocument();
        java.lang.String str11 = textNode9.baseUri();
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str15 = textNode14.getWholeText();
        java.lang.String str16 = textNode14.baseUri();
        org.jsoup.nodes.Node node17 = textNode14.nextSibling();
        java.lang.String str18 = textNode14.nodeName();
        boolean boolean19 = textNode9.equals((java.lang.Object) textNode14);
        org.jsoup.nodes.Node node20 = textNode14.previousSibling();
        boolean boolean21 = textNode2.equals((java.lang.Object) node20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        java.lang.String str8 = textNode2.text();
        java.lang.String str9 = textNode2.getWholeText();
        java.lang.String str10 = textNode2.nodeName();
        boolean boolean12 = textNode2.hasAttr("hi!");
        java.lang.String str13 = textNode2.outerHtml();
        java.lang.String str14 = textNode2.baseUri();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode8.siblingNodes();
        org.jsoup.nodes.Node node10 = textNode8.previousSibling();
        java.lang.String str12 = textNode8.absUrl("#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        boolean boolean5 = textNode2.isBlank();
        textNode2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node9.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.lang.String str7 = textNode2.baseUri();
        boolean boolean8 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node14 = textNode11.attr("#text", "");
        int int15 = textNode11.siblingIndex();
        org.jsoup.nodes.Node node16 = textNode11.parent();
        java.lang.String str17 = textNode11.nodeName();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode11);
        org.jsoup.nodes.Attributes attributes19 = textNode2.attributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "#text" + "'", str17.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        org.jsoup.nodes.Attributes attributes7 = textNode6.attributes();
        org.jsoup.nodes.Attributes attributes8 = textNode6.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode6.childNodes();
        java.lang.String str10 = textNode6.nodeName();
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode13.childNodes();
        java.lang.String str15 = textNode13.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode13.childNodes();
        org.jsoup.nodes.Node node17 = textNode13.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = textNode6.before(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode2.text();
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str15 = textNode14.getWholeText();
        java.lang.String str16 = textNode14.nodeName();
        org.jsoup.nodes.TextNode textNode18 = textNode14.text("");
        org.jsoup.nodes.Node node20 = textNode14.removeAttr("#text");
        boolean boolean22 = textNode14.hasAttr("hi!");
        org.jsoup.nodes.Node node23 = textNode14.clone();
        java.lang.String str24 = textNode14.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            node11.replaceWith((org.jsoup.nodes.Node) textNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "#text" + "'", str24.equals("#text"));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#", "h");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.toString();
        boolean boolean7 = textNode2.isBlank();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        boolean boolean5 = textNode2.isBlank();
        textNode2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        textNode2.setBaseUri("");
        textNode2.setBaseUri("");
        boolean boolean14 = textNode2.hasAttr("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = textNode2.after("#");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "#text");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode4.text();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode2.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("h");
        org.jsoup.nodes.Node node12 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean17 = textNode15.hasAttr("#text");
        org.jsoup.nodes.Node node19 = textNode15.removeAttr("hi!");
        java.lang.String str21 = textNode15.attr("hi!");
        org.jsoup.nodes.Node node24 = textNode15.attr("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node12.after((org.jsoup.nodes.Node) textNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("#text");
        // The following exception was thrown during execution in test generation
        try {
            node5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.getWholeText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.lang.String str5 = textNode2.baseUri();
        int int6 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.lang.String str7 = textNode2.baseUri();
        boolean boolean8 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node14 = textNode11.attr("#text", "");
        int int15 = textNode11.siblingIndex();
        org.jsoup.nodes.Node node16 = textNode11.parent();
        java.lang.String str17 = textNode11.nodeName();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode11);
        org.jsoup.nodes.Node node19 = textNode11.previousSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "#text" + "'", str17.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        int int8 = textNode2.childNodeSize();
        int int9 = textNode2.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode2.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "");
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.baseUri();
        int int10 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str14 = textNode13.getWholeText();
        java.lang.String str15 = textNode13.baseUri();
        java.lang.String str16 = textNode13.nodeName();
        java.lang.String str17 = textNode13.nodeName();
        org.jsoup.nodes.Node node18 = textNode13.clone();
        boolean boolean19 = textNode2.equals((java.lang.Object) textNode13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = textNode2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "#text" + "'", str17.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        java.lang.String str5 = textNode2.text();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("#text", "");
        java.lang.String str12 = textNode11.text();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("hi!");
        java.lang.String str7 = textNode2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.TextNode textNode5 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        org.jsoup.nodes.Node node7 = textNode5.removeAttr("#text");
        boolean boolean8 = textNode2.equals((java.lang.Object) node7);
        java.lang.String str9 = textNode2.outerHtml();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode8.childNodes();
        org.jsoup.nodes.TextNode textNode11 = textNode8.text("hi!");
        org.jsoup.nodes.TextNode textNode13 = textNode11.splitText(1);
        java.lang.String str14 = textNode11.baseUri();
        org.jsoup.nodes.Attributes attributes15 = textNode11.attributes();
        boolean boolean16 = textNode2.equals((java.lang.Object) textNode11);
        org.jsoup.select.NodeVisitor nodeVisitor17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = textNode2.traverse(nodeVisitor17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText((int) (short) 1);
        java.lang.String str7 = textNode2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "h" + "'", str7.equals("h"));
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        boolean boolean5 = textNode2.equals((java.lang.Object) 100.0f);
        java.lang.String str6 = textNode2.baseUri();
        java.lang.String str7 = textNode2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.splitText((int) (byte) 1);
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("h");
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText((int) (short) 0);
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.siblingNodes();
        boolean boolean14 = textNode11.hasAttr("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode6.text();
        int int8 = textNode6.siblingIndex();
        org.jsoup.nodes.Attributes attributes9 = textNode6.attributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode8.nextSibling();
        org.jsoup.nodes.Node node10 = textNode8.previousSibling();
        org.jsoup.nodes.TextNode textNode12 = textNode8.splitText((int) (short) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode8.childNodesCopy();
        org.jsoup.nodes.Node node14 = textNode8.parent();
        boolean boolean16 = textNode8.hasAttr("#text");
        org.jsoup.nodes.Document document17 = textNode8.ownerDocument();
        java.lang.String str19 = textNode8.absUrl("#text");
        org.jsoup.nodes.Node node20 = textNode8.clone();
        org.jsoup.nodes.TextNode textNode23 = org.jsoup.nodes.TextNode.createFromEncoded("i!", "");
        org.jsoup.nodes.Node node26 = textNode23.attr("hi!", "i!");
        org.jsoup.nodes.TextNode textNode28 = textNode23.text("h");
        boolean boolean29 = textNode8.equals((java.lang.Object) "h");
        java.lang.String str30 = textNode8.outerHtml();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "#" + "'", str30.equals("#"));
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        boolean boolean8 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node9.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        java.lang.String str11 = textNode2.baseUri();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes4);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "");
        java.lang.String str8 = textNode2.nodeName();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.lang.String str10 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText((int) (short) 1);
        org.jsoup.nodes.Document document7 = textNode6.ownerDocument();
        java.lang.String str8 = textNode6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i!" + "'", str8.equals("i!"));
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        boolean boolean5 = textNode2.isBlank();
        textNode2.setBaseUri("");
        int int8 = textNode2.childNodeSize();
        java.lang.String str9 = textNode2.baseUri();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        boolean boolean7 = textNode2.hasAttr("hi!");
        boolean boolean8 = textNode2.isBlank();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        int int10 = textNode2.siblingIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        boolean boolean5 = textNode2.equals((java.lang.Object) 100.0f);
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node7.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.lang.String str6 = textNode2.absUrl("#text");
        java.lang.String str7 = textNode2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        java.lang.String str5 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        boolean boolean8 = textNode2.hasAttr("#text");
        int int9 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.absUrl("#text");
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node9 = textNode2.attr("#text", "hi!");
        java.lang.Class<?> wildcardClass10 = node9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode6 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str7 = textNode6.getWholeText();
        org.jsoup.nodes.Node node8 = textNode6.parent();
        java.lang.String str9 = textNode6.text();
        boolean boolean10 = textNode2.equals((java.lang.Object) str9);
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        boolean boolean13 = textNode2.hasAttr("#");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodesCopy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str9 = textNode2.absUrl("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode6.nodeName();
        int int8 = textNode6.siblingIndex();
        java.lang.String str9 = textNode6.baseUri();
        org.jsoup.nodes.TextNode textNode11 = textNode6.text("#text");
        java.lang.String str12 = textNode11.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode11.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "");
        java.lang.String str8 = node7.outerHtml();
        int int9 = node7.siblingIndex();
        org.jsoup.nodes.Node node10 = node7.clone();
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str14 = textNode13.getWholeText();
        java.lang.String str15 = textNode13.baseUri();
        java.lang.String str16 = textNode13.nodeName();
        java.lang.String str17 = textNode13.baseUri();
        org.jsoup.nodes.TextNode textNode19 = textNode13.text("#text");
        org.jsoup.nodes.Node node20 = textNode19.previousSibling();
        java.lang.String str22 = textNode19.attr("");
        java.lang.String str23 = textNode19.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node7.before((org.jsoup.nodes.Node) textNode19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "#text" + "'", str23.equals("#text"));
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        boolean boolean5 = textNode2.isBlank();
        textNode2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        textNode2.setBaseUri("");
        textNode2.setBaseUri("");
        boolean boolean14 = textNode2.hasAttr("#text");
        java.lang.String str15 = textNode2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode17 = textNode2.splitText(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node5 = textNode2.attr("#text", "");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode11 = textNode9.text("h");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode11.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode2.attr("#", "#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.splitText((int) (byte) 1);
        int int8 = textNode7.siblingIndex();
        org.jsoup.nodes.TextNode textNode10 = textNode7.text("");
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode7.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "i!");
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("", "#text");
        int int6 = textNode5.siblingIndex();
        boolean boolean7 = textNode2.equals((java.lang.Object) textNode5);
        java.lang.String str8 = textNode5.outerHtml();
        java.lang.String str9 = textNode5.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode5.childNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.text();
        boolean boolean10 = textNode2.hasAttr("h");
        java.lang.String str11 = textNode2.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        boolean boolean8 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        java.lang.String str10 = textNode2.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode2.before("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText((int) (short) 1);
        textNode2.setBaseUri("hi!");
        int int9 = textNode2.siblingIndex();
        java.lang.String str10 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("hi!");
        java.lang.String str13 = textNode2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("#text");
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode8.siblingNodes();
        textNode8.setBaseUri("h");
        java.lang.String str13 = textNode8.attr("#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.lang.String str4 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        boolean boolean11 = textNode9.hasAttr("#text");
        java.lang.String str12 = textNode9.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode9.childNodesCopy();
        org.jsoup.nodes.Node node14 = textNode9.previousSibling();
        boolean boolean15 = textNode2.equals((java.lang.Object) textNode9);
        org.jsoup.nodes.TextNode textNode18 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str19 = textNode18.getWholeText();
        java.lang.String str20 = textNode18.nodeName();
        org.jsoup.nodes.TextNode textNode22 = textNode18.text("");
        java.lang.String str23 = textNode18.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode18.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = textNode9.before((org.jsoup.nodes.Node) textNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "#text" + "'", str20.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList24);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.attr("hi!");
        org.jsoup.nodes.Node node9 = textNode6.parent();
        java.lang.String str11 = textNode6.attr("i!");
        boolean boolean12 = textNode6.isBlank();
        java.lang.String str13 = textNode6.outerHtml();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.absUrl("#text");
        textNode2.setBaseUri("#text");
        java.lang.String str8 = textNode2.baseUri();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node5 = textNode2.attr("#text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode9 = textNode2.splitText((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        boolean boolean7 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        int int8 = textNode2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode11.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        java.lang.String str7 = textNode2.toString();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("i!");
        org.jsoup.nodes.Node node10 = textNode2.clone();
        java.lang.Class<?> wildcardClass11 = textNode2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        boolean boolean7 = textNode2.hasAttr("hi!");
        boolean boolean8 = textNode2.isBlank();
        java.lang.String str9 = textNode2.outerHtml();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        boolean boolean7 = textNode5.hasAttr("hi!");
        org.jsoup.nodes.Node node10 = textNode5.attr("hi!", "i!");
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode13.childNodes();
        org.jsoup.nodes.TextNode textNode16 = textNode13.text("hi!");
        org.jsoup.nodes.TextNode textNode18 = textNode13.splitText((int) (byte) 1);
        org.jsoup.nodes.Node node19 = textNode13.clone();
        org.jsoup.nodes.Node node20 = node19.parent();
        boolean boolean21 = node10.equals((java.lang.Object) node20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("hi!");
        java.lang.String str8 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#");
        org.jsoup.nodes.Node node11 = textNode10.previousSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        java.lang.String str5 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        int int7 = textNode2.siblingIndex();
        boolean boolean9 = textNode2.hasAttr("h");
        boolean boolean11 = textNode2.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            node6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "i!");
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("", "#text");
        int int6 = textNode5.siblingIndex();
        boolean boolean7 = textNode2.equals((java.lang.Object) textNode5);
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str12 = textNode11.getWholeText();
        java.lang.String str13 = textNode11.baseUri();
        java.lang.String str14 = textNode11.nodeName();
        boolean boolean15 = textNode11.isBlank();
        org.jsoup.nodes.Node node17 = textNode11.removeAttr("#text");
        java.lang.String str19 = textNode11.attr("#text");
        java.lang.String str20 = textNode11.text();
        org.jsoup.nodes.TextNode textNode23 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str24 = textNode23.getWholeText();
        java.lang.String str25 = textNode23.nodeName();
        org.jsoup.nodes.TextNode textNode27 = textNode23.splitText((int) (short) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode23.childNodesCopy();
        java.lang.String str30 = textNode23.absUrl("#text");
        boolean boolean31 = textNode11.equals((java.lang.Object) str30);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = document8.before((org.jsoup.nodes.Node) textNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "#text" + "'", str25.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("i!");
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str13 = textNode12.getWholeText();
        java.lang.String str14 = textNode12.nodeName();
        org.jsoup.nodes.TextNode textNode16 = textNode12.text("");
        java.lang.String str17 = textNode16.nodeName();
        int int18 = textNode16.siblingIndex();
        java.lang.String str19 = textNode16.baseUri();
        org.jsoup.nodes.TextNode textNode21 = textNode16.text("#text");
        org.jsoup.nodes.Node node22 = textNode16.clone();
        boolean boolean23 = textNode2.equals((java.lang.Object) textNode16);
        java.lang.String str24 = textNode2.getWholeText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode26 = textNode2.splitText((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "#text" + "'", str17.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode8.nextSibling();
        org.jsoup.nodes.Node node10 = textNode8.previousSibling();
        org.jsoup.nodes.TextNode textNode12 = textNode8.splitText((int) (short) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode8.childNodesCopy();
        org.jsoup.nodes.Node node14 = textNode8.parent();
        boolean boolean16 = textNode8.hasAttr("#text");
        java.lang.String str17 = textNode8.text();
        org.jsoup.nodes.Node node18 = textNode8.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "#" + "'", str17.equals("#"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = document5.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode6.nodeName();
        java.lang.String str8 = textNode6.getWholeText();
        boolean boolean9 = textNode6.isBlank();
        int int10 = textNode6.childNodeSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode6.nodeName();
        boolean boolean9 = textNode6.hasAttr("hi!");
        java.lang.String str11 = textNode6.attr("");
        java.lang.String str13 = textNode6.attr("#");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode6.childNodesCopy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "");
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.baseUri();
        int int10 = textNode2.childNodeSize();
        boolean boolean11 = textNode2.isBlank();
        java.lang.String str12 = textNode2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str6 = textNode2.outerHtml();
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("#text");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode6.nodeName();
        boolean boolean9 = textNode6.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode6.siblingNodes();
        org.jsoup.nodes.Node node13 = textNode6.attr("h", "hi!");
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.traverse(nodeVisitor14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        int int6 = textNode2.childNodeSize();
        textNode2.setBaseUri("");
        java.lang.String str9 = textNode2.baseUri();
        java.lang.String str10 = textNode2.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        java.lang.String str9 = textNode2.attr("#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        java.lang.String str13 = textNode2.attr("#text");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        java.lang.String str5 = textNode2.text();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            node7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("#text");
        java.lang.String str10 = textNode2.absUrl("i!");
        org.jsoup.nodes.TextNode textNode12 = textNode2.splitText((int) (short) 1);
        java.lang.String str13 = textNode2.outerHtml();
        org.jsoup.nodes.Node node14 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node14.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "h" + "'", str13.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode6 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str7 = textNode6.getWholeText();
        org.jsoup.nodes.Node node8 = textNode6.parent();
        java.lang.String str9 = textNode6.text();
        boolean boolean10 = textNode2.equals((java.lang.Object) str9);
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("i!");
        java.lang.String str13 = textNode2.toString();
        org.jsoup.nodes.Attributes attributes14 = textNode2.attributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "i!" + "'", str13.equals("i!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode9.childNodes();
        org.jsoup.nodes.Attributes attributes11 = textNode9.attributes();
        java.lang.String str12 = textNode9.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            textNode9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode5.splitText(1);
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode5.siblingNodes();
        java.lang.String str9 = textNode5.getWholeText();
        org.jsoup.nodes.Document document10 = textNode5.ownerDocument();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "h" + "'", str9.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node8 = textNode2.attr("h", "#text");
        int int9 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str13 = textNode12.getWholeText();
        org.jsoup.nodes.Node node14 = textNode12.parent();
        org.jsoup.nodes.Node node17 = textNode12.attr("#text", "");
        java.lang.String str18 = textNode12.nodeName();
        java.lang.String str19 = textNode12.getWholeText();
        org.jsoup.nodes.Attributes attributes20 = textNode12.attributes();
        java.lang.String str21 = textNode12.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = textNode2.after((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.splitText((int) (byte) 1);
        int int8 = textNode7.siblingIndex();
        java.lang.String str9 = textNode7.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "");
        java.lang.String str8 = textNode2.nodeName();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        node9.setBaseUri("#text");
        org.jsoup.nodes.Node node12 = node9.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "h");
        org.jsoup.nodes.TextNode textNode5 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str6 = textNode5.getWholeText();
        org.jsoup.nodes.Node node7 = textNode5.parent();
        org.jsoup.nodes.Node node10 = textNode5.attr("#text", "");
        org.jsoup.nodes.Attributes attributes11 = textNode5.attributes();
        java.lang.String str12 = textNode5.baseUri();
        int int13 = textNode5.childNodeSize();
        org.jsoup.nodes.TextNode textNode15 = textNode5.text("#");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = textNode2.before((org.jsoup.nodes.Node) textNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode15);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("h", "i!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        java.lang.String str5 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        boolean boolean8 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        java.lang.String str10 = textNode2.text();
        java.lang.String str11 = textNode2.baseUri();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node8 = textNode2.parent();
        int int9 = textNode2.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode2.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.toString();
        java.lang.String str11 = textNode2.text();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str7 = textNode2.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("#text");
        java.lang.String str10 = textNode2.attr("#text");
        java.lang.String str11 = textNode2.text();
        org.jsoup.nodes.Node node12 = textNode2.parent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode6 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str7 = textNode6.getWholeText();
        org.jsoup.nodes.Node node8 = textNode6.parent();
        java.lang.String str9 = textNode6.text();
        boolean boolean10 = textNode2.equals((java.lang.Object) str9);
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean15 = textNode13.hasAttr("#text");
        boolean boolean16 = textNode13.isBlank();
        textNode13.setBaseUri("");
        boolean boolean19 = textNode13.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        java.lang.String str10 = textNode2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode8.nextSibling();
        org.jsoup.nodes.Node node10 = textNode8.previousSibling();
        org.jsoup.nodes.TextNode textNode12 = textNode8.splitText((int) (short) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode8.childNodesCopy();
        org.jsoup.nodes.Node node14 = textNode8.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode8.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = textNode8.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        java.lang.String str8 = textNode7.getWholeText();
        boolean boolean10 = textNode7.hasAttr("#");
        org.jsoup.nodes.Document document11 = textNode7.ownerDocument();
        java.lang.String str13 = textNode7.absUrl("#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        java.lang.String str8 = textNode2.getWholeText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode2.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode2.text();
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node12 = node11.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("#text");
        java.lang.String str9 = textNode2.text();
        java.lang.String str10 = textNode2.text();
        java.lang.String str11 = textNode2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "#");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str9 = textNode2.nodeName();
        java.lang.String str10 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str14 = textNode13.getWholeText();
        java.lang.String str15 = textNode13.baseUri();
        java.lang.String str16 = textNode13.nodeName();
        java.lang.String str17 = textNode13.baseUri();
        org.jsoup.nodes.TextNode textNode19 = textNode13.text("#text");
        org.jsoup.nodes.Node node20 = textNode19.nextSibling();
        org.jsoup.nodes.Node node21 = textNode19.previousSibling();
        org.jsoup.nodes.TextNode textNode23 = textNode19.splitText((int) (short) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode19.childNodesCopy();
        org.jsoup.nodes.Node node25 = textNode19.parent();
        boolean boolean27 = textNode19.hasAttr("#text");
        java.lang.String str28 = textNode19.nodeName();
        java.lang.String str29 = textNode19.baseUri();
        boolean boolean30 = textNode2.equals((java.lang.Object) str29);
        org.jsoup.nodes.TextNode textNode33 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str34 = textNode33.getWholeText();
        java.lang.String str35 = textNode33.baseUri();
        java.lang.String str36 = textNode33.nodeName();
        java.lang.String str37 = textNode33.baseUri();
        org.jsoup.nodes.TextNode textNode39 = textNode33.text("#text");
        int int40 = textNode33.siblingIndex();
        org.jsoup.nodes.Node node43 = textNode33.attr("#text", "i!");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith(node43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "#text" + "'", str28.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "#text" + "'", str36.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node43);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode5.splitText(1);
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode5.childNodesCopy();
        java.lang.String str9 = textNode5.toString();
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node15 = textNode12.attr("#text", "");
        int int16 = textNode12.siblingIndex();
        org.jsoup.nodes.Node node17 = textNode12.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode12.childNodesCopy();
        org.jsoup.nodes.TextNode textNode20 = textNode12.text("#text");
        boolean boolean22 = textNode20.hasAttr("h");
        // The following exception was thrown during execution in test generation
        try {
            textNode5.replaceWith((org.jsoup.nodes.Node) textNode20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "h" + "'", str9.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode8.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = node9.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.lang.String str6 = textNode2.absUrl("#text");
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str12 = textNode11.getWholeText();
        org.jsoup.nodes.Node node13 = textNode11.parent();
        org.jsoup.nodes.Document document14 = textNode11.ownerDocument();
        boolean boolean16 = textNode11.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode18 = textNode11.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode18.childNodes();
        boolean boolean20 = textNode2.equals((java.lang.Object) textNode18);
        java.lang.String str22 = textNode18.attr("hi!");
        boolean boolean23 = textNode18.isBlank();
        boolean boolean24 = textNode18.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode26 = textNode18.splitText((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        java.lang.String str5 = textNode2.text();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        java.lang.String str8 = node7.outerHtml();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str8 = textNode7.getWholeText();
        org.jsoup.nodes.Node node9 = textNode7.parent();
        java.lang.String str10 = textNode7.text();
        boolean boolean11 = textNode7.isBlank();
        java.lang.String str13 = textNode7.absUrl("#text");
        java.lang.String str14 = textNode7.baseUri();
        org.jsoup.nodes.TextNode textNode16 = textNode7.splitText(0);
        org.jsoup.nodes.Attributes attributes17 = textNode7.attributes();
        java.lang.String str18 = textNode7.toString();
        boolean boolean19 = textNode2.equals((java.lang.Object) textNode7);
        java.lang.String str20 = textNode7.outerHtml();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.Node node8 = textNode2.nextSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#", "");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str14 = textNode13.getWholeText();
        java.lang.String str15 = textNode13.nodeName();
        org.jsoup.nodes.TextNode textNode17 = textNode13.text("");
        org.jsoup.nodes.Node node19 = textNode13.removeAttr("#text");
        boolean boolean21 = textNode13.hasAttr("hi!");
        org.jsoup.nodes.Node node22 = textNode13.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode13.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#text" + "'", str15.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList23);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str9 = textNode2.nodeName();
        java.lang.String str10 = textNode2.text();
        org.jsoup.nodes.Node node13 = textNode2.attr("h", "#");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodesCopy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.lang.String str10 = textNode9.baseUri();
        java.lang.String str11 = textNode9.text();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        boolean boolean8 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        java.lang.String str10 = textNode2.text();
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str14 = textNode13.getWholeText();
        boolean boolean16 = textNode13.equals((java.lang.Object) 100.0f);
        org.jsoup.nodes.Node node18 = textNode13.removeAttr("hi!");
        java.lang.String str19 = textNode13.baseUri();
        org.jsoup.nodes.TextNode textNode22 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str23 = textNode22.getWholeText();
        java.lang.String str24 = textNode22.baseUri();
        java.lang.String str25 = textNode22.nodeName();
        java.lang.String str26 = textNode22.baseUri();
        org.jsoup.nodes.TextNode textNode28 = textNode22.text("#text");
        org.jsoup.nodes.Node node29 = textNode28.nextSibling();
        org.jsoup.nodes.Node node30 = textNode28.previousSibling();
        org.jsoup.nodes.TextNode textNode32 = textNode28.splitText((int) (short) 1);
        boolean boolean33 = textNode13.equals((java.lang.Object) (short) 1);
        boolean boolean34 = textNode2.equals((java.lang.Object) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "#text" + "'", str25.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText((int) (short) 1);
        textNode2.setBaseUri("hi!");
        int int9 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        org.jsoup.nodes.Node node11 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = node11.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.after(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        java.lang.String str5 = textNode2.text();
        boolean boolean6 = textNode2.isBlank();
        java.lang.String str8 = textNode2.absUrl("#text");
        java.lang.String str9 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText(0);
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.siblingNodes();
        int int13 = textNode2.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode15 = textNode2.splitText(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "");
        java.lang.String str8 = node7.outerHtml();
        node7.setBaseUri("#text");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.lang.String str5 = textNode2.baseUri();
        int int6 = textNode2.siblingIndex();
        int int7 = textNode2.siblingIndex();
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("h", "hi!");
        java.lang.String str4 = textNode2.attr("#text");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode6.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode6.childNodes();
        int int9 = textNode6.siblingIndex();
        int int10 = textNode6.childNodeSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.splitText((int) (byte) 1);
        int int8 = textNode7.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode7.childNodesCopy();
        java.lang.String str10 = textNode7.getWholeText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "i!" + "'", str10.equals("i!"));
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        java.lang.String str4 = textNode2.absUrl("i!");
        java.lang.String str5 = textNode2.baseUri();
        textNode2.setBaseUri("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "#");
        java.lang.String str3 = textNode2.toString();
        java.lang.String str5 = textNode2.attr("#text");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h" + "'", str3.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.baseUri();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode6 = textNode2.splitText((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.lang.String str5 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        boolean boolean10 = textNode2.isBlank();
        boolean boolean11 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        int int7 = textNode2.childNodeSize();
        int int8 = textNode2.siblingIndex();
        int int9 = textNode2.siblingIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.splitText((int) (byte) 1);
        int int8 = textNode7.siblingIndex();
        org.jsoup.nodes.TextNode textNode10 = textNode7.text("");
        boolean boolean11 = textNode10.isBlank();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        boolean boolean5 = textNode2.equals((java.lang.Object) 100.0f);
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        int int7 = textNode2.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.before("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.baseUri();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("hi!");
        boolean boolean9 = textNode7.hasAttr("");
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str13 = textNode12.getWholeText();
        org.jsoup.nodes.Node node14 = textNode12.parent();
        org.jsoup.nodes.TextNode textNode16 = textNode12.text("#text");
        boolean boolean17 = textNode7.equals((java.lang.Object) "#text");
        org.jsoup.nodes.TextNode textNode20 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str21 = textNode20.getWholeText();
        boolean boolean23 = textNode20.equals((java.lang.Object) 100.0f);
        org.jsoup.nodes.Node node25 = textNode20.removeAttr("hi!");
        java.lang.String str27 = textNode20.attr("");
        java.lang.String str28 = textNode20.outerHtml();
        org.jsoup.nodes.Node node31 = textNode20.attr("#", "h");
        boolean boolean32 = textNode7.equals((java.lang.Object) "#");
        java.lang.String str33 = textNode7.text();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        boolean boolean5 = textNode2.isBlank();
        textNode2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.lang.String str10 = textNode2.getWholeText();
        java.lang.String str11 = textNode2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.after("#");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("#text");
        java.lang.String str10 = textNode2.attr("#text");
        java.lang.String str11 = textNode2.text();
        org.jsoup.nodes.Node node12 = textNode2.nextSibling();
        org.jsoup.nodes.Node node13 = textNode2.parent();
        int int14 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode17 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str18 = textNode17.getWholeText();
        java.lang.String str20 = textNode17.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode17.childNodesCopy();
        java.lang.String str22 = textNode17.outerHtml();
        org.jsoup.nodes.Node node23 = textNode17.nextSibling();
        java.lang.String str24 = textNode17.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = textNode2.after((org.jsoup.nodes.Node) textNode17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.lang.String str7 = textNode2.baseUri();
        int int8 = textNode2.childNodeSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.splitText((int) (byte) 1);
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("h");
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText((int) (short) 0);
        org.jsoup.nodes.TextNode textNode13 = textNode11.splitText(0);
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode11.childNodesCopy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        boolean boolean4 = textNode2.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = textNode2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.lang.String str3 = textNode2.nodeName();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str8 = textNode7.getWholeText();
        java.lang.String str9 = textNode7.nodeName();
        org.jsoup.nodes.TextNode textNode11 = textNode7.text("");
        org.jsoup.nodes.Node node13 = textNode7.removeAttr("#text");
        boolean boolean15 = textNode7.hasAttr("hi!");
        org.jsoup.nodes.Node node16 = textNode7.clone();
        boolean boolean17 = textNode2.equals((java.lang.Object) node16);
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode2.childNodesCopy();
        textNode2.setBaseUri("hi!");
        java.lang.String str21 = textNode2.getWholeText();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#text" + "'", str3.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        textNode2.setBaseUri("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("#text");
        java.lang.String str10 = textNode2.absUrl("i!");
        org.jsoup.nodes.TextNode textNode12 = textNode2.splitText((int) (short) 1);
        java.lang.String str13 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode16 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str17 = textNode16.getWholeText();
        java.lang.String str18 = textNode16.nodeName();
        org.jsoup.nodes.TextNode textNode20 = textNode16.splitText((int) (short) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode16.childNodesCopy();
        java.lang.String str23 = textNode16.absUrl("#text");
        org.jsoup.nodes.TextNode textNode25 = textNode16.text("h");
        boolean boolean26 = textNode2.equals((java.lang.Object) textNode16);
        java.lang.String str27 = textNode2.outerHtml();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "h" + "'", str13.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "h" + "'", str27.equals("h"));
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.outerHtml();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode2.attr("#", "#text");
        textNode2.setBaseUri("i!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.siblingNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        java.lang.String str5 = textNode2.text();
        boolean boolean6 = textNode2.isBlank();
        java.lang.String str8 = textNode2.absUrl("#text");
        java.lang.String str9 = textNode2.baseUri();
        textNode2.setBaseUri("i!");
        java.lang.String str12 = textNode2.toString();
        org.jsoup.nodes.Node node13 = textNode2.parent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("#text");
        boolean boolean10 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.before("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        java.lang.String str6 = textNode2.text();
        textNode2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean14 = textNode12.hasAttr("#text");
        org.jsoup.nodes.Node node16 = textNode12.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes17 = textNode12.attributes();
        org.jsoup.nodes.Document document18 = textNode12.ownerDocument();
        boolean boolean20 = textNode12.hasAttr("");
        java.lang.String str22 = textNode12.attr("hi!");
        boolean boolean23 = textNode2.equals((java.lang.Object) textNode12);
        boolean boolean24 = textNode12.isBlank();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node5 = textNode2.attr("#text", "");
        int int6 = node5.siblingIndex();
        org.jsoup.nodes.Node node7 = node5.clone();
        node5.setBaseUri("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Node node8 = textNode2.parent();
        java.lang.String str9 = textNode2.text();
        boolean boolean10 = textNode2.isBlank();
        org.jsoup.nodes.Node node11 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode14.childNodes();
        org.jsoup.nodes.TextNode textNode17 = textNode14.text("hi!");
        org.jsoup.nodes.TextNode textNode19 = textNode17.splitText(1);
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode17.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            node11.replaceWith((org.jsoup.nodes.Node) textNode17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.splitText((int) (byte) 1);
        int int8 = textNode7.siblingIndex();
        textNode7.setBaseUri("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText((int) (short) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.lang.String str7 = textNode2.baseUri();
        boolean boolean8 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node14 = textNode11.attr("#text", "");
        int int15 = textNode11.siblingIndex();
        org.jsoup.nodes.Node node16 = textNode11.parent();
        java.lang.String str17 = textNode11.nodeName();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode11);
        org.jsoup.nodes.Document document19 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            document19.setBaseUri("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "#text" + "'", str17.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document19);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.splitText((int) (byte) 1);
        int int8 = textNode7.siblingIndex();
        org.jsoup.nodes.TextNode textNode10 = textNode7.text("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode7.after("#");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "hi!");
        org.jsoup.nodes.Node node5 = textNode2.attr("h", "#");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node5.after("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        int int8 = textNode2.childNodeSize();
        java.lang.String str9 = textNode2.outerHtml();
        int int10 = textNode2.siblingIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.lang.String str3 = textNode2.nodeName();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str8 = textNode7.getWholeText();
        java.lang.String str9 = textNode7.nodeName();
        org.jsoup.nodes.TextNode textNode11 = textNode7.text("");
        org.jsoup.nodes.Node node13 = textNode7.removeAttr("#text");
        boolean boolean15 = textNode7.hasAttr("hi!");
        org.jsoup.nodes.Node node16 = textNode7.clone();
        boolean boolean17 = textNode2.equals((java.lang.Object) node16);
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node16.siblingNodes();
        node16.setBaseUri("hi!");
        org.jsoup.nodes.Node node21 = node16.nextSibling();
        org.jsoup.nodes.TextNode textNode24 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str25 = textNode24.getWholeText();
        java.lang.String str26 = textNode24.nodeName();
        org.jsoup.nodes.TextNode textNode28 = textNode24.text("");
        java.lang.String str29 = textNode28.nodeName();
        java.lang.String str30 = textNode28.getWholeText();
        boolean boolean31 = textNode28.isBlank();
        org.jsoup.nodes.TextNode textNode33 = textNode28.text("#text");
        boolean boolean34 = node16.equals((java.lang.Object) textNode33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#text" + "'", str3.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "#text" + "'", str26.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "#text" + "'", str29.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("#text");
        java.lang.String str10 = textNode2.absUrl("i!");
        org.jsoup.nodes.TextNode textNode12 = textNode2.splitText((int) (short) 1);
        java.lang.String str13 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode16 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str17 = textNode16.getWholeText();
        java.lang.String str18 = textNode16.nodeName();
        org.jsoup.nodes.TextNode textNode20 = textNode16.splitText((int) (short) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode16.childNodesCopy();
        java.lang.String str23 = textNode16.absUrl("#text");
        org.jsoup.nodes.TextNode textNode25 = textNode16.text("h");
        boolean boolean26 = textNode2.equals((java.lang.Object) textNode16);
        org.jsoup.nodes.Node node29 = textNode16.attr("i!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "h" + "'", str13.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode6 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str7 = textNode6.getWholeText();
        org.jsoup.nodes.Node node8 = textNode6.parent();
        java.lang.String str9 = textNode6.text();
        boolean boolean10 = textNode2.equals((java.lang.Object) str9);
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("i!");
        java.lang.String str13 = textNode2.toString();
        org.jsoup.nodes.Node node15 = textNode2.removeAttr("#");
        org.jsoup.nodes.Node node16 = node15.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "i!" + "'", str13.equals("i!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node5 = textNode2.attr("#text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        org.jsoup.nodes.Node node10 = textNode2.attr("#text", "");
        org.jsoup.nodes.Document document11 = node10.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = document11.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        boolean boolean5 = textNode2.isBlank();
        textNode2.setBaseUri("");
        int int8 = textNode2.childNodeSize();
        java.lang.String str10 = textNode2.attr("");
        java.lang.String str11 = textNode2.toString();
        org.jsoup.nodes.Node node14 = textNode2.attr("h", "i!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        java.lang.String str4 = textNode2.absUrl("i!");
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.absUrl("h");
        org.jsoup.nodes.Node node11 = textNode2.attr("hi!", "i!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node8 = textNode2.attr("h", "#text");
        int int9 = textNode2.childNodeSize();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "h");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        java.lang.String str5 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        boolean boolean8 = textNode2.hasAttr("");
        java.lang.String str9 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.attr("hi!");
        boolean boolean9 = textNode6.isBlank();
        java.lang.String str10 = textNode6.text();
        org.jsoup.nodes.TextNode textNode12 = textNode6.text("#");
        org.jsoup.nodes.Node node15 = textNode6.attr("h", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("#text");
        java.lang.String str10 = textNode2.absUrl("i!");
        org.jsoup.nodes.TextNode textNode12 = textNode2.splitText((int) (short) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode12.childNodes();
        int int14 = textNode12.childNodeSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.splitText((int) (byte) 1);
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str11 = textNode10.getWholeText();
        org.jsoup.nodes.Node node12 = textNode10.parent();
        org.jsoup.nodes.Document document13 = textNode10.ownerDocument();
        boolean boolean15 = textNode10.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode17 = textNode10.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodes();
        org.jsoup.nodes.Node node19 = textNode17.previousSibling();
        boolean boolean20 = textNode7.equals((java.lang.Object) node19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        java.lang.String str5 = textNode2.text();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.getWholeText();
        org.jsoup.nodes.Node node12 = textNode2.attr("h", "hi!");
        org.jsoup.nodes.Node node13 = textNode2.clone();
        int int14 = node13.siblingIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        int int8 = textNode7.siblingIndex();
        java.lang.String str9 = textNode7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.baseUri();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("hi!");
        boolean boolean9 = textNode7.hasAttr("");
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str13 = textNode12.getWholeText();
        org.jsoup.nodes.Node node14 = textNode12.parent();
        org.jsoup.nodes.TextNode textNode16 = textNode12.text("#text");
        boolean boolean17 = textNode7.equals((java.lang.Object) "#text");
        org.jsoup.nodes.Node node18 = textNode7.nextSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str9 = textNode2.text();
        java.lang.String str11 = textNode2.attr("hi!");
        boolean boolean12 = textNode2.isBlank();
        java.lang.String str13 = textNode2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.splitText((int) (byte) 1);
        org.jsoup.nodes.TextNode textNode9 = textNode2.splitText((int) (short) 0);
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "");
        boolean boolean13 = textNode2.equals((java.lang.Object) "");
        boolean boolean14 = textNode2.isBlank();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        boolean boolean8 = textNode2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        int int10 = textNode2.siblingIndex();
        textNode2.setBaseUri("#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        org.jsoup.nodes.Attributes attributes10 = textNode9.attributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode6.nodeName();
        boolean boolean9 = textNode6.hasAttr("hi!");
        org.jsoup.nodes.Node node10 = textNode6.parent();
        java.lang.String str11 = textNode6.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode6.childNodes();
        java.lang.String str13 = textNode6.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        boolean boolean9 = textNode2.isBlank();
        java.lang.String str10 = textNode2.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.attr("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "");
        java.lang.String str8 = textNode2.nodeName();
        java.lang.String str9 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        java.lang.String str11 = textNode2.outerHtml();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.siblingNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str9 = textNode2.nodeName();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        boolean boolean12 = textNode2.hasAttr("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.getWholeText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = textNode2.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "i!" + "'", str4.equals("i!"));
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText((int) (short) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        java.lang.String str9 = textNode2.absUrl("#text");
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("h");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode11.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "#text");
        java.lang.String str4 = textNode2.attr("hi!");
        java.lang.String str6 = textNode2.absUrl("#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode8.nextSibling();
        org.jsoup.nodes.Node node10 = textNode8.previousSibling();
        org.jsoup.nodes.TextNode textNode12 = textNode8.splitText((int) (short) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode8.childNodesCopy();
        org.jsoup.nodes.Node node14 = textNode8.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node14.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.baseUri();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("hi!");
        textNode7.setBaseUri("#");
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean14 = textNode12.hasAttr("#text");
        org.jsoup.nodes.Node node15 = textNode12.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = textNode7.before(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str9 = textNode2.nodeName();
        boolean boolean11 = textNode2.hasAttr("");
        java.lang.String str13 = textNode2.attr("h");
        boolean boolean15 = textNode2.hasAttr("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "#");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        java.lang.String str5 = textNode2.text();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.toString();
        org.jsoup.nodes.Node node11 = textNode2.attr("#", "i!");
        int int12 = textNode2.siblingIndex();
        java.lang.String str13 = textNode2.text();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#", "#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = textNode2.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        int int9 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node12 = textNode2.attr("#text", "i!");
        org.jsoup.nodes.Node node13 = textNode2.parent();
        boolean boolean14 = textNode2.isBlank();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("#text", "");
        org.jsoup.nodes.Node node12 = textNode10.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode2.before(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode8.previousSibling();
        java.lang.String str11 = textNode8.attr("");
        java.lang.String str12 = textNode8.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode6.nodeName();
        int int8 = textNode6.siblingIndex();
        java.lang.String str9 = textNode6.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode6.childNodes();
        org.jsoup.nodes.Attributes attributes11 = textNode6.attributes();
        org.jsoup.nodes.Document document12 = textNode6.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = document12.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        java.lang.String str10 = textNode9.toString();
        org.jsoup.nodes.Node node13 = textNode9.attr("i!", "i!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node5 = textNode2.attr("#text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        org.jsoup.nodes.Node node10 = textNode2.attr("#text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.childNodes();
        org.jsoup.nodes.Node node12 = node10.nextSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.attr("hi!");
        boolean boolean9 = textNode6.isBlank();
        org.jsoup.nodes.Node node10 = textNode6.nextSibling();
        java.lang.String str11 = textNode6.text();
        java.lang.String str13 = textNode6.absUrl("#text");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str8 = textNode2.absUrl("h");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        java.lang.String str11 = textNode2.absUrl("#text");
        java.lang.String str12 = textNode2.toString();
        java.lang.String str14 = textNode2.absUrl("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "");
        java.lang.String str8 = textNode2.nodeName();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.lang.String str10 = textNode2.getWholeText();
        java.lang.String str11 = textNode2.getWholeText();
        java.lang.String str12 = textNode2.outerHtml();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.attr("hi!");
        boolean boolean9 = textNode6.isBlank();
        boolean boolean10 = textNode6.isBlank();
        org.jsoup.nodes.Node node11 = textNode6.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str6 = textNode2.absUrl("#");
        org.jsoup.nodes.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = textNode2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str9 = textNode2.text();
        java.lang.String str11 = textNode2.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode13 = textNode2.splitText((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.lang.String str6 = textNode2.absUrl("#text");
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str12 = textNode11.getWholeText();
        org.jsoup.nodes.Node node13 = textNode11.parent();
        org.jsoup.nodes.Document document14 = textNode11.ownerDocument();
        boolean boolean16 = textNode11.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode18 = textNode11.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode18.childNodes();
        boolean boolean20 = textNode2.equals((java.lang.Object) textNode18);
        java.lang.String str21 = textNode2.nodeName();
        textNode2.setBaseUri("");
        java.lang.String str25 = textNode2.attr("#text");
        textNode2.setBaseUri("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "#text" + "'", str21.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "#");
        org.jsoup.nodes.Node node5 = textNode2.attr("#", "#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        boolean boolean10 = textNode2.hasAttr("");
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        java.lang.String str13 = textNode2.attr("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str9 = textNode2.nodeName();
        java.lang.String str10 = textNode2.text();
        java.lang.String str11 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node13 = textNode2.parent();
        boolean boolean14 = textNode2.isBlank();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str8 = textNode7.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode7.childNodes();
        java.lang.String str11 = textNode7.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode7.childNodesCopy();
        java.lang.String str13 = textNode7.toString();
        org.jsoup.nodes.Node node16 = textNode7.attr("#text", "hi!");
        boolean boolean17 = textNode2.equals((java.lang.Object) node16);
        org.jsoup.nodes.TextNode textNode20 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str21 = textNode20.getWholeText();
        java.lang.String str22 = textNode20.nodeName();
        textNode20.setBaseUri("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode20.childNodesCopy();
        java.lang.String str26 = textNode20.text();
        org.jsoup.nodes.Attributes attributes27 = textNode20.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = node16.after((org.jsoup.nodes.Node) textNode20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "#text" + "'", str22.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes27);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText((int) (short) 1);
        org.jsoup.nodes.Document document7 = textNode6.ownerDocument();
        java.lang.String str8 = textNode6.getWholeText();
        org.jsoup.nodes.Node node9 = textNode6.nextSibling();
        org.jsoup.nodes.TextNode textNode11 = textNode6.text("#text");
        java.lang.String str12 = textNode11.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "i!" + "'", str8.equals("i!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str15 = textNode14.getWholeText();
        java.lang.String str16 = textNode14.nodeName();
        org.jsoup.nodes.TextNode textNode18 = textNode14.splitText((int) (short) 1);
        org.jsoup.nodes.Document document19 = textNode18.ownerDocument();
        java.lang.String str20 = textNode18.getWholeText();
        org.jsoup.nodes.Node node23 = textNode18.attr("#text", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = textNode2.before((org.jsoup.nodes.Node) textNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "i!" + "'", str20.equals("i!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.splitText((int) (byte) 1);
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("h");
        java.lang.String str11 = textNode2.attr("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str7 = textNode2.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode2.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode8.nextSibling();
        org.jsoup.nodes.Node node11 = textNode8.removeAttr("hi!");
        org.jsoup.nodes.Node node12 = textNode8.parent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        boolean boolean5 = textNode2.isBlank();
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node8 = textNode2.parent();
        int int9 = textNode2.childNodeSize();
        java.lang.String str10 = textNode2.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.attr("hi!");
        boolean boolean9 = textNode6.isBlank();
        org.jsoup.nodes.Node node10 = textNode6.nextSibling();
        java.lang.String str11 = textNode6.text();
        java.lang.String str12 = textNode6.outerHtml();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        boolean boolean8 = textNode2.hasAttr("");
        java.lang.Object obj9 = null;
        boolean boolean10 = textNode2.equals(obj9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode8.nextSibling();
        org.jsoup.nodes.Node node10 = textNode8.previousSibling();
        org.jsoup.nodes.TextNode textNode12 = textNode8.text("#");
        org.jsoup.nodes.TextNode textNode15 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str16 = textNode15.toString();
        org.jsoup.nodes.TextNode textNode19 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str20 = textNode19.getWholeText();
        org.jsoup.nodes.Node node21 = textNode19.parent();
        java.lang.String str22 = textNode19.text();
        boolean boolean23 = textNode15.equals((java.lang.Object) str22);
        org.jsoup.nodes.TextNode textNode25 = textNode15.text("i!");
        java.lang.String str26 = textNode15.toString();
        java.lang.String str27 = textNode15.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = textNode12.after((org.jsoup.nodes.Node) textNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "i!" + "'", str26.equals("i!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "#text" + "'", str27.equals("#text"));
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node5 = textNode2.attr("#text", "");
        int int6 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode2.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node5 = textNode2.attr("#text", "");
        java.lang.String str6 = textNode2.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        int int8 = textNode7.siblingIndex();
        org.jsoup.nodes.Node node9 = textNode7.parent();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = node9.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode6.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode6.siblingNodes();
        textNode6.setBaseUri("i!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        org.jsoup.nodes.Node node10 = textNode2.attr("#text", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode2.absUrl("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode10 = textNode2.splitText((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.baseUri();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str10 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode12 = textNode2.splitText((int) (byte) 1);
        textNode12.setBaseUri("");
        org.jsoup.nodes.TextNode textNode17 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodes();
        org.jsoup.nodes.TextNode textNode20 = textNode17.text("hi!");
        org.jsoup.nodes.TextNode textNode22 = textNode17.splitText((int) (byte) 1);
        int int23 = textNode22.siblingIndex();
        boolean boolean24 = textNode12.equals((java.lang.Object) textNode22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }
}

