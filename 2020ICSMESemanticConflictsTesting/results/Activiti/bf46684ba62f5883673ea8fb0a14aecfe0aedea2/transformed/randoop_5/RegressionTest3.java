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
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition4;
        java.util.List<java.lang.String> strList7 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList11 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition7;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = taskDefinition14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList5 = userTaskActivityBehavior0.extractCandidates("hi!");
        java.lang.Class<?> wildcardClass6 = userTaskActivityBehavior0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition8;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList12 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList16 = userTaskActivityBehavior1.extractCandidates("hi!");
        java.lang.Class<?> wildcardClass17 = strList16.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.taskDefinition;
        java.util.List<java.lang.String> strList10 = userTaskActivityBehavior1.extractCandidates("");
        java.util.List<java.lang.String> strList12 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.taskDefinition;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList6 = userTaskActivityBehavior0.extractCandidates("hi!");
        java.util.List<java.lang.String> strList8 = userTaskActivityBehavior0.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = multiInstanceActivityBehavior9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution8 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("hi!");
        java.util.List<java.lang.String> strList5 = userTaskActivityBehavior0.extractCandidates("");
        java.util.List<java.lang.String> strList7 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition9;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior0.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.taskDefinition;
        java.util.List<java.lang.String> strList7 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition4;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior0.taskDefinition;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition6;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList12 = userTaskActivityBehavior0.extractCandidates("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList13 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity14 = null;
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution15 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.handleAssignments(taskEntity14, activityExecution15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity6 = null;
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution7 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior0.handleAssignments(taskEntity6, activityExecution7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition7;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition10;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition13;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList17 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = userTaskActivityBehavior1.taskDefinition;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition18);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior0.getTaskDefinition();
        java.util.List<java.lang.String> strList8 = userTaskActivityBehavior0.extractCandidates("");
        java.util.List<java.lang.String> strList10 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior0.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution9 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior11.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList14 = userTaskActivityBehavior11.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior11.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior11.taskDefinition;
        java.util.List<java.lang.String> strList18 = userTaskActivityBehavior11.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = null;
        userTaskActivityBehavior11.taskDefinition = taskDefinition19;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition21 = null;
        userTaskActivityBehavior11.taskDefinition = taskDefinition21;
        java.util.List<java.lang.String> strList24 = userTaskActivityBehavior11.extractCandidates("");
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior0.signal(activityExecution9, "", (java.lang.Object) strList24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition7;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.taskDefinition;
        java.util.List<java.lang.String> strList15 = userTaskActivityBehavior1.extractCandidates("");
        java.util.List<java.lang.String> strList17 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition18;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition4;
        java.util.List<java.lang.String> strList7 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList13 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity14 = null;
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution15 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.handleAssignments(taskEntity14, activityExecution15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        java.util.List<java.lang.String> strList6 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.taskDefinition;
        java.util.List<java.lang.String> strList9 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        java.util.List<java.lang.String> strList6 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        java.util.List<java.lang.String> strList12 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution15 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        java.util.List<java.lang.String> strList6 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.taskDefinition;
        java.util.List<java.lang.String> strList9 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.taskDefinition;
        java.util.List<java.lang.String> strList14 = userTaskActivityBehavior1.extractCandidates("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        java.util.List<java.lang.String> strList6 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition7;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList8 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition10;
        java.util.List<java.lang.String> strList13 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition14;
        java.lang.Class<?> wildcardClass16 = userTaskActivityBehavior1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition7;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition7;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList4 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition5;
        java.util.List<java.lang.String> strList8 = userTaskActivityBehavior1.extractCandidates("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior0.taskDefinition;
        java.util.List<java.lang.String> strList7 = userTaskActivityBehavior0.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition8;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition10;
        java.util.List<java.lang.String> strList13 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior0.getTaskDefinition();
        java.util.List<java.lang.String> strList16 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior0.taskDefinition;
        java.util.List<java.lang.String> strList19 = userTaskActivityBehavior0.extractCandidates("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition7;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition10;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition13;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior18);
        java.lang.Class<?> wildcardClass20 = userTaskActivityBehavior1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        java.util.List<java.lang.String> strList6 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        java.util.List<java.lang.String> strList11 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList8 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition10;
        java.util.List<java.lang.String> strList13 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition14;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior17);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition20);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition8;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.taskDefinition;
        java.util.List<java.lang.String> strList14 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition15;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior17);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition20);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition4;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition4;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior0.getTaskDefinition();
        java.util.List<java.lang.String> strList9 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition12;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList13 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution14 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution14, "hi!", (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition8;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList13 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition15;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior1.taskDefinition;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition9;
        java.util.List<java.lang.String> strList12 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        java.util.List<java.lang.String> strList8 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition7;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition10;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList14 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior16);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution18 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList6 = userTaskActivityBehavior0.extractCandidates("hi!");
        java.util.List<java.lang.String> strList8 = userTaskActivityBehavior0.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition10;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior0.taskDefinition;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition8;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.taskDefinition;
        java.util.List<java.lang.String> strList14 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition15;
        java.util.List<java.lang.String> strList18 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior20);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("hi!");
        java.util.List<java.lang.String> strList5 = userTaskActivityBehavior0.extractCandidates("");
        java.util.List<java.lang.String> strList7 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition9;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution15 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior0.execute(activityExecution15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList8 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.taskDefinition;
        java.util.List<java.lang.String> strList11 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition7;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList11 = userTaskActivityBehavior1.extractCandidates("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        java.util.List<java.lang.String> strList6 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.taskDefinition;
        java.util.List<java.lang.String> strList9 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity10 = null;
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.handleAssignments(taskEntity10, activityExecution11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        java.util.List<java.lang.String> strList13 = userTaskActivityBehavior1.extractCandidates("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition8;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList12 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("hi!");
        java.util.List<java.lang.String> strList5 = userTaskActivityBehavior0.extractCandidates("");
        java.util.List<java.lang.String> strList7 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior0.execute(activityExecution11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition8;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.taskDefinition;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition7;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition10;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.taskDefinition;
        java.util.List<java.lang.String> strList17 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = userTaskActivityBehavior1.taskDefinition;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition18);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition8;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList12 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        java.util.List<java.lang.String> strList16 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition17;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition20;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition22 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition22;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior24 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior24);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        java.util.List<java.lang.String> strList2 = userTaskActivityBehavior0.extractCandidates("");
        java.util.List<java.lang.String> strList4 = userTaskActivityBehavior0.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        java.util.List<java.lang.String> strList6 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition8;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution7 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior9.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior9.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior9.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior9.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior9.taskDefinition;
        java.lang.Class<?> wildcardClass15 = userTaskActivityBehavior9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior0.signal(activityExecution7, "", (java.lang.Object) userTaskActivityBehavior9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("hi!");
        java.util.List<java.lang.String> strList5 = userTaskActivityBehavior0.extractCandidates("");
        java.lang.Class<?> wildcardClass6 = userTaskActivityBehavior0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition8;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition14;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity17 = null;
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution18 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.handleAssignments(taskEntity17, activityExecution18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution4 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior0.execute(activityExecution4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior3);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition6;
        java.util.List<java.lang.String> strList9 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution10 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior12.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList15 = userTaskActivityBehavior12.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior12.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = null;
        userTaskActivityBehavior12.taskDefinition = taskDefinition17;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior12.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = null;
        userTaskActivityBehavior12.taskDefinition = taskDefinition20;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = null;
        userTaskActivityBehavior12.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior22);
        java.lang.Class<?> wildcardClass24 = userTaskActivityBehavior12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior0.signal(activityExecution10, "hi!", (java.lang.Object) userTaskActivityBehavior12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("hi!");
        java.util.List<java.lang.String> strList5 = userTaskActivityBehavior0.extractCandidates("");
        java.util.List<java.lang.String> strList7 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior0.taskDefinition;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = taskDefinition13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition7;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition10;
        java.util.List<java.lang.String> strList13 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        java.util.List<java.lang.String> strList15 = userTaskActivityBehavior1.extractCandidates("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        java.util.List<java.lang.String> strList7 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior0.taskDefinition;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution14 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior17 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition16);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = userTaskActivityBehavior17.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior17.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = null;
        userTaskActivityBehavior17.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior20);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition22 = userTaskActivityBehavior17.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior23 = userTaskActivityBehavior17.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition24 = userTaskActivityBehavior17.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition25 = userTaskActivityBehavior17.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition26 = userTaskActivityBehavior17.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition27 = userTaskActivityBehavior17.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior28 = null;
        userTaskActivityBehavior17.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior28);
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution14, "", (java.lang.Object) multiInstanceActivityBehavior28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition27);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList7 = userTaskActivityBehavior0.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition10;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior0.getTaskDefinition();
        java.util.List<java.lang.String> strList14 = userTaskActivityBehavior0.extractCandidates("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        java.util.List<java.lang.String> strList7 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        java.util.List<java.lang.String> strList11 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList14 = userTaskActivityBehavior1.extractCandidates("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        java.util.List<java.lang.String> strList7 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity11 = null;
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.handleAssignments(taskEntity11, activityExecution12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList13 = userTaskActivityBehavior1.extractCandidates("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition6;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        java.util.List<java.lang.String> strList6 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        java.util.List<java.lang.String> strList11 = userTaskActivityBehavior1.extractCandidates("");
        java.util.List<java.lang.String> strList13 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition15;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition17;
        java.util.List<java.lang.String> strList20 = userTaskActivityBehavior1.extractCandidates("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition8;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList12 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        java.util.List<java.lang.String> strList16 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition17;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior19);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition7;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition10;
        java.util.List<java.lang.String> strList13 = userTaskActivityBehavior1.extractCandidates("");
        java.util.List<java.lang.String> strList15 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution16 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition8;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.taskDefinition;
        java.util.List<java.lang.String> strList14 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution17 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior20 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition19);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition21 = userTaskActivityBehavior20.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition22 = null;
        userTaskActivityBehavior20.taskDefinition = taskDefinition22;
        java.util.List<java.lang.String> strList25 = userTaskActivityBehavior20.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior26 = null;
        userTaskActivityBehavior20.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior26);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior28 = null;
        userTaskActivityBehavior20.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior28);
        java.lang.Class<?> wildcardClass30 = userTaskActivityBehavior20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution17, "", (java.lang.Object) wildcardClass30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition8;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList13 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution15 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior18 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition17);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior18.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = userTaskActivityBehavior18.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition21 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = userTaskActivityBehavior18.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition23 = userTaskActivityBehavior18.getTaskDefinition();
        java.util.List<java.lang.String> strList25 = userTaskActivityBehavior18.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition26 = userTaskActivityBehavior18.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition27 = null;
        userTaskActivityBehavior18.taskDefinition = taskDefinition27;
        java.util.List<java.lang.String> strList30 = userTaskActivityBehavior18.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition31 = null;
        userTaskActivityBehavior18.taskDefinition = taskDefinition31;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior33 = userTaskActivityBehavior18.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior34 = null;
        userTaskActivityBehavior18.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior34);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior36 = userTaskActivityBehavior18.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList38 = userTaskActivityBehavior18.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior39 = userTaskActivityBehavior18.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution15, "hi!", (java.lang.Object) userTaskActivityBehavior18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior39);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition7;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition10;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior1.taskDefinition;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior1.extractCandidates("hi!");
        java.util.List<java.lang.String> strList5 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity11 = null;
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.handleAssignments(taskEntity11, activityExecution12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        java.util.List<java.lang.String> strList7 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.taskDefinition;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        java.util.List<java.lang.String> strList2 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition5;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition7;
        java.util.List<java.lang.String> strList10 = userTaskActivityBehavior0.extractCandidates("hi!");
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity11 = null;
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior0.handleAssignments(taskEntity11, activityExecution12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        java.util.List<java.lang.String> strList6 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        java.util.List<java.lang.String> strList11 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList14 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution15 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior18 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition17);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior18.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = userTaskActivityBehavior18.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition21 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = userTaskActivityBehavior18.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition23 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition24 = null;
        userTaskActivityBehavior18.taskDefinition = taskDefinition24;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition26 = userTaskActivityBehavior18.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition27 = null;
        userTaskActivityBehavior18.taskDefinition = taskDefinition27;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition29 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior30 = null;
        userTaskActivityBehavior18.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior30);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior32 = null;
        userTaskActivityBehavior18.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior32);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior34 = userTaskActivityBehavior18.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition35 = null;
        userTaskActivityBehavior18.taskDefinition = taskDefinition35;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution15, "hi!", (java.lang.Object) userTaskActivityBehavior18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior34);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        java.util.List<java.lang.String> strList6 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        java.util.List<java.lang.String> strList11 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList17 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition18;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior20);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        java.util.List<java.lang.String> strList11 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution9 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior11.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior11.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior11.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior11.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior11.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList18 = userTaskActivityBehavior11.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = null;
        userTaskActivityBehavior11.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior19);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition21 = null;
        userTaskActivityBehavior11.taskDefinition = taskDefinition21;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior0.signal(activityExecution9, "hi!", (java.lang.Object) taskDefinition21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition6;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior0.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition8;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution12 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior14 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior14.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList17 = userTaskActivityBehavior14.extractCandidates("hi!");
        java.util.List<java.lang.String> strList19 = userTaskActivityBehavior14.extractCandidates("");
        java.util.List<java.lang.String> strList21 = userTaskActivityBehavior14.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition22 = userTaskActivityBehavior14.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition23 = null;
        userTaskActivityBehavior14.taskDefinition = taskDefinition23;
        java.util.List<java.lang.String> strList26 = userTaskActivityBehavior14.extractCandidates("hi!");
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution12, "hi!", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition4;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior0.getTaskDefinition();
        java.util.List<java.lang.String> strList8 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity11 = null;
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior0.handleAssignments(taskEntity11, activityExecution12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        java.util.List<java.lang.String> strList14 = userTaskActivityBehavior1.extractCandidates("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition5;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition7;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition5;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.lang.Class<?> wildcardClass10 = userTaskActivityBehavior0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition7;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition10;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList14 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList17 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution18 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition7;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition10;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.taskDefinition;
        java.util.List<java.lang.String> strList17 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        java.util.List<java.lang.String> strList6 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.taskDefinition;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = taskDefinition13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition7;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition10;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList14 = userTaskActivityBehavior1.extractCandidates("");
        java.util.List<java.lang.String> strList16 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution17 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition7;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition8;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition11;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList16 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList19 = userTaskActivityBehavior1.extractCandidates("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition8;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution11 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior14 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition13);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior14.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior14.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior14.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = userTaskActivityBehavior14.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior14.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = null;
        userTaskActivityBehavior14.taskDefinition = taskDefinition20;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = null;
        userTaskActivityBehavior14.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior22);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition24 = userTaskActivityBehavior14.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition25 = userTaskActivityBehavior14.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition26 = userTaskActivityBehavior14.taskDefinition;
        java.util.List<java.lang.String> strList28 = userTaskActivityBehavior14.extractCandidates("");
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution11, "hi!", (java.lang.Object) strList28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        java.util.List<java.lang.String> strList7 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.taskDefinition;
        java.util.List<java.lang.String> strList12 = userTaskActivityBehavior1.extractCandidates("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList8 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition10;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        java.util.List<java.lang.String> strList15 = userTaskActivityBehavior1.extractCandidates("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        java.util.List<java.lang.String> strList6 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList11 = userTaskActivityBehavior1.extractCandidates("hi!");
        java.lang.Class<?> wildcardClass12 = userTaskActivityBehavior1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition4;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior0.getTaskDefinition();
        java.util.List<java.lang.String> strList9 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        java.util.List<java.lang.String> strList15 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution17 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior0.execute(activityExecution17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList8 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition7;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition10;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList14 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition17;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition19;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition21 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution22 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition21);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList9 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition8;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.taskDefinition;
        java.util.List<java.lang.String> strList14 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior16);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition18;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition8;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList13 = userTaskActivityBehavior1.extractCandidates("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList8 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.taskDefinition;
        java.util.List<java.lang.String> strList11 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList14 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.taskDefinition;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        java.util.List<java.lang.String> strList7 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        java.util.List<java.lang.String> strList11 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition7;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition10;
        java.util.List<java.lang.String> strList13 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = multiInstanceActivityBehavior14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList6 = userTaskActivityBehavior1.extractCandidates("");
        java.util.List<java.lang.String> strList8 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        java.util.List<java.lang.String> strList6 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition8;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = multiInstanceActivityBehavior11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition7;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition9;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.lang.Class<?> wildcardClass12 = userTaskActivityBehavior0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition1 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior2);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior0.taskDefinition;
        java.util.List<java.lang.String> strList6 = userTaskActivityBehavior0.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition7;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition8;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.taskDefinition;
        java.util.List<java.lang.String> strList14 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution18 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior20 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = userTaskActivityBehavior20.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList23 = userTaskActivityBehavior20.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition24 = userTaskActivityBehavior20.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition25 = userTaskActivityBehavior20.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition26 = userTaskActivityBehavior20.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition27 = userTaskActivityBehavior20.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior28 = userTaskActivityBehavior20.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution18, "", (java.lang.Object) userTaskActivityBehavior20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior28);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior0.taskDefinition;
        java.util.List<java.lang.String> strList7 = userTaskActivityBehavior0.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition4;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        java.util.List<java.lang.String> strList10 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.taskDefinition;
        java.util.List<java.lang.String> strList13 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition8;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.taskDefinition;
        java.util.List<java.lang.String> strList14 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition15;
        java.util.List<java.lang.String> strList18 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition19;
        java.util.List<java.lang.String> strList22 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity23 = null;
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution24 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.handleAssignments(taskEntity23, activityExecution24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition3;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList10 = userTaskActivityBehavior0.extractCandidates("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition7;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition10;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        java.util.List<java.lang.String> strList16 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution18 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition8;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition12;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior1.getTaskDefinition();
        java.lang.Class<?> wildcardClass17 = userTaskActivityBehavior1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition9;
        java.util.List<java.lang.String> strList12 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        java.util.List<java.lang.String> strList6 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition4;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        java.util.List<java.lang.String> strList10 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior0.taskDefinition;
        java.util.List<java.lang.String> strList7 = userTaskActivityBehavior0.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList14 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior0.getTaskDefinition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = taskDefinition15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        java.util.List<java.lang.String> strList7 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior0.taskDefinition;
        java.util.List<java.lang.String> strList11 = userTaskActivityBehavior0.extractCandidates("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition7;
        java.lang.Class<?> wildcardClass9 = userTaskActivityBehavior1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition8;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.taskDefinition;
        java.util.List<java.lang.String> strList13 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition15;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity18 = null;
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution19 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.handleAssignments(taskEntity18, activityExecution19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        java.util.List<java.lang.String> strList6 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.taskDefinition;
        java.util.List<java.lang.String> strList15 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution16 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition8;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList12 = userTaskActivityBehavior1.extractCandidates("hi!");
        java.util.List<java.lang.String> strList14 = userTaskActivityBehavior1.extractCandidates("");
        java.lang.Class<?> wildcardClass15 = userTaskActivityBehavior1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition7;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition10;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition13;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior16);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition18;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition20;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior22);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition9;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        java.util.List<java.lang.String> strList2 = userTaskActivityBehavior0.extractCandidates("");
        java.util.List<java.lang.String> strList4 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition5;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        java.lang.Class<?> wildcardClass9 = userTaskActivityBehavior1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition4;
        java.util.List<java.lang.String> strList7 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.taskDefinition;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList8 = userTaskActivityBehavior1.extractCandidates("");
        java.util.List<java.lang.String> strList10 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.taskDefinition;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition8;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.taskDefinition;
        java.util.List<java.lang.String> strList13 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution15 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition8;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList13 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition15;
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution17 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition9;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior0.taskDefinition;
        java.lang.Class<?> wildcardClass12 = userTaskActivityBehavior0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        java.util.List<java.lang.String> strList2 = userTaskActivityBehavior0.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition6;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition12;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        java.util.List<java.lang.String> strList17 = userTaskActivityBehavior0.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = userTaskActivityBehavior0.taskDefinition;
        java.util.List<java.lang.String> strList20 = userTaskActivityBehavior0.extractCandidates("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior2);
        java.util.List<java.lang.String> strList5 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition3;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition10;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior0.taskDefinition;
        java.util.List<java.lang.String> strList14 = userTaskActivityBehavior0.extractCandidates("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.taskDefinition;
        java.lang.Class<?> wildcardClass9 = userTaskActivityBehavior1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList7 = userTaskActivityBehavior0.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition10;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior0.taskDefinition;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        java.util.List<java.lang.String> strList6 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition7;
        java.util.List<java.lang.String> strList10 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        java.lang.Class<?> wildcardClass14 = userTaskActivityBehavior1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        java.lang.Class<?> wildcardClass7 = userTaskActivityBehavior1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        java.util.List<java.lang.String> strList6 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        java.util.List<java.lang.String> strList11 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior17);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition8;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.taskDefinition;
        java.util.List<java.lang.String> strList14 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition16;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        java.util.List<java.lang.String> strList6 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        java.util.List<java.lang.String> strList11 = userTaskActivityBehavior1.extractCandidates("");
        java.util.List<java.lang.String> strList13 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition14;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition17;
        java.util.List<java.lang.String> strList20 = userTaskActivityBehavior1.extractCandidates("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition7;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition10;
        java.util.List<java.lang.String> strList13 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList16 = userTaskActivityBehavior1.extractCandidates("");
        java.util.List<java.lang.String> strList18 = userTaskActivityBehavior1.extractCandidates("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList7 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution9 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior11.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList14 = userTaskActivityBehavior11.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior11.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior11.taskDefinition;
        java.util.List<java.lang.String> strList18 = userTaskActivityBehavior11.extractCandidates("hi!");
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution9, "", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList18);
    }
}

