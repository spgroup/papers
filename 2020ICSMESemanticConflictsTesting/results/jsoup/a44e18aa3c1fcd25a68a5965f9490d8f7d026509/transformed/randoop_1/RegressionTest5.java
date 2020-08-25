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
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.nodeName();
        boolean boolean7 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node11 = textNode2.attr("#text", "hi!");
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
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        java.util.List<org.jsoup.nodes.Node> nodeList1 = textNode0.childNodesCopy();
        org.jsoup.nodes.Node node2 = textNode0.parent();
        boolean boolean3 = textNode0.isBlank();
        textNode0.setBaseUri("#text");
        java.lang.String str6 = textNode0.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode0.before("#text");
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
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.lang.String str7 = textNode5.baseUri();
        org.jsoup.nodes.TextNode textNode9 = textNode5.text("#text");
        boolean boolean11 = textNode9.hasAttr("#text");
        java.lang.String str13 = textNode9.attr("");
        java.lang.String str14 = textNode9.outerHtml();
        textNode9.setBaseUri("h");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        int int3 = textNode2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str5 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        java.lang.String str10 = textNode8.absUrl("#text");
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
        org.junit.Assert.assertNotNull(textNode8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        int int3 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        textNode5.ensureAttributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.getWholeText();
        int int9 = textNode2.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode11 = textNode2.splitText((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        boolean boolean9 = textNode7.hasAttr("#text");
        boolean boolean11 = textNode7.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode7.childNodesCopy();
        java.lang.String str14 = textNode7.attr("");
        org.jsoup.nodes.Node node15 = textNode7.previousSibling();
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
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        textNode2.setBaseUri("");
        java.lang.Object obj6 = null;
        boolean boolean7 = textNode2.equals(obj6);
        java.lang.String str8 = textNode2.baseUri();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.nodeName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        int int10 = textNode2.childNodeSize();
        java.lang.String str11 = textNode2.toString();
        java.lang.Class<?> wildcardClass12 = textNode2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "hi!");
        java.lang.String str8 = node7.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node7.childNodes();
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
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
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
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode17 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node18 = textNode17.previousSibling();
        java.lang.String str19 = textNode17.text();
        java.lang.String str20 = textNode17.text();
        java.lang.String str21 = textNode17.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode17.childNodesCopy();
        int int23 = textNode17.siblingIndex();
        int int24 = textNode17.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode17.siblingNodes();
        org.jsoup.nodes.TextNode textNode28 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean30 = textNode28.equals((java.lang.Object) false);
        java.lang.String str31 = textNode28.text();
        org.jsoup.nodes.TextNode textNode33 = textNode28.text("hi!");
        java.lang.String str35 = textNode28.attr("");
        boolean boolean36 = textNode17.equals((java.lang.Object) textNode28);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = textNode2.after((org.jsoup.nodes.Node) textNode17);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.Node node9 = textNode2.attr("hi!", "");
        java.lang.String str11 = textNode2.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str15 = textNode14.outerHtml();
        org.jsoup.nodes.TextNode textNode17 = textNode14.text("");
        int int18 = textNode17.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode17.childNodesCopy();
        java.lang.String str20 = textNode17.toString();
        textNode17.ensureAttributes();
        boolean boolean22 = textNode2.equals((java.lang.Object) textNode17);
        boolean boolean23 = textNode17.isBlank();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
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
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
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
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("#text");
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("h", "");
        boolean boolean10 = textNode2.equals((java.lang.Object) textNode9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode9.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        int int5 = textNode2.siblingIndex();
        java.lang.String str6 = textNode2.toString();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        int int9 = node8.childNodeSize();
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
        org.junit.Assert.assertNotNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.nodeName();
        textNode2.ensureAttributes();
        org.jsoup.nodes.Node node14 = textNode2.attr("hi!", "i!");
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
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        boolean boolean8 = textNode2.hasAttr("");
        java.lang.String str9 = textNode2.getWholeText();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        int int8 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("hi!");
        org.jsoup.nodes.Attributes attributes13 = textNode2.attributes();
        int int14 = textNode2.siblingIndex();
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
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.absUrl("hi!");
        java.lang.String str10 = textNode2.baseUri();
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("h");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.childNodesCopy();
        node12.setBaseUri("h");
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
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
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
        textNode2.ensureAttributes();
        org.jsoup.nodes.Node node29 = textNode2.removeAttr("i!");
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
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        textNode2.ensureAttributes();
        boolean boolean9 = textNode2.hasAttr("h");
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
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode6 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str7 = textNode6.outerHtml();
        org.jsoup.nodes.TextNode textNode9 = textNode6.text("");
        boolean boolean10 = textNode2.equals((java.lang.Object) "");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node16 = textNode2.attr("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.absUrl("hi!");
        java.lang.String str10 = textNode2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.attr("", "#text");
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
        org.junit.Assert.assertNotNull(nodeList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.nodeName();
        java.lang.String str11 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.siblingNodes();
        boolean boolean13 = textNode2.isBlank();
        java.lang.String str15 = textNode2.attr("#text");
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
        org.junit.Assert.assertNotNull(nodeList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        java.lang.String str4 = textNode2.getWholeText();
        textNode2.ensureAttributes();
        boolean boolean7 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        int int9 = textNode2.childNodeSize();
        java.lang.String str10 = textNode2.toString();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        textNode2.ensureAttributes();
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("h");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
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
        int int23 = textNode22.siblingIndex();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.absUrl("#text");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
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
        boolean boolean26 = textNode10.isBlank();
        textNode10.setBaseUri("i!");
        org.jsoup.nodes.TextNode textNode31 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node32 = textNode31.parent();
        boolean boolean33 = textNode31.isBlank();
        org.jsoup.nodes.Document document34 = textNode31.ownerDocument();
        org.jsoup.nodes.TextNode textNode36 = textNode31.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList37 = textNode31.childNodesCopy();
        org.jsoup.nodes.Node node38 = textNode31.nextSibling();
        textNode31.setBaseUri("hi!");
        org.jsoup.nodes.Node node41 = textNode31.parent();
        java.lang.String str42 = textNode31.nodeName();
        textNode31.ensureAttributes();
        java.lang.String str44 = textNode31.text();
        // The following exception was thrown during execution in test generation
        try {
            textNode10.replaceWith((org.jsoup.nodes.Node) textNode31);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "#text" + "'", str42.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = textNode2.text();
        int int6 = textNode2.siblingIndex();
        int int7 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.Class<?> wildcardClass10 = textNode2.getClass();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.lang.String str7 = textNode5.baseUri();
        org.jsoup.nodes.TextNode textNode9 = textNode5.text("#text");
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node13 = textNode12.previousSibling();
        java.lang.String str14 = textNode12.text();
        org.jsoup.nodes.Document document15 = textNode12.ownerDocument();
        org.jsoup.nodes.Node node16 = textNode12.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode12.childNodes();
        java.lang.String str18 = textNode12.baseUri();
        java.lang.String str20 = textNode12.absUrl("hi!");
        boolean boolean21 = textNode5.equals((java.lang.Object) textNode12);
        org.jsoup.nodes.Node node22 = textNode5.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = node22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(textNode9);
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
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = textNode10.unwrap();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str8 = textNode7.outerHtml();
        org.jsoup.nodes.TextNode textNode10 = textNode7.text("");
        boolean boolean11 = textNode10.isBlank();
        textNode10.setBaseUri("hi!");
        java.lang.String str14 = textNode10.toString();
        boolean boolean15 = node4.equals((java.lang.Object) textNode10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = textNode10.before("#text");
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
        org.junit.Assert.assertNotNull(textNode7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        java.lang.String str7 = textNode2.baseUri();
        java.lang.Class<?> wildcardClass8 = textNode2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node5 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        textNode2.ensureAttributes();
        org.jsoup.nodes.Node node10 = textNode2.attr("hi!", "");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        org.jsoup.nodes.Node node14 = textNode2.removeAttr("i!");
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
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("i!");
        org.jsoup.nodes.Node node10 = node9.clone();
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
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
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
        org.junit.Assert.assertNotNull(attributes8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = node4.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        java.lang.String str3 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        textNode2.ensureAttributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
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
        org.jsoup.nodes.TextNode textNode29 = textNode10.text("h");
        int int30 = textNode29.childNodeSize();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
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
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        int int4 = textNode2.childNodeSize();
        boolean boolean6 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.outerHtml();
        boolean boolean8 = textNode2.isBlank();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str8 = textNode7.outerHtml();
        org.jsoup.nodes.TextNode textNode10 = textNode7.text("");
        int int11 = textNode10.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode10.childNodesCopy();
        int int13 = textNode10.siblingIndex();
        org.jsoup.nodes.Node node14 = textNode10.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode10.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = document4.equals((java.lang.Object) textNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#text" + "'", str3.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document4);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.lang.String str7 = textNode5.baseUri();
        org.jsoup.nodes.TextNode textNode9 = textNode5.text("#text");
        org.jsoup.nodes.TextNode textNode11 = textNode9.text("hi!");
        java.lang.String str13 = textNode9.attr("h");
        java.lang.String str14 = textNode9.getWholeText();
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
        org.junit.Assert.assertNotNull(textNode11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = node4.childNodes();
        org.jsoup.nodes.Node node6 = node4.nextSibling();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
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
        boolean boolean20 = textNode2.isBlank();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.lang.String str8 = textNode2.text();
        java.lang.String str9 = textNode2.baseUri();
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
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str10 = textNode2.attr("hi!");
        boolean boolean12 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node13 = textNode2.clone();
        org.jsoup.nodes.Node node14 = textNode2.clone();
        boolean boolean16 = textNode2.hasAttr("");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.lang.String str7 = textNode5.baseUri();
        org.jsoup.nodes.TextNode textNode9 = textNode5.text("#text");
        org.jsoup.nodes.Node node10 = textNode9.parent();
        textNode9.ensureAttributes();
        boolean boolean12 = textNode9.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode9.siblingNodes();
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
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
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
        java.lang.String str23 = textNode10.baseUri();
        org.jsoup.select.NodeVisitor nodeVisitor24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = textNode10.traverse(nodeVisitor24);
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
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
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
        org.jsoup.nodes.Node node19 = node16.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node16.after("#text");
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
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str5 = textNode2.nodeName();
        textNode2.ensureAttributes();
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str10 = textNode9.outerHtml();
        org.jsoup.nodes.TextNode textNode12 = textNode9.text("");
        boolean boolean13 = textNode12.isBlank();
        textNode12.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode12.siblingNodes();
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean20 = textNode12.equals((java.lang.Object) "");
        java.lang.String str21 = textNode12.text();
        boolean boolean22 = textNode12.isBlank();
        java.lang.String str24 = textNode12.attr("");
        java.lang.String str25 = textNode12.baseUri();
        org.jsoup.nodes.Node node26 = textNode12.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = textNode2.before((org.jsoup.nodes.Node) textNode12);
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "h");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        boolean boolean3 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("", "");
        boolean boolean8 = textNode2.equals((java.lang.Object) "");
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
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
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        java.lang.String str8 = textNode2.text();
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.unwrap();
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
        org.junit.Assert.assertNotNull(textNode12);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        boolean boolean3 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        int int5 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.lang.String str7 = textNode5.baseUri();
        java.lang.String str8 = textNode5.outerHtml();
        java.lang.String str10 = textNode5.attr("hi!");
        java.lang.String str11 = textNode5.toString();
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
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        textNode2.ensureAttributes();
        int int8 = textNode2.childNodeSize();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.lang.String str7 = textNode5.baseUri();
        org.jsoup.nodes.TextNode textNode9 = textNode5.text("#text");
        org.jsoup.nodes.Node node10 = textNode9.parent();
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node14 = textNode13.parent();
        boolean boolean15 = textNode13.isBlank();
        org.jsoup.nodes.Document document16 = textNode13.ownerDocument();
        org.jsoup.nodes.TextNode textNode18 = textNode13.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode13.childNodesCopy();
        org.jsoup.nodes.Node node20 = textNode13.nextSibling();
        textNode13.setBaseUri("hi!");
        org.jsoup.nodes.Node node23 = textNode13.parent();
        int int24 = textNode13.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode13.childNodesCopy();
        java.lang.String str27 = textNode13.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = node10.before((org.jsoup.nodes.Node) textNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(textNode9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node10);
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
        org.junit.Assert.assertNull(node20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.toString();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        boolean boolean9 = textNode2.isBlank();
        java.lang.String str10 = textNode2.baseUri();
        textNode2.setBaseUri("#text");
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
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.Node node11 = textNode2.attr("#text", "");
        java.lang.String str13 = textNode2.absUrl("i!");
        java.lang.String str14 = textNode2.getWholeText();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.nodeName();
        java.lang.String str11 = textNode2.toString();
        java.lang.String str12 = textNode2.nodeName();
        int int13 = textNode2.siblingIndex();
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
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
            org.jsoup.nodes.Node node18 = textNode2.before("#text");
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
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("h");
        textNode2.setBaseUri("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = textNode2.removeAttr("");
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
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = document8.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.lang.String str8 = textNode2.text();
        java.lang.String str9 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean14 = textNode12.equals((java.lang.Object) false);
        int int15 = textNode12.siblingIndex();
        org.jsoup.nodes.Attributes attributes16 = textNode12.attributes();
        org.jsoup.nodes.Node node17 = textNode12.clone();
        org.jsoup.nodes.Document document18 = textNode12.ownerDocument();
        org.jsoup.nodes.Node node19 = textNode12.nextSibling();
        java.lang.String str20 = textNode12.getWholeText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = textNode2.before((org.jsoup.nodes.Node) textNode12);
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
        org.junit.Assert.assertNotNull(textNode12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attributes16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
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
        boolean boolean41 = textNode10.hasAttr("hi!");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = document5.wrap("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList6 = node5.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        boolean boolean9 = textNode2.hasAttr("hi!");
        int int10 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        org.jsoup.nodes.Node node14 = textNode2.attr("#text", "h");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node14.siblingNodes();
        org.jsoup.nodes.Node node16 = node14.clone();
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
        org.junit.Assert.assertNotNull(nodeList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
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
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
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
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
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
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
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
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
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
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
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
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
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
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
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
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
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
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
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
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
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
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
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
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
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
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
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
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("hi!");
        java.lang.String str8 = textNode2.text();
        java.lang.String str10 = textNode2.absUrl("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nodeList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
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
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
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
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
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
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
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
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
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
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
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
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
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
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
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
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
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
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
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
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
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
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
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
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
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
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
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
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
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
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
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
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
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
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
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
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
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
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
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
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
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
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
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
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
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
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
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
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        boolean boolean3 = textNode2.isBlank();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
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
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
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
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
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
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        java.lang.String str4 = textNode2.getWholeText();
        textNode2.ensureAttributes();
        java.lang.String str6 = textNode2.baseUri();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
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
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
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
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
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
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
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
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
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
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
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
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
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
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
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
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
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
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        java.lang.String str3 = textNode2.toString();
        textNode2.ensureAttributes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#text" + "'", str3.equals("#text"));
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
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
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
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
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
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
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
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
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
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
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
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
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
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
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
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
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
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
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
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
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
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
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
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
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
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
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
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
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
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
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
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
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
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
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
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
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
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
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
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
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
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
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
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
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
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
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
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
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
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
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
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
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
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
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
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
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
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
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
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
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
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
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
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
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
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
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        java.lang.String str5 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("h");
        java.lang.String str9 = textNode2.text();
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
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
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
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
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
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
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
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
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
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
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
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
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
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
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
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
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
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
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
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
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
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textNode2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
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
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
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
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
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
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
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
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.absUrl("hi!");
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
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
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
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
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
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
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
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
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
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
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
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
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
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
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
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
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
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
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
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
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
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
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
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
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
}
