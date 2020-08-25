import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.baseUri();
        textNode2.setBaseUri("hi!");
        java.lang.String str6 = textNode2.baseUri();
        java.lang.String str7 = textNode2.baseUri();
        boolean boolean9 = textNode2.hasAttr("h");
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node10.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        boolean boolean7 = textNode2.equals((java.lang.Object) '#');
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        java.lang.String str4 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node9 = textNode2.attr("#text", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        boolean boolean11 = textNode2.hasAttr("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.baseUri();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node5 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        textNode2.ensureAttributes();
        java.lang.String str9 = textNode2.absUrl("hi!");
        boolean boolean11 = textNode2.hasAttr("i!");
        boolean boolean13 = textNode2.hasAttr("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        java.lang.String str4 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node11 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str15 = textNode14.toString();
        org.jsoup.nodes.Node node16 = textNode14.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node16.childNodesCopy();
        boolean boolean18 = textNode2.equals((java.lang.Object) nodeList17);
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
        org.junit.Assert.assertNotNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        org.jsoup.nodes.Node node5 = textNode2.attr("#text", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node5.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.attr("#text", "#text");
        textNode2.setBaseUri("h");
        org.jsoup.nodes.TextNode textNode15 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean17 = textNode15.equals((java.lang.Object) false);
        java.lang.String str18 = textNode15.text();
        org.jsoup.nodes.TextNode textNode20 = textNode15.text("hi!");
        boolean boolean22 = textNode15.hasAttr("#text");
        textNode15.ensureAttributes();
        java.lang.String str24 = textNode15.text();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode15.childNodes();
        boolean boolean26 = textNode2.equals((java.lang.Object) nodeList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        java.lang.String str5 = textNode2.absUrl("hi!");
        textNode2.ensureAttributes();
        int int7 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean13 = textNode11.equals((java.lang.Object) false);
        int int14 = textNode11.siblingIndex();
        textNode11.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode11.siblingNodes();
        org.jsoup.nodes.TextNode textNode18 = textNode11.text("");
        java.lang.String str20 = textNode18.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode18.childNodesCopy();
        boolean boolean22 = textNode2.equals((java.lang.Object) nodeList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        java.lang.String str9 = textNode2.attr("hi!");
        java.lang.String str10 = textNode2.outerHtml();
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
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        int int7 = textNode2.siblingIndex();
        textNode2.setBaseUri("");
        java.lang.String str10 = textNode2.outerHtml();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.baseUri();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("i!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = textNode2.attr("", "#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
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
        java.lang.String str13 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node15 = textNode2.clone();
        int int16 = node15.siblingIndex();
        int int17 = node15.childNodeSize();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        int int7 = textNode2.siblingIndex();
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
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.splitText((int) (short) 1);
        org.jsoup.nodes.Node node5 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList6 = node5.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.toString();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node7 = textNode2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.after("h");
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
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.lang.String str10 = textNode2.attr("");
        java.lang.String str12 = textNode2.attr("h");
        java.lang.String str13 = textNode2.nodeName();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = textNode2.text();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        java.lang.String str10 = textNode2.toString();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        org.jsoup.nodes.Node node12 = textNode2.parent();
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
        org.junit.Assert.assertNotNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = textNode9.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
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
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        java.lang.String str5 = textNode2.text();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        java.lang.String str4 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(1);
        int int9 = textNode2.siblingIndex();
        java.lang.String str10 = textNode2.outerHtml();
        java.lang.String str12 = textNode2.attr("");
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
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.lang.String str10 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean16 = textNode14.equals((java.lang.Object) false);
        int int17 = textNode14.siblingIndex();
        org.jsoup.nodes.Attributes attributes18 = textNode14.attributes();
        org.jsoup.nodes.Node node19 = textNode14.clone();
        org.jsoup.nodes.Document document20 = textNode14.ownerDocument();
        org.jsoup.nodes.Attributes attributes21 = textNode14.attributes();
        boolean boolean22 = textNode2.equals((java.lang.Object) textNode14);
        java.lang.String str24 = textNode2.attr("h");
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
        org.junit.Assert.assertNotNull(textNode14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        int int8 = textNode7.childNodeSize();
        java.lang.String str9 = textNode7.nodeName();
        org.jsoup.nodes.Attributes attributes10 = textNode7.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode12 = textNode7.splitText(0);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.lang.String str10 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean16 = textNode14.equals((java.lang.Object) false);
        int int17 = textNode14.siblingIndex();
        org.jsoup.nodes.Attributes attributes18 = textNode14.attributes();
        org.jsoup.nodes.Node node19 = textNode14.clone();
        org.jsoup.nodes.Document document20 = textNode14.ownerDocument();
        org.jsoup.nodes.Attributes attributes21 = textNode14.attributes();
        boolean boolean22 = textNode2.equals((java.lang.Object) textNode14);
        org.jsoup.nodes.Document document23 = textNode2.ownerDocument();
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
        org.junit.Assert.assertNotNull(textNode14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document23);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        boolean boolean6 = textNode2.isBlank();
        java.lang.Object obj7 = null;
        boolean boolean8 = textNode2.equals(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.Node node11 = textNode2.attr("#text", "");
        org.jsoup.nodes.Node node12 = node11.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node11.siblingNodes();
        org.jsoup.nodes.Node node14 = node11.previousSibling();
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
        org.junit.Assert.assertNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        org.jsoup.nodes.Node node8 = textNode7.previousSibling();
        java.lang.String str9 = textNode7.toString();
        textNode7.setBaseUri("");
        int int12 = textNode7.siblingIndex();
        org.jsoup.nodes.Node node13 = textNode7.clone();
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
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
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
        java.lang.String str16 = textNode2.nodeName();
        textNode2.ensureAttributes();
        java.lang.String str18 = textNode2.text();
        java.lang.String str19 = textNode2.outerHtml();
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode5.childNodesCopy();
        java.lang.String str8 = textNode5.toString();
        textNode5.ensureAttributes();
        java.lang.String str10 = textNode5.getWholeText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode5.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        boolean boolean9 = textNode2.isBlank();
        java.lang.String str11 = textNode2.attr("");
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
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.nodeName();
        boolean boolean7 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
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
        org.jsoup.nodes.Node node16 = textNode15.nextSibling();
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
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.lang.String str7 = node6.outerHtml();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        boolean boolean3 = textNode2.isBlank();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("#text");
        java.lang.String str5 = textNode2.baseUri();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int10 = textNode9.childNodeSize();
        java.lang.String str11 = textNode9.getWholeText();
        textNode9.ensureAttributes();
        boolean boolean14 = textNode9.hasAttr("#text");
        org.jsoup.nodes.Node node15 = textNode9.previousSibling();
        org.jsoup.nodes.Attributes attributes16 = textNode9.attributes();
        boolean boolean17 = textNode9.isBlank();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
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
        java.lang.String str14 = textNode2.baseUri();
        boolean boolean16 = textNode2.hasAttr("hi!");
        textNode2.setBaseUri("");
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        java.lang.String str5 = textNode2.text();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        java.lang.String str11 = textNode2.nodeName();
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
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
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
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
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        int int5 = textNode2.siblingIndex();
        java.lang.String str6 = textNode2.text();
        java.lang.String str7 = textNode2.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.before("#text");
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
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node12 = textNode2.parent();
        boolean boolean13 = textNode2.isBlank();
        int int14 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode17 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str18 = textNode17.outerHtml();
        org.jsoup.nodes.TextNode textNode20 = textNode17.text("");
        boolean boolean21 = textNode20.isBlank();
        textNode20.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode20.siblingNodes();
        org.jsoup.nodes.TextNode textNode27 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean28 = textNode20.equals((java.lang.Object) "");
        java.lang.String str29 = textNode20.text();
        org.jsoup.nodes.Attributes attributes30 = textNode20.attributes();
        org.jsoup.nodes.TextNode textNode33 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str34 = textNode33.baseUri();
        textNode33.setBaseUri("hi!");
        java.lang.String str37 = textNode33.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList38 = textNode33.childNodesCopy();
        java.lang.String str39 = textNode33.toString();
        boolean boolean40 = textNode20.equals((java.lang.Object) textNode33);
        java.lang.String str41 = textNode33.outerHtml();
        java.lang.String str42 = textNode33.getWholeText();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode33);
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
        org.junit.Assert.assertNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str10 = textNode2.absUrl("hi!");
        java.lang.String str12 = textNode2.attr("#text");
        java.lang.String str13 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode16 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str17 = textNode16.toString();
        org.jsoup.nodes.Node node18 = textNode16.clone();
        java.lang.String str19 = textNode16.text();
        int int20 = textNode16.siblingIndex();
        int int21 = textNode16.childNodeSize();
        java.lang.String str22 = textNode16.baseUri();
        org.jsoup.nodes.Attributes attributes23 = textNode16.attributes();
        boolean boolean24 = textNode2.equals((java.lang.Object) attributes23);
        java.lang.Class<?> wildcardClass25 = textNode2.getClass();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.absUrl("hi!");
        java.lang.String str10 = textNode2.baseUri();
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("h");
        java.lang.String str13 = textNode2.baseUri();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
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
        org.jsoup.nodes.Node node16 = textNode9.removeAttr("h");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = textNode9.before("hi!");
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        textNode2.setBaseUri("hi!");
        int int12 = textNode2.childNodeSize();
        org.jsoup.nodes.Attributes attributes13 = textNode2.attributes();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str6 = textNode2.absUrl("h");
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        int int9 = textNode2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node14 = textNode2.removeAttr("h");
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
        org.junit.Assert.assertNull(document12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        java.lang.String str3 = textNode2.toString();
        textNode2.ensureAttributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#text" + "'", str3.equals("#text"));
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        java.lang.String str4 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        java.lang.String str9 = textNode2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode2.after("");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
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
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        textNode2.ensureAttributes();
        org.jsoup.nodes.Node node10 = textNode2.attr("hi!", "");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        java.lang.Class<?> wildcardClass12 = textNode2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        java.lang.String str12 = textNode2.baseUri();
        org.jsoup.nodes.Node node13 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        java.lang.String str5 = textNode2.text();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        org.jsoup.nodes.Node node8 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node8.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
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
        java.lang.String str16 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode18 = textNode2.text("hi!");
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode18);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str10 = textNode2.absUrl("hi!");
        java.lang.String str12 = textNode2.attr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.childNodes();
        textNode2.ensureAttributes();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.outerHtml();
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
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        boolean boolean9 = textNode2.isBlank();
        java.lang.String str11 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node14 = textNode2.attr("#text", "#text");
        boolean boolean15 = textNode2.isBlank();
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
        org.junit.Assert.assertNotNull(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node13 = textNode12.previousSibling();
        java.lang.String str14 = textNode12.text();
        org.jsoup.nodes.Document document15 = textNode12.ownerDocument();
        org.jsoup.nodes.Node node16 = textNode12.clone();
        int int17 = node16.siblingIndex();
        boolean boolean18 = textNode2.equals((java.lang.Object) int17);
        org.jsoup.nodes.Node node19 = textNode2.clone();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode5.childNodesCopy();
        java.lang.String str8 = textNode5.toString();
        textNode5.ensureAttributes();
        java.lang.String str10 = textNode5.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode5.childNodesCopy();
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
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        boolean boolean9 = textNode2.hasAttr("i!");
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
// flaky:         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        textNode2.ensureAttributes();
        org.jsoup.nodes.Node node10 = textNode2.attr("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.before("i!");
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
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        java.lang.String str5 = textNode2.text();
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        boolean boolean10 = textNode2.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("h", "i!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = textNode2.after((org.jsoup.nodes.Node) textNode14);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode14);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
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
        java.lang.Object obj32 = null;
        boolean boolean33 = node26.equals(obj32);
        java.lang.String str34 = node26.outerHtml();
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
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
        java.lang.String str15 = textNode2.attr("");
        java.lang.String str17 = textNode2.absUrl("h");
        org.jsoup.nodes.Node node18 = textNode2.clone();
        org.jsoup.nodes.Node node20 = textNode2.removeAttr("#text");
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        java.lang.String str4 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        java.lang.String str7 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Node node10 = textNode2.attr("hi!", "i!");
        java.lang.String str11 = textNode2.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        java.util.List<org.jsoup.nodes.Node> nodeList1 = textNode0.childNodesCopy();
        org.jsoup.nodes.Node node2 = textNode0.parent();
        java.lang.String str3 = textNode0.nodeName();
        int int4 = textNode0.childNodeSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#text" + "'", str3.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.siblingNodes();
        java.lang.String str13 = textNode11.toString();
        org.jsoup.nodes.Node node14 = textNode11.previousSibling();
        int int15 = textNode11.siblingIndex();
        org.jsoup.nodes.Document document16 = textNode11.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = textNode2.before((org.jsoup.nodes.Node) textNode11);
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
        org.junit.Assert.assertNotNull(nodeList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        boolean boolean11 = textNode2.isBlank();
        java.lang.String str12 = textNode2.toString();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node5 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        textNode2.ensureAttributes();
        java.lang.String str9 = textNode2.absUrl("hi!");
        boolean boolean11 = textNode2.hasAttr("i!");
        org.jsoup.nodes.Attributes attributes12 = textNode2.attributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        int int5 = textNode2.siblingIndex();
        java.lang.String str6 = textNode2.text();
        java.lang.String str8 = textNode2.attr("h");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode2.before("h");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.ensureAttributes();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node11 = textNode10.parent();
        boolean boolean12 = textNode10.isBlank();
        java.lang.String str13 = textNode10.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode10.siblingNodes();
        java.lang.String str15 = textNode10.getWholeText();
        int int16 = textNode10.childNodeSize();
        org.jsoup.nodes.Node node19 = textNode10.attr("#text", "hi!");
        boolean boolean20 = textNode2.equals((java.lang.Object) "#text");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("");
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
        org.junit.Assert.assertNotNull(textNode10);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        int int7 = textNode2.siblingIndex();
        java.lang.String str9 = textNode2.absUrl("i!");
        int int10 = textNode2.childNodeSize();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Node node10 = textNode7.attr("h", "");
        org.jsoup.nodes.Document document11 = textNode7.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node4.after((org.jsoup.nodes.Node) document11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.lang.String str10 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        java.lang.String str13 = textNode2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.childNodes();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.Node node8 = node6.clone();
        node8.setBaseUri("");
        java.lang.String str11 = node8.baseUri();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        java.lang.String str4 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.toString();
        boolean boolean6 = textNode2.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.after("");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
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
        org.jsoup.nodes.TextNode textNode29 = textNode10.text("#text");
        boolean boolean30 = textNode29.isBlank();
        org.jsoup.nodes.Node node31 = textNode29.previousSibling();
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
        org.junit.Assert.assertNotNull(textNode29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        boolean boolean6 = textNode5.isBlank();
        org.jsoup.nodes.Node node7 = textNode5.nextSibling();
        boolean boolean9 = textNode5.equals((java.lang.Object) (-1));
        java.lang.String str10 = textNode5.getWholeText();
        java.lang.String str11 = textNode5.baseUri();
        org.jsoup.nodes.Attributes attributes12 = textNode5.attributes();
        textNode5.ensureAttributes();
        textNode5.ensureAttributes();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("i!");
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
        org.junit.Assert.assertNotNull(textNode12);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.text();
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        java.lang.String str12 = textNode2.outerHtml();
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
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        java.lang.String str4 = textNode2.getWholeText();
        textNode2.ensureAttributes();
        java.lang.String str6 = textNode2.baseUri();
        boolean boolean8 = textNode2.hasAttr("h");
        java.lang.String str9 = textNode2.getWholeText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
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
        org.jsoup.nodes.Node node26 = textNode2.clone();
        // The following exception was thrown during execution in test generation
        try {
            node26.remove();
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
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        boolean boolean9 = textNode2.hasAttr("hi!");
        java.lang.String str10 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("i!");
        int int14 = node13.siblingIndex();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        java.lang.String str5 = textNode2.text();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode7.childNodesCopy();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode12.childNodes();
        org.jsoup.nodes.Attributes attributes14 = textNode12.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = textNode7.after((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(nodeList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        java.lang.String str9 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Node node1 = textNode0.nextSibling();
        org.jsoup.nodes.TextNode textNode3 = textNode0.text("#text");
        org.jsoup.nodes.TextNode textNode6 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str7 = textNode6.outerHtml();
        org.jsoup.nodes.TextNode textNode9 = textNode6.text("");
        boolean boolean10 = textNode9.isBlank();
        org.jsoup.nodes.Node node11 = textNode9.nextSibling();
        boolean boolean13 = textNode9.equals((java.lang.Object) (-1));
        org.jsoup.nodes.Node node14 = textNode9.previousSibling();
        int int15 = textNode9.childNodeSize();
        java.lang.String str16 = textNode9.getWholeText();
        org.jsoup.nodes.Node node17 = textNode9.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = textNode0.after(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.text();
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.after("");
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
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str12 = textNode11.toString();
        org.jsoup.nodes.Node node13 = textNode11.clone();
        java.lang.String str14 = textNode11.text();
        org.jsoup.nodes.TextNode textNode16 = textNode11.text("#text");
        org.jsoup.nodes.Node node18 = textNode11.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode11.childNodesCopy();
        boolean boolean21 = textNode11.hasAttr("#text");
        boolean boolean22 = textNode2.equals((java.lang.Object) boolean21);
        org.jsoup.nodes.Node node23 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            node23.setBaseUri("");
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        java.lang.String str4 = textNode2.getWholeText();
        textNode2.ensureAttributes();
        boolean boolean7 = textNode2.hasAttr("#text");
        java.lang.String str8 = textNode2.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node5 = textNode2.attr("#text", "");
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node14 = textNode2.removeAttr("h");
        int int15 = node14.childNodeSize();
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
        org.junit.Assert.assertNotNull(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        java.lang.String str9 = textNode2.text();
        boolean boolean10 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        org.jsoup.nodes.Attributes attributes12 = textNode2.attributes();
        boolean boolean13 = textNode2.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = textNode2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.lang.String str7 = textNode5.baseUri();
        org.jsoup.nodes.Node node8 = textNode5.parent();
        boolean boolean9 = textNode5.isBlank();
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode5.traverse(nodeVisitor10);
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str5 = textNode2.attr("hi!");
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = textNode2.text();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node10 = node9.nextSibling();
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str14 = textNode13.toString();
        org.jsoup.nodes.Node node15 = textNode13.clone();
        java.lang.String str16 = textNode13.text();
        org.jsoup.nodes.TextNode textNode18 = textNode13.text("#text");
        org.jsoup.nodes.Node node20 = textNode13.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode13.childNodesCopy();
        org.jsoup.nodes.Node node22 = textNode13.nextSibling();
        org.jsoup.nodes.TextNode textNode24 = textNode13.text("");
        org.jsoup.nodes.TextNode textNode26 = textNode24.text("hi!");
        textNode24.ensureAttributes();
        boolean boolean28 = node9.equals((java.lang.Object) textNode24);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = textNode24.before("");
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
        org.junit.Assert.assertNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        textNode2.ensureAttributes();
        boolean boolean8 = textNode2.isBlank();
        java.lang.String str10 = textNode2.attr("hi!");
        java.lang.String str11 = textNode2.nodeName();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.traverse(nodeVisitor12);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
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
        textNode2.ensureAttributes();
        java.lang.String str15 = textNode2.text();
        java.lang.String str16 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode2.childNodes();
        boolean boolean18 = textNode2.isBlank();
        java.lang.String str19 = textNode2.baseUri();
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.toString();
        java.lang.String str6 = textNode2.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.text();
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        java.lang.String str11 = textNode2.getWholeText();
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
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode26 = textNode2.splitText(100);
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
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            document3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
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
        org.jsoup.nodes.Node node15 = textNode2.parent();
        java.lang.String str16 = textNode2.toString();
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
        org.junit.Assert.assertNull(node15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
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
        org.jsoup.nodes.Node node15 = textNode2.parent();
        java.lang.String str16 = textNode2.nodeName();
        java.lang.String str18 = textNode2.attr("#text");
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
        org.junit.Assert.assertNull(node15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        org.jsoup.nodes.Node node8 = textNode7.previousSibling();
        java.lang.String str9 = textNode7.toString();
        textNode7.setBaseUri("");
        boolean boolean13 = textNode7.hasAttr("");
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("#text", "hi!");
        org.jsoup.nodes.Node node17 = textNode16.parent();
        org.jsoup.nodes.Node node18 = textNode16.previousSibling();
        java.lang.String str19 = textNode16.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = textNode7.after((org.jsoup.nodes.Node) textNode16);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "#text" + "'", str19.equals("#text"));
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.lang.String str10 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        org.jsoup.nodes.Attributes attributes12 = textNode2.attributes();
        java.lang.String str14 = textNode2.attr("");
        int int15 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode17 = textNode2.text("");
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
        org.junit.Assert.assertNotNull(attributes12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode17);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        java.lang.String str6 = textNode2.text();
        java.lang.String str7 = textNode2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        boolean boolean5 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        java.lang.String str7 = textNode2.text();
        boolean boolean9 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.attr("hi!");
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        java.lang.String str5 = textNode2.text();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node12 = textNode2.attr("#text", "");
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
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.String str7 = textNode2.toString();
        org.jsoup.nodes.Node node10 = textNode2.attr("h", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "i!");
        org.jsoup.nodes.TextNode textNode5 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str6 = textNode5.outerHtml();
        org.jsoup.nodes.TextNode textNode8 = textNode5.text("");
        int int9 = textNode8.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode8.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node14 = textNode13.parent();
        boolean boolean15 = textNode13.isBlank();
        org.jsoup.nodes.Document document16 = textNode13.ownerDocument();
        org.jsoup.nodes.TextNode textNode18 = textNode13.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode13.childNodesCopy();
        java.lang.String str20 = textNode13.text();
        boolean boolean21 = textNode13.isBlank();
        textNode13.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode13.childNodesCopy();
        boolean boolean25 = textNode8.equals((java.lang.Object) textNode13);
        boolean boolean27 = textNode13.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode13.siblingNodes();
        boolean boolean29 = textNode2.equals((java.lang.Object) nodeList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        int int10 = textNode2.childNodeSize();
        java.lang.String str11 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
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
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("#text");
        java.lang.String str12 = textNode2.text();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        java.lang.String str4 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(1);
        org.jsoup.nodes.Node node9 = textNode8.previousSibling();
        int int10 = textNode8.childNodeSize();
        org.jsoup.nodes.TextNode textNode12 = textNode8.text("");
        java.lang.String str13 = textNode8.baseUri();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes4);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.absUrl("hi!");
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
        org.junit.Assert.assertNotNull(nodeList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        boolean boolean9 = textNode2.hasAttr("hi!");
        java.lang.String str10 = textNode2.getWholeText();
        java.lang.String str11 = textNode2.baseUri();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        boolean boolean6 = textNode5.isBlank();
        textNode5.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode5.siblingNodes();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean13 = textNode5.equals((java.lang.Object) "");
        java.lang.String str14 = textNode5.text();
        java.lang.String str15 = textNode5.getWholeText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode17 = textNode5.splitText(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = document7.after("hi!");
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
        org.junit.Assert.assertNotNull(nodeList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        int int7 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.getWholeText();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
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
        org.jsoup.nodes.Node node26 = textNode2.parent();
        java.lang.String str27 = textNode2.toString();
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
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        boolean boolean9 = textNode2.hasAttr("hi!");
        java.lang.String str10 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("i!");
        java.lang.String str14 = textNode2.text();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        java.lang.String str9 = textNode2.attr("hi!");
        java.lang.String str10 = textNode2.outerHtml();
        java.lang.String str11 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes12 = textNode2.attributes();
        java.lang.String str13 = textNode2.outerHtml();
        org.jsoup.nodes.Node node14 = textNode2.previousSibling();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
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
        java.lang.String str17 = textNode15.text();
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        java.lang.String str3 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodesCopy();
        java.lang.String str6 = textNode2.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#text" + "'", str3.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.baseUri();
        textNode2.setBaseUri("hi!");
        java.lang.String str6 = textNode2.baseUri();
        java.lang.String str7 = textNode2.baseUri();
        boolean boolean8 = textNode2.isBlank();
        int int9 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node13 = textNode12.parent();
        boolean boolean14 = textNode12.isBlank();
        org.jsoup.nodes.Document document15 = textNode12.ownerDocument();
        int int16 = textNode12.siblingIndex();
        boolean boolean18 = textNode12.hasAttr("");
        org.jsoup.nodes.Node node19 = textNode12.nextSibling();
        org.jsoup.nodes.Attributes attributes20 = textNode12.attributes();
        textNode12.setBaseUri("h");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = textNode2.after((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.siblingNodes();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode5.childNodesCopy();
        java.lang.String str8 = textNode5.toString();
        textNode5.ensureAttributes();
        java.lang.String str10 = textNode5.toString();
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str14 = textNode13.outerHtml();
        org.jsoup.nodes.TextNode textNode16 = textNode13.text("");
        boolean boolean17 = textNode16.isBlank();
        textNode16.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode16.siblingNodes();
        org.jsoup.nodes.TextNode textNode23 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean24 = textNode16.equals((java.lang.Object) "");
        java.lang.String str25 = textNode16.text();
        boolean boolean26 = textNode16.isBlank();
        java.lang.String str28 = textNode16.attr("");
        boolean boolean29 = textNode16.isBlank();
        boolean boolean30 = textNode5.equals((java.lang.Object) textNode16);
        org.jsoup.nodes.Node node32 = textNode5.removeAttr("hi!");
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
        org.junit.Assert.assertNotNull(textNode13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode5.childNodesCopy();
        java.lang.String str8 = textNode5.toString();
        boolean boolean9 = textNode5.isBlank();
        java.lang.String str10 = textNode5.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode5.before("#text");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
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
        org.jsoup.nodes.Node node22 = textNode5.nextSibling();
        int int23 = textNode5.childNodeSize();
        org.jsoup.nodes.Node node24 = textNode5.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = textNode5.removeAttr("");
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
        org.junit.Assert.assertNull(node22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
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
        org.jsoup.nodes.Node node15 = textNode2.parent();
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
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.toString();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.lang.String str8 = textNode2.attr("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("hi!");
        boolean boolean6 = textNode2.isBlank();
        textNode2.setBaseUri("");
        java.lang.String str9 = textNode2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode6 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str7 = textNode6.outerHtml();
        org.jsoup.nodes.TextNode textNode9 = textNode6.text("");
        boolean boolean10 = textNode2.equals((java.lang.Object) "");
        java.lang.String str11 = textNode2.getWholeText();
        textNode2.ensureAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode14 = textNode2.splitText((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.lang.String str7 = textNode5.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode5.childNodesCopy();
        textNode5.ensureAttributes();
        org.jsoup.nodes.TextNode textNode11 = textNode5.text("hi!");
        boolean boolean13 = textNode11.hasAttr("h");
        org.jsoup.nodes.Node node15 = textNode11.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node15.before("");
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        java.lang.String str5 = textNode2.text();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        int int8 = textNode2.siblingIndex();
        int int9 = textNode2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        boolean boolean12 = textNode2.hasAttr("");
        boolean boolean14 = textNode2.hasAttr("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Node node8 = textNode2.nextSibling();
        java.lang.String str9 = textNode2.getWholeText();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode6 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str7 = textNode6.outerHtml();
        org.jsoup.nodes.TextNode textNode9 = textNode6.text("");
        boolean boolean10 = textNode2.equals((java.lang.Object) "");
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node11.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        org.jsoup.nodes.Node node6 = textNode5.parent();
        java.lang.String str7 = textNode5.getWholeText();
        org.jsoup.nodes.Node node8 = textNode5.nextSibling();
        org.jsoup.nodes.Node node10 = textNode5.removeAttr("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node6.childNodes();
        java.lang.String str8 = node6.outerHtml();
        org.jsoup.nodes.Node node9 = node6.clone();
        org.jsoup.nodes.Node node10 = node6.nextSibling();
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
        org.junit.Assert.assertNotNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node12 = textNode2.parent();
        int int13 = textNode2.siblingIndex();
        java.lang.String str15 = textNode2.attr("");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        java.lang.String str4 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
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
        java.lang.Class<?> wildcardClass14 = textNode2.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
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
        java.lang.String str13 = textNode10.baseUri();
        java.lang.String str14 = textNode10.getWholeText();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.lang.String str7 = textNode5.baseUri();
        org.jsoup.nodes.TextNode textNode9 = textNode5.text("#text");
        org.jsoup.nodes.Node node10 = textNode9.parent();
        textNode9.ensureAttributes();
        int int12 = textNode9.siblingIndex();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        boolean boolean7 = textNode2.isBlank();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str5 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        textNode2.ensureAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode9 = textNode2.splitText(10);
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        int int4 = textNode2.siblingIndex();
        textNode2.ensureAttributes();
        java.lang.String str6 = textNode2.text();
        java.lang.String str8 = textNode2.attr("hi!");
        org.jsoup.nodes.Node node9 = textNode2.parent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
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
        org.jsoup.select.NodeVisitor nodeVisitor31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = node26.traverse(nodeVisitor31);
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
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        boolean boolean6 = textNode5.isBlank();
        textNode5.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode5.siblingNodes();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean13 = textNode5.equals((java.lang.Object) "");
        java.lang.String str14 = textNode5.text();
        java.lang.String str15 = textNode5.text();
        org.jsoup.nodes.Node node16 = textNode5.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = textNode5.after("#text");
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        textNode2.ensureAttributes();
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        org.jsoup.nodes.Node node11 = textNode2.attr("h", "#text");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.absUrl("#text");
        java.lang.String str7 = textNode2.attr("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.toString();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        java.lang.String str10 = textNode2.outerHtml();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode2.traverse(nodeVisitor11);
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
        org.junit.Assert.assertNotNull(attributes7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.lang.String str10 = textNode2.attr("");
        java.lang.String str12 = textNode2.attr("");
        java.lang.String str13 = textNode2.getWholeText();
        boolean boolean14 = textNode2.isBlank();
        textNode2.setBaseUri("#text");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
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
        org.jsoup.nodes.Node node26 = textNode2.clone();
        java.lang.Class<?> wildcardClass27 = textNode2.getClass();
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
        org.junit.Assert.assertNotNull(node26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = textNode2.text();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("hi!");
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(0);
        java.lang.String str10 = textNode2.absUrl("h");
        org.jsoup.nodes.Node node11 = textNode2.parent();
        java.lang.String str12 = textNode2.nodeName();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.traverse(nodeVisitor6);
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        java.lang.String str5 = textNode2.text();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList8 = document7.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.toString();
        java.lang.String str6 = textNode2.baseUri();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
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
        org.jsoup.nodes.Node node26 = textNode2.nextSibling();
        org.jsoup.nodes.Attributes attributes27 = textNode2.attributes();
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
        org.junit.Assert.assertNotNull(attributes27);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
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
        java.lang.String str17 = textNode5.attr("");
        java.lang.String str19 = textNode5.attr("");
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        boolean boolean9 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node12 = textNode2.attr("#text", "#text");
        org.jsoup.nodes.Node node13 = node12.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.after("i!");
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
        org.junit.Assert.assertNotNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode6 = textNode2.splitText((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
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
        java.lang.String str17 = textNode5.attr("");
        int int18 = textNode5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode5.siblingNodes();
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        textNode2.ensureAttributes();
        org.jsoup.nodes.Node node10 = textNode2.attr("hi!", "");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        org.jsoup.nodes.Node node14 = textNode2.removeAttr("i!");
        org.jsoup.nodes.Node node15 = textNode2.parent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
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
        java.lang.String str13 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodesCopy();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
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
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode13.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            textNode13.remove();
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
        org.junit.Assert.assertNotNull(attributes11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = textNode2.text();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str11 = textNode2.baseUri();
        org.jsoup.nodes.Node node12 = textNode2.nextSibling();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
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
        org.jsoup.nodes.Node node14 = textNode10.clone();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
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
        java.lang.String str15 = textNode2.absUrl("h");
        java.lang.String str16 = textNode2.nodeName();
        java.lang.String str17 = textNode2.baseUri();
        java.lang.String str18 = textNode2.nodeName();
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str12 = textNode11.outerHtml();
        org.jsoup.nodes.TextNode textNode14 = textNode11.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode11.childNodes();
        org.jsoup.nodes.Node node17 = textNode11.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode19 = textNode11.text("hi!");
        boolean boolean20 = textNode2.equals((java.lang.Object) "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode2.childNodesCopy();
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
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        boolean boolean6 = textNode5.isBlank();
        java.lang.String str7 = textNode5.baseUri();
        java.lang.String str8 = textNode5.getWholeText();
        java.lang.String str9 = textNode5.getWholeText();
        org.jsoup.nodes.Node node10 = textNode5.nextSibling();
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
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        boolean boolean6 = textNode5.isBlank();
        java.lang.String str7 = textNode5.baseUri();
        java.lang.String str8 = textNode5.getWholeText();
        java.lang.String str9 = textNode5.text();
        org.jsoup.nodes.Attributes attributes10 = textNode5.attributes();
        org.jsoup.nodes.Node node11 = textNode5.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode5.childNodes();
        org.jsoup.nodes.Attributes attributes13 = textNode5.attributes();
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
        org.junit.Assert.assertNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("#text");
        boolean boolean9 = textNode2.isBlank();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
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
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        textNode2.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        java.lang.String str11 = textNode9.absUrl("#text");
        int int12 = textNode9.siblingIndex();
        org.jsoup.nodes.TextNode textNode15 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean17 = textNode15.equals((java.lang.Object) false);
        int int18 = textNode15.siblingIndex();
        textNode15.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode15.siblingNodes();
        org.jsoup.nodes.TextNode textNode22 = textNode15.text("");
        java.lang.String str24 = textNode22.absUrl("#text");
        java.lang.String str25 = textNode22.text();
        java.lang.String str27 = textNode22.attr("h");
        java.lang.String str28 = textNode22.text();
        boolean boolean29 = textNode9.equals((java.lang.Object) textNode22);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        textNode2.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
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
        int int24 = textNode10.siblingIndex();
        org.jsoup.nodes.Node node25 = textNode10.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = textNode10.siblingNodes();
        textNode10.ensureAttributes();
        java.lang.String str29 = textNode10.attr("hi!");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("#text");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node11 = textNode2.parent();
        java.lang.String str12 = textNode2.baseUri();
        textNode2.ensureAttributes();
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
        org.junit.Assert.assertNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        java.util.List<org.jsoup.nodes.Node> nodeList1 = textNode0.childNodesCopy();
        org.jsoup.nodes.Node node2 = textNode0.parent();
        boolean boolean3 = textNode0.isBlank();
        boolean boolean4 = textNode0.isBlank();
        java.lang.String str5 = textNode0.baseUri();
        textNode0.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean12 = textNode10.equals((java.lang.Object) false);
        java.lang.String str13 = textNode10.text();
        org.jsoup.nodes.TextNode textNode15 = textNode10.text("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode15.childNodes();
        boolean boolean17 = textNode0.equals((java.lang.Object) nodeList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        java.lang.String str8 = textNode2.text();
        java.lang.String str9 = textNode2.nodeName();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "i!");
        org.jsoup.nodes.Node node5 = textNode2.attr("i!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str7 = textNode2.attr("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        boolean boolean8 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        java.lang.String str10 = textNode2.getWholeText();
        java.lang.String str11 = textNode2.toString();
        java.lang.String str13 = textNode2.absUrl("#text");
        java.lang.String str14 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode17 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int18 = textNode17.childNodeSize();
        java.lang.String str19 = textNode17.getWholeText();
        java.lang.String str20 = textNode17.toString();
        org.jsoup.nodes.TextNode textNode22 = textNode17.text("#text");
        java.lang.String str24 = textNode17.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode17.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = textNode2.after((org.jsoup.nodes.Node) textNode17);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "#text" + "'", str20.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.lang.String str10 = textNode2.attr("");
        java.lang.String str12 = textNode2.attr("h");
        org.jsoup.nodes.Node node13 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode18 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        java.lang.String str19 = textNode18.baseUri();
        java.lang.String str20 = textNode18.getWholeText();
        java.lang.String str21 = textNode18.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            textNode15.replaceWith((org.jsoup.nodes.Node) textNode18);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "#text" + "'", str20.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        textNode2.ensureAttributes();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        int int7 = textNode2.siblingIndex();
        boolean boolean9 = textNode2.hasAttr("#text");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        java.util.List<org.jsoup.nodes.Node> nodeList1 = textNode0.childNodesCopy();
        org.jsoup.nodes.Node node2 = textNode0.parent();
        boolean boolean3 = textNode0.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode0.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode0.childNodes();
        java.lang.String str6 = textNode0.baseUri();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
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
        java.lang.String str15 = textNode2.absUrl("h");
        org.jsoup.nodes.Document document16 = textNode2.ownerDocument();
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        java.lang.String str4 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        java.lang.String str7 = textNode2.absUrl("hi!");
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        int int4 = node3.siblingIndex();
        org.jsoup.nodes.Node node5 = node3.parent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.text();
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.childNodesCopy();
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str15 = textNode14.outerHtml();
        org.jsoup.nodes.TextNode textNode17 = textNode14.text("");
        int int18 = textNode17.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode17.childNodesCopy();
        org.jsoup.nodes.TextNode textNode22 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node23 = textNode22.parent();
        boolean boolean24 = textNode22.isBlank();
        org.jsoup.nodes.Document document25 = textNode22.ownerDocument();
        org.jsoup.nodes.TextNode textNode27 = textNode22.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode22.childNodesCopy();
        java.lang.String str29 = textNode22.text();
        boolean boolean30 = textNode22.isBlank();
        textNode22.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = textNode22.childNodesCopy();
        boolean boolean34 = textNode17.equals((java.lang.Object) textNode22);
        boolean boolean36 = textNode22.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList37 = textNode22.siblingNodes();
        org.jsoup.nodes.TextNode textNode40 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean42 = textNode40.equals((java.lang.Object) false);
        int int43 = textNode40.siblingIndex();
        textNode40.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = textNode40.siblingNodes();
        java.lang.String str47 = textNode40.attr("");
        java.lang.String str48 = textNode40.text();
        java.lang.String str49 = textNode40.nodeName();
        boolean boolean50 = textNode22.equals((java.lang.Object) textNode40);
        boolean boolean51 = node10.equals((java.lang.Object) textNode22);
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
        org.junit.Assert.assertNotNull(nodeList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "#text" + "'", str49.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.lang.String str9 = textNode2.text();
        int int10 = textNode2.siblingIndex();
        java.lang.String str11 = textNode2.nodeName();
        int int12 = textNode2.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode2.childNode((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        boolean boolean8 = textNode2.isBlank();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        int int7 = textNode2.siblingIndex();
        java.lang.String str9 = textNode2.absUrl("i!");
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean14 = textNode12.equals((java.lang.Object) false);
        int int15 = textNode12.siblingIndex();
        org.jsoup.nodes.Node node16 = textNode12.clone();
        textNode12.ensureAttributes();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode12);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
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
        java.lang.String str19 = textNode2.getWholeText();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "#text" + "'", str19.equals("#text"));
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode5.childNodesCopy();
        java.lang.String str8 = textNode5.toString();
        textNode5.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode5.childNodes();
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
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
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
        java.lang.String str13 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodesCopy();
        java.lang.String str15 = textNode2.baseUri();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        java.lang.String str9 = textNode2.text();
        boolean boolean10 = textNode2.isBlank();
        org.jsoup.nodes.Node node13 = textNode2.attr("#text", "#text");
        java.lang.String str14 = textNode2.getWholeText();
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
        org.junit.Assert.assertNotNull(node13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        boolean boolean6 = textNode5.isBlank();
        java.lang.String str7 = textNode5.baseUri();
        java.lang.String str8 = textNode5.getWholeText();
        java.lang.String str9 = textNode5.text();
        org.jsoup.nodes.Attributes attributes10 = textNode5.attributes();
        org.jsoup.nodes.Node node11 = textNode5.clone();
        java.lang.Class<?> wildcardClass12 = textNode5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        int int8 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        java.lang.String str11 = textNode2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.before("h");
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("hi!");
        java.lang.String str8 = textNode2.text();
        java.lang.String str10 = textNode2.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean15 = textNode13.equals((java.lang.Object) false);
        int int16 = textNode13.siblingIndex();
        org.jsoup.nodes.Attributes attributes17 = textNode13.attributes();
        boolean boolean19 = textNode13.hasAttr("");
        org.jsoup.nodes.Node node20 = textNode13.nextSibling();
        java.lang.String str21 = textNode13.getWholeText();
        java.lang.String str22 = textNode13.toString();
        java.lang.String str24 = textNode13.absUrl("#text");
        java.lang.String str25 = textNode13.getWholeText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = textNode2.after((org.jsoup.nodes.Node) textNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
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
        org.jsoup.nodes.Attributes attributes25 = textNode5.attributes();
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
        org.junit.Assert.assertNotNull(attributes25);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.lang.String str10 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean16 = textNode14.equals((java.lang.Object) false);
        int int17 = textNode14.siblingIndex();
        org.jsoup.nodes.Attributes attributes18 = textNode14.attributes();
        org.jsoup.nodes.Node node19 = textNode14.clone();
        org.jsoup.nodes.Document document20 = textNode14.ownerDocument();
        org.jsoup.nodes.Attributes attributes21 = textNode14.attributes();
        boolean boolean22 = textNode2.equals((java.lang.Object) textNode14);
        java.lang.String str23 = textNode2.text();
        org.jsoup.nodes.Attributes attributes24 = textNode2.attributes();
        int int25 = textNode2.childNodeSize();
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
        org.junit.Assert.assertNotNull(textNode14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "#text");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.text();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.lang.String str10 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean16 = textNode14.equals((java.lang.Object) false);
        int int17 = textNode14.siblingIndex();
        org.jsoup.nodes.Attributes attributes18 = textNode14.attributes();
        org.jsoup.nodes.Node node19 = textNode14.clone();
        org.jsoup.nodes.Document document20 = textNode14.ownerDocument();
        org.jsoup.nodes.Attributes attributes21 = textNode14.attributes();
        boolean boolean22 = textNode2.equals((java.lang.Object) textNode14);
        org.jsoup.nodes.Node node23 = textNode14.previousSibling();
        org.jsoup.nodes.Node node24 = textNode14.nextSibling();
        textNode14.ensureAttributes();
        java.lang.String str26 = textNode14.text();
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
        org.junit.Assert.assertNotNull(textNode14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
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
        org.jsoup.nodes.TextNode textNode16 = textNode2.text("h");
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
        org.junit.Assert.assertNotNull(textNode16);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        java.lang.String str9 = textNode2.attr("hi!");
        org.jsoup.nodes.Node node12 = textNode2.attr("h", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.childNodesCopy();
        org.jsoup.nodes.TextNode textNode16 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean18 = textNode16.equals((java.lang.Object) false);
        org.jsoup.nodes.Node node21 = textNode16.attr("hi!", "");
        java.lang.String str22 = textNode16.text();
        org.jsoup.nodes.Attributes attributes23 = textNode16.attributes();
        org.jsoup.nodes.Attributes attributes24 = textNode16.attributes();
        org.jsoup.nodes.Node node25 = textNode16.parent();
        org.jsoup.nodes.Attributes attributes26 = textNode16.attributes();
        int int27 = textNode16.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            node12.replaceWith((org.jsoup.nodes.Node) textNode16);
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
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        org.jsoup.nodes.Node node8 = textNode7.previousSibling();
        org.jsoup.nodes.Node node9 = textNode7.clone();
        java.lang.String str10 = textNode7.baseUri();
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
        org.junit.Assert.assertNotNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        boolean boolean9 = textNode2.isBlank();
        java.lang.String str11 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("hi!");
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
        org.junit.Assert.assertNull(document12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode14);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        boolean boolean4 = textNode2.isBlank();
        int int5 = textNode2.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.after("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.getWholeText();
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
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("hi!");
        java.lang.String str12 = textNode2.text();
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
        org.junit.Assert.assertNotNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode6 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str7 = textNode6.outerHtml();
        org.jsoup.nodes.TextNode textNode9 = textNode6.text("");
        boolean boolean10 = textNode2.equals((java.lang.Object) "");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node16 = textNode2.attr("hi!", "");
        org.jsoup.nodes.TextNode textNode18 = textNode2.text("i!");
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
        org.junit.Assert.assertNotNull(textNode18);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode7.before("i!");
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
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.lang.String str7 = textNode5.baseUri();
        java.lang.String str8 = textNode5.outerHtml();
        java.lang.String str10 = textNode5.attr("hi!");
        java.lang.String str11 = textNode5.toString();
        java.lang.String str13 = textNode5.absUrl("hi!");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Node node1 = textNode0.nextSibling();
        java.lang.String str2 = textNode0.nodeName();
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node6 = textNode5.previousSibling();
        org.jsoup.nodes.Node node8 = textNode5.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            textNode0.replaceWith((org.jsoup.nodes.Node) textNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#text" + "'", str2.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        textNode2.ensureAttributes();
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        node8.setBaseUri("");
        org.jsoup.nodes.Node node11 = node8.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node8.unwrap();
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
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.after("hi!");
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
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        java.lang.String str8 = textNode7.outerHtml();
        org.jsoup.nodes.Node node9 = textNode7.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node9.siblingNodes();
        org.jsoup.nodes.Node node11 = node9.nextSibling();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.traverse(nodeVisitor12);
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
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        boolean boolean9 = textNode7.hasAttr("#text");
        boolean boolean11 = textNode7.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode7.childNodesCopy();
        java.lang.String str14 = textNode7.absUrl("hi!");
        int int15 = textNode7.childNodeSize();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.toString();
        java.lang.String str6 = textNode2.outerHtml();
        int int7 = textNode2.siblingIndex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("i!");
        org.jsoup.nodes.Node node10 = node9.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.childNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.lang.String str8 = textNode2.absUrl("h");
        java.lang.String str9 = textNode2.outerHtml();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodesCopy();
        java.lang.String str6 = textNode2.text();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        java.lang.String str8 = textNode2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode10 = textNode2.splitText((int) '4');
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
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = textNode2.attr("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "#text" + "'", str20.equals("#text"));
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = textNode2.text();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node11 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode15 = textNode13.text("hi!");
        org.jsoup.nodes.TextNode textNode17 = textNode13.text("i!");
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
        org.junit.Assert.assertNotNull(textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode17);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = node4.childNodes();
        org.jsoup.nodes.Node node6 = node4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node6.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        textNode2.ensureAttributes();
        boolean boolean9 = textNode2.hasAttr("h");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        boolean boolean6 = textNode2.hasAttr("i!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        java.lang.String str4 = textNode2.getWholeText();
        textNode2.ensureAttributes();
        boolean boolean7 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        int int9 = textNode2.childNodeSize();
        boolean boolean11 = textNode2.hasAttr("");
        int int12 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node15 = textNode2.attr("#text", "i!");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.text();
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode2.childNode(1);
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
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
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
        org.jsoup.nodes.TextNode textNode29 = textNode10.text("#text");
        textNode29.ensureAttributes();
        org.jsoup.nodes.Attributes attributes31 = textNode29.attributes();
        java.lang.String str32 = textNode29.outerHtml();
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
        org.junit.Assert.assertNotNull(textNode29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "#text" + "'", str32.equals("#text"));
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        boolean boolean5 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        java.lang.String str7 = textNode2.text();
        boolean boolean9 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "hi!");
        java.lang.String str8 = node7.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node7.childNodes();
        org.jsoup.nodes.Node node10 = node7.parent();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str5 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.baseUri();
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
        org.junit.Assert.assertNotNull(attributes8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        int int6 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node7 = textNode2.clone();
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
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        java.lang.String str4 = textNode2.getWholeText();
        textNode2.ensureAttributes();
        boolean boolean7 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        int int9 = textNode2.childNodeSize();
        boolean boolean11 = textNode2.hasAttr("");
        boolean boolean12 = textNode2.isBlank();
        java.lang.String str13 = textNode2.nodeName();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        textNode2.setBaseUri("");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        textNode2.ensureAttributes();
        java.lang.String str14 = textNode2.absUrl("#text");
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
        org.junit.Assert.assertNotNull(nodeList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        java.lang.String str6 = textNode2.outerHtml();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = textNode2.after("");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "#text" + "'", str20.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.lang.String str9 = textNode2.text();
        boolean boolean11 = textNode2.hasAttr("#text");
        textNode2.ensureAttributes();
        boolean boolean14 = textNode2.hasAttr("");
        java.lang.Class<?> wildcardClass15 = textNode2.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        int int4 = textNode2.childNodeSize();
        boolean boolean6 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        boolean boolean6 = textNode5.isBlank();
        org.jsoup.nodes.Node node7 = textNode5.nextSibling();
        boolean boolean9 = textNode5.equals((java.lang.Object) (-1));
        java.lang.String str11 = textNode5.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode13 = textNode5.splitText((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
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
        org.junit.Assert.assertNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        java.lang.String str3 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#text" + "'", str3.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
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
        boolean boolean16 = textNode2.hasAttr("");
        java.lang.String str17 = textNode2.toString();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        boolean boolean6 = textNode2.hasAttr("");
        boolean boolean8 = textNode2.hasAttr("#text");
        java.lang.String str9 = textNode2.baseUri();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        java.lang.String str5 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("h");
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node13 = textNode12.previousSibling();
        java.lang.String str14 = textNode12.text();
        java.lang.String str15 = textNode12.text();
        java.lang.String str16 = textNode12.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode12.childNodesCopy();
        int int18 = textNode12.siblingIndex();
        org.jsoup.nodes.TextNode textNode20 = textNode12.text("hi!");
        java.lang.String str21 = textNode20.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = textNode2.after((org.jsoup.nodes.Node) textNode20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.attr("i!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str8 = textNode7.outerHtml();
        org.jsoup.nodes.TextNode textNode10 = textNode7.text("");
        int int11 = textNode10.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode10.childNodesCopy();
        org.jsoup.nodes.TextNode textNode15 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node16 = textNode15.parent();
        boolean boolean17 = textNode15.isBlank();
        org.jsoup.nodes.Document document18 = textNode15.ownerDocument();
        org.jsoup.nodes.TextNode textNode20 = textNode15.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode15.childNodesCopy();
        java.lang.String str22 = textNode15.text();
        boolean boolean23 = textNode15.isBlank();
        textNode15.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = textNode15.childNodesCopy();
        boolean boolean27 = textNode10.equals((java.lang.Object) textNode15);
        boolean boolean29 = textNode15.hasAttr("hi!");
        org.jsoup.nodes.Node node30 = textNode15.nextSibling();
        boolean boolean31 = textNode15.isBlank();
        boolean boolean32 = textNode2.equals((java.lang.Object) textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
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
        textNode2.ensureAttributes();
        org.jsoup.nodes.Attributes attributes17 = textNode2.attributes();
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
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.toString();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode8.traverse(nodeVisitor9);
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
        org.junit.Assert.assertNotNull(textNode8);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        java.lang.String str4 = textNode2.getWholeText();
        textNode2.ensureAttributes();
        boolean boolean7 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        int int11 = textNode2.childNodeSize();
        boolean boolean12 = textNode2.isBlank();
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
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        java.lang.String str10 = textNode2.toString();
        int int11 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode13 = textNode2.splitText((int) (short) 0);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode13);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode5.childNodesCopy();
        java.lang.String str8 = textNode5.toString();
        textNode5.ensureAttributes();
        java.lang.String str10 = textNode5.getWholeText();
        java.lang.String str12 = textNode5.absUrl("i!");
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        boolean boolean9 = textNode2.isBlank();
        java.lang.String str11 = textNode2.attr("");
        org.jsoup.nodes.Node node12 = textNode2.clone();
        java.lang.Class<?> wildcardClass13 = node12.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.toString();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        boolean boolean9 = textNode2.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode2.unwrap();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("h");
        java.lang.String str5 = textNode4.getWholeText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "h" + "'", str5.equals("h"));
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        boolean boolean8 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        int int10 = textNode2.siblingIndex();
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
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        int int8 = textNode7.childNodeSize();
        java.lang.String str9 = textNode7.nodeName();
        org.jsoup.nodes.TextNode textNode11 = textNode7.text("hi!");
        java.lang.String str12 = textNode7.text();
        boolean boolean13 = textNode7.isBlank();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        int int10 = textNode2.childNodeSize();
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
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.lang.String str10 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean16 = textNode14.equals((java.lang.Object) false);
        int int17 = textNode14.siblingIndex();
        org.jsoup.nodes.Attributes attributes18 = textNode14.attributes();
        org.jsoup.nodes.Node node19 = textNode14.clone();
        org.jsoup.nodes.Document document20 = textNode14.ownerDocument();
        org.jsoup.nodes.Attributes attributes21 = textNode14.attributes();
        boolean boolean22 = textNode2.equals((java.lang.Object) textNode14);
        org.jsoup.nodes.Node node23 = textNode14.previousSibling();
        boolean boolean24 = textNode14.isBlank();
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
        org.junit.Assert.assertNotNull(textNode14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        int int8 = textNode2.childNodeSize();
        java.lang.String str9 = textNode2.outerHtml();
        textNode2.setBaseUri("#text");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        java.lang.String str6 = textNode2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
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
        org.jsoup.nodes.TextNode textNode22 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean24 = textNode22.equals((java.lang.Object) false);
        int int25 = textNode22.siblingIndex();
        org.jsoup.nodes.Attributes attributes26 = textNode22.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = textNode22.siblingNodes();
        org.jsoup.nodes.Node node28 = textNode22.previousSibling();
        boolean boolean29 = textNode22.isBlank();
        org.jsoup.nodes.Node node30 = textNode22.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = node30.siblingNodes();
        boolean boolean32 = textNode2.equals((java.lang.Object) nodeList31);
        java.lang.String str33 = textNode2.nodeName();
        java.lang.String str35 = textNode2.absUrl("h");
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
        org.junit.Assert.assertNotNull(textNode22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "#text" + "'", str33.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        textNode2.ensureAttributes();
        int int8 = textNode2.childNodeSize();
        java.lang.String str10 = textNode2.attr("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
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
        java.lang.String str16 = textNode2.nodeName();
        org.jsoup.nodes.Node node17 = textNode2.parent();
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.lang.String str8 = textNode2.text();
        java.lang.String str9 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str11 = textNode2.nodeName();
        java.lang.String str12 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.siblingNodes();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        java.lang.String str3 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        textNode2.ensureAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str10 = textNode2.attr("hi!");
        boolean boolean12 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node13 = textNode2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode15 = textNode2.splitText((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node11 = textNode10.parent();
        boolean boolean12 = textNode10.isBlank();
        org.jsoup.nodes.Document document13 = textNode10.ownerDocument();
        org.jsoup.nodes.TextNode textNode15 = textNode10.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode10.childNodesCopy();
        org.jsoup.nodes.Node node17 = textNode10.nextSibling();
        textNode10.setBaseUri("hi!");
        org.jsoup.nodes.Node node20 = textNode10.parent();
        org.jsoup.nodes.TextNode textNode23 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int24 = textNode23.childNodeSize();
        org.jsoup.nodes.TextNode textNode27 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str28 = textNode27.outerHtml();
        org.jsoup.nodes.TextNode textNode30 = textNode27.text("");
        boolean boolean31 = textNode23.equals((java.lang.Object) "");
        java.util.List<org.jsoup.nodes.Node> nodeList32 = textNode23.childNodesCopy();
        boolean boolean33 = textNode10.equals((java.lang.Object) textNode23);
        java.lang.String str35 = textNode23.attr("hi!");
        textNode23.ensureAttributes();
        org.jsoup.nodes.Document document37 = textNode23.ownerDocument();
        boolean boolean38 = node7.equals((java.lang.Object) document37);
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
        org.junit.Assert.assertNull(node17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        boolean boolean6 = textNode5.isBlank();
        textNode5.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode5.siblingNodes();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean13 = textNode5.equals((java.lang.Object) "");
        java.lang.String str14 = textNode5.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = textNode5.removeAttr("");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        int int8 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        java.lang.String str11 = textNode2.outerHtml();
        java.lang.String str12 = textNode2.toString();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.text();
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str10 = textNode2.attr("h");
        java.lang.String str11 = textNode2.nodeName();
        java.lang.String str12 = textNode2.toString();
        org.jsoup.nodes.Node node13 = textNode2.nextSibling();
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
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        org.jsoup.nodes.Document document7 = node6.ownerDocument();
        java.lang.String str8 = node6.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node6.childNodesCopy();
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node13 = textNode12.parent();
        boolean boolean14 = textNode12.isBlank();
        org.jsoup.nodes.Document document15 = textNode12.ownerDocument();
        org.jsoup.nodes.TextNode textNode17 = textNode12.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode12.childNodesCopy();
        org.jsoup.nodes.Node node19 = textNode12.nextSibling();
        textNode12.setBaseUri("hi!");
        org.jsoup.nodes.Node node22 = textNode12.parent();
        java.lang.String str23 = textNode12.nodeName();
        org.jsoup.nodes.Node node24 = textNode12.nextSibling();
        org.jsoup.nodes.Node node25 = textNode12.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node6.after(node25);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "#text" + "'", str23.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        boolean boolean9 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node12 = textNode2.attr("#text", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode16 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str17 = textNode16.outerHtml();
        org.jsoup.nodes.TextNode textNode19 = textNode16.text("");
        org.jsoup.nodes.Node node20 = textNode16.nextSibling();
        org.jsoup.nodes.Node node21 = textNode16.parent();
        org.jsoup.nodes.TextNode textNode23 = textNode16.text("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode16.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode16.siblingNodes();
        boolean boolean26 = textNode2.equals((java.lang.Object) textNode16);
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
        org.junit.Assert.assertNotNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode16);
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
        org.junit.Assert.assertNotNull(nodeList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        boolean boolean7 = textNode2.equals((java.lang.Object) '#');
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("i!");
        java.lang.String str12 = textNode2.baseUri();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        java.lang.String str5 = textNode2.text();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str11 = textNode10.outerHtml();
        org.jsoup.nodes.TextNode textNode13 = textNode10.text("");
        int int14 = textNode13.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode13.childNodesCopy();
        org.jsoup.nodes.TextNode textNode18 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node19 = textNode18.parent();
        boolean boolean20 = textNode18.isBlank();
        org.jsoup.nodes.Document document21 = textNode18.ownerDocument();
        org.jsoup.nodes.TextNode textNode23 = textNode18.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode18.childNodesCopy();
        java.lang.String str25 = textNode18.text();
        boolean boolean26 = textNode18.isBlank();
        textNode18.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = textNode18.childNodesCopy();
        boolean boolean30 = textNode13.equals((java.lang.Object) textNode18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = node7.equals((java.lang.Object) boolean30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
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
        java.lang.Class<?> wildcardClass25 = textNode2.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        boolean boolean3 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("", "");
        boolean boolean8 = textNode2.equals((java.lang.Object) "");
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node11 = node10.nextSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.lang.String str4 = textNode2.attr("");
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode7.siblingNodes();
        java.lang.String str9 = textNode7.getWholeText();
        boolean boolean10 = textNode2.equals((java.lang.Object) str9);
        java.lang.String str12 = textNode2.absUrl("#text");
        java.lang.String str14 = textNode2.attr("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        boolean boolean11 = textNode2.hasAttr("#text");
        boolean boolean13 = textNode2.hasAttr("hi!");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node10 = textNode2.clone();
        textNode2.ensureAttributes();
        boolean boolean12 = textNode2.isBlank();
        org.jsoup.nodes.Document document13 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.siblingNodes();
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
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
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
        org.jsoup.nodes.Document document14 = textNode10.ownerDocument();
        org.jsoup.nodes.Attributes attributes15 = textNode10.attributes();
        java.lang.String str16 = textNode10.outerHtml();
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
        org.junit.Assert.assertNull(document14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        int int6 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.absUrl("#text");
        textNode2.ensureAttributes();
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
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        java.lang.String str4 = textNode2.getWholeText();
        textNode2.ensureAttributes();
        java.lang.String str6 = textNode2.baseUri();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        int int8 = textNode7.childNodeSize();
        java.lang.String str9 = textNode7.nodeName();
        org.jsoup.nodes.TextNode textNode11 = textNode7.text("hi!");
        java.lang.String str12 = textNode11.getWholeText();
        org.jsoup.nodes.TextNode textNode14 = textNode11.splitText((int) (short) 0);
        org.jsoup.nodes.Node node15 = textNode14.parent();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        java.lang.String str4 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.Node node11 = textNode2.attr("hi!", "#text");
        int int12 = textNode2.childNodeSize();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode8 = textNode2.splitText((int) '4');
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }
}
