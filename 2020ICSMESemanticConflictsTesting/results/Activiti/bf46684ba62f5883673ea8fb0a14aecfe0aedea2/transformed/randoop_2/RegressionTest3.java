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
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition7;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution10 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior13 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition12);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition14 = userTaskActivityBehavior13.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior13.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = null;
        userTaskActivityBehavior13.taskDefinition = taskDefinition16;
        java.util.List<java.lang.String> strList19 = userTaskActivityBehavior13.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition20 = userTaskActivityBehavior13.getTaskDefinition();
        java.lang.Class<?> wildcardClass21 = userTaskActivityBehavior13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution10, "hi!", (java.lang.Object) userTaskActivityBehavior13);
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
        org.junit.Assert.assertNull(taskDefinition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList8 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.getTaskDefinition();
        java.util.List<java.lang.String> strList11 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
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
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        java.util.List<java.lang.String> strList2 = userTaskActivityBehavior0.extractCandidates("");
        java.util.List<java.lang.String> strList4 = userTaskActivityBehavior0.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior0.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        java.util.List<java.lang.String> strList6 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.taskDefinition;
        java.util.List<java.lang.String> strList9 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList14 = userTaskActivityBehavior1.extractCandidates("hi!");
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
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition4;
        java.util.List<java.lang.String> strList7 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition10;
        java.util.List<java.lang.String> strList13 = userTaskActivityBehavior1.extractCandidates("");
        java.lang.Class<?> wildcardClass14 = userTaskActivityBehavior1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution10 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior12 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior12.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior12.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior12.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior12.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior12.taskDefinition;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution10, "hi!", (java.lang.Object) taskDefinition17);
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
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
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition4;
        java.util.List<java.lang.String> strList7 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition9;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.getTaskDefinition();
        java.lang.Class<?> wildcardClass12 = userTaskActivityBehavior1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        java.lang.Class<?> wildcardClass10 = userTaskActivityBehavior1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition4;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition8;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
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
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList8 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition9;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior8);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        java.util.List<java.lang.String> strList2 = userTaskActivityBehavior0.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition4;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior0.taskDefinition;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition4;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition6 = userTaskActivityBehavior0.getTaskDefinition();
        java.util.List<java.lang.String> strList8 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition9;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior11 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
        org.activiti.engine.impl.task.TaskDefinition taskDefinition16 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior17);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution19 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition21 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior22 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition21);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition23 = userTaskActivityBehavior22.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition24 = userTaskActivityBehavior22.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition25 = userTaskActivityBehavior22.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior26 = userTaskActivityBehavior22.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior27 = null;
        userTaskActivityBehavior22.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior27);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition29 = null;
        userTaskActivityBehavior22.taskDefinition = taskDefinition29;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition31 = userTaskActivityBehavior22.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition32 = userTaskActivityBehavior22.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition33 = userTaskActivityBehavior22.taskDefinition;
        java.util.List<java.lang.String> strList35 = userTaskActivityBehavior22.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition36 = userTaskActivityBehavior22.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior37 = userTaskActivityBehavior22.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition38 = null;
        userTaskActivityBehavior22.taskDefinition = taskDefinition38;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition40 = userTaskActivityBehavior22.taskDefinition;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution19, "hi!", (java.lang.Object) taskDefinition40);
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
        org.junit.Assert.assertNull(taskDefinition15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition40);
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
        java.util.List<java.lang.String> strList8 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition9 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition10;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior16);
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
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition15);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
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
        org.activiti.engine.impl.task.TaskDefinition taskDefinition15 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution16 = null;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition18 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior19 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition18);
        java.util.List<java.lang.String> strList21 = userTaskActivityBehavior19.extractCandidates("hi!");
        java.util.List<java.lang.String> strList23 = userTaskActivityBehavior19.extractCandidates("hi!");
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
        org.junit.Assert.assertNotNull(strList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition3;
        java.util.List<java.lang.String> strList6 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.taskDefinition;
        java.util.List<java.lang.String> strList9 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = userTaskActivityBehavior1.getTaskDefinition();
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
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition10);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior4);
        java.util.List<java.lang.String> strList7 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition10;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior16 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior13);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior14);
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity16 = null;
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution17 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.handleAssignments(taskEntity16, activityExecution17);
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
        org.junit.Assert.assertNull(taskDefinition13);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior6 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.persistence.entity.TaskEntity taskEntity7 = null;
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution8 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.handleAssignments(taskEntity7, activityExecution8);
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior6);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition2 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList6 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList9 = userTaskActivityBehavior1.extractCandidates("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
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
        java.util.List<java.lang.String> strList6 = userTaskActivityBehavior1.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition7;
        java.util.List<java.lang.String> strList10 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        org.activiti.engine.impl.task.TaskDefinition taskDefinition17 = userTaskActivityBehavior1.taskDefinition;
        java.util.List<java.lang.String> strList19 = userTaskActivityBehavior1.extractCandidates("");
        java.lang.Class<?> wildcardClass20 = strList19.getClass();
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
        org.junit.Assert.assertNull(taskDefinition17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition5;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        java.lang.Class<?> wildcardClass10 = userTaskActivityBehavior0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
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
        java.util.List<java.lang.String> strList7 = userTaskActivityBehavior0.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition8;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition10 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition10;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior0.taskDefinition;
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition0 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior1 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior(taskDefinition0);
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior1.extractCandidates("hi!");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior1.taskDefinition;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition5;
        org.activiti.engine.impl.task.TaskDefinition taskDefinition7 = userTaskActivityBehavior1.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition8;
        java.util.List<java.lang.String> strList11 = userTaskActivityBehavior1.extractCandidates("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior13 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition3 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition4 = userTaskActivityBehavior0.taskDefinition;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList7 = userTaskActivityBehavior0.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior8 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior8);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior10 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition12 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = userTaskActivityBehavior0.getTaskDefinition();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior14 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList16 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
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
        org.junit.Assert.assertNull(multiInstanceActivityBehavior10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior17);
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
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior17 = null;
        userTaskActivityBehavior1.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior17);
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution19 = null;
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior21 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior22 = userTaskActivityBehavior21.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior23 = userTaskActivityBehavior21.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition24 = userTaskActivityBehavior21.getTaskDefinition();
        java.lang.Class<?> wildcardClass25 = userTaskActivityBehavior21.getClass();
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior1.signal(activityExecution19, "", (java.lang.Object) userTaskActivityBehavior21);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("hi!");
        java.util.List<java.lang.String> strList5 = userTaskActivityBehavior0.extractCandidates("");
        java.util.List<java.lang.String> strList7 = userTaskActivityBehavior0.extractCandidates("");
        org.activiti.engine.impl.task.TaskDefinition taskDefinition8 = userTaskActivityBehavior0.taskDefinition;
        java.util.List<java.lang.String> strList10 = userTaskActivityBehavior0.extractCandidates("hi!");
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
        org.junit.Assert.assertNotNull(strList10);
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
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior12 = userTaskActivityBehavior1.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList14 = userTaskActivityBehavior1.extractCandidates("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior2 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior3 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior3);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior5 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.pvm.delegate.ActivityExecution activityExecution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            userTaskActivityBehavior0.execute(activityExecution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior5);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        org.activiti.engine.impl.task.TaskDefinition taskDefinition13 = null;
        userTaskActivityBehavior1.taskDefinition = taskDefinition13;
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
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior userTaskActivityBehavior0 = new org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior();
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior1 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        java.util.List<java.lang.String> strList3 = userTaskActivityBehavior0.extractCandidates("hi!");
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior4 = userTaskActivityBehavior0.getMultiInstanceActivityBehavior();
        org.activiti.engine.impl.task.TaskDefinition taskDefinition5 = null;
        userTaskActivityBehavior0.taskDefinition = taskDefinition5;
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior7 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior7);
        org.activiti.engine.impl.bpmn.behavior.MultiInstanceActivityBehavior multiInstanceActivityBehavior9 = null;
        userTaskActivityBehavior0.setMultiInstanceActivityBehavior(multiInstanceActivityBehavior9);
        org.activiti.engine.impl.task.TaskDefinition taskDefinition11 = userTaskActivityBehavior0.getTaskDefinition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(multiInstanceActivityBehavior4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(taskDefinition11);
    }
}

