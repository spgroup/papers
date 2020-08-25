import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        textNode2.ensureAttributes();
        java.lang.String str7 = textNode2.text();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode6 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean8 = textNode6.equals((java.lang.Object) false);
        int int9 = textNode6.siblingIndex();
        org.jsoup.nodes.Attributes attributes10 = textNode6.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode6.siblingNodes();
        org.jsoup.nodes.Node node12 = textNode6.previousSibling();
        boolean boolean13 = textNode6.isBlank();
        boolean boolean15 = textNode6.equals((java.lang.Object) false);
        java.lang.String str17 = textNode6.absUrl("hi!");
        java.lang.String str18 = textNode6.toString();
        int int19 = textNode6.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node3.before((org.jsoup.nodes.Node) textNode6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("hi!");
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str10 = textNode9.outerHtml();
        org.jsoup.nodes.TextNode textNode12 = textNode9.text("");
        boolean boolean13 = textNode12.isBlank();
        int int14 = textNode12.siblingIndex();
        org.jsoup.nodes.Node node15 = textNode12.clone();
        org.jsoup.nodes.Node node17 = textNode12.removeAttr("h");
        org.jsoup.nodes.Document document18 = node17.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document18);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText((int) (byte) 0);
        org.jsoup.nodes.Node node9 = textNode8.nextSibling();
        boolean boolean11 = textNode8.hasAttr("");
        java.lang.String str12 = textNode8.getWholeText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("h", "");
        int int3 = textNode2.childNodeSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        textNode2.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        boolean boolean9 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.jsoup.nodes.Node node11 = textNode2.parent();
        java.lang.String str12 = textNode2.nodeName();
        org.jsoup.nodes.Node node13 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("");
        org.jsoup.nodes.Node node16 = textNode15.previousSibling();
        java.lang.String str18 = textNode15.attr("i!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("hi!");
        boolean boolean6 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node5 = textNode2.attr("hi!", "#text");
        java.lang.String str6 = textNode2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.attr("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        textNode2.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        java.lang.String str11 = textNode9.absUrl("#text");
        java.lang.String str12 = textNode9.text();
        org.jsoup.nodes.Attributes attributes13 = textNode9.attributes();
        java.lang.String str14 = textNode9.nodeName();
        org.jsoup.nodes.TextNode textNode17 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node18 = textNode17.parent();
        boolean boolean19 = textNode17.isBlank();
        org.jsoup.nodes.Document document20 = textNode17.ownerDocument();
        org.jsoup.nodes.TextNode textNode22 = textNode17.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode17.childNodesCopy();
        org.jsoup.nodes.Node node24 = textNode17.nextSibling();
        textNode17.setBaseUri("hi!");
        java.lang.String str28 = textNode17.absUrl("hi!");
        java.lang.String str29 = textNode17.toString();
        java.lang.String str30 = textNode17.nodeName();
        org.jsoup.nodes.Attributes attributes31 = textNode17.attributes();
        boolean boolean32 = textNode9.equals((java.lang.Object) attributes31);
        java.lang.String str33 = textNode9.getWholeText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "#text" + "'", str30.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.toString();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        int int11 = textNode10.siblingIndex();
        textNode10.setBaseUri("#text");
        org.jsoup.nodes.Node node14 = textNode10.parent();
        org.jsoup.nodes.Node node15 = textNode10.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node15.before("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        int int8 = textNode7.childNodeSize();
        java.lang.String str9 = textNode7.nodeName();
        org.jsoup.nodes.TextNode textNode11 = textNode7.text("hi!");
        textNode7.setBaseUri("hi!");
        java.lang.String str15 = textNode7.absUrl("hi!");
        int int16 = textNode7.childNodeSize();
        org.jsoup.nodes.TextNode textNode18 = textNode7.splitText((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode18);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        boolean boolean9 = textNode7.hasAttr("#text");
        org.jsoup.nodes.Attributes attributes10 = textNode7.attributes();
        java.lang.String str11 = textNode7.baseUri();
        boolean boolean12 = textNode7.isBlank();
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode7.traverse(nodeVisitor13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        java.lang.String str4 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(1);
        int int9 = textNode2.siblingIndex();
        java.lang.String str10 = textNode2.outerHtml();
        java.lang.String str12 = textNode2.attr("");
        java.lang.String str14 = textNode2.absUrl("#text");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "h" + "'", str10.equals("h"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "i!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        boolean boolean9 = textNode2.hasAttr("hi!");
        java.lang.String str10 = textNode2.getWholeText();
        textNode2.ensureAttributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        int int4 = textNode2.siblingIndex();
        textNode2.ensureAttributes();
        org.jsoup.nodes.TextNode textNode7 = textNode2.splitText((int) (byte) 1);
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("i!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode5.childNodesCopy();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node11 = textNode10.parent();
        boolean boolean12 = textNode10.isBlank();
        org.jsoup.nodes.Document document13 = textNode10.ownerDocument();
        org.jsoup.nodes.TextNode textNode15 = textNode10.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode10.childNodesCopy();
        java.lang.String str17 = textNode10.text();
        boolean boolean18 = textNode10.isBlank();
        textNode10.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode10.childNodesCopy();
        boolean boolean22 = textNode5.equals((java.lang.Object) textNode10);
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode10.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode10.siblingNodes();
        java.lang.String str25 = textNode10.nodeName();
        boolean boolean27 = textNode10.hasAttr("");
        org.jsoup.nodes.Node node28 = textNode10.nextSibling();
        int int29 = textNode10.childNodeSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "#text" + "'", str25.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        textNode2.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        java.lang.String str11 = textNode9.absUrl("#text");
        java.lang.String str12 = textNode9.text();
        org.jsoup.nodes.Attributes attributes13 = textNode9.attributes();
        boolean boolean15 = textNode9.hasAttr("hi!");
        java.lang.String str16 = textNode9.baseUri();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node5 = textNode2.attr("#text", "");
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.TextNode textNode15 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        java.lang.String str16 = textNode15.baseUri();
        int int17 = textNode15.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node12 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes13 = textNode2.attributes();
        boolean boolean15 = textNode2.hasAttr("h");
        java.lang.String str16 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode19 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean21 = textNode19.equals((java.lang.Object) false);
        int int22 = textNode19.siblingIndex();
        textNode19.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode19.siblingNodes();
        org.jsoup.nodes.TextNode textNode26 = textNode19.text("");
        java.lang.String str28 = textNode26.absUrl("#text");
        java.lang.String str29 = textNode26.text();
        org.jsoup.nodes.Attributes attributes30 = textNode26.attributes();
        java.lang.String str31 = textNode26.nodeName();
        org.jsoup.nodes.Node node33 = textNode26.removeAttr("h");
        boolean boolean34 = textNode2.equals((java.lang.Object) "h");
        java.lang.String str35 = textNode2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "#text" + "'", str31.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        int int8 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        org.jsoup.nodes.Document document11 = textNode10.ownerDocument();
        java.lang.String str12 = textNode10.nodeName();
        boolean boolean14 = textNode10.hasAttr("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = textNode10.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        boolean boolean9 = textNode2.hasAttr("hi!");
        java.lang.String str10 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node12 = textNode2.nextSibling();
        boolean boolean13 = textNode2.isBlank();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        java.lang.String str4 = textNode2.getWholeText();
        textNode2.ensureAttributes();
        boolean boolean7 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        boolean boolean10 = textNode2.isBlank();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode2.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        int int9 = textNode2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        java.lang.String str12 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode15 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str16 = textNode15.outerHtml();
        org.jsoup.nodes.TextNode textNode18 = textNode15.text("#text");
        boolean boolean20 = textNode15.equals((java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = textNode2.after((org.jsoup.nodes.Node) textNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        java.lang.String str5 = textNode2.text();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        java.lang.String str10 = textNode2.getWholeText();
        org.jsoup.nodes.Node node13 = textNode2.attr("hi!", "");
        org.jsoup.nodes.Document document14 = node13.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node13.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node12 = textNode2.parent();
        org.jsoup.nodes.Node node13 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode16 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node17 = textNode16.parent();
        boolean boolean18 = textNode16.isBlank();
        org.jsoup.nodes.Node node19 = textNode16.parent();
        java.lang.Class<?> wildcardClass20 = textNode16.getClass();
        boolean boolean21 = textNode2.equals((java.lang.Object) textNode16);
        boolean boolean23 = textNode2.hasAttr("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.lang.String str8 = textNode2.text();
        java.lang.String str9 = textNode2.getWholeText();
        java.lang.String str11 = textNode2.attr("");
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = textNode2.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = textNode2.text();
        int int6 = textNode2.siblingIndex();
        textNode2.ensureAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode2.attr("", "#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node12 = textNode2.parent();
        java.lang.String str13 = textNode2.nodeName();
        org.jsoup.nodes.Node node14 = textNode2.nextSibling();
        org.jsoup.nodes.Node node15 = textNode2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.childNodes();
        java.lang.String str17 = textNode2.outerHtml();
        java.lang.Class<?> wildcardClass18 = textNode2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.after("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        int int6 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        boolean boolean8 = textNode2.isBlank();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "hi!");
        java.lang.String str8 = node7.baseUri();
        node7.setBaseUri("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        textNode2.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        java.lang.String str11 = textNode9.absUrl("#text");
        java.lang.String str12 = textNode9.text();
        org.jsoup.nodes.Attributes attributes13 = textNode9.attributes();
        org.jsoup.nodes.Node node14 = textNode9.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = textNode9.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.nodeName();
        textNode2.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#text" + "'", str3.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        org.jsoup.nodes.Node node11 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node15 = textNode14.previousSibling();
        java.lang.String str16 = textNode14.text();
        org.jsoup.nodes.Document document17 = textNode14.ownerDocument();
        org.jsoup.nodes.Node node18 = textNode14.clone();
        org.jsoup.nodes.Node node19 = node18.clone();
        org.jsoup.nodes.Node node20 = node18.parent();
        org.jsoup.nodes.Document document21 = node18.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = textNode2.before((org.jsoup.nodes.Node) document21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document21);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        textNode2.ensureAttributes();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.getWholeText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.baseUri();
        textNode2.setBaseUri("hi!");
        int int6 = textNode2.childNodeSize();
        int int7 = textNode2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.baseUri();
        textNode2.setBaseUri("hi!");
        java.lang.String str6 = textNode2.baseUri();
        java.lang.String str7 = textNode2.baseUri();
        boolean boolean8 = textNode2.isBlank();
        org.jsoup.nodes.Node node11 = textNode2.attr("#text", "");
        int int12 = textNode2.childNodeSize();
        org.jsoup.nodes.Document document13 = textNode2.ownerDocument();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        boolean boolean5 = textNode2.isBlank();
        java.lang.String str6 = textNode2.toString();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.lang.String str8 = textNode2.text();
        java.lang.String str9 = textNode2.getWholeText();
        java.lang.String str11 = textNode2.absUrl("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.before("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.lang.String str8 = textNode2.baseUri();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str5 = textNode2.nodeName();
        textNode2.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        textNode2.ensureAttributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("#text");
        int int5 = textNode2.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        java.lang.String str4 = textNode2.getWholeText();
        textNode2.ensureAttributes();
        boolean boolean7 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        int int9 = textNode2.childNodeSize();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        java.lang.String str5 = textNode2.text();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode7.childNodesCopy();
        java.lang.String str10 = textNode7.outerHtml();
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        org.jsoup.nodes.Attributes attributes14 = textNode13.attributes();
        boolean boolean15 = textNode7.equals((java.lang.Object) attributes14);
        org.jsoup.nodes.TextNode textNode18 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean20 = textNode18.equals((java.lang.Object) false);
        org.jsoup.nodes.Node node23 = textNode18.attr("hi!", "");
        java.lang.String str24 = textNode18.text();
        boolean boolean25 = textNode7.equals((java.lang.Object) textNode18);
        org.jsoup.nodes.Node node26 = textNode7.previousSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode8 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node9 = textNode8.parent();
        boolean boolean10 = textNode8.isBlank();
        org.jsoup.nodes.Document document11 = textNode8.ownerDocument();
        org.jsoup.nodes.TextNode textNode13 = textNode8.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode8.childNodesCopy();
        org.jsoup.nodes.Node node15 = textNode8.nextSibling();
        textNode8.setBaseUri("hi!");
        org.jsoup.nodes.Node node18 = textNode8.parent();
        int int19 = textNode8.siblingIndex();
        boolean boolean20 = textNode5.equals((java.lang.Object) int19);
        boolean boolean21 = textNode5.isBlank();
        int int22 = textNode5.childNodeSize();
        java.lang.String str23 = textNode5.nodeName();
        org.jsoup.nodes.Node node25 = textNode5.removeAttr("h");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node25.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "#text" + "'", str23.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode6 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str7 = textNode6.outerHtml();
        org.jsoup.nodes.TextNode textNode9 = textNode6.text("");
        boolean boolean10 = textNode2.equals((java.lang.Object) "");
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        int int12 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.siblingNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.nodeName();
        java.lang.String str11 = textNode2.toString();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.siblingNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        int int10 = textNode2.childNodeSize();
        org.jsoup.nodes.Document document11 = textNode2.ownerDocument();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        boolean boolean9 = textNode2.isBlank();
        java.lang.String str11 = textNode2.absUrl("#text");
        textNode2.ensureAttributes();
        java.lang.String str13 = textNode2.toString();
        java.lang.String str14 = textNode2.getWholeText();
        java.lang.String str15 = textNode2.baseUri();
        java.lang.String str16 = textNode2.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        int int5 = textNode2.siblingIndex();
        java.lang.String str6 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        textNode8.setBaseUri("#text");
        boolean boolean12 = textNode8.hasAttr("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.lang.String str10 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node12 = textNode2.parent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        org.jsoup.nodes.Document document8 = textNode7.ownerDocument();
        org.jsoup.nodes.Node node9 = textNode7.previousSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        boolean boolean9 = textNode2.isBlank();
        boolean boolean11 = textNode2.equals((java.lang.Object) false);
        java.lang.String str13 = textNode2.absUrl("hi!");
        java.lang.String str14 = textNode2.nodeName();
        org.jsoup.nodes.Node node15 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("h");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str5 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.lang.String str7 = textNode2.getWholeText();
        int int8 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.after("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode6 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node7 = textNode6.parent();
        boolean boolean8 = textNode6.isBlank();
        org.jsoup.nodes.Document document9 = textNode6.ownerDocument();
        org.jsoup.nodes.TextNode textNode11 = textNode6.text("");
        java.lang.String str12 = textNode6.getWholeText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.after((org.jsoup.nodes.Node) textNode6);
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
        org.junit.Assert.assertNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str4 = textNode2.attr("i!");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        boolean boolean5 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        org.jsoup.nodes.Node node9 = textNode2.attr("#text", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node8 = textNode2.attr("h", "#text");
        java.lang.String str9 = node8.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.siblingNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        int int5 = textNode2.siblingIndex();
        java.lang.String str6 = textNode2.text();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode2.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        boolean boolean9 = textNode2.isBlank();
        java.lang.String str11 = textNode2.absUrl("#text");
        int int12 = textNode2.siblingIndex();
        java.lang.String str13 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str17 = textNode16.baseUri();
        java.lang.String str18 = textNode16.toString();
        org.jsoup.nodes.Attributes attributes19 = textNode16.attributes();
        org.jsoup.nodes.TextNode textNode21 = textNode16.text("");
        org.jsoup.nodes.Document document22 = textNode21.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) document22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document22);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.toString();
        textNode2.setBaseUri("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode8 = textNode2.splitText((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode6 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str7 = textNode6.outerHtml();
        org.jsoup.nodes.TextNode textNode9 = textNode6.text("");
        boolean boolean10 = textNode2.equals((java.lang.Object) "");
        java.lang.String str11 = textNode2.getWholeText();
        textNode2.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.childNodes();
        org.jsoup.nodes.Attributes attributes14 = textNode2.attributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str7 = textNode2.attr("");
        boolean boolean8 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("hi!");
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(0);
        java.lang.String str10 = textNode2.absUrl("h");
        java.lang.String str11 = textNode2.nodeName();
        textNode2.ensureAttributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        java.lang.String str5 = textNode2.text();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("hi!");
        boolean boolean9 = textNode2.hasAttr("#text");
        java.lang.String str11 = textNode2.attr("#text");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        boolean boolean6 = textNode5.isBlank();
        org.jsoup.nodes.Node node7 = textNode5.nextSibling();
        boolean boolean9 = textNode5.equals((java.lang.Object) (-1));
        java.lang.String str10 = textNode5.getWholeText();
        textNode5.ensureAttributes();
        textNode5.setBaseUri("hi!");
        textNode5.setBaseUri("#text");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = textNode2.text();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node11 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("");
        java.lang.String str14 = textNode13.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = textNode13.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        java.lang.String str4 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(1);
        org.jsoup.nodes.Node node9 = textNode8.previousSibling();
        org.jsoup.nodes.Node node11 = textNode8.removeAttr("hi!");
        org.jsoup.nodes.Node node12 = textNode8.nextSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
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
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        boolean boolean9 = textNode2.isBlank();
        boolean boolean11 = textNode2.equals((java.lang.Object) false);
        java.lang.String str13 = textNode2.absUrl("hi!");
        java.lang.String str14 = textNode2.toString();
        int int15 = textNode2.childNodeSize();
        java.lang.String str16 = textNode2.text();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode5.before("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean13 = textNode11.equals((java.lang.Object) false);
        int int14 = textNode11.siblingIndex();
        org.jsoup.nodes.Attributes attributes15 = textNode11.attributes();
        org.jsoup.nodes.Node node16 = textNode11.clone();
        org.jsoup.nodes.Document document17 = textNode11.ownerDocument();
        java.lang.String str19 = textNode11.attr("");
        java.lang.String str21 = textNode11.attr("");
        java.lang.String str22 = textNode11.getWholeText();
        org.jsoup.nodes.TextNode textNode25 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean27 = textNode25.equals((java.lang.Object) false);
        int int28 = textNode25.siblingIndex();
        org.jsoup.nodes.Attributes attributes29 = textNode25.attributes();
        org.jsoup.nodes.Node node30 = textNode25.clone();
        org.jsoup.nodes.Document document31 = textNode25.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = textNode25.childNodes();
        java.lang.String str33 = textNode25.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = textNode25.childNodesCopy();
        boolean boolean35 = textNode11.equals((java.lang.Object) nodeList34);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = textNode2.after((org.jsoup.nodes.Node) textNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        java.lang.String str8 = textNode2.text();
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        java.lang.String str12 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode15.siblingNodes();
        java.lang.String str17 = textNode15.toString();
        boolean boolean19 = textNode15.hasAttr("");
        org.jsoup.nodes.Node node20 = textNode15.clone();
        int int21 = node20.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = textNode2.after(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        java.lang.String str4 = textNode2.getWholeText();
        textNode2.ensureAttributes();
        boolean boolean7 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        int int9 = textNode2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode5.childNodesCopy();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node11 = textNode10.parent();
        boolean boolean12 = textNode10.isBlank();
        org.jsoup.nodes.Document document13 = textNode10.ownerDocument();
        org.jsoup.nodes.TextNode textNode15 = textNode10.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode10.childNodesCopy();
        java.lang.String str17 = textNode10.text();
        boolean boolean18 = textNode10.isBlank();
        textNode10.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode10.childNodesCopy();
        boolean boolean22 = textNode5.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.Node node23 = textNode5.clone();
        org.jsoup.nodes.Attributes attributes24 = textNode5.attributes();
        org.jsoup.nodes.TextNode textNode27 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean29 = textNode27.equals((java.lang.Object) false);
        org.jsoup.nodes.Node node32 = textNode27.attr("hi!", "");
        java.lang.String str33 = textNode27.text();
        org.jsoup.nodes.Attributes attributes34 = textNode27.attributes();
        java.lang.String str35 = textNode27.nodeName();
        textNode27.ensureAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = textNode5.after((org.jsoup.nodes.Node) textNode27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "#text" + "'", str35.equals("#text"));
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        java.lang.String str5 = textNode2.text();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        int int8 = textNode2.siblingIndex();
        int int9 = textNode2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean15 = textNode13.equals((java.lang.Object) false);
        java.lang.String str16 = textNode13.text();
        org.jsoup.nodes.TextNode textNode18 = textNode13.text("hi!");
        java.lang.String str20 = textNode13.attr("");
        boolean boolean21 = textNode2.equals((java.lang.Object) textNode13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.baseUri();
        textNode2.setBaseUri("hi!");
        java.lang.String str6 = textNode2.baseUri();
        java.lang.String str7 = textNode2.baseUri();
        boolean boolean8 = textNode2.isBlank();
        org.jsoup.nodes.Node node11 = textNode2.attr("#text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode14 = textNode2.splitText((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.lang.String str8 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
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
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.toString();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        int int11 = textNode10.siblingIndex();
        textNode10.setBaseUri("#text");
        org.jsoup.nodes.Node node14 = textNode10.parent();
        org.jsoup.nodes.Node node15 = textNode10.clone();
        // The following exception was thrown during execution in test generation
        try {
            textNode10.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("#text");
        boolean boolean9 = textNode2.isBlank();
        int int10 = textNode2.childNodeSize();
        java.lang.String str11 = textNode2.text();
        java.lang.String str13 = textNode2.attr("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        int int8 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        org.jsoup.nodes.Attributes attributes11 = textNode10.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode10.siblingNodes();
        boolean boolean13 = textNode10.isBlank();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        java.lang.String str9 = textNode2.attr("hi!");
        java.lang.String str10 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node14 = textNode13.previousSibling();
        java.lang.String str15 = textNode13.text();
        int int16 = textNode13.siblingIndex();
        org.jsoup.nodes.TextNode textNode18 = textNode13.text("");
        int int19 = textNode18.childNodeSize();
        java.lang.String str20 = textNode18.nodeName();
        org.jsoup.nodes.Attributes attributes21 = textNode18.attributes();
        org.jsoup.nodes.Attributes attributes22 = textNode18.attributes();
        boolean boolean23 = textNode2.equals((java.lang.Object) textNode18);
        org.jsoup.nodes.Node node24 = textNode2.parent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "#text" + "'", str20.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        int int5 = textNode2.siblingIndex();
        java.lang.String str6 = textNode2.text();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode2.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode5.childNodesCopy();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node11 = textNode10.parent();
        boolean boolean12 = textNode10.isBlank();
        org.jsoup.nodes.Document document13 = textNode10.ownerDocument();
        org.jsoup.nodes.TextNode textNode15 = textNode10.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode10.childNodesCopy();
        java.lang.String str17 = textNode10.text();
        boolean boolean18 = textNode10.isBlank();
        textNode10.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode10.childNodesCopy();
        boolean boolean22 = textNode5.equals((java.lang.Object) textNode10);
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode10.siblingNodes();
        org.jsoup.nodes.TextNode textNode26 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean28 = textNode26.equals((java.lang.Object) false);
        int int29 = textNode26.siblingIndex();
        org.jsoup.nodes.Attributes attributes30 = textNode26.attributes();
        org.jsoup.nodes.Node node31 = textNode26.clone();
        org.jsoup.nodes.Document document32 = textNode26.ownerDocument();
        java.lang.String str34 = textNode26.attr("");
        java.lang.String str36 = textNode26.attr("");
        boolean boolean37 = textNode10.equals((java.lang.Object) "");
        org.jsoup.nodes.Attributes attributes38 = textNode10.attributes();
        java.lang.String str39 = textNode10.baseUri();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        java.util.List<org.jsoup.nodes.Node> nodeList1 = textNode0.childNodesCopy();
        org.jsoup.nodes.Node node2 = textNode0.parent();
        boolean boolean3 = textNode0.isBlank();
        textNode0.setBaseUri("#text");
        java.lang.String str6 = textNode0.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = textNode0.hasAttr("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        boolean boolean11 = textNode2.hasAttr("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.Node node11 = textNode2.attr("#text", "");
        java.lang.String str13 = textNode2.absUrl("i!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.baseUri();
        textNode2.setBaseUri("hi!");
        int int6 = textNode2.childNodeSize();
        int int7 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode2.after("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("hi!");
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int10 = textNode9.childNodeSize();
        java.lang.String str11 = textNode9.getWholeText();
        org.jsoup.nodes.TextNode textNode13 = textNode9.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode9.childNodesCopy();
        org.jsoup.nodes.TextNode textNode16 = textNode9.text("");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode16);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        textNode2.setBaseUri("hi!");
        java.lang.String str13 = textNode2.absUrl("hi!");
        java.lang.String str14 = textNode2.toString();
        java.lang.String str15 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes16 = textNode2.attributes();
        org.jsoup.nodes.Node node17 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode20 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str21 = textNode20.toString();
        org.jsoup.nodes.Node node22 = textNode20.clone();
        java.lang.String str23 = textNode20.text();
        org.jsoup.nodes.TextNode textNode25 = textNode20.text("#text");
        org.jsoup.nodes.Node node27 = textNode20.removeAttr("#text");
        java.lang.String str28 = textNode20.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = textNode20.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode20.childNodesCopy();
        java.lang.String str31 = textNode20.nodeName();
        org.jsoup.nodes.Node node33 = textNode20.removeAttr("#text");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith(node33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#text" + "'", str15.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "#text" + "'", str28.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "#text" + "'", str31.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node33);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        textNode2.setBaseUri("hi!");
        java.lang.String str13 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Node node14 = textNode2.parent();
        java.lang.String str15 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.siblingNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node4.before("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        node4.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node4.siblingNodes();
        org.jsoup.nodes.Node node8 = node4.previousSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        int int8 = textNode7.childNodeSize();
        java.lang.String str9 = textNode7.nodeName();
        org.jsoup.nodes.TextNode textNode11 = textNode7.text("hi!");
        textNode7.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes14 = textNode7.attributes();
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("#text", "");
        org.jsoup.nodes.Node node18 = textNode17.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = textNode7.after((org.jsoup.nodes.Node) textNode17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.text();
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        java.lang.String str11 = node10.outerHtml();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        java.lang.String str6 = textNode2.outerHtml();
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
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.Node node11 = textNode2.attr("#text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.siblingNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        textNode2.setBaseUri("");
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(1);
        boolean boolean9 = textNode2.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode6 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str7 = textNode6.outerHtml();
        org.jsoup.nodes.TextNode textNode9 = textNode6.text("");
        boolean boolean10 = textNode2.equals((java.lang.Object) "");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node12 = textNode2.previousSibling();
        java.lang.String str13 = textNode2.text();
        java.lang.String str14 = textNode2.baseUri();
        int int15 = textNode2.siblingIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.lang.String str9 = textNode2.text();
        boolean boolean11 = textNode2.hasAttr("#text");
        java.lang.String str12 = textNode2.baseUri();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        boolean boolean8 = textNode2.isBlank();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        boolean boolean9 = textNode2.isBlank();
        java.lang.String str11 = textNode2.absUrl("#text");
        textNode2.ensureAttributes();
        java.lang.String str13 = textNode2.toString();
        java.lang.String str14 = textNode2.getWholeText();
        java.lang.String str15 = textNode2.baseUri();
        java.lang.String str16 = textNode2.outerHtml();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.Node node8 = node6.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node6.childNodesCopy();
        org.jsoup.nodes.Node node10 = node6.previousSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        int int8 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        org.jsoup.nodes.Attributes attributes11 = textNode10.attributes();
        org.jsoup.nodes.TextNode textNode13 = textNode10.splitText((int) (short) 0);
        textNode13.setBaseUri("");
        java.lang.String str16 = textNode13.baseUri();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        textNode2.ensureAttributes();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.text();
        int int9 = textNode2.siblingIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.toString();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        int int11 = textNode10.siblingIndex();
        textNode10.setBaseUri("#text");
        org.jsoup.nodes.Node node14 = textNode10.parent();
        org.jsoup.nodes.Node node15 = textNode10.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode10.siblingNodes();
        java.lang.String str18 = textNode10.absUrl("#text");
        java.lang.String str19 = textNode10.toString();
        textNode10.ensureAttributes();
        org.jsoup.nodes.Node node21 = textNode10.parent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "#text" + "'", str19.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        int int6 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.absUrl("#text");
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.lang.String str8 = textNode2.text();
        java.lang.String str9 = textNode2.getWholeText();
        java.lang.String str11 = textNode2.attr("");
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node16 = textNode2.attr("h", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        int int5 = textNode2.siblingIndex();
        java.lang.String str6 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        boolean boolean9 = textNode2.isBlank();
        int int10 = textNode2.childNodeSize();
        textNode2.setBaseUri("#text");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        boolean boolean5 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        java.lang.String str7 = textNode2.text();
        boolean boolean9 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("hi!");
        java.lang.String str12 = textNode2.toString();
        textNode2.setBaseUri("i!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        boolean boolean6 = textNode2.isBlank();
        textNode2.ensureAttributes();
        boolean boolean8 = textNode2.isBlank();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        boolean boolean7 = textNode2.isBlank();
        textNode2.ensureAttributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        int int8 = textNode7.childNodeSize();
        java.lang.String str9 = textNode7.nodeName();
        org.jsoup.nodes.TextNode textNode11 = textNode7.text("hi!");
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node15 = textNode14.previousSibling();
        java.lang.String str16 = textNode14.text();
        java.lang.String str17 = textNode14.text();
        boolean boolean18 = textNode11.equals((java.lang.Object) str17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = textNode11.attr("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("i!", "i!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        textNode2.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        java.lang.String str11 = textNode9.absUrl("#text");
        java.lang.String str12 = textNode9.text();
        org.jsoup.nodes.Attributes attributes13 = textNode9.attributes();
        boolean boolean15 = textNode9.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode18 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str19 = textNode18.toString();
        org.jsoup.nodes.Document document20 = textNode18.ownerDocument();
        java.lang.String str21 = textNode18.nodeName();
        org.jsoup.nodes.Node node22 = textNode18.parent();
        org.jsoup.nodes.TextNode textNode24 = textNode18.text("hi!");
        org.jsoup.nodes.Node node25 = textNode18.nextSibling();
        boolean boolean27 = textNode18.hasAttr("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = textNode9.before((org.jsoup.nodes.Node) textNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "#text" + "'", str21.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode5.childNodesCopy();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node11 = textNode10.parent();
        boolean boolean12 = textNode10.isBlank();
        org.jsoup.nodes.Document document13 = textNode10.ownerDocument();
        org.jsoup.nodes.TextNode textNode15 = textNode10.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode10.childNodesCopy();
        java.lang.String str17 = textNode10.text();
        boolean boolean18 = textNode10.isBlank();
        textNode10.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode10.childNodesCopy();
        boolean boolean22 = textNode5.equals((java.lang.Object) textNode10);
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode10.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode10.siblingNodes();
        java.lang.String str25 = textNode10.nodeName();
        org.jsoup.nodes.TextNode textNode28 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean30 = textNode28.equals((java.lang.Object) false);
        int int31 = textNode28.siblingIndex();
        org.jsoup.nodes.Attributes attributes32 = textNode28.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = textNode28.siblingNodes();
        org.jsoup.nodes.Node node34 = textNode28.previousSibling();
        boolean boolean35 = textNode28.isBlank();
        boolean boolean37 = textNode28.equals((java.lang.Object) false);
        boolean boolean38 = textNode10.equals((java.lang.Object) boolean37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "#text" + "'", str25.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("hi!");
        boolean boolean9 = textNode2.hasAttr("h");
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        textNode5.ensureAttributes();
        org.jsoup.nodes.Node node8 = textNode5.removeAttr("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.lang.String str8 = textNode2.text();
        java.lang.String str9 = textNode2.outerHtml();
        org.jsoup.nodes.Node node12 = textNode2.attr("#text", "hi!");
        org.jsoup.nodes.TextNode textNode15 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str16 = textNode15.outerHtml();
        org.jsoup.nodes.TextNode textNode18 = textNode15.text("");
        int int19 = textNode18.childNodeSize();
        java.lang.String str20 = textNode18.baseUri();
        org.jsoup.nodes.TextNode textNode22 = textNode18.text("#text");
        org.jsoup.nodes.TextNode textNode25 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node26 = textNode25.previousSibling();
        java.lang.String str27 = textNode25.text();
        org.jsoup.nodes.Document document28 = textNode25.ownerDocument();
        org.jsoup.nodes.Node node29 = textNode25.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode25.childNodes();
        java.lang.String str31 = textNode25.baseUri();
        java.lang.String str33 = textNode25.absUrl("hi!");
        boolean boolean34 = textNode18.equals((java.lang.Object) textNode25);
        boolean boolean35 = textNode2.equals((java.lang.Object) boolean34);
        textNode2.ensureAttributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        java.lang.String str4 = textNode2.attr("");
        java.lang.Class<?> wildcardClass5 = textNode2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        boolean boolean9 = textNode2.isBlank();
        java.lang.String str11 = textNode2.absUrl("#text");
        textNode2.ensureAttributes();
        java.lang.String str13 = textNode2.toString();
        java.lang.String str14 = textNode2.getWholeText();
        java.lang.String str15 = textNode2.baseUri();
        org.jsoup.nodes.Node node17 = textNode2.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = textNode2.after("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.lang.String str7 = textNode5.baseUri();
        org.jsoup.nodes.Node node8 = textNode5.parent();
        boolean boolean9 = textNode5.isBlank();
        org.jsoup.nodes.Document document10 = textNode5.ownerDocument();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str10 = textNode2.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("#text", "");
        java.lang.String str17 = textNode16.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node13.before((org.jsoup.nodes.Node) textNode16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.lang.String str8 = textNode2.text();
        java.lang.String str9 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        textNode2.ensureAttributes();
        java.lang.String str12 = textNode2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        textNode2.ensureAttributes();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean13 = textNode11.equals((java.lang.Object) false);
        int int14 = textNode11.siblingIndex();
        textNode11.ensureAttributes();
        java.lang.String str16 = textNode11.getWholeText();
        org.jsoup.nodes.Node node17 = textNode11.clone();
        org.jsoup.nodes.Node node18 = textNode11.parent();
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
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("h", "#text");
        org.jsoup.nodes.TextNode textNode5 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str6 = textNode5.toString();
        java.lang.String str7 = textNode5.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode5.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode5.nextSibling();
        java.lang.String str10 = textNode5.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode2.after((org.jsoup.nodes.Node) textNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        int int6 = textNode2.siblingIndex();
        boolean boolean8 = textNode2.hasAttr("");
        boolean boolean9 = textNode2.isBlank();
        java.lang.String str11 = textNode2.attr("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        boolean boolean7 = textNode2.isBlank();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode5.childNodesCopy();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node11 = textNode10.parent();
        boolean boolean12 = textNode10.isBlank();
        org.jsoup.nodes.Document document13 = textNode10.ownerDocument();
        org.jsoup.nodes.TextNode textNode15 = textNode10.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode10.childNodesCopy();
        java.lang.String str17 = textNode10.text();
        boolean boolean18 = textNode10.isBlank();
        textNode10.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode10.childNodesCopy();
        boolean boolean22 = textNode5.equals((java.lang.Object) textNode10);
        boolean boolean24 = textNode10.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode10.siblingNodes();
        org.jsoup.nodes.TextNode textNode28 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean30 = textNode28.equals((java.lang.Object) false);
        int int31 = textNode28.siblingIndex();
        textNode28.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = textNode28.siblingNodes();
        java.lang.String str35 = textNode28.attr("");
        java.lang.String str36 = textNode28.text();
        java.lang.String str37 = textNode28.nodeName();
        boolean boolean38 = textNode10.equals((java.lang.Object) textNode28);
        boolean boolean40 = textNode28.hasAttr("i!");
        org.jsoup.nodes.Node node42 = textNode28.removeAttr("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "#text" + "'", str37.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node42);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        int int10 = textNode2.childNodeSize();
        java.lang.String str11 = textNode2.toString();
        java.lang.String str12 = textNode2.getWholeText();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        boolean boolean9 = textNode7.hasAttr("#text");
        org.jsoup.nodes.Attributes attributes10 = textNode7.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode7.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode13 = textNode7.splitText((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        java.lang.String str4 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        java.lang.String str9 = textNode2.absUrl("hi!");
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode2.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode5.childNodesCopy();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node11 = textNode10.parent();
        boolean boolean12 = textNode10.isBlank();
        org.jsoup.nodes.Document document13 = textNode10.ownerDocument();
        org.jsoup.nodes.TextNode textNode15 = textNode10.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode10.childNodesCopy();
        java.lang.String str17 = textNode10.text();
        boolean boolean18 = textNode10.isBlank();
        textNode10.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode10.childNodesCopy();
        boolean boolean22 = textNode5.equals((java.lang.Object) textNode10);
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode10.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode10.siblingNodes();
        java.lang.String str25 = textNode10.nodeName();
        textNode10.ensureAttributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "#text" + "'", str25.equals("#text"));
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode7.isBlank();
        java.lang.String str10 = textNode7.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode7.siblingNodes();
        java.lang.String str12 = textNode7.getWholeText();
        org.jsoup.nodes.Attributes attributes13 = textNode7.attributes();
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode7);
        java.lang.String str15 = textNode7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "#text");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        java.lang.String str4 = textNode2.text();
        java.lang.String str6 = textNode2.attr("");
        java.lang.String str7 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.before(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str10 = textNode2.absUrl("hi!");
        boolean boolean11 = textNode2.isBlank();
        java.lang.String str12 = textNode2.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.lang.String str7 = textNode5.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode5.childNodesCopy();
        java.lang.String str9 = textNode5.toString();
        java.lang.String str10 = textNode5.baseUri();
        int int11 = textNode5.childNodeSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        textNode2.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        java.lang.String str10 = textNode2.toString();
        java.lang.Class<?> wildcardClass11 = textNode2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        boolean boolean9 = textNode7.hasAttr("#text");
        java.lang.String str10 = textNode7.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.attr("h", "#text");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#text" + "'", str3.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = textNode2.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        java.lang.Class<?> wildcardClass3 = textNode2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        textNode2.setBaseUri("hi!");
        java.lang.String str13 = textNode2.absUrl("hi!");
        java.lang.String str14 = textNode2.toString();
        java.lang.String str15 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes16 = textNode2.attributes();
        textNode2.ensureAttributes();
        boolean boolean19 = textNode2.hasAttr("hi!");
        java.lang.String str20 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node22 = textNode2.clone();
        org.jsoup.nodes.Node node23 = node22.previousSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#text" + "'", str15.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "#text" + "'", str20.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.nodeName();
        java.lang.String str12 = textNode2.absUrl("#text");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode8 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Attributes attributes9 = textNode8.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode8.childNodes();
        int int11 = textNode8.siblingIndex();
        org.jsoup.nodes.Node node13 = textNode8.removeAttr("h");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode2.before(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.lang.String str10 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        java.lang.String str12 = textNode2.text();
        org.jsoup.nodes.Node node13 = textNode2.parent();
        java.lang.String str14 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.siblingNodes();
        textNode2.ensureAttributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodesCopy();
        textNode2.ensureAttributes();
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node10 = textNode9.parent();
        boolean boolean11 = textNode9.isBlank();
        org.jsoup.nodes.Node node12 = textNode9.parent();
        org.jsoup.nodes.TextNode textNode15 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node16 = textNode15.previousSibling();
        java.lang.String str17 = textNode15.text();
        int int18 = textNode15.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode15.childNodesCopy();
        org.jsoup.nodes.Node node20 = textNode15.nextSibling();
        int int21 = textNode15.childNodeSize();
        java.lang.Class<?> wildcardClass22 = textNode15.getClass();
        boolean boolean23 = textNode9.equals((java.lang.Object) wildcardClass22);
        java.lang.String str24 = textNode9.nodeName();
        boolean boolean25 = textNode2.equals((java.lang.Object) textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "#text" + "'", str24.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        textNode2.setBaseUri("hi!");
        java.lang.String str13 = textNode2.absUrl("hi!");
        java.lang.String str14 = textNode2.toString();
        java.lang.String str15 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes16 = textNode2.attributes();
        textNode2.ensureAttributes();
        java.lang.String str18 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode2.childNodes();
        boolean boolean20 = textNode2.isBlank();
        boolean boolean21 = textNode2.isBlank();
        org.jsoup.nodes.Document document22 = textNode2.ownerDocument();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#text" + "'", str15.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document22);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        boolean boolean5 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        textNode2.ensureAttributes();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        java.lang.String str5 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("h");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("h");
        java.lang.String str13 = textNode11.absUrl("i!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node12 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode15 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int16 = textNode15.childNodeSize();
        org.jsoup.nodes.TextNode textNode19 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str20 = textNode19.outerHtml();
        org.jsoup.nodes.TextNode textNode22 = textNode19.text("");
        boolean boolean23 = textNode15.equals((java.lang.Object) "");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode15.childNodesCopy();
        boolean boolean25 = textNode2.equals((java.lang.Object) textNode15);
        java.lang.String str26 = textNode2.text();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "i!");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes3);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode5.childNodesCopy();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node11 = textNode10.parent();
        boolean boolean12 = textNode10.isBlank();
        org.jsoup.nodes.Document document13 = textNode10.ownerDocument();
        org.jsoup.nodes.TextNode textNode15 = textNode10.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode10.childNodesCopy();
        java.lang.String str17 = textNode10.text();
        boolean boolean18 = textNode10.isBlank();
        textNode10.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode10.childNodesCopy();
        boolean boolean22 = textNode5.equals((java.lang.Object) textNode10);
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode10.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode10.siblingNodes();
        java.lang.Class<?> wildcardClass25 = nodeList24.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node5 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        java.lang.String str7 = textNode2.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode8 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean10 = textNode8.equals((java.lang.Object) false);
        org.jsoup.nodes.Node node13 = textNode8.attr("hi!", "");
        java.lang.String str14 = textNode8.text();
        org.jsoup.nodes.Attributes attributes15 = textNode8.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = document5.equals((java.lang.Object) attributes15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str10 = textNode2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node12 = textNode2.previousSibling();
        org.jsoup.nodes.Node node13 = textNode2.previousSibling();
        org.jsoup.nodes.Node node16 = textNode2.attr("#text", "#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        textNode2.ensureAttributes();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("i!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode13);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        textNode2.setBaseUri("hi!");
        int int12 = textNode2.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode14 = textNode2.splitText((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        int int4 = textNode2.siblingIndex();
        textNode2.setBaseUri("h");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.text();
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.jsoup.nodes.Node node11 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "i!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        boolean boolean10 = textNode2.isBlank();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode6 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str7 = textNode6.outerHtml();
        org.jsoup.nodes.TextNode textNode9 = textNode6.text("");
        boolean boolean10 = textNode2.equals((java.lang.Object) "");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node16 = textNode2.attr("hi!", "");
        node16.setBaseUri("hi!");
        org.jsoup.nodes.TextNode textNode21 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean23 = textNode21.equals((java.lang.Object) false);
        org.jsoup.nodes.Node node26 = textNode21.attr("hi!", "");
        boolean boolean28 = node26.equals((java.lang.Object) (short) 10);
        java.util.List<org.jsoup.nodes.Node> nodeList29 = node26.siblingNodes();
        boolean boolean30 = node16.equals((java.lang.Object) node26);
        org.jsoup.nodes.Document document31 = node26.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = node26.siblingNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList32);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        boolean boolean6 = textNode5.isBlank();
        textNode5.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode5.siblingNodes();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean13 = textNode5.equals((java.lang.Object) "");
        java.lang.String str14 = textNode5.text();
        org.jsoup.nodes.Attributes attributes15 = textNode5.attributes();
        java.lang.String str16 = textNode5.baseUri();
        java.lang.String str17 = textNode5.getWholeText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        boolean boolean6 = textNode5.isBlank();
        textNode5.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode5.siblingNodes();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean13 = textNode5.equals((java.lang.Object) "");
        java.lang.String str14 = textNode5.text();
        org.jsoup.nodes.Attributes attributes15 = textNode5.attributes();
        org.jsoup.nodes.TextNode textNode18 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str19 = textNode18.baseUri();
        textNode18.setBaseUri("hi!");
        java.lang.String str22 = textNode18.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode18.childNodesCopy();
        java.lang.String str24 = textNode18.toString();
        boolean boolean25 = textNode5.equals((java.lang.Object) textNode18);
        java.util.List<org.jsoup.nodes.Node> nodeList26 = textNode5.childNodesCopy();
        int int27 = textNode5.siblingIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node5 = textNode2.attr("#text", "");
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        boolean boolean5 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        int int7 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.toString();
        textNode2.setBaseUri("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        boolean boolean8 = textNode2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        textNode2.ensureAttributes();
        boolean boolean8 = textNode2.isBlank();
        java.lang.String str10 = textNode2.attr("hi!");
        java.lang.String str11 = textNode2.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        int int5 = textNode2.siblingIndex();
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node10 = textNode2.clone();
        textNode2.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        org.jsoup.nodes.Node node13 = textNode2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = textNode2.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        boolean boolean9 = textNode2.hasAttr("hi!");
        int int10 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        org.jsoup.nodes.Node node14 = textNode2.attr("#text", "h");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode18 = textNode2.text("#text");
        org.jsoup.select.NodeVisitor nodeVisitor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = textNode18.traverse(nodeVisitor19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode18);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        java.lang.String str1 = org.jsoup.nodes.TextNode.normaliseWhitespace("i!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "i!" + "'", str1.equals("i!"));
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.lang.String str9 = textNode2.text();
        boolean boolean11 = textNode2.hasAttr("#text");
        textNode2.setBaseUri("#text");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.toString();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean12 = textNode10.equals((java.lang.Object) false);
        int int13 = textNode10.siblingIndex();
        org.jsoup.nodes.Attributes attributes14 = textNode10.attributes();
        org.jsoup.nodes.Node node15 = textNode10.clone();
        org.jsoup.nodes.Document document16 = textNode10.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode10.childNodes();
        java.lang.String str18 = textNode10.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode10.childNodesCopy();
        java.lang.String str20 = textNode10.text();
        org.jsoup.nodes.Node node21 = textNode10.parent();
        org.jsoup.nodes.Node node23 = textNode10.removeAttr("#text");
        org.jsoup.nodes.Document document24 = node23.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = textNode2.after((org.jsoup.nodes.Node) document24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document24);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = node3.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node13 = textNode12.previousSibling();
        java.lang.String str14 = textNode12.text();
        org.jsoup.nodes.Document document15 = textNode12.ownerDocument();
        org.jsoup.nodes.Node node16 = textNode12.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode12.childNodes();
        org.jsoup.nodes.Document document18 = textNode12.ownerDocument();
        java.lang.String str19 = textNode12.text();
        java.lang.String str20 = textNode12.nodeName();
        java.lang.String str21 = textNode12.nodeName();
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
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "#text" + "'", str20.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "#text" + "'", str21.equals("#text"));
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        textNode2.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        java.lang.String str11 = textNode9.absUrl("#text");
        java.lang.String str12 = textNode9.text();
        org.jsoup.nodes.Attributes attributes13 = textNode9.attributes();
        org.jsoup.nodes.Node node14 = textNode9.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = node14.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        java.lang.String str4 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        java.lang.String str9 = textNode2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.attr("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.lang.String str10 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        java.lang.String str12 = textNode2.text();
        java.lang.String str13 = textNode2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node10 = textNode2.clone();
        textNode2.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode2.traverse(nodeVisitor13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node13 = textNode12.previousSibling();
        java.lang.String str14 = textNode12.text();
        org.jsoup.nodes.Node node17 = textNode12.attr("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = textNode2.before((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.toString();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        boolean boolean9 = textNode2.isBlank();
        java.lang.String str10 = textNode2.baseUri();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Attributes attributes13 = textNode2.attributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = textNode2.text();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node11 = textNode2.nextSibling();
        java.lang.String str12 = textNode2.toString();
        java.lang.String str14 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode16 = textNode2.text("#text");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode16);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = textNode2.text();
        int int6 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        org.jsoup.nodes.Node node8 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        java.lang.String str11 = textNode2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = textNode2.text();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        java.lang.String str10 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodesCopy();
        java.lang.String str13 = textNode2.nodeName();
        org.jsoup.nodes.Node node15 = textNode2.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode17 = textNode2.text("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode17);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("#text");
        java.lang.String str5 = textNode2.toString();
        boolean boolean7 = textNode2.hasAttr("");
        java.lang.String str8 = textNode2.nodeName();
        boolean boolean10 = textNode2.hasAttr("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.lang.String str8 = textNode7.getWholeText();
        java.lang.String str9 = textNode7.text();
        java.lang.String str10 = textNode7.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode7.childNodes();
        org.jsoup.nodes.Node node14 = textNode7.attr("h", "h");
        int int15 = textNode7.childNodeSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.lang.String str10 = textNode2.attr("");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node12 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode15 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int16 = textNode15.childNodeSize();
        org.jsoup.nodes.TextNode textNode19 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str20 = textNode19.outerHtml();
        org.jsoup.nodes.TextNode textNode22 = textNode19.text("");
        boolean boolean23 = textNode15.equals((java.lang.Object) "");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode15.childNodesCopy();
        boolean boolean25 = textNode2.equals((java.lang.Object) textNode15);
        org.jsoup.nodes.Node node26 = textNode15.parent();
        java.lang.String str27 = textNode15.baseUri();
        java.lang.String str28 = textNode15.outerHtml();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        boolean boolean9 = textNode2.isBlank();
        java.lang.String str11 = textNode2.absUrl("#text");
        textNode2.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.siblingNodes();
        org.jsoup.nodes.Document document14 = textNode2.ownerDocument();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        textNode2.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        java.lang.String str11 = textNode9.absUrl("#text");
        java.lang.String str12 = textNode9.text();
        java.lang.String str14 = textNode9.attr("hi!");
        org.jsoup.nodes.Node node15 = textNode9.parent();
        org.jsoup.nodes.Node node17 = textNode9.removeAttr("h");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node17.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        int int7 = textNode2.siblingIndex();
        java.lang.String str9 = textNode2.absUrl("i!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode5.childNodesCopy();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node11 = textNode10.parent();
        boolean boolean12 = textNode10.isBlank();
        org.jsoup.nodes.Document document13 = textNode10.ownerDocument();
        org.jsoup.nodes.TextNode textNode15 = textNode10.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode10.childNodesCopy();
        java.lang.String str17 = textNode10.text();
        boolean boolean18 = textNode10.isBlank();
        textNode10.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode10.childNodesCopy();
        boolean boolean22 = textNode5.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.Node node23 = textNode5.clone();
        textNode5.ensureAttributes();
        java.lang.String str25 = textNode5.outerHtml();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node5 = textNode2.attr("hi!", "#text");
        boolean boolean6 = textNode2.isBlank();
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("h", "h");
        java.lang.String str4 = textNode2.absUrl("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.splitText((int) (short) 1);
        org.jsoup.nodes.Node node5 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode5.childNodesCopy();
        java.lang.String str8 = textNode5.toString();
        textNode5.ensureAttributes();
        java.lang.String str10 = textNode5.getWholeText();
        java.lang.String str11 = textNode5.text();
        // The following exception was thrown during execution in test generation
        try {
            textNode5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        org.jsoup.nodes.Node node6 = textNode5.parent();
        textNode5.ensureAttributes();
        int int8 = textNode5.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node12 = textNode11.previousSibling();
        java.lang.String str13 = textNode11.text();
        java.lang.String str14 = textNode11.text();
        java.lang.String str15 = textNode11.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode11.childNodesCopy();
        int int17 = textNode11.siblingIndex();
        int int18 = textNode11.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = textNode5.after((org.jsoup.nodes.Node) textNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        java.lang.String str4 = textNode2.attr("");
        int int5 = textNode2.childNodeSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        org.jsoup.nodes.Node node8 = textNode2.nextSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        textNode2.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        java.lang.String str11 = textNode9.absUrl("#text");
        java.lang.String str12 = textNode9.text();
        org.jsoup.nodes.Node node14 = textNode9.removeAttr("#text");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        boolean boolean9 = textNode7.hasAttr("#text");
        boolean boolean11 = textNode7.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode7.childNodesCopy();
        java.lang.String str14 = textNode7.attr("");
        org.jsoup.nodes.Node node15 = textNode7.parent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode8 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node9 = textNode8.previousSibling();
        org.jsoup.nodes.Node node10 = textNode8.parent();
        boolean boolean12 = textNode8.hasAttr("");
        boolean boolean13 = textNode2.equals((java.lang.Object) textNode8);
        java.lang.String str14 = textNode2.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node15 = textNode14.parent();
        boolean boolean16 = textNode14.isBlank();
        int int17 = textNode14.siblingIndex();
        java.lang.String str18 = textNode14.toString();
        org.jsoup.nodes.Node node20 = textNode14.removeAttr("hi!");
        boolean boolean21 = node11.equals((java.lang.Object) node20);
        java.lang.String str22 = node11.baseUri();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        java.lang.String str7 = textNode2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.siblingNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        boolean boolean9 = textNode2.hasAttr("hi!");
        java.lang.String str10 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode2.attr("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode5.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        java.lang.String str5 = textNode2.text();
        textNode2.ensureAttributes();
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
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        int int8 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        org.jsoup.nodes.Attributes attributes11 = textNode10.attributes();
        org.jsoup.nodes.Document document12 = textNode10.ownerDocument();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.lang.String str9 = textNode2.text();
        boolean boolean11 = textNode2.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodesCopy();
        java.lang.String str13 = textNode2.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        java.lang.String str1 = textNode0.getWholeText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        int int3 = textNode2.childNodeSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.toString();
        textNode2.ensureAttributes();
        java.lang.String str6 = textNode2.text();
        java.lang.String str7 = textNode2.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = textNode2.text();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        java.lang.String str10 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode15 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str16 = textNode15.outerHtml();
        org.jsoup.nodes.TextNode textNode18 = textNode15.text("");
        int int19 = textNode18.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode18.childNodesCopy();
        org.jsoup.nodes.TextNode textNode23 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node24 = textNode23.parent();
        boolean boolean25 = textNode23.isBlank();
        org.jsoup.nodes.Document document26 = textNode23.ownerDocument();
        org.jsoup.nodes.TextNode textNode28 = textNode23.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = textNode23.childNodesCopy();
        java.lang.String str30 = textNode23.text();
        boolean boolean31 = textNode23.isBlank();
        textNode23.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList34 = textNode23.childNodesCopy();
        boolean boolean35 = textNode18.equals((java.lang.Object) textNode23);
        java.util.List<org.jsoup.nodes.Node> nodeList36 = textNode23.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = textNode23.siblingNodes();
        java.lang.String str38 = textNode23.nodeName();
        boolean boolean40 = textNode23.hasAttr("");
        org.jsoup.nodes.TextNode textNode42 = textNode23.text("h");
        boolean boolean43 = textNode2.equals((java.lang.Object) textNode42);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = textNode42.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "#text" + "'", str38.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node10 = textNode2.clone();
        textNode2.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("");
        java.lang.String str15 = textNode14.text();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        org.jsoup.nodes.Node node8 = textNode7.previousSibling();
        java.lang.String str9 = textNode7.toString();
        textNode7.setBaseUri("");
        int int12 = textNode7.siblingIndex();
        java.lang.String str14 = textNode7.absUrl("hi!");
        java.lang.String str15 = textNode7.nodeName();
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = textNode7.traverse(nodeVisitor16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#text" + "'", str15.equals("#text"));
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        java.lang.String str4 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        java.lang.String str10 = textNode9.baseUri();
        org.jsoup.nodes.TextNode textNode12 = textNode9.text("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        java.lang.String str5 = textNode2.text();
        java.lang.String str6 = textNode2.toString();
        boolean boolean7 = textNode2.isBlank();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.lang.String str9 = textNode2.getWholeText();
        int int10 = textNode2.siblingIndex();
        java.lang.String str12 = textNode2.attr("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        java.lang.String str3 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("h");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#text" + "'", str3.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        textNode2.setBaseUri("hi!");
        java.lang.String str13 = textNode2.absUrl("hi!");
        java.lang.String str14 = textNode2.toString();
        java.lang.String str15 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes16 = textNode2.attributes();
        textNode2.ensureAttributes();
        boolean boolean19 = textNode2.hasAttr("hi!");
        java.lang.String str20 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes21 = textNode2.attributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#text" + "'", str15.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "#text" + "'", str20.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes21);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        boolean boolean11 = textNode2.isBlank();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        boolean boolean6 = textNode5.isBlank();
        textNode5.setBaseUri("hi!");
        java.lang.String str9 = textNode5.toString();
        boolean boolean11 = textNode5.hasAttr("#text");
        boolean boolean13 = textNode5.hasAttr("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode5.childNodesCopy();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node11 = textNode10.parent();
        boolean boolean12 = textNode10.isBlank();
        org.jsoup.nodes.Document document13 = textNode10.ownerDocument();
        org.jsoup.nodes.TextNode textNode15 = textNode10.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode10.childNodesCopy();
        java.lang.String str17 = textNode10.text();
        boolean boolean18 = textNode10.isBlank();
        textNode10.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode10.childNodesCopy();
        boolean boolean22 = textNode5.equals((java.lang.Object) textNode10);
        boolean boolean24 = textNode10.hasAttr("hi!");
        org.jsoup.nodes.Node node25 = textNode10.clone();
        org.jsoup.nodes.Attributes attributes26 = textNode10.attributes();
        org.jsoup.nodes.Node node27 = textNode10.nextSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.lang.String str7 = textNode5.baseUri();
        org.jsoup.nodes.TextNode textNode9 = textNode5.text("#text");
        org.jsoup.nodes.Node node10 = textNode9.parent();
        textNode9.ensureAttributes();
        boolean boolean12 = textNode9.isBlank();
        boolean boolean13 = textNode9.isBlank();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node5 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("h");
        java.lang.String str10 = textNode2.attr("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("hi!");
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(0);
        java.lang.String str10 = textNode2.absUrl("h");
        org.jsoup.nodes.Node node11 = textNode2.parent();
        boolean boolean13 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node14 = textNode2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.lang.String str8 = textNode2.text();
        java.lang.String str9 = textNode2.getWholeText();
        java.lang.String str11 = textNode2.attr("");
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("hi!");
        java.lang.String str15 = textNode2.absUrl("#text");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        textNode2.ensureAttributes();
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node11 = textNode10.parent();
        boolean boolean12 = textNode10.isBlank();
        int int13 = textNode10.siblingIndex();
        java.lang.String str14 = textNode10.text();
        org.jsoup.nodes.Node node15 = textNode10.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode10.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("#text");
        boolean boolean16 = textNode2.hasAttr("");
        java.lang.String str18 = textNode2.absUrl("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        java.lang.String str4 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        java.lang.String str10 = textNode9.baseUri();
        java.lang.String str11 = textNode9.getWholeText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        boolean boolean9 = textNode2.isBlank();
        boolean boolean11 = textNode2.equals((java.lang.Object) false);
        java.lang.String str13 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Node node15 = textNode2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode18 = textNode2.text("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = textNode18.before("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode18);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        textNode2.setBaseUri("hi!");
        java.lang.String str13 = textNode2.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("");
        java.lang.String str16 = textNode2.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        boolean boolean6 = textNode5.isBlank();
        java.lang.String str7 = textNode5.baseUri();
        java.lang.String str8 = textNode5.getWholeText();
        java.lang.String str9 = textNode5.text();
        org.jsoup.nodes.Attributes attributes10 = textNode5.attributes();
        org.jsoup.nodes.Node node11 = textNode5.clone();
        org.jsoup.nodes.Document document12 = node11.ownerDocument();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        int int8 = textNode7.childNodeSize();
        java.lang.String str9 = textNode7.nodeName();
        org.jsoup.nodes.TextNode textNode11 = textNode7.text("hi!");
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node15 = textNode14.previousSibling();
        java.lang.String str16 = textNode14.text();
        java.lang.String str17 = textNode14.text();
        boolean boolean18 = textNode11.equals((java.lang.Object) str17);
        java.lang.String str20 = textNode11.absUrl("#text");
        org.jsoup.nodes.TextNode textNode22 = textNode11.splitText((int) (short) 1);
        org.jsoup.nodes.Document document23 = textNode11.ownerDocument();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document23);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        java.lang.String str5 = textNode2.text();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        java.lang.String str10 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        java.lang.String str13 = textNode2.attr("i!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("#text");
        int int8 = textNode2.siblingIndex();
        java.lang.String str9 = textNode2.getWholeText();
        int int10 = textNode2.childNodeSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        int int10 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("#text");
        boolean boolean13 = textNode2.isBlank();
        org.jsoup.nodes.Node node14 = textNode2.previousSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.lang.String str10 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        java.lang.String str12 = textNode2.text();
        org.jsoup.nodes.Node node13 = textNode2.parent();
        org.jsoup.nodes.Node node15 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Document document16 = node15.ownerDocument();
        int int17 = node15.childNodeSize();
        org.jsoup.nodes.Document document18 = node15.ownerDocument();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document18);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        java.lang.String str5 = textNode2.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.attr("", "i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        java.lang.String str9 = textNode2.text();
        boolean boolean10 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        java.lang.String str12 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.childNodes();
        org.jsoup.nodes.Attributes attributes14 = textNode2.attributes();
        java.lang.String str15 = textNode2.outerHtml();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.lang.String str9 = textNode2.attr("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.lang.String str8 = textNode2.text();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        boolean boolean9 = textNode2.isBlank();
        java.lang.String str11 = textNode2.attr("");
        org.jsoup.nodes.Node node12 = textNode2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.toString();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode2.attr("", "h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node5 = textNode2.attr("hi!", "#text");
        java.lang.String str6 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "hi!");
        textNode2.setBaseUri("h");
        org.jsoup.nodes.Node node13 = textNode2.attr("#text", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.lang.String str10 = textNode2.outerHtml();
        textNode2.setBaseUri("");
        boolean boolean14 = textNode2.hasAttr("#text");
        java.lang.String str15 = textNode2.text();
        boolean boolean17 = textNode2.hasAttr("i!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node5 = textNode2.attr("hi!", "#text");
        java.lang.String str6 = textNode2.toString();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        java.lang.String str8 = textNode2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText((int) (byte) 0);
        org.jsoup.nodes.Node node9 = textNode8.nextSibling();
        org.jsoup.nodes.Node node11 = textNode8.removeAttr("h");
        java.lang.String str12 = node11.outerHtml();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        int int8 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.lang.Class<?> wildcardClass10 = textNode2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        textNode2.setBaseUri("");
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(1);
        java.lang.String str9 = textNode8.text();
        org.jsoup.nodes.TextNode textNode11 = textNode8.text("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "i!" + "'", str9.equals("i!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        boolean boolean6 = textNode5.isBlank();
        textNode5.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode5.siblingNodes();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean13 = textNode5.equals((java.lang.Object) "");
        java.lang.String str14 = textNode5.text();
        boolean boolean15 = textNode5.isBlank();
        org.jsoup.nodes.Node node16 = textNode5.clone();
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode19.childNodes();
        java.lang.String str22 = textNode19.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = textNode5.before((org.jsoup.nodes.Node) textNode19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        org.jsoup.nodes.Node node9 = textNode8.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = node9.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        int int8 = textNode2.childNodeSize();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = document9.wrap("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.lang.String str4 = textNode2.attr("");
        org.jsoup.nodes.Node node5 = textNode2.clone();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        int int9 = textNode2.siblingIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.baseUri();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.lang.String str8 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode2.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        boolean boolean3 = textNode2.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        boolean boolean6 = textNode5.isBlank();
        textNode5.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode5.siblingNodes();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean13 = textNode5.equals((java.lang.Object) "");
        java.lang.String str14 = textNode5.text();
        org.jsoup.nodes.Attributes attributes15 = textNode5.attributes();
        org.jsoup.nodes.Node node18 = textNode5.attr("i!", "h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        boolean boolean9 = textNode2.isBlank();
        boolean boolean11 = textNode2.equals((java.lang.Object) false);
        java.lang.String str13 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Node node15 = textNode2.removeAttr("hi!");
        int int16 = textNode2.childNodeSize();
        java.lang.String str17 = textNode2.outerHtml();
        textNode2.ensureAttributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        boolean boolean9 = textNode2.hasAttr("hi!");
        java.lang.String str10 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("i!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node13.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.baseUri();
        textNode2.setBaseUri("hi!");
        java.lang.String str6 = textNode2.baseUri();
        java.lang.String str7 = textNode2.baseUri();
        boolean boolean8 = textNode2.isBlank();
        java.lang.String str9 = textNode2.toString();
        java.lang.String str11 = textNode2.absUrl("h");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        java.lang.String str4 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.absUrl("hi!");
        java.lang.String str7 = textNode2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        boolean boolean6 = textNode5.isBlank();
        textNode5.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode5.siblingNodes();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean13 = textNode5.equals((java.lang.Object) "");
        java.lang.String str14 = textNode5.text();
        org.jsoup.nodes.Attributes attributes15 = textNode5.attributes();
        int int16 = textNode5.childNodeSize();
        org.jsoup.nodes.TextNode textNode18 = textNode5.text("");
        textNode18.ensureAttributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode18);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node5 = textNode2.attr("#text", "");
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node12.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        boolean boolean5 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        int int7 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        java.lang.String str9 = textNode2.nodeName();
        java.lang.String str11 = textNode2.attr("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        java.lang.String str4 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(1);
        boolean boolean9 = textNode8.isBlank();
        textNode8.ensureAttributes();
        java.lang.String str11 = textNode8.getWholeText();
        boolean boolean13 = textNode8.hasAttr("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "i!" + "'", str11.equals("i!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            node7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        java.lang.String str4 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(1);
        org.jsoup.nodes.Node node9 = textNode8.previousSibling();
        boolean boolean10 = textNode8.isBlank();
        org.jsoup.nodes.TextNode textNode12 = textNode8.splitText(1);
        org.jsoup.nodes.Document document13 = textNode12.ownerDocument();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = textNode2.text();
        int int6 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("i!");
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
        org.junit.Assert.assertNotNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        java.lang.String str4 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        textNode2.ensureAttributes();
        java.lang.String str8 = textNode2.attr("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node8 = textNode2.nextSibling();
        int int9 = textNode2.childNodeSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode5.childNodesCopy();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node11 = textNode10.parent();
        boolean boolean12 = textNode10.isBlank();
        org.jsoup.nodes.Document document13 = textNode10.ownerDocument();
        org.jsoup.nodes.TextNode textNode15 = textNode10.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode10.childNodesCopy();
        java.lang.String str17 = textNode10.text();
        boolean boolean18 = textNode10.isBlank();
        textNode10.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode10.childNodesCopy();
        boolean boolean22 = textNode5.equals((java.lang.Object) textNode10);
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode10.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode10.siblingNodes();
        java.lang.String str25 = textNode10.nodeName();
        boolean boolean27 = textNode10.hasAttr("");
        org.jsoup.nodes.Attributes attributes28 = textNode10.attributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "#text" + "'", str25.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes28);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("hi!");
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(0);
        java.lang.String str10 = textNode2.absUrl("h");
        org.jsoup.nodes.Node node11 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("i!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode13);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = textNode2.text();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        java.lang.String str10 = textNode2.nodeName();
        java.lang.String str11 = textNode2.text();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
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
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        java.lang.String str4 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode2.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        java.lang.String str5 = textNode2.text();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.text();
        java.lang.String str9 = textNode2.getWholeText();
        boolean boolean11 = textNode2.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode13 = textNode2.splitText((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        int int8 = textNode7.childNodeSize();
        java.lang.String str9 = textNode7.nodeName();
        org.jsoup.nodes.Attributes attributes10 = textNode7.attributes();
        boolean boolean11 = textNode7.isBlank();
        java.lang.String str12 = textNode7.nodeName();
        java.lang.String str14 = textNode7.attr("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode5.childNodesCopy();
        int int8 = textNode5.siblingIndex();
        boolean boolean9 = textNode5.isBlank();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode6 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str7 = textNode6.outerHtml();
        org.jsoup.nodes.TextNode textNode9 = textNode6.text("");
        boolean boolean10 = textNode2.equals((java.lang.Object) "");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node16 = textNode2.attr("hi!", "");
        node16.setBaseUri("hi!");
        org.jsoup.nodes.TextNode textNode21 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean23 = textNode21.equals((java.lang.Object) false);
        org.jsoup.nodes.Node node26 = textNode21.attr("hi!", "");
        boolean boolean28 = node26.equals((java.lang.Object) (short) 10);
        java.util.List<org.jsoup.nodes.Node> nodeList29 = node26.siblingNodes();
        boolean boolean30 = node16.equals((java.lang.Object) node26);
        org.jsoup.nodes.TextNode textNode33 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node34 = textNode33.previousSibling();
        java.lang.String str35 = textNode33.text();
        int int36 = textNode33.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = textNode33.childNodesCopy();
        org.jsoup.nodes.Node node38 = textNode33.nextSibling();
        int int39 = textNode33.childNodeSize();
        org.jsoup.nodes.TextNode textNode41 = textNode33.text("#text");
        org.jsoup.nodes.TextNode textNode43 = textNode33.text("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = node26.before((org.jsoup.nodes.Node) textNode43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode43);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node12 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes13 = textNode2.attributes();
        boolean boolean15 = textNode2.hasAttr("h");
        org.jsoup.nodes.TextNode textNode18 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node21 = textNode18.attr("hi!", "#text");
        java.lang.String str22 = textNode18.outerHtml();
        boolean boolean23 = textNode2.equals((java.lang.Object) str22);
        org.jsoup.nodes.Node node24 = textNode2.previousSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean13 = textNode11.equals((java.lang.Object) false);
        int int14 = textNode11.siblingIndex();
        textNode11.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode11.siblingNodes();
        java.lang.String str18 = textNode11.attr("");
        java.lang.String str19 = textNode11.text();
        org.jsoup.nodes.TextNode textNode21 = textNode11.text("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = textNode2.after((org.jsoup.nodes.Node) textNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode21);
    }
}
