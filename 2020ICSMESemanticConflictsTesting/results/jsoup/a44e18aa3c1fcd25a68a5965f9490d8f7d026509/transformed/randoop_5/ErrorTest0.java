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
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("hi!");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        java.lang.String str5 = textNode2.text();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("#text");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = textNode0.toString();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("#text");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        java.lang.String str4 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("hi!");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode6 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str7 = textNode6.outerHtml();
        org.jsoup.nodes.TextNode textNode9 = textNode6.text("");
        boolean boolean10 = textNode2.equals((java.lang.Object) "");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("hi!");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        java.util.List<org.jsoup.nodes.Node> nodeList1 = textNode0.childNodesCopy();
        org.jsoup.nodes.Node node2 = textNode0.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.TextNode textNode4 = textNode0.splitText((int) (byte) 1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        java.lang.String str5 = textNode2.absUrl("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("#text");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        java.lang.String str4 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("hi!");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode6 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str7 = textNode6.outerHtml();
        org.jsoup.nodes.TextNode textNode9 = textNode6.text("");
        boolean boolean10 = textNode2.equals((java.lang.Object) "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("hi!");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        boolean boolean6 = textNode5.isBlank();
        textNode5.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode5.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode5.wrap("hi!");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node6.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = node6.wrap("hi!");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = node4.wrap("#text");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("#text");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        java.lang.String str5 = textNode2.text();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        int int8 = textNode2.siblingIndex();
        int int9 = textNode2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#text");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        boolean boolean9 = textNode2.hasAttr("hi!");
        int int10 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#text");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        int int8 = textNode7.childNodeSize();
        int int9 = textNode7.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode7.wrap("hi!");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = textNode2.wrap("hi!");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        java.lang.String str9 = textNode2.text();
        boolean boolean10 = textNode2.isBlank();
        org.jsoup.nodes.Node node13 = textNode2.attr("#text", "#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("#text");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        int int10 = textNode2.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#text");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        int int4 = textNode2.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("#text");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode10.wrap("#text");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode2.wrap("#text");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.Node node8 = node6.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node6.wrap("#text");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        java.util.List<org.jsoup.nodes.Node> nodeList1 = textNode0.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = textNode0.outerHtml();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        textNode2.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        boolean boolean9 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node10 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node10.wrap("#text");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean13 = textNode11.equals((java.lang.Object) false);
        org.jsoup.nodes.Node node16 = textNode11.attr("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node16.siblingNodes();
        java.lang.Class<?> wildcardClass18 = nodeList17.getClass();
        boolean boolean19 = textNode2.equals((java.lang.Object) wildcardClass18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode2.wrap("#text");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode7.wrap("h");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.baseUri();
        textNode2.setBaseUri("hi!");
        int int6 = textNode2.childNodeSize();
        int int7 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("hi!");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("hi!");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        java.lang.String str5 = textNode2.text();
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#text");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode6 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str7 = textNode6.outerHtml();
        org.jsoup.nodes.TextNode textNode9 = textNode6.text("");
        boolean boolean10 = textNode2.equals((java.lang.Object) "");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node16 = textNode2.attr("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = node16.wrap("h");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("hi!");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "#text");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("#text");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("hi!");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        java.lang.String str5 = textNode2.text();
        java.lang.String str6 = textNode2.toString();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        boolean boolean8 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("h");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode5.childNodesCopy();
        java.lang.String str8 = textNode5.toString();
        boolean boolean9 = textNode5.isBlank();
        java.lang.String str10 = textNode5.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode5.wrap("#text");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node10 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node10.wrap("h");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node10 = textNode2.clone();
        textNode2.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("#text");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("#text");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.baseUri();
        textNode2.setBaseUri("hi!");
        java.lang.String str6 = textNode2.baseUri();
        java.lang.String str7 = textNode2.baseUri();
        boolean boolean8 = textNode2.isBlank();
        org.jsoup.nodes.Node node11 = textNode2.attr("#text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("h");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        boolean boolean5 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        java.lang.String str7 = textNode2.text();
        java.lang.String str8 = textNode2.text();
        java.lang.String str9 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.getWholeText();
        java.lang.String str9 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("hi!");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        boolean boolean6 = textNode5.isBlank();
        org.jsoup.nodes.Node node7 = textNode5.nextSibling();
        boolean boolean9 = textNode5.equals((java.lang.Object) (-1));
        java.lang.String str10 = textNode5.getWholeText();
        org.jsoup.nodes.Node node11 = textNode5.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode5.wrap("hi!");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        textNode2.ensureAttributes();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("#text");
        java.lang.String str9 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("h");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
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
        java.lang.String str18 = textNode2.attr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode2.wrap("#text");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("h");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("#text");
        java.lang.String str12 = node11.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node11.wrap("hi!");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        java.util.List<org.jsoup.nodes.Node> nodeList1 = textNode0.childNodesCopy();
        org.jsoup.nodes.Node node2 = textNode0.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = textNode0.text();
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node6.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = node6.wrap("hi!");
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("h");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node25 = textNode5.wrap("#text");
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        java.lang.String str5 = textNode2.text();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode7.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode7.wrap("hi!");
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        boolean boolean9 = textNode2.hasAttr("hi!");
        int int10 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("h");
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        java.lang.String str8 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("h");
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        textNode2.ensureAttributes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode8.wrap("i!");
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("h");
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("h");
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = textNode2.text();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("hi!");
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.lang.String str4 = textNode2.attr("");
        org.jsoup.nodes.Node node5 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("#text");
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("hi!");
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(0);
        java.lang.String str10 = textNode2.absUrl("h");
        java.lang.String str12 = textNode2.attr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("hi!");
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode7.wrap("h");
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        boolean boolean9 = textNode2.hasAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("i!");
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
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
        java.lang.String str16 = textNode10.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode10.wrap("i!");
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
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
        org.jsoup.nodes.TextNode textNode17 = textNode2.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode17.wrap("i!");
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        boolean boolean9 = textNode2.hasAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("hi!");
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.childNodeSize();
        java.lang.String str4 = textNode2.getWholeText();
        textNode2.ensureAttributes();
        boolean boolean7 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        int int9 = textNode2.childNodeSize();
        boolean boolean11 = textNode2.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("h");
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
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
        java.lang.String str16 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("hi!");
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.equals((java.lang.Object) false);
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        boolean boolean9 = textNode2.isBlank();
        java.lang.String str11 = textNode2.absUrl("#text");
        textNode2.ensureAttributes();
        java.lang.String str14 = textNode2.attr("hi!");
        org.jsoup.nodes.Node node17 = textNode2.attr("#text", "#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode2.wrap("#text");
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.nodeName();
        boolean boolean7 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node11 = textNode2.attr("#text", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = node11.wrap("h");
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node26 = textNode2.wrap("hi!");
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        int int6 = textNode5.childNodeSize();
        java.lang.String str7 = textNode5.baseUri();
        org.jsoup.nodes.TextNode textNode9 = textNode5.text("#text");
        org.jsoup.nodes.Node node10 = textNode9.parent();
        boolean boolean11 = textNode9.isBlank();
        org.jsoup.nodes.Node node12 = textNode9.clone();
        org.jsoup.nodes.Node node13 = textNode9.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode9.wrap("h");
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
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
        java.lang.String str16 = textNode5.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode5.wrap("#text");
    }
}

