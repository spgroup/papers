import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.elasticsearch.common.xcontent.XContentParser xContentParser0 = null;
        org.elasticsearch.search.internal.SearchContext searchContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport2 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(xContentParser0, searchContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.elasticsearch.index.query.QueryShardContext queryShardContext0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryShardContext0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        java.lang.Class<?> wildcardClass1 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryFound;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        java.lang.String str5 = nestedInnerQueryParseSupport0.path;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper3;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter5;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.filterParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport0.source = bytesReference6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = null;
        nestedInnerQueryParseSupport0.source = bytesReference3;
        nestedInnerQueryParseSupport0.path = "";
        java.lang.Class<?> wildcardClass7 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.path = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterParsed = true;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport0.source = bytesReference6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound;
        nestedInnerQueryParseSupport0.queryParsed = true;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport0.filterFound;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterParsed = true;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext6;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        nestedInnerQueryParseSupport0.filterFound = true;
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        java.lang.String str5 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = false;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = false;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        java.lang.Class<?> wildcardClass7 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper7;
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.path = "";
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean3 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper5;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference4);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterFound = false;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport0.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.queryFound = true;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext5;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport0.source;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference10);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerQuery = query10;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport0.source = bytesReference13;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext2 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext2;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        nestedInnerQueryParseSupport0.queryFound = false;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerQuery = query10;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        java.lang.Class<?> wildcardClass13 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport0.source = bytesReference6;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterFound = false;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerQuery = query10;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryParsed;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext7 = nestedInnerQueryParseSupport0.shardContext;
        java.lang.Class<?> wildcardClass8 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.queryFound = true;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.path = "";
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound;
        nestedInnerQueryParseSupport0.queryParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.queryFound = true;
        java.lang.Class<?> wildcardClass8 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport0.filterParsed;
        java.lang.Class<?> wildcardClass7 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.path = "";
        nestedInnerQueryParseSupport0.queryParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter10;
        org.elasticsearch.index.query.QueryShardContext queryShardContext12 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerQuery = query10;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport0.source = bytesReference13;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = false;
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = null;
        nestedInnerQueryParseSupport0.source = bytesReference7;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper5;
        java.lang.String str7 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        java.lang.Class<?> wildcardClass5 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        nestedInnerQueryParseSupport0.filterFound = true;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        nestedInnerQueryParseSupport0.queryParsed = false;
        nestedInnerQueryParseSupport0.filterFound = true;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        nestedInnerQueryParseSupport0.filterFound = true;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport0.source = bytesReference6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        boolean boolean13 = nestedInnerQueryParseSupport0.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = null;
        nestedInnerQueryParseSupport0.source = bytesReference3;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext7;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.path = "";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter9;
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport0.source = bytesReference11;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper8;
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext10;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        nestedInnerQueryParseSupport0.filterFound = true;
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.path = "";
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerQuery = query10;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport0.source = bytesReference13;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.path = "";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter9;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext11;
        boolean boolean13 = nestedInnerQueryParseSupport0.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport0.filterFound;
        nestedInnerQueryParseSupport0.path = "";
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.innerQuery;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query8);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter6;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        nestedInnerQueryParseSupport0.queryParsed = true;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = nestedInnerQueryParseSupport0.shardContext;
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.innerFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query6);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.path = "";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter9;
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport0.source = bytesReference11;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport0.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport0.source;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference6);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext7 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext7;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        nestedInnerQueryParseSupport0.filterFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter10;
        org.elasticsearch.index.query.QueryShardContext queryShardContext12 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper5;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport0.source;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport0.source = bytesReference6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        nestedInnerQueryParseSupport0.queryFound = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        java.lang.Class<?> wildcardClass7 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext8;
        boolean boolean10 = nestedInnerQueryParseSupport0.queryParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str3 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper7;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper9;
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound;
        java.lang.String str12 = nestedInnerQueryParseSupport0.getPath();
        boolean boolean13 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport0.innerQuery = query6;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        nestedInnerQueryParseSupport0.queryFound = true;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.queryFound = true;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.queryFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper9;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.path = "";
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        nestedInnerQueryParseSupport0.filterParsed = false;
        java.lang.Class<?> wildcardClass10 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerQuery = query10;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = queryShardContext5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound;
        nestedInnerQueryParseSupport0.path = "";
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.filterParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str5 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.parentFilter;
        java.lang.String str7 = nestedInnerQueryParseSupport0.path;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerQuery = query8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerQuery = query10;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper6;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport0.source;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.path = "";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter9;
        org.elasticsearch.index.query.QueryShardContext queryShardContext11 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext11;
        org.elasticsearch.index.query.QueryShardContext queryShardContext13 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext13;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound;
        nestedInnerQueryParseSupport0.queryParsed = true;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.path = "";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter9;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext11;
        boolean boolean13 = nestedInnerQueryParseSupport0.queryParsed;
        boolean boolean14 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport0.parseContext;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper13;
        boolean boolean15 = nestedInnerQueryParseSupport0.queryFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.innerQuery;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query8);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport0.source = bytesReference12;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound;
        nestedInnerQueryParseSupport0.path = "";
        java.lang.String str7 = nestedInnerQueryParseSupport0.path;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport0.source = bytesReference13;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext2 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext2;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = nestedInnerQueryParseSupport0.parentFilter;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter4);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.Query query3 = null;
        nestedInnerQueryParseSupport0.innerQuery = query3;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper6;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter10;
        org.elasticsearch.index.query.QueryShardContext queryShardContext12 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.queryFound = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext12);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport0.source;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = bytesReference9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        nestedInnerQueryParseSupport0.filterFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerQuery;
        nestedInnerQueryParseSupport0.queryFound = false;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter5;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.path = "";
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = nestedInnerQueryParseSupport0.shardContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str11 = nestedInnerQueryParseSupport0.path;
        java.lang.String str12 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport0.source = bytesReference13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerQuery = query5;
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport0.queryFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext7 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext7;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport0.source;
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.innerQuery;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query10);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        nestedInnerQueryParseSupport0.queryFound = true;
        boolean boolean12 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport0.innerFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query13);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = null;
        nestedInnerQueryParseSupport0.source = bytesReference10;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        java.lang.Class<?> wildcardClass8 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper7;
        nestedInnerQueryParseSupport0.queryParsed = false;
        nestedInnerQueryParseSupport0.filterFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        java.lang.Class<?> wildcardClass7 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str11 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.queryFound = true;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        boolean boolean10 = nestedInnerQueryParseSupport0.filterFound;
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound;
        boolean boolean12 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.query.QueryShardContext queryShardContext13 = nestedInnerQueryParseSupport0.shardContext;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext13);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport0.source;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter10;
        boolean boolean12 = nestedInnerQueryParseSupport0.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = true;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerQuery = query10;
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport0.getInnerQuery();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = objectMapper13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.apache.lucene.search.Query query13 = null;
        nestedInnerQueryParseSupport0.innerQuery = query13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        nestedInnerQueryParseSupport0.queryParsed = true;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = null;
        nestedInnerQueryParseSupport0.source = bytesReference3;
        nestedInnerQueryParseSupport0.path = "";
        boolean boolean7 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport0.parseContext;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport0.source;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterFound = true;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterParsed;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport0.parseContext;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext11);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport0.source = bytesReference11;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter10;
        org.elasticsearch.index.query.QueryShardContext queryShardContext12 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.Query query14 = null;
        nestedInnerQueryParseSupport0.innerQuery = query14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.path = "hi!";
        java.lang.String str10 = nestedInnerQueryParseSupport0.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper8;
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext10;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.queryFound = true;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport0.innerQuery = query9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.filterParsed = false;
        java.lang.Class<?> wildcardClass6 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = nestedInnerQueryParseSupport0.shardContext;
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport0.innerFilter = query11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = nestedInnerQueryParseSupport0.source;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean10 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext12 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext12;
        nestedInnerQueryParseSupport0.queryParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper5;
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext7;
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterFound = true;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        boolean boolean7 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        boolean boolean10 = nestedInnerQueryParseSupport0.filterFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        nestedInnerQueryParseSupport0.queryParsed = false;
        java.lang.String str12 = nestedInnerQueryParseSupport0.path;
        java.lang.String str13 = nestedInnerQueryParseSupport0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        nestedInnerQueryParseSupport0.path = "";
        nestedInnerQueryParseSupport0.path = "";
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext10;
        boolean boolean12 = nestedInnerQueryParseSupport0.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.path = "hi!";
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport0.source = bytesReference9;
        org.elasticsearch.index.query.QueryShardContext queryShardContext11 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        nestedInnerQueryParseSupport0.queryFound = false;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = objectMapper8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        nestedInnerQueryParseSupport0.queryFound = false;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport0.source = bytesReference6;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport0.source = bytesReference8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound;
        nestedInnerQueryParseSupport0.path = "";
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport0.parseContext;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext13 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext10);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext8;
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = false;
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.path = "";
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = null;
        nestedInnerQueryParseSupport0.source = bytesReference3;
        nestedInnerQueryParseSupport0.path = "";
        boolean boolean7 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport0.parseContext;
        nestedInnerQueryParseSupport0.filterParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext8);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = nestedInnerQueryParseSupport0.source;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean10 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext12 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext12;
        org.elasticsearch.index.query.QueryShardContext queryShardContext14 = nestedInnerQueryParseSupport0.shardContext;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext14);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        nestedInnerQueryParseSupport0.path = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str11 = nestedInnerQueryParseSupport0.path;
        java.lang.String str12 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.query.QueryShardContext queryShardContext14 = nestedInnerQueryParseSupport0.shardContext;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext14);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.Query query3 = null;
        nestedInnerQueryParseSupport0.innerQuery = query3;
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = nestedInnerQueryParseSupport0.parseContext;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext5);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport0.source = bytesReference6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper11;
        org.apache.lucene.search.Query query13 = null;
        nestedInnerQueryParseSupport0.innerQuery = query13;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter15;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerQuery = query10;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = nestedInnerQueryParseSupport0.source;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference13);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport0.parseContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        nestedInnerQueryParseSupport0.filterFound = true;
        java.lang.Class<?> wildcardClass7 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterFound = false;
        java.lang.String str7 = nestedInnerQueryParseSupport0.path;
        java.lang.String str8 = nestedInnerQueryParseSupport0.path;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        nestedInnerQueryParseSupport0.path = "";
        nestedInnerQueryParseSupport0.path = "";
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport0.parseContext;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport0.innerFilter;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean16 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean3 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper5;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference4);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean12 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        java.lang.String str5 = nestedInnerQueryParseSupport0.path;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter7;
        nestedInnerQueryParseSupport0.path = "";
        nestedInnerQueryParseSupport0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = false;
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.path = "";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.path = "";
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean11 = nestedInnerQueryParseSupport0.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        nestedInnerQueryParseSupport0.filterFound = true;
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.path = "";
        boolean boolean11 = nestedInnerQueryParseSupport0.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean3 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        nestedInnerQueryParseSupport0.queryParsed = false;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport0.parseContext;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport0.source;
        java.lang.String str11 = nestedInnerQueryParseSupport0.path;
        boolean boolean12 = nestedInnerQueryParseSupport0.filterFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = false;
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.path = "";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext13 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext13;
        org.elasticsearch.index.query.QueryShardContext queryShardContext15 = nestedInnerQueryParseSupport0.shardContext;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext15);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext7 = nestedInnerQueryParseSupport0.shardContext;
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport0.parseContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.innerFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query9);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter6;
        nestedInnerQueryParseSupport0.filterFound = false;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = null;
        nestedInnerQueryParseSupport0.source = bytesReference3;
        nestedInnerQueryParseSupport0.filterFound = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerQuery = query10;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport0.source = bytesReference13;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerQuery = query8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper10;
        java.lang.String str12 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.queryParsed = false;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport0.parseContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext2);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.path = "hi!";
        nestedInnerQueryParseSupport0.filterFound = true;
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport0.innerFilter = query12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper5;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper9;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = nestedInnerQueryParseSupport0.source;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference12);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport0.source = bytesReference13;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = nestedInnerQueryParseSupport0.shardContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = nestedInnerQueryParseSupport0.shardContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext8);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryParsed;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = true;
        java.lang.String str4 = nestedInnerQueryParseSupport0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        nestedInnerQueryParseSupport0.path = "";
        java.lang.String str12 = nestedInnerQueryParseSupport0.getPath();
        boolean boolean13 = nestedInnerQueryParseSupport0.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryParsed;
        java.lang.Class<?> wildcardClass8 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport0.parseContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext11);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound;
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterFound = true;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport0.source;
        boolean boolean10 = nestedInnerQueryParseSupport0.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        nestedInnerQueryParseSupport0.path = "hi!";
        boolean boolean10 = nestedInnerQueryParseSupport0.queryFound;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerQuery = query10;
        boolean boolean12 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper9;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = objectMapper5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport0.source = bytesReference6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper11;
        org.apache.lucene.search.Query query13 = null;
        nestedInnerQueryParseSupport0.innerQuery = query13;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter15;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport0.childFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport0.source = bytesReference12;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport0.childFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport0.source = bytesReference6;
        java.lang.Class<?> wildcardClass8 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext7 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext7;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean3 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerQuery;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport0.parseContext;
        java.lang.String str8 = nestedInnerQueryParseSupport0.path;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper3;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport0.parseContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext6);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        java.lang.String str5 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport0.parseContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = nestedInnerQueryParseSupport0.shardContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport0.source = bytesReference6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext9;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport0.innerFilter = query6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport0.source;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = objectMapper4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerQuery = query10;
        nestedInnerQueryParseSupport0.path = "";
        boolean boolean14 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        nestedInnerQueryParseSupport0.queryParsed = true;
        boolean boolean12 = nestedInnerQueryParseSupport0.queryFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerQuery = query8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper10;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = nestedInnerQueryParseSupport0.source;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference12);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter7;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter10;
        org.elasticsearch.index.query.QueryShardContext queryShardContext12 = nestedInnerQueryParseSupport0.shardContext;
        java.lang.String str13 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper14;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        nestedInnerQueryParseSupport0.path = "";
        java.lang.String str12 = nestedInnerQueryParseSupport0.getPath();
        boolean boolean13 = nestedInnerQueryParseSupport0.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.innerQuery;
        nestedInnerQueryParseSupport0.queryFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query6);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.Class<?> wildcardClass5 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper5;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper7;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        boolean boolean10 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport0.childFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterParsed = true;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        java.lang.String str8 = nestedInnerQueryParseSupport0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport0.source;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound();
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        java.lang.String str8 = nestedInnerQueryParseSupport0.path;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterParsed;
        nestedInnerQueryParseSupport0.queryFound = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        nestedInnerQueryParseSupport0.filterFound = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper7;
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean11 = nestedInnerQueryParseSupport0.filterFound;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.query.QueryParseContext queryParseContext3 = nestedInnerQueryParseSupport0.parseContext;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        java.lang.Class<?> wildcardClass8 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter7;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper7;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str7 = nestedInnerQueryParseSupport0.path;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext9 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.query.QueryParseContext queryParseContext3 = nestedInnerQueryParseSupport0.parseContext;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = nestedInnerQueryParseSupport0.shardContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter11;
        nestedInnerQueryParseSupport0.path = "";
        java.lang.Class<?> wildcardClass15 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.Class<?> wildcardClass4 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper9;
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.innerQuery;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport0.innerQuery = query9;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = nestedInnerQueryParseSupport0.shardContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter11;
        nestedInnerQueryParseSupport0.path = "";
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext2 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext2;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter8;
        boolean boolean10 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter9;
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.queryFound = true;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext7 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext7;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport0.source = bytesReference8;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper9;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter9;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext11;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        nestedInnerQueryParseSupport0.path = "hi!";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.innerFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport0.parseContext;
        boolean boolean11 = nestedInnerQueryParseSupport0.filterFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper5;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.path = "";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper9;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterFound = true;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterParsed;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport0.parseContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext11);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound();
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport0.source = bytesReference9;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        java.lang.String str5 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport0.parseContext;
        nestedInnerQueryParseSupport0.queryFound = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext11);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.Class<?> wildcardClass3 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport0.queryParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerQuery = query8;
        boolean boolean10 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport0.source = bytesReference6;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport0.source = bytesReference8;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterFound = true;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterParsed;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport0.parseContext;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext11);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport0.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext7 = nestedInnerQueryParseSupport0.shardContext;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext7);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper6;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext8;
        nestedInnerQueryParseSupport0.queryParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerFilter = query7;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport0.parseContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter8;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext7);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper9;
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound;
        boolean boolean12 = nestedInnerQueryParseSupport0.filterParsed;
        boolean boolean13 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper6;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport0.source;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.queryParsed = false;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = false;
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.path = "";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext13 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext13;
        org.elasticsearch.index.query.QueryParseContext queryParseContext15 = nestedInnerQueryParseSupport0.parseContext;
        nestedInnerQueryParseSupport0.filterParsed = true;
        nestedInnerQueryParseSupport0.filterFound = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext15);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper7;
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        nestedInnerQueryParseSupport0.queryFound = true;
        nestedInnerQueryParseSupport0.filterParsed = false;
        boolean boolean13 = nestedInnerQueryParseSupport0.queryFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport0.source = bytesReference6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        boolean boolean10 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport0.parseContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport0.source;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter10;
        boolean boolean12 = nestedInnerQueryParseSupport0.queryParsed;
        boolean boolean13 = nestedInnerQueryParseSupport0.queryFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerQuery = query10;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper14;
        boolean boolean16 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        nestedInnerQueryParseSupport0.path = "hi!";
        nestedInnerQueryParseSupport0.queryParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter10;
        org.elasticsearch.index.query.QueryShardContext queryShardContext12 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext12);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport0.innerQuery;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query5);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter9;
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        nestedInnerQueryParseSupport0.path = "";
        nestedInnerQueryParseSupport0.path = "";
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext10;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter12;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = nestedInnerQueryParseSupport0.shardContext;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper3;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = null;
        nestedInnerQueryParseSupport0.source = bytesReference10;
        nestedInnerQueryParseSupport0.path = "hi!";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = null;
        nestedInnerQueryParseSupport0.source = bytesReference10;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        nestedInnerQueryParseSupport0.filterParsed = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport0.parseContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext10);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        nestedInnerQueryParseSupport0.path = "";
        nestedInnerQueryParseSupport0.path = "";
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext10;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter12;
        org.elasticsearch.index.query.QueryParseContext queryParseContext14 = nestedInnerQueryParseSupport0.parseContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext14);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = nestedInnerQueryParseSupport0.shardContext;
        boolean boolean11 = nestedInnerQueryParseSupport0.filterFound;
        boolean boolean12 = nestedInnerQueryParseSupport0.filterFound;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = false;
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.path = "";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext13 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext13;
        org.elasticsearch.index.query.QueryShardContext queryShardContext15 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext15);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryParsed;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter5;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport0.innerQuery = query6;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport0.source = bytesReference2;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterFound = false;
        java.lang.String str7 = nestedInnerQueryParseSupport0.path;
        java.lang.String str8 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = false;
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        boolean boolean10 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean3 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper4;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterParsed = true;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryFound;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.innerQuery;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query6);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        nestedInnerQueryParseSupport0.queryFound = false;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter9;
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport0.source = bytesReference11;
        boolean boolean13 = nestedInnerQueryParseSupport0.filterFound;
        nestedInnerQueryParseSupport0.filterParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = nestedInnerQueryParseSupport0.shardContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter11;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        boolean boolean7 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.innerQuery;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query10);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport0.parseContext;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext13 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext10);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = null;
        nestedInnerQueryParseSupport0.source = bytesReference7;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext9;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query8);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper9;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        nestedInnerQueryParseSupport0.filterFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        nestedInnerQueryParseSupport0.filterFound = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.filterParsed = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = nestedInnerQueryParseSupport0.source;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean10 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.queryParsed = true;
        boolean boolean13 = nestedInnerQueryParseSupport0.filterFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        nestedInnerQueryParseSupport0.path = "";
        nestedInnerQueryParseSupport0.path = "";
        java.lang.Class<?> wildcardClass10 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        nestedInnerQueryParseSupport0.queryParsed = false;
        java.lang.String str12 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport0.source = bytesReference13;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter15;
        org.apache.lucene.search.Query query17 = null;
        nestedInnerQueryParseSupport0.innerFilter = query17;
        boolean boolean19 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = nestedInnerQueryParseSupport0.shardContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        nestedInnerQueryParseSupport0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport0.parseContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter11;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext10);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter10;
        java.lang.String str12 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter15);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext2 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext2;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.Class<?> wildcardClass5 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        nestedInnerQueryParseSupport0.path = "";
        nestedInnerQueryParseSupport0.path = "";
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext10;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter12;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper5;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = false;
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.path = "";
        org.elasticsearch.index.query.QueryShardContext queryShardContext12 = nestedInnerQueryParseSupport0.shardContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext12);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport0.source;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter10;
        boolean boolean12 = nestedInnerQueryParseSupport0.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.query.QueryShardContext queryShardContext9 = nestedInnerQueryParseSupport0.shardContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext9);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.path = "hi!";
        java.lang.Class<?> wildcardClass10 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport0.queryFound;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper3;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = null;
        nestedInnerQueryParseSupport0.source = bytesReference7;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport0.parentFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper6;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport0.source = bytesReference8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport0.parseContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext10);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport0.source = bytesReference6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean11 = nestedInnerQueryParseSupport0.filterParsed;
        java.lang.String str12 = nestedInnerQueryParseSupport0.path;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerFilter = query7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport0.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper7;
        nestedInnerQueryParseSupport0.queryFound = true;
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport0.filterParsed;
        nestedInnerQueryParseSupport0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerQuery = query8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper10;
        java.lang.String str12 = nestedInnerQueryParseSupport0.getPath();
        boolean boolean13 = nestedInnerQueryParseSupport0.queryFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        nestedInnerQueryParseSupport0.path = "";
        java.lang.String str12 = nestedInnerQueryParseSupport0.getPath();
        boolean boolean13 = nestedInnerQueryParseSupport0.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean16 = nestedInnerQueryParseSupport0.filterFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper7;
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        java.lang.String str5 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport0.innerQuery = query12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport0.parseContext;
        java.lang.String str8 = nestedInnerQueryParseSupport0.path;
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport0.innerQuery = query9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterParsed;
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport0.parseContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryFound = false;
        java.lang.String str15 = nestedInnerQueryParseSupport0.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean3 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport0.parseContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext8);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport0.source = bytesReference6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper5;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter7;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = nestedInnerQueryParseSupport0.source;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter12;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference11);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter10;
        boolean boolean12 = nestedInnerQueryParseSupport0.queryParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.innerFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query6);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        nestedInnerQueryParseSupport0.queryFound = true;
        java.lang.String str11 = nestedInnerQueryParseSupport0.path;
        java.lang.Class<?> wildcardClass12 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        java.lang.Class<?> wildcardClass8 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport0.source;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.queryParsed = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = nestedInnerQueryParseSupport0.parseContext;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext5);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerQuery = query8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.innerQuery;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper6;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport0.parseContext;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound;
        nestedInnerQueryParseSupport0.queryFound = false;
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerQuery = query5;
        org.elasticsearch.index.query.QueryShardContext queryShardContext7 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext7);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterParsed;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerFilter = query10;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport0.innerQuery = query6;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport0.source = bytesReference9;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext11;
        java.lang.String str13 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        boolean boolean10 = nestedInnerQueryParseSupport0.filterFound;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.elasticsearch.index.query.QueryShardContext queryShardContext13 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterParsed = true;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean10 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerQuery = query8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper10;
        java.lang.String str12 = nestedInnerQueryParseSupport0.getPath();
        boolean boolean13 = nestedInnerQueryParseSupport0.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper5;
        nestedInnerQueryParseSupport0.filterFound = true;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper7;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport0.parseContext;
        boolean boolean11 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.index.query.QueryShardContext queryShardContext12 = nestedInnerQueryParseSupport0.shardContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext12);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterFound = false;
        java.lang.String str7 = nestedInnerQueryParseSupport0.path;
        java.lang.String str8 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.innerFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport0.innerQuery = query9;
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str12 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        nestedInnerQueryParseSupport0.path = "";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport0.parseContext;
        nestedInnerQueryParseSupport0.queryFound = false;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext10);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport0.source = bytesReference13;
        nestedInnerQueryParseSupport0.filterFound = true;
        boolean boolean17 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext18 = nestedInnerQueryParseSupport0.shardContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext18);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryParsed;
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport0.innerFilter = query9;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = null;
        nestedInnerQueryParseSupport0.source = bytesReference7;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter9;
        boolean boolean11 = nestedInnerQueryParseSupport0.filterFound;
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport0.innerQuery;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query12);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerQuery = query8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper10;
        java.lang.String str12 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean15 = nestedInnerQueryParseSupport0.filterParsed;
        java.lang.String str16 = nestedInnerQueryParseSupport0.path;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryParsed;
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport0.innerFilter = query9;
        nestedInnerQueryParseSupport0.filterFound = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport0.parseContext;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext11);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerQuery = query8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean11 = nestedInnerQueryParseSupport0.filterFound();
        java.lang.String str12 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.filterFound = false;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper5;
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        nestedInnerQueryParseSupport0.queryParsed = true;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query12);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport0.queryFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterParsed;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterFound = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.query.QueryShardContext queryShardContext9 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper6;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        nestedInnerQueryParseSupport0.filterParsed = false;
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport0.innerFilter = query12;
        org.elasticsearch.index.query.QueryParseContext queryParseContext14 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext14;
        boolean boolean16 = nestedInnerQueryParseSupport0.queryFound;
        nestedInnerQueryParseSupport0.queryParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryParsed;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = nestedInnerQueryParseSupport0.source;
        java.lang.String str9 = nestedInnerQueryParseSupport0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        boolean boolean7 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        boolean boolean10 = nestedInnerQueryParseSupport0.queryParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext8;
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport0.parseContext;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext10);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.query.QueryParseContext queryParseContext3 = nestedInnerQueryParseSupport0.parseContext;
        java.lang.String str4 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport0.parseContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = null;
        nestedInnerQueryParseSupport0.source = bytesReference10;
        boolean boolean12 = nestedInnerQueryParseSupport0.queryFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter9;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext12;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.query.QueryParseContext queryParseContext3 = nestedInnerQueryParseSupport0.parseContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport0.source = bytesReference6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext3);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext13 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter12);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterFound = true;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterParsed;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport0.parseContext;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext11);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper7;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport0.source = bytesReference9;
        nestedInnerQueryParseSupport0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        nestedInnerQueryParseSupport0.filterFound = true;
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.path = "";
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport0.innerQuery = query11;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport0.innerQuery;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query15);
    }
}

