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
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution18 = null;
        java.lang.Object obj20 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution18, "", obj20);
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
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior1.getTaskDefinition();
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
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition14);
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
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution13 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior16 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition15);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior16.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = userTaskActivityBehavior16.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition19 = userTaskActivityBehavior16.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = userTaskActivityBehavior16.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior21 = userTaskActivityBehavior16.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = null;
        userTaskActivityBehavior16.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior22);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition24 = userTaskActivityBehavior16.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior25 = userTaskActivityBehavior16.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior26 = userTaskActivityBehavior16.getMultiInstanceActivityBehavior();
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior26);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        java.lang.Class<?> wildcardClass15 = userTaskActivityBehavior1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior9);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior16);
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
}

