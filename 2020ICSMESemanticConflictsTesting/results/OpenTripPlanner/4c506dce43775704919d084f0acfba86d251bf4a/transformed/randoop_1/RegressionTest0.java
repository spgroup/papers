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
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = (-1.0f);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        double double0 = org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + (-1.0d) + "'", double0 == (-1.0d));
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        int int0 = org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_DIFF_MARGIN;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 30 + "'", int0 == 30);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.opentripplanner.routing.spt.MultiShortestPathTree.serialVersionUID = (-1);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.opentripplanner.routing.spt.MultiShortestPathTree.serialVersionUID = (short) 10;
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        double double0 = org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.02d + "'", double0 == 0.02d);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON = 0.0d;
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.opentripplanner.routing.core.State state0 = null;
        org.opentripplanner.routing.core.State state1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state0, state1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = multiShortestPathTree1.add(state3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON = 10.0f;
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        long long0 = org.opentripplanner.routing.spt.MultiShortestPathTree.serialVersionUID;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 10L + "'", long0 == 10L);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON = (-1);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = multiShortestPathTree1.add(state4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        double double0 = org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.05d + "'", double0 == 0.05d);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = multiShortestPathTree1.visit(state4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_DIFF_MARGIN = '#';
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = 100.0d;
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = multiShortestPathTree1.add(state5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON = 100.0d;
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        int int0 = org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_DIFF_MARGIN;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 30 + "'", int0 == 30);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        java.lang.Class<?> wildcardClass4 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_DIFF_MARGIN = (short) -1;
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        org.opentripplanner.routing.core.State state7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = multiShortestPathTree1.add(state7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON = (-1L);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = multiShortestPathTree1.visit(state3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_DIFF_MARGIN = '4';
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.core.State state7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = multiShortestPathTree1.visit(state7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = 0.05d;
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.add(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath7);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = 30;
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        java.lang.Class<?> wildcardClass7 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        org.opentripplanner.routing.core.State state7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = multiShortestPathTree1.visit(state7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON = (-1.0f);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree1.getStates(vertex8);
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.add(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList9);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_DIFF_MARGIN = ' ';
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON = 100L;
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_DIFF_MARGIN = 1;
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        java.lang.Class<?> wildcardClass5 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON = (short) -1;
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON = (short) 1;
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_DIFF_MARGIN = 'a';
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON = 0L;
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.add(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        java.lang.Class<?> wildcardClass10 = graphPathList9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = 0.0d;
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON = (short) -1;
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = 100.0f;
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = multiShortestPathTree1.visit(state3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON = 100.0f;
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_DIFF_MARGIN = (byte) 10;
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        java.lang.Class<?> wildcardClass6 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON = (short) 10;
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet9);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = multiShortestPathTree1.add(state4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = multiShortestPathTree1.visit(state5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = '4';
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_DIFF_MARGIN = (byte) 100;
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_DIFF_MARGIN = (short) 10;
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.lang.Class<?> wildcardClass6 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = (short) 10;
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.core.State state8 = multiShortestPathTree1.getState(vertex7);
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.visit(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = multiShortestPathTree1.add(state2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON = 10;
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.visit(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest11);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.visit(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON = 10.0f;
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_DIFF_MARGIN = '4';
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.opentripplanner.routing.spt.MultiShortestPathTree.serialVersionUID = (byte) -1;
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.opentripplanner.routing.spt.MultiShortestPathTree.serialVersionUID = 30;
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList10 = multiShortestPathTree1.getStates(vertex9);
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.add(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList10);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.add(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_DIFF_MARGIN = (byte) 0;
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON = 0L;
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = multiShortestPathTree1.add(state5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON = 10L;
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        java.lang.Class<?> wildcardClass9 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON = ' ';
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON = 0.0d;
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_DIFF_MARGIN = (-1);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_DIFF_MARGIN = (short) 0;
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = stateList11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_DIFF_MARGIN = 30;
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON = 1;
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.opentripplanner.routing.spt.MultiShortestPathTree.serialVersionUID = ' ';
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON = 1.0f;
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = (short) 0;
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        int int10 = multiShortestPathTree1.getVertexCount();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        int int10 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.visit(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = 1.0f;
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.visit(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest7);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.visit(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest9);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = null;
        multiShortestPathTree1.stateSets = vertexMap6;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.opentripplanner.routing.spt.MultiShortestPathTree.serialVersionUID = 0L;
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON = (short) 0;
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.opentripplanner.routing.spt.MultiShortestPathTree.serialVersionUID = 1L;
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.graph.Vertex vertex1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList3 = multiShortestPathTree0.getPaths(vertex1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        java.lang.String str8 = multiShortestPathTree1.toString();
        java.lang.Class<?> wildcardClass9 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = (short) -1;
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON = (byte) 100;
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree6 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest5);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree6.stateSets;
        java.lang.String str8 = multiShortestPathTree6.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree6.getPath(vertex9, false);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree6.getPaths(vertex12, false);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree6.getPath(vertex15, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree6.stateSets;
        multiShortestPathTree1.stateSets = vertexMap18;
        org.opentripplanner.routing.core.State state20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = multiShortestPathTree1.add(state20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap18);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        java.lang.Class<?> wildcardClass9 = stateCollection8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, true);
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.visit(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList8);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.core.State state8 = multiShortestPathTree1.getState(vertex7);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, false);
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.visit(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath11);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON = '#';
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.opentripplanner.routing.spt.MultiShortestPathTree.serialVersionUID = (short) 100;
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        java.lang.Class<?> wildcardClass12 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        int int6 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest7);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree8.stateSets;
        int int10 = multiShortestPathTree8.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree8.getPaths(vertex11, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree8.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree8.stateSets;
        multiShortestPathTree1.stateSets = vertexMap15;
        java.lang.Class<?> wildcardClass17 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.opentripplanner.routing.spt.MultiShortestPathTree.serialVersionUID = '4';
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        int int7 = multiShortestPathTree5.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap8;
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        java.lang.String str12 = multiShortestPathTree1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList10);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON = 0.0f;
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON = 100;
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        int int7 = multiShortestPathTree5.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap8;
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = graphPath12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath12);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap13 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList15);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.add(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.opentripplanner.routing.spt.MultiShortestPathTree.serialVersionUID = (short) 1;
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        int int6 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath9 = multiShortestPathTree1.getPath(vertex7, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath9);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest7);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList10 = multiShortestPathTree8.getStates(vertex9);
        java.lang.String str11 = multiShortestPathTree8.toString();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree8.getPath(vertex12, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree8.stateSets;
        multiShortestPathTree1.stateSets = vertexMap15;
        java.lang.Class<?> wildcardClass17 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.add(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest10);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_DIFF_MARGIN = 10;
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.visit(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getVertexCount();
        java.lang.Class<?> wildcardClass3 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON = 'a';
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.visit(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest9);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        int int6 = multiShortestPathTree1.getVertexCount();
        java.lang.String str7 = multiShortestPathTree1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = 10.0d;
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.visit(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest9);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_DIFF_MARGIN = 30;
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON = ' ';
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList7 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest6);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_DIFF_MARGIN = ' ';
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_DIFF_MARGIN = 0;
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.add(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection9);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList6 = multiShortestPathTree1.getStates(vertex5);
        java.lang.String str7 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.visit(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_DIFF_MARGIN = 100;
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = (byte) 100;
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree1.getStates(vertex8);
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.visit(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList9);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = (short) 1;
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.opentripplanner.routing.spt.MultiShortestPathTree.serialVersionUID = (byte) 10;
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.getOptions();
        java.lang.String str14 = multiShortestPathTree1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        java.lang.String str7 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.add(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.opentripplanner.routing.spt.MultiShortestPathTree.serialVersionUID = 10;
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = stateList11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = 0.02d;
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.opentripplanner.routing.spt.MultiShortestPathTree.serialVersionUID = (byte) 0;
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass9 = vertexSet8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.lang.Class<?> wildcardClass5 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.core.State state6 = multiShortestPathTree1.getState(vertex5);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest7);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_DIFF_MARGIN = (byte) -1;
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_DIFF_MARGIN = 'a';
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.opentripplanner.routing.spt.MultiShortestPathTree.serialVersionUID = (byte) 1;
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_DIFF_MARGIN = '#';
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_DIFF_MARGIN = 0;
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON = 0.0f;
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON = 30;
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree1.postVisit(state12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.opentripplanner.routing.spt.MultiShortestPathTree.serialVersionUID = 'a';
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_DIFF_MARGIN = (-1);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_DIFF_MARGIN = 100;
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree12 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree12.getStates(vertex13);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree12.stateSets;
        multiShortestPathTree10.stateSets = vertexMap15;
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree10.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet18 = multiShortestPathTree10.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList20 = multiShortestPathTree10.getStates(vertex19);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet21 = multiShortestPathTree10.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree23 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest22);
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList25 = multiShortestPathTree23.getStates(vertex24);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap26 = multiShortestPathTree23.stateSets;
        multiShortestPathTree10.stateSets = vertexMap26;
        multiShortestPathTree1.stateSets = vertexMap26;
        org.opentripplanner.routing.core.State state29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = multiShortestPathTree1.visit(state29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap26);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_DIFF_MARGIN = (byte) 100;
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList6 = multiShortestPathTree1.getStates(vertex5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.add(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList8);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.core.State state8 = multiShortestPathTree1.getState(vertex7);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap12 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.add(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap12);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        int int7 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.visit(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        int int7 = multiShortestPathTree5.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap8;
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet13);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = (-1);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON = 1.0d;
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON = '4';
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.add(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = multiShortestPathTree1.visit(state5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        int int6 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        java.lang.Class<?> wildcardClass9 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        int int10 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, true);
        org.opentripplanner.routing.core.State state14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = multiShortestPathTree1.add(state14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath13);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = 100L;
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON = (byte) 1;
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList6 = multiShortestPathTree1.getStates(vertex5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        java.lang.String str9 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.visit(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest10);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        java.lang.String str16 = multiShortestPathTree1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree1.stateSets;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap10);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList12);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON = 100L;
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_DIFF_MARGIN = (short) 0;
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList6 = multiShortestPathTree1.getStates(vertex5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        java.lang.String str9 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.visit(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        int int10 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree1.getAllStates();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection13);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath9 = multiShortestPathTree1.getPath(vertex7, false);
        java.lang.Class<?> wildcardClass10 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = null;
        multiShortestPathTree1.stateSets = vertexMap6;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList15);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON = (byte) 0;
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        java.lang.String str9 = multiShortestPathTree1.toString();
        java.lang.Class<?> wildcardClass10 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_DIFF_MARGIN = (byte) -1;
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap11 = multiShortestPathTree10.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree10.getPath(vertex12, false);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree10.getPath(vertex15, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree10.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree20 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest19);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = multiShortestPathTree20.stateSets;
        java.lang.String str22 = multiShortestPathTree20.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree24 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest23);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap25 = multiShortestPathTree24.stateSets;
        multiShortestPathTree20.stateSets = vertexMap25;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap27 = multiShortestPathTree20.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap28 = multiShortestPathTree20.stateSets;
        multiShortestPathTree10.stateSets = vertexMap28;
        multiShortestPathTree1.stateSets = vertexMap28;
        java.lang.Class<?> wildcardClass31 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "MultiSPT(0 vertices)" + "'", str22.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        int int13 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = multiShortestPathTree1.add(state14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON = (-1.0d);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath9 = multiShortestPathTree1.getPath(vertex7, false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath9);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, true);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        java.lang.Class<?> wildcardClass14 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON = 1;
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON = 1.0d;
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.core.State state6 = multiShortestPathTree1.getState(vertex5);
        org.opentripplanner.routing.core.State state7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = multiShortestPathTree1.add(state7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree6 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest5);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree6.stateSets;
        java.lang.String str8 = multiShortestPathTree6.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree6.getPath(vertex9, false);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree6.getPaths(vertex12, false);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree6.getPath(vertex15, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree6.stateSets;
        multiShortestPathTree1.stateSets = vertexMap18;
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList22 = multiShortestPathTree1.getPaths(vertex20, true);
        java.lang.Class<?> wildcardClass23 = graphPathList22.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.visit(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection7);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_DIFF_MARGIN = (short) 1;
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.opentripplanner.routing.spt.MultiShortestPathTree.serialVersionUID = (-1L);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.opentripplanner.routing.spt.MultiShortestPathTree.serialVersionUID = 10L;
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath9 = multiShortestPathTree1.getPath(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.visit(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap11 = multiShortestPathTree10.stateSets;
        int int12 = multiShortestPathTree10.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree10.getPaths(vertex13, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList19 = multiShortestPathTree17.getStates(vertex18);
        java.lang.String str20 = multiShortestPathTree17.toString();
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath23 = multiShortestPathTree17.getPath(vertex21, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap24 = multiShortestPathTree17.stateSets;
        multiShortestPathTree10.stateSets = vertexMap24;
        multiShortestPathTree1.stateSets = vertexMap24;
        java.lang.Class<?> wildcardClass27 = vertexMap24.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "MultiSPT(0 vertices)" + "'", str20.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.visit(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.visit(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList8);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.visit(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath12);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, false);
        org.opentripplanner.routing.core.State state14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = multiShortestPathTree1.visit(state14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath13);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = 0;
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        java.lang.Class<?> wildcardClass4 = vertexMap3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        java.lang.Class<?> wildcardClass5 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.visit(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        int int10 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree1.getStates(vertex13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = stateList14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList14);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest13);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = multiShortestPathTree1.visit(state7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON = (byte) 100;
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest7);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree8.stateSets;
        multiShortestPathTree1.stateSets = vertexMap9;
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree1.postVisit(state12);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, false);
        org.opentripplanner.routing.core.State state17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = multiShortestPathTree1.add(state17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath16);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest13);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = routingRequest7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest7);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = 10L;
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON = 100.0d;
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = (byte) 0;
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree10.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree10.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap13 = multiShortestPathTree10.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.core.State state15 = multiShortestPathTree10.getState(vertex14);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree10.getPaths(vertex16, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap19 = multiShortestPathTree10.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap20 = multiShortestPathTree10.stateSets;
        multiShortestPathTree1.stateSets = vertexMap20;
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = multiShortestPathTree1.visit(state23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest22);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = (-1L);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass5 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        java.lang.Class<?> wildcardClass13 = stateCollection12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.add(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet11);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath18 = multiShortestPathTree1.getPath(vertex16, false);
        org.opentripplanner.routing.core.State state19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = multiShortestPathTree1.visit(state19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath18);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        int int13 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest15);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, false);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, true);
        org.opentripplanner.routing.core.State state14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = multiShortestPathTree1.visit(state14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList13);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet12);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree9.stateSets;
        java.lang.String str11 = multiShortestPathTree9.toString();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree9.getPath(vertex12, false);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree9.getPaths(vertex15, false);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath20 = multiShortestPathTree9.getPath(vertex18, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = multiShortestPathTree9.stateSets;
        multiShortestPathTree1.stateSets = vertexMap21;
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList25 = multiShortestPathTree1.getPaths(vertex23, true);
        java.lang.Class<?> wildcardClass26 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap1 = multiShortestPathTree0.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree0.getPaths(vertex2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(vertexMap1);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = '#';
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        int int10 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet13);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        int int13 = multiShortestPathTree1.getVertexCount();
        java.lang.String str14 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree1.postVisit(state12);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath16);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.core.State state6 = multiShortestPathTree1.getState(vertex5);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest7);
        java.lang.String str9 = multiShortestPathTree8.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree8.stateSets;
        multiShortestPathTree1.stateSets = vertexMap10;
        java.lang.Class<?> wildcardClass12 = vertexMap10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON = 0.02d;
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.opentripplanner.routing.spt.MultiShortestPathTree.serialVersionUID = 100;
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, false);
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.add(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList12);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap1 = multiShortestPathTree0.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree0.getStates(vertex2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(vertexMap1);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree6 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest5);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree6.stateSets;
        java.lang.String str8 = multiShortestPathTree6.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree6.getPath(vertex9, false);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree6.getPaths(vertex12, false);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree6.getPath(vertex15, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree6.stateSets;
        multiShortestPathTree1.stateSets = vertexMap18;
        org.opentripplanner.routing.core.State state20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = multiShortestPathTree1.visit(state20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap18);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = (byte) 10;
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.core.State state10 = multiShortestPathTree1.getState(vertex9);
        int int11 = multiShortestPathTree1.getVertexCount();
        java.lang.Class<?> wildcardClass12 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, false);
        java.lang.Class<?> wildcardClass13 = graphPathList12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_DIFF_MARGIN = (short) 100;
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        int int10 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree1.getStates(vertex13);
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.add(state15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList14);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet13);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree1.getStates(vertex8);
        int int10 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList13);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON = 10L;
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.visit(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection8);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        int int7 = multiShortestPathTree5.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap8;
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, false);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        java.lang.Class<?> wildcardClass15 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.visit(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet9);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON = (short) 10;
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON = 10.0d;
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.opentripplanner.routing.spt.MultiShortestPathTree.serialVersionUID = 1;
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap16 = multiShortestPathTree1.stateSets;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap16);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON = 100.0f;
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree12 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree12.getStates(vertex13);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree12.stateSets;
        multiShortestPathTree10.stateSets = vertexMap15;
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree10.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet18 = multiShortestPathTree10.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList20 = multiShortestPathTree10.getStates(vertex19);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet21 = multiShortestPathTree10.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree23 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest22);
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList25 = multiShortestPathTree23.getStates(vertex24);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap26 = multiShortestPathTree23.stateSets;
        multiShortestPathTree10.stateSets = vertexMap26;
        multiShortestPathTree1.stateSets = vertexMap26;
        org.opentripplanner.routing.core.RoutingRequest routingRequest29 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex30 = null;
        org.opentripplanner.routing.core.State state31 = multiShortestPathTree1.getState(vertex30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state31);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, true);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList15);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree1.stateSets;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap9);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        int int7 = multiShortestPathTree5.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap8;
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, false);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths(vertex14, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList16);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON = 1L;
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        int int8 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree12 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree12.getStates(vertex13);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree12.stateSets;
        multiShortestPathTree10.stateSets = vertexMap15;
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree10.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet18 = multiShortestPathTree10.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList20 = multiShortestPathTree10.getStates(vertex19);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet21 = multiShortestPathTree10.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree23 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest22);
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList25 = multiShortestPathTree23.getStates(vertex24);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap26 = multiShortestPathTree23.stateSets;
        multiShortestPathTree10.stateSets = vertexMap26;
        multiShortestPathTree1.stateSets = vertexMap26;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList29 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap26);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.visit(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = multiShortestPathTree1.visit(state3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_DIFF_MARGIN = (byte) 1;
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree1.postVisit(state12);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.options;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest17);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap11 = multiShortestPathTree10.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree10.getPath(vertex12, false);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree10.getPath(vertex15, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree10.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree20 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest19);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = multiShortestPathTree20.stateSets;
        java.lang.String str22 = multiShortestPathTree20.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree24 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest23);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap25 = multiShortestPathTree24.stateSets;
        multiShortestPathTree20.stateSets = vertexMap25;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap27 = multiShortestPathTree20.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap28 = multiShortestPathTree20.stateSets;
        multiShortestPathTree10.stateSets = vertexMap28;
        multiShortestPathTree1.stateSets = vertexMap28;
        org.opentripplanner.routing.core.RoutingRequest routingRequest31 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList32 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "MultiSPT(0 vertices)" + "'", str22.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest31);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree9.stateSets;
        java.lang.String str11 = multiShortestPathTree9.toString();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree9.getPath(vertex12, false);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree9.getPaths(vertex15, false);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath20 = multiShortestPathTree9.getPath(vertex18, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = multiShortestPathTree9.stateSets;
        multiShortestPathTree1.stateSets = vertexMap21;
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList25 = multiShortestPathTree1.getPaths(vertex23, true);
        org.opentripplanner.routing.graph.Vertex vertex26 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath28 = multiShortestPathTree1.getPath(vertex26, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath28);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        int int13 = multiShortestPathTree1.getVertexCount();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.add(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList8);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        int int8 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet10);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        int int13 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest14);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_DIFF_MARGIN = (short) 1;
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree1.getStates(vertex8);
        int int10 = multiShortestPathTree1.getVertexCount();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = 0L;
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state17);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.add(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet7);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList16 = multiShortestPathTree1.getStates(vertex15);
        org.opentripplanner.routing.core.State state17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = multiShortestPathTree1.visit(state17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList16);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.visit(state15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap14);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, false);
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.add(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath11);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap11 = multiShortestPathTree1.stateSets;
        java.lang.Class<?> wildcardClass12 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.visit(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet10);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        int int7 = multiShortestPathTree5.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap8;
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.options;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest16);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_DIFF_MARGIN = (short) 100;
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_DIFF_MARGIN = (short) -1;
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.core.State state10 = multiShortestPathTree1.getState(vertex9);
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.visit(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.options;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest9);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        java.lang.Class<?> wildcardClass7 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = 'a';
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = multiShortestPathTree1.add(state5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet4);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_DIFF_MARGIN = (short) 10;
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = null;
        multiShortestPathTree1.stateSets = vertexMap4;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = 100;
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.opentripplanner.routing.spt.MultiShortestPathTree.serialVersionUID = (byte) 100;
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON = (short) 100;
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        java.lang.String str14 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList18 = multiShortestPathTree16.getStates(vertex17);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap19 = multiShortestPathTree16.stateSets;
        multiShortestPathTree1.stateSets = vertexMap19;
        org.opentripplanner.routing.core.State state21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = multiShortestPathTree1.add(state21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap19);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = 1;
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap1 = multiShortestPathTree0.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state3 = multiShortestPathTree0.getState(vertex2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(vertexMap1);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.add(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap9);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList13);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath9 = multiShortestPathTree1.getPath(vertex7, false);
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.visit(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath9);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.core.State state6 = multiShortestPathTree1.getState(vertex5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList7 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        java.lang.Class<?> wildcardClass10 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree12 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree12.getStates(vertex13);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree12.stateSets;
        multiShortestPathTree10.stateSets = vertexMap15;
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree10.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet18 = multiShortestPathTree10.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList20 = multiShortestPathTree10.getStates(vertex19);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet21 = multiShortestPathTree10.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree23 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest22);
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList25 = multiShortestPathTree23.getStates(vertex24);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap26 = multiShortestPathTree23.stateSets;
        multiShortestPathTree10.stateSets = vertexMap26;
        multiShortestPathTree1.stateSets = vertexMap26;
        org.opentripplanner.routing.core.RoutingRequest routingRequest29 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest30 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree31 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest30);
        org.opentripplanner.routing.graph.Vertex vertex32 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList33 = multiShortestPathTree31.getStates(vertex32);
        java.lang.String str34 = multiShortestPathTree31.toString();
        org.opentripplanner.routing.core.State state35 = null;
        multiShortestPathTree31.postVisit(state35);
        org.opentripplanner.routing.core.RoutingRequest routingRequest37 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree38 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest37);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap39 = multiShortestPathTree38.stateSets;
        multiShortestPathTree31.stateSets = vertexMap39;
        org.opentripplanner.routing.core.RoutingRequest routingRequest41 = multiShortestPathTree31.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap42 = multiShortestPathTree31.stateSets;
        multiShortestPathTree1.stateSets = vertexMap42;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection44 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state45 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = multiShortestPathTree1.visit(state45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "MultiSPT(0 vertices)" + "'", str34.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection44);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON = (short) 0;
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet6 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet6);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        int int7 = multiShortestPathTree5.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap8;
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = multiShortestPathTree1.visit(state17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet16);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree6 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest5);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree6.stateSets;
        java.lang.String str8 = multiShortestPathTree6.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree6.getPath(vertex9, false);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree6.getPaths(vertex12, false);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree6.getPath(vertex15, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree6.stateSets;
        multiShortestPathTree1.stateSets = vertexMap18;
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList22 = multiShortestPathTree1.getPaths(vertex20, true);
        int int23 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = multiShortestPathTree1.add(state24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList6 = multiShortestPathTree1.getStates(vertex5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        java.lang.String str9 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.add(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest10);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_DIFF_MARGIN = (byte) 10;
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.visit(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet10);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, true);
        org.opentripplanner.routing.core.State state16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = multiShortestPathTree1.add(state16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath15);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree1.stateSets;
        java.lang.String str10 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, false);
        org.opentripplanner.routing.core.State state14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = multiShortestPathTree1.visit(state14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "MultiSPT(0 vertices)" + "'", str10.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList13);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest7);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree10.getStates(vertex11);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap13 = multiShortestPathTree10.stateSets;
        multiShortestPathTree8.stateSets = vertexMap13;
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree8.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree8.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList18 = multiShortestPathTree8.getStates(vertex17);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree8.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList23 = multiShortestPathTree21.getStates(vertex22);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap24 = multiShortestPathTree21.stateSets;
        multiShortestPathTree8.stateSets = vertexMap24;
        multiShortestPathTree1.stateSets = vertexMap24;
        org.opentripplanner.routing.graph.Vertex vertex27 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath29 = multiShortestPathTree1.getPath(vertex27, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest30 = multiShortestPathTree1.options;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest30);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state14);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.visit(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap9);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = multiShortestPathTree1.visit(state5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON = 1L;
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.lang.Class<?> wildcardClass8 = vertexMap6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state17);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest11);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass9 = vertexSet8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.core.State state10 = multiShortestPathTree1.getState(vertex9);
        int int11 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.add(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection12);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree10.getStates(vertex11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree10.getStates(vertex13);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree10.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree19 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest18);
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList21 = multiShortestPathTree19.getStates(vertex20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree19.stateSets;
        multiShortestPathTree17.stateSets = vertexMap22;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap24 = multiShortestPathTree17.stateSets;
        multiShortestPathTree10.stateSets = vertexMap24;
        multiShortestPathTree1.stateSets = vertexMap24;
        org.opentripplanner.routing.core.RoutingRequest routingRequest27 = multiShortestPathTree1.getOptions();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest27);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        int int9 = multiShortestPathTree1.getVertexCount();
        java.lang.String str10 = multiShortestPathTree1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "MultiSPT(0 vertices)" + "'", str10.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet17 = multiShortestPathTree16.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree16.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap19 = multiShortestPathTree16.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        org.opentripplanner.routing.core.State state21 = multiShortestPathTree16.getState(vertex20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree16.stateSets;
        multiShortestPathTree1.stateSets = vertexMap22;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet24 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state25 = null;
        multiShortestPathTree1.postVisit(state25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet24);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.add(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        org.opentripplanner.routing.core.State state6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = multiShortestPathTree1.visit(state6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        java.lang.String str13 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = null;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest9);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        java.lang.String str14 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.options;
        java.lang.String str5 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = routingRequest6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest6);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON = 100;
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList5 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        int int13 = multiShortestPathTree1.getVertexCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        int int13 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.options;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest14);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList10);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath9 = multiShortestPathTree1.getPath(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = graphPath15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath15);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON = (-1.0d);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath11);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON = 0.02d;
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.opentripplanner.routing.spt.MultiShortestPathTree.serialVersionUID = 0;
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        int int13 = multiShortestPathTree1.getVertexCount();
        java.lang.String str14 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.add(state15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        int int7 = multiShortestPathTree5.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap8;
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        int int14 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state15 = null;
        multiShortestPathTree1.postVisit(state15);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap17 = multiShortestPathTree1.stateSets;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap17);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = multiShortestPathTree1.add(state7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest6);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree1.stateSets;
        java.lang.Class<?> wildcardClass15 = vertexMap14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree10.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree10.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap13 = multiShortestPathTree10.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.core.State state15 = multiShortestPathTree10.getState(vertex14);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree10.getPaths(vertex16, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap19 = multiShortestPathTree10.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap20 = multiShortestPathTree10.stateSets;
        multiShortestPathTree1.stateSets = vertexMap20;
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath24 = multiShortestPathTree1.getPath(vertex22, true);
        org.opentripplanner.routing.graph.Vertex vertex25 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList27 = multiShortestPathTree1.getPaths(vertex25, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList27);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest13);
        java.lang.String str15 = multiShortestPathTree14.toString();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath18 = multiShortestPathTree14.getPath(vertex16, false);
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList21 = multiShortestPathTree14.getPaths(vertex19, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree23 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest22);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap24 = multiShortestPathTree23.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex25 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath27 = multiShortestPathTree23.getPath(vertex25, false);
        org.opentripplanner.routing.graph.Vertex vertex28 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath30 = multiShortestPathTree23.getPath(vertex28, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap31 = multiShortestPathTree23.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest32 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree33 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest32);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap34 = multiShortestPathTree33.stateSets;
        java.lang.String str35 = multiShortestPathTree33.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest36 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree37 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest36);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap38 = multiShortestPathTree37.stateSets;
        multiShortestPathTree33.stateSets = vertexMap38;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap40 = multiShortestPathTree33.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap41 = multiShortestPathTree33.stateSets;
        multiShortestPathTree23.stateSets = vertexMap41;
        multiShortestPathTree14.stateSets = vertexMap41;
        multiShortestPathTree1.stateSets = vertexMap41;
        org.opentripplanner.routing.graph.Vertex vertex45 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath47 = multiShortestPathTree1.getPath(vertex45, false);
        java.lang.Class<?> wildcardClass48 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "MultiSPT(0 vertices)" + "'", str35.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest7);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree8.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree8.getPath(vertex10, false);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree8.getStates(vertex13);
        int int15 = multiShortestPathTree8.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree19 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest18);
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList21 = multiShortestPathTree19.getStates(vertex20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree19.stateSets;
        multiShortestPathTree17.stateSets = vertexMap22;
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = multiShortestPathTree17.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet25 = multiShortestPathTree17.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex26 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList27 = multiShortestPathTree17.getStates(vertex26);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet28 = multiShortestPathTree17.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest29 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree30 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest29);
        org.opentripplanner.routing.graph.Vertex vertex31 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList32 = multiShortestPathTree30.getStates(vertex31);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap33 = multiShortestPathTree30.stateSets;
        multiShortestPathTree17.stateSets = vertexMap33;
        multiShortestPathTree8.stateSets = vertexMap33;
        multiShortestPathTree1.stateSets = vertexMap33;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap33);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        int int9 = multiShortestPathTree1.getVertexCount();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection8);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_DIFF_MARGIN = 10;
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree10.getStates(vertex11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree10.getStates(vertex13);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree10.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree19 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest18);
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList21 = multiShortestPathTree19.getStates(vertex20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree19.stateSets;
        multiShortestPathTree17.stateSets = vertexMap22;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap24 = multiShortestPathTree17.stateSets;
        multiShortestPathTree10.stateSets = vertexMap24;
        multiShortestPathTree1.stateSets = vertexMap24;
        java.lang.Class<?> wildcardClass27 = vertexMap24.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = 0.0f;
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON = 1.0f;
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree1.stateSets;
        int int11 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree1.postVisit(state12);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath16);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.lang.Class<?> wildcardClass7 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = null;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = multiShortestPathTree1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.add(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath7);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        java.lang.Class<?> wildcardClass7 = vertexMap6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree11 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest10);
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree13 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest12);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree13.getStates(vertex14);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap16 = multiShortestPathTree13.stateSets;
        multiShortestPathTree11.stateSets = vertexMap16;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree11.stateSets;
        multiShortestPathTree1.stateSets = vertexMap18;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap18);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        int int10 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap11 = multiShortestPathTree1.stateSets;
        java.lang.Class<?> wildcardClass12 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet6 = multiShortestPathTree1.getVertices();
        java.lang.String str7 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = (byte) 1;
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON = '#';
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree1.postVisit(state12);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, true);
        int int17 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.core.State state19 = multiShortestPathTree1.getState(vertex18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state19);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList6 = multiShortestPathTree1.getStates(vertex5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        java.lang.String str9 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_DIFF_MARGIN = (byte) 0;
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath7);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.core.State state8 = multiShortestPathTree1.getState(vertex7);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        int int10 = multiShortestPathTree1.getVertexCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest13);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList16 = multiShortestPathTree14.getStates(vertex15);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap17 = multiShortestPathTree14.stateSets;
        multiShortestPathTree1.stateSets = vertexMap17;
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList20 = multiShortestPathTree1.getStates(vertex19);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection21 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet22 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList23 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet22);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, false);
        java.lang.Class<?> wildcardClass13 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList6 = multiShortestPathTree1.getStates(vertex5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList6);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        java.lang.String str10 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass12 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "MultiSPT(0 vertices)" + "'", str10.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.add(state15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest10);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = null;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = multiShortestPathTree1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest9);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.visit(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet11);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree12 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree12.getStates(vertex13);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree12.stateSets;
        multiShortestPathTree10.stateSets = vertexMap15;
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree10.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet18 = multiShortestPathTree10.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList20 = multiShortestPathTree10.getStates(vertex19);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet21 = multiShortestPathTree10.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree23 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest22);
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList25 = multiShortestPathTree23.getStates(vertex24);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap26 = multiShortestPathTree23.stateSets;
        multiShortestPathTree10.stateSets = vertexMap26;
        multiShortestPathTree1.stateSets = vertexMap26;
        org.opentripplanner.routing.core.RoutingRequest routingRequest29 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest30 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree31 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest30);
        org.opentripplanner.routing.graph.Vertex vertex32 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList33 = multiShortestPathTree31.getStates(vertex32);
        java.lang.String str34 = multiShortestPathTree31.toString();
        org.opentripplanner.routing.core.State state35 = null;
        multiShortestPathTree31.postVisit(state35);
        org.opentripplanner.routing.core.RoutingRequest routingRequest37 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree38 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest37);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap39 = multiShortestPathTree38.stateSets;
        multiShortestPathTree31.stateSets = vertexMap39;
        org.opentripplanner.routing.core.RoutingRequest routingRequest41 = multiShortestPathTree31.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap42 = multiShortestPathTree31.stateSets;
        multiShortestPathTree1.stateSets = vertexMap42;
        org.opentripplanner.routing.core.State state44 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = multiShortestPathTree1.add(state44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "MultiSPT(0 vertices)" + "'", str34.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap42);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath8 = multiShortestPathTree1.getPath(vertex6, false);
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath8);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON = 0.05d;
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest13);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList18 = multiShortestPathTree16.getStates(vertex17);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap19 = multiShortestPathTree16.stateSets;
        multiShortestPathTree14.stateSets = vertexMap19;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = multiShortestPathTree14.stateSets;
        multiShortestPathTree1.stateSets = vertexMap21;
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree24 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest23);
        org.opentripplanner.routing.graph.Vertex vertex25 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList26 = multiShortestPathTree24.getStates(vertex25);
        org.opentripplanner.routing.graph.Vertex vertex27 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList28 = multiShortestPathTree24.getStates(vertex27);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap29 = multiShortestPathTree24.stateSets;
        multiShortestPathTree1.stateSets = vertexMap29;
        org.opentripplanner.routing.graph.Vertex vertex31 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList32 = multiShortestPathTree1.getStates(vertex31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList32);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        int int8 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree12 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree12.getStates(vertex13);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree12.stateSets;
        multiShortestPathTree10.stateSets = vertexMap15;
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree10.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet18 = multiShortestPathTree10.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList20 = multiShortestPathTree10.getStates(vertex19);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet21 = multiShortestPathTree10.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree23 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest22);
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList25 = multiShortestPathTree23.getStates(vertex24);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap26 = multiShortestPathTree23.stateSets;
        multiShortestPathTree10.stateSets = vertexMap26;
        multiShortestPathTree1.stateSets = vertexMap26;
        org.opentripplanner.routing.core.RoutingRequest routingRequest29 = multiShortestPathTree1.options;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest29);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath8 = multiShortestPathTree1.getPath(vertex6, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree11 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest10);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap12 = multiShortestPathTree11.stateSets;
        java.lang.String str13 = multiShortestPathTree11.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree15 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest14);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap16 = multiShortestPathTree15.stateSets;
        multiShortestPathTree11.stateSets = vertexMap16;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree11.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap19 = multiShortestPathTree11.stateSets;
        multiShortestPathTree1.stateSets = vertexMap19;
        java.lang.Class<?> wildcardClass21 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        int int7 = multiShortestPathTree5.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap8;
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, false);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest15);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON = 'a';
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        java.lang.String str12 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        java.lang.String str14 = multiShortestPathTree1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths(vertex12, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList14);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest13);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList18 = multiShortestPathTree16.getStates(vertex17);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap19 = multiShortestPathTree16.stateSets;
        multiShortestPathTree14.stateSets = vertexMap19;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = multiShortestPathTree14.stateSets;
        multiShortestPathTree1.stateSets = vertexMap21;
        java.lang.Class<?> wildcardClass23 = vertexMap21.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        int int7 = multiShortestPathTree5.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap8;
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, false);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths(vertex15, true);
        java.lang.Class<?> wildcardClass18 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree9.stateSets;
        java.lang.String str11 = multiShortestPathTree9.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree13 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest12);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree13.stateSets;
        multiShortestPathTree9.stateSets = vertexMap14;
        multiShortestPathTree1.stateSets = vertexMap14;
        java.lang.Class<?> wildcardClass17 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        int int15 = multiShortestPathTree1.getVertexCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        java.lang.Class<?> wildcardClass8 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap11 = multiShortestPathTree10.stateSets;
        int int12 = multiShortestPathTree10.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree10.getPaths(vertex13, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList19 = multiShortestPathTree17.getStates(vertex18);
        java.lang.String str20 = multiShortestPathTree17.toString();
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath23 = multiShortestPathTree17.getPath(vertex21, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap24 = multiShortestPathTree17.stateSets;
        multiShortestPathTree10.stateSets = vertexMap24;
        multiShortestPathTree1.stateSets = vertexMap24;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList27 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "MultiSPT(0 vertices)" + "'", str20.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap24);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        java.lang.Class<?> wildcardClass4 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList10 = multiShortestPathTree1.getStates(vertex9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList10);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON = (short) 1;
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        int int9 = multiShortestPathTree1.getVertexCount();
        int int10 = multiShortestPathTree1.getVertexCount();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest7);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree8.stateSets;
        multiShortestPathTree1.stateSets = vertexMap9;
        int int11 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths(vertex12, false);
        java.lang.Class<?> wildcardClass15 = graphPathList14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.core.State state6 = multiShortestPathTree1.getState(vertex5);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest7);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = multiShortestPathTree1.visit(state7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest6);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        int int7 = multiShortestPathTree5.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap8;
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, false);
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.visit(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList12);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.options;
        java.lang.String str5 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.visit(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection7);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet15 = multiShortestPathTree1.getVertices();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet15);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest7);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree10.getStates(vertex11);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap13 = multiShortestPathTree10.stateSets;
        multiShortestPathTree8.stateSets = vertexMap13;
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree8.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree8.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList18 = multiShortestPathTree8.getStates(vertex17);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree8.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList23 = multiShortestPathTree21.getStates(vertex22);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap24 = multiShortestPathTree21.stateSets;
        multiShortestPathTree8.stateSets = vertexMap24;
        multiShortestPathTree1.stateSets = vertexMap24;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection27 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = multiShortestPathTree1.visit(state28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection27);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath16);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.opentripplanner.routing.spt.MultiShortestPathTree.serialVersionUID = (short) -1;
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        java.lang.Class<?> wildcardClass17 = stateCollection16.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree6 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest5);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree6.stateSets;
        java.lang.String str8 = multiShortestPathTree6.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree6.getPath(vertex9, false);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree6.getPaths(vertex12, false);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree6.getPath(vertex15, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree6.stateSets;
        multiShortestPathTree1.stateSets = vertexMap18;
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList22 = multiShortestPathTree1.getPaths(vertex20, true);
        java.lang.Class<?> wildcardClass23 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.core.State state10 = multiShortestPathTree1.getState(vertex9);
        int int11 = multiShortestPathTree1.getVertexCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        java.lang.Class<?> wildcardClass16 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = (-1.0d);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        int int10 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree1.stateSets;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap15);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_DIFF_MARGIN = (byte) 1;
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap12 = multiShortestPathTree1.stateSets;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap12);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree1.stateSets;
        java.lang.Class<?> wildcardClass11 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON = (byte) 10;
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath8 = multiShortestPathTree1.getPath(vertex6, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.options;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = routingRequest9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest9);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList11);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, true);
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.visit(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath11);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath9 = multiShortestPathTree1.getPath(vertex7, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath9);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, true);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree1.getStates(vertex11);
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest13);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        int int7 = multiShortestPathTree5.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap8;
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.getOptions();
        int int14 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree17.stateSets;
        java.lang.String str19 = multiShortestPathTree17.toString();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath22 = multiShortestPathTree17.getPath(vertex20, false);
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList25 = multiShortestPathTree17.getPaths(vertex23, false);
        org.opentripplanner.routing.graph.Vertex vertex26 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath28 = multiShortestPathTree17.getPath(vertex26, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap29 = multiShortestPathTree17.stateSets;
        multiShortestPathTree1.stateSets = vertexMap29;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "MultiSPT(0 vertices)" + "'", str19.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap29);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = multiShortestPathTree1.visit(state6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap5);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = multiShortestPathTree1.visit(state5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet4);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.core.State state8 = multiShortestPathTree1.getState(vertex7);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree1.getStates(vertex13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList14);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        java.lang.String str14 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = multiShortestPathTree1.visit(state16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest15);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap17 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList19 = multiShortestPathTree1.getStates(vertex18);
        org.opentripplanner.routing.core.State state20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = multiShortestPathTree1.add(state20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList19);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = stateList5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath7);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = 1L;
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.visit(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet10);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest12);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree1.stateSets;
        java.lang.String str10 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.add(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "MultiSPT(0 vertices)" + "'", str10.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        int int9 = multiShortestPathTree1.getVertexCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList8);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON = '4';
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet17 = multiShortestPathTree16.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree16.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap19 = multiShortestPathTree16.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        org.opentripplanner.routing.core.State state21 = multiShortestPathTree16.getState(vertex20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree16.stateSets;
        multiShortestPathTree1.stateSets = vertexMap22;
        java.lang.Class<?> wildcardClass24 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree12 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree12.getStates(vertex13);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree12.stateSets;
        multiShortestPathTree10.stateSets = vertexMap15;
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree10.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet18 = multiShortestPathTree10.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList20 = multiShortestPathTree10.getStates(vertex19);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet21 = multiShortestPathTree10.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree23 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest22);
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList25 = multiShortestPathTree23.getStates(vertex24);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap26 = multiShortestPathTree23.stateSets;
        multiShortestPathTree10.stateSets = vertexMap26;
        multiShortestPathTree1.stateSets = vertexMap26;
        org.opentripplanner.routing.core.RoutingRequest routingRequest29 = multiShortestPathTree1.getOptions();
        java.lang.String str30 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state31 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = multiShortestPathTree1.visit(state31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "MultiSPT(0 vertices)" + "'", str30.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree1.getPath(vertex17, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath19);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        int int6 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = multiShortestPathTree1.visit(state7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_DIFF_MARGIN = 1;
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = multiShortestPathTree1.visit(state5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath9 = multiShortestPathTree1.getPath(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.visit(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath12);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree13 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree15 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest14);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList17 = multiShortestPathTree15.getStates(vertex16);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree15.stateSets;
        multiShortestPathTree13.stateSets = vertexMap18;
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree13.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet21 = multiShortestPathTree13.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList23 = multiShortestPathTree13.getStates(vertex22);
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList25 = multiShortestPathTree13.getStates(vertex24);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap26 = multiShortestPathTree13.stateSets;
        multiShortestPathTree1.stateSets = vertexMap26;
        org.opentripplanner.routing.core.RoutingRequest routingRequest28 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = multiShortestPathTree1.visit(state29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest28);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        java.lang.String str14 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        java.lang.String str16 = multiShortestPathTree1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest12);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON = (byte) 0;
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.options;
        java.lang.Class<?> wildcardClass5 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree9.stateSets;
        java.lang.String str11 = multiShortestPathTree9.toString();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree9.getPath(vertex12, false);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree9.getPaths(vertex15, false);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath20 = multiShortestPathTree9.getPath(vertex18, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = multiShortestPathTree9.stateSets;
        multiShortestPathTree1.stateSets = vertexMap21;
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList25 = multiShortestPathTree1.getPaths(vertex23, false);
        java.lang.String str26 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest27 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = multiShortestPathTree1.visit(state28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "MultiSPT(0 vertices)" + "'", str26.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest27);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, false);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = stateList13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList13);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.core.State state10 = multiShortestPathTree1.getState(vertex9);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath15);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest13);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList16 = multiShortestPathTree14.getStates(vertex15);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap17 = multiShortestPathTree14.stateSets;
        multiShortestPathTree1.stateSets = vertexMap17;
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList20 = multiShortestPathTree1.getStates(vertex19);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection21 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet22 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass23 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, false);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths(vertex13, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList15);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList10);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.opentripplanner.routing.spt.MultiShortestPathTree.serialVersionUID = 100L;
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON = 10;
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree1.stateSets;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap9);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.core.State state10 = multiShortestPathTree1.getState(vertex9);
        int int11 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state14);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.core.State state6 = multiShortestPathTree1.getState(vertex5);
        java.lang.String str7 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree1.stateSets;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap14);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree1.stateSets;
        java.lang.Class<?> wildcardClass10 = vertexMap9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON = 30;
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest12);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest7);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree8.stateSets;
        multiShortestPathTree1.stateSets = vertexMap9;
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree1.postVisit(state12);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths(vertex14, true);
        int int17 = multiShortestPathTree1.getVertexCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        int int14 = multiShortestPathTree1.getVertexCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet6 = multiShortestPathTree1.getVertices();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet6);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree1.stateSets;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap9);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap11 = multiShortestPathTree10.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree10.getPath(vertex12, false);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree10.getPath(vertex15, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree10.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree20 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest19);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = multiShortestPathTree20.stateSets;
        java.lang.String str22 = multiShortestPathTree20.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree24 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest23);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap25 = multiShortestPathTree24.stateSets;
        multiShortestPathTree20.stateSets = vertexMap25;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap27 = multiShortestPathTree20.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap28 = multiShortestPathTree20.stateSets;
        multiShortestPathTree10.stateSets = vertexMap28;
        multiShortestPathTree1.stateSets = vertexMap28;
        org.opentripplanner.routing.core.RoutingRequest routingRequest31 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap32 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex33 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath35 = multiShortestPathTree1.getPath(vertex33, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "MultiSPT(0 vertices)" + "'", str22.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath35);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths(vertex13, true);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state17);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, false);
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        java.lang.Class<?> wildcardClass13 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest4);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.visit(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest12);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        int int7 = multiShortestPathTree5.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap8;
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass15 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList6 = multiShortestPathTree1.getStates(vertex5);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.visit(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest7);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet14);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        java.lang.String str14 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = multiShortestPathTree1.visit(state17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest16);
    }
}

