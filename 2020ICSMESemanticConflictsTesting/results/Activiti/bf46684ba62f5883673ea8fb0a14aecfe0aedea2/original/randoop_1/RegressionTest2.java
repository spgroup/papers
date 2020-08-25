import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = multiInstanceActivityBehavior8.getClass();
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
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
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        java.lang.Class<?> wildcardClass14 = userTaskActivityBehavior1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution12 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior15 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition14);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior18);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior21);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior23 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior23);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior25 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior25);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior27 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior28 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior28);
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution12, "hi!", (java.lang.Object) userTaskActivityBehavior15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior27);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
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
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution14 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior17 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition16);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = userTaskActivityBehavior17.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior17.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = userTaskActivityBehavior17.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition21 = userTaskActivityBehavior17.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = userTaskActivityBehavior17.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior23 = null;
        userTaskActivityBehavior17.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior23);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition25 = userTaskActivityBehavior17.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior26 = userTaskActivityBehavior17.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition27 = userTaskActivityBehavior17.getTaskDefinition();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution14, "hi!", (java.lang.Object) userTaskActivityBehavior17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition27);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution13 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior16 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition15);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = userTaskActivityBehavior16.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = null;
        userTaskActivityBehavior16.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior18);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = userTaskActivityBehavior16.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = null;
        userTaskActivityBehavior16.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior21);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition23 = userTaskActivityBehavior16.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition24 = userTaskActivityBehavior16.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior25 = userTaskActivityBehavior16.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior26 = userTaskActivityBehavior16.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior27 = userTaskActivityBehavior16.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior28 = null;
        userTaskActivityBehavior16.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior28);
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution13, "", (java.lang.Object) multiInstanceActivityBehavior28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior27);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
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
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = multiInstanceActivityBehavior13.getClass();
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution13 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior16 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition15);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior16.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = userTaskActivityBehavior16.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = userTaskActivityBehavior16.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = null;
        userTaskActivityBehavior16.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior20);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = null;
        userTaskActivityBehavior16.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior22);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition24 = userTaskActivityBehavior16.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition25 = userTaskActivityBehavior16.getTaskDefinition();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution13, "hi!", (java.lang.Object) taskDefinition25);
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition25);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior16);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition18);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = multiInstanceActivityBehavior16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior18);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition20);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        java.lang.Class<?> wildcardClass17 = userTaskActivityBehavior1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        java.lang.Class<?> wildcardClass10 = userTaskActivityBehavior1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution15 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior18 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition17);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = null;
        userTaskActivityBehavior18.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior21);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior23 = userTaskActivityBehavior18.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior24 = null;
        userTaskActivityBehavior18.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior24);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior26 = userTaskActivityBehavior18.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior27 = userTaskActivityBehavior18.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior28 = userTaskActivityBehavior18.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition29 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior30 = userTaskActivityBehavior18.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution15, "hi!", (java.lang.Object) multiInstanceActivityBehavior30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior30);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
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
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution12 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior15 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition14);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior18);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior21);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition23 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition24 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior25 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior25);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior27 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution12, "", (java.lang.Object) multiInstanceActivityBehavior27);
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
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior27);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution12);
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
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
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution12 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior15 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition14);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior18);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior20);
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution12, "", (java.lang.Object) multiInstanceActivityBehavior20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        java.lang.Class<?> wildcardClass13 = userTaskActivityBehavior1.getClass();
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
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
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        java.lang.Class<?> wildcardClass13 = userTaskActivityBehavior1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution4 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior7.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior7.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior7.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior7.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior7.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior7.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior7.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = userTaskActivityBehavior7.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = null;
        userTaskActivityBehavior7.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior18);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = userTaskActivityBehavior7.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = null;
        userTaskActivityBehavior7.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior21);
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution4, "hi!", (java.lang.Object) userTaskActivityBehavior7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior20);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior16);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        java.lang.Class<?> wildcardClass18 = userTaskActivityBehavior1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = taskDefinition12.getClass();
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution10 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior13 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition12);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior13.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior13.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior13.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior13.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = userTaskActivityBehavior13.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = userTaskActivityBehavior13.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = userTaskActivityBehavior13.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = null;
        userTaskActivityBehavior13.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior21);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior23 = userTaskActivityBehavior13.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior24 = userTaskActivityBehavior13.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition25 = userTaskActivityBehavior13.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior26 = null;
        userTaskActivityBehavior13.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior26);
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution10, "hi!", (java.lang.Object) multiInstanceActivityBehavior26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition25);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior1.getTaskDefinition();
        java.lang.Class<?> wildcardClass18 = userTaskActivityBehavior1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior16);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition18);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        java.lang.Class<?> wildcardClass11 = userTaskActivityBehavior1.getClass();
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution14 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior17 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition16);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = userTaskActivityBehavior17.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = null;
        userTaskActivityBehavior17.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior19);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = userTaskActivityBehavior17.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = null;
        userTaskActivityBehavior17.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior22);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition24 = userTaskActivityBehavior17.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition25 = userTaskActivityBehavior17.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior26 = null;
        userTaskActivityBehavior17.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior26);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior28 = userTaskActivityBehavior17.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior29 = null;
        userTaskActivityBehavior17.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior29);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior31 = null;
        userTaskActivityBehavior17.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior31);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior33 = null;
        userTaskActivityBehavior17.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior33);
        java.lang.Class<?> wildcardClass35 = userTaskActivityBehavior17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution14, "hi!", (java.lang.Object) userTaskActivityBehavior17);
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution16 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior19 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition18);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = userTaskActivityBehavior19.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition21 = userTaskActivityBehavior19.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = null;
        userTaskActivityBehavior19.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior22);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior24 = userTaskActivityBehavior19.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior25 = null;
        userTaskActivityBehavior19.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior25);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition27 = userTaskActivityBehavior19.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition28 = userTaskActivityBehavior19.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior29 = null;
        userTaskActivityBehavior19.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior29);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior31 = userTaskActivityBehavior19.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior32 = null;
        userTaskActivityBehavior19.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior32);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior34 = userTaskActivityBehavior19.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior35 = userTaskActivityBehavior19.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior36 = null;
        userTaskActivityBehavior19.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior36);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior38 = null;
        userTaskActivityBehavior19.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior38);
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution16, "", (java.lang.Object) userTaskActivityBehavior19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior35);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution12 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior15 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition14);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior18);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition21 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior22);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior24 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior25 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior25);
        java.lang.Class<?> wildcardClass27 = userTaskActivityBehavior15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution12, "hi!", (java.lang.Object) userTaskActivityBehavior15);
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior17);
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution15 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior18 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition17);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = null;
        userTaskActivityBehavior18.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior21);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior23 = userTaskActivityBehavior18.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior24 = null;
        userTaskActivityBehavior18.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior24);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior26 = userTaskActivityBehavior18.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition27 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior28 = userTaskActivityBehavior18.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior29 = userTaskActivityBehavior18.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition30 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior31 = null;
        userTaskActivityBehavior18.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior31);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition33 = userTaskActivityBehavior18.getTaskDefinition();
        java.lang.Class<?> wildcardClass34 = userTaskActivityBehavior18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution15, "", (java.lang.Object) userTaskActivityBehavior18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior18);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = multiInstanceActivityBehavior21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior21);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        java.lang.Class<?> wildcardClass16 = userTaskActivityBehavior1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution16 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior19 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition18);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = userTaskActivityBehavior19.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition21 = userTaskActivityBehavior19.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = null;
        userTaskActivityBehavior19.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior22);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior24 = null;
        userTaskActivityBehavior19.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior24);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior26 = null;
        userTaskActivityBehavior19.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior26);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior28 = userTaskActivityBehavior19.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior29 = userTaskActivityBehavior19.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution16, "", (java.lang.Object) multiInstanceActivityBehavior29);
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior29);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = taskDefinition8.getClass();
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution14 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution10 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior13 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition12);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior13.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior13.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = null;
        userTaskActivityBehavior13.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior16);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = userTaskActivityBehavior13.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = null;
        userTaskActivityBehavior13.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior19);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = userTaskActivityBehavior13.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition22 = userTaskActivityBehavior13.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition23 = userTaskActivityBehavior13.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior24 = userTaskActivityBehavior13.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition25 = userTaskActivityBehavior13.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition26 = userTaskActivityBehavior13.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior27 = userTaskActivityBehavior13.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution10, "", (java.lang.Object) userTaskActivityBehavior13);
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
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior27);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = taskDefinition11.getClass();
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
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior16);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution19 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior18);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution15 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior18 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition17);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = null;
        userTaskActivityBehavior18.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior21);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior23 = null;
        userTaskActivityBehavior18.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior23);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior25 = null;
        userTaskActivityBehavior18.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior25);
        java.lang.Class<?> wildcardClass27 = userTaskActivityBehavior18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution15, "", (java.lang.Object) wildcardClass27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior17);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = taskDefinition4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition18);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution11 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior14 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition13);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior14.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior14.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = null;
        userTaskActivityBehavior14.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior17);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = userTaskActivityBehavior14.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = null;
        userTaskActivityBehavior14.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior20);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = userTaskActivityBehavior14.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition23 = userTaskActivityBehavior14.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior24 = userTaskActivityBehavior14.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior25 = userTaskActivityBehavior14.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition26 = userTaskActivityBehavior14.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior27 = null;
        userTaskActivityBehavior14.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior27);
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution11, "hi!", (java.lang.Object) multiInstanceActivityBehavior27);
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
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition26);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution15 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior18 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition17);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = null;
        userTaskActivityBehavior18.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior21);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior23 = null;
        userTaskActivityBehavior18.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior23);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior25 = null;
        userTaskActivityBehavior18.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior25);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior27 = null;
        userTaskActivityBehavior18.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior27);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior29 = userTaskActivityBehavior18.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition30 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior31 = userTaskActivityBehavior18.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior32 = userTaskActivityBehavior18.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior33 = null;
        userTaskActivityBehavior18.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior33);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition35 = userTaskActivityBehavior18.getTaskDefinition();
        java.lang.Class<?> wildcardClass36 = userTaskActivityBehavior18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution15, "hi!", (java.lang.Object) userTaskActivityBehavior18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior17);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior19);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = multiInstanceActivityBehavior21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior21);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
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
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution7 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution11 = null;
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution11, "hi!", obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior16);
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior16);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution13 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior16 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition15);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior16.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = userTaskActivityBehavior16.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = null;
        userTaskActivityBehavior16.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior19);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = userTaskActivityBehavior16.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = null;
        userTaskActivityBehavior16.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior22);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition24 = userTaskActivityBehavior16.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition25 = userTaskActivityBehavior16.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior26 = userTaskActivityBehavior16.getMultiInstanceActivityBehavior();
        java.lang.Class<?> wildcardClass27 = userTaskActivityBehavior16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution13, "", (java.lang.Object) wildcardClass27);
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
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution16 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior19 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition18);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = userTaskActivityBehavior19.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition21 = userTaskActivityBehavior19.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition22 = userTaskActivityBehavior19.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition23 = userTaskActivityBehavior19.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition24 = userTaskActivityBehavior19.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior25 = userTaskActivityBehavior19.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition26 = userTaskActivityBehavior19.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior27 = null;
        userTaskActivityBehavior19.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior27);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition29 = userTaskActivityBehavior19.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior30 = null;
        userTaskActivityBehavior19.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior30);
        java.lang.Class<?> wildcardClass32 = userTaskActivityBehavior19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution16, "", (java.lang.Object) userTaskActivityBehavior19);
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = multiInstanceActivityBehavior19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior19);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution6 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition8);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior9.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior9.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior9.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior9.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior9.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior9.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = userTaskActivityBehavior9.getTaskDefinition();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution6, "hi!", (java.lang.Object) userTaskActivityBehavior9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition18);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        java.lang.Class<?> wildcardClass15 = userTaskActivityBehavior1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior17);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior16);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution18 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior21 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition20);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition22 = userTaskActivityBehavior21.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition23 = userTaskActivityBehavior21.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior24 = null;
        userTaskActivityBehavior21.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior24);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior26 = userTaskActivityBehavior21.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior27 = null;
        userTaskActivityBehavior21.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior27);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior29 = userTaskActivityBehavior21.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition30 = userTaskActivityBehavior21.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior31 = null;
        userTaskActivityBehavior21.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior31);
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution18, "hi!", (java.lang.Object) userTaskActivityBehavior21);
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition30);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution4 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior7 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior7.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior7.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior7.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior7.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior7.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior7.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior7.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = null;
        userTaskActivityBehavior7.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior17);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = null;
        userTaskActivityBehavior7.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior19);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = userTaskActivityBehavior7.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = userTaskActivityBehavior7.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior23 = null;
        userTaskActivityBehavior7.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior23);
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution4, "", (java.lang.Object) multiInstanceActivityBehavior23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior22);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = taskDefinition8.getClass();
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
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior19);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution14 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution14);
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior17);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior16);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = multiInstanceActivityBehavior18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior18);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior16);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior18);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior17);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution12 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior15 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition14);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior17);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior20);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition22 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition23 = userTaskActivityBehavior15.getTaskDefinition();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution12, "", (java.lang.Object) taskDefinition23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition23);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution14 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior17 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition16);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = userTaskActivityBehavior17.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior17.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = userTaskActivityBehavior17.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition21 = userTaskActivityBehavior17.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition22 = userTaskActivityBehavior17.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior23 = userTaskActivityBehavior17.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition24 = userTaskActivityBehavior17.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior25 = userTaskActivityBehavior17.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior26 = null;
        userTaskActivityBehavior17.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior26);
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution14, "hi!", (java.lang.Object) multiInstanceActivityBehavior26);
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior25);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution12 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior15 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition14);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior17);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior20);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition22 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition23 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior24 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior24);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition26 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior27 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior27);
        java.lang.Class<?> wildcardClass29 = userTaskActivityBehavior15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution12, "", (java.lang.Object) wildcardClass29);
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
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior1.getTaskDefinition();
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior17);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution14 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior17 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition16);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = userTaskActivityBehavior17.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior17.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = null;
        userTaskActivityBehavior17.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior20);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = null;
        userTaskActivityBehavior17.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior22);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior24 = null;
        userTaskActivityBehavior17.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior24);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior26 = null;
        userTaskActivityBehavior17.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior26);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior28 = userTaskActivityBehavior17.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition29 = userTaskActivityBehavior17.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior30 = userTaskActivityBehavior17.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior31 = null;
        userTaskActivityBehavior17.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior31);
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution14, "", (java.lang.Object) userTaskActivityBehavior17);
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior30);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution6 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior9 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior9.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior9.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior9.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior9.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior9.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior9.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = null;
        userTaskActivityBehavior9.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior18);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = userTaskActivityBehavior9.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = null;
        userTaskActivityBehavior9.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior21);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior23 = null;
        userTaskActivityBehavior9.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior23);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition25 = userTaskActivityBehavior9.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior26 = null;
        userTaskActivityBehavior9.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior26);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition28 = userTaskActivityBehavior9.getTaskDefinition();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution6, "", (java.lang.Object) taskDefinition28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition28);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        java.lang.Class<?> wildcardClass11 = userTaskActivityBehavior1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution17 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior20 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition19);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = userTaskActivityBehavior20.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = null;
        userTaskActivityBehavior20.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior22);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior24 = userTaskActivityBehavior20.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior25 = null;
        userTaskActivityBehavior20.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior25);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition27 = userTaskActivityBehavior20.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition28 = userTaskActivityBehavior20.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior29 = null;
        userTaskActivityBehavior20.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior29);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior31 = null;
        userTaskActivityBehavior20.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior31);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior33 = null;
        userTaskActivityBehavior20.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior33);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior35 = null;
        userTaskActivityBehavior20.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior35);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition37 = userTaskActivityBehavior20.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior38 = userTaskActivityBehavior20.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition39 = userTaskActivityBehavior20.getTaskDefinition();
        java.lang.Class<?> wildcardClass40 = userTaskActivityBehavior20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution17, "", (java.lang.Object) wildcardClass40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = multiInstanceActivityBehavior6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior16);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior17);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior17);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        java.lang.Class<?> wildcardClass20 = userTaskActivityBehavior1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        java.lang.Class<?> wildcardClass13 = userTaskActivityBehavior1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = multiInstanceActivityBehavior12.getClass();
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior16);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        java.lang.Class<?> wildcardClass19 = userTaskActivityBehavior1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior16);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior18);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution12 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior15 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition14);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior18);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior22);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior24 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior24);
        java.lang.Class<?> wildcardClass26 = userTaskActivityBehavior15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution12, "", (java.lang.Object) userTaskActivityBehavior15);
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        java.lang.Class<?> wildcardClass14 = userTaskActivityBehavior1.getClass();
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution19 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition21 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior22 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition21);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior23 = userTaskActivityBehavior22.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution19, "hi!", (java.lang.Object) userTaskActivityBehavior22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior23);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution14 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior17 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition16);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = userTaskActivityBehavior17.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior17.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = null;
        userTaskActivityBehavior17.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior20);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = null;
        userTaskActivityBehavior17.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior22);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior24 = null;
        userTaskActivityBehavior17.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior24);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior26 = null;
        userTaskActivityBehavior17.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior26);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition28 = userTaskActivityBehavior17.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior29 = null;
        userTaskActivityBehavior17.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior29);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition31 = userTaskActivityBehavior17.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior32 = userTaskActivityBehavior17.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior33 = userTaskActivityBehavior17.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution14, "hi!", (java.lang.Object) userTaskActivityBehavior17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior33);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution12 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior15 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition14);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior18);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior21);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior23 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior23);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior25 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior25);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior27 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition28 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior29 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior30 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        java.lang.Class<?> wildcardClass31 = userTaskActivityBehavior15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution12, "hi!", (java.lang.Object) userTaskActivityBehavior15);
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
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior18);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution20 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition22 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior23 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition22);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition24 = userTaskActivityBehavior23.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition25 = userTaskActivityBehavior23.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior26 = null;
        userTaskActivityBehavior23.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior26);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior28 = userTaskActivityBehavior23.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior29 = null;
        userTaskActivityBehavior23.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior29);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition31 = userTaskActivityBehavior23.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior32 = userTaskActivityBehavior23.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior33 = null;
        userTaskActivityBehavior23.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior33);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior35 = null;
        userTaskActivityBehavior23.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior35);
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution20, "hi!", (java.lang.Object) userTaskActivityBehavior23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior32);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution12 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior15 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition14);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior17);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior20);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior23 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior24 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior24);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior26 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution12, "hi!", (java.lang.Object) userTaskActivityBehavior15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior26);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior17);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution11 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior14 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition13);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior14.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior14.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = null;
        userTaskActivityBehavior14.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior17);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = null;
        userTaskActivityBehavior14.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior19);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = userTaskActivityBehavior14.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition22 = userTaskActivityBehavior14.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition23 = userTaskActivityBehavior14.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior24 = userTaskActivityBehavior14.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior25 = userTaskActivityBehavior14.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition26 = userTaskActivityBehavior14.getTaskDefinition();
        java.lang.Class<?> wildcardClass27 = userTaskActivityBehavior14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution11, "hi!", (java.lang.Object) userTaskActivityBehavior14);
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = multiInstanceActivityBehavior12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = taskDefinition12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution12 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior15 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition14);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior17);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior15.getTaskDefinition();
        java.lang.Class<?> wildcardClass20 = userTaskActivityBehavior15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution12, "", (java.lang.Object) wildcardClass20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution15 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior18 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition17);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = userTaskActivityBehavior18.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = null;
        userTaskActivityBehavior18.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior20);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition22 = userTaskActivityBehavior18.getTaskDefinition();
        java.lang.Class<?> wildcardClass23 = userTaskActivityBehavior18.getClass();
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        java.lang.Class<?> wildcardClass10 = userTaskActivityBehavior1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        java.lang.Class<?> wildcardClass14 = userTaskActivityBehavior1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution18 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior21 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition20);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition22 = userTaskActivityBehavior21.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition23 = userTaskActivityBehavior21.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior24 = null;
        userTaskActivityBehavior21.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior24);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior26 = null;
        userTaskActivityBehavior21.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior26);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior28 = null;
        userTaskActivityBehavior21.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior28);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition30 = userTaskActivityBehavior21.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior31 = null;
        userTaskActivityBehavior21.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior31);
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution18, "", (java.lang.Object) userTaskActivityBehavior21);
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition30);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior18);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior20);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior22);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution15 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior18 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition17);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = null;
        userTaskActivityBehavior18.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior21);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior23 = userTaskActivityBehavior18.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior24 = null;
        userTaskActivityBehavior18.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior24);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior26 = userTaskActivityBehavior18.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition27 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior28 = userTaskActivityBehavior18.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution15, "", (java.lang.Object) userTaskActivityBehavior18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior28);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
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
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior17);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution9 = null;
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution9, "hi!", obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = multiInstanceActivityBehavior10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution15 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior18 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition17);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = userTaskActivityBehavior18.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = null;
        userTaskActivityBehavior18.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior20);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = userTaskActivityBehavior18.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior23 = null;
        userTaskActivityBehavior18.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior23);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition25 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition26 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior27 = null;
        userTaskActivityBehavior18.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior27);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior29 = userTaskActivityBehavior18.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior30 = null;
        userTaskActivityBehavior18.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior30);
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution15, "hi!", (java.lang.Object) multiInstanceActivityBehavior30);
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior29);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior17);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution21 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition20);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution12 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior15 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition14);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior18);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior21);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior23 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition24 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior25 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior25);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior27 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition28 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior29 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior30 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution12, "", (java.lang.Object) userTaskActivityBehavior15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior30);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = multiInstanceActivityBehavior16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution17 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior20 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition19);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = userTaskActivityBehavior20.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = null;
        userTaskActivityBehavior20.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior22);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior24 = userTaskActivityBehavior20.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior25 = null;
        userTaskActivityBehavior20.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior25);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition27 = userTaskActivityBehavior20.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition28 = userTaskActivityBehavior20.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior29 = null;
        userTaskActivityBehavior20.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior29);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior31 = null;
        userTaskActivityBehavior20.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior31);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior33 = null;
        userTaskActivityBehavior20.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior33);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior35 = userTaskActivityBehavior20.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition36 = userTaskActivityBehavior20.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition37 = userTaskActivityBehavior20.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior38 = userTaskActivityBehavior20.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution17, "", (java.lang.Object) multiInstanceActivityBehavior38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior38);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior16);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution18 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior21 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition20);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition22 = userTaskActivityBehavior21.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition23 = userTaskActivityBehavior21.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior24 = userTaskActivityBehavior21.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition25 = userTaskActivityBehavior21.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition26 = userTaskActivityBehavior21.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior27 = null;
        userTaskActivityBehavior21.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior27);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior29 = userTaskActivityBehavior21.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution18, "", (java.lang.Object) userTaskActivityBehavior21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior29);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution13 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior16 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition15);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior16.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = userTaskActivityBehavior16.getTaskDefinition();
        java.lang.Class<?> wildcardClass19 = userTaskActivityBehavior16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution13, "hi!", (java.lang.Object) wildcardClass19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        java.lang.Class<?> wildcardClass13 = userTaskActivityBehavior1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior16);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior21);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution23 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition20);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior16);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior18);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
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
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior16);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition18);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution16 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior16);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition20);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior16);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution18 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior21 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition20);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition22 = userTaskActivityBehavior21.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior23 = null;
        userTaskActivityBehavior21.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior23);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition25 = userTaskActivityBehavior21.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior26 = userTaskActivityBehavior21.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior27 = null;
        userTaskActivityBehavior21.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior27);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior29 = null;
        userTaskActivityBehavior21.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior29);
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution18, "", (java.lang.Object) userTaskActivityBehavior21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior26);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior19);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution5 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior8 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior8.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior8.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior8.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior8.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior8.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior8.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior8.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = userTaskActivityBehavior8.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = userTaskActivityBehavior8.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = userTaskActivityBehavior8.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = null;
        userTaskActivityBehavior8.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior21);
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution5, "", (java.lang.Object) userTaskActivityBehavior8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition20);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
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
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior16);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition18);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution8 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior11 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition10);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior11.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior11.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior11.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior11.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = null;
        userTaskActivityBehavior11.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior17);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior11.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = userTaskActivityBehavior11.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition21 = userTaskActivityBehavior11.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition22 = userTaskActivityBehavior11.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior23 = userTaskActivityBehavior11.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition24 = userTaskActivityBehavior11.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior25 = userTaskActivityBehavior11.getMultiInstanceActivityBehavior();
        java.lang.Class<?> wildcardClass26 = userTaskActivityBehavior11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution8, "hi!", (java.lang.Object) userTaskActivityBehavior11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
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
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution15 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior18 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition17);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = null;
        userTaskActivityBehavior18.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior21);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior23 = userTaskActivityBehavior18.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior24 = null;
        userTaskActivityBehavior18.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior24);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition26 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior27 = userTaskActivityBehavior18.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior28 = null;
        userTaskActivityBehavior18.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior28);
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution15, "", (java.lang.Object) userTaskActivityBehavior18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior27);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution15 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior18 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition17);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition21 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition22 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition23 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior24 = null;
        userTaskActivityBehavior18.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior24);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition26 = userTaskActivityBehavior18.getTaskDefinition();
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition26);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = taskDefinition8.getClass();
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
        org.junit.Assert.assertNull(taskDefinition8);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior17);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior20);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        java.lang.Class<?> wildcardClass15 = userTaskActivityBehavior1.getClass();
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior17);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = taskDefinition15.getClass();
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution18 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior21 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition20);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition22 = userTaskActivityBehavior21.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition23 = userTaskActivityBehavior21.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior24 = null;
        userTaskActivityBehavior21.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior24);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior26 = userTaskActivityBehavior21.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior27 = null;
        userTaskActivityBehavior21.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior27);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior29 = null;
        userTaskActivityBehavior21.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior29);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior31 = null;
        userTaskActivityBehavior21.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior31);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior33 = userTaskActivityBehavior21.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior34 = null;
        userTaskActivityBehavior21.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior34);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior36 = null;
        userTaskActivityBehavior21.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior36);
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution18, "", (java.lang.Object) userTaskActivityBehavior21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior33);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior17);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution20 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition22 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior23 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition22);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition24 = userTaskActivityBehavior23.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition25 = userTaskActivityBehavior23.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition26 = userTaskActivityBehavior23.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition27 = userTaskActivityBehavior23.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior28 = null;
        userTaskActivityBehavior23.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior28);
        java.lang.Class<?> wildcardClass30 = userTaskActivityBehavior23.getClass();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution20, "", (java.lang.Object) wildcardClass30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior16);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior18);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution20 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution12 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior15 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition14);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior17);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior20);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition22 = userTaskActivityBehavior15.getTaskDefinition();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution12, "", (java.lang.Object) taskDefinition22);
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition22);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution12 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior15 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition14);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior18);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior20);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior22);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition24 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior25 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior26 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior27 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition28 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition29 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior30 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior30);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition32 = userTaskActivityBehavior15.getTaskDefinition();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution12, "hi!", (java.lang.Object) userTaskActivityBehavior15);
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition32);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior17);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution19 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition21 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior22 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition21);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition23 = userTaskActivityBehavior22.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition24 = userTaskActivityBehavior22.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior25 = userTaskActivityBehavior22.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition26 = userTaskActivityBehavior22.getTaskDefinition();
        java.lang.Class<?> wildcardClass27 = userTaskActivityBehavior22.getClass();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution19, "", (java.lang.Object) wildcardClass27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior18);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior20);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior22);
        java.lang.Class<?> wildcardClass24 = userTaskActivityBehavior1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution10 = null;
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution10, "", obj12);
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution12 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior15 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition14);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior18);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition21 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition22 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition23 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior24 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior24);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition26 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior27 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior27);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition29 = userTaskActivityBehavior15.getTaskDefinition();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution12, "", (java.lang.Object) userTaskActivityBehavior15);
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition29);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior19);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution13);
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution14 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior17 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition16);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = userTaskActivityBehavior17.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = null;
        userTaskActivityBehavior17.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior19);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = userTaskActivityBehavior17.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = null;
        userTaskActivityBehavior17.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior22);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition24 = userTaskActivityBehavior17.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition25 = userTaskActivityBehavior17.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior26 = userTaskActivityBehavior17.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior27 = userTaskActivityBehavior17.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior28 = null;
        userTaskActivityBehavior17.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior28);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior30 = userTaskActivityBehavior17.getMultiInstanceActivityBehavior();
        java.lang.Class<?> wildcardClass31 = userTaskActivityBehavior17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution14, "hi!", (java.lang.Object) wildcardClass31);
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
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
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
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
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior1.getTaskDefinition();
        java.lang.Class<?> wildcardClass17 = userTaskActivityBehavior1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution20 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
    }
}

