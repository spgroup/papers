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
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        java.lang.Class<?> wildcardClass12 = userTaskActivityBehavior1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior17);
        java.lang.Class<?> wildcardClass19 = userTaskActivityBehavior1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution7 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior10.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior10.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior10.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior10.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior10.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = userTaskActivityBehavior10.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = null;
        userTaskActivityBehavior10.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior19);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = userTaskActivityBehavior10.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = null;
        userTaskActivityBehavior10.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior22);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior24 = null;
        userTaskActivityBehavior10.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior24);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior26 = null;
        userTaskActivityBehavior10.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior26);
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution7, "hi!", (java.lang.Object) userTaskActivityBehavior10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior21);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution9 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition11);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior12.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior12.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior12.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = userTaskActivityBehavior12.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = null;
        userTaskActivityBehavior12.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior18);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = userTaskActivityBehavior12.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = userTaskActivityBehavior12.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = null;
        userTaskActivityBehavior12.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior22);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior24 = null;
        userTaskActivityBehavior12.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior24);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior26 = userTaskActivityBehavior12.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior27 = userTaskActivityBehavior12.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution9, "", (java.lang.Object) userTaskActivityBehavior12);
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
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior27);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = taskDefinition10.getClass();
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
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
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
        org.activiti.engine.impl.task.TaskDefinition taskDefinition27 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition28 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition29 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior30 = userTaskActivityBehavior18.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition31 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior32 = userTaskActivityBehavior18.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior33 = userTaskActivityBehavior18.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition34 = userTaskActivityBehavior18.getTaskDefinition();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution15, "", (java.lang.Object) taskDefinition34);
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
        org.junit.Assert.assertNull(taskDefinition27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition34);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution12 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior15 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition14);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior17);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior20);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = null;
        userTaskActivityBehavior15.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior22);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition24 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition25 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition26 = userTaskActivityBehavior15.getTaskDefinition();
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
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
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution19);
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
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
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
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
        org.junit.Assert.assertNull(taskDefinition10);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
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
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior23 = userTaskActivityBehavior14.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior24 = null;
        userTaskActivityBehavior14.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior24);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition26 = userTaskActivityBehavior14.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior27 = userTaskActivityBehavior14.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition28 = userTaskActivityBehavior14.getTaskDefinition();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution11, "", (java.lang.Object) taskDefinition28);
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition28);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
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
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
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
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
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
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
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
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
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
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior1.getTaskDefinition();
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
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
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
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution13 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior16 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition15);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior16.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = userTaskActivityBehavior16.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = null;
        userTaskActivityBehavior16.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior19);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = null;
        userTaskActivityBehavior16.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior21);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior23 = null;
        userTaskActivityBehavior16.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior23);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior25 = null;
        userTaskActivityBehavior16.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior25);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition27 = userTaskActivityBehavior16.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition28 = userTaskActivityBehavior16.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition29 = userTaskActivityBehavior16.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior30 = userTaskActivityBehavior16.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution13, "", (java.lang.Object) userTaskActivityBehavior16);
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior30);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
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
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
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
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior6);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
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
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution12 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior15 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition14);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = userTaskActivityBehavior15.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition23 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition24 = userTaskActivityBehavior15.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition25 = userTaskActivityBehavior15.getTaskDefinition();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution12, "hi!", (java.lang.Object) taskDefinition25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition25);
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
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
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
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution10 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior13 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition12);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior13.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior13.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = null;
        userTaskActivityBehavior13.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior16);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = userTaskActivityBehavior13.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = userTaskActivityBehavior13.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution10, "", (java.lang.Object) userTaskActivityBehavior13);
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
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior19);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution9);
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
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
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
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        java.lang.Class<?> wildcardClass8 = userTaskActivityBehavior1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.execute(activityExecution9);
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
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
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
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior17);
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
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior5);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution11 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior14 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition13);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior14.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior14.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = userTaskActivityBehavior14.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior18 = null;
        userTaskActivityBehavior14.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior18);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior20 = null;
        userTaskActivityBehavior14.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior20);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = userTaskActivityBehavior14.getMultiInstanceActivityBehavior();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution11, "", (java.lang.Object) multiInstanceActivityBehavior22);
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior22);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
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
        org.junit.Assert.assertNull(taskDefinition9);
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
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        java.lang.Class<?> wildcardClass16 = userTaskActivityBehavior1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution15 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior18 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition17);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = null;
        userTaskActivityBehavior18.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior21);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition23 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition24 = userTaskActivityBehavior18.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior25 = null;
        userTaskActivityBehavior18.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior25);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior27 = null;
        userTaskActivityBehavior18.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior27);
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution15, "", (java.lang.Object) multiInstanceActivityBehavior27);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition24);
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
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution7 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior10 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition9);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = userTaskActivityBehavior10.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior10.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior10.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior15 = null;
        userTaskActivityBehavior10.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior15);
        java.lang.Class<?> wildcardClass17 = userTaskActivityBehavior10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution7, "", (java.lang.Object) userTaskActivityBehavior10);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
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
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior19 = userTaskActivityBehavior11.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = userTaskActivityBehavior11.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition21 = userTaskActivityBehavior11.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = userTaskActivityBehavior11.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition23 = userTaskActivityBehavior11.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior24 = null;
        userTaskActivityBehavior11.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior24);
        java.lang.Class<?> wildcardClass26 = userTaskActivityBehavior11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution8, "", (java.lang.Object) wildcardClass26);
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
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
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
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
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
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
    }
}

