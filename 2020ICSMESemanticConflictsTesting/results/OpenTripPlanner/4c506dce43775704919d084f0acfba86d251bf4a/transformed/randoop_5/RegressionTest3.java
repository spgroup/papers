import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree15 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest14);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree15.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree15.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree15.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        org.opentripplanner.routing.core.State state20 = multiShortestPathTree15.getState(vertex19);
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList23 = multiShortestPathTree15.getPaths(vertex21, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap24 = multiShortestPathTree15.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap25 = multiShortestPathTree15.stateSets;
        multiShortestPathTree1.stateSets = vertexMap25;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap27 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex28 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath30 = multiShortestPathTree1.getPath(vertex28, false);
        org.opentripplanner.routing.graph.Vertex vertex31 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath33 = multiShortestPathTree1.getPath(vertex31, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap34 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap35 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state36 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = multiShortestPathTree1.add(state36);
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
        org.junit.Assert.assertNull(routingRequest13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap35);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        org.opentripplanner.routing.core.State state15 = null;
        multiShortestPathTree1.postVisit(state15);
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
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet18 = multiShortestPathTree17.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree17.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree21.stateSets;
        int int23 = multiShortestPathTree21.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap24 = multiShortestPathTree21.stateSets;
        multiShortestPathTree17.stateSets = vertexMap24;
        multiShortestPathTree1.stateSets = vertexMap24;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection27 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex28 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList29 = multiShortestPathTree1.getStates(vertex28);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet30 = multiShortestPathTree1.getVertices();
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
        org.junit.Assert.assertNotNull(vertexSet18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet30);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.core.State state4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = multiShortestPathTree1.add(state4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        int int15 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree17.stateSets;
        int int19 = multiShortestPathTree17.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList22 = multiShortestPathTree17.getPaths(vertex20, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap23 = multiShortestPathTree17.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap24 = multiShortestPathTree17.stateSets;
        multiShortestPathTree1.stateSets = vertexMap24;
        org.opentripplanner.routing.graph.Vertex vertex26 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList28 = multiShortestPathTree1.getPaths(vertex26, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList28);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.add(state9);
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
        org.junit.Assert.assertNull(routingRequest8);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.lang.String str6 = multiShortestPathTree5.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap7;
        java.lang.Class<?> wildcardClass9 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        java.lang.String str12 = multiShortestPathTree1.toString();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection23 = multiShortestPathTree1.getAllStates();
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
        org.junit.Assert.assertNotNull(stateCollection23);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList23 = multiShortestPathTree1.getPaths(vertex21, false);
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
        org.junit.Assert.assertNotNull(graphPathList23);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
        int int15 = multiShortestPathTree1.getVertexCount();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.lang.String str6 = multiShortestPathTree5.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap7;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree11 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest10);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap12 = multiShortestPathTree11.stateSets;
        java.lang.String str13 = multiShortestPathTree11.toString();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree11.getPath(vertex14, false);
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList19 = multiShortestPathTree11.getPaths(vertex17, false);
        int int20 = multiShortestPathTree11.getVertexCount();
        org.opentripplanner.routing.core.State state21 = null;
        multiShortestPathTree11.postVisit(state21);
        org.opentripplanner.routing.core.State state23 = null;
        multiShortestPathTree11.postVisit(state23);
        org.opentripplanner.routing.core.RoutingRequest routingRequest25 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree26 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest25);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap27 = multiShortestPathTree26.stateSets;
        int int28 = multiShortestPathTree26.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap29 = multiShortestPathTree26.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest30 = multiShortestPathTree26.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex31 = null;
        org.opentripplanner.routing.core.State state32 = multiShortestPathTree26.getState(vertex31);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap33 = multiShortestPathTree26.stateSets;
        multiShortestPathTree11.stateSets = vertexMap33;
        multiShortestPathTree1.stateSets = vertexMap33;
        int int36 = multiShortestPathTree1.getVertexCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList10 = multiShortestPathTree1.getStates(vertex9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList10);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
        int int27 = multiShortestPathTree1.getVertexCount();
        java.lang.String str28 = multiShortestPathTree1.toString();
        int int29 = multiShortestPathTree1.getVertexCount();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "MultiSPT(0 vertices)" + "'", str28.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
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
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state13);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath18 = multiShortestPathTree1.getPath(vertex16, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap19 = multiShortestPathTree1.stateSets;
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
        org.junit.Assert.assertNull(routingRequest14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap19);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree1.stateSets;
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
        org.junit.Assert.assertNull(routingRequest17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap18);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
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
        org.opentripplanner.routing.graph.Vertex vertex29 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList31 = multiShortestPathTree1.getPaths(vertex29, false);
        org.opentripplanner.routing.core.State state32 = null;
        multiShortestPathTree1.postVisit(state32);
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
        org.junit.Assert.assertNotNull(graphPathList31);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.options;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest6);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection16);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest15);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        java.lang.String str5 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap11 = multiShortestPathTree10.stateSets;
        int int12 = multiShortestPathTree10.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap13 = multiShortestPathTree10.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree10.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.core.State state16 = multiShortestPathTree10.getState(vertex15);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap17 = multiShortestPathTree10.stateSets;
        multiShortestPathTree1.stateSets = vertexMap17;
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.getOptions();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest19);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest11);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        java.lang.String str11 = multiShortestPathTree1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        int int5 = multiShortestPathTree1.getVertexCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass14 = multiShortestPathTree1.getClass();
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
        org.junit.Assert.assertNotNull(stateCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList6 = multiShortestPathTree1.getStates(vertex5);
        java.lang.String str7 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
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
        org.junit.Assert.assertNull(stateList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList10);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, true);
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
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList13);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        int int11 = multiShortestPathTree1.getVertexCount();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
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
        org.opentripplanner.routing.core.State state15 = null;
        multiShortestPathTree1.postVisit(state15);
        java.lang.Class<?> wildcardClass17 = multiShortestPathTree1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.getOptions();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest16);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap11 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths(vertex12, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList14);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.core.State state6 = multiShortestPathTree1.getState(vertex5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.options;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = routingRequest10.getClass();
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
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest10);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        int int11 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet12);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap12 = multiShortestPathTree1.stateSets;
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
        org.junit.Assert.assertNotNull(vertexMap12);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap17 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = multiShortestPathTree1.add(state18);
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
        org.junit.Assert.assertNull(routingRequest16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap17);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap11 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree1.getStates(vertex13);
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
        org.junit.Assert.assertNull(routingRequest10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList14);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        java.lang.String str8 = multiShortestPathTree1.toString();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest13);
        java.lang.String str15 = multiShortestPathTree14.toString();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath18 = multiShortestPathTree14.getPath(vertex16, false);
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList21 = multiShortestPathTree14.getPaths(vertex19, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree23 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest22);
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree25 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest24);
        org.opentripplanner.routing.graph.Vertex vertex26 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList27 = multiShortestPathTree25.getStates(vertex26);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap28 = multiShortestPathTree25.stateSets;
        multiShortestPathTree23.stateSets = vertexMap28;
        org.opentripplanner.routing.core.RoutingRequest routingRequest30 = multiShortestPathTree23.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet31 = multiShortestPathTree23.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex32 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList33 = multiShortestPathTree23.getStates(vertex32);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet34 = multiShortestPathTree23.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest35 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree36 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest35);
        org.opentripplanner.routing.graph.Vertex vertex37 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList38 = multiShortestPathTree36.getStates(vertex37);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap39 = multiShortestPathTree36.stateSets;
        multiShortestPathTree23.stateSets = vertexMap39;
        multiShortestPathTree14.stateSets = vertexMap39;
        multiShortestPathTree1.stateSets = vertexMap39;
        org.opentripplanner.routing.core.State state43 = null;
        multiShortestPathTree1.postVisit(state43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap39);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree1.getPath(vertex15, false);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.core.State state19 = multiShortestPathTree1.getState(vertex18);
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList21 = multiShortestPathTree1.getStates(vertex20);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet22 = multiShortestPathTree1.getVertices();
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
        org.junit.Assert.assertNull(graphPath17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet22);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.core.State state6 = multiShortestPathTree1.getState(vertex5);
        java.lang.String str7 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
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
        org.junit.Assert.assertNotNull(graphPathList10);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
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
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection14 = multiShortestPathTree1.getAllStates();
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
        org.junit.Assert.assertNull(state11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection14);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
        multiShortestPathTree1.postVisit(state13);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.core.State state16 = multiShortestPathTree1.getState(vertex15);
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList18 = multiShortestPathTree1.getStates(vertex17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList18);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap11 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state13);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree7.getStates(vertex8);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree7.stateSets;
        multiShortestPathTree5.stateSets = vertexMap10;
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree5.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree5.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree5.getStates(vertex14);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList17 = multiShortestPathTree5.getStates(vertex16);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap18;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet20 = multiShortestPathTree1.getVertices();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet21 = multiShortestPathTree1.getVertices();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet21);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        java.lang.String str11 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath8 = multiShortestPathTree1.getPath(vertex6, true);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.core.State state10 = multiShortestPathTree1.getState(vertex9);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree1.getStates(vertex11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = stateList12.getClass();
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
        org.junit.Assert.assertNull(graphPath8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList12);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
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
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.core.State state15 = multiShortestPathTree1.getState(vertex14);
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
        org.junit.Assert.assertNotNull(stateCollection12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths(vertex15, false);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath20 = multiShortestPathTree1.getPath(vertex18, true);
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath23 = multiShortestPathTree1.getPath(vertex21, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = multiShortestPathTree1.getOptions();
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
        org.junit.Assert.assertNotNull(graphPathList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest24);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap29 = multiShortestPathTree1.stateSets;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap29);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection4 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.options;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest6);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.options;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest9);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree1.stateSets;
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
        org.junit.Assert.assertNotNull(vertexMap9);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.options;
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
        org.junit.Assert.assertNull(routingRequest10);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        multiShortestPathTree1.postVisit(state28);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection30 = multiShortestPathTree1.getAllStates();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection30);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
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
        int int14 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree1.stateSets;
        int int16 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree1.postVisit(state17);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList6 = multiShortestPathTree1.getStates(vertex5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.core.State state8 = multiShortestPathTree1.getState(vertex7);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
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
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "MultiSPT(0 vertices)" + "'", str10.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList10 = multiShortestPathTree1.getStates(vertex9);
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
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
        org.junit.Assert.assertNull(stateList10);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, true);
        java.lang.String str12 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
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
        org.junit.Assert.assertNotNull(graphPathList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest15);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList6 = multiShortestPathTree1.getStates(vertex5);
        java.lang.String str7 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, true);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, true);
        int int15 = multiShortestPathTree1.getVertexCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection14 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.visit(state15);
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
        org.junit.Assert.assertNotNull(vertexSet13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection14);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
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
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet18 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList21 = multiShortestPathTree1.getPaths(vertex19, true);
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
        org.junit.Assert.assertNotNull(vertexSet18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList21);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree15 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest14);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree15.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree15.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree15.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        org.opentripplanner.routing.core.State state20 = multiShortestPathTree15.getState(vertex19);
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList23 = multiShortestPathTree15.getPaths(vertex21, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap24 = multiShortestPathTree15.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap25 = multiShortestPathTree15.stateSets;
        multiShortestPathTree1.stateSets = vertexMap25;
        org.opentripplanner.routing.graph.Vertex vertex27 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList28 = multiShortestPathTree1.getStates(vertex27);
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
        org.junit.Assert.assertNotNull(vertexSet16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList28);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest7);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree10.getStates(vertex11);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap13 = multiShortestPathTree10.stateSets;
        multiShortestPathTree8.stateSets = vertexMap13;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree8.stateSets;
        multiShortestPathTree1.stateSets = vertexMap15;
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree18 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest17);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree18.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree18.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = multiShortestPathTree18.stateSets;
        multiShortestPathTree1.stateSets = vertexMap21;
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree24 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest23);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap25 = multiShortestPathTree24.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex26 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath28 = multiShortestPathTree24.getPath(vertex26, false);
        int int29 = multiShortestPathTree24.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest30 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree31 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest30);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap32 = multiShortestPathTree31.stateSets;
        int int33 = multiShortestPathTree31.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex34 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList36 = multiShortestPathTree31.getPaths(vertex34, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap37 = multiShortestPathTree31.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap38 = multiShortestPathTree31.stateSets;
        multiShortestPathTree24.stateSets = vertexMap38;
        multiShortestPathTree1.stateSets = vertexMap38;
        org.opentripplanner.routing.graph.Vertex vertex41 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList42 = multiShortestPathTree1.getStates(vertex41);
        org.opentripplanner.routing.core.RoutingRequest routingRequest43 = multiShortestPathTree1.options;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest43);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree7.getStates(vertex8);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree7.stateSets;
        multiShortestPathTree5.stateSets = vertexMap10;
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree5.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree5.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree5.getStates(vertex14);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList17 = multiShortestPathTree5.getStates(vertex16);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap18;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet20 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = multiShortestPathTree1.visit(state22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest21);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.core.State state10 = multiShortestPathTree1.getState(vertex9);
        java.lang.String str11 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass13 = vertexSet12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest28 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree29 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest28);
        org.opentripplanner.routing.graph.Vertex vertex30 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList31 = multiShortestPathTree29.getStates(vertex30);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap32 = multiShortestPathTree29.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest33 = multiShortestPathTree29.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap34 = multiShortestPathTree29.stateSets;
        multiShortestPathTree1.stateSets = vertexMap34;
        org.opentripplanner.routing.core.RoutingRequest routingRequest36 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest37 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree38 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest37);
        org.opentripplanner.routing.graph.Vertex vertex39 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList40 = multiShortestPathTree38.getStates(vertex39);
        org.opentripplanner.routing.graph.Vertex vertex41 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList42 = multiShortestPathTree38.getStates(vertex41);
        int int43 = multiShortestPathTree38.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap44 = multiShortestPathTree38.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection45 = multiShortestPathTree38.getAllStates();
        org.opentripplanner.routing.core.State state46 = null;
        multiShortestPathTree38.postVisit(state46);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap48 = multiShortestPathTree38.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap49 = multiShortestPathTree38.stateSets;
        multiShortestPathTree1.stateSets = vertexMap49;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap49);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        java.lang.String str8 = multiShortestPathTree1.toString();
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree11 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree11.getStates(vertex12);
        java.lang.String str14 = multiShortestPathTree11.toString();
        org.opentripplanner.routing.core.State state15 = null;
        multiShortestPathTree11.postVisit(state15);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree18 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest17);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap19 = multiShortestPathTree18.stateSets;
        multiShortestPathTree11.stateSets = vertexMap19;
        multiShortestPathTree1.stateSets = vertexMap19;
        java.lang.Class<?> wildcardClass22 = vertexMap19.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet18 = multiShortestPathTree17.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree17.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree21.stateSets;
        int int23 = multiShortestPathTree21.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap24 = multiShortestPathTree21.stateSets;
        multiShortestPathTree17.stateSets = vertexMap24;
        multiShortestPathTree1.stateSets = vertexMap24;
        org.opentripplanner.routing.core.RoutingRequest routingRequest27 = multiShortestPathTree1.getOptions();
        int int28 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex29 = null;
        org.opentripplanner.routing.core.State state30 = multiShortestPathTree1.getState(vertex29);
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
        org.junit.Assert.assertNotNull(vertexSet18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state30);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = routingRequest11.getClass();
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
        org.junit.Assert.assertNotNull(vertexSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest11);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, false);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, false);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList17 = multiShortestPathTree1.getStates(vertex16);
        java.lang.Class<?> wildcardClass18 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList6 = multiShortestPathTree1.getStates(vertex5);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
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
        org.opentripplanner.routing.core.State state23 = null;
        multiShortestPathTree1.postVisit(state23);
        org.opentripplanner.routing.graph.Vertex vertex25 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList27 = multiShortestPathTree1.getPaths(vertex25, false);
        org.opentripplanner.routing.core.State state28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = multiShortestPathTree1.add(state28);
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
        org.junit.Assert.assertNull(routingRequest7);
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
        org.junit.Assert.assertNotNull(graphPathList27);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths(vertex16, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection20 = multiShortestPathTree1.getAllStates();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection20);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, true);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest14);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath8 = multiShortestPathTree1.getPath(vertex6, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, false);
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
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath13);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
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
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree1.getPath(vertex15, true);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath17);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, false);
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
        org.junit.Assert.assertNotNull(vertexSet11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath14);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection14 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        int int17 = multiShortestPathTree16.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree16.stateSets;
        multiShortestPathTree1.stateSets = vertexMap18;
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree1.options;
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
        org.junit.Assert.assertNotNull(stateCollection14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest20);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
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
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree18 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest17);
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList20 = multiShortestPathTree18.getStates(vertex19);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = multiShortestPathTree18.stateSets;
        multiShortestPathTree16.stateSets = vertexMap21;
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = multiShortestPathTree16.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet24 = multiShortestPathTree16.getVertices();
        int int25 = multiShortestPathTree16.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex26 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath28 = multiShortestPathTree16.getPath(vertex26, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest29 = multiShortestPathTree16.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap30 = multiShortestPathTree16.stateSets;
        multiShortestPathTree1.stateSets = vertexMap30;
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
        org.junit.Assert.assertNull(state14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap30);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList14);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest7);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree10.getStates(vertex11);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap13 = multiShortestPathTree10.stateSets;
        multiShortestPathTree8.stateSets = vertexMap13;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree8.stateSets;
        multiShortestPathTree1.stateSets = vertexMap15;
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree18 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest17);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree18.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree18.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = multiShortestPathTree18.stateSets;
        multiShortestPathTree1.stateSets = vertexMap21;
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        org.opentripplanner.routing.core.State state24 = multiShortestPathTree1.getState(vertex23);
        org.opentripplanner.routing.core.State state25 = null;
        multiShortestPathTree1.postVisit(state25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state24);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
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
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.core.State state15 = multiShortestPathTree1.getState(vertex14);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        java.lang.String str17 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.core.State state19 = multiShortestPathTree1.getState(vertex18);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection20 = multiShortestPathTree1.getAllStates();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "MultiSPT(0 vertices)" + "'", str17.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection20);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath9 = multiShortestPathTree1.getPath(vertex7, true);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree13 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest12);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree13.stateSets;
        java.lang.String str15 = multiShortestPathTree13.toString();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath18 = multiShortestPathTree13.getPath(vertex16, false);
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList21 = multiShortestPathTree13.getPaths(vertex19, false);
        int int22 = multiShortestPathTree13.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap23 = multiShortestPathTree13.stateSets;
        multiShortestPathTree1.stateSets = vertexMap23;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection25 = multiShortestPathTree1.getAllStates();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList26 = multiShortestPathTree1.getPaths();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection25);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, true);
        int int9 = multiShortestPathTree1.getVertexCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
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
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        java.lang.String str10 = multiShortestPathTree1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "MultiSPT(0 vertices)" + "'", str10.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        int int9 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        java.lang.String str12 = multiShortestPathTree1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest7);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree10.getStates(vertex11);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap13 = multiShortestPathTree10.stateSets;
        multiShortestPathTree8.stateSets = vertexMap13;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree8.stateSets;
        multiShortestPathTree1.stateSets = vertexMap15;
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree18 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest17);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree18.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree18.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = multiShortestPathTree18.stateSets;
        multiShortestPathTree1.stateSets = vertexMap21;
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree24 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest23);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap25 = multiShortestPathTree24.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex26 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath28 = multiShortestPathTree24.getPath(vertex26, false);
        int int29 = multiShortestPathTree24.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest30 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree31 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest30);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap32 = multiShortestPathTree31.stateSets;
        int int33 = multiShortestPathTree31.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex34 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList36 = multiShortestPathTree31.getPaths(vertex34, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap37 = multiShortestPathTree31.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap38 = multiShortestPathTree31.stateSets;
        multiShortestPathTree24.stateSets = vertexMap38;
        multiShortestPathTree1.stateSets = vertexMap38;
        org.opentripplanner.routing.core.RoutingRequest routingRequest41 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree42 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest41);
        org.opentripplanner.routing.graph.Vertex vertex43 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList44 = multiShortestPathTree42.getStates(vertex43);
        java.lang.String str45 = multiShortestPathTree42.toString();
        org.opentripplanner.routing.graph.Vertex vertex46 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList47 = multiShortestPathTree42.getStates(vertex46);
        java.lang.String str48 = multiShortestPathTree42.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap49 = multiShortestPathTree42.stateSets;
        multiShortestPathTree1.stateSets = vertexMap49;
        org.opentripplanner.routing.core.State state51 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = multiShortestPathTree1.add(state51);
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
        org.junit.Assert.assertNull(stateList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "MultiSPT(0 vertices)" + "'", str45.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "MultiSPT(0 vertices)" + "'", str48.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap49);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath8 = multiShortestPathTree1.getPath(vertex6, true);
        java.lang.Class<?> wildcardClass9 = multiShortestPathTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
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
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList17 = multiShortestPathTree1.getStates(vertex16);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList17);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest12);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
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
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree1.getStates(vertex13);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths(vertex15, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection18 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath21 = multiShortestPathTree1.getPath(vertex19, false);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath21);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
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
        org.opentripplanner.routing.graph.Vertex vertex30 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList32 = multiShortestPathTree1.getPaths(vertex30, true);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList32);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths();
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
        org.junit.Assert.assertNull(routingRequest9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest12);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree11 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree11.getStates(vertex12);
        java.lang.String str14 = multiShortestPathTree11.toString();
        org.opentripplanner.routing.core.State state15 = null;
        multiShortestPathTree11.postVisit(state15);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree18 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest17);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap19 = multiShortestPathTree18.stateSets;
        multiShortestPathTree11.stateSets = vertexMap19;
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        org.opentripplanner.routing.core.State state22 = multiShortestPathTree11.getState(vertex21);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap23 = multiShortestPathTree11.stateSets;
        multiShortestPathTree1.stateSets = vertexMap23;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection25 = multiShortestPathTree1.getAllStates();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection25);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap12 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap16 = multiShortestPathTree1.stateSets;
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
        org.junit.Assert.assertNotNull(graphPathList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap16);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = multiShortestPathTree1.visit(state14);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection13);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap17 = multiShortestPathTree16.stateSets;
        int int18 = multiShortestPathTree16.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap19 = multiShortestPathTree16.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree16.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList23 = multiShortestPathTree16.getPaths(vertex21, false);
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList26 = multiShortestPathTree16.getPaths(vertex24, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap27 = multiShortestPathTree16.stateSets;
        multiShortestPathTree1.stateSets = vertexMap27;
        java.lang.Class<?> wildcardClass29 = vertexMap27.getClass();
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
        org.junit.Assert.assertNull(routingRequest10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, true);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree1.getStates(vertex11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state14);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.core.State state6 = multiShortestPathTree1.getState(vertex5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath9 = multiShortestPathTree1.getPath(vertex7, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath9);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
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
        java.lang.String str14 = multiShortestPathTree1.toString();
        int int15 = multiShortestPathTree1.getVertexCount();
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath10);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree17.stateSets;
        int int19 = multiShortestPathTree17.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList22 = multiShortestPathTree17.getPaths(vertex20, true);
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList25 = multiShortestPathTree17.getPaths(vertex23, false);
        org.opentripplanner.routing.graph.Vertex vertex26 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList27 = multiShortestPathTree17.getStates(vertex26);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet28 = multiShortestPathTree17.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest29 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree30 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest29);
        org.opentripplanner.routing.core.RoutingRequest routingRequest31 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree32 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest31);
        org.opentripplanner.routing.graph.Vertex vertex33 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList34 = multiShortestPathTree32.getStates(vertex33);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap35 = multiShortestPathTree32.stateSets;
        multiShortestPathTree30.stateSets = vertexMap35;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap37 = multiShortestPathTree30.stateSets;
        multiShortestPathTree17.stateSets = vertexMap37;
        org.opentripplanner.routing.core.RoutingRequest routingRequest39 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree40 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest39);
        org.opentripplanner.routing.graph.Vertex vertex41 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList42 = multiShortestPathTree40.getStates(vertex41);
        org.opentripplanner.routing.graph.Vertex vertex43 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList44 = multiShortestPathTree40.getStates(vertex43);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap45 = multiShortestPathTree40.stateSets;
        multiShortestPathTree17.stateSets = vertexMap45;
        multiShortestPathTree1.stateSets = vertexMap45;
        org.opentripplanner.routing.core.RoutingRequest routingRequest48 = multiShortestPathTree1.getOptions();
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
        org.junit.Assert.assertNull(routingRequest15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest48);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
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
        java.lang.String str15 = multiShortestPathTree1.toString();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
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
        multiShortestPathTree1.postVisit(state10);
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
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest7);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree10.getStates(vertex11);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap13 = multiShortestPathTree10.stateSets;
        multiShortestPathTree8.stateSets = vertexMap13;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree8.stateSets;
        multiShortestPathTree1.stateSets = vertexMap15;
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree18 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest17);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree18.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree18.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = multiShortestPathTree18.stateSets;
        multiShortestPathTree1.stateSets = vertexMap21;
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree24 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest23);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap25 = multiShortestPathTree24.stateSets;
        int int26 = multiShortestPathTree24.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex27 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList29 = multiShortestPathTree24.getPaths(vertex27, true);
        org.opentripplanner.routing.graph.Vertex vertex30 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList32 = multiShortestPathTree24.getPaths(vertex30, false);
        org.opentripplanner.routing.graph.Vertex vertex33 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList34 = multiShortestPathTree24.getStates(vertex33);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet35 = multiShortestPathTree24.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest36 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree37 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest36);
        org.opentripplanner.routing.core.RoutingRequest routingRequest38 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree39 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest38);
        org.opentripplanner.routing.graph.Vertex vertex40 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList41 = multiShortestPathTree39.getStates(vertex40);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap42 = multiShortestPathTree39.stateSets;
        multiShortestPathTree37.stateSets = vertexMap42;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap44 = multiShortestPathTree37.stateSets;
        multiShortestPathTree24.stateSets = vertexMap44;
        multiShortestPathTree1.stateSets = vertexMap44;
        org.opentripplanner.routing.core.RoutingRequest routingRequest47 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree48 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest47);
        org.opentripplanner.routing.graph.Vertex vertex49 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList50 = multiShortestPathTree48.getStates(vertex49);
        org.opentripplanner.routing.graph.Vertex vertex51 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList52 = multiShortestPathTree48.getStates(vertex51);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap53 = multiShortestPathTree48.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest54 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree55 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest54);
        org.opentripplanner.routing.core.RoutingRequest routingRequest56 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree57 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest56);
        org.opentripplanner.routing.graph.Vertex vertex58 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList59 = multiShortestPathTree57.getStates(vertex58);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap60 = multiShortestPathTree57.stateSets;
        multiShortestPathTree55.stateSets = vertexMap60;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap62 = multiShortestPathTree55.stateSets;
        multiShortestPathTree48.stateSets = vertexMap62;
        org.opentripplanner.routing.core.RoutingRequest routingRequest64 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree65 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest64);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet66 = multiShortestPathTree65.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest67 = multiShortestPathTree65.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap68 = multiShortestPathTree65.stateSets;
        multiShortestPathTree48.stateSets = vertexMap68;
        org.opentripplanner.routing.core.RoutingRequest routingRequest70 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree71 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest70);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap72 = multiShortestPathTree71.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex73 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath75 = multiShortestPathTree71.getPath(vertex73, false);
        int int76 = multiShortestPathTree71.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest77 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree78 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest77);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap79 = multiShortestPathTree78.stateSets;
        int int80 = multiShortestPathTree78.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex81 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList83 = multiShortestPathTree78.getPaths(vertex81, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap84 = multiShortestPathTree78.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap85 = multiShortestPathTree78.stateSets;
        multiShortestPathTree71.stateSets = vertexMap85;
        multiShortestPathTree48.stateSets = vertexMap85;
        org.opentripplanner.routing.core.RoutingRequest routingRequest88 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree89 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest88);
        org.opentripplanner.routing.graph.Vertex vertex90 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList91 = multiShortestPathTree89.getStates(vertex90);
        java.lang.String str92 = multiShortestPathTree89.toString();
        org.opentripplanner.routing.graph.Vertex vertex93 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList94 = multiShortestPathTree89.getStates(vertex93);
        java.lang.String str95 = multiShortestPathTree89.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap96 = multiShortestPathTree89.stateSets;
        multiShortestPathTree48.stateSets = vertexMap96;
        multiShortestPathTree1.stateSets = vertexMap96;
        org.opentripplanner.routing.core.RoutingRequest routingRequest99 = multiShortestPathTree1.getOptions();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str92 + "' != '" + "MultiSPT(0 vertices)" + "'", str92.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str95 + "' != '" + "MultiSPT(0 vertices)" + "'", str95.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest99);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
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
        org.opentripplanner.routing.graph.Vertex vertex27 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList29 = multiShortestPathTree1.getPaths(vertex27, true);
        int int30 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state31 = null;
        multiShortestPathTree1.postVisit(state31);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap33 = multiShortestPathTree1.stateSets;
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
        org.junit.Assert.assertNotNull(graphPathList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap33);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList6 = multiShortestPathTree1.getStates(vertex5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.core.State state8 = multiShortestPathTree1.getState(vertex7);
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest9);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
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
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, true);
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        org.opentripplanner.routing.core.State state15 = null;
        multiShortestPathTree1.postVisit(state15);
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList19 = multiShortestPathTree1.getPaths(vertex17, true);
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList21 = multiShortestPathTree1.getStates(vertex20);
        org.opentripplanner.routing.core.State state22 = null;
        multiShortestPathTree1.postVisit(state22);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap24 = multiShortestPathTree1.stateSets;
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
        org.junit.Assert.assertNotNull(graphPathList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap24);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
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
        multiShortestPathTree1.postVisit(state12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree1.getPath(vertex15, false);
        org.opentripplanner.routing.core.State state18 = null;
        multiShortestPathTree1.postVisit(state18);
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
        org.junit.Assert.assertNull(routingRequest14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath17);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = null;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree12 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree12.getStates(vertex13);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree12.stateSets;
        multiShortestPathTree10.stateSets = vertexMap15;
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree10.getPath(vertex17, false);
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList22 = multiShortestPathTree10.getPaths(vertex20, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet23 = multiShortestPathTree10.getVertices();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap24 = multiShortestPathTree10.stateSets;
        multiShortestPathTree1.stateSets = vertexMap24;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap24);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection7);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
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
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap17 = multiShortestPathTree1.stateSets;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap17);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap11 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList16 = multiShortestPathTree1.getStates(vertex15);
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
        org.junit.Assert.assertNull(routingRequest10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList16);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
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
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        int int15 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree17.stateSets;
        int int19 = multiShortestPathTree17.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList22 = multiShortestPathTree17.getPaths(vertex20, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap23 = multiShortestPathTree17.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap24 = multiShortestPathTree17.stateSets;
        multiShortestPathTree1.stateSets = vertexMap24;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet26 = multiShortestPathTree1.getVertices();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet26);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection12);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest10);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
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
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection14 = multiShortestPathTree1.getAllStates();
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
        org.junit.Assert.assertNotNull(stateCollection14);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet11);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
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
        org.opentripplanner.routing.graph.Vertex vertex27 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList28 = multiShortestPathTree1.getStates(vertex27);
        org.opentripplanner.routing.core.RoutingRequest routingRequest29 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex30 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList32 = multiShortestPathTree1.getPaths(vertex30, false);
        int int33 = multiShortestPathTree1.getVertexCount();
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
        org.junit.Assert.assertNull(stateList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
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
        multiShortestPathTree1.postVisit(state28);
        org.opentripplanner.routing.core.RoutingRequest routingRequest30 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList31 = multiShortestPathTree1.getPaths();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest30);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
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
        org.junit.Assert.assertNotNull(stateCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection12);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        java.lang.String str11 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state14);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree9.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree9.getPath(vertex11, false);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree9.getStates(vertex14);
        int int16 = multiShortestPathTree9.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree18 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest17);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree20 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest19);
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList22 = multiShortestPathTree20.getStates(vertex21);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap23 = multiShortestPathTree20.stateSets;
        multiShortestPathTree18.stateSets = vertexMap23;
        org.opentripplanner.routing.core.RoutingRequest routingRequest25 = multiShortestPathTree18.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet26 = multiShortestPathTree18.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex27 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList28 = multiShortestPathTree18.getStates(vertex27);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet29 = multiShortestPathTree18.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest30 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree31 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest30);
        org.opentripplanner.routing.graph.Vertex vertex32 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList33 = multiShortestPathTree31.getStates(vertex32);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap34 = multiShortestPathTree31.stateSets;
        multiShortestPathTree18.stateSets = vertexMap34;
        multiShortestPathTree9.stateSets = vertexMap34;
        multiShortestPathTree1.stateSets = vertexMap34;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet38 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest39 = multiShortestPathTree1.options;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest39);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.core.State state6 = multiShortestPathTree1.getState(vertex5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.options;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths();
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
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest10);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.core.State state15 = multiShortestPathTree1.getState(vertex14);
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
        org.junit.Assert.assertNull(routingRequest12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state15);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet18 = multiShortestPathTree17.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree17.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree21.stateSets;
        int int23 = multiShortestPathTree21.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap24 = multiShortestPathTree21.stateSets;
        multiShortestPathTree17.stateSets = vertexMap24;
        multiShortestPathTree1.stateSets = vertexMap24;
        org.opentripplanner.routing.core.RoutingRequest routingRequest27 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree28 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest27);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap29 = multiShortestPathTree28.stateSets;
        java.lang.String str30 = multiShortestPathTree28.toString();
        org.opentripplanner.routing.graph.Vertex vertex31 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath33 = multiShortestPathTree28.getPath(vertex31, false);
        org.opentripplanner.routing.graph.Vertex vertex34 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList36 = multiShortestPathTree28.getPaths(vertex34, false);
        org.opentripplanner.routing.graph.Vertex vertex37 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath39 = multiShortestPathTree28.getPath(vertex37, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest40 = multiShortestPathTree28.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest41 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree42 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest41);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet43 = multiShortestPathTree42.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest44 = multiShortestPathTree42.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap45 = multiShortestPathTree42.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex46 = null;
        org.opentripplanner.routing.core.State state47 = multiShortestPathTree42.getState(vertex46);
        org.opentripplanner.routing.graph.Vertex vertex48 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList50 = multiShortestPathTree42.getPaths(vertex48, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap51 = multiShortestPathTree42.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap52 = multiShortestPathTree42.stateSets;
        multiShortestPathTree28.stateSets = vertexMap52;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap54 = multiShortestPathTree28.stateSets;
        multiShortestPathTree1.stateSets = vertexMap54;
        int int56 = multiShortestPathTree1.getVertexCount();
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
        org.junit.Assert.assertNotNull(vertexSet18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "MultiSPT(0 vertices)" + "'", str30.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state15 = null;
        multiShortestPathTree1.postVisit(state15);
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList18 = multiShortestPathTree1.getStates(vertex17);
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
        org.junit.Assert.assertNull(stateList18);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection14 = multiShortestPathTree1.getAllStates();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection14);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        int int10 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap11 = multiShortestPathTree1.stateSets;
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
        org.junit.Assert.assertNotNull(vertexMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        java.lang.String str9 = multiShortestPathTree1.toString();
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
        org.junit.Assert.assertNotNull(vertexSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet10);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
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
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
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
        org.junit.Assert.assertNotNull(vertexSet11);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
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
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
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
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList16 = multiShortestPathTree1.getStates(vertex15);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList16);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
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
        java.lang.String str14 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state15 = null;
        multiShortestPathTree1.postVisit(state15);
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.getOptions();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest17);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap24 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet25 = multiShortestPathTree1.getVertices();
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
        org.junit.Assert.assertNull(routingRequest23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet25);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
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
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        int int13 = multiShortestPathTree1.getVertexCount();
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
        org.junit.Assert.assertNotNull(stateCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection7);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
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
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, true);
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        org.opentripplanner.routing.core.State state15 = null;
        multiShortestPathTree1.postVisit(state15);
        int int17 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = multiShortestPathTree1.add(state19);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest18);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
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
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList18 = multiShortestPathTree1.getStates(vertex17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList19 = multiShortestPathTree1.getPaths();
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
        org.junit.Assert.assertNull(routingRequest16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList18);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state15 = null;
        multiShortestPathTree1.postVisit(state15);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection17 = multiShortestPathTree1.getAllStates();
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
        org.junit.Assert.assertNotNull(stateCollection17);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
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
        org.junit.Assert.assertNotNull(vertexSet13);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
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
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        org.opentripplanner.routing.core.State state16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = multiShortestPathTree1.add(state16);
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
        org.junit.Assert.assertNull(stateList15);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths(vertex12, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
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
        org.junit.Assert.assertNull(routingRequest9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest15);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
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
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree1.stateSets;
        int int15 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state16 = null;
        multiShortestPathTree1.postVisit(state16);
        org.opentripplanner.routing.core.State state18 = null;
        multiShortestPathTree1.postVisit(state18);
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
        org.junit.Assert.assertNotNull(vertexMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
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
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        org.opentripplanner.routing.core.State state23 = multiShortestPathTree1.getState(vertex22);
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath26 = multiShortestPathTree1.getPath(vertex24, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest27 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree28 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest27);
        org.opentripplanner.routing.graph.Vertex vertex29 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList30 = multiShortestPathTree28.getStates(vertex29);
        org.opentripplanner.routing.graph.Vertex vertex31 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList32 = multiShortestPathTree28.getStates(vertex31);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap33 = multiShortestPathTree28.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest34 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree35 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest34);
        org.opentripplanner.routing.core.RoutingRequest routingRequest36 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree37 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest36);
        org.opentripplanner.routing.graph.Vertex vertex38 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList39 = multiShortestPathTree37.getStates(vertex38);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap40 = multiShortestPathTree37.stateSets;
        multiShortestPathTree35.stateSets = vertexMap40;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap42 = multiShortestPathTree35.stateSets;
        multiShortestPathTree28.stateSets = vertexMap42;
        org.opentripplanner.routing.core.RoutingRequest routingRequest44 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree45 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest44);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet46 = multiShortestPathTree45.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest47 = multiShortestPathTree45.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap48 = multiShortestPathTree45.stateSets;
        multiShortestPathTree28.stateSets = vertexMap48;
        org.opentripplanner.routing.core.RoutingRequest routingRequest50 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree51 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest50);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap52 = multiShortestPathTree51.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex53 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath55 = multiShortestPathTree51.getPath(vertex53, false);
        int int56 = multiShortestPathTree51.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest57 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree58 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest57);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap59 = multiShortestPathTree58.stateSets;
        int int60 = multiShortestPathTree58.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex61 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList63 = multiShortestPathTree58.getPaths(vertex61, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap64 = multiShortestPathTree58.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap65 = multiShortestPathTree58.stateSets;
        multiShortestPathTree51.stateSets = vertexMap65;
        multiShortestPathTree28.stateSets = vertexMap65;
        org.opentripplanner.routing.core.RoutingRequest routingRequest68 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree69 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest68);
        org.opentripplanner.routing.graph.Vertex vertex70 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList71 = multiShortestPathTree69.getStates(vertex70);
        java.lang.String str72 = multiShortestPathTree69.toString();
        org.opentripplanner.routing.graph.Vertex vertex73 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList74 = multiShortestPathTree69.getStates(vertex73);
        java.lang.String str75 = multiShortestPathTree69.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap76 = multiShortestPathTree69.stateSets;
        multiShortestPathTree28.stateSets = vertexMap76;
        multiShortestPathTree1.stateSets = vertexMap76;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet79 = multiShortestPathTree1.getVertices();
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
        org.junit.Assert.assertNull(state23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "MultiSPT(0 vertices)" + "'", str72.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "MultiSPT(0 vertices)" + "'", str75.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet79);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
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
        org.opentripplanner.routing.core.State state45 = null;
        multiShortestPathTree1.postVisit(state45);
        org.opentripplanner.routing.graph.Vertex vertex47 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList49 = multiShortestPathTree1.getPaths(vertex47, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest50 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree51 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest50);
        org.opentripplanner.routing.graph.Vertex vertex52 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList53 = multiShortestPathTree51.getStates(vertex52);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap54 = multiShortestPathTree51.stateSets;
        org.opentripplanner.routing.core.State state55 = null;
        multiShortestPathTree51.postVisit(state55);
        org.opentripplanner.routing.graph.Vertex vertex57 = null;
        org.opentripplanner.routing.core.State state58 = multiShortestPathTree51.getState(vertex57);
        org.opentripplanner.routing.graph.Vertex vertex59 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList61 = multiShortestPathTree51.getPaths(vertex59, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap62 = multiShortestPathTree51.stateSets;
        multiShortestPathTree1.stateSets = vertexMap62;
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
        org.junit.Assert.assertNotNull(graphPathList49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap62);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, false);
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
        org.junit.Assert.assertNull(graphPath13);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, false);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree1.getStates(vertex11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList12);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
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
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree1.getPath(vertex15, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.options;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest18);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
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
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.core.State state15 = multiShortestPathTree1.getState(vertex14);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths(vertex16, true);
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
        org.junit.Assert.assertNull(state15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList18);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        int int10 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree1.getStates(vertex11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList12);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
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
        org.opentripplanner.routing.core.State state23 = null;
        multiShortestPathTree1.postVisit(state23);
        java.lang.String str25 = multiShortestPathTree1.toString();
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
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "MultiSPT(0 vertices)" + "'", str25.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree3.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap9);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        int int6 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths(vertex12, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree1.getAllStates();
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
        org.junit.Assert.assertNull(routingRequest9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection15);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths(vertex14, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap17 = multiShortestPathTree1.stateSets;
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
        org.junit.Assert.assertNull(routingRequest13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap17);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest31 = multiShortestPathTree1.getOptions();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest31);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree1.getStates(vertex13);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths(vertex15, false);
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
        org.junit.Assert.assertNull(stateList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList17);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
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
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, true);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, true);
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
        org.junit.Assert.assertNotNull(graphPathList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath15);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
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
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree15 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest14);
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList19 = multiShortestPathTree17.getStates(vertex18);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap20 = multiShortestPathTree17.stateSets;
        multiShortestPathTree15.stateSets = vertexMap20;
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = multiShortestPathTree15.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet23 = multiShortestPathTree15.getVertices();
        int int24 = multiShortestPathTree15.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap25 = multiShortestPathTree15.stateSets;
        multiShortestPathTree1.stateSets = vertexMap25;
        org.opentripplanner.routing.graph.Vertex vertex27 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath29 = multiShortestPathTree1.getPath(vertex27, true);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath29);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
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
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.add(state15);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList14);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
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
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection14 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        int int17 = multiShortestPathTree16.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree16.stateSets;
        multiShortestPathTree1.stateSets = vertexMap18;
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath22 = multiShortestPathTree1.getPath(vertex20, false);
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
        org.junit.Assert.assertNotNull(stateCollection14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath22);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
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
        org.junit.Assert.assertNull(state11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
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
        org.junit.Assert.assertNull(graphPath6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest13);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths(vertex15, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree19 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest18);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap20 = multiShortestPathTree19.stateSets;
        java.lang.String str21 = multiShortestPathTree19.toString();
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath24 = multiShortestPathTree19.getPath(vertex22, false);
        org.opentripplanner.routing.graph.Vertex vertex25 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList27 = multiShortestPathTree19.getPaths(vertex25, false);
        org.opentripplanner.routing.graph.Vertex vertex28 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList29 = multiShortestPathTree19.getStates(vertex28);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet30 = multiShortestPathTree19.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection31 = multiShortestPathTree19.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex32 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath34 = multiShortestPathTree19.getPath(vertex32, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap35 = multiShortestPathTree19.stateSets;
        multiShortestPathTree1.stateSets = vertexMap35;
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
        org.junit.Assert.assertNotNull(graphPathList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "MultiSPT(0 vertices)" + "'", str21.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap35);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        java.lang.String str7 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        java.lang.String str10 = multiShortestPathTree1.toString();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "MultiSPT(0 vertices)" + "'", str10.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet8);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
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
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, true);
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
        org.junit.Assert.assertNotNull(stateCollection12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath16);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        int int6 = multiShortestPathTree1.getVertexCount();
        java.lang.String str7 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList6 = multiShortestPathTree1.getStates(vertex5);
        java.lang.String str7 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList10 = multiShortestPathTree1.getStates(vertex9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree12 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree12.getStates(vertex13);
        java.lang.String str15 = multiShortestPathTree12.toString();
        org.opentripplanner.routing.core.State state16 = null;
        multiShortestPathTree12.postVisit(state16);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree12.stateSets;
        multiShortestPathTree1.stateSets = vertexMap18;
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath22 = multiShortestPathTree1.getPath(vertex20, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath22);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
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
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree1.getStates(vertex13);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
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
        org.junit.Assert.assertNull(stateList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest15);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
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
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet6 = multiShortestPathTree1.getVertices();
        java.lang.String str7 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree11 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree11.getStates(vertex12);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree11.stateSets;
        multiShortestPathTree1.stateSets = vertexMap14;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap16 = multiShortestPathTree1.stateSets;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap16);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
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
        int int14 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree1.stateSets;
        int int16 = multiShortestPathTree1.getVertexCount();
        int int17 = multiShortestPathTree1.getVertexCount();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
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
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap17 = multiShortestPathTree16.stateSets;
        int int18 = multiShortestPathTree16.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap19 = multiShortestPathTree16.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree16.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        org.opentripplanner.routing.core.State state22 = multiShortestPathTree16.getState(vertex21);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap23 = multiShortestPathTree16.stateSets;
        multiShortestPathTree1.stateSets = vertexMap23;
        org.opentripplanner.routing.graph.Vertex vertex25 = null;
        org.opentripplanner.routing.core.State state26 = multiShortestPathTree1.getState(vertex25);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet27 = multiShortestPathTree1.getVertices();
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
        org.junit.Assert.assertNotNull(vertexMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet27);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, true);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths(vertex12, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.core.State state18 = multiShortestPathTree1.getState(vertex17);
        java.lang.String str19 = multiShortestPathTree1.toString();
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
        org.junit.Assert.assertNotNull(graphPathList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "MultiSPT(0 vertices)" + "'", str19.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest5);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.options;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest10);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
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
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.core.State state16 = multiShortestPathTree1.getState(vertex15);
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
        org.junit.Assert.assertNull(routingRequest14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state16);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.core.State state8 = multiShortestPathTree1.getState(vertex7);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        int int11 = multiShortestPathTree10.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap12 = multiShortestPathTree10.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest13);
        java.lang.String str15 = multiShortestPathTree14.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap16 = multiShortestPathTree14.stateSets;
        multiShortestPathTree10.stateSets = vertexMap16;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree10.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree20 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest19);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = multiShortestPathTree20.stateSets;
        java.lang.String str22 = multiShortestPathTree20.toString();
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath25 = multiShortestPathTree20.getPath(vertex23, false);
        org.opentripplanner.routing.graph.Vertex vertex26 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList28 = multiShortestPathTree20.getPaths(vertex26, false);
        int int29 = multiShortestPathTree20.getVertexCount();
        org.opentripplanner.routing.core.State state30 = null;
        multiShortestPathTree20.postVisit(state30);
        org.opentripplanner.routing.core.State state32 = null;
        multiShortestPathTree20.postVisit(state32);
        org.opentripplanner.routing.core.RoutingRequest routingRequest34 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree35 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest34);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap36 = multiShortestPathTree35.stateSets;
        int int37 = multiShortestPathTree35.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap38 = multiShortestPathTree35.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest39 = multiShortestPathTree35.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex40 = null;
        org.opentripplanner.routing.core.State state41 = multiShortestPathTree35.getState(vertex40);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap42 = multiShortestPathTree35.stateSets;
        multiShortestPathTree20.stateSets = vertexMap42;
        multiShortestPathTree10.stateSets = vertexMap42;
        multiShortestPathTree1.stateSets = vertexMap42;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet46 = multiShortestPathTree1.getVertices();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "MultiSPT(0 vertices)" + "'", str22.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet46);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath8 = multiShortestPathTree1.getPath(vertex6, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.options;
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
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
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
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree1.postVisit(state12);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = stateList15.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList15);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, true);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree1.getStates(vertex13);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.core.State state16 = multiShortestPathTree1.getState(vertex15);
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
        org.junit.Assert.assertNull(stateList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state16);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath7);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
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
        int int21 = multiShortestPathTree1.getVertexCount();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath8 = multiShortestPathTree1.getPath(vertex6, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree1.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
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
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList13);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
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
        java.lang.String str10 = multiShortestPathTree1.toString();
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
        org.junit.Assert.assertNull(routingRequest7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "MultiSPT(0 vertices)" + "'", str10.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        java.lang.String str11 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree1.postVisit(state12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath9 = multiShortestPathTree1.getPath(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, false);
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath18 = multiShortestPathTree1.getPath(vertex16, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath18);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath8 = multiShortestPathTree1.getPath(vertex6, true);
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree12 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree12.getStates(vertex13);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList16 = multiShortestPathTree12.getStates(vertex15);
        int int17 = multiShortestPathTree12.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree12.stateSets;
        java.lang.String str19 = multiShortestPathTree12.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree12.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = multiShortestPathTree12.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree12.stateSets;
        multiShortestPathTree1.stateSets = vertexMap22;
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        org.opentripplanner.routing.core.State state25 = multiShortestPathTree1.getState(vertex24);
        java.lang.String str26 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex27 = null;
        org.opentripplanner.routing.core.State state28 = multiShortestPathTree1.getState(vertex27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "MultiSPT(0 vertices)" + "'", str19.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "MultiSPT(0 vertices)" + "'", str26.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state28);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree15 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest14);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree15.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree15.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree15.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        org.opentripplanner.routing.core.State state20 = multiShortestPathTree15.getState(vertex19);
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList23 = multiShortestPathTree15.getPaths(vertex21, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap24 = multiShortestPathTree15.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap25 = multiShortestPathTree15.stateSets;
        multiShortestPathTree1.stateSets = vertexMap25;
        org.opentripplanner.routing.core.RoutingRequest routingRequest27 = multiShortestPathTree1.getOptions();
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
        org.junit.Assert.assertNotNull(vertexSet16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest27);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
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
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, true);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList16 = multiShortestPathTree1.getStates(vertex15);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection17 = multiShortestPathTree1.getAllStates();
        int int18 = multiShortestPathTree1.getVertexCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList13);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
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
        org.opentripplanner.routing.core.State state15 = multiShortestPathTree1.getState(vertex14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state15);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
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
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree1.getStates(vertex11);
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest13);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree14.stateSets;
        int int16 = multiShortestPathTree14.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList19 = multiShortestPathTree14.getPaths(vertex17, true);
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList22 = multiShortestPathTree14.getPaths(vertex20, false);
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList24 = multiShortestPathTree14.getStates(vertex23);
        org.opentripplanner.routing.core.State state25 = null;
        multiShortestPathTree14.postVisit(state25);
        int int27 = multiShortestPathTree14.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap28 = multiShortestPathTree14.stateSets;
        multiShortestPathTree1.stateSets = vertexMap28;
        java.lang.String str30 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest31 = multiShortestPathTree1.getOptions();
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
        org.junit.Assert.assertNull(stateList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "MultiSPT(0 vertices)" + "'", str30.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest31);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON = 10.0f;
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
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
        int int14 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath18 = multiShortestPathTree1.getPath(vertex16, false);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath18);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
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
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        int int13 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
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
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet29 = multiShortestPathTree1.getVertices();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet29);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        int int3 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        int int9 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree1.stateSets;
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
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap10);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
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
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        java.lang.String str16 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection17 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.getOptions();
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest18);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest30 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree31 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest30);
        org.opentripplanner.routing.graph.Vertex vertex32 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList33 = multiShortestPathTree31.getStates(vertex32);
        org.opentripplanner.routing.graph.Vertex vertex34 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList35 = multiShortestPathTree31.getStates(vertex34);
        org.opentripplanner.routing.graph.Vertex vertex36 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList37 = multiShortestPathTree31.getStates(vertex36);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet38 = multiShortestPathTree31.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest39 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree40 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest39);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet41 = multiShortestPathTree40.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest42 = multiShortestPathTree40.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap43 = multiShortestPathTree40.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex44 = null;
        org.opentripplanner.routing.core.State state45 = multiShortestPathTree40.getState(vertex44);
        org.opentripplanner.routing.graph.Vertex vertex46 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList48 = multiShortestPathTree40.getPaths(vertex46, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap49 = multiShortestPathTree40.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap50 = multiShortestPathTree40.stateSets;
        multiShortestPathTree31.stateSets = vertexMap50;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap52 = multiShortestPathTree31.stateSets;
        multiShortestPathTree1.stateSets = vertexMap52;
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
        org.junit.Assert.assertNull(stateList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap52);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList6 = multiShortestPathTree1.getStates(vertex5);
        java.lang.String str7 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree10.getStates(vertex11);
        java.lang.String str13 = multiShortestPathTree10.toString();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree10.getStates(vertex14);
        java.lang.String str16 = multiShortestPathTree10.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap17 = multiShortestPathTree10.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList19 = multiShortestPathTree10.getStates(vertex18);
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList23 = multiShortestPathTree21.getStates(vertex22);
        java.lang.String str24 = multiShortestPathTree21.toString();
        org.opentripplanner.routing.core.State state25 = null;
        multiShortestPathTree21.postVisit(state25);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap27 = multiShortestPathTree21.stateSets;
        multiShortestPathTree10.stateSets = vertexMap27;
        multiShortestPathTree1.stateSets = vertexMap27;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection30 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest31 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap32 = multiShortestPathTree1.stateSets;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "MultiSPT(0 vertices)" + "'", str24.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap32);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
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
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, true);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, false);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath16);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        int int7 = multiShortestPathTree1.getVertexCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.options;
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
        org.junit.Assert.assertNull(routingRequest19);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection11 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        int int13 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree1.stateSets;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap14);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest28 = multiShortestPathTree1.getOptions();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest28);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet18 = multiShortestPathTree17.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree17.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree21.stateSets;
        int int23 = multiShortestPathTree21.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap24 = multiShortestPathTree21.stateSets;
        multiShortestPathTree17.stateSets = vertexMap24;
        multiShortestPathTree1.stateSets = vertexMap24;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection27 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet28 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex29 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath31 = multiShortestPathTree1.getPath(vertex29, false);
        org.opentripplanner.routing.core.State state32 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = multiShortestPathTree1.visit(state32);
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
        org.junit.Assert.assertNotNull(vertexSet18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath31);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.getOptions();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest12);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree1.postVisit(state12);
        int int14 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree1.stateSets;
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
        org.junit.Assert.assertNull(state11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap15);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList6 = multiShortestPathTree1.getStates(vertex5);
        java.lang.String str7 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList10 = multiShortestPathTree1.getStates(vertex9);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, false);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        java.lang.String str16 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree1.postVisit(state17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath9 = multiShortestPathTree1.getPath(vertex7, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree11 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree11.getStates(vertex12);
        java.lang.String str14 = multiShortestPathTree11.toString();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree11.getPath(vertex15, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection18 = multiShortestPathTree11.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection19 = multiShortestPathTree11.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap20 = multiShortestPathTree11.stateSets;
        multiShortestPathTree1.stateSets = vertexMap20;
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList24 = multiShortestPathTree1.getPaths(vertex22, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList24);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList6 = multiShortestPathTree1.getStates(vertex5);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        int int8 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet9);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
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
        int int15 = multiShortestPathTree1.getVertexCount();
        java.lang.String str16 = multiShortestPathTree1.toString();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath9 = multiShortestPathTree1.getPath(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths();
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
        org.junit.Assert.assertNull(graphPath12);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        int int11 = multiShortestPathTree1.getVertexCount();
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
        org.junit.Assert.assertNull(graphPath7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.core.State state6 = multiShortestPathTree1.getState(vertex5);
        java.lang.String str7 = multiShortestPathTree1.toString();
        java.lang.String str8 = multiShortestPathTree1.toString();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        java.lang.String str13 = multiShortestPathTree1.toString();
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
        org.junit.Assert.assertNull(state11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13.equals("MultiSPT(0 vertices)"));
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList11);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
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
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, true);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList16 = multiShortestPathTree1.getStates(vertex15);
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.core.State state18 = multiShortestPathTree1.getState(vertex17);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree20 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest19);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = multiShortestPathTree20.stateSets;
        multiShortestPathTree1.stateSets = vertexMap21;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap21);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
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
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap30 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state31 = null;
        multiShortestPathTree1.postVisit(state31);
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
        org.junit.Assert.assertNotNull(vertexMap30);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, true);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.core.State state15 = multiShortestPathTree1.getState(vertex14);
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
        org.junit.Assert.assertNotNull(graphPathList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state15);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
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
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
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
        org.junit.Assert.assertNotNull(vertexMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection12);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap16 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree18 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest17);
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList20 = multiShortestPathTree18.getStates(vertex19);
        java.lang.String str21 = multiShortestPathTree18.toString();
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath24 = multiShortestPathTree18.getPath(vertex22, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection25 = multiShortestPathTree18.getAllStates();
        org.opentripplanner.routing.core.State state26 = null;
        multiShortestPathTree18.postVisit(state26);
        org.opentripplanner.routing.core.RoutingRequest routingRequest28 = multiShortestPathTree18.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet29 = multiShortestPathTree18.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest30 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree31 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest30);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap32 = multiShortestPathTree31.stateSets;
        int int33 = multiShortestPathTree31.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap34 = multiShortestPathTree31.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest35 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree36 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest35);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap37 = multiShortestPathTree36.stateSets;
        java.lang.String str38 = multiShortestPathTree36.toString();
        org.opentripplanner.routing.graph.Vertex vertex39 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath41 = multiShortestPathTree36.getPath(vertex39, false);
        org.opentripplanner.routing.graph.Vertex vertex42 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList44 = multiShortestPathTree36.getPaths(vertex42, false);
        org.opentripplanner.routing.graph.Vertex vertex45 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList46 = multiShortestPathTree36.getStates(vertex45);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet47 = multiShortestPathTree36.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection48 = multiShortestPathTree36.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex49 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList50 = multiShortestPathTree36.getStates(vertex49);
        org.opentripplanner.routing.core.RoutingRequest routingRequest51 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree52 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest51);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet53 = multiShortestPathTree52.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest54 = multiShortestPathTree52.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest55 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree56 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest55);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap57 = multiShortestPathTree56.stateSets;
        int int58 = multiShortestPathTree56.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap59 = multiShortestPathTree56.stateSets;
        multiShortestPathTree52.stateSets = vertexMap59;
        multiShortestPathTree36.stateSets = vertexMap59;
        multiShortestPathTree31.stateSets = vertexMap59;
        multiShortestPathTree18.stateSets = vertexMap59;
        org.opentripplanner.routing.core.RoutingRequest routingRequest64 = multiShortestPathTree18.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap65 = multiShortestPathTree18.stateSets;
        multiShortestPathTree1.stateSets = vertexMap65;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "MultiSPT(0 vertices)" + "'", str21.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "MultiSPT(0 vertices)" + "'", str38.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap65);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        int int7 = multiShortestPathTree1.getVertexCount();
        int int8 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = graphPath11.getClass();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath11);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest7);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree10.getStates(vertex11);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap13 = multiShortestPathTree10.stateSets;
        multiShortestPathTree8.stateSets = vertexMap13;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree8.stateSets;
        multiShortestPathTree1.stateSets = vertexMap15;
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree18 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest17);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree18.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree18.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = multiShortestPathTree18.stateSets;
        multiShortestPathTree1.stateSets = vertexMap21;
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        org.opentripplanner.routing.core.State state24 = multiShortestPathTree1.getState(vertex23);
        org.opentripplanner.routing.graph.Vertex vertex25 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath27 = multiShortestPathTree1.getPath(vertex25, false);
        org.opentripplanner.routing.graph.Vertex vertex28 = null;
        org.opentripplanner.routing.core.State state29 = multiShortestPathTree1.getState(vertex28);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap30 = null;
        multiShortestPathTree1.stateSets = vertexMap30;
        org.opentripplanner.routing.core.RoutingRequest routingRequest32 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.spt.GraphPath graphPath35 = multiShortestPathTree1.getPath(vertex33, false);
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
        org.junit.Assert.assertNull(stateList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest32);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree9.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree9.getPath(vertex11, false);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree9.getStates(vertex14);
        int int16 = multiShortestPathTree9.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree18 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest17);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree20 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest19);
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList22 = multiShortestPathTree20.getStates(vertex21);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap23 = multiShortestPathTree20.stateSets;
        multiShortestPathTree18.stateSets = vertexMap23;
        org.opentripplanner.routing.core.RoutingRequest routingRequest25 = multiShortestPathTree18.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet26 = multiShortestPathTree18.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex27 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList28 = multiShortestPathTree18.getStates(vertex27);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet29 = multiShortestPathTree18.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest30 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree31 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest30);
        org.opentripplanner.routing.graph.Vertex vertex32 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList33 = multiShortestPathTree31.getStates(vertex32);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap34 = multiShortestPathTree31.stateSets;
        multiShortestPathTree18.stateSets = vertexMap34;
        multiShortestPathTree9.stateSets = vertexMap34;
        multiShortestPathTree1.stateSets = vertexMap34;
        org.opentripplanner.routing.core.State state38 = null;
        multiShortestPathTree1.postVisit(state38);
        org.opentripplanner.routing.graph.Vertex vertex40 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath42 = multiShortestPathTree1.getPath(vertex40, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath42);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
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
        java.lang.String str10 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "MultiSPT(0 vertices)" + "'", str10.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet8);
    }
}

