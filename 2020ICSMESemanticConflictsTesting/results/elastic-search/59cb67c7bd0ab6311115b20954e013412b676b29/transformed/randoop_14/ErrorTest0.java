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
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.lucene.search.Query query1 = nestedInnerQueryParseSupport0.getInnerQuery();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nestedInnerQueryParseSupport0.filter();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nestedInnerQueryParseSupport0.setPathLevel();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nestedInnerQueryParseSupport0.setPathLevel();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nestedInnerQueryParseSupport0.setPathLevel();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.lucene.search.Query query1 = nestedInnerQueryParseSupport0.getInnerFilter();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nestedInnerQueryParseSupport0.query();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.filterFound = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nestedInnerQueryParseSupport0.setPath("hi!");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nestedInnerQueryParseSupport0.resetPathLevel();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterParsed = true;
        nestedInnerQueryParseSupport0.queryFound = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nestedInnerQueryParseSupport0.resetPathLevel();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport0.getInnerQuery();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.parentFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nestedInnerQueryParseSupport0.resetPathLevel();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterParsed = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport0.getInnerQuery();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.filterParsed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nestedInnerQueryParseSupport0.setPath("hi!");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.getInnerQuery();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = nestedInnerQueryParseSupport0.source;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nestedInnerQueryParseSupport0.resetPathLevel();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport0.getInnerFilter();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nestedInnerQueryParseSupport0.query();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        nestedInnerQueryParseSupport0.filterParsed = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nestedInnerQueryParseSupport0.setPath("hi!");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str3 = nestedInnerQueryParseSupport0.getPath();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport0.getInnerQuery();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterFound();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nestedInnerQueryParseSupport0.setPath("");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nestedInnerQueryParseSupport0.filter();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nestedInnerQueryParseSupport0.setPath("hi!");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterParsed = true;
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nestedInnerQueryParseSupport0.setPathLevel();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterParsed = true;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryFound;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.innerQuery;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nestedInnerQueryParseSupport0.resetPathLevel();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean3 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = nestedInnerQueryParseSupport0.shardContext;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nestedInnerQueryParseSupport0.resetPathLevel();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport0.getInnerFilter();
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport0.innerQuery;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.getInnerQuery();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper2 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.getInnerFilter();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = nestedInnerQueryParseSupport0.source;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nestedInnerQueryParseSupport0.setPathLevel();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryParsed;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nestedInnerQueryParseSupport0.setPath("hi!");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport0.getInnerFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nestedInnerQueryParseSupport0.setPathLevel();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterParsed = true;
        nestedInnerQueryParseSupport0.queryFound = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nestedInnerQueryParseSupport0.setPathLevel();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = nestedInnerQueryParseSupport0.source;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = nestedInnerQueryParseSupport0.parseContext;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.getInnerQuery();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport0.getInnerFilter();
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport0.getInnerFilter();
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.innerFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nestedInnerQueryParseSupport0.resetPathLevel();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterParsed = true;
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nestedInnerQueryParseSupport0.resetPathLevel();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nestedInnerQueryParseSupport0.resetPathLevel();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = true;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryParsed;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nestedInnerQueryParseSupport0.setPathLevel();
    }
}

