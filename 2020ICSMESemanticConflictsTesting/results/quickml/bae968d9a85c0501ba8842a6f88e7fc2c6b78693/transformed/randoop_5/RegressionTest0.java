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
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 1, 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        quickdt.experiments.OutOfTimeCrossValidatorRunner outOfTimeCrossValidatorRunner0 = new quickdt.experiments.OutOfTimeCrossValidatorRunner();
        java.lang.Class<?> wildcardClass1 = outOfTimeCrossValidatorRunner0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.slf4j.Logger logger0 = null;
        quickdt.experiments.OutOfTimeCrossValidatorRunner.logger = logger0;
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.slf4j.Logger logger0 = quickdt.experiments.OutOfTimeCrossValidatorRunner.logger;
        quickdt.experiments.OutOfTimeCrossValidatorRunner.logger = logger0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = logger0.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(logger0);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((-1), 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.slf4j.Logger logger0 = quickdt.experiments.OutOfTimeCrossValidatorRunner.logger;
        quickdt.experiments.OutOfTimeCrossValidatorRunner.logger = logger0;
        quickdt.experiments.OutOfTimeCrossValidatorRunner.logger = logger0;
        quickdt.experiments.OutOfTimeCrossValidatorRunner.logger = logger0;
        quickdt.experiments.OutOfTimeCrossValidatorRunner.logger = logger0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(logger0);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, (int) ' ');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '#', (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.slf4j.Logger logger0 = quickdt.experiments.OutOfTimeCrossValidatorRunner.logger;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = logger0.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(logger0);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '4', (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(1, 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.slf4j.Logger logger0 = quickdt.experiments.OutOfTimeCrossValidatorRunner.logger;
        quickdt.experiments.OutOfTimeCrossValidatorRunner.logger = logger0;
        quickdt.experiments.OutOfTimeCrossValidatorRunner.logger = logger0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = logger0.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(logger0);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '#', (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 1, 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.slf4j.Logger logger0 = quickdt.experiments.OutOfTimeCrossValidatorRunner.logger;
        quickdt.experiments.OutOfTimeCrossValidatorRunner.logger = logger0;
        quickdt.experiments.OutOfTimeCrossValidatorRunner.logger = logger0;
        quickdt.experiments.OutOfTimeCrossValidatorRunner.logger = logger0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = logger0.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(logger0);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 0, (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 1, (int) '4');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((-1), 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '4', (int) 'a');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, (int) '4');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) 'a', 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(100, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) 'a', 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 1, (int) ' ');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '4', 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 0, (int) 'a');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((-1), (int) '4');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((-1), (int) '#');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '#', (int) '#');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 0, 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((-1), (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(1, (int) '#');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(0, (int) ' ');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(100, (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) 'a', 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((-1), (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) 'a', 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 0, (int) '#');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '4', (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) 'a', (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) ' ', (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 1, 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(1, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 10, 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 1, (int) '4');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '#', 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((-1), (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '4', (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) ' ', (int) ' ');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, (int) '#');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(1, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 10, 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(1, (int) '4');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 100, 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, (int) 'a');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 1, (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 100, (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 100, (int) '#');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(0, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 100, (int) 'a');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '#', 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 100, 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) -1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 10, 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '#', (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((-1), (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) -1, 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) -1, (int) 'a');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 0, (int) 'a');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) -1, (int) '#');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) ' ', (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((-1), (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(100, (int) 'a');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '4', (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) ' ', 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, (int) 'a');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) ' ', 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((-1), (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 0, 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, (int) '#');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((-1), (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) ' ', 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) 'a', (int) '#');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(0, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 100, 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) 'a', (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((-1), 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) -1, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) -1, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(1, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) 'a', (int) 'a');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(0, (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(100, 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) 'a', (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) 'a', (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '#', (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) -1, (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '4', (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(0, (int) 'a');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(1, 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(0, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(0, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 1, 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '#', 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) ' ', (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(0, 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 10, (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 10, (int) ' ');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) ' ', (int) '#');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '#', (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) ' ', (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, (int) ' ');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(0, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) -1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '4', (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(0, (int) '#');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) 'a', (int) ' ');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) ' ', (int) 'a');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.util.List<quickdt.data.AbstractInstance> abstractInstanceList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest3 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest(abstractInstanceList0, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '4', 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '#', (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '4', (int) ' ');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) 'a', (int) '4');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '#', (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '#', (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        quickdt.data.AbstractInstance[] abstractInstanceArray0 = new quickdt.data.AbstractInstance[] {};
        java.util.ArrayList<quickdt.data.AbstractInstance> abstractInstanceList1 = new java.util.ArrayList<quickdt.data.AbstractInstance>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<quickdt.data.AbstractInstance>) abstractInstanceList1, abstractInstanceArray0);
        // The following exception was thrown during execution in test generation
        try {
            quickdt.predictiveModels.randomForest.RandomForest randomForest5 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForest((java.util.List<quickdt.data.AbstractInstance>) abstractInstanceList1, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: We must have at least one tree");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractInstanceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 10, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }
}

