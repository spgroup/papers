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
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
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
        org.junit.Assert.assertNull(routingRequest4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList8);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.lang.String str5 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, false);
        java.lang.String str12 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, false);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath18 = multiShortestPathTree1.getPath(vertex16, true);
        org.opentripplanner.routing.core.State state19 = null;
        multiShortestPathTree1.postVisit(state19);
        int int21 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList23 = multiShortestPathTree1.getStates(vertex22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList23);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection4 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.core.State state8 = multiShortestPathTree1.getState(vertex7);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList13);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath8 = multiShortestPathTree1.getPath(vertex6, true);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.core.State state10 = multiShortestPathTree1.getState(vertex9);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection11 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.core.State state15 = multiShortestPathTree1.getState(vertex14);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection17 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.options;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4.equals("MultiSPT(0 vertices)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphPath8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(state15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest18);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList7 = multiShortestPathTree1.getPaths(vertex5, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.getOptions();
        int int13 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(stateList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphPathList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vertexSet9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stateCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(routingRequest14);
    }
}

